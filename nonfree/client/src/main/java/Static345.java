import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!nl;")
	public static Class171 aClass171_98;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	public static int anInt6624;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
	public static int[] anIntArray1356;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!oo;")
	public static Class180 aClass180_2;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "Lclient!nl;")
	public static Class171 aClass171_99;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_140 = new Class205(60, 5);

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public static int anInt6625 = 0;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "F")
	public static float aFloat82 = 0.0F;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII)I")
	public static int method5667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg4;
			arg4 = arg2;
			arg2 = local6;
		}
		@Pc(18) int local18 = arg3 & 0x3;
		if (local18 == 0) {
			return arg0;
		} else if (local18 == 1) {
			return 7 + 1 - arg1 - arg4;
		} else if (local18 == 2) {
			return 7 + 1 - arg0 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIBIII)V")
	public static void method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg2 < 0 || Static246.anInt4374 - 1 <= arg1 || arg2 >= Static185.anInt3485 - 1) {
			return;
		}
		if (Static64.aClass251ArrayArrayArray1 == null) {
			return;
		}
		@Pc(46) Interface2 local46;
		if (arg5 != 0) {
			if (arg5 == 1) {
				local46 = (Interface2) Static95.method5549(arg3, arg1, arg2);
				if (local46 != null) {
					if (local46 instanceof Class1_Sub2_Sub2) {
						((Class1_Sub2_Sub2) local46).aClass84_4.method2282(arg6);
						return;
					}
					@Pc(62) int local62 = local46.method5651();
					if (arg4 != 4 && arg4 != 5) {
						if (arg4 == 6) {
							Static69.method1128(arg5, local62, arg3, arg0 + 4, arg6, arg1, arg2, 4);
							return;
						}
						if (arg4 == 7) {
							Static69.method1128(arg5, local62, arg3, (arg0 + 2 & 0x3) + 4, arg6, arg1, arg2, 4);
						} else if (arg4 == 8) {
							Static69.method1128(arg5, local62, arg3, arg0 + 4, arg6, arg1, arg2, 4);
							Static69.method1128(arg5, local62, arg3, (arg0 + 2 & 0x3) + 4, arg6, arg1, arg2, 4);
							return;
						}
						return;
					}
					Static69.method1128(arg5, local62, arg3, arg0, arg6, arg1, arg2, 4);
					return;
				}
				return;
			}
			if (arg5 == 2) {
				local46 = (Interface2) Static292.method4418(arg3, arg1, arg2, dc.class);
				if (local46 != null) {
					if (arg4 == 11) {
						arg4 = 10;
					}
					if (!(local46 instanceof Class1_Sub5_Sub5)) {
						Static69.method1128(arg5, local46.method5651(), arg3, arg0, arg6, arg1, arg2, arg4);
						return;
					}
					((Class1_Sub5_Sub5) local46).aClass84_3.method2282(arg6);
					return;
				}
				return;
			}
			if (arg5 == 3) {
				local46 = (Interface2) Static102.method2138(arg3, arg1, arg2);
				if (local46 != null) {
					if (local46 instanceof Class1_Sub3_Sub1) {
						((Class1_Sub3_Sub1) local46).aClass84_1.method2282(arg6);
						return;
					}
					Static69.method1128(arg5, local46.method5651(), arg3, arg0, arg6, arg1, arg2, arg4);
					return;
				}
			}
			return;
		}
		local46 = (Interface2) Static368.method4614(arg3, arg1, arg2);
		@Pc(254) Interface2 local254 = (Interface2) Static141.method2666(arg3, arg1, arg2);
		if (local46 != null && arg4 != 2) {
			if (local46 instanceof Class1_Sub1_Sub2) {
				((Class1_Sub1_Sub2) local46).aClass84_2.method2282(arg6);
			} else {
				Static69.method1128(arg5, local46.method5651(), arg3, arg0, arg6, arg1, arg2, arg4);
			}
		}
		if (local254 == null) {
			return;
		}
		if (!(local254 instanceof Class1_Sub1_Sub2)) {
			Static69.method1128(arg5, local254.method5651(), arg3, arg0, arg6, arg1, arg2, arg4);
			return;
		}
		((Class1_Sub1_Sub2) local254).aClass84_2.method2282(arg6);
		return;
	}
}
