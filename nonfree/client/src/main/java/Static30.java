import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	public static int anInt3246;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
	public static int anInt3253;

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "Lclient!ob;")
	public static Class117 aClass117_2;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
	public static int[] anIntArray298 = new int[50];

	@OriginalMember(owner = "client!cg", name = "ob", descriptor = "I")
	public static int anInt3296 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[BII)Z")
	public static boolean method2635(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class1_Sub11 local17 = new Class1_Sub11(arg0);
		@Pc(19) int local19 = -1;
		label71: while (true) {
			@Pc(23) int local23 = local17.method2656();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(64) int local64;
				@Pc(92) Class181 local92;
				do {
					@Pc(72) int local72;
					@Pc(76) int local76;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method2664();
										if (local39 == 0) {
											continue label71;
										}
										local17.method2690();
									}
									local39 = local17.method2664();
									if (local39 == 0) {
										continue label71;
									}
									local31 += local39 - 1;
									@Pc(58) int local58 = local31 >> 6 & 0x3F;
									local64 = local17.method2690() >> 2;
									@Pc(68) int local68 = local31 & 0x3F;
									local72 = arg2 + local58;
									local76 = arg1 + local68;
								} while (local72 <= 0);
							} while (local76 <= 0);
						} while (local72 >= 103);
					} while (local76 >= 103);
					local92 = Static183.method3511(local19);
				} while (local64 == 22 && !Static116.aBoolean450 && local92.anInt5537 == 0 && local92.anInt5568 != 1 && !local92.aBoolean437);
				local33 = true;
				if (!local92.method4429()) {
					Static69.anInt1472++;
					local12 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII[[II)I")
	public static int method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4) {
		@Pc(27) int local27 = arg3[arg0][arg4] * (128 - arg1) + arg3[arg0 + 1][arg4] * arg1 >> 7;
		@Pc(54) int local54 = arg3[arg0 + 1][arg4 + 1] * arg1 + arg3[arg0][arg4 + 1] * (128 - arg1) >> 7;
		return (128 - arg2) * local27 + arg2 * local54 >> 7;
	}

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "(I)V")
	public static void method2672() {
		while (true) {
			if (Static187.aClass1_Sub11_Sub1_2.method2693(Static33.anInt762) >= 27) {
				@Pc(18) int local18 = Static187.aClass1_Sub11_Sub1_2.method2701(15);
				if (local18 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static254.aClass14_Sub2_Sub2Array1[local18] == null) {
						local27 = true;
						Static254.aClass14_Sub2_Sub2Array1[local18] = new Class14_Sub2_Sub2();
					}
					@Pc(45) Class14_Sub2_Sub2 local45 = Static254.aClass14_Sub2_Sub2Array1[local18];
					Static281.anIntArray464[Static233.anInt4582++] = local18;
					local45.anInt4645 = Static237.anInt4710;
					if (local45.aClass46_1 != null && local45.aClass46_1.method1271()) {
						Static152.method2618(local45);
					}
					@Pc(75) int local75 = Static187.aClass1_Sub11_Sub1_2.method2701(5);
					if (local75 > 15) {
						local75 -= 32;
					}
					@Pc(89) int local89 = Static111.anIntArray230[Static187.aClass1_Sub11_Sub1_2.method2701(3)];
					if (local27) {
						local45.anInt4618 = local45.anInt4681 = local89;
					}
					@Pc(102) int local102 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
					local45.method3663(Static205.method3293(Static187.aClass1_Sub11_Sub1_2.method2701(14)));
					@Pc(116) int local116 = Static187.aClass1_Sub11_Sub1_2.method2701(5);
					if (local116 > 15) {
						local116 -= 32;
					}
					@Pc(126) int local126 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
					if (local126 == 1) {
						Static226.anIntArray399[Static1.anInt4241++] = local18;
					}
					local45.method3653(local45.aClass46_1.anInt1532);
					local45.anInt4617 = local45.aClass46_1.anInt1562;
					local45.anInt4674 = local45.aClass46_1.anInt1553;
					if (local45.anInt4617 == 0) {
						local45.anInt4681 = 0;
					}
					local45.method3654(local45.method3656(), local116 + Static197.aClass14_Sub2_Sub1_2.anIntArray418[0], local102 == 1, local75 + Static197.aClass14_Sub2_Sub1_2.anIntArray415[0]);
					if (local45.aClass46_1.method1271()) {
						Static84.method1471(Static140.anInt3034, local45.anIntArray418[0], 0, null, local45.anIntArray415[0], local45, null);
					}
					continue;
				}
			}
			Static187.aClass1_Sub11_Sub1_2.method2692();
			return;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)I")
	public static int method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}
}
