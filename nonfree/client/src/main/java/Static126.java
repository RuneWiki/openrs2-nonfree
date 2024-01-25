import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
	public static int anInt3127 = -1;

	@OriginalMember(owner = "client!efa", name = "v", descriptor = "Lclient!qia;")
	public static Class279 aClass279_1 = new Class279();

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
	public static int anInt3133 = 0;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IBIII)V")
	public static void method2626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg3 < arg2) {
			for (local18 = arg3; local18 < arg2; local18++) {
				Static173.anIntArrayArray15[local18][arg0] = arg1;
			}
		} else {
			for (local18 = arg2; local18 < arg3; local18++) {
				Static173.anIntArrayArray15[local18][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IILclient!ka;II)Lclient!oia;")
	public static Class243 method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) int arg3) {
		return arg2 == null ? null : new Class243(arg1, arg0, arg3, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg1;
		@Pc(21) int local21 = arg3 - arg1;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local49 + local33 * (1 - local61);
		@Pc(96) int local96 = local37 - (local61 - 1) * local53;
		@Pc(105) int local105 = local25 << 2;
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local41 * 3;
		@Pc(127) int local127 = (local57 - 3) * local45;
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = local53 * (local61 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg3 - 1) * local105;
		@Pc(147) int local147 = local117;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(190) int local190;
		@Pc(198) int local198;
		if (Static633.anInt10644 <= arg0 && Static389.anInt7300 >= arg0) {
			@Pc(165) int[] local165 = Static173.anIntArrayArray15[arg0];
			local174 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 - arg5);
			local182 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 + arg5);
			local190 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 - local16);
			local198 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 + local16);
			Static571.method7990(arg4, local165, local174, local190);
			Static571.method7990(arg6, local165, local190, local198);
			Static571.method7990(arg4, local165, local198, local182);
		}
		@Pc(222) int local222 = local113 * (local21 - 1);
		while (local9 > 0) {
			@Pc(231) boolean local231 = local21 >= local9;
			if (local71 < 0) {
				while (local71 < 0) {
					local71 += local121;
					local79 += local139;
					local139 += local109;
					local121 += local109;
					local7++;
				}
			}
			if (local231) {
				if (local88 < 0) {
					while (local88 < 0) {
						local96 += local147;
						local88 += local131;
						local11++;
						local131 += local117;
						local147 += local117;
					}
				}
				if (local96 < 0) {
					local88 += local131;
					local96 += local147;
					local131 += local117;
					local147 += local117;
					local11++;
				}
				local88 += -local222;
				local96 += -local137;
				local222 -= local113;
				local137 -= local113;
			}
			if (local79 < 0) {
				local71 += local121;
				local79 += local139;
				local139 += local109;
				local7++;
				local121 += local109;
			}
			local71 += -local145;
			local79 += -local127;
			local145 -= local105;
			local127 -= local105;
			local9--;
			local174 = arg0 - local9;
			local182 = local9 + arg0;
			if (local182 >= Static633.anInt10644 && Static389.anInt7300 >= local174) {
				local190 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 + local7);
				local198 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 - local7);
				if (local231) {
					@Pc(413) int local413 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 + local11);
					@Pc(422) int local422 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 - local11);
					@Pc(433) int[] local433;
					if (Static633.anInt10644 <= local174) {
						local433 = Static173.anIntArrayArray15[local174];
						Static571.method7990(arg4, local433, local198, local422);
						Static571.method7990(arg6, local433, local422, local413);
						Static571.method7990(arg4, local433, local413, local190);
					}
					if (Static389.anInt7300 >= local182) {
						local433 = Static173.anIntArrayArray15[local182];
						Static571.method7990(arg4, local433, local198, local422);
						Static571.method7990(arg6, local433, local422, local413);
						Static571.method7990(arg4, local433, local413, local190);
					}
				} else {
					if (local174 >= Static633.anInt10644) {
						Static571.method7990(arg4, Static173.anIntArrayArray15[local174], local198, local190);
					}
					if (Static389.anInt7300 >= local182) {
						Static571.method7990(arg4, Static173.anIntArrayArray15[local182], local198, local190);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IB)I")
	public static int method2629(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)[Lclient!hda;")
	public static Class129[] method2631() {
		return new Class129[] { Static180.aClass129_5, Static98.aClass129_4, Static264.aClass129_6, Static540.aClass129_9, Static622.aClass129_10, Static493.aClass129_7, Static17.aClass129_2, Static535.aClass129_8, Static8.aClass129_1, Static40.aClass129_3 };
	}
}
