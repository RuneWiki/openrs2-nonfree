import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public static int anInt4299;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public static int anInt4300;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public static int anInt4301;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_105 = new Class129(30, 10);

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_73 = new Class198("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public static int anInt4302 = 1;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[F")
	public static final float[] aFloatArray8 = new float[16];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIJIILclient!ta;Lclient!fi;I)V")
	public static void method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) Class76 arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg0 * arg0 + arg2 * arg2;
		if ((long) local12 > arg3) {
			return;
		}
		@Pc(28) int local28 = Math.min(arg6.anInt2127 / 2, arg6.anInt2106 / 2);
		if (local28 * local28 >= local12) {
			Static280.method3468(arg5, arg0, arg4, Static49.aClass49Array3[arg1], arg7, arg6, arg2);
			return;
		}
		local28 -= 10;
		@Pc(48) int local48;
		if (Static449.anInt7379 == 4) {
			local48 = (int) Static99.aFloat33 & 0x3FFF;
		} else {
			local48 = (int) Static99.aFloat33 + Static65.anInt5018 & 0x3FFF;
		}
		@Pc(61) int local61 = Class30.anIntArray38[local48];
		@Pc(65) int local65 = Class30.anIntArray37[local48];
		if (Static449.anInt7379 != 4) {
			local65 = local65 * 256 / (Static430.anInt7181 + 256);
			local61 = local61 * 256 / (Static430.anInt7181 + 256);
		}
		@Pc(96) int local96 = arg2 * local61 + arg0 * local65 >> 15;
		@Pc(106) int local106 = arg2 * local65 - local61 * arg0 >> 15;
		@Pc(112) double local112 = Math.atan2((double) local96, (double) local106);
		@Pc(119) int local119 = (int) (Math.sin(local112) * (double) local28);
		@Pc(126) int local126 = (int) ((double) local28 * Math.cos(local112));
		Static44.aClass49Array2[arg1].method5786((float) arg6.anInt2127 / 2.0F + (float) arg7 + (float) local119, (float) -local126 + (float) arg4 + (float) arg6.anInt2106 / 2.0F, 4096, (int) (-local112 / 6.283185307179586D * 65535.0D));
	}
}
