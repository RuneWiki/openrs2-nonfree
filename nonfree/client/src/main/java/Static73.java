import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	public static int anInt2175;

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_10;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_536 = Static158.method3034("me");

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_541 = Static158.method3034("Members only world");

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!ob;")
	public static Class60 aClass60_537 = aClass60_541;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_543 = Static158.method3034("Loaded update list");

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!ob;")
	public static Class60 aClass60_538 = aClass60_543;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_539 = Static158.method3034("sch-Utteln:");

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_540 = Static158.method3034("Error loading your profile)3");

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "Lclient!ob;")
	public static Class60 aClass60_542 = aClass60_540;

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_544 = Static158.method3034("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([IIIIIII)V")
	public static void method1664(@OriginalArg(0) int[] arg0) {
		Static12.anInt385 = 25;
		Static1.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static12.anInt385 + Static12.anInt385 + 1][Static12.anInt385 + Static12.anInt385 + 1];
		Static30.anInt900 = 0;
		Static10.anInt332 = 0;
		Static152.anInt2806 = 512;
		Static105.anInt3627 = 334;
		Static184.anInt4447 = 256;
		Static5.anInt136 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static12.anInt385 + Static12.anInt385 + 3][Static12.anInt385 + Static12.anInt385 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static94.anInt2812 = Class2_Sub1_Sub7_Sub1.anIntArray133[local47];
				Static108.anInt3076 = Class2_Sub1_Sub7_Sub1.anIntArray129[local47];
				Static189.anInt4498 = Class2_Sub1_Sub7_Sub1.anIntArray133[local50];
				Static135.anInt3581 = Class2_Sub1_Sub7_Sub1.anIntArray129[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static12.anInt385 + 1); local82 <= Static12.anInt385 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static12.anInt385 + 1); local88 <= Static12.anInt385 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static155.method2994(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static12.anInt385 + 1][local88 + Static12.anInt385 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static12.anInt385; local77 < Static12.anInt385; local77++) {
					for (local82 = -Static12.anInt385; local82 < Static12.anInt385; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static12.anInt385 + 1][local82 + local97 + Static12.anInt385 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static12.anInt385 + 1][local82 + local97 + Static12.anInt385 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static12.anInt385 + 1][local82 + local97 + Static12.anInt385 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static12.anInt385 + 1][local82 + local97 + Static12.anInt385 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static1.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static12.anInt385][local82 + Static12.anInt385] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ob;)I")
	public static int method1672(@OriginalArg(1) Class60 arg0) {
		return arg0.method2673() + 1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
	public static void method1677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static36.anInt1076 <= arg0 && arg0 <= Static117.anInt951) {
			@Pc(15) int local15 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1);
			@Pc(21) int local21 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg2);
			Static56.method1332(arg0, local21, local15, arg3);
		}
	}
}
