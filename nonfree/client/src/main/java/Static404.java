import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!ns", name = "hc", descriptor = "I")
	public static int anInt5096;

	@OriginalMember(owner = "client!ns", name = "uc", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "(I)V")
	public static void method4331(@OriginalArg(0) int arg0) {
		Static432.anInt7402 = arg0;
	}
}
