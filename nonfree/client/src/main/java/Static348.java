import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V")
	public static void method5606(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static106.aBooleanArray7[arg0]) {
			Static414.aClass178_126.method3824(arg0);
			Static294.aClass95ArrayArray3[arg0] = null;
			Static216.aClass95ArrayArray2[arg0] = null;
			Static106.aBooleanArray7[arg0] = false;
		}
	}
}
