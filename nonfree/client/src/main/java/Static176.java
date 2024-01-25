import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Lclient!ju;")
	public static final Class164 aClass164_9 = new Class164();

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
	public static final int[] anIntArray216 = new int[13];

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "[I")
	public static final int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!mv;")
	public static Class6_Sub23 method3226(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class6_Sub23_Sub1");
			@Pc(10) Class6_Sub23 local10 = (Class6_Sub23) local6.getDeclaredConstructor().newInstance();
			local10.method6170(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class6_Sub23_Sub2 local26 = new Class6_Sub23_Sub2();
			local26.method6170(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public static void method3228() {
		if (Static573.anInt9416 == 0) {
			return;
		}
		try {
			if (++Static309.anInt5671 > 2000) {
				if (Static563.aClass127_2 != null) {
					Static563.aClass127_2.method6305();
					Static563.aClass127_2 = null;
				}
				if (Static238.anInt7765 >= 2) {
					Static119.anInt2844 = -5;
					Static573.anInt9416 = 0;
					return;
				}
				Static188.aClass105_3.method2908();
				Static573.anInt9416 = 1;
				Static238.anInt7765++;
				Static309.anInt5671 = 0;
			}
			if (Static573.anInt9416 == 1) {
				Static75.aClass331_3 = Static188.aClass105_3.method2907(Static352.aClass272_2);
				Static573.anInt9416 = 2;
			}
			if (Static573.anInt9416 == 2) {
				if (Static75.aClass331_3.anInt8818 == 2) {
					throw new IOException();
				}
				if (Static75.aClass331_3.anInt8818 != 1) {
					return;
				}
				Static563.aClass127_2 = Static231.method4069((Socket) Static75.aClass331_3.anObject18);
				Static75.aClass331_3 = null;
				Static278.method4563();
				Static573.anInt9416 = 4;
			}
			@Pc(124) int local124;
			if (Static573.anInt9416 == 4) {
				if (!Static563.aClass127_2.method6308(1)) {
					return;
				}
				Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				local124 = Static282.aClass6_Sub21_Sub2_1.aByteArray93[0] & 0xFF;
				if (local124 != 21) {
					Static119.anInt2844 = local124;
					Static573.anInt9416 = 0;
					Static563.aClass127_2.method6305();
					Static563.aClass127_2 = null;
					return;
				}
				Static573.anInt9416 = 5;
			}
			if (Static573.anInt9416 == 5) {
				if (!Static563.aClass127_2.method6308(1)) {
					return;
				}
				Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				Static573.anInt9416 = 6;
				Static531.aStringArray38 = new String[Static282.aClass6_Sub21_Sub2_1.aByteArray93[0] & 0xFF];
			}
			if (Static573.anInt9416 == 6 && Static563.aClass127_2.method6308(Static531.aStringArray38.length * 8)) {
				Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
				Static563.aClass127_2.method6307(Static531.aStringArray38.length * 8, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				for (local124 = 0; local124 < Static531.aStringArray38.length; local124++) {
					Static531.aStringArray38[local124] = Static404.method5929(Static282.aClass6_Sub21_Sub2_1.method6018());
				}
				Static573.anInt9416 = 0;
				Static119.anInt2844 = 21;
				Static563.aClass127_2.method6305();
				Static563.aClass127_2 = null;
			}
		} catch (@Pc(224) IOException local224) {
			if (Static563.aClass127_2 != null) {
				Static563.aClass127_2.method6305();
				Static563.aClass127_2 = null;
			}
			if (Static238.anInt7765 < 2) {
				Static188.aClass105_3.method2908();
				Static238.anInt7765++;
				Static309.anInt5671 = 0;
				Static573.anInt9416 = 1;
			} else {
				Static119.anInt2844 = -4;
				Static573.anInt9416 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z")
	public static boolean method3232() {
		@Pc(7) Class6 local7 = Static182.aClass361_23.aClass6_287.aClass6_285;
		if (local7 == null || local7 == Static182.aClass361_23.aClass6_287) {
			return false;
		}
		@Pc(18) Class6_Sub45 local18 = (Class6_Sub45) local7;
		if (local18.anInt8730 >= 2000) {
			local18.anInt8730 -= 2000;
		}
		return local18.anInt8730 == 1002;
	}
}
