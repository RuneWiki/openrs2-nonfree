import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static574 {

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "Z")
	public static boolean aBoolean683 = false;

	@OriginalMember(owner = "client!tja", name = "j", descriptor = "[I")
	public static final int[] anIntArray632 = new int[3];

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(BI)V")
	public static void method7983(@OriginalArg(1) int arg0) {
		if (Static227.anIntArray100 == null || arg0 > Static227.anIntArray100.length) {
			Static227.anIntArray100 = new int[arg0];
		}
	}
}
