import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "[I")
	public static final int[] anIntArray189 = new int[3];

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "[I")
	public static final int[] anIntArray190 = new int[1000];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)V")
	public static void method3153(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static172.aBooleanArray7[arg0]) {
			Static9.aClass348_7.method7952(arg0);
			Static535.aClass155ArrayArray2[arg0] = null;
			Static264.aClass155ArrayArray1[arg0] = null;
			Static172.aBooleanArray7[arg0] = false;
		}
	}
}
