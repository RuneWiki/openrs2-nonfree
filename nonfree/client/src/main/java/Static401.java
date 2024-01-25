import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!nia", name = "C", descriptor = "I")
	public static int anInt6632;

	@OriginalMember(owner = "client!nia", name = "L", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZI)Z")
	public static boolean method5573(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!nia", name = "h", descriptor = "(I)V")
	public static void method5574() {
		Static643.anInt10566 = -1;
		Static585.anInt9524 = 0;
		Static622.anInt10293 = -1;
		Static318.anInt5310 = -1;
	}
}
