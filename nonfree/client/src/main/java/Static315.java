import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static315 {

	@OriginalMember(owner = "client!pv", name = "K", descriptor = "Z")
	public static final boolean aBoolean377 = false;

	@OriginalMember(owner = "client!pv", name = "O", descriptor = "I")
	public static int anInt5650 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZI)Z")
	public static boolean method4350(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(B)V")
	public static void method4351() {
		Static132.anIntArray173 = Static386.method5225(0.4F);
	}
}
