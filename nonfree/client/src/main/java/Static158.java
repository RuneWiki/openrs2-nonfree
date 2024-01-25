import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hp", name = "E", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_90 = new Class151("K", "T", "K", "K");

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
	public static int anInt2643 = 0;

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
	public static int anInt2644 = 0;

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "[[B")
	public static final byte[][] aByteArrayArray21 = new byte[250][];

	@OriginalMember(owner = "client!hp", name = "J", descriptor = "Z")
	public static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIF[FIIFII)V")
	public static void method2208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg5 - arg2;
		@Pc(13) int local13 = arg8 - arg6;
		@Pc(17) int local17 = arg1 - arg0;
		@Pc(38) float local38 = (float) local9 * arg4[1] + arg4[0] * (float) local17 + (float) local13 * arg4[2];
		@Pc(59) float local59 = arg4[3] * (float) local17 + (float) local9 * arg4[4] + arg4[5] * (float) local13;
		@Pc(95) float local95 = arg4[6] * (float) local17 + arg4[7] * (float) local9 + (float) local13 * arg4[8];
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local95) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local106 *= arg3;
		}
		@Pc(120) float local120 = local59 + arg7 + 0.5F;
		@Pc(137) float local137;
		if (arg9 == 1) {
			local137 = local106;
			local106 = -local120;
			local120 = local137;
		} else if (arg9 == 2) {
			local120 = -local120;
			local106 = -local106;
		} else if (arg9 == 3) {
			local137 = local106;
			local106 = local120;
			local120 = -local137;
		}
		Static139.aFloat34 = local120;
		Static368.aFloat89 = local106;
	}
}
