import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
	public static int anInt6836;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Lclient!kea;")
	public static Class161 aClass161_83;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
	public static int anInt6835 = 0;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I[Lclient!qf;I)V")
	public static void method5731(@OriginalArg(0) int arg0, @OriginalArg(1) Class245[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class245 local17 = arg1[local11];
			if (local17 != null && local17.anInt7238 == arg0 && !Static63.method1297(local17)) {
				if (local17.anInt7223 == 0) {
					method5731(local17.anInt7256, arg1);
					if (local17.aClass245Array2 != null) {
						method5731(local17.anInt7256, local17.aClass245Array2);
					}
					@Pc(58) Class3_Sub29 local58 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local17.anInt7256);
					if (local58 != null) {
						Static323.method5179(local58.anInt5522);
					}
				}
				if (local17.anInt7223 == 6 && local17.anInt7245 != -1) {
					@Pc(78) Class122 local78 = Static46.aClass247_1.method6029(local17.anInt7245);
					if (local78 != null) {
						local17.anInt7291 += Static276.anInt5695;
						while (local78.anIntArray394[local17.anInt7233] < local17.anInt7291) {
							local17.anInt7291 -= local78.anIntArray394[local17.anInt7233];
							local17.anInt7233++;
							if (local17.anInt7233 >= local78.anIntArray396.length) {
								local17.anInt7233 -= local78.anInt4152;
								if (local17.anInt7233 < 0 || local17.anInt7233 >= local78.anIntArray396.length) {
									local17.anInt7233 = 0;
								}
							}
							local17.anInt7250 = local17.anInt7233 + 1;
							if (local78.anIntArray396.length <= local17.anInt7250) {
								local17.anInt7250 -= local78.anInt4152;
								if (local17.anInt7250 < 0 || local78.anIntArray396.length <= local17.anInt7250) {
									local17.anInt7250 = -1;
								}
							}
							Static31.method809(local17);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIZII)V")
	public static void method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(24) Class3_Sub5 local24 = (Class3_Sub5) Static430.aClass267_45.method6644(local14);
		if (local24 == null) {
			local24 = new Class3_Sub5();
			Static430.aClass267_45.method6640(local24, local14);
		}
		if (local24.anIntArray120.length <= arg4) {
			@Pc(45) int[] local45 = new int[arg4 + 1];
			@Pc(50) int[] local50 = new int[arg4 + 1];
			for (@Pc(52) int local52 = 0; local52 < local24.anIntArray120.length; local52++) {
				local45[local52] = local24.anIntArray120[local52];
				local50[local52] = local24.anIntArray117[local52];
			}
			for (@Pc(82) int local82 = local24.anIntArray120.length; local82 < arg4; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local24.anIntArray117 = local50;
			local24.anIntArray120 = local45;
		}
		local24.anIntArray120[arg4] = arg3;
		local24.anIntArray117[arg4] = arg1;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!eba;IILclient!eba;Z)I")
	public static int method5733(@OriginalArg(0) Class68_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class68_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local9 = arg0.anInt2092;
			local12 = arg2.anInt2092;
			if (!arg3) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg1 == 2) {
			return Static407.method6161(Static193.anInt7803, arg2.method1976().aString84, arg0.method1976().aString84);
		} else if (arg1 == 3) {
			if (arg0.aString23.equals("-")) {
				if (arg2.aString23.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString23.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static407.method6161(Static193.anInt7803, arg2.aString23, arg0.aString23);
			}
		} else if (arg1 == 4) {
			if (arg0.method1972()) {
				return arg2.method1972() ? 0 : 1;
			} else if (arg2.method1972()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg0.method1967()) {
				return arg2.method1967() ? 0 : 1;
			} else if (arg2.method1967()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg0.method1970()) {
				return arg2.method1970() ? 0 : 1;
			} else if (arg2.method1970()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg0.method1969()) {
				return arg2.method1969() ? 0 : 1;
			} else if (arg2.method1969()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local9 = arg0.anInt2098;
			local12 = arg2.anInt2098;
			if (arg3) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg0.anInt2093 - arg2.anInt2093;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!eca;I)V")
	public static void method5734(@OriginalArg(0) Class6_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class3_Sub16 local11 = (Class3_Sub16) Static25.aClass267_1.method6644((long) arg0.anInt8587);
		if (local11 == null) {
			return;
		}
		if (local11.aClass3_Sub9_Sub2_2 != null) {
			Static530.aClass3_Sub9_Sub3_2.method5653(local11.aClass3_Sub9_Sub2_2);
			local11.aClass3_Sub9_Sub2_2 = null;
		}
		local11.method7820();
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
	public static void method5735(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub10_Sub18 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class52 local8 = Static163.aClass52Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static108.anInt2385; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static126.anInt2626; local15++) {
						local1 = local8.c(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static33.anInt880;
							@Pc(32) int local32 = local12 << Static33.anInt880;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class52 local41 = Static163.aClass52Array4[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.JA(local15, local12) - local41.JA(local15, local12);
									@Pc(67) int local67 = local8.JA(local15 + 1, local12) - local41.JA(local15 + 1, local12);
									@Pc(85) int local85 = local8.JA(local15 + 1, local12 + 1) - local41.JA(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.JA(local15, local12 + 1) - local41.JA(local15, local12 + 1);
									local41.aa(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
