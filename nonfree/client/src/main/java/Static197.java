import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!afa;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
	public static int anInt3594 = 4;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z")
	public static boolean method3296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
	public static void method3299() {
		Static643.aClass5_Sub1_Sub13_3 = new Class5_Sub1_Sub13(Static184.aClass131_6.method3168(Static375.anInt7800), "", Static586.anInt9462, 1010, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)Z")
	public static boolean method3300(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
