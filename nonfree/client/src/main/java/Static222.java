import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!og", name = "L", descriptor = "I")
	public static int anInt4388;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "I")
	public static int anInt4391;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "[I")
	public static final int[] anIntArray560 = new int[] { 0, 0, 0, -2, 0, 0, 15, 0, 15, 8, -1, 2, 0, 0, 10, 0, 6, 0, 0, 12, 0, 20, 7, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 0, 6, 14, 0, 0, 0, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 12, 0, -1, 0, 0, 0, 3, -1, 0, 2, 0, 0, 0, 0, 0, 6, 0, 0, 1, 5, 0, 7, 8, 0, 0, 0, 0, 0, 0, 0, 8, 8, 0, 8, 6, 0, 8, 0, 0, 0, 2, -2, 0, 0, 6, 3, 0, 0, 0, -2, -1, 0, 1, 0, 6, 0, -2, -1, -1, 0, -2, 0, 8, 0, 6, 0, 0, 0, 0, 3, 7, 0, 4, 0, 12, 0, 0, 0, 0, 0, 0, 3, 0, 3, 5, 0, 12, 0, 8, 0, 0, 2, 7, 0, 1, 0, 0, 0, -2, 0, 5, 0, 2, 6, 28, -2, 0, 0, -1, 0, 8, 10, 0, 0, 6, 5, 0, -1, 0, -2, 0, 0, 0, 0, 2, 4, 0, -2, 17, 0, 0, -2, 9, -1, 4, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 6, 0, 4, -2, -1, 1, -2, 0, 0, 0, 0, 0, 14, 0, 0, 0, 6, 0, -1, 11, 3, 0, 0, 0, 0, 0, 0, -2, -1, 6, 0, -1, -1, 0, 0, 0, 0, 0, 0, 2, 0, 3, 12, 0, 0, 0, 0, -1, 0, 10 };

	@OriginalMember(owner = "client!og", name = "N", descriptor = "[I")
	public static final int[] anIntArray561 = new int[100];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZIIBIIIII)Z")
	public static boolean method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(32) int local32 = Static61.method1285(Static314.anIntArray757, arg8, Static24.aClass91Array1[Static285.anInt5511], arg4, arg1, arg2, Static130.aClass5_Sub3_Sub3_Sub1_1.method4541(), Static92.anIntArray223, arg3, arg9, arg6, arg7, arg5, arg0);
		if (local32 < 1) {
			return false;
		}
		Static94.anInt1845 = Static92.anIntArray223[local32 - 1];
		Static152.anInt3053 = Static314.anIntArray757[local32 - 1];
		Static307.aBoolean518 = false;
		Static198.method3728();
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!ql;IILclient!sk;ILclient!ke;)V")
	public static void method4056(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub3_Sub3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class188 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5_Sub3_Sub3_Sub1 arg6) {
		@Pc(7) Class1_Sub36 local7 = new Class1_Sub36();
		local7.anInt5652 = arg2;
		local7.anInt5655 = arg5 * 128;
		local7.anInt5637 = arg0 * 128;
		if (arg4 != null) {
			local7.aClass188_1 = arg4;
			@Pc(40) int local40 = arg4.anInt5541;
			@Pc(43) int local43 = arg4.anInt5533;
			if (arg3 == 1 || arg3 == 3) {
				local43 = arg4.anInt5541;
				local40 = arg4.anInt5533;
			}
			local7.anInt5653 = arg4.anInt5526;
			local7.anInt5643 = arg4.anInt5534;
			local7.anIntArray713 = arg4.anIntArray693;
			local7.anInt5644 = arg4.anInt5536 * 128;
			local7.anInt5648 = (arg0 + local43) * 128;
			local7.anInt5650 = arg4.anInt5551;
			local7.anInt5638 = arg4.anInt5525;
			local7.anInt5649 = (arg5 + local40) * 128;
			if (arg4.anIntArray697 != null) {
				local7.aBoolean494 = true;
				local7.method4956();
			}
			if (local7.anIntArray713 != null) {
				local7.anInt5636 = (int) (Math.random() * (double) (local7.anInt5653 - local7.anInt5643)) + local7.anInt5643;
			}
			Static233.aClass195_41.method5018(local7);
		} else if (arg1 != null) {
			local7.aClass5_Sub3_Sub3_Sub2_1 = arg1;
			@Pc(139) Class122 local139 = arg1.aClass122_1;
			if (local139.anIntArray451 != null) {
				local7.aBoolean494 = true;
				local139 = local139.method3573();
			}
			if (local139 != null) {
				local7.anInt5649 = (arg5 + local139.anInt3819) * 128;
				local7.anInt5648 = (arg0 + local139.anInt3819) * 128;
				local7.anInt5650 = Static73.method1436(arg1);
				local7.anInt5644 = local139.anInt3807 * 128;
				local7.anInt5638 = local139.anInt3828;
			}
			Static193.aClass195_38.method5018(local7);
		} else if (arg6 != null) {
			local7.aClass5_Sub3_Sub3_Sub1_2 = arg6;
			local7.anInt5649 = (arg5 + arg6.method4541()) * 128;
			local7.anInt5648 = (arg0 + arg6.method4541()) * 128;
			local7.anInt5650 = Static223.method4084(arg6);
			local7.anInt5644 = arg6.anInt3299 * 128;
			local7.anInt5638 = arg6.anInt3332;
			Static130.aClass26_18.method877((long) arg6.anInt4920, local7);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZII)V")
	public static void method4057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg2 << 1) - 3);
		@Pc(76) int local76 = local54;
		@Pc(82) int local82 = (arg2 - 1) * local50;
		Static97.method1784(arg3 - arg0, Static327.anIntArrayArray63[arg4], arg1, arg0 + arg3);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local46 += local76;
					local37 += local62;
					local62 += local54;
					local7++;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local37 += local62;
				local46 += local76;
				local7++;
				local76 += local54;
				local62 += local54;
			}
			local37 += -local82;
			local46 += -local70;
			local9--;
			local82 -= local50;
			local70 -= local50;
			@Pc(168) int local168 = arg4 - local9;
			@Pc(173) int local173 = arg4 + local9;
			@Pc(178) int local178 = arg3 + local7;
			@Pc(182) int local182 = arg3 - local7;
			Static97.method1784(local182, Static327.anIntArrayArray63[local168], arg1, local178);
			Static97.method1784(local182, Static327.anIntArrayArray63[local173], arg1, local178);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4058(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub7 local8 = new Class1_Sub7(arg0);
		@Pc(12) int local12 = local8.method3141();
		@Pc(21) int local21 = local8.method3125();
		if (local21 < 0 || Static288.anInt6183 != 0 && local21 > Static288.anInt6183) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(93) byte[] local93 = new byte[local21];
			local8.method3139(local93, local21);
			return local93;
		} else {
			@Pc(48) int local48 = local8.method3125();
			if (local48 < 0 || Static288.anInt6183 != 0 && local48 > Static288.anInt6183) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local48];
			if (local12 == 1) {
				Static289.method4937(local69, local48, arg0, local21);
			} else {
				Static132.aClass137_1.method3748(local8, local69);
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZI)V")
	public static void method4059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static258.anInt5029 == 0) {
			Static317.method5332(false);
		} else {
			Static139.anInt2757 = Static258.anInt5029;
			Static263.method4608(0);
		}
		Static176.aBoolean308 = arg3;
		Static243.anInt4737 = arg2;
		Static33.anInt806 = arg1;
		Static342.method1975(arg0);
	}
}
