import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!pca", name = "M", descriptor = "[I")
	public static int[] anIntArray553;

	@OriginalMember(owner = "client!pca", name = "xb", descriptor = "I")
	public static int anInt6551;

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "Lclient!fo;")
	public static final Class107 aClass107_8 = new Class107();

	@OriginalMember(owner = "client!pca", name = "D", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BI)V")
	public static void method5525(@OriginalArg(1) int arg0) {
		Static204.anInt3473 = arg0;
		@Pc(7) Class332 local7 = Static189.aClass332_83;
		synchronized (Static189.aClass332_83) {
			Static189.aClass332_83.method7510();
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIBI)I")
	public static int method5527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 4095 - arg2;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}
}
