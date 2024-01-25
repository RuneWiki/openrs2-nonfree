import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "[I")
	public static int[] anIntArray603;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array14;

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
	public static int anInt4906;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!lt;")
	public static final Class146 aClass146_1 = new Class146();

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray114 = new boolean[100];

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
	public static int anInt4897 = 0;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_129 = new Class77(43, 5);

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
	public static void method4289(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static355.method5388(Static313.anInt5542, arg4, Static345.anInt6084);
		@Pc(17) int local17 = Static355.method5388(Static313.anInt5542, arg1, Static345.anInt6084);
		@Pc(23) int local23 = Static355.method5388(Static332.anInt5823, arg5, Static202.anInt3722);
		@Pc(29) int local29 = Static355.method5388(Static332.anInt5823, arg2, Static202.anInt3722);
		@Pc(38) int local38 = Static355.method5388(Static313.anInt5542, arg4 + arg3, Static345.anInt6084);
		@Pc(47) int local47 = Static355.method5388(Static313.anInt5542, arg1 - arg3, Static345.anInt6084);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static264.method4096(Static267.anIntArrayArray38[local49], arg0, local29, local23);
		}
		for (@Pc(65) int local65 = local17; local65 > local47; local65--) {
			Static264.method4096(Static267.anIntArrayArray38[local65], arg0, local29, local23);
		}
		@Pc(92) int local92 = Static355.method5388(Static332.anInt5823, arg3 + arg5, Static202.anInt3722);
		@Pc(101) int local101 = Static355.method5388(Static332.anInt5823, arg2 - arg3, Static202.anInt3722);
		for (@Pc(103) int local103 = local38; local103 <= local47; local103++) {
			@Pc(109) int[] local109 = Static267.anIntArrayArray38[local103];
			Static264.method4096(local109, arg0, local92, local23);
			Static264.method4096(local109, arg0, local29, local101);
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)V")
	public static void method4290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg1, 1);
		local8.method410();
		local8.anInt348 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)I")
	public static int method4291(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static56.method1074(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILclient!km;IIIII)V")
	public static void method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface11 local11 = (Interface11) Static252.method4000(arg2, arg1, arg4);
		@Pc(20) Class34 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static11.aClass123_5.method2703(local11.method5025());
			local26 = local11.method5024() & 0x3;
			local30 = local11.method5027();
			if (local20.anInt799 == -1) {
				local37 = arg7;
				if (local20.anInt788 > 0) {
					local37 = arg5;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg3.method4509(local37, arg0, 4, arg6);
					} else if (local26 == 1) {
						arg3.method4476(4, arg0, local37, arg6);
					} else if (local26 == 2) {
						arg3.method4509(local37, arg0 + 3, 4, arg6);
					} else if (local26 == 3) {
						arg3.method4476(4, arg0, local37, arg6 + 3);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg3.method4486(1, 1, arg0, local37, arg6);
					} else if (local26 == 1) {
						arg3.method4486(1, 1, arg0 + 3, local37, arg6);
					} else if (local26 == 2) {
						arg3.method4486(1, 1, arg0 + 3, local37, arg6 + 3);
					} else if (local26 == 3) {
						arg3.method4486(1, 1, arg0, local37, arg6 + 3);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg3.method4476(4, arg0, local37, arg6);
					} else if (local26 == 1) {
						arg3.method4509(local37, arg0 + 3, 4, arg6);
					} else if (local26 == 2) {
						arg3.method4476(4, arg0, local37, arg6 + 3);
					} else if (local26 == 3) {
						arg3.method4509(local37, arg0, 4, arg6);
					}
				}
			} else {
				Static68.method1246(arg3, local20, local26, arg6, arg0);
			}
		}
		local11 = (Interface11) Static86.method4712(arg2, arg1, arg4, wk.class);
		if (local11 != null) {
			local20 = Static11.aClass123_5.method2703(local11.method5025());
			local26 = local11.method5024() & 0x3;
			local30 = local11.method5027();
			if (local20.anInt799 != -1) {
				Static68.method1246(arg3, local20, local26, arg6, arg0);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt788 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg3.method4497(arg0, local37, arg6, arg6 + 3, arg0 + 3);
				} else {
					arg3.method4497(arg0, local37, arg6 + 3, arg6, arg0 + 3);
				}
			}
		}
		local11 = (Interface11) Static240.method3889(arg2, arg1, arg4);
		if (local11 == null) {
			return;
		}
		local20 = Static11.aClass123_5.method2703(local11.method5025());
		local26 = local11.method5024() & 0x3;
		if (local20.anInt799 != -1) {
			Static68.method1246(arg3, local20, local26, arg6, arg0);
		}
	}
}
