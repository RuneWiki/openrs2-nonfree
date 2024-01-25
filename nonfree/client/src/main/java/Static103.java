import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_43 = new Class200(96, 3);

	@OriginalMember(owner = "client!dia", name = "m", descriptor = "Lclient!qk;")
	public static final Class290 aClass290_3 = new Class290();

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
	public static void method1952() {
		Static193.aClass332Array2 = null;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIII)V")
	public static void method1953(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static518.anInt8368 != 1) {
			return;
		}
		@Pc(13) int local13 = arg2 / Static456.anInt7437;
		@Pc(17) int local17 = arg1 / Static456.anInt7437;
		@Pc(21) int local21 = arg0 / Static5.anInt108;
		@Pc(25) int local25 = arg3 / Static5.anInt108;
		if (Static294.anInt5311 <= local13 || local17 < 0 || local21 >= Static259.anInt4870 || local25 < 0) {
			return;
		}
		if (local25 >= Static259.anInt4870) {
			local25 = Static259.anInt4870 - 1;
		}
		if (local17 >= Static294.anInt5311) {
			local17 = Static294.anInt5311 - 1;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		for (@Pc(75) int local75 = local21; local75 <= local25; local75++) {
			@Pc(85) int local85 = Static123.method2207(Static173.anInt3502 + local75, Static259.anInt4870) * Static294.anInt5311;
			for (@Pc(87) int local87 = local13; local87 <= local17; local87++) {
				@Pc(97) int local97 = Static123.method2207(Static259.anInt4871 + local87, Static294.anInt5311) + local85;
				Static18.anIntArray38[local97] = Static498.anInt7911;
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IZ)V")
	public static void method1954(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static626.anInt10188 = arg0;
		Static629.aClass16_Sub7Array1 = new Class16_Sub7[Static290.anIntArray332[Static626.anInt10188] + 1];
		Static545.anInt8787 = 0;
		Static141.anInt2982 = 0;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)Lclient!tl;")
	public static Class333 method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass333_1;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIII)V")
	public static void method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg0 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = local51 * (arg0 - 1);
		Static188.method3208(arg1 + arg2, arg4, arg2 - arg1, Static349.anIntArrayArray71[arg3]);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local77 += local55;
					local7++;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local7++;
				local63 += local55;
				local77 += local55;
			}
			local38 += -local83;
			local47 += -local71;
			local71 -= local51;
			local83 -= local51;
			local9--;
			@Pc(171) int local171 = arg3 - local9;
			@Pc(176) int local176 = arg3 + local9;
			@Pc(180) int local180 = local7 + arg2;
			@Pc(184) int local184 = arg2 - local7;
			Static188.method3208(local180, arg4, local184, Static349.anIntArrayArray71[local171]);
			Static188.method3208(local180, arg4, local184, Static349.anIntArrayArray71[local176]);
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!ria;IZ)V")
	public static void method1958(@OriginalArg(0) Class303 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt7943 == 0 ? arg0.anInt7914 : arg0.anInt7943;
		@Pc(27) int local27 = arg0.anInt7936 == 0 ? arg0.anInt7971 : arg0.anInt7936;
		Static77.method1657(arg1, local15, arg0.anInt7962, Static261.aClass303ArrayArray1[arg0.anInt7962 >> 16], local27);
		if (arg0.aClass303Array2 != null) {
			Static77.method1657(arg1, local15, arg0.anInt7962, arg0.aClass303Array2, local27);
		}
		@Pc(64) Class2_Sub28 local64 = (Class2_Sub28) Static22.aClass323_4.method7484((long) arg0.anInt7962);
		if (local64 != null) {
			Static331.method5042(local64.anInt5454, arg1, local27, local15);
		}
	}
}
