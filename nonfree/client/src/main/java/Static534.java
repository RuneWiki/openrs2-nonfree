import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public static int anInt9773;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	public static int anInt9774;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	public static int anInt9775;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public static void method7520() {
		if (Static232.anInt4898 == 0) {
			return;
		}
		try {
			if (++Static423.anInt8145 > 2000) {
				if (Static528.aClass36_2 != null) {
					Static528.aClass36_2.method1992();
					Static528.aClass36_2 = null;
				}
				if (Static209.anInt4424 >= 2) {
					Static457.anInt8737 = -5;
					Static232.anInt4898 = 0;
					return;
				}
				Static134.aClass271_3.method6250();
				Static209.anInt4424++;
				Static423.anInt8145 = 0;
				Static232.anInt4898 = 1;
			}
			if (Static232.anInt4898 == 1) {
				Static364.aClass316_5 = Static134.aClass271_3.method6248(Static372.aClass366_5);
				Static232.anInt4898 = 2;
			}
			if (Static232.anInt4898 == 2) {
				if (Static364.aClass316_5.anInt9478 == 2) {
					throw new IOException();
				}
				if (Static364.aClass316_5.anInt9478 != 1) {
					return;
				}
				Static528.aClass36_2 = Static177.method2946((Socket) Static364.aClass316_5.anObject136);
				Static364.aClass316_5 = null;
				Static446.method6581();
				Static232.anInt4898 = 4;
			}
			@Pc(106) int local106;
			if (Static232.anInt4898 == 4) {
				if (!Static528.aClass36_2.method1994(1)) {
					return;
				}
				Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				local106 = Static549.aClass4_Sub13_Sub2_2.aByteArray88[0] & 0xFF;
				if (local106 != 21) {
					Static232.anInt4898 = 0;
					Static457.anInt8737 = local106;
					Static528.aClass36_2.method1992();
					Static528.aClass36_2 = null;
					return;
				}
				Static232.anInt4898 = 5;
			}
			if (Static232.anInt4898 == 5) {
				if (!Static528.aClass36_2.method1994(1)) {
					return;
				}
				Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				Static150.aStringArray12 = new String[Static549.aClass4_Sub13_Sub2_2.aByteArray88[0] & 0xFF];
				Static232.anInt4898 = 6;
			}
			if (Static232.anInt4898 == 6 && Static528.aClass36_2.method1994(Static150.aStringArray12.length * 8)) {
				Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
				Static528.aClass36_2.method1995(0, Static150.aStringArray12.length * 8, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				for (local106 = 0; local106 < Static150.aStringArray12.length; local106++) {
					Static150.aStringArray12[local106] = Static244.method7176(Static549.aClass4_Sub13_Sub2_2.method7026());
				}
				Static232.anInt4898 = 0;
				Static457.anInt8737 = 21;
				Static528.aClass36_2.method1992();
				Static528.aClass36_2 = null;
			}
		} catch (@Pc(223) IOException local223) {
			if (Static528.aClass36_2 != null) {
				Static528.aClass36_2.method1992();
				Static528.aClass36_2 = null;
			}
			if (Static209.anInt4424 < 2) {
				Static134.aClass271_3.method6250();
				Static232.anInt4898 = 1;
				Static423.anInt8145 = 0;
				Static209.anInt4424++;
			} else {
				Static232.anInt4898 = 0;
				Static457.anInt8737 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Lclient!g;")
	public static Class13 method7521() {
		try {
			return new Class13_Sub2();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class13) Class.forName("Class13_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class13_Sub3();
			}
		}
	}
}
