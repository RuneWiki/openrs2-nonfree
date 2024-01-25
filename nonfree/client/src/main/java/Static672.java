import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static672 {

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "F")
	public static float aFloat216;

	@OriginalMember(owner = "client!wp", name = "O", descriptor = "Lclient!oq;")
	public static Class268 aClass268_6;

	@OriginalMember(owner = "client!wp", name = "bb", descriptor = "I")
	public static int anInt10801;

	@OriginalMember(owner = "client!wp", name = "nb", descriptor = "[Lclient!ob;")
	public static Class259[] aClass259Array1;

	@OriginalMember(owner = "client!wp", name = "P", descriptor = "[S")
	public static short[] aShortArray158 = new short[256];

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIIII)V")
	public static void method8993(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static107.method2043(arg3)) {
			Static535.method7516(-1, arg0, arg1, Static648.aClass345ArrayArray2[arg3], arg2);
		}
	}
}
