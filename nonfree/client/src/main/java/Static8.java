import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "[Lclient!ks;")
	public static Class123[] aClass123Array1;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "Lclient!iq;")
	public static Class104 aClass104_6;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Lclient!tm;")
	public static final Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
	public static int anInt171 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public static void method141(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(1, arg0);
		local8.method1799();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
	public static void method142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class191 local9 = Static68.aClass191ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static47.anInt780 = local9.anInt6121;
			Static338.anInt6589 = local9.anInt6116;
			Static220.anInt4856 = local9.anInt6114;
		}
		Static242.method4782();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V")
	public static void method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg3 < 0 || Static66.anInt1177 - 1 <= arg5 || Static12.anInt213 - 1 <= arg3) {
			return;
		}
		if (Static196.aClass51ArrayArrayArray3 == null) {
			return;
		}
		@Pc(48) Interface8 local48;
		if (arg2 == 0) {
			local48 = (Interface8) Static356.method5687(arg4, arg5, arg3);
			@Pc(54) Interface8 local54 = (Interface8) Static66.method1358(arg4, arg5, arg3);
			if (local48 != null && arg6 != 2) {
				if (local48 instanceof Class1_Sub1_Sub1) {
					((Class1_Sub1_Sub1) local48).aClass151_2.method4332(arg1);
				} else {
					Static177.method3428(arg2, arg3, arg1, arg6, arg4, arg5, arg0, local48.method5502());
				}
			}
			if (local54 != null) {
				if (!(local54 instanceof Class1_Sub1_Sub1)) {
					Static177.method3428(arg2, arg3, arg1, arg6, arg4, arg5, arg0, local54.method5502());
					return;
				}
				((Class1_Sub1_Sub1) local54).aClass151_2.method4332(arg1);
				return;
			}
			return;
		}
		if (arg2 == 1) {
			local48 = (Interface8) Static346.method5010(arg4, arg5, arg3);
			if (local48 != null) {
				if (local48 instanceof Class1_Sub3_Sub2) {
					((Class1_Sub3_Sub2) local48).aClass151_3.method4332(arg1);
					return;
				}
				@Pc(134) int local134 = local48.method5502();
				if (arg6 != 4 && arg6 != 5) {
					if (arg6 == 6) {
						Static177.method3428(arg2, arg3, arg1, 4, arg4, arg5, arg0 + 4, local134);
					} else if (arg6 == 7) {
						Static177.method3428(arg2, arg3, arg1, 4, arg4, arg5, (arg0 + 2 & 0x3) + 4, local134);
						return;
					} else if (arg6 == 8) {
						Static177.method3428(arg2, arg3, arg1, 4, arg4, arg5, arg0 + 4, local134);
						Static177.method3428(arg2, arg3, arg1, 4, arg4, arg5, (arg0 + 2 & 0x3) + 4, local134);
						return;
					}
					return;
				}
				Static177.method3428(arg2, arg3, arg1, 4, arg4, arg5, arg0, local134);
				return;
			}
			return;
		}
		if (arg2 == 2) {
			local48 = (Interface8) Static109.method2112(arg4, arg5, arg3, rc.class);
			if (local48 != null) {
				if (arg6 == 11) {
					arg6 = 10;
				}
				if (local48 instanceof Class1_Sub2_Sub1) {
					((Class1_Sub2_Sub1) local48).aClass151_1.method4332(arg1);
					return;
				}
				Static177.method3428(arg2, arg3, arg1, arg6, arg4, arg5, arg0, local48.method5502());
				return;
			}
			return;
		}
		if (arg2 != 3) {
			return;
		}
		local48 = (Interface8) Static217.method4135(arg4, arg5, arg3);
		if (local48 == null) {
			return;
		}
		if (!(local48 instanceof Class1_Sub4_Sub1)) {
			Static177.method3428(arg2, arg3, arg1, arg6, arg4, arg5, arg0, local48.method5502());
			return;
		}
		((Class1_Sub4_Sub1) local48).aClass151_4.method4332(arg1);
		return;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lclient!fh;")
	public static Class68 method144(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static264.aClass68ArrayArray1[local12] == null || Static264.aClass68ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static146.method2839(local12);
			if (!local30) {
				return null;
			}
		}
		return Static264.aClass68ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI[B)I")
	public static int method146(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static99.method1988(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public static void method147() {
		Static360.anInt6858 = -1;
		Static222.anInt6838 = 0;
		Static148.anInt3213 = -1;
		Static57.anInt1013 = -1;
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
	public static void method148() {
		if (Static269.anInt6658 == -1) {
			return;
		}
		@Pc(17) int local17 = Class1_Sub2_Sub5.lb.method2470();
		@Pc(21) int local21 = Class1_Sub2_Sub5.lb.method2466();
		if (Static17.aClass2_Sub1_1 != null) {
			local17 = Static17.aClass2_Sub1_1.method49();
			local21 = Static17.aClass2_Sub1_1.method51();
		}
		Static301.method5063(0, Static269.anInt6658, local17, Static335.anInt6496, Static25.anInt396, local21, 0, 0, 0);
		if (Static40.aClass68_3 != null) {
			Static163.method3267(local17, local21);
		}
	}
}
