import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
	public static int anInt1288;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_30 = new Class25(111, 12);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg4 < 0 || arg1 >= Static234.anInt3949 - 1 || Static371.anInt6492 - 1 <= arg4) {
			return;
		}
		if (Static175.aClass36ArrayArrayArray1 == null) {
			return;
		}
		@Pc(35) Interface6 local35;
		if (arg6 == 0) {
			local35 = (Interface6) Static45.method700(arg0, arg1, arg4);
			@Pc(250) Interface6 local250 = (Interface6) Static222.method3076(arg0, arg1, arg4);
			if (local35 != null && arg2 != 2) {
				if (local35 instanceof Class11_Sub1_Sub2) {
					((Class11_Sub1_Sub2) local35).aClass134_3.method2790(arg5);
				} else {
					Static11.method178(local35.method5718(), arg0, arg1, arg6, arg2, arg5, arg4, arg3);
				}
			}
			if (local250 != null) {
				if (local250 instanceof Class11_Sub1_Sub2) {
					((Class11_Sub1_Sub2) local250).aClass134_3.method2790(arg5);
				} else {
					Static11.method178(local250.method5718(), arg0, arg1, arg6, arg2, arg5, arg4, arg3);
				}
			}
		} else if (arg6 == 1) {
			local35 = (Interface6) Static130.method2044(arg0, arg1, arg4);
			if (local35 != null) {
				if (local35 instanceof Class11_Sub2_Sub1) {
					((Class11_Sub2_Sub1) local35).aClass134_1.method2790(arg5);
				} else {
					@Pc(44) int local44 = local35.method5718();
					if (arg2 == 4 || arg2 == 5) {
						Static11.method178(local44, arg0, arg1, arg6, 4, arg5, arg4, arg3);
					} else if (arg2 == 6) {
						Static11.method178(local44, arg0, arg1, arg6, 4, arg5, arg4, arg3 + 4);
					} else if (arg2 == 7) {
						Static11.method178(local44, arg0, arg1, arg6, 4, arg5, arg4, (arg3 + 2 & 0x3) + 4);
					} else if (arg2 == 8) {
						Static11.method178(local44, arg0, arg1, arg6, 4, arg5, arg4, arg3 + 4);
						Static11.method178(local44, arg0, arg1, arg6, 4, arg5, arg4, (arg3 + 2 & 0x3) + 4);
					}
				}
			}
		} else if (arg6 == 2) {
			local35 = (Interface6) Static345.method4857(arg0, arg1, arg4, jq.class);
			if (local35 != null) {
				if (arg2 == 11) {
					arg2 = 10;
				}
				if (local35 instanceof Class11_Sub5_Sub3) {
					((Class11_Sub5_Sub3) local35).aClass134_4.method2790(arg5);
				} else {
					Static11.method178(local35.method5718(), arg0, arg1, arg6, arg2, arg5, arg4, arg3);
				}
			}
		} else if (arg6 == 3) {
			local35 = (Interface6) Static115.method1883(arg0, arg1, arg4);
			if (local35 != null) {
				if (local35 instanceof Class11_Sub3_Sub1) {
					((Class11_Sub3_Sub1) local35).aClass134_2.method2790(arg5);
				} else {
					Static11.method178(local35.method5718(), arg0, arg1, arg6, arg2, arg5, arg4, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIZ)I")
	public static int method1185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class2_Sub12 local19 = Static92.method1397(arg1, arg2);
		if (local19 == null) {
			return 0;
		} else if (arg0 >= 0 && local19.anIntArray213.length > arg0) {
			return local19.anIntArray213[arg0];
		} else {
			return 0;
		}
	}
}
