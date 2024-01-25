import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Lclient!k;")
	public static Class168 aClass168_16;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_286 = new Class123(70, 19);

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "[I")
	public static final int[] anIntArray534 = new int[4];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public static void method7221() {
		if (Static319.aClass31_11 == null) {
			return;
		}
		Static545.aClass269_10.method5969();
		Static492.method6624();
		Static253.method3969();
		Static308.method4619();
		Static166.method3009();
		Static500.method6721();
		if (Static177.aClass256_1 != null) {
			Static177.aClass256_1.method5770();
		}
		Static337.method4914();
		Static527.method8126();
		Static288.method4331();
		Static77.method1824();
		Static427.method5898(false);
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class25_Sub2_Sub2_Sub5_Sub1 local43 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local37];
			if (local43 != null) {
				for (@Pc(47) int local47 = 0; local47 < local43.aClass52Array3.length; local47++) {
					local43.aClass52Array3[local47] = null;
				}
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static238.anInt4737; local68++) {
			@Pc(75) Class25_Sub2_Sub2_Sub5_Sub2 local75 = Static33.aClass3_Sub39Array1[local68].aClass25_Sub2_Sub2_Sub5_Sub2_2;
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < local75.aClass52Array3.length; local79++) {
					local75.aClass52Array3[local79] = null;
				}
			}
		}
		Static378.aClass42_4 = null;
		Static585.aClass42_6 = null;
		Static319.aClass31_11.method8053();
		Static319.aClass31_11 = null;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V")
	public static void method7224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(15) int local15 = arg4 + arg0;
		for (@Pc(17) int local17 = arg4; local17 < local15; local17++) {
			Static504.method6755(arg1, arg3, Static570.anIntArrayArray100[local17], arg5);
		}
		for (@Pc(37) int local37 = arg2; local37 > local10; local37--) {
			Static504.method6755(arg1, arg3, Static570.anIntArrayArray100[local37], arg5);
		}
		@Pc(60) int local60 = arg3 - arg0;
		@Pc(64) int local64 = arg0 + arg5;
		for (@Pc(66) int local66 = local15; local66 <= local10; local66++) {
			@Pc(77) int[] local77 = Static570.anIntArrayArray100[local66];
			Static504.method6755(arg1, local64, local77, arg5);
			Static504.method6755(arg1, arg3, local77, local60);
		}
	}
}
