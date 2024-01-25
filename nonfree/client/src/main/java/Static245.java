import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString41 = "";

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_8 = new Class101(9, 0, 4, 1);

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "Lclient!rca;")
	public static final Class283 aClass283_3 = new Class283("WIP", 2);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!sp;)Z")
	public static boolean method3670(@OriginalArg(1) Class310 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean622) {
			return false;
		} else if (!arg0.method6534(Static226.anInterface16_2)) {
			return false;
		} else if (Static321.aClass187_22.method3797((long) arg0.anInt8106) == null) {
			return Static25.aClass187_5.method3797((long) arg0.anInt8130) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg0;
		@Pc(21) int local21 = arg2 - arg0;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(53) int local53 = local37 << 1;
		@Pc(57) int local57 = local33 << 1;
		@Pc(61) int local61 = arg2 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(74) int local74 = local41 + local25 * (1 - local61);
		@Pc(82) int local82 = local29 - (local61 - 1) * local45;
		@Pc(92) int local92 = (1 - local65) * local33 + local53;
		@Pc(101) int local101 = local37 - local57 * (local65 - 1);
		@Pc(105) int local105 = local25 << 2;
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local41 * 3;
		@Pc(127) int local127 = (local61 - 3) * local45;
		@Pc(131) int local131 = local53 * 3;
		@Pc(137) int local137 = local57 * (local65 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg2 - 1) * local105;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (local21 - 1) * local113;
		@Pc(180) int local180;
		@Pc(190) int local190;
		@Pc(201) int local201;
		@Pc(210) int local210;
		if (arg5 >= Static514.anInt8722 && arg5 <= Static451.anInt7775) {
			@Pc(171) int[] local171 = Static171.anIntArrayArray79[arg5];
			local180 = Static176.method2504(arg1 - arg4, Static162.anInt2935, Static270.anInt4759);
			local190 = Static176.method2504(arg4 + arg1, Static162.anInt2935, Static270.anInt4759);
			local201 = Static176.method2504(arg1 - local16, Static162.anInt2935, Static270.anInt4759);
			local210 = Static176.method2504(arg1 + local16, Static162.anInt2935, Static270.anInt4759);
			Static433.method6039(arg3, local201, local171, local180);
			Static433.method6039(arg6, local210, local171, local201);
			Static433.method6039(arg3, local190, local171, local210);
		}
		while (local9 > 0) {
			@Pc(241) boolean local241 = local21 >= local9;
			if (local241) {
				if (local92 < 0) {
					while (local92 < 0) {
						local101 += local147;
						local92 += local131;
						local11++;
						local131 += local117;
						local147 += local117;
					}
				}
				if (local101 < 0) {
					local92 += local131;
					local101 += local147;
					local147 += local117;
					local11++;
					local131 += local117;
				}
				local101 += -local137;
				local92 += -local153;
				local153 -= local113;
				local137 -= local113;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local82 += local139;
					local74 += local121;
					local121 += local109;
					local139 += local109;
					local7++;
				}
			}
			if (local82 < 0) {
				local82 += local139;
				local74 += local121;
				local121 += local109;
				local7++;
				local139 += local109;
			}
			local82 += -local127;
			local74 += -local145;
			local9--;
			local145 -= local105;
			local127 -= local105;
			local180 = arg5 - local9;
			local190 = arg5 + local9;
			if (local190 >= Static514.anInt8722 && local180 <= Static451.anInt7775) {
				local201 = Static176.method2504(arg1 + local7, Static162.anInt2935, Static270.anInt4759);
				local210 = Static176.method2504(arg1 - local7, Static162.anInt2935, Static270.anInt4759);
				if (local241) {
					@Pc(419) int local419 = Static176.method2504(arg1 + local11, Static162.anInt2935, Static270.anInt4759);
					@Pc(428) int local428 = Static176.method2504(arg1 - local11, Static162.anInt2935, Static270.anInt4759);
					@Pc(439) int[] local439;
					if (Static514.anInt8722 <= local180) {
						local439 = Static171.anIntArrayArray79[local180];
						Static433.method6039(arg3, local428, local439, local210);
						Static433.method6039(arg6, local419, local439, local428);
						Static433.method6039(arg3, local201, local439, local419);
					}
					if (Static451.anInt7775 >= local190) {
						local439 = Static171.anIntArrayArray79[local190];
						Static433.method6039(arg3, local428, local439, local210);
						Static433.method6039(arg6, local419, local439, local428);
						Static433.method6039(arg3, local201, local439, local419);
					}
				} else {
					if (Static514.anInt8722 <= local180) {
						Static433.method6039(arg3, local201, Static171.anIntArrayArray79[local180], local210);
					}
					if (Static451.anInt7775 >= local190) {
						Static433.method6039(arg3, local201, Static171.anIntArrayArray79[local190], local210);
					}
				}
			}
		}
	}
}
