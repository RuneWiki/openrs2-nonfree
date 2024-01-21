import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!ge;")
	public static Class7 aClass7_18;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!rd;")
	private static Class63 aClass63_545 = Static80.method1463("Accept challenge");

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!rd;")
	public static Class63 aClass63_543 = aClass63_545;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "Lclient!rd;")
	private static Class63 aClass63_547 = Static80.method1463("Sorry invited players only)3");

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_544 = aClass63_547;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_546 = Static80.method1463("@or1@");

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	public static int anInt958 = -1;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "[I")
	public static int[] anIntArray124 = new int[1000];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method718() {
		if (Static47.anInt1496 != 0 && Static47.anInt1496 != 3 || Static19.anInt642 != 1) {
			return;
		}
		@Pc(30) int local30 = Static59.anInt1765 - 25 - 550;
		@Pc(36) int local36 = Static61.anInt1804 - 4 - 5;
		if (local30 < 0 || local36 < 0 || local30 >= 146 || local36 >= 151) {
			return;
		}
		local36 -= 75;
		@Pc(58) int local58 = Static109.anInt3032 + Static84.anInt2420 & 0x7FF;
		local30 -= 73;
		@Pc(63) int local63 = Class6_Sub3_Sub3_Sub4.anIntArray343[local58];
		@Pc(71) int local71 = (Static11.anInt1914 + 256) * local63 >> 8;
		@Pc(75) int local75 = Class6_Sub3_Sub3_Sub4.anIntArray342[local58];
		@Pc(83) int local83 = (Static11.anInt1914 + 256) * local75 >> 8;
		@Pc(93) int local93 = local71 * local36 + local83 * local30 >> 11;
		@Pc(104) int local104 = local83 * local36 - local71 * local30 >> 11;
		@Pc(111) int local111 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 + local93 >> 7;
		@Pc(119) int local119 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 - local104 >> 7;
		@Pc(139) boolean local139 = Static113.method488(0, local111, 1, true, local119, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
		if (!local139) {
			return;
		}
		Static23.aClass6_Sub4_Sub1_4.method1330(local30);
		Static23.aClass6_Sub4_Sub1_4.method1330(local36);
		Static23.aClass6_Sub4_Sub1_4.method1332(Static109.anInt3032);
		Static23.aClass6_Sub4_Sub1_4.method1330(57);
		Static23.aClass6_Sub4_Sub1_4.method1330(Static84.anInt2420);
		Static23.aClass6_Sub4_Sub1_4.method1330(Static11.anInt1914);
		Static23.aClass6_Sub4_Sub1_4.method1330(89);
		Static23.aClass6_Sub4_Sub1_4.method1332(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319);
		Static23.aClass6_Sub4_Sub1_4.method1332(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347);
		Static23.aClass6_Sub4_Sub1_4.method1330(Static59.anInt1766);
		Static23.aClass6_Sub4_Sub1_4.method1330(63);
		return;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method719() {
		Static77.anInt2144 = -1;
		Static12.aBoolean23 = false;
		Static47.anInt1496 = 0;
		Static18.anInt569 = 0;
		Static100.anInt2788 = 0;
		Static36.anInt1217 = 0;
		Static115.anInt3138 = -1;
		Static111.anInt3046 = -1;
		Static23.aClass6_Sub4_Sub1_4.anInt1949 = 0;
		Static31.anInt1015 = 0;
		Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
		Static14.anInt464 = 0;
		Static61.anInt1806 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1.length; local35++) {
			if (Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local35] != null) {
				Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local35].anInt2300 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1.length; local53++) {
			if (Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local53] != null) {
				Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local53].anInt2300 = -1;
			}
		}
		Static25.method599();
		Static73.method1392(30);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!wa;I)Lclient!rd;")
	public static Class63 method720(@OriginalArg(1) Class6_Sub3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (!Static12.method342(Static82.method1498(arg0), arg1)) {
			return null;
		} else if (arg0.aClass63Array24 == null || arg1 >= arg0.aClass63Array24.length || arg0.aClass63Array24[arg1] == null || arg0.aClass63Array24[arg1].method1833().method1811() == 0) {
			return Static66.aBoolean170 ? Static15.method374(new Class63[] { Static115.aClass63_1710, Static118.method2114(arg1) }) : null;
		} else {
			return arg0.aClass63Array24[arg1];
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lclient!gd;")
	public static Class6_Sub3_Sub7 method721(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub3_Sub7 local10 = (Class6_Sub3_Sub7) Static74.aClass49_21.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static75.aClass7_43.method110(12, arg0);
		local10 = new Class6_Sub3_Sub7();
		if (local25 != null) {
			local10.method934(new Class6_Sub4(local25));
		}
		local10.method924();
		Static74.aClass49_21.method1396((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public static void method722() {
		aClass63_547 = null;
		aClass63_545 = null;
		aClass63_544 = null;
		aClass63_543 = null;
		aClass7_18 = null;
		aClass63_546 = null;
		anIntArray123 = null;
		anIntArray124 = null;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)V")
	public static void method723(@OriginalArg(1) int arg0) {
		if (!Static36.method866(arg0)) {
			return;
		}
		@Pc(14) Class6_Sub3_Sub17[] local14 = Static68.aClass6_Sub3_Sub17ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class6_Sub3_Sub17 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt3289 = 0;
				local27.anInt3259 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	public static void method724() {
		for (@Pc(6) Class6_Sub17 local6 = (Class6_Sub17) Static81.aClass1_4.method3(); local6 != null; local6 = (Class6_Sub17) Static81.aClass1_4.method14()) {
			if (local6.aClass6_Sub6_Sub1_3 != null) {
				Static54.aClass6_Sub6_Sub2_1.method1629(local6.aClass6_Sub6_Sub1_3);
				local6.aClass6_Sub6_Sub1_3 = null;
			}
			if (local6.aClass6_Sub6_Sub1_2 != null) {
				Static54.aClass6_Sub6_Sub2_1.method1629(local6.aClass6_Sub6_Sub1_2);
				local6.aClass6_Sub6_Sub1_2 = null;
			}
		}
		Static81.aClass1_4.method17();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)Z")
	public static boolean method725(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
