import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
	public static int anInt5668;

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "[[Lclient!mi;")
	public static Class3_Sub21[][] aClass3_Sub21ArrayArray3;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
	public static int anInt5667 = 0;

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "[[I")
	public static int[][] anIntArrayArray75 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!rg;ZI)V")
	public static void method4617(@OriginalArg(0) Class151 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(22) int local22 = arg0.anInt4720 == 0 ? arg0.anInt4773 : arg0.anInt4720;
		@Pc(34) int local34 = arg0.anInt4713 == 0 ? arg0.anInt4751 : arg0.anInt4713;
		Static235.method3990(arg0.anInt4800, Static96.aClass151ArrayArray1[arg0.anInt4800 >> 16], local34, arg1, local22);
		if (arg0.aClass151Array2 != null) {
			Static235.method3990(arg0.anInt4800, arg0.aClass151Array2, local34, arg1, local22);
		}
		@Pc(68) Class3_Sub3 local68 = (Class3_Sub3) Static205.aClass30_23.method663((long) arg0.anInt4800);
		if (local68 != null) {
			Static58.method944(arg1, local34, local68.anInt183, local22);
		}
	}
}
