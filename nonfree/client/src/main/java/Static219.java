import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_141 = new Class179(128, 1);

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3185(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg0.indexOf(arg1); local9 != -1; local9 = arg0.indexOf(arg1, local9 + arg2.length())) {
			arg0 = arg0.substring(0, local9) + arg2 + arg0.substring(arg1.length() + local9);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 + arg6 > arg7 && arg7 + arg0 > arg5) {
			return arg1 < arg3 + arg2 && arg4 + arg1 > arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)Z")
	public static boolean method3188() {
		if (Static301.aBoolean334) {
			try {
				Static683.method5174(Static180.anApplet6, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIIZIII)V")
	public static void method3189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg6;
		@Pc(21) int local21 = arg3 - arg6;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
		@Pc(96) int local96 = local37 - (local61 - 1) * local53;
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(120) int local120 = local41 * 3;
		@Pc(126) int local126 = (local57 - 3) * local45;
		@Pc(130) int local130 = local49 * 3;
		@Pc(136) int local136 = local53 * (local61 - 3);
		@Pc(138) int local138 = local104;
		@Pc(144) int local144 = local100 * (arg3 - 1);
		@Pc(146) int local146 = local112;
		@Pc(165) int local165;
		@Pc(173) int local173;
		@Pc(181) int local181;
		@Pc(189) int local189;
		if (Static55.anInt4238 <= arg2 && Static292.anInt4921 >= arg2) {
			@Pc(156) int[] local156 = Static173.anIntArrayArray15[arg2];
			local165 = Static154.method2176(arg5 - arg1, Static153.anInt2554, Static502.anInt8456);
			local173 = Static154.method2176(arg1 + arg5, Static153.anInt2554, Static502.anInt8456);
			local181 = Static154.method2176(arg5 - local16, Static153.anInt2554, Static502.anInt8456);
			local189 = Static154.method2176(local16 + arg5, Static153.anInt2554, Static502.anInt8456);
			Static270.method3998(arg0, local165, local181, local156);
			Static270.method3998(arg4, local181, local189, local156);
			Static270.method3998(arg0, local189, local173, local156);
		}
		@Pc(213) int local213 = local108 * (local21 - 1);
		while (local9 > 0) {
			@Pc(222) boolean local222 = local21 >= local9;
			if (local222) {
				if (local88 < 0) {
					while (local88 < 0) {
						local96 += local146;
						local88 += local130;
						local146 += local112;
						local130 += local112;
						local11++;
					}
				}
				if (local96 < 0) {
					local88 += local130;
					local96 += local146;
					local146 += local112;
					local11++;
					local130 += local112;
				}
				local88 += -local213;
				local96 += -local136;
				local213 -= local108;
				local136 -= local108;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local120;
					local79 += local138;
					local7++;
					local138 += local104;
					local120 += local104;
				}
			}
			if (local79 < 0) {
				local79 += local138;
				local70 += local120;
				local138 += local104;
				local7++;
				local120 += local104;
			}
			local79 += -local126;
			local70 += -local144;
			local126 -= local100;
			local144 -= local100;
			local9--;
			local165 = arg2 - local9;
			local173 = local9 + arg2;
			if (local173 >= Static55.anInt4238 && Static292.anInt4921 >= local165) {
				local181 = Static154.method2176(arg5 + local7, Static153.anInt2554, Static502.anInt8456);
				local189 = Static154.method2176(arg5 - local7, Static153.anInt2554, Static502.anInt8456);
				if (local222) {
					@Pc(397) int local397 = Static154.method2176(local11 + arg5, Static153.anInt2554, Static502.anInt8456);
					@Pc(406) int local406 = Static154.method2176(arg5 - local11, Static153.anInt2554, Static502.anInt8456);
					@Pc(417) int[] local417;
					if (Static55.anInt4238 <= local165) {
						local417 = Static173.anIntArrayArray15[local165];
						Static270.method3998(arg0, local189, local406, local417);
						Static270.method3998(arg4, local406, local397, local417);
						Static270.method3998(arg0, local397, local181, local417);
					}
					if (local173 <= Static292.anInt4921) {
						local417 = Static173.anIntArrayArray15[local173];
						Static270.method3998(arg0, local189, local406, local417);
						Static270.method3998(arg4, local406, local397, local417);
						Static270.method3998(arg0, local397, local181, local417);
					}
				} else {
					if (local165 >= Static55.anInt4238) {
						Static270.method3998(arg0, local189, local181, Static173.anIntArrayArray15[local165]);
					}
					if (Static292.anInt4921 >= local173) {
						Static270.method3998(arg0, local189, local181, Static173.anIntArrayArray15[local173]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(III)Z")
	public static boolean method3190(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static411.method6181(arg0, arg1) | (arg0 & 0x70000) != 0 || Static426.method6548(arg1, arg0);
	}
}
