import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
	public static int anInt6702;

	@OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
	public static int anInt6705;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_306 = new Class22(96, 2);

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_307 = new Class22(94, 0);

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!ul", name = "F", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_51 = new Class68(8);

	@OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
	public static int anInt6704 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIBII)V")
	public static void method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg1; local7++) {
			Static251.method3640(arg0, arg2, arg3, Static96.anIntArrayArray21[local7]);
		}
	}
}
