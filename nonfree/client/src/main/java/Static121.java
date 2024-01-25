import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!en", name = "t", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_50 = new Class298(27, 2);

	@OriginalMember(owner = "client!en", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method2507() {
		if (Static144.anInt3061 == 0) {
			return;
		}
		try {
			if (++Static268.anInt5017 > 2000) {
				if (Static78.aClass152_2 != null) {
					Static78.aClass152_2.method3908();
					Static78.aClass152_2 = null;
				}
				if (Static221.anInt5801 >= 2) {
					Static144.anInt3061 = 0;
					Static5.anInt98 = -5;
					return;
				}
				Static460.aClass65_3.method2046();
				Static144.anInt3061 = 1;
				Static268.anInt5017 = 0;
				Static221.anInt5801++;
			}
			if (Static144.anInt3061 == 1) {
				Static440.aClass192_4 = Static460.aClass65_3.method2044(Static409.aClass221_6);
				Static144.anInt3061 = 2;
			}
			if (Static144.anInt3061 == 2) {
				if (Static440.aClass192_4.anInt5186 == 2) {
					throw new IOException();
				}
				if (Static440.aClass192_4.anInt5186 != 1) {
					return;
				}
				Static78.aClass152_2 = Static123.method2535((Socket) Static440.aClass192_4.anObject30);
				Static440.aClass192_4 = null;
				Static556.method7408();
				Static144.anInt3061 = 4;
			}
			@Pc(120) int local120;
			if (Static144.anInt3061 == 4) {
				if (!Static78.aClass152_2.method3910(1)) {
					return;
				}
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
				local120 = Static187.aClass3_Sub11_Sub1_1.aByteArray36[0] & 0xFF;
				if (local120 != 21) {
					Static5.anInt98 = local120;
					Static144.anInt3061 = 0;
					Static78.aClass152_2.method3908();
					Static78.aClass152_2 = null;
					return;
				}
				Static144.anInt3061 = 5;
			}
			if (Static144.anInt3061 == 5) {
				if (!Static78.aClass152_2.method3910(1)) {
					return;
				}
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
				Static144.anInt3061 = 6;
				Static492.aStringArray35 = new String[Static187.aClass3_Sub11_Sub1_1.aByteArray36[0] & 0xFF];
			}
			if (Static144.anInt3061 == 6 && Static78.aClass152_2.method3910(Static492.aStringArray35.length * 8)) {
				Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, Static492.aStringArray35.length * 8, 0);
				for (local120 = 0; local120 < Static492.aStringArray35.length; local120++) {
					Static492.aStringArray35[local120] = Static180.method3145(Static187.aClass3_Sub11_Sub1_1.method3128());
				}
				Static144.anInt3061 = 0;
				Static5.anInt98 = 21;
				Static78.aClass152_2.method3908();
				Static78.aClass152_2 = null;
			}
		} catch (@Pc(220) IOException local220) {
			if (Static78.aClass152_2 != null) {
				Static78.aClass152_2.method3908();
				Static78.aClass152_2 = null;
			}
			if (Static221.anInt5801 < 2) {
				Static460.aClass65_3.method2046();
				Static268.anInt5017 = 0;
				Static144.anInt3061 = 1;
				Static221.anInt5801++;
			} else {
				Static144.anInt3061 = 0;
				Static5.anInt98 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
	public static void method2508() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static253.aBooleanArray17[local7] = true;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!r;)V")
	public static void method2510(@OriginalArg(1) Class43 arg0) {
		if (Static485.aClass130_48.method3544() == 0) {
			return;
		}
		@Pc(25) Class3_Sub25 local25;
		if (Static260.anInt4932 == 0) {
			for (local25 = (Class3_Sub25) Static485.aClass130_48.method3543(); local25 != null; local25 = (Class3_Sub25) Static485.aClass130_48.method3551()) {
				Static517.aClass145_1.method3796(local25.anInt4395, local25.anInt4391, local25.aBoolean336 ? Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1 : null, local25.anInt4398, arg0, Static410.aClass117_8, local25.anInt4397, false, false, local25.anInt4394, arg0);
				local25.method7812();
			}
			method2508();
			return;
		}
		if (Static341.aClass43_7 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Static341.aClass43_7 = Static442.method7138(0, Static56.anInterface8_3, 0, Static542.aClass246_250, local72);
			Static513.aClass117_11 = Static341.aClass43_7.method7139(Static14.method232(Static40.anInt4550, Static467.aClass246_221), Static606.method7593(Static171.aClass246_84, Static40.anInt4550));
		}
		for (local25 = (Class3_Sub25) Static485.aClass130_48.method3543(); local25 != null; local25 = (Class3_Sub25) Static485.aClass130_48.method3551()) {
			Static517.aClass145_1.method3796(local25.anInt4395, local25.anInt4391, local25.aBoolean336 ? Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1 : null, local25.anInt4398, Static341.aClass43_7, Static513.aClass117_11, local25.anInt4397, false, false, local25.anInt4394, arg0);
			local25.method7812();
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	public static void method2512() {
		@Pc(12) byte[] local12;
		if (Static77.anObject10 == null) {
			@Pc(5) Class39_Sub2_Sub2 local5 = new Class39_Sub2_Sub2();
			local12 = local5.method6759();
			Static77.anObject10 = Static223.method3868(local12);
		}
		if (Static585.anObject59 == null) {
			@Pc(33) Class39_Sub1_Sub2 local33 = new Class39_Sub1_Sub2();
			local12 = local33.method4083();
			Static585.anObject59 = Static223.method3868(local12);
		}
	}
}
