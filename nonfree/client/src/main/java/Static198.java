import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static198 {

	@OriginalMember(owner = "client!gha", name = "A", descriptor = "[Lclient!qia;")
	public static Class289[] aClass289Array2;

	@OriginalMember(owner = "client!gha", name = "C", descriptor = "Lclient!k;")
	public static final Class187 aClass187_11 = new Class187("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!gha", name = "J", descriptor = "I")
	public static int anInt8358 = 0;

	@OriginalMember(owner = "client!gha", name = "L", descriptor = "[F")
	public static final float[] aFloatArray83 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gha", name = "M", descriptor = "Z")
	public static boolean aBoolean709 = false;

	@OriginalMember(owner = "client!gha", name = "N", descriptor = "[I")
	public static final int[] anIntArray476 = new int[16];

	@OriginalMember(owner = "client!gha", name = "f", descriptor = "(B)V")
	public static void method7145() {
		Static568.anIntArray365 = null;
		Static278.anIntArray295 = null;
		Static227.anIntArray211 = null;
		Static576.aBoolean795 = false;
		Static348.anIntArray367 = null;
		Static60.anIntArray443 = null;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)I")
	public static int method7148(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!tia;II)V")
	public static void method7149(@OriginalArg(0) Class5_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static311.anInt5915 = 0;
		Static653.aBoolean895 = false;
		Static133.method2375(arg0);
		Static135.method2399(arg0);
		if (Static653.aBoolean895) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt9230) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt9230 + " psize:" + arg1);
		}
	}
}
