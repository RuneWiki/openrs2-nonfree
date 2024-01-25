import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static200 {

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "F")
	public static float aFloat100 = 1024.0F;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BC)I")
	public static int method3766(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class106.anIntArray229.length > arg0 ? Class106.anIntArray229[arg0] : -1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method3771() {
		Static177.aBoolean326 = true;
	}
}
