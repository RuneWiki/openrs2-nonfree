import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!ar;")
	public static Class14 aClass14_35;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "[I")
	public static int[] anIntArray651;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public static int anInt6446;

	@OriginalMember(owner = "client!vk", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
	public static int anInt6454 = -1;

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "[Lclient!io;")
	public static final Class110[] aClass110Array1 = new Class110[50];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method5549() {
		Static305.aClass1_Sub21_Sub2_3.method5757(231);
		Static305.aClass1_Sub21_Sub2_3.method5698(Static248.anInt27);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!lm;I)Lclient!cl;")
	public static Class34 method5550(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1) {
		@Pc(8) byte[] local8 = arg1.method3014(arg0);
		return local8 == null ? null : new Class34(local8);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BII)V")
	public static void method5551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(6, arg1);
		local12.method4783();
		local12.anInt5461 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)Z")
	public static boolean method5557(@OriginalArg(0) int arg0) {
		if (arg0 == 21 || arg0 == 20 || arg0 == 26 || arg0 == 24 || arg0 == 31) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 43 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([J[IZ)V")
	public static void method5558(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static146.method4164(arg0, arg0.length - 1, arg1, 0);
	}
}
