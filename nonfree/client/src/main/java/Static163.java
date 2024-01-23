import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static163 {

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	private static int anInt3820 = 2;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "()I")
	public static int method2834() {
		return anInt3820;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void method2836(@OriginalArg(0) int arg0) {
		anInt3820 = arg0;
	}
}
