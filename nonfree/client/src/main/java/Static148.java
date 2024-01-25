import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!vs;")
	public static Class363 aClass363_3;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
	public static final boolean aBoolean191 = false;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method2715() {
		Static436.aClass357_3.method8389();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)I")
	public static int method2716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static513.aByteArrayArrayArray18[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static513.aByteArrayArrayArray18[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
