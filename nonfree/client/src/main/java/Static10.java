import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aea", name = "Q", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!aea", name = "L", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_2 = new Class208(27, 8);

	@OriginalMember(owner = "client!aea", name = "P", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_3 = new Class208(36, 4);

	@OriginalMember(owner = "client!aea", name = "R", descriptor = "[Lclient!ae;")
	public static final Class6_Sub2_Sub1[] aClass6_Sub2_Sub1Array1 = new Class6_Sub2_Sub1[14];

	@OriginalMember(owner = "client!aea", name = "U", descriptor = "Lclient!wl;")
	public static final Class377 aClass377_1 = new Class377();

	@OriginalMember(owner = "client!aea", name = "V", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_4 = new Class208(16, -1);

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)Lclient!ns;")
	public static Class20_Sub2_Sub2_Sub1 method208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class97 local11 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class20_Sub2_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class196 local22 = local11.aClass196_2; local22 != null; local22 = local22.aClass196_3) {
			@Pc(31) Class20_Sub2_Sub2 local31 = local22.aClass20_Sub2_Sub2_1;
			if (local31 instanceof Class20_Sub2_Sub2_Sub1) {
				@Pc(37) Class20_Sub2_Sub2_Sub1 local37 = (Class20_Sub2_Sub2_Sub1) local31;
				@Pc(47) int local47 = local37.method4913() * 256 + 252 - 256;
				@Pc(55) int local55 = local37.anInt10725 - local47 >> 9;
				@Pc(63) int local63 = local37.anInt10729 - local47 >> 9;
				@Pc(71) int local71 = local37.anInt10725 + local47 >> 9;
				@Pc(79) int local79 = local37.anInt10729 + local47 >> 9;
				if (arg1 >= local55 && local63 <= arg2 && local71 >= arg1 && arg2 <= local79) {
					@Pc(109) int local109 = (local71 + 1 - arg1) * (-arg2 + 1 + local79);
					if (local109 > local19) {
						local19 = local109;
						local17 = local37;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!vs;)V")
	public static void method210(@OriginalArg(0) Class20_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class20_Sub2 local7 = null;
			for (@Pc(11) Class20_Sub2 local11 = Static158.aClass20_Sub2Array7[local4]; local11 != null; local11 = local11.aClass20_Sub2_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static158.aClass20_Sub2Array7[local4] = local11.aClass20_Sub2_23;
					} else {
						local7.aClass20_Sub2_23 = local11.aClass20_Sub2_23;
					}
					Static133.aBoolean183 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class20_Sub2 local43 = Static311.aClass20_Sub2Array11[local4]; local43 != null; local43 = local43.aClass20_Sub2_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static311.aClass20_Sub2Array11[local4] = local43.aClass20_Sub2_23;
					} else {
						local7.aClass20_Sub2_23 = local43.aClass20_Sub2_23;
					}
					Static133.aBoolean183 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class20_Sub2 local75 = Static411.aClass20_Sub2Array12[local4]; local75 != null; local75 = local75.aClass20_Sub2_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static411.aClass20_Sub2Array12[local4] = local75.aClass20_Sub2_23;
					} else {
						local7.aClass20_Sub2_23 = local75.aClass20_Sub2_23;
					}
					Static133.aBoolean183 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZIII)V")
	public static void method213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(19) int local19 = -1;
		Static312.method5228(arg0, Static484.anIntArrayArray41[arg2], arg3 + arg1, -arg1 + arg3);
		while (local9 > local7) {
			local19 += 2;
			local7++;
			local12 += local19;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(56) int[] local56 = Static484.anIntArrayArray41[arg2 + local9];
				@Pc(63) int[] local63 = Static484.anIntArrayArray41[arg2 - local9];
				@Pc(67) int local67 = local7 + arg3;
				@Pc(72) int local72 = arg3 - local7;
				Static312.method5228(arg0, local56, local67, local72);
				Static312.method5228(arg0, local63, local67, local72);
			}
			@Pc(89) int local89 = arg3 + local9;
			@Pc(94) int local94 = arg3 - local9;
			@Pc(101) int[] local101 = Static484.anIntArrayArray41[arg2 + local7];
			@Pc(107) int[] local107 = Static484.anIntArrayArray41[arg2 - local7];
			Static312.method5228(arg0, local101, local89, local94);
			Static312.method5228(arg0, local107, local89, local94);
		}
	}

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "(I)I")
	public static int method214() {
		if (Static71.aBoolean94) {
			return 6;
		} else if (Static482.aClass6_Sub2_Sub4_4 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static482.aClass6_Sub2_Sub4_4.anInt1738;
			if (Static213.method3641(local19)) {
				return 1;
			} else if (Static238.method4146(local19)) {
				return 2;
			} else if (Static420.method6609(local19)) {
				return 3;
			} else if (Static74.method1294(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
