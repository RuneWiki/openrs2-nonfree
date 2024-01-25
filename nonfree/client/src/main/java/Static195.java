import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_6 = new Class316(8, 4);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Z")
	public static boolean method2977(@OriginalArg(0) int arg0) {
		if (arg0 == 18 || arg0 == 20 || arg0 == 12 || arg0 == 17 || arg0 == 8) {
			return true;
		} else {
			return arg0 == 3 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
	public static void method2978() {
		Static321.aClass187_22.method3801();
		Static25.aClass187_5.method3801();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!vg;IIB)V")
	public static void method2979(@OriginalArg(0) Class341 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static202.anInt4030 = arg1;
		Static64.aClass341_5 = arg0;
		Static302.anInt5240 = arg2;
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)I")
	public static int method2980() {
		if (Static264.aFrame2 == null) {
			return Static342.aBoolean452 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
