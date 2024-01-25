import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[16];

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!dm;")
	public static final Class73 aClass73_54 = new Class73();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public static final int anInt6478 = 1401;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
	public static int anInt6481 = 100;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIBI)V")
	public static void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static108.method2267(arg4, Static507.anInt9124, Static234.anInt4897);
		@Pc(17) int local17 = Static108.method2267(arg1, Static507.anInt9124, Static234.anInt4897);
		@Pc(23) int local23 = Static108.method2267(arg0, Static251.anInt5168, anInt6481);
		@Pc(29) int local29 = Static108.method2267(arg5, Static251.anInt5168, anInt6481);
		@Pc(37) int local37 = Static108.method2267(arg3 + arg4, Static507.anInt9124, Static234.anInt4897);
		@Pc(46) int local46 = Static108.method2267(arg1 - arg3, Static507.anInt9124, Static234.anInt4897);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static118.method2461(Static228.anIntArrayArray46[local48], local29, arg2, local23);
		}
		for (@Pc(69) int local69 = local17; local69 > local46; local69--) {
			Static118.method2461(Static228.anIntArrayArray46[local69], local29, arg2, local23);
		}
		@Pc(91) int local91 = Static108.method2267(arg0 + arg3, Static251.anInt5168, anInt6481);
		@Pc(100) int local100 = Static108.method2267(arg5 - arg3, Static251.anInt5168, anInt6481);
		for (@Pc(102) int local102 = local37; local102 <= local46; local102++) {
			@Pc(108) int[] local108 = Static228.anIntArrayArray46[local102];
			Static118.method2461(local108, local91, arg2, local23);
			Static118.method2461(local108, local29, arg2, local100);
		}
	}
}
