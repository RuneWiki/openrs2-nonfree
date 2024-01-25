import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
	public static int anInt2939 = 2;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
	public static int anInt2940 = 0;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BI)V")
	public static void method2648(@OriginalArg(1) int arg0) {
		Static370.method5496(Static48.aClass33_14.method797(Static131.anInt2839), arg0);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZI)Z")
	public static boolean method2649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
