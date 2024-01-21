import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "Lclient!sd;")
	public static Class60 aClass60_9;

	@OriginalMember(owner = "client!ef", name = "rb", descriptor = "[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] aClass1_Sub2_Sub5_Sub1Array4;

	@OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
	public static int anInt1234 = 0;

	@OriginalMember(owner = "client!ef", name = "ob", descriptor = "[I")
	public static final int[] anIntArray118 = new int[32];

	@OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
	public static int anInt1239 = 0;

	@OriginalMember(owner = "client!ef", name = "sb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_772 = Static118.method2249("leuchten3:");

	@OriginalMember(owner = "client!ef", name = "tb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_773 = Static118.method2249("sl_stars");

	@OriginalMember(owner = "client!ef", name = "ub", descriptor = "I")
	public static int anInt1241 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
	public static void method809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static201.anInt3978 * 128) {
			arg0 = Static201.anInt3978 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static198.anInt4264 * 128) {
			arg2 = Static198.anInt4264 * 128 - 1;
		}
		Static11.anInt255++;
		Static201.anInt3974 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg3];
		Static123.anInt3073 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg3];
		Static36.anInt1022 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg4];
		Static14.anInt388 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg4];
		Static179.aBooleanArrayArray1 = Static137.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static1.anInt4460 = arg0;
		Static100.anInt2513 = arg1;
		Static66.anInt1691 = arg2;
		Static60.anInt1554 = arg0 / 128;
		Static33.anInt964 = arg2 / 128;
		Static115.anInt2804 = arg5;
		Static149.anInt3500 = Static60.anInt1554 - Static25.anInt733;
		if (Static149.anInt3500 < 0) {
			Static149.anInt3500 = 0;
		}
		Static143.anInt1630 = Static33.anInt964 - Static25.anInt733;
		if (Static143.anInt1630 < 0) {
			Static143.anInt1630 = 0;
		}
		Static157.anInt4277 = Static60.anInt1554 + Static25.anInt733;
		if (Static157.anInt4277 > Static201.anInt3978) {
			Static157.anInt4277 = Static201.anInt3978;
		}
		Static65.anInt1687 = Static33.anInt964 + Static25.anInt733;
		if (Static65.anInt1687 > Static198.anInt4264) {
			Static65.anInt1687 = Static198.anInt4264;
		}
		Static165.method2847();
		Static7.anInt175 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static185.anInt4103; local118 < Static100.anInt2522; local118++) {
			@Pc(123) Class1_Sub7[][] local123 = Static83.aClass1_Sub7ArrayArrayArray1[local118];
			for (local125 = Static149.anInt3500; local125 < Static157.anInt4277; local125++) {
				for (local128 = Static143.anInt1630; local128 < Static65.anInt1687; local128++) {
					@Pc(135) Class1_Sub7 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt1680 <= arg5 && (Static179.aBooleanArrayArray1[local125 + Static25.anInt733 - Static60.anInt1554][local128 + Static25.anInt733 - Static33.anInt964] || Static206.anIntArrayArrayArray10[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean72 = true;
							local135.aBoolean71 = true;
							if (local135.anInt1677 > 0) {
								local135.aBoolean73 = true;
							} else {
								local135.aBoolean73 = false;
							}
							Static7.anInt175++;
						} else {
							local135.aBoolean72 = false;
							local135.aBoolean71 = false;
							local135.anInt1674 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static185.anInt4103; local210 < Static100.anInt2522; local210++) {
			@Pc(215) Class1_Sub7[][] local215 = Static83.aClass1_Sub7ArrayArrayArray1[local210];
			for (local128 = -Static25.anInt733; local128 <= 0; local128++) {
				local223 = Static60.anInt1554 + local128;
				local227 = Static60.anInt1554 - local128;
				if (local223 >= Static149.anInt3500 || local227 < Static157.anInt4277) {
					for (local236 = -Static25.anInt733; local236 <= 0; local236++) {
						local241 = Static33.anInt964 + local236;
						local245 = Static33.anInt964 - local236;
						@Pc(257) Class1_Sub7 local257;
						if (local223 >= Static149.anInt3500) {
							if (local241 >= Static143.anInt1630) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean72) {
									Static185.method3080(local257, true);
								}
							}
							if (local245 < Static65.anInt1687) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean72) {
									Static185.method3080(local257, true);
								}
							}
						}
						if (local227 < Static157.anInt4277) {
							if (local241 >= Static143.anInt1630) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean72) {
									Static185.method3080(local257, true);
								}
							}
							if (local245 < Static65.anInt1687) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean72) {
									Static185.method3080(local257, true);
								}
							}
						}
						if (Static7.anInt175 == 0) {
							Static119.aBoolean120 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static185.anInt4103; local125 < Static100.anInt2522; local125++) {
			@Pc(341) Class1_Sub7[][] local341 = Static83.aClass1_Sub7ArrayArrayArray1[local125];
			for (local223 = -Static25.anInt733; local223 <= 0; local223++) {
				local227 = Static60.anInt1554 + local223;
				local236 = Static60.anInt1554 - local223;
				if (local227 >= Static149.anInt3500 || local236 < Static157.anInt4277) {
					for (local241 = -Static25.anInt733; local241 <= 0; local241++) {
						local245 = Static33.anInt964 + local241;
						@Pc(371) int local371 = Static33.anInt964 - local241;
						@Pc(383) Class1_Sub7 local383;
						if (local227 >= Static149.anInt3500) {
							if (local245 >= Static143.anInt1630) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean72) {
									Static185.method3080(local383, false);
								}
							}
							if (local371 < Static65.anInt1687) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean72) {
									Static185.method3080(local383, false);
								}
							}
						}
						if (local236 < Static157.anInt4277) {
							if (local245 >= Static143.anInt1630) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean72) {
									Static185.method3080(local383, false);
								}
							}
							if (local371 < Static65.anInt1687) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean72) {
									Static185.method3080(local383, false);
								}
							}
						}
						if (Static7.anInt175 == 0) {
							Static119.aBoolean120 = false;
							return;
						}
					}
				}
			}
		}
		Static119.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
	public static void method811(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static173.method2925(arg0)) {
			return;
		}
		@Pc(18) Class97[] local18 = Static99.aClass97ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local18.length; local24++) {
			@Pc(29) Class97 local29 = local18[local24];
			if (local29.anObjectArray15 != null) {
				@Pc(36) Class1_Sub26 local36 = new Class1_Sub26();
				local36.anObjectArray3 = local29.anObjectArray15;
				local36.aClass97_14 = local29;
				Static204.method3260(2000000, local36);
			}
		}
	}
}
