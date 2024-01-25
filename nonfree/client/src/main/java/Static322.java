import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Lclient!aa;")
	public static Class2 aClass2_11;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "Lclient!la;")
	public static final Class136 aClass136_147 = new Class136(63, 5);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public static void method4453() {
		if (Static238.anInt4081 == 0) {
			return;
		}
		try {
			if (++Static233.anInt3996 > 2000) {
				if (Static328.aClass116_1 != null) {
					Static328.aClass116_1.method2920();
					Static328.aClass116_1 = null;
				}
				if (Static235.anInt4027 >= 1) {
					Static238.anInt4081 = 0;
					Static88.anInt1593 = -5;
					return;
				}
				Static235.anInt4027++;
				Static293.aClass241_4.aBoolean448 = !Static293.aClass241_4.aBoolean448;
				Static238.anInt4081 = 1;
				Static233.anInt3996 = 0;
			}
			if (Static238.anInt4081 == 1) {
				Static66.aClass181_2 = Static32.aClass51_1.method1375(Static293.aClass241_4.method5486(), Static293.aClass241_4.aString61);
				Static238.anInt4081 = 2;
			}
			if (Static238.anInt4081 == 2) {
				if (Static66.aClass181_2.anInt5298 == 2) {
					throw new IOException();
				}
				if (Static66.aClass181_2.anInt5298 != 1) {
					return;
				}
				Static328.aClass116_1 = Static169.method6289((Socket) Static66.aClass181_2.anObject7);
				Static66.aClass181_2 = null;
				Static328.aClass116_1.method2918(Static243.aClass3_Sub25_Sub1_7.anInt4974, Static243.aClass3_Sub25_Sub1_7.aByteArray88);
				Static238.anInt4081 = 4;
			}
			@Pc(136) int local136;
			if (Static238.anInt4081 == 4) {
				if (!Static328.aClass116_1.method2924(1)) {
					return;
				}
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
				local136 = Static176.aClass3_Sub25_Sub1_1.aByteArray88[0] & 0xFF;
				if (local136 != 21) {
					Static88.anInt1593 = local136;
					Static238.anInt4081 = 0;
					Static328.aClass116_1.method2920();
					Static328.aClass116_1 = null;
					return;
				}
				Static238.anInt4081 = 5;
			}
			if (Static238.anInt4081 == 5) {
				if (!Static328.aClass116_1.method2924(1)) {
					return;
				}
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, 1, 0);
				Static238.anInt4081 = 6;
				Static383.aStringArray40 = new String[Static176.aClass3_Sub25_Sub1_1.aByteArray88[0] & 0xFF];
			}
			if (Static238.anInt4081 == 6 && Static328.aClass116_1.method2924(Static383.aStringArray40.length * 8)) {
				Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
				Static328.aClass116_1.method2919(Static176.aClass3_Sub25_Sub1_1.aByteArray88, Static383.aStringArray40.length * 8, 0);
				for (local136 = 0; local136 < Static383.aStringArray40.length; local136++) {
					Static383.aStringArray40[local136] = Static56.method1103(Static176.aClass3_Sub25_Sub1_1.method4087());
				}
				Static238.anInt4081 = 0;
				Static88.anInt1593 = 21;
				Static328.aClass116_1.method2920();
				Static328.aClass116_1 = null;
			}
		} catch (@Pc(234) IOException local234) {
			if (Static328.aClass116_1 != null) {
				Static328.aClass116_1.method2920();
				Static328.aClass116_1 = null;
			}
			if (Static235.anInt4027 >= 1) {
				Static238.anInt4081 = 0;
				Static88.anInt1593 = -4;
			} else {
				Static235.anInt4027++;
				Static233.anInt3996 = 0;
				Static238.anInt4081 = 1;
				Static293.aClass241_4.aBoolean448 = !Static293.aClass241_4.aBoolean448;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	public static void method4454() {
		@Pc(10) Class268 local10 = Static13.aClass268_2;
		synchronized (Static13.aClass268_2) {
			Static13.aClass268_2.method6168();
		}
		local10 = Static438.aClass268_24;
		synchronized (Static438.aClass268_24) {
			Static438.aClass268_24.method6168();
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V")
	public static void method4455() {
		Static407.aClass3_Sub1_Sub4_3.method6317();
		Static63.anInt7101 = 1;
		Static395.aClass250_95 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III[B)I")
	public static int method4456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(18) int local18 = arg0; local18 < arg1; local18++) {
			local7 = local7 >>> 8 ^ Class19.anIntArray9[(local7 ^ arg2[local18]) & 0xFF];
		}
		return ~local7;
	}
}
