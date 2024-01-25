import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	public static int anInt2374;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "J")
	public static long aLong76 = 0L;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)J")
	public static long method1778() {
		return Static9.aClass15_1.method5279();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ac;B)V")
	public static void method1779(@OriginalArg(0) Class6_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(16) Class2_Sub39 local16 = (Class2_Sub39) Static33.aClass8_2.method210(); local16 != null; local16 = (Class2_Sub39) Static33.aClass8_2.method218()) {
			if (local16.aClass6_Sub1_Sub1_Sub1_Sub1_2 == arg0) {
				if (local16.aClass2_Sub10_Sub4_3 != null) {
					Static122.aClass2_Sub10_Sub1_2.method1012(local16.aClass2_Sub10_Sub4_3);
					local16.aClass2_Sub10_Sub4_3 = null;
				}
				local16.method7966();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public static void method1780(@OriginalArg(0) int arg0) {
		if (arg0 == Static201.anInt3963) {
			return;
		}
		if (arg0 == 13) {
			if (Static544.aString96 == null) {
				Static538.method7345(Static286.aString44, Static392.aString61, Static402.anInt7015);
			} else {
				Static300.method4179(Static402.anInt7015);
			}
		}
		if (arg0 != 13 && Static584.aClass116_2 != null) {
			Static584.aClass116_2.method2483();
			Static584.aClass116_2 = null;
		}
		if (arg0 == 3) {
			Static378.method5602(Static554.anInt9121 != Static360.anInt6452);
		}
		if (arg0 == 7) {
			Static334.method5125(Static321.anInt5973 != Static554.anInt9121);
		}
		if (arg0 == 5) {
			if (Static544.aString96 == null) {
				Static118.method1766(Static286.aString44, Static392.aString61);
			} else {
				Static501.method6999();
			}
		} else if (arg0 == 6) {
			if (Static544.aString96 == null) {
				Static538.method7345(Static286.aString44, Static392.aString61, Static402.anInt7015);
			} else {
				Static300.method4179(Static402.anInt7015);
			}
		} else if (arg0 == 9) {
			if (Static544.aString96 == null) {
				Static538.method7345(Static286.aString44, Static392.aString61, Static402.anInt7015);
			} else {
				Static300.method4179(Static402.anInt7015);
			}
		} else if (arg0 == 12) {
			if (Static544.aString96 == null) {
				Static118.method1766(Static286.aString44, Static392.aString61);
			} else {
				Static501.method6999();
			}
		}
		if (Static338.method5154(Static201.anInt3963)) {
			Static156.aClass259_158.anInt7135 = 2;
			Static377.aClass259_123.anInt7135 = 2;
			Static216.aClass259_65.anInt7135 = 2;
			Static363.aClass259_117.anInt7135 = 2;
			Static485.aClass259_150.anInt7135 = 2;
			Static287.aClass259_86.anInt7135 = 2;
			Static568.aClass259_167.anInt7135 = 2;
		}
		if (Static338.method5154(arg0)) {
			Static233.anInt4345 = 1;
			Static414.anInt9338 = 0;
			Static91.anInt1973 = 0;
			Static125.anInt2405 = 0;
			Static523.anInt8625 = 1;
			Static298.method4515(true);
			Static156.aClass259_158.anInt7135 = 1;
			Static377.aClass259_123.anInt7135 = 1;
			Static216.aClass259_65.anInt7135 = 1;
			Static363.aClass259_117.anInt7135 = 1;
			Static485.aClass259_150.anInt7135 = 1;
			Static287.aClass259_86.anInt7135 = 1;
			Static568.aClass259_167.anInt7135 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static78.method7554();
		}
		@Pc(228) boolean local228 = arg0 == 2 || Static181.method3117(arg0) || Static407.method5922(arg0);
		@Pc(245) boolean local245 = Static201.anInt3963 == 2 || Static181.method3117(Static201.anInt3963) || Static407.method5922(Static201.anInt3963);
		if (local245 != local228) {
			if (local228) {
				Static593.anInt9611 = Static62.anInt1437;
				if (Static72.aClass2_Sub12_Sub1_1.anInt1923 == 0) {
					Static332.method5089();
				} else {
					Static263.method4047(Static343.aClass259_88, Static62.anInt1437, Static72.aClass2_Sub12_Sub1_1.anInt1923);
				}
				Static42.aClass327_1.method7226(false);
			} else {
				Static332.method5089();
				Static42.aClass327_1.method7226(true);
			}
		}
		if (Static338.method5154(arg0) || arg0 == 13) {
			Static307.aClass100_6.method6231();
		}
		Static201.anInt3963 = arg0;
	}
}
