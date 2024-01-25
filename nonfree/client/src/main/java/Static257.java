import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "[I")
	public static int[] anIntArray822;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	public static void method7981(@OriginalArg(1) int arg0) {
		if (-1 != arg0 && Static236.aBooleanArray18[arg0]) {
			Static503.aClass160_97.method4225(arg0);
			Static352.aClass309ArrayArray2[arg0] = null;
			Static539.aClass309ArrayArray3[arg0] = null;
			Static236.aBooleanArray18[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)S")
	public static short method7982(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? local15 * (127 - local19) >> 7 : local15 * local19 >> 7;
		@Pc(49) int local49 = local19 + local37;
		@Pc(58) int local58;
		if (local49 == 0) {
			local58 = local37 << 1;
		} else {
			local58 = (local37 << 8) / local49;
		}
		return (short) (local49 | local58 >> 4 << 7 | local9 << 10);
	}
}
