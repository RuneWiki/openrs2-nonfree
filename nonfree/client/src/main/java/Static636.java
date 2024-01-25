import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static636 {

	@OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
	public static int anInt10317;

	@OriginalMember(owner = "client!wia", name = "r", descriptor = "[I")
	public static int[] anIntArray827;

	@OriginalMember(owner = "client!wia", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean832 = false;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(III)Z")
	public static boolean method8771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static598.method8368(arg1, arg0) || Static130.method1926(arg1, arg0);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V")
	public static void method8772() {
		Static451.method6704(false);
		if (Static431.anInt773 >= 0 && Static431.anInt773 != 0) {
			Static590.method8288(false, Static431.anInt773);
			Static431.anInt773 = -1;
		}
	}
}
