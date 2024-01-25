import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!sb;")
	public static Class219 aClass219_4;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_157 = new Class12(10, 8);

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_220 = new Class103(48, 11);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[SII[Ljava/lang/String;)V")
	public static void method4850(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg1) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) String local21 = arg3[local15];
		arg3[local15] = arg3[arg1];
		arg3[arg1] = local21;
		@Pc(35) short local35 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local35;
		for (@Pc(47) int local47 = arg2; local47 < arg1; local47++) {
			if (local21 == null || arg3[local47] != null && (local47 & 0x1) > arg3[local47].compareTo(local21)) {
				@Pc(68) String local68 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17] = local68;
				@Pc(82) short local82 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17++] = local82;
			}
		}
		arg3[arg1] = arg3[local17];
		arg3[local17] = local21;
		arg0[arg1] = arg0[local17];
		arg0[local17] = local35;
		method4850(arg0, local17 - 1, arg2, arg3);
		method4850(arg0, arg1, local17 + 1, arg3);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg0;
		@Pc(21) int local21 = arg6 - arg0;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = (1 - local57) * local25 + local41;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(87) int local87 = local49 + (1 - local61) * local33;
		@Pc(96) int local96 = local37 - local53 * (local61 - 1);
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = local45 * (local57 - 3);
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = local53 * (local61 - 3);
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = (arg6 - 1) * local100;
		@Pc(146) int local146 = local112;
		@Pc(152) int local152 = (local21 - 1) * local108;
		@Pc(156) int[] local156 = Static67.anIntArrayArray13[arg1];
		Static2.method38(arg2 - local16, arg3, local156, arg2 - arg5);
		Static2.method38(local16 + arg2, arg4, local156, arg2 - local16);
		Static2.method38(arg2 + arg5, arg3, local156, arg2 + local16);
		while (local9 > 0) {
			@Pc(206) boolean local206 = local21 >= local9;
			if (local206) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local126;
						local96 += local146;
						local11++;
						local126 += local112;
						local146 += local112;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local146;
					local146 += local112;
					local11++;
					local126 += local112;
				}
				local96 += -local132;
				local87 += -local152;
				local152 -= local108;
				local132 -= local108;
			}
			if (local71 < 0) {
				while (local71 < 0) {
					local79 += local134;
					local71 += local116;
					local134 += local104;
					local7++;
					local116 += local104;
				}
			}
			if (local79 < 0) {
				local79 += local134;
				local71 += local116;
				local116 += local104;
				local7++;
				local134 += local104;
			}
			local79 += -local122;
			local71 += -local140;
			local122 -= local100;
			local140 -= local100;
			local9--;
			@Pc(343) int local343 = arg1 - local9;
			@Pc(347) int local347 = local9 + arg1;
			@Pc(351) int local351 = arg2 + local7;
			@Pc(356) int local356 = arg2 - local7;
			if (local206) {
				@Pc(362) int local362 = arg2 + local11;
				@Pc(367) int local367 = arg2 - local11;
				Static2.method38(local367, arg3, Static67.anIntArrayArray13[local343], local356);
				Static2.method38(local362, arg4, Static67.anIntArrayArray13[local343], local367);
				Static2.method38(local351, arg3, Static67.anIntArrayArray13[local343], local362);
				Static2.method38(local367, arg3, Static67.anIntArrayArray13[local347], local356);
				Static2.method38(local362, arg4, Static67.anIntArrayArray13[local347], local367);
				Static2.method38(local351, arg3, Static67.anIntArrayArray13[local347], local362);
			} else {
				Static2.method38(local351, arg3, Static67.anIntArrayArray13[local343], local356);
				Static2.method38(local351, arg3, Static67.anIntArrayArray13[local347], local356);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)V")
	public static void method4852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static69.method1137(arg1)) {
			Static260.method1929(arg0, Static87.aClass124ArrayArray7[arg1]);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lclient!u;")
	public static Class147_Sub1 method4853(@OriginalArg(0) int arg0) {
		return Static340.aBoolean663 && arg0 >= Static446.anInt7393 && arg0 <= Static140.anInt2486 ? Static222.aClass147_Sub1Array2[arg0 - Static446.anInt7393] : null;
	}
}
