import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_16;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!ud;")
	public static Class5 aClass5_26;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 49)
	public static void method1342() {
		Class2_Sub2_Sub6.aClass47_7.method1330();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIII)V", line = 60)
	public static void method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!Class1.aBoolean2) {
			arg1 = 0;
		}
		if (arg0 == Static51.anInt2327 && arg4 == Static45.anInt2262 && Class2_Sub2_Sub7.anInt786 == arg1) {
			return;
		}
		Class2_Sub2_Sub7.anInt786 = arg1;
		Static45.anInt2262 = arg4;
		Static51.anInt2327 = arg0;
		Static7.method187(25);
		Static61.method1095(false, null, Class60.aClass40_674);
		@Pc(43) int local43 = Static28.anInt725;
		Static28.anInt725 = (arg4 - 6) * 8;
		@Pc(54) int local54 = Static28.anInt725 - local43;
		@Pc(58) int local58 = Static79.anInt2058;
		Static79.anInt2058 = arg0 * 8 - 48;
		@Pc(69) int local69 = Static79.anInt2058 - local58;
		for (@Pc(73) int local73 = 0; local73 < 16384; local73++) {
			@Pc(79) Class2_Sub2_Sub12_Sub1_Sub2 local79 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < 10; local83++) {
					local79.anIntArray492[local83] -= local69;
					local79.anIntArray496[local83] -= local54;
				}
				local79.anInt2275 -= local69 * 128;
				local79.anInt2284 -= local54 * 128;
			}
		}
		for (@Pc(131) int local131 = 0; local131 < 2048; local131++) {
			@Pc(137) Class2_Sub2_Sub12_Sub1_Sub1 local137 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local131];
			if (local137 != null) {
				for (@Pc(141) int local141 = 0; local141 < 10; local141++) {
					local137.anIntArray492[local141] -= local69;
					local137.anIntArray496[local141] -= local54;
				}
				local137.anInt2275 -= local69 * 128;
				local137.anInt2284 -= local54 * 128;
			}
		}
		@Pc(187) byte local187 = 0;
		Static1.anInt8 = arg1;
		Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.method1545(false, arg2, arg3);
		@Pc(197) byte local197 = 104;
		@Pc(199) byte local199 = 1;
		@Pc(201) byte local201 = 0;
		if (local69 < 0) {
			local199 = -1;
			local187 = 103;
			local197 = -1;
		}
		@Pc(211) byte local211 = 1;
		@Pc(213) byte local213 = 104;
		if (local54 < 0) {
			local211 = -1;
			local201 = 103;
			local213 = -1;
		}
		for (@Pc(226) int local226 = local187; local226 != local197; local226 += local199) {
			for (@Pc(230) int local230 = local201; local230 != local213; local230 += local211) {
				@Pc(236) int local236 = local69 + local226;
				@Pc(240) int local240 = local54 + local230;
				for (@Pc(242) int local242 = 0; local242 < 4; local242++) {
					if (local236 >= 0 && local240 >= 0 && local236 < 104 && local240 < 104) {
						Class57.aClass44ArrayArrayArray1[local242][local226][local230] = Class57.aClass44ArrayArrayArray1[local242][local236][local240];
					} else {
						Class57.aClass44ArrayArrayArray1[local242][local226][local230] = null;
					}
				}
			}
		}
		for (@Pc(307) Class2_Sub7 local307 = (Class2_Sub7) Class45_Sub1.aClass44_7.method1224(); local307 != null; local307 = (Class2_Sub7) Class45_Sub1.aClass44_7.method1231()) {
			local307.anInt821 -= local54;
			local307.anInt818 -= local69;
			if (local307.anInt818 < 0 || local307.anInt821 < 0 || local307.anInt818 >= 104 || local307.anInt821 >= 104) {
				local307.method1677();
			}
		}
		Class6.aBoolean22 = false;
		if (Class25.anInt986 != 0) {
			Class25.anInt986 -= local69;
			Class47.anInt1919 -= local54;
		}
		Class2_Sub3.anInt2590 = -1;
		Class2_Sub2_Sub12_Sub1_Sub2.aClass44_8.method1222();
		Class2_Sub2_Sub5.aClass44_4.method1222();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 246)
	public static void method1344() {
		Class2_Sub2_Sub9.aClass47_11.method1330();
		Class45_Sub1.aClass47_21.method1330();
		Class2_Sub2_Sub9.aClass47_10.method1330();
		Class3.aClass47_1.method1330();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BJ)V", line = 267)
	public static void method1345(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Class5.anInt121; local17++) {
			if (arg0 == Class52.aLongArray4[local17]) {
				Class5.anInt121--;
				Class2_Sub2_Sub7.aBoolean59 = true;
				for (@Pc(37) int local37 = local17; local37 < Class5.anInt121; local37++) {
					Class52.aLongArray4[local37] = Class52.aLongArray4[local37 + 1];
				}
				Class47.aClass2_Sub3_Sub1_4.method1736(168);
				Class47.aClass2_Sub3_Sub1_4.method1680(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 305)
	public static void method1346() {
		Class50.aClass40_566 = null;
		Class50.aClass40_563 = null;
		Class50.aClass40_565 = null;
		aClass5_26 = null;
		aClass5_Sub1_16 = null;
		Class50.aClass40_564 = null;
		Class50.aClass40_562 = null;
	}
}
