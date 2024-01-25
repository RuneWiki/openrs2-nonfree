import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "Lclient!df;")
	public static Class33 aClass33_2;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_33 = new Class42();

	@OriginalMember(owner = "client!md", name = "ob", descriptor = "Lclient!qi;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!md", name = "yb", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_125 = new Class18(76, 12);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIBII)V")
	public static void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(18) int local18 = arg2 - arg4;
		for (@Pc(20) int local20 = arg1; local20 < local9; local20++) {
			Static367.method6081(arg0, arg3, Static43.anIntArrayArray57[local20], arg5);
		}
		@Pc(38) int local38 = arg4 + arg3;
		@Pc(42) int local42 = arg5 - arg4;
		for (@Pc(44) int local44 = arg2; local44 > local18; local44--) {
			Static367.method6081(arg0, arg3, Static43.anIntArrayArray57[local44], arg5);
		}
		for (@Pc(60) int local60 = local9; local60 <= local18; local60++) {
			@Pc(66) int[] local66 = Static43.anIntArrayArray57[local60];
			Static367.method6081(arg0, arg3, local66, local38);
			Static367.method6081(arg0, local42, local66, arg5);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	public static void method3630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass11_Sub1_2 != null) {
			local7.aClass11_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method3631() {
		for (@Pc(11) int local11 = 0; local11 < Static277.anInt5394; local11++) {
			@Pc(17) int local17 = Static81.anIntArray143[local11];
			@Pc(21) Class11_Sub2_Sub6_Sub2 local21 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local17];
			if (local21 != null) {
				Static91.method6078(local21, local21.aClass208_1.anInt6162);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
	public static void method3633(@OriginalArg(1) int arg0) {
		if (Static310.anInt5974 == 0) {
			Static40.aClass1_Sub6_Sub4_2.method4060(arg0);
		} else {
			Static192.anInt3868 = arg0;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZI)V")
	public static void method3635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static154.aLong114 = 0L;
		@Pc(10) int local10 = Static300.method5230();
		if (arg0 == 3 || local10 == 3) {
			arg3 = true;
		}
		if (!Static9.aClass63_1.method4599()) {
			arg3 = true;
		}
		Static367.method6080(arg0, arg3, local10, arg1, arg2);
	}
}
