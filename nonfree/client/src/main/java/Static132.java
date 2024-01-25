import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
	public static int anInt2425;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	public static void method1940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static107.anInt2008 = arg1 - Static292.anInt6142;
		Static202.anInt3606 = arg0 - Static292.anInt6148;
	}
}
