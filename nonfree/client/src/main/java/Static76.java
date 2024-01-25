import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)V")
	public static void method1689(@OriginalArg(0) int arg0) {
		if (!Static457.method7117(arg0)) {
			return;
		}
		@Pc(14) Class93[] local14 = Static336.aClass93ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class93 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt2772 = 0;
				local26.anInt2737 = 0;
				local26.anInt2795 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BIIII)I")
	public static int method1690(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class179.anIntArray757[arg0 * 8192 / arg2] >> 1;
		return (local24 * arg3 >> 16) + (arg1 * (65536 - local24) >> 16);
	}
}
