import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!ab;")
	public static Class3 aClass3_10;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_8;

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
	public static int anInt1617;

	@OriginalMember(owner = "client!hb", name = "ab", descriptor = "Lclient!ab;")
	public static Class3 aClass3_11;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "[I")
	public static final int[] anIntArray128 = new int[100];

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "Lclient!wd;")
	public static Class97 aClass97_7 = new Class97(32);

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "[I")
	public static final int[] anIntArray129 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_662 = Static187.method3089("rot:");

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_664 = Static187.method3089("Cancel");

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_663 = aClass92_664;

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_665 = Static187.method3089("::fpson");

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_666 = Static187.method3089("::rect_debug");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ba;I)V")
	public static void method1101(@OriginalArg(0) Class11 arg0) {
		@Pc(11) int local11 = arg0.anInt268 == 0 ? arg0.anInt312 : arg0.anInt268;
		@Pc(23) int local23 = arg0.anInt318 == 0 ? arg0.anInt263 : arg0.anInt318;
		Static35.method654(local11, local23, arg0.anInt275, Static194.aClass11ArrayArray1[arg0.anInt275 >> 16]);
		if (arg0.aClass11Array1 != null) {
			Static35.method654(local11, local23, arg0.anInt275, arg0.aClass11Array1);
		}
		@Pc(60) Class1_Sub4 local60 = (Class1_Sub4) Static183.aClass97_21.method3375((long) arg0.anInt275);
		if (local60 != null) {
			Static32.method582(local60.anInt490, local11, local23);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)Lclient!hb;")
	public static Class1_Sub3_Sub7 method1102(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub3_Sub7 local15 = (Class1_Sub3_Sub7) Static72.aClass47_11.method1281((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static92.aClass3_17.method3265(Static43.method790(arg0), Static129.method1877(arg0));
		local15 = new Class1_Sub3_Sub7();
		if (local29 != null) {
			local15.method1103(new Class1_Sub14(local29));
		}
		Static72.aClass47_11.method1273((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	public static void method1105() {
		if (!Static35.aBoolean61) {
			Static152.anInt3135 = 1;
			Static120.aShortArray21[0] = 1004;
			Static158.aClass92Array23[0] = aClass92_663;
			Static65.aClass92Array9[0] = Static26.aClass92_268;
		}
		if (Static22.anInt555 != -1) {
			Static59.method975(Static22.anInt555);
		}
		for (@Pc(30) int local30 = 0; local30 < Static89.anInt1911; local30++) {
			if (Static84.aBooleanArray5[local30]) {
				Static143.aBooleanArray13[local30] = true;
			}
			Static101.aBooleanArray7[local30] = Static84.aBooleanArray5[local30];
			Static84.aBooleanArray5[local30] = false;
		}
		Static31.anInt741 = Static155.anInt2981;
		Static204.anInt2392 = -1;
		Static104.aClass11_8 = null;
		Static66.anInt1521 = -1;
		if (Static22.anInt555 != -1) {
			Static89.anInt1911 = 0;
			Static102.method1546(Static111.anInt2396, -1, 0, 0, Static63.anInt3568, 0, Static22.anInt555, 0);
		}
		Static46.method3169();
		Static77.method1172();
		if (Static35.aBoolean61) {
			Static195.method3192();
		} else if (Static66.anInt1521 != -1) {
			Static202.method3348(Static66.anInt1521, Static204.anInt2392);
		}
		if (Static173.anInt3701 == 3) {
			for (@Pc(104) int local104 = 0; local104 < Static89.anInt1911; local104++) {
				if (Static101.aBooleanArray7[local104]) {
					Static46.method3163(Static111.anIntArray182[local104], Static49.anIntArray90[local104], Static189.anIntArray331[local104], Static110.anIntArray176[local104], 16711935, 128);
				} else if (Static143.aBooleanArray13[local104]) {
					Static46.method3163(Static111.anIntArray182[local104], Static49.anIntArray90[local104], Static189.anIntArray331[local104], Static110.anIntArray176[local104], 16711680, 128);
				}
			}
		}
		Static45.method811(Static192.anInt4180, Static110.anInt2383, Static15.aClass8_Sub3_Sub1_1.anInt3600, Static15.aClass8_Sub3_Sub1_1.anInt3606);
		Static110.anInt2383 = 0;
	}
}
