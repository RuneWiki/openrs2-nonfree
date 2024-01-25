import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public static int anInt6681;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Lclient!lm;")
	public static Class134 aClass134_150;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "[[[Lclient!gk;")
	public static Class83[][][] aClass83ArrayArrayArray3;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Lclient!lm;")
	public static Class134 aClass134_151;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public static int anInt6680 = 0;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "[I")
	public static final int[] anIntArray670 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!ls;")
	public static final Class136 aClass136_2 = new Class136();

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Z")
	public static boolean aBoolean550 = true;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "[Lclient!rf;")
	public static final Class1_Sub2_Sub13[] aClass1_Sub2_Sub13Array4 = new Class1_Sub2_Sub13[14];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZIIIII)V")
	public static void method5795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class163 local8 = Static46.method931(arg1, arg4);
		if (local8 != null && local8.anObjectArray5 != null) {
			@Pc(17) Class1_Sub8 local17 = new Class1_Sub8();
			local17.aClass163_3 = local8;
			local17.anObjectArray1 = local8.anObjectArray5;
			Static122.method1972(local17);
		}
		Static265.aBoolean456 = true;
		Static259.anInt5310 = arg4;
		Static224.anInt4728 = arg2;
		Static61.anInt1411 = arg5;
		Static45.anInt1184 = arg0;
		Static10.anInt163 = arg3;
		Static178.anInt3758 = arg1;
		Static340.method5639(local8);
	}
}
