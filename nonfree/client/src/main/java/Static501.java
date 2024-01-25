import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static501 {

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)V")
	public static void method4262(@OriginalArg(1) int arg0) {
		Static137.anInt2914 = 3;
		Static447.anInt8208 = 100;
		Static221.anInt4650 = -1;
		Static339.anInt6292 = arg0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIII)I")
	public static int method4264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg0) {
			return arg2;
		} else if (arg1 >= arg0) {
			return arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method4268() {
		return Static218.aBoolean366 || Static567.aClass6_Sub42_4 == null ? "" : Static567.aClass6_Sub42_4.aString102;
	}
}
