import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public static int anInt1405;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public static int anInt1406;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZLclient!jc;)Lclient!pha;")
	public static Class286 method1381(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(13) int local13 = arg0.method7717(-1978450544);
		return new Class286(local13);
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V")
	public static void method1382() {
		Static553.anInt9258 = 0;
		Static605.anInt7003 = -1;
		Static60.anInt998 = -1;
	}
}
