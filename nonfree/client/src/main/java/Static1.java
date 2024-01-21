import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
	public static int anInt46;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "Lclient!va;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "[I")
	public static int[] anIntArray9 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "J")
	public static long aLong5 = 0L;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "Lclient!af;")
	public static Class5 aClass5_29 = Static45.method1937("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "Lclient!af;")
	public static Class5 aClass5_30 = Static45.method1937(":");

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
	public static int anInt50 = 0;

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "[Lclient!o;")
	public static Class54[] aClass54Array1 = new Class54[16];

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "[I")
	public static int[] anIntArray12 = new int[1000];

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public static void method50() {
		aClass5_30 = null;
		aBooleanArray1 = null;
		anIntArray12 = null;
		anIntArray9 = null;
		aClass54Array1 = null;
		aClass5_29 = null;
		aString1 = null;
		aClass78_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	public static void method51() {
		for (@Pc(11) int local11 = 0; local11 < Static86.anInt2184; local11++) {
			@Pc(17) int local17 = Static20.anIntArray83[local11];
			@Pc(21) Class1_Sub3_Sub4_Sub2_Sub2 local21 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local17];
			@Pc(25) int local25 = Static79.aClass1_Sub20_Sub1_2.method2053();
			@Pc(41) int local41;
			if ((local25 & 0x2) != 0) {
				local21.anInt3059 = Static79.aClass1_Sub20_Sub1_2.method2069();
				local41 = Static79.aClass1_Sub20_Sub1_2.method2093();
				local21.anInt3042 = local41 >> 16;
				local21.anInt3085 = (local41 & 0xFFFF) + Static131.anInt3270;
				if (local21.anInt3059 == 65535) {
					local21.anInt3059 = -1;
				}
				local21.anInt3065 = 0;
				local21.anInt3067 = 0;
				if (local21.anInt3085 > Static131.anInt3270) {
					local21.anInt3065 = -1;
				}
			}
			@Pc(87) int local87;
			if ((local25 & 0x1) != 0) {
				local41 = Static79.aClass1_Sub20_Sub1_2.method2053();
				local87 = Static79.aClass1_Sub20_Sub1_2.method2084();
				local21.method2157(Static131.anInt3270, local87, local41);
				local21.anInt3058 = Static131.anInt3270 + 300;
				local21.anInt3082 = Static79.aClass1_Sub20_Sub1_2.method2053();
				local21.anInt3057 = Static79.aClass1_Sub20_Sub1_2.method2053();
			}
			if ((local25 & 0x8) != 0) {
				local21.aClass1_Sub3_Sub12_1 = Static115.method2023(Static79.aClass1_Sub20_Sub1_2.method2100());
				local21.anInt3041 = local21.aClass1_Sub3_Sub12_1.anInt2113;
				local21.anInt3046 = local21.aClass1_Sub3_Sub12_1.anInt2106;
				local21.anInt3051 = local21.aClass1_Sub3_Sub12_1.anInt2101;
				local21.anInt3062 = local21.aClass1_Sub3_Sub12_1.anInt2116;
				local21.anInt3050 = local21.aClass1_Sub3_Sub12_1.anInt2117;
				local21.anInt3056 = local21.aClass1_Sub3_Sub12_1.anInt2115;
				local21.anInt3078 = local21.aClass1_Sub3_Sub12_1.anInt2096;
				local21.anInt3063 = local21.aClass1_Sub3_Sub12_1.anInt2092;
				local21.anInt3055 = local21.aClass1_Sub3_Sub12_1.anInt2095;
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt3039 = Static79.aClass1_Sub20_Sub1_2.method2100();
				if (local21.anInt3039 == 65535) {
					local21.anInt3039 = -1;
				}
			}
			if ((local25 & 0x40) != 0) {
				local21.anInt3038 = Static79.aClass1_Sub20_Sub1_2.method2100();
				local21.anInt3081 = Static79.aClass1_Sub20_Sub1_2.method2087();
			}
			if ((local25 & 0x20) != 0) {
				local41 = Static79.aClass1_Sub20_Sub1_2.method2053();
				local87 = Static79.aClass1_Sub20_Sub1_2.method2084();
				local21.method2157(Static131.anInt3270, local87, local41);
				local21.anInt3058 = Static131.anInt3270 + 300;
				local21.anInt3082 = Static79.aClass1_Sub20_Sub1_2.method2084();
				local21.anInt3057 = Static79.aClass1_Sub20_Sub1_2.method2070();
			}
			if ((local25 & 0x4) != 0) {
				local21.aClass5_1372 = Static79.aClass1_Sub20_Sub1_2.method2101();
				local21.anInt3076 = 100;
			}
			if ((local25 & 0x80) != 0) {
				local41 = Static79.aClass1_Sub20_Sub1_2.method2091();
				if (local41 == 65535) {
					local41 = -1;
				}
				local87 = Static79.aClass1_Sub20_Sub1_2.method2053();
				if (local21.anInt3068 == local41 && local41 != -1) {
					@Pc(319) int local319 = Static77.method1316(local41).anInt2043;
					if (local319 == 1) {
						local21.anInt3053 = 0;
						local21.anInt3048 = local87;
						local21.anInt3084 = 0;
						local21.anInt3075 = 0;
					}
					if (local319 == 2) {
						local21.anInt3084 = 0;
					}
				} else if (local41 == -1 || local21.anInt3068 == -1 || Static77.method1316(local41).anInt2052 >= Static77.method1316(local21.anInt3068).anInt2052) {
					local21.anInt3084 = 0;
					local21.anInt3053 = 0;
					local21.anInt3048 = local87;
					local21.anInt3068 = local41;
					local21.anInt3075 = 0;
					local21.anInt3061 = local21.anInt3047;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
	public static void method52() {
		Static2.anInt55 = -1;
		Static70.anInt1621 = 0;
		Static26.anInt806 = 2;
		Static73.aClass41_12 = null;
		Static95.aBoolean93 = false;
		Static125.anInt3198 = 1;
		Static19.anInt644 = -1;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
	public static void method53(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class1_Sub21 local18 = (Class1_Sub21) Static48.aClass7_4.method288(); local18 != null; local18 = (Class1_Sub21) Static48.aClass7_4.method284()) {
			if ((long) arg0 == (local18.aLong95 >> 48 & 0xFFFFL)) {
				local18.method2220();
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
	public static void method54() {
		for (@Pc(15) Class1_Sub3_Sub4_Sub7 local15 = (Class1_Sub3_Sub4_Sub7) Static45.aClass53_15.method1442(); local15 != null; local15 = (Class1_Sub3_Sub4_Sub7) Static45.aClass53_15.method1450()) {
			if (Static7.anInt213 != local15.anInt1439 || local15.aBoolean40) {
				local15.method2220();
			} else if (Static131.anInt3270 >= local15.anInt1446) {
				local15.method1090(Static95.anInt2359);
				if (local15.aBoolean40) {
					local15.method2220();
				} else {
					Static44.aClass68_1.method1863(local15.anInt1439, local15.anInt1438, local15.anInt1445, local15.anInt1436, 60, local15, 0, -1, false);
				}
			}
		}
	}
}
