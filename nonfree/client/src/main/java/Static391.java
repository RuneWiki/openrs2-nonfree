import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Z")
	public static boolean aBoolean438 = true;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[2];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)S")
	public static short method5048(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 <= 64 ? local15 * local19 >> 7 : (127 - local19) * local15 >> 7;
		@Pc(41) int local41 = local37 + local19;
		@Pc(53) int local53;
		if (local41 == 0) {
			local53 = local37 << 1;
		} else {
			local53 = (local37 << 8) / local41;
		}
		return (short) (local41 | local9 << 10 | local53 >> 4 << 7);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!kq;III)V")
	public static void method5049(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1 local8 = arg0.method4428(Static582.aClass33_13);
		if (local8 == null) {
			return;
		}
		Static582.aClass33_13.KA(arg2, arg1, arg2 + arg0.anInt5035, arg1 - -arg0.anInt4994);
		if (Static102.anInt10343 >= 3) {
			Static582.aClass33_13.A(-16777216, local8, arg2, arg1);
		} else {
			Static217.aClass17_32.method5247((float) arg0.anInt5035 / 2.0F + (float) arg2, (float) arg1 + (float) arg0.anInt4994 / 2.0F, ((int) -Static642.aFloat230 & 0x3FFF) << 2, local8, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
	public static int method5050() {
		return Static106.anInt2134 == 1 ? Static118.anInt2257 : Static461.anInt7413;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[SI)[S")
	public static short[] method5051(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static685.method6468(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z")
	public static boolean method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static16.method300(arg0, arg1) | (arg1 & 0x2000) != 0 | Static225.method3274(arg1, arg0)) & Static519.method7019(arg1, arg0);
	}
}
