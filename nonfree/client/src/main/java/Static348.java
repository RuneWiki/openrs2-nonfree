import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!gia;")
	public static Class136 aClass136_3;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public static int anInt5924 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	public static void method5336(@OriginalArg(1) int arg0) {
		Static51.anInt617 = -1;
		Static488.anInt8263 = arg0;
		Static51.anInt617 = -1;
		Static62.method784();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Z")
	public static boolean method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static116.method2163(arg1, arg0) | (arg0 & 0x70000) != 0 || Static234.method4147(arg0, arg1);
	}
}
