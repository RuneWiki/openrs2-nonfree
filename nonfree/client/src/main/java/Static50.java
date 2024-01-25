import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public static int anInt1271;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "[Lclient!ui;")
	public static Class36[] aClass36Array3;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public static int anInt1273;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public static int anInt1268 = 0;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "J")
	public static volatile long aLong46 = 0L;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_45 = new Class18(63, -1);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!ct;)V")
	public static void method1204(@OriginalArg(1) Class30 arg0) {
		Static34.aClass30_7 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIILclient!fp;IIIBI[[[BI)V")
	public static void method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class63 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][][] arg10, @OriginalArg(12) int arg11) {
		if (arg7 == 0 || arg8 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg1 = arg1 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg1 = arg1 + 3 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 11) {
			arg1 = arg1 + 3 & 0x3;
			arg7 = 8;
		}
		arg5.method4658(arg4, arg6, arg3, arg0, arg9, arg2, arg10[arg7 - 1][arg1], arg8, arg11);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)Lclient!va;")
	public static Class11_Sub2_Sub6 method1206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class155 local11 = Static105.aClass155ArrayArrayArray3[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class11_Sub2_Sub6 local17 = null;
		@Pc(23) int local23 = -1;
		for (@Pc(26) Class187 local26 = local11.aClass187_2; local26 != null; local26 = local26.aClass187_3) {
			@Pc(30) Class11_Sub2 local30 = local26.aClass11_Sub2_2;
			if (local30 instanceof Class11_Sub2_Sub6) {
				@Pc(36) Class11_Sub2_Sub6 local36 = (Class11_Sub2_Sub6) local30;
				@Pc(46) int local46 = (local36.method5894() - 1) * 64 + 60;
				@Pc(53) int local53 = local36.anInt6729 - local46 >> 7;
				@Pc(61) int local61 = local36.anInt6726 - local46 >> 7;
				@Pc(68) int local68 = local36.anInt6729 + local46 >> 7;
				@Pc(75) int local75 = local46 + local36.anInt6726 >> 7;
				if (arg2 >= local53 && arg1 >= local61 && local68 >= arg2 && arg1 <= local75) {
					@Pc(108) int local108 = (local75 + 1 - arg1) * (local68 + 1 - arg2);
					if (local23 < local108) {
						local23 = local108;
						local17 = local36;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBII)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg2 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (Static131.anInt2843 <= arg4 && Static38.anInt945 >= arg4) {
			local95 = Static11.method912(arg0 + arg3, Static122.anInt1360, Static93.anInt5014);
			local104 = Static11.method912(arg3 - arg0, Static122.anInt1360, Static93.anInt5014);
			Static367.method6081(arg1, local104, Static43.anIntArrayArray57[arg4], local95);
		}
		@Pc(118) int local118 = (arg2 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local77 += local55;
					local63 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local77 += local55;
				local63 += local55;
				local7++;
			}
			local47 += -local71;
			local38 += -local118;
			local118 -= local51;
			local71 -= local51;
			local9--;
			local95 = arg4 - local9;
			local104 = arg4 + local9;
			if (Static131.anInt2843 <= local104 && local95 <= Static38.anInt945) {
				@Pc(206) int local206 = Static11.method912(local7 + arg3, Static122.anInt1360, Static93.anInt5014);
				@Pc(215) int local215 = Static11.method912(arg3 - local7, Static122.anInt1360, Static93.anInt5014);
				if (local95 >= Static131.anInt2843) {
					Static367.method6081(arg1, local215, Static43.anIntArrayArray57[local95], local206);
				}
				if (Static38.anInt945 >= local104) {
					Static367.method6081(arg1, local215, Static43.anIntArrayArray57[local104], local206);
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public static void method1208() {
		for (@Pc(1) int local1 = 0; local1 < Static159.anInt3269; local1++) {
			@Pc(6) Class11_Sub2 local6 = Static144.aClass11_Sub2Array1[local1];
			Static311.method5134(local6);
			Static144.aClass11_Sub2Array1[local1] = null;
		}
		Static159.anInt3269 = 0;
	}
}
