import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Lclient!gq;")
	public static final Class88 aClass88_7 = new Class88(128);

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
	public static final int anInt3978 = -1;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIII)V")
	public static void method3367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) Static158.aClass207_24.method5555((long) arg3);
		if (local12 == null) {
			local12 = new Class1_Sub1();
			Static158.aClass207_24.method5552(local12, (long) arg3);
		}
		if (local12.anIntArray3.length <= arg1) {
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(43) int[] local43 = new int[arg1 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray3.length; local45++) {
				local38[local45] = local12.anIntArray3[local45];
				local43[local45] = local12.anIntArray4[local45];
			}
			for (@Pc(75) int local75 = local12.anIntArray3.length; local75 < arg1; local75++) {
				local38[local75] = -1;
				local43[local75] = 0;
			}
			local12.anIntArray4 = local43;
			local12.anIntArray3 = local38;
		}
		local12.anIntArray3[arg1] = arg2;
		local12.anIntArray4[arg1] = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public static void method3368() {
		@Pc(1) Class220 local1 = Static112.aClass220_1;
		synchronized (Static112.aClass220_1) {
			Static9.anInt116 = Static140.anInt2707;
			Static134.anInt2646++;
			Static208.anInt4358 = Static256.anInt5258;
			Static28.anInt538 = Static346.anInt6679;
			Static171.anInt3612 = Static298.anInt6015;
			Static289.anInt5796 = Static28.anInt530;
			Static27.anInt4213 = Static48.anInt1210;
			Static250.aLong153 = Static151.aLong75;
			Static298.anInt6015 = 0;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Lclient!gs;")
	public static Class89 method3370(@OriginalArg(0) int arg0) {
		@Pc(5) Class37 local5 = Static265.aClass37_86;
		@Pc(22) Class89 local22;
		synchronized (Static265.aClass37_86) {
			local22 = (Class89) Static265.aClass37_86.method915((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(38) byte[] local38 = Static302.aClass134_133.method3009(arg0, 3);
		local22 = new Class89();
		if (local38 != null) {
			local22.method1711(new Class1_Sub21(local38));
		}
		@Pc(53) Class37 local53 = Static265.aClass37_86;
		synchronized (Static265.aClass37_86) {
			Static265.aClass37_86.method922((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)V")
	public static void method3371(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(2, arg0);
		local8.method4782();
	}
}
