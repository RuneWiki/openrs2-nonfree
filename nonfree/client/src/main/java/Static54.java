import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
	public static int anInt1152;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_388 = Static161.method2452("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_8 = new Class91();

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_389 = Static161.method2452("No reply from loginserver)3");

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "Lclient!dc;")
	public static Class20 aClass20_390 = aClass20_389;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIIIIII[III[B)V")
	public static void method939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(23) int local23 = ((arg4 & 0xFF00FF) * arg0 & 0xFF00FF00) + (arg0 * (arg4 & 0xFF00) & 0xFF0000) >> 8;
		@Pc(28) int local28 = 256 - arg0;
		for (@Pc(31) int local31 = -arg7; local31 < 0; local31++) {
			for (@Pc(51) int local51 = -arg3; local51 < 0; local51++) {
				if (arg9[arg5++] == 0) {
					arg2++;
				} else {
					@Pc(65) int local65 = arg6[arg2];
					arg6[arg2++] = ((local28 * (local65 & 0xFF00) & 0xFF0000) + (local28 * (local65 & 0xFF00FF) & 0xFF00FF00) >> 8) + local23;
				}
			}
			arg5 += arg8;
			arg2 += arg1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[Lclient!mf;I)V")
	public static void method940(@OriginalArg(1) Class69[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class69 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt2474 == 0) {
					if (local9.aClass69Array2 != null) {
						method940(local9.aClass69Array2, arg1);
					}
					@Pc(33) Class5_Sub25 local33 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local9.anInt2523);
					if (local33 != null) {
						Static125.method1962(local33.anInt3526, arg1);
					}
				}
				@Pc(49) Class5_Sub10 local49;
				if (arg1 == 0 && local9.anObjectArray28 != null) {
					local49 = new Class5_Sub10();
					local49.aClass69_3 = local9;
					local49.anObjectArray3 = local9.anObjectArray28;
					Static184.method2781(local49);
				}
				if (arg1 == 1 && local9.anObjectArray8 != null) {
					if (local9.anInt2475 >= 0) {
						@Pc(73) Class69 local73 = Static157.method2392(local9.anInt2523);
						if (local73 == null || local73.aClass69Array2 == null || local9.anInt2475 >= local73.aClass69Array2.length || local73.aClass69Array2[local9.anInt2475] != local9) {
							continue;
						}
					}
					local49 = new Class5_Sub10();
					local49.anObjectArray3 = local9.anObjectArray8;
					local49.aClass69_3 = local9;
					Static184.method2781(local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([Lclient!mf;II)V")
	public static void method941(@OriginalArg(0) Class69[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class69 local17 = arg0[local11];
			if (local17 != null && arg1 == local17.anInt2498 && (!local17.aBoolean103 || !Static23.method326(local17))) {
				if (local17.anInt2474 == 0) {
					if (!local17.aBoolean103 && Static23.method326(local17) && Static86.aClass69_6 != local17) {
						continue;
					}
					method941(arg0, local17.anInt2523);
					if (local17.aClass69Array2 != null) {
						method941(local17.aClass69Array2, local17.anInt2523);
					}
					@Pc(69) Class5_Sub25 local69 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local17.anInt2523);
					if (local69 != null) {
						Static183.method2776(local69.anInt3526);
					}
				}
				if (local17.anInt2474 == 6) {
					@Pc(99) int local99;
					if (local17.anInt2476 != -1 || local17.anInt2535 != -1) {
						@Pc(94) boolean local94 = Static140.method2176(local17);
						if (local94) {
							local99 = local17.anInt2535;
						} else {
							local99 = local17.anInt2476;
						}
						if (local99 != -1) {
							@Pc(111) Class5_Sub2_Sub22 local111 = Static14.method253(local99);
							if (local111 != null) {
								local17.anInt2482 += Static176.anInt3529;
								while (local111.anIntArray375[local17.anInt2525] < local17.anInt2482) {
									local17.anInt2482 -= local111.anIntArray375[local17.anInt2525];
									local17.anInt2525++;
									if (local17.anInt2525 >= local111.anIntArray374.length) {
										local17.anInt2525 -= local111.anInt3657;
										if (local17.anInt2525 < 0 || local111.anIntArray374.length <= local17.anInt2525) {
											local17.anInt2525 = 0;
										}
									}
									Static184.method2779(local17);
								}
							}
						}
					}
					if (local17.anInt2519 != 0 && !local17.aBoolean103) {
						@Pc(187) int local187 = local17.anInt2519 >> 16;
						@Pc(191) int local191 = local187 * Static176.anInt3529;
						local17.anInt2529 = local191 + local17.anInt2529 & 0x7FF;
						local99 = local17.anInt2519 << 16 >> 16;
						local99 *= Static176.anInt3529;
						local17.anInt2531 = local99 + local17.anInt2531 & 0x7FF;
						Static184.method2779(local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static void method942(@OriginalArg(1) int arg0) {
		Static184.anInt3696 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIZZZ)Lclient!dj;")
	public static Class23_Sub1 method943(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class17 local7 = null;
		if (Static36.aClass34_3 != null) {
			local7 = new Class17(arg0, Static36.aClass34_3, Static152.aClass34Array3[arg0], 1000000);
		}
		return new Class23_Sub1(local7, Static144.aClass17_4, arg0, arg3, arg2, arg1);
	}
}
