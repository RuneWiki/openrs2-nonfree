import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!kc;")
	public static Class11 aClass11_15;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray30;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
	public static int[] anIntArray317 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
	public static int[] anIntArray318 = new int[1000];

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!nb;")
	public static Class36 aClass36_7 = new Class36();

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
	public static int[] anIntArray319 = new int[5];

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
	public static int anInt2275 = 0;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "[Lclient!vb;")
	public static Class60[] aClass60Array1 = new Class60[4];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V")
	public static void method1423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static99.aClass64_1.method1757(arg4, arg1, arg0);
		@Pc(29) int local29;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(18) int local18;
		@Pc(60) int local60;
		@Pc(35) int local35;
		if (local11 != 0) {
			local18 = arg2;
			if (local11 > 0) {
				local18 = arg3;
			}
			local29 = Static99.aClass64_1.method1802(arg4, arg1, arg0, local11);
			local35 = local11 >> 14 & 0x7FFF;
			local41 = local29 >> 6 & 0x3;
			local45 = local29 & 0x1F;
			local60 = (103 - arg0) * 4 * 512 + arg1 * 4 + 24624;
			@Pc(63) int[] local63 = Static100.aClass2_Sub1_Sub3_Sub2_7.anIntArray89;
			@Pc(67) Class2_Sub1_Sub16 local67 = Static92.method1045(local35);
			if (local67.anInt2707 == -1) {
				if (local45 == 0 || local45 == 2) {
					if (local41 == 0) {
						local63[local60] = local18;
						local63[local60 + 512] = local18;
						local63[local60 + 1024] = local18;
						local63[local60 + 1536] = local18;
					} else if (local41 == 1) {
						local63[local60] = local18;
						local63[local60 + 1] = local18;
						local63[local60 + 2] = local18;
						local63[local60 + 3] = local18;
					} else if (local41 == 2) {
						local63[local60 + 3] = local18;
						local63[local60 + 3 + 512] = local18;
						local63[local60 + 1027] = local18;
						local63[local60 + 3 + 1536] = local18;
					} else if (local41 == 3) {
						local63[local60 + 1536] = local18;
						local63[local60 + 1 + 1536] = local18;
						local63[local60 + 1536 + 2] = local18;
						local63[local60 + 1536 + 3] = local18;
					}
				}
				if (local45 == 3) {
					if (local41 == 0) {
						local63[local60] = local18;
					} else if (local41 == 1) {
						local63[local60 + 3] = local18;
					} else if (local41 == 2) {
						local63[local60 + 1536 + 3] = local18;
					} else if (local41 == 3) {
						local63[local60 + 1536] = local18;
					}
				}
				if (local45 == 2) {
					if (local41 == 3) {
						local63[local60] = local18;
						local63[local60 + 512] = local18;
						local63[local60 + 1024] = local18;
						local63[local60 + 1536] = local18;
					} else if (local41 == 0) {
						local63[local60] = local18;
						local63[local60 + 1] = local18;
						local63[local60 + 2] = local18;
						local63[local60 + 3] = local18;
					} else if (local41 == 1) {
						local63[local60 + 3] = local18;
						local63[local60 + 512 + 3] = local18;
						local63[local60 + 1024 + 3] = local18;
						local63[local60 + 1536 + 3] = local18;
					} else if (local41 == 2) {
						local63[local60 + 1536] = local18;
						local63[local60 + 1537] = local18;
						local63[local60 + 2 + 1536] = local18;
						local63[local60 + 1539] = local18;
					}
				}
			} else {
				@Pc(379) Class2_Sub1_Sub3_Sub1 local379 = Static51.aClass2_Sub1_Sub3_Sub1Array2[local67.anInt2707];
				if (local379 != null) {
					@Pc(392) int local392 = (local67.anInt2698 * 4 - local379.anInt432) / 2;
					@Pc(403) int local403 = (local67.anInt2699 * 4 - local379.anInt436) / 2;
					local379.method291(local392 + arg1 * 4 + 48, (-local67.anInt2699 + 104 + -arg0) * 4 + 48 + local403);
				}
			}
		}
		local11 = Static99.aClass64_1.method1795(arg4, arg1, arg0);
		if (local11 != 0) {
			local29 = Static99.aClass64_1.method1802(arg4, arg1, arg0, local11);
			local18 = local11 >> 14 & 0x7FFF;
			local41 = local29 >> 6 & 0x3;
			@Pc(463) Class2_Sub1_Sub16 local463 = Static92.method1045(local18);
			local45 = local29 & 0x1F;
			@Pc(489) int local489;
			if (local463.anInt2707 != -1) {
				@Pc(476) Class2_Sub1_Sub3_Sub1 local476 = Static51.aClass2_Sub1_Sub3_Sub1Array2[local463.anInt2707];
				if (local476 != null) {
					local489 = (local463.anInt2699 * 4 - local476.anInt436) / 2;
					local35 = (local463.anInt2698 * 4 - local476.anInt432) / 2;
					local476.method291(arg1 * 4 + local35 + 48, local489 + 48 + (-arg0 + 104 + -local463.anInt2699) * 4);
				}
			} else if (local45 == 9) {
				local60 = 15658734;
				if (local11 > 0) {
					local60 = 15597568;
				}
				@Pc(538) int[] local538 = Static100.aClass2_Sub1_Sub3_Sub2_7.anIntArray89;
				local489 = (103 - arg0) * 2048 + arg1 * 4 + 24624;
				if (local41 == 0 || local41 == 2) {
					local538[local489 + 1536] = local60;
					local538[local489 + 1024 + 1] = local60;
					local538[local489 + 2 + 512] = local60;
					local538[local489 + 3] = local60;
				} else {
					local538[local489] = local60;
					local538[local489 + 512 + 1] = local60;
					local538[local489 + 2 + 1024] = local60;
					local538[local489 + 1539] = local60;
				}
			}
		}
		local11 = Static99.aClass64_1.method1768(arg4, arg1, arg0);
		if (local11 == 0) {
			return;
		}
		local29 = local11 >> 14 & 0x7FFF;
		@Pc(632) Class2_Sub1_Sub16 local632 = Static92.method1045(local29);
		if (local632.anInt2707 == -1) {
			return;
		}
		@Pc(641) Class2_Sub1_Sub3_Sub1 local641 = Static51.aClass2_Sub1_Sub3_Sub1Array2[local632.anInt2707];
		if (local641 != null) {
			@Pc(653) int local653 = (local632.anInt2699 * 4 - local641.anInt436) / 2;
			local18 = (local632.anInt2698 * 4 - local641.anInt432) / 2;
			local641.method291(local18 + arg1 * 4 + 48, (-local632.anInt2699 + 104 + -arg0) * 4 + 48 - -local653);
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method1424() {
		aClass36_7 = null;
		anIntArray319 = null;
		aByteArrayArrayArray30 = null;
		aClass11_15 = null;
		anIntArray318 = null;
		aByteArrayArray10 = null;
		aClass60Array1 = null;
		anIntArray317 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIII)V")
	public static void method1426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static10.anInt372 = -1;
			Static31.anInt1271 = -1;
			return;
		}
		@Pc(30) int local30 = Static42.method1057(arg1, arg2, Static58.anInt1945) - arg0;
		@Pc(38) int local38 = arg1 - Static44.anInt1595;
		@Pc(42) int local42 = local30 - Static57.anInt2682;
		@Pc(46) int local46 = Static35.anIntArray205[Static72.anInt1289];
		@Pc(50) int local50 = Static35.anIntArray200[Static18.anInt805];
		@Pc(54) int local54 = arg2 - Static91.anInt2484;
		@Pc(58) int local58 = Static35.anIntArray205[Static18.anInt805];
		@Pc(62) int local62 = Static35.anIntArray200[Static72.anInt1289];
		@Pc(72) int local72 = local58 * local38 + local50 * local54 >> 16;
		@Pc(82) int local82 = local58 * local54 - local38 * local50 >> 16;
		@Pc(84) int local84 = local72;
		@Pc(95) int local95 = local46 * local42 - local82 * local62 >> 16;
		@Pc(105) int local105 = local46 * local82 + local42 * local62 >> 16;
		if (local105 < 50) {
			Static10.anInt372 = -1;
			Static31.anInt1271 = -1;
		} else {
			Static31.anInt1271 = (local84 << 9) / local105 + 256;
			Static10.anInt372 = (local95 << 9) / local105 + 167;
		}
	}
}
