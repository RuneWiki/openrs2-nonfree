import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!mda;")
	public static Class229 aClass229_2;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "[I")
	public static final int[] anIntArray569 = new int[5];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	public static void method6333() {
		Static483.anInt8667 = -1;
		Static117.aClass137_46 = null;
		Static453.anInt7941 = -1;
		Static345.aClass26_5 = null;
		Static336.anInt6341 = -1;
		Static595.anInterface23Array1 = null;
		Static155.anInt3058 = -1;
		Static5.aClass26_11 = null;
		Static362.anIntArray486 = null;
		Static45.anInterface23_1 = null;
		Static378.aClass26_6 = null;
		Static430.aClass23_3.method479();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZI)V")
	public static void method6334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class14_Sub3_Sub9 local14 = Static142.method2219((long) arg0 << 32 | (long) arg1, 18);
		local14.method2822();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!fb;[I[I[I)V")
	public static void method6336(@OriginalArg(1) Class12_Sub2_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg1[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg0.aClass351Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass351Array3[local19] = null;
					} else {
						@Pc(36) Class275 local36 = Static501.aClass191_2.method4322(local9);
						@Pc(39) int local39 = local36.anInt7920;
						@Pc(44) Class351 local44 = arg0.aClass351Array3[local19];
						if (local44 != null) {
							if (local44.anInt10181 == local9) {
								if (local39 == 0) {
									local44 = arg0.aClass351Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt10180 = 0;
									local44.anInt10177 = 0;
									local44.anInt10178 = 0;
									local44.anInt10182 = 1;
									local44.anInt10179 = local17;
									if (!arg0.aBoolean221) {
										Static51.method1064(arg0, local36, 0);
									}
								} else if (local39 == 2) {
									local44.anInt10177 = 0;
								}
							} else if (local36.anInt7930 >= Static501.aClass191_2.method4322(local44.anInt10181).anInt7930) {
								local44 = arg0.aClass351Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg0.aClass351Array3[local19] = new Class351();
							local44.anInt10179 = local17;
							local44.anInt10182 = 1;
							local44.anInt10181 = local9;
							local44.anInt10178 = 0;
							local44.anInt10177 = 0;
							local44.anInt10180 = 0;
							if (!arg0.aBoolean221) {
								Static51.method1064(arg0, local36, 0);
							}
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!je;)V")
	public static void method6337(@OriginalArg(0) Class12_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class12_Sub2 local7 = null;
			for (@Pc(11) Class12_Sub2 local11 = Static447.aClass12_Sub2Array8[local4]; local11 != null; local11 = local11.aClass12_Sub2_22) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static447.aClass12_Sub2Array8[local4] = local11.aClass12_Sub2_22;
					} else {
						local7.aClass12_Sub2_22 = local11.aClass12_Sub2_22;
					}
					Static17.aBoolean15 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class12_Sub2 local43 = Static154.aClass12_Sub2Array1[local4]; local43 != null; local43 = local43.aClass12_Sub2_22) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static154.aClass12_Sub2Array1[local4] = local43.aClass12_Sub2_22;
					} else {
						local7.aClass12_Sub2_22 = local43.aClass12_Sub2_22;
					}
					Static17.aBoolean15 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class12_Sub2 local75 = Static177.aClass12_Sub2Array2[local4]; local75 != null; local75 = local75.aClass12_Sub2_22) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static177.aClass12_Sub2Array2[local4] = local75.aClass12_Sub2_22;
					} else {
						local7.aClass12_Sub2_22 = local75.aClass12_Sub2_22;
					}
					Static17.aBoolean15 = true;
					return;
				}
				local7 = local75;
			}
		}
	}
}
