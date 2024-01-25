import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static431 {

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Lclient!la;")
	public static Class207 aClass207_75;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
	public static int anInt6172 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)V")
	public static void method5476(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static490.aBooleanArray25[arg0]) {
			Static546.aClass207_114.method4671(arg0);
			Static519.aClass295ArrayArray2[arg0] = null;
			Static321.aClass295ArrayArray1[arg0] = null;
			Static490.aBooleanArray25[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)Z")
	public static boolean method5477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static599.method8607(arg0, arg1) & Static173.method2686(arg1, arg0);
	}
}
