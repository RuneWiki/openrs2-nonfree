import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
	public static int anInt3345;

	@OriginalMember(owner = "client!iv", name = "G", descriptor = "I")
	public static int anInt3352 = 0;

	@OriginalMember(owner = "client!iv", name = "P", descriptor = "[I")
	public static final int[] anIntArray277 = new int[13];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!bv;)V")
	public static void method2643(@OriginalArg(1) Class30_Sub1 arg0) {
		@Pc(16) byte[] local16;
		if (Static232.anObject6 == null) {
			@Pc(9) Class76_Sub2_Sub1 local9 = new Class76_Sub2_Sub1();
			local16 = local9.method2441();
			Static232.anObject6 = Static36.method661(local16);
		}
		if (Static100.anObject2 == null) {
			@Pc(27) Class76_Sub1_Sub1 local27 = new Class76_Sub1_Sub1();
			local16 = local27.method5050();
			Static100.anObject2 = Static36.method661(local16);
		}
		@Pc(44) Class160 local44 = arg0.aClass160_1;
		if (local44.method3578() && Static213.anObject5 == null) {
			local16 = Static385.method4420(4.0F, 16.0F, new Class238_Sub1(419684), 4.0F, 0.5F, 0.6F);
			Static213.anObject5 = Static36.method661(local16);
		}
	}

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "(I)V")
	public static void method2644() {
		if (Static156.aClass30_7 != null) {
			Static156.aClass30_7.method4695();
			Static156.aClass30_7 = null;
			Static200.aClass105_2 = null;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIII)V")
	public static void method2645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg0) {
			Static276.method3719(arg1, arg4, arg2, arg3);
		} else if (arg1 - arg4 >= Static414.anInt7043 && arg1 + arg4 <= Static198.anInt3778 && Static388.anInt6740 <= arg2 - arg0 && arg0 + arg2 <= Static387.anInt6727) {
			Static355.method4963(arg4, arg1, arg0, arg3, arg2);
		} else {
			Static106.method1667(arg1, arg3, arg4, arg0, arg2);
		}
	}
}
