import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public static int anInt2711;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_809 = Static129.method2060("Benutzen");

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_810 = Static129.method2060("me");

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	public static int anInt2719 = 0;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array18 = new Class61[100];

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!r;")
	public static Class61 aClass61_811 = Static129.method2060("leuchten1:");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1754() {
		try {
			if (Static58.anInt1425 == 1) {
				@Pc(12) int local12 = Static111.aClass5_Sub5_Sub1_2.method259();
				if (local12 > 0 && Static111.aClass5_Sub5_Sub1_2.method240()) {
					local12 -= Static101.anInt2694;
					if (local12 < 0) {
						local12 = 0;
					}
					Static111.aClass5_Sub5_Sub1_2.method249(local12);
					return;
				}
				Static111.aClass5_Sub5_Sub1_2.method244();
				Static111.aClass5_Sub5_Sub1_2.method263();
				Static32.aClass5_Sub18_1 = null;
				Static93.aClass65_1 = null;
				if (Static97.aClass26_21 == null) {
					Static58.anInt1425 = 0;
				} else {
					Static58.anInt1425 = 2;
				}
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static111.aClass5_Sub5_Sub1_2.method244();
			Static32.aClass5_Sub18_1 = null;
			Static58.anInt1425 = 0;
			Static97.aClass26_21 = null;
			Static93.aClass65_1 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public static void method1755() {
		aClass61_809 = null;
		aClass61_811 = null;
		aClass61_810 = null;
		aClass61Array18 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lclient!r;")
	public static Class61 method1756(@OriginalArg(0) int arg0) {
		@Pc(9) Class61 local9 = Static39.method730(arg0);
		for (@Pc(15) int local15 = local9.method1733() - 3; local15 > 0; local15 -= 3) {
			local9 = Static123.method1929(new Class61[] { local9.method1730(local15, 0), Static67.aClass61_512, local9.method1724(local15) });
		}
		if (local9.method1733() > 9) {
			return Static123.method1929(new Class61[] { Static17.aClass61_170, local9.method1730(local9.method1733() - 8, 0), Static121.aClass61_956, Static36.aClass61_305, local9, Static45.aClass61_361 });
		} else if (local9.method1733() > 6) {
			return Static123.method1929(new Class61[] { Static97.aClass61_755, local9.method1730(local9.method1733() - 4, 0), Static90.aClass61_705, Static36.aClass61_305, local9, Static45.aClass61_361 });
		} else {
			return Static123.method1929(new Class61[] { Static99.aClass61_767, local9, Static56.aClass61_442 });
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == Static107.anInt2777 && arg0 == Static92.anInt2247 && (Static55.anInt1403 == arg2 || !Static61.aBoolean57)) {
			return;
		}
		Static92.anInt2247 = arg0;
		Static107.anInt2777 = arg4;
		Static55.anInt1403 = arg2;
		if (!Static61.aBoolean57) {
			Static55.anInt1403 = 0;
		}
		Static36.method697(25);
		Static32.method651(Static17.aClass61_165, true);
		@Pc(48) int local48 = Static25.anInt730;
		Static25.anInt730 = arg0 * 8 - 48;
		@Pc(56) int local56 = Static19.anInt623;
		Static19.anInt623 = arg4 * 8 - 48;
		@Pc(67) int local67 = Static19.anInt623 - local56;
		@Pc(72) int local72 = Static25.anInt730 - local48;
		for (@Pc(78) int local78 = 0; local78 < 32768; local78++) {
			@Pc(84) Class5_Sub2_Sub2_Sub3_Sub1 local84 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local78];
			if (local84 != null) {
				for (@Pc(88) int local88 = 0; local88 < 10; local88++) {
					local84.anIntArray346[local88] -= local67;
					local84.anIntArray350[local88] -= local72;
				}
				local84.anInt2912 -= local67 * 128;
				local84.anInt2875 -= local72 * 128;
			}
		}
		for (@Pc(136) int local136 = 0; local136 < 2048; local136++) {
			@Pc(142) Class5_Sub2_Sub2_Sub3_Sub2 local142 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local136];
			if (local142 != null) {
				for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
					local142.anIntArray346[local146] -= local67;
					local142.anIntArray350[local146] -= local72;
				}
				local142.anInt2912 -= local67 * 128;
				local142.anInt2875 -= local72 * 128;
			}
		}
		Static93.anInt2428 = arg2;
		Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.method1857(arg3, arg1, false);
		@Pc(200) byte local200 = 104;
		@Pc(202) byte local202 = 0;
		@Pc(204) byte local204 = 1;
		if (local67 < 0) {
			local204 = -1;
			local200 = -1;
			local202 = 103;
		}
		@Pc(214) byte local214 = 0;
		@Pc(216) byte local216 = 1;
		@Pc(218) byte local218 = 104;
		if (local72 < 0) {
			local216 = -1;
			local214 = 103;
			local218 = -1;
		}
		for (@Pc(228) int local228 = local202; local228 != local200; local228 += local204) {
			for (@Pc(232) int local232 = local214; local232 != local218; local232 += local216) {
				@Pc(238) int local238 = local72 + local232;
				@Pc(242) int local242 = local228 + local67;
				for (@Pc(244) int local244 = 0; local244 < 4; local244++) {
					if (local242 >= 0 && local238 >= 0 && local242 < 104 && local238 < 104) {
						Static77.aClass58ArrayArrayArray1[local244][local228][local232] = Static77.aClass58ArrayArrayArray1[local244][local242][local238];
					} else {
						Static77.aClass58ArrayArrayArray1[local244][local228][local232] = null;
					}
				}
			}
		}
		for (@Pc(312) Class5_Sub4 local312 = (Class5_Sub4) Static97.aClass58_57.method1669(); local312 != null; local312 = (Class5_Sub4) Static97.aClass58_57.method1664()) {
			local312.anInt263 -= local67;
			local312.anInt260 -= local72;
			if (local312.anInt263 < 0 || local312.anInt260 < 0 || local312.anInt263 >= 104 || local312.anInt260 >= 104) {
				local312.method2189();
			}
		}
		Static1.anInt17 = -1;
		Static22.aBoolean22 = false;
		Static95.anInt2449 = 0;
		if (Static96.anInt2502 != 0) {
			anInt2719 -= local72;
			Static96.anInt2502 -= local67;
		}
		Static88.aClass58_75.method1668();
		Static119.aClass58_66.method1668();
	}
}
