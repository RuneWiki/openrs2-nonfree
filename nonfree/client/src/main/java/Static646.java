import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static646 {

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!vha", name = "e", descriptor = "Lclient!o;")
	public static final Class260 aClass260_13 = new Class260(1);

	@OriginalMember(owner = "client!vha", name = "j", descriptor = "I")
	public static int anInt10621 = 2;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIB)Z")
	public static boolean method9071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(FI)F")
	public static float method9074(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}
}
