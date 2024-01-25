import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static228 {

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_58 = new Class98(29, -1);

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!in", name = "e", descriptor = "[I")
	public static final int[] anIntArray349 = new int[13];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
	public static void method3571(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static431.aBooleanArray26[arg0]) {
			Static24.aClass248_4.method5786(arg0);
			Static360.aClass97ArrayArray2[arg0] = null;
			Static140.aClass97ArrayArray1[arg0] = null;
			Static431.aBooleanArray26[arg0] = false;
		}
	}
}
