import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "[F")
	public static final float[] aFloatArray3 = new float[16];

	@OriginalMember(owner = "client!br", name = "e", descriptor = "I")
	public static int anInt889 = -50;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "J")
	public static long aLong47 = 0L;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "I")
	public static final int anInt890 = 1401;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BIIILclient!ie;)V")
	public static void method837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub29 arg3) {
		@Pc(14) long local14 = (long) (arg0 | arg2 << 28 | arg1 << 14);
		@Pc(20) Class5_Sub24 local20 = (Class5_Sub24) Static109.aClass335_12.method7766(local14);
		if (local20 == null) {
			local20 = new Class5_Sub24();
			Static109.aClass335_12.method7770(local14, local20);
			local20.aClass124_30.method2574(arg3);
			return;
		}
		@Pc(43) Class219 local43 = Static259.aClass135_1.method2776(arg3.anInt3940);
		@Pc(46) int local46 = local43.anInt6161;
		if (local43.anInt6168 == 1) {
			local46 *= arg3.anInt3941 + 1;
		}
		for (@Pc(70) Class5_Sub29 local70 = (Class5_Sub29) local20.aClass124_30.method2572(); local70 != null; local70 = (Class5_Sub29) local20.aClass124_30.method2569()) {
			local43 = Static259.aClass135_1.method2776(local70.anInt3940);
			@Pc(80) int local80 = local43.anInt6161;
			if (local43.anInt6168 == 1) {
				local80 *= local70.anInt3941 + 1;
			}
			if (local46 > local80) {
				Static332.method5131(arg3, local70);
				return;
			}
		}
		local20.aClass124_30.method2574(arg3);
	}
}
