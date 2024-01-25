import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static136 {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
	public static int anInt3505;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
	public static void method3118(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static171.aBooleanArray11[arg0]) {
			Static399.aClass181_76.method5044(arg0);
			Static85.aClass108ArrayArray2[arg0] = null;
			Static42.aClass108ArrayArray1[arg0] = null;
			Static171.aBooleanArray11[arg0] = false;
		}
	}
}
