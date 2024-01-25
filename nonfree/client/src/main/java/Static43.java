import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
	public static int anInt5304;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "[I")
	public static final int[] anIntArray412 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
	public static final int[] anIntArray413 = new int[5];

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_175 = new Class217(41, 3);

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "Z")
	public static boolean aBoolean407 = true;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ct;Lclient!ct;Lclient!ct;I)V")
	public static void method4863(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) Class30 arg2) {
		Static209.aClass30_63 = arg1;
		Static240.method4477(arg0, arg2);
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(B)V")
	public static void method4865() {
		for (@Pc(6) Class32_Sub6 local6 = (Class32_Sub6) Static16.aClass195_1.method5301(); local6 != null; local6 = (Class32_Sub6) Static16.aClass195_1.method5301()) {
			Static315.method5397(local6);
		}
		@Pc(29) int local29;
		@Pc(28) int local28;
		if (Static150.method4956()) {
			local28 = 3;
			local29 = 0;
		} else {
			local28 = Static75.anInt3288;
			local29 = Static75.anInt3288;
		}
		Static44.method1075();
		for (@Pc(42) int local42 = local29; local42 <= local28; local42++) {
			Static44.method1073();
			Static44.method1069(local42);
			Static44.method1070(local42);
		}
		Static44.method1065();
		Static44.method1071();
	}
}
