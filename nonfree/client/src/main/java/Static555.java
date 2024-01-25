import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static555 {

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	public static int anInt8559 = 0;

	@OriginalMember(owner = "client!so", name = "T", descriptor = "Z")
	public static boolean aBoolean668 = false;

	@OriginalMember(owner = "client!so", name = "bb", descriptor = "[I")
	public static final int[] anIntArray598 = new int[4096];

	@OriginalMember(owner = "client!so", name = "fb", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_135 = new Class216(21, 3);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	public static void method7388() {
		Static380.aClass352_47.method7663(50);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(CI)I")
	public static int method7393(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class333.anIntArray587.length ? Class333.anIntArray587[arg0] : -1;
	}
}
