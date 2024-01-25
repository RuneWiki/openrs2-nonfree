import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!po", name = "u", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!po", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray138 = new int[128][128];

	@OriginalMember(owner = "client!po", name = "y", descriptor = "[I")
	public static final int[] anIntArray482 = new int[4];

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!tq;I)I")
	public static int method4553(@OriginalArg(0) Class2_Sub17_Sub1 arg0) {
		@Pc(12) int local12 = arg0.method5577(2);
		@Pc(19) int local19;
		if (local12 == 0) {
			local19 = 0;
		} else if (local12 == 1) {
			local19 = arg0.method5577(5);
		} else if (local12 == 2) {
			local19 = arg0.method5577(8);
		} else {
			local19 = arg0.method5577(11);
		}
		return local19;
	}
}
