import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_16 = new Class12(38, 7);

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "[I")
	public static final int[] anIntArray10 = new int[256];

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	public static int method166(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
