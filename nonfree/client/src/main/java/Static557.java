import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "Lclient!ps;")
	public static Class291 aClass291_13;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_31 = new Class27(10, 2, 2, 0);

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
	public static final int[] anIntArray611 = new int[3];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	public static void method7400(@OriginalArg(1) int arg0) {
		Static523.anInt8091 = arg0;
		@Pc(7) Class352 local7 = Static318.aClass352_43;
		synchronized (Static318.aClass352_43) {
			Static318.aClass352_43.method7659();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Lclient!kq;I)V")
	public static void method7401(@OriginalArg(0) int arg0, @OriginalArg(1) Class199[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class199 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt4966 == 0) {
					if (local9.aClass199Array1 != null) {
						method7401(arg0, local9.aClass199Array1);
					}
					@Pc(30) Class4_Sub28 local30 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local9.anInt5041);
					if (local30 != null) {
						Static135.method2426(local30.anInt4697, arg0);
					}
				}
				@Pc(46) Class4_Sub25 local46;
				if (arg0 == 0 && local9.anObjectArray9 != null) {
					local46 = new Class4_Sub25();
					local46.anObjectArray2 = local9.anObjectArray9;
					local46.aClass199_6 = local9;
					Static237.method3393(local46);
				}
				if (arg0 == 1 && local9.anObjectArray35 != null) {
					if (local9.anInt5005 >= 0) {
						@Pc(71) Class199 local71 = Static569.method7534(local9.anInt5041);
						if (local71 == null || local71.aClass199Array1 == null || local9.anInt5005 >= local71.aClass199Array1.length || local71.aClass199Array1[local9.anInt5005] != local9) {
							continue;
						}
					}
					local46 = new Class4_Sub25();
					local46.anObjectArray2 = local9.anObjectArray35;
					local46.aClass199_6 = local9;
					Static237.method3393(local46);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I[I)V")
	public static void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg1) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg0; local60 < arg1; local60++) {
			if ((local58 & local60) + local25 > arg2[local60]) {
				@Pc(75) int local75 = arg2[local60];
				arg2[local60] = arg2[local21];
				arg2[local21] = local75;
				@Pc(89) int local89 = arg3[local60];
				arg3[local60] = arg3[local21];
				arg3[local21++] = local89;
			}
		}
		arg2[arg1] = arg2[local21];
		arg2[local21] = local25;
		arg3[arg1] = arg3[local21];
		arg3[local21] = local39;
		method7402(arg0, local21 - 1, arg2, arg3);
		method7402(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7403(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}
}
