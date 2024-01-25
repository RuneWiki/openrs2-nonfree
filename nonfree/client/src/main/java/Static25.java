import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "[I")
	public static final int[] anIntArray38 = new int[1000];

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	public static void method446(@OriginalArg(1) int arg0) {
		Static323.anIntArray421 = new int[arg0];
		Static204.anIntArray238 = new int[arg0];
		Static326.anIntArray423 = new int[arg0];
		Static381.anIntArray484 = new int[arg0];
		Static177.anIntArray207 = new int[arg0];
	}
}
