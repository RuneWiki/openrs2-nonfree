import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "Lclient!lc;")
	public static Class98 aClass98_136;

	@OriginalMember(owner = "client!rl", name = "P", descriptor = "[[I")
	public static int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!rl", name = "R", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!rl", name = "S", descriptor = "Lclient!lc;")
	public static Class98 aClass98_137;

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString154 = "yellow:";

	@OriginalMember(owner = "client!rl", name = "V", descriptor = "[I")
	public static int[] anIntArray425 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
	public static void method3667() {
		anIntArray425 = null;
		anIntArray424 = null;
		anIntArrayArray40 = null;
		aString154 = null;
		aClass98_136 = null;
		aClass98_137 = null;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V")
	public static void method3668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static221.anIntArray393[arg0] = arg1;
		@Pc(21) Class4_Sub33 local21 = (Class4_Sub33) Static140.aClass97_12.method2360((long) arg0);
		if (local21 == null) {
			local21 = new Class4_Sub33(Static133.method2163() + 500L);
			Static140.aClass97_12.method2364(local21, (long) arg0);
		} else {
			local21.aLong196 = Static133.method2163() + 500L;
		}
	}
}
