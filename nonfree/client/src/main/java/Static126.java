import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "[Lclient!jv;")
	public static Class181[] aClass181Array1;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "[I")
	public static int[] anIntArray130 = new int[2];

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
	public static int anInt2811 = 0;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Z")
	public static boolean method2599(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V")
	public static void method2601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static429.anIntArrayArray47 != null) {
			Static429.anIntArrayArray47[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static15.aShortArrayArray1 != null) {
			Static15.aShortArrayArray1[arg0][arg1] = (short) arg3;
		}
		if (Static237.aByteArrayArray14 != null) {
			Static237.aByteArrayArray14[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)S")
	public static short method2602(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? local15 * (127 - local19) >> 7 : local19 * local15 >> 7;
		@Pc(48) int local48 = local37 + local19;
		@Pc(57) int local57;
		if (local48 == 0) {
			local57 = local37 << 1;
		} else {
			local57 = (local37 << 8) / local48;
		}
		return (short) (local9 << 10 | local57 >> 4 << 7 | local48);
	}
}
