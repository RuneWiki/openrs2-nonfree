import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "Lclient!km;")
	public static Class91 aClass91_152;

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
	public static int anInt4046;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "Lclient!fj;")
	public static Class14_Sub2_Sub1 aClass14_Sub2_Sub1_2;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
	public static int anInt4052;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3235(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = Static242.method3708(arg0);
		return local15 == -1 ? "" : Static207.method3772(" ", Static53.aClass82_13.aStringArray38[local15], "<br>");
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V")
	public static void method3236() {
		if (Static239.anInt4742 == 0) {
			return;
		}
		try {
			if (++Static264.anInt5178 > 2000) {
				if (Static87.aClass113_1 != null) {
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
				}
				if (Static178.anInt3968 >= 1) {
					Static64.anInt1382 = -5;
					Static239.anInt4742 = 0;
					return;
				}
				Static178.anInt3968++;
				if (Static240.anInt4769 == Static61.anInt1297) {
					Static240.anInt4769 = Static101.anInt2402;
				} else {
					Static240.anInt4769 = Static61.anInt1297;
				}
				Static264.anInt5178 = 0;
				Static239.anInt4742 = 1;
			}
			if (Static239.anInt4742 == 1) {
				Static192.aClass116_3 = Static253.aClass175_4.method4326(Static240.anInt4769, Static1.aString252);
				Static239.anInt4742 = 2;
			}
			@Pc(123) int local123;
			if (Static239.anInt4742 == 2) {
				if (Static192.aClass116_3.anInt3812 == 2) {
					throw new IOException();
				}
				if (Static192.aClass116_3.anInt3812 != 1) {
					return;
				}
				Static87.aClass113_1 = new Class113((Socket) Static192.aClass116_3.anObject5, Static253.aClass175_4);
				Static192.aClass116_3 = null;
				Static87.aClass113_1.method3017(Static283.aClass1_Sub11_Sub1_3.anInt3264, Static283.aClass1_Sub11_Sub1_3.aByteArray47);
				if (Static214.aClass52_2 != null) {
					Static214.aClass52_2.method4080();
				}
				if (Static117.aClass52_1 != null) {
					Static117.aClass52_1.method4080();
				}
				local123 = Static87.aClass113_1.method3012();
				if (Static214.aClass52_2 != null) {
					Static214.aClass52_2.method4080();
				}
				if (Static117.aClass52_1 != null) {
					Static117.aClass52_1.method4080();
				}
				if (local123 != 21) {
					Static64.anInt1382 = local123;
					Static239.anInt4742 = 0;
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
					return;
				}
				Static239.anInt4742 = 3;
			}
			if (Static239.anInt4742 == 3) {
				if (Static87.aClass113_1.method3014() < 1) {
					return;
				}
				Static270.aStringArray56 = new String[Static87.aClass113_1.method3012()];
				Static239.anInt4742 = 4;
			}
			if (Static239.anInt4742 == 4) {
				if (Static87.aClass113_1.method3014() < Static270.aStringArray56.length * 8) {
					return;
				}
				Static187.aClass1_Sub11_Sub1_2.anInt3264 = 0;
				Static87.aClass113_1.method3015(Static187.aClass1_Sub11_Sub1_2.aByteArray47, Static270.aStringArray56.length * 8, 0);
				for (local123 = 0; local123 < Static270.aStringArray56.length; local123++) {
					Static270.aStringArray56[local123] = Static252.method3871(Static187.aClass1_Sub11_Sub1_2.method2646());
				}
				Static239.anInt4742 = 0;
				Static64.anInt1382 = 21;
				Static87.aClass113_1.method3019();
				Static87.aClass113_1 = null;
				return;
			}
		} catch (@Pc(234) IOException local234) {
			if (Static87.aClass113_1 != null) {
				Static87.aClass113_1.method3019();
				Static87.aClass113_1 = null;
			}
			if (Static178.anInt3968 >= 1) {
				Static64.anInt1382 = -4;
				Static239.anInt4742 = 0;
			} else {
				Static239.anInt4742 = 1;
				Static264.anInt5178 = 0;
				if (Static240.anInt4769 == Static61.anInt1297) {
					Static240.anInt4769 = Static101.anInt2402;
				} else {
					Static240.anInt4769 = Static61.anInt1297;
				}
				Static178.anInt3968++;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
	public static void method3237() {
		if (!Static125.aBoolean209) {
			return;
		}
		@Pc(11) Class71 local11 = Static164.method2829(Static90.anInt2022, Static291.anInt5525);
		if (local11 != null && local11.anObjectArray22 != null) {
			@Pc(22) Class1_Sub14 local22 = new Class1_Sub14();
			local22.anObjectArray1 = local11.anObjectArray22;
			local22.aClass71_8 = local11;
			Static188.method3144(local22);
		}
		Static125.aBoolean209 = false;
		Static254.anInt4981 = -1;
		Static160.method2779(local11);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(II)V")
	public static void method3238() {
		Static242.aClass135_29.method3320(5);
		Static258.aClass135_35.method3320(5);
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(B)V")
	public static void method3240() {
		Static73.method1277();
		Static245.method3811();
		Static71.method1268();
		Static228.method3564();
		Static153.method2700();
		Static106.method1949();
		Static121.method2149();
		Static198.method40();
		Static3.method137();
		Static127.method2189();
		Static224.method3517();
		Static105.method1945();
		Static20.method381();
		Static212.method3371();
		Static53.method4089();
		Static91.method1598();
		Static1.method3393();
		Static142.method2348();
		if (Static49.anInt1127 != 0) {
			for (@Pc(46) int local46 = 0; local46 < Static102.aByteArrayArray7.length; local46++) {
				Static102.aByteArrayArray7[local46] = null;
			}
			Static73.anInt1564 = 0;
		}
		Static61.method1093();
		Static156.method1233();
		Static86.aClass135_8.method3317();
		if (!Static277.aBoolean412) {
			((Class85_Sub1) Static110.anInterface2_1).method2284();
		}
		Static29.aClass49_2.method1379();
		Static230.aClass91_72.method2498();
		Static232.aClass91_168.method2498();
		Static246.aClass91_176.method2498();
		Static68.aClass91_56.method2498();
		Static203.aClass91_157.method2498();
		aClass91_152.method2498();
		Static230.aClass91_73.method2498();
		Static134.aClass91_110.method2498();
		Static211.aClass91_158.method2498();
		Static49.aClass91_45.method2498();
		Static164.aClass91_129.method2498();
		Static97.aClass135_9.method3317();
	}
}
