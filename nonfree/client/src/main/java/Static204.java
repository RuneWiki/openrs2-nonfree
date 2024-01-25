import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
	public static int anInt7303;

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "Lclient!js;")
	public static Class14_Sub1 aClass14_Sub1_4;

	@OriginalMember(owner = "client!kk", name = "Jb", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[128][128];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	public static void method5978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static125.method2231(arg0)) {
			Static83.method1586(Static437.aClass251ArrayArray2[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)I")
	public static int method5991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = (local12 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8;
		@Pc(34) int local34 = 255 - local12;
		return (((arg1 & 0xFF00FF) * local34 & 0xFF00FF00 | (arg1 & 0xFF00) * local34 & 0xFF0000) >>> 8) + local30;
	}
}
