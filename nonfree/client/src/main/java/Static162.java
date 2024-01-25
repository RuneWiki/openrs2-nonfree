import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "Lclient!maa;")
	public static Class5 aClass5_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Ljava/lang/Class;")
	private static Class aClass18;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_49 = new Class225(43, 12);

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "[I")
	public static final int[] anIntArray206 = new int[13];

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!pk;")
	public static final Class293 aClass293_4 = new Class293();

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_47 = new Class349(80, 3);

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_48 = new Class349(40, -1);

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "J")
	public static long aLong97 = -1L;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)Z")
	public static boolean method2415(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)V")
	public static void method2418() {
		Static587.aClass145_12.xa(((float) Static650.aClass2_Sub30_29.aClass11_Sub22_1.method5859() * 0.1F + 0.7F) * Static426.aFloat114);
		Static587.aClass145_12.ZA(Static266.anInt4126, Static678.aFloat175, Static434.aFloat122, (float) (Static68.anInt1181 << 2), (float) (Static118.anInt1986 << 2), (float) (Static69.anInt1215 << 2));
		Static587.aClass145_12.method9701(Static11.aClass74_1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg0 < 0 || Static426.anInt6942 - 1 <= arg4 || arg0 >= Static280.anInt6752 - 1) {
			return;
		}
		if (Static632.aClass311ArrayArrayArray3 == null) {
			return;
		}
		@Pc(56) Interface25 local56;
		if (arg6 != 0) {
			if (arg6 == 1) {
				local56 = (Interface25) Static366.method5263(arg5, arg4, arg0);
				if (local56 == null) {
					return;
				}
				if (local56 instanceof Class4_Sub2_Sub4_Sub1) {
					((Class4_Sub2_Sub4_Sub1) local56).aClass325_1.method7772(arg1);
					return;
				}
				@Pc(75) int local75 = local56.method8986();
				if (arg3 != 4 && arg3 != 5) {
					if (arg3 == 6) {
						Static118.method1731(arg4, arg0, arg6, arg1, 4, arg5, arg2 + 4, local75);
						return;
					}
					if (arg3 == 7) {
						Static118.method1731(arg4, arg0, arg6, arg1, 4, arg5, (arg2 + 2 & 0x3) + 4, local75);
						return;
					}
					if (arg3 == 8) {
						Static118.method1731(arg4, arg0, arg6, arg1, 4, arg5, arg2 + 4, local75);
						Static118.method1731(arg4, arg0, arg6, arg1, 4, arg5, (arg2 + 2 & 0x3) + 4, local75);
						return;
					}
					return;
				}
				Static118.method1731(arg4, arg0, arg6, arg1, 4, arg5, arg2, local75);
				return;
			}
			if (arg6 == 2) {
				local56 = (Interface25) Static140.method2072(arg5, arg4, arg0, aClass18 == null ? (aClass18 = Class2_Sub23_Sub1.a("vi")) : aClass18);
				if (local56 != null) {
					if (arg3 == 11) {
						arg3 = 10;
					}
					if (!(local56 instanceof Class4_Sub2_Sub1_Sub5)) {
						Static118.method1731(arg4, arg0, arg6, arg1, arg3, arg5, arg2, local56.method8986());
						return;
					}
					((Class4_Sub2_Sub1_Sub5) local56).aClass325_4.method7772(arg1);
					return;
				}
				return;
			}
			if (arg6 == 3) {
				local56 = (Interface25) Static441.method6382(arg5, arg4, arg0);
				if (local56 != null) {
					if (!(local56 instanceof Class4_Sub2_Sub2_Sub2)) {
						Static118.method1731(arg4, arg0, arg6, arg1, arg3, arg5, arg2, local56.method8986());
						return;
					}
					((Class4_Sub2_Sub2_Sub2) local56).aClass325_2.method7772(arg1);
					return;
				}
			}
			return;
		}
		local56 = (Interface25) Static91.method1414(arg5, arg4, arg0);
		@Pc(280) Interface25 local280 = (Interface25) Static321.method4454(arg5, arg4, arg0);
		if (local56 != null && arg3 != 2) {
			if (local56 instanceof Class4_Sub2_Sub3_Sub2) {
				((Class4_Sub2_Sub3_Sub2) local56).aClass325_3.method7772(arg1);
			} else {
				Static118.method1731(arg4, arg0, arg6, arg1, arg3, arg5, arg2, local56.method8986());
			}
		}
		if (local280 == null) {
			return;
		}
		if (!(local280 instanceof Class4_Sub2_Sub3_Sub2)) {
			Static118.method1731(arg4, arg0, arg6, arg1, arg3, arg5, arg2, local280.method8986());
			return;
		}
		((Class4_Sub2_Sub3_Sub2) local280).aClass325_3.method7772(arg1);
		return;
	}
}
