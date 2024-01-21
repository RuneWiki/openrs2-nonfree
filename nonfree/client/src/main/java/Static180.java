import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1558 = Static146.method2172(" loggt sich ein)3");

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1560 = Static146.method2172("Prepared visibility map");

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1559 = aClass77_1560;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "Lclient!ua;")
	public static Class82 aClass82_65 = new Class82(64);

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1561 = Static146.method2172("Login server offline)3");

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1562 = aClass77_1561;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIII)V")
	public static void method3005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub25 local10 = (Class2_Sub25) Static63.aClass10_45.method444(); local10 != null; local10 = (Class2_Sub25) Static63.aClass10_45.method451()) {
			if (local10.anInt4580 != -1 || local10.anIntArray644 != null) {
				@Pc(21) int local21 = 0;
				if (arg1 > local10.anInt4579) {
					local21 = arg1 - local10.anInt4579;
				} else if (arg1 < local10.anInt4586) {
					local21 = local10.anInt4586 - arg1;
				}
				if (arg3 > local10.anInt4588) {
					local21 += arg3 - local10.anInt4588;
				} else if (local10.anInt4589 > arg3) {
					local21 += local10.anInt4589 - arg3;
				}
				if (local21 - 64 > local10.anInt4585 || Static18.anInt617 == 0 || local10.anInt4583 != arg2) {
					if (local10.aClass2_Sub9_Sub1_3 != null) {
						Static153.aClass2_Sub9_Sub4_2.method2938(local10.aClass2_Sub9_Sub1_3);
						local10.aClass2_Sub9_Sub1_3 = null;
					}
					if (local10.aClass2_Sub9_Sub1_2 != null) {
						Static153.aClass2_Sub9_Sub4_2.method2938(local10.aClass2_Sub9_Sub1_2);
						local10.aClass2_Sub9_Sub1_2 = null;
					}
				} else {
					local21 -= 64;
					if (local21 < 0) {
						local21 = 0;
					}
					@Pc(134) int local134 = Static18.anInt617 * (local10.anInt4585 - local21) / local10.anInt4585;
					if (local10.aClass2_Sub9_Sub1_3 != null) {
						local10.aClass2_Sub9_Sub1_3.method1735(local134);
					} else if (local10.anInt4580 >= 0) {
						@Pc(155) Class76 local155 = Static188.method2449(Static55.aClass43_Sub1_9, local10.anInt4580, 0);
						if (local155 != null) {
							@Pc(162) Class2_Sub5_Sub1 local162 = local155.method2447().method1397(Static150.aClass27_1);
							@Pc(167) Class2_Sub9_Sub1 local167 = Static187.method1708(local162, local134);
							local167.method1723(-1);
							Static153.aClass2_Sub9_Sub4_2.method2932(local167);
							local10.aClass2_Sub9_Sub1_3 = local167;
						}
					}
					if (local10.aClass2_Sub9_Sub1_2 != null) {
						local10.aClass2_Sub9_Sub1_2.method1735(local134);
						if (!local10.aClass2_Sub9_Sub1_2.method3003()) {
							local10.aClass2_Sub9_Sub1_2 = null;
						}
					} else if (local10.anIntArray644 != null && (local10.anInt4581 -= arg0) <= 0) {
						@Pc(198) int local198 = (int) ((double) local10.anIntArray644.length * Math.random());
						@Pc(206) Class76 local206 = Static188.method2449(Static55.aClass43_Sub1_9, local10.anIntArray644[local198], 0);
						if (local206 != null) {
							@Pc(213) Class2_Sub5_Sub1 local213 = local206.method2447().method1397(Static150.aClass27_1);
							@Pc(218) Class2_Sub9_Sub1 local218 = Static187.method1708(local213, local134);
							local218.method1723(0);
							Static153.aClass2_Sub9_Sub4_2.method2932(local218);
							local10.aClass2_Sub9_Sub1_2 = local218;
							local10.anInt4581 = local10.anInt4591 + (int) (Math.random() * (double) (local10.anInt4590 - local10.anInt4591));
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
	public static void method3006(@OriginalArg(0) boolean arg0) {
		if (Static136.anInt3295 == Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 >> 7 && Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 >> 7 == Static85.anInt2206) {
			Static136.anInt3295 = 0;
		}
		@Pc(19) int local19 = Static124.anInt3042;
		if (arg0) {
			local19 = 1;
		}
		for (@Pc(29) int local29 = 0; local29 < local19; local29++) {
			@Pc(44) Class2_Sub2_Sub1_Sub6_Sub1 local44;
			@Pc(38) int local38;
			if (arg0) {
				local44 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11;
				local38 = 33538048;
			} else {
				local38 = Static177.anIntArray632[local29] << 14;
				local44 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[Static177.anIntArray632[local29]];
			}
			if (local44 != null && local44.method2916()) {
				local44.aBoolean177 = false;
				if ((Static92.aBoolean101 && Static124.anInt3042 > 50 || Static124.anInt3042 > 200) && !arg0 && local44.anInt4413 == local44.anInt4389) {
					local44.aBoolean177 = true;
				}
				@Pc(83) int local83 = local44.anInt4400 >> 7;
				@Pc(88) int local88 = local44.anInt4385 >> 7;
				if (local83 >= 0 && local83 < 104 && local88 >= 0 && local88 < 104) {
					if (local44.aClass2_Sub2_Sub1_Sub2_1 == null || Static143.anInt3513 < local44.anInt4336 || local44.anInt4332 <= Static143.anInt3513) {
						if ((local44.anInt4400 & 0x7F) == 64 && (local44.anInt4385 & 0x7F) == 64) {
							if (Static128.anInt3108 == Static105.anIntArrayArray20[local83][local88]) {
								continue;
							}
							Static105.anIntArrayArray20[local83][local88] = Static128.anInt3108;
						}
						local44.anInt4346 = Static161.method2725(local44.anInt4400, Static54.anInt1472, local44.anInt4385);
						Static172.aClass60_1.method2091(Static54.anInt1472, local44.anInt4400, local44.anInt4385, local44.anInt4346, 60, local44, local44.anInt4415, local38, local44.aBoolean180);
					} else {
						local44.aBoolean177 = false;
						local44.anInt4346 = Static161.method2725(local44.anInt4400, Static54.anInt1472, local44.anInt4385);
						Static172.aClass60_1.method2079(Static54.anInt1472, local44.anInt4400, local44.anInt4385, local44.anInt4346, local44, local44.anInt4415, local38, local44.anInt4334, local44.anInt4333, local44.anInt4340, local44.anInt4338);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public static void method3008() {
		aClass77_1560 = null;
		aClass77_1559 = null;
		aClass77_1561 = null;
		aClass77_1558 = null;
		aClass82_65 = null;
		aClass77_1562 = null;
	}
}
