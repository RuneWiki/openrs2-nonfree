import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static int anInt3224;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static volatile int anInt3218 = 0;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt3220 = -1;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
	public static boolean aBoolean238 = true;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43 = new String[200];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BII)I")
	public static int method2599(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static133.method2240(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method2601() {
		aBoolean238 = true;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBZZI)V")
	public static void method2602(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static166.method2877(Static62.aClass41_Sub1Array1.length - 1, arg2, arg1, arg3, arg0, 0);
	}
}
