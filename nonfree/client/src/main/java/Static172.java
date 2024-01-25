import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
	public static int anInt3554 = -1;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(II)I")
	public static int method2853(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(II)I")
	public static int method2873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static360.anIntArrayArray52 == null ? 0 : Static360.anIntArrayArray52[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "(B)V")
	public static void method2877() {
		Static332.aBoolean408 = true;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)Z")
	public static boolean method2909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static430.method5720(arg1, arg0) | (arg1 & 0x70000) != 0 || Static157.method2625(arg1, arg0);
	}
}
