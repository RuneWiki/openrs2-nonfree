import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static220 {

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public static int anInt4364 = 0;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "[I")
	public static final int[] anIntArray311 = new int[250];

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!qs;Lclient!qs;)V")
	public static void method3857(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg0.aClass5_248 != null) {
			arg0.method5803();
		}
		arg0.aClass5_247 = arg1;
		arg0.aClass5_248 = arg1.aClass5_248;
		arg0.aClass5_248.aClass5_247 = arg0;
		arg0.aClass5_247.aClass5_248 = arg0;
	}
}
