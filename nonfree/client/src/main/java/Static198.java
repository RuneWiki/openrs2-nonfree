import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_2;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[Lclient!jk;")
	public static Class80[] aClass80Array2 = new Class80[8];

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static int anInt35 = 0;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt36 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIBII)V")
	public static void method36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(14) int local14 = arg6 - arg5;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg1 - arg5;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local14 * local14;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local25 << 1;
		@Pc(53) int local53 = local29 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg1 << 1;
		@Pc(70) int local70 = local29 * (1 - local61) + local41;
		@Pc(74) int local74 = local21 << 1;
		@Pc(78) int local78 = local33 << 1;
		@Pc(87) int local87 = local25 - local53 * (local61 - 1);
		@Pc(96) int local96 = local37 - local78 * (local74 - 1);
		@Pc(105) int local105 = local57 + local33 * (1 - local74);
		@Pc(109) int local109 = local37 << 2;
		@Pc(113) int local113 = local25 << 2;
		@Pc(117) int local117 = local29 << 2;
		@Pc(121) int local121 = local33 << 2;
		@Pc(125) int local125 = local41 * 3;
		@Pc(131) int local131 = (local61 - 3) * local53;
		@Pc(135) int local135 = local57 * 3;
		@Pc(137) int local137 = local113;
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local117 * (arg1 - 1);
		@Pc(151) int local151 = local121 * (local21 - 1);
		@Pc(155) int[] local155 = Static22.anIntArrayArray3[arg0];
		Static126.method1523(local155, arg2 - local14, arg4, arg2 - arg6);
		@Pc(173) int local173 = (local74 - 3) * local78;
		Static126.method1523(local155, arg2 + local14, arg3, arg2 - local14);
		Static126.method1523(local155, arg6 + arg2, arg4, local14 + arg2);
		while (local9 > 0) {
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local125;
					local125 += local113;
					local87 += local137;
					local7++;
					local137 += local113;
				}
			}
			@Pc(236) boolean local236 = local21 >= local9;
			if (local87 < 0) {
				local70 += local125;
				local7++;
				local87 += local137;
				local125 += local113;
				local137 += local113;
			}
			local70 += -local145;
			local145 -= local117;
			if (local236) {
				if (local105 < 0) {
					while (local105 < 0) {
						local96 += local139;
						local105 += local135;
						local135 += local109;
						local139 += local109;
						local16++;
					}
				}
				if (local96 < 0) {
					local16++;
					local96 += local139;
					local105 += local135;
					local135 += local109;
					local139 += local109;
				}
				local105 += -local151;
				local151 -= local121;
				local96 += -local173;
				local173 -= local121;
			}
			@Pc(335) int local335 = local7 + arg2;
			@Pc(339) int local339 = arg2 - local7;
			local9--;
			@Pc(345) int local345 = arg0 + local9;
			@Pc(350) int local350 = arg0 - local9;
			local87 += -local131;
			local131 -= local117;
			if (local236) {
				@Pc(383) int local383 = local16 + arg2;
				@Pc(388) int local388 = arg2 - local16;
				Static126.method1523(Static22.anIntArrayArray3[local350], local388, arg4, local339);
				Static126.method1523(Static22.anIntArrayArray3[local350], local383, arg3, local388);
				Static126.method1523(Static22.anIntArrayArray3[local350], local335, arg4, local383);
				Static126.method1523(Static22.anIntArrayArray3[local345], local388, arg4, local339);
				Static126.method1523(Static22.anIntArrayArray3[local345], local383, arg3, local388);
				Static126.method1523(Static22.anIntArrayArray3[local345], local335, arg4, local383);
			} else {
				Static126.method1523(Static22.anIntArrayArray3[local350], local335, arg4, local339);
				Static126.method1523(Static22.anIntArrayArray3[local345], local335, arg4, local339);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	public static void method37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class67 local13 = local7.aClass67_1;
		if (local13 != null) {
			local13.anInt2512 = local13.anInt2512 * arg3 / 16;
			local13.anInt2515 = local13.anInt2515 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method40() {
		Static194.aClass135_21.method3317();
		Static281.aClass135_39.method3317();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIILclient!q;I)Lclient!q;")
	public static Class14_Sub6 method42(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class14_Sub6 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg3;
		@Pc(14) Class14_Sub6 local14 = (Class14_Sub6) Static71.aClass135_4.method3316(local8);
		if (local14 == null) {
			@Pc(21) Class14_Sub3 local21 = Static51.method976(Static230.aClass91_73, arg3);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method984(64, 768, -50, -10, -50);
			Static71.aClass135_4.method3321(local8, local14);
		}
		@Pc(43) int local43 = arg4.method4122();
		@Pc(46) int local46 = arg4.method4098();
		@Pc(49) int local49 = arg4.method4102();
		@Pc(52) int local52 = arg4.method4119();
		local14 = local14.method4118(true, true, true);
		if (arg5 != 0) {
			local14.method4115(arg5);
		}
		@Pc(108) int local108;
		if (Static277.aBoolean412) {
			@Pc(153) Class14_Sub6_Sub1 local153 = (Class14_Sub6_Sub1) local14;
			if (arg0 != Static20.method383(local49 + arg2, Static140.anInt3034, local43 + arg1) || arg0 != Static20.method383(local52 + arg2, Static140.anInt3034, arg1 + local46)) {
				for (local108 = 0; local108 < local153.anInt3103; local108++) {
					local153.anIntArray288[local108] += Static20.method383(local153.anIntArray284[local108] + arg2, Static140.anInt3034, arg1 + local153.anIntArray287[local108]) - arg0;
				}
				local153.aClass127_1.aBoolean309 = false;
				local153.aClass35_1.aBoolean89 = false;
			}
		} else {
			@Pc(77) Class14_Sub6_Sub2 local77 = (Class14_Sub6_Sub2) local14;
			if (Static20.method383(arg2 + local49, Static140.anInt3034, local43 + arg1) != arg0 || Static20.method383(arg2 + local52, Static140.anInt3034, arg1 + local46) != arg0) {
				for (local108 = 0; local108 < local77.anInt5291; local108++) {
					local77.anIntArray475[local108] += Static20.method383(local77.anIntArray466[local108] + arg2, Static140.anInt3034, local77.anIntArray473[local108] + arg1) - arg0;
				}
				local77.aBoolean395 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I")
	public static int method43(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
