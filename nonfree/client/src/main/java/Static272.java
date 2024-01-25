import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "Z")
	public static boolean aBoolean399 = false;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[250][];

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "[I")
	public static final int[] anIntArray396 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
	public static int anInt5241 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I")
	public static int method4621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
