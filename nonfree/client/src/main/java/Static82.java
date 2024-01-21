import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_16;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!ud;")
	public static Class5 aClass5_26;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_562 = Static13.method257("This is a non)2members*6nworld)3 To enjoy your*6nmembers benefits we*6nrecommend you play on a*6nmembers world instead)3");

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public static final int anInt1936 = 5063219;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_563 = Static13.method257("runes");

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public static int anInt1942 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_564 = Static13.method257("From ");

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public static int anInt1947 = 0;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_565 = Static13.method257("flash3:");

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_566 = Static13.method257("purple:");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method1342() {
		Static25.aClass47_7.method1330();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIII)V")
	public static void method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!Static1.aBoolean2) {
			arg1 = 0;
		}
		if (arg0 == Static56.anInt2327 && arg4 == Static49.anInt2262 && Static33.anInt786 == arg1) {
			return;
		}
		Static33.anInt786 = arg1;
		Static49.anInt2262 = arg4;
		Static56.anInt2327 = arg0;
		Static7.method187(25);
		Static66.method1095(false, null, Static98.aClass40_674);
		@Pc(43) int local43 = Static30.anInt725;
		Static30.anInt725 = (arg4 - 6) * 8;
		@Pc(54) int local54 = Static30.anInt725 - local43;
		@Pc(58) int local58 = Static87.anInt2058;
		Static87.anInt2058 = arg0 * 8 - 48;
		@Pc(69) int local69 = Static87.anInt2058 - local58;
		for (@Pc(73) int local73 = 0; local73 < 16384; local73++) {
			@Pc(79) Class2_Sub2_Sub12_Sub1_Sub2 local79 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local73];
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
			@Pc(137) Class2_Sub2_Sub12_Sub1_Sub1 local137 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local131];
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
		Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.method1545(false, arg2, arg3);
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
						Static91.aClass44ArrayArrayArray1[local242][local226][local230] = Static91.aClass44ArrayArrayArray1[local242][local236][local240];
					} else {
						Static91.aClass44ArrayArrayArray1[local242][local226][local230] = null;
					}
				}
			}
		}
		for (@Pc(307) Class2_Sub7 local307 = (Class2_Sub7) Static92.aClass44_7.method1224(); local307 != null; local307 = (Class2_Sub7) Static92.aClass44_7.method1231()) {
			local307.anInt821 -= local54;
			local307.anInt818 -= local69;
			if (local307.anInt818 < 0 || local307.anInt821 < 0 || local307.anInt818 >= 104 || local307.anInt821 >= 104) {
				local307.method1677();
			}
		}
		Static7.aBoolean22 = false;
		if (Static38.anInt986 != 0) {
			Static38.anInt986 -= local69;
			Static80.anInt1919 -= local54;
		}
		Static22.anInt2590 = -1;
		Static96.aClass44_8.method1222();
		Static24.aClass44_4.method1222();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
	public static void method1344() {
		Static41.aClass47_11.method1330();
		Static92.aClass47_21.method1330();
		Static41.aClass47_10.method1330();
		Static2.aClass47_1.method1330();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BJ)V")
	public static void method1345(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static99.anInt121; local17++) {
			if (arg0 == Static84.aLongArray4[local17]) {
				Static99.anInt121--;
				Static33.aBoolean59 = true;
				for (@Pc(37) int local37 = local17; local37 < Static99.anInt121; local37++) {
					Static84.aLongArray4[local37] = Static84.aLongArray4[local37 + 1];
				}
				Static80.aClass2_Sub3_Sub1_4.method1736(168);
				Static80.aClass2_Sub3_Sub1_4.method1680(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method1346() {
		aClass40_566 = null;
		aClass40_563 = null;
		aClass40_565 = null;
		aClass5_26 = null;
		aClass5_Sub1_16 = null;
		aClass40_564 = null;
		aClass40_562 = null;
	}
}
