import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "[Lclient!tn;")
	public static Class25_Sub5_Sub1_Sub1[] aClass25_Sub5_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!wt;")
	public static Class365 aClass365_3;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public static int anInt9166 = 0;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!er;I)V")
	public static void method7217(@OriginalArg(0) Class31_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static59.anObject6 == null) {
			@Pc(5) Class44_Sub1_Sub1 local5 = new Class44_Sub1_Sub1();
			local12 = local5.method1788();
			Static59.anObject6 = Static342.method4996(local12);
		}
		if (Static166.anObject10 == null) {
			@Pc(27) Class44_Sub2_Sub2 local27 = new Class44_Sub2_Sub2();
			local12 = local27.method3339();
			Static166.anObject10 = Static342.method4996(local12);
		}
		@Pc(42) Class247 local42 = arg0.aClass247_1;
		if (local42.method5595() && Static582.anObject20 == null) {
			local12 = Static56.method1377(new Class267_Sub1(419684), 16.0F, 4.0F, 0.5F, 0.6F, 4.0F);
			Static582.anObject20 = Static342.method4996(local12);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)V")
	public static void method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static384.anInt6641 && Static191.anInt4134 >= arg5 && arg4 >= Static112.anInt2687 && arg3 <= Static333.anInt6022) {
			if (arg2 == 1) {
				Static81.method1884(arg4, arg5, arg0, arg1, arg3);
			} else {
				Static521.method7224(arg2, arg0, arg3, arg5, arg4, arg1);
			}
		} else if (arg2 == 1) {
			Static275.method4164(arg0, arg4, arg3, arg5, arg1);
		} else {
			Static427.method5899(arg3, arg5, arg2, arg0, arg4, arg1);
		}
	}
}
