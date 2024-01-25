import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "[Lclient!on;")
	public static Class146[] aClass146Array1;

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "[I")
	public static final int[] anIntArray160 = new int[50];

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	public static int anInt1574 = 0;

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_24 = new Class93("K", "T", "K", "K");

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "[S")
	public static final short[] aShortArray50 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "[I")
	public static final int[] anIntArray161 = new int[100];

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
	public static int anInt1580 = 0;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public static void method1638() {
		while (true) {
			@Pc(10) Class2_Sub23 local10 = (Class2_Sub23) Static126.aClass216_26.method5999();
			if (local10 == null) {
				return;
			}
			if (Static275.aClass8ArrayArrayArray4 != null) {
				@Pc(31) Class62_Sub1_Sub2 local31;
				@Pc(26) int local26;
				if (local10.anInt2843 < 0) {
					local26 = -local10.anInt2843 - 1;
					if (local26 == Static40.anInt797) {
						local31 = Static41.aClass62_Sub1_Sub2_Sub2_2;
					} else {
						local31 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local26];
					}
				} else {
					local26 = local10.anInt2843 - 1;
					local31 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local26];
				}
				if (local31 != null) {
					@Pc(55) Class96 local55 = Static234.method4051(local10.anInt2849);
					@Pc(66) int local66;
					@Pc(69) int local69;
					if (local10.anInt2838 == 1 || local10.anInt2838 == 3) {
						local69 = local55.anInt3120;
						local66 = local55.anInt3135;
					} else {
						local66 = local55.anInt3120;
						local69 = local55.anInt3135;
					}
					@Pc(84) int local84 = (local66 >> 1) + local10.anInt2846;
					@Pc(93) int local93 = (local66 + 1 >> 1) + local10.anInt2846;
					@Pc(100) int local100 = (local69 >> 1) + local10.anInt2848;
					@Pc(109) int local109 = (local69 + 1 >> 1) + local10.anInt2848;
					@Pc(114) Class73 local114 = Static301.aClass73Array31[local31.aByte56];
					@Pc(137) int local137 = local114.method4931(local84, local100) + local114.method4931(local93, local100) + local114.method4931(local84, local109) + local114.method4931(local93, local109) >> 2;
					@Pc(139) Interface9 local139 = null;
					@Pc(144) int local144 = Static166.anIntArray283[local10.anInt2851];
					if (local144 == 0) {
						local139 = (Interface9) Static230.method4018(local31.aByte56, local10.anInt2846, local10.anInt2848);
					} else if (local144 == 1) {
						local139 = (Interface9) Static226.method3034(local31.aByte56, local10.anInt2846, local10.anInt2848);
					} else if (local144 == 2) {
						local139 = (Interface9) Static280.method5066(local31.aByte56, local10.anInt2846, local10.anInt2848, vl.class);
					} else if (local144 == 3) {
						local139 = (Interface9) Static104.method4927(local31.aByte56, local10.anInt2846, local10.anInt2848);
					}
					if (local139 != null) {
						Static37.method861(local10.anInt2848, 0, local10.anInt2846, 0, local10.anInt2847, local31.aByte56, local144, local10.anInt2844 + 1, -1);
						local31.anInterface9_3 = local139;
						local31.anInt5368 = local10.anInt2847 + Static212.anInt4090;
						local31.anInt5361 = local10.anInt2848 * 128 + local69 * 64;
						local31.anInt5363 = local66 * 64 + local10.anInt2846 * 128;
						local31.anInt5371 = local137;
						local31.anInt5364 = local10.anInt2844 + Static212.anInt4090;
						@Pc(268) int local268 = local10.anInt2850;
						@Pc(271) int local271 = local10.anInt2841;
						@Pc(274) int local274 = local10.anInt2837;
						@Pc(283) int local283;
						if (local271 < local268) {
							local283 = local268;
							local268 = local271;
							local271 = local283;
						}
						@Pc(290) int local290 = local10.anInt2842;
						if (local290 < local274) {
							local283 = local274;
							local274 = local290;
							local290 = local283;
						}
						local31.anInt5365 = local10.anInt2846 + local271;
						local31.anInt5362 = local268 + local10.anInt2846;
						local31.anInt5373 = local290 + local10.anInt2848;
						local31.anInt5370 = local274 + local10.anInt2848;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method1639() {
		if (Static160.anIntArray273 != null && Static296.anIntArray435 != null) {
			return;
		}
		Static296.anIntArray435 = new int[256];
		Static160.anIntArray273 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static160.anIntArray273[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static296.anIntArray435[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IIIIIIII)V")
	public static void method1641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg4;
		@Pc(21) int local21 = arg3 - arg4;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local41 + local25 * (1 - local57);
		@Pc(84) int local84 = local29 - local45 * (local57 - 1);
		@Pc(93) int local93 = (1 - local66) * local33 + local49;
		@Pc(102) int local102 = local37 - local53 * (local66 - 1);
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = (local57 - 3) * local45;
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = (local66 - 3) * local53;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg3 - 1);
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = local114 * (local21 - 1);
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(194) int local194;
		@Pc(202) int local202;
		if (Static228.anInt920 <= arg2 && Static307.anInt6214 >= arg2) {
			@Pc(168) int[] local168 = Static146.anIntArrayArray91[arg2];
			local177 = Static24.method734(Static96.anInt2180, arg1 - arg5, Static124.anInt4221);
			local185 = Static24.method734(Static96.anInt2180, arg5 + arg1, Static124.anInt4221);
			local194 = Static24.method734(Static96.anInt2180, arg1 - local16, Static124.anInt4221);
			local202 = Static24.method734(Static96.anInt2180, local16 + arg1, Static124.anInt4221);
			Static205.method3670(arg0, local194, local168, local177);
			Static205.method3670(arg6, local202, local168, local194);
			Static205.method3670(arg0, local185, local168, local202);
		}
		while (local9 > 0) {
			@Pc(229) boolean local229 = local21 >= local9;
			if (local75 < 0) {
				while (local75 < 0) {
					local84 += local140;
					local75 += local122;
					local122 += local110;
					local7++;
					local140 += local110;
				}
			}
			if (local229) {
				if (local93 < 0) {
					while (local93 < 0) {
						local102 += local148;
						local93 += local132;
						local11++;
						local132 += local118;
						local148 += local118;
					}
				}
				if (local102 < 0) {
					local93 += local132;
					local102 += local148;
					local132 += local118;
					local148 += local118;
					local11++;
				}
				local102 += -local138;
				local93 += -local154;
				local154 -= local114;
				local138 -= local114;
			}
			if (local84 < 0) {
				local75 += local122;
				local84 += local140;
				local140 += local110;
				local7++;
				local122 += local110;
			}
			local84 += -local128;
			local75 += -local146;
			local146 -= local106;
			local128 -= local106;
			local9--;
			local177 = arg2 - local9;
			local185 = arg2 + local9;
			if (local185 >= Static228.anInt920 && Static307.anInt6214 >= local177) {
				local194 = Static24.method734(Static96.anInt2180, local7 + arg1, Static124.anInt4221);
				local202 = Static24.method734(Static96.anInt2180, arg1 - local7, Static124.anInt4221);
				if (local229) {
					@Pc(434) int local434 = Static24.method734(Static96.anInt2180, arg1 + local11, Static124.anInt4221);
					@Pc(443) int local443 = Static24.method734(Static96.anInt2180, arg1 - local11, Static124.anInt4221);
					@Pc(454) int[] local454;
					if (Static228.anInt920 <= local177) {
						local454 = Static146.anIntArrayArray91[local177];
						Static205.method3670(arg0, local443, local454, local202);
						Static205.method3670(arg6, local434, local454, local443);
						Static205.method3670(arg0, local194, local454, local434);
					}
					if (local185 <= Static307.anInt6214) {
						local454 = Static146.anIntArrayArray91[local185];
						Static205.method3670(arg0, local443, local454, local202);
						Static205.method3670(arg6, local434, local454, local443);
						Static205.method3670(arg0, local194, local454, local434);
					}
				} else {
					if (Static228.anInt920 <= local177) {
						Static205.method3670(arg0, local194, Static146.anIntArrayArray91[local177], local202);
					}
					if (Static307.anInt6214 >= local185) {
						Static205.method3670(arg0, local194, Static146.anIntArrayArray91[local185], local202);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)V")
	public static void method1642(@OriginalArg(0) int arg0) {
		if (Static300.anIntArray424 == null || Static300.anIntArray424.length < arg0) {
			Static300.anIntArray424 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!on;II)V")
	public static void method1643(@OriginalArg(1) Class146 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte38 == 0) {
			arg0.anInt4442 = arg0.anInt4411;
		} else if (arg0.aByte38 == 1) {
			arg0.anInt4442 = (arg1 - arg0.anInt4468) / 2 + arg0.anInt4411;
		} else if (arg0.aByte38 == 2) {
			arg0.anInt4442 = arg1 - arg0.anInt4411 - arg0.anInt4468;
		} else if (arg0.aByte38 == 3) {
			arg0.anInt4442 = arg1 * arg0.anInt4411 >> 14;
		} else if (arg0.aByte38 == 4) {
			arg0.anInt4442 = (arg0.anInt4411 * arg1 >> 14) + (arg1 - arg0.anInt4468) / 2;
		} else {
			arg0.anInt4442 = arg1 - (arg0.anInt4411 * arg1 >> 14) - arg0.anInt4468;
		}
		if (arg0.aByte39 == 0) {
			arg0.anInt4460 = arg0.anInt4438;
		} else if (arg0.aByte39 == 1) {
			arg0.anInt4460 = (arg2 - arg0.anInt4414) / 2 + arg0.anInt4438;
		} else if (arg0.aByte39 == 2) {
			arg0.anInt4460 = arg2 - arg0.anInt4414 - arg0.anInt4438;
		} else if (arg0.aByte39 == 3) {
			arg0.anInt4460 = arg2 * arg0.anInt4438 >> 14;
		} else if (arg0.aByte39 == 4) {
			arg0.anInt4460 = (arg2 * arg0.anInt4438 >> 14) + (arg2 - arg0.anInt4414) / 2;
		} else {
			arg0.anInt4460 = arg2 - arg0.anInt4414 - (arg2 * arg0.anInt4438 >> 14);
		}
		if (!Static300.aBoolean520 || Static43.method1056(arg0).anInt478 == 0 && arg0.anInt4419 != 0) {
			return;
		}
		if (arg0.anInt4460 < 0) {
			arg0.anInt4460 = 0;
		} else if (arg2 < arg0.anInt4460 + arg0.anInt4414) {
			arg0.anInt4460 = arg2 - arg0.anInt4414;
		}
		if (arg0.anInt4442 < 0) {
			arg0.anInt4442 = 0;
		} else if (arg0.anInt4468 + arg0.anInt4442 > arg1) {
			arg0.anInt4442 = arg1 - arg0.anInt4468;
			return;
		}
	}
}
