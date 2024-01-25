import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static604 {

	@OriginalMember(owner = "client!uha", name = "E", descriptor = "Lclient!eca;")
	public static Class45 aClass45_2;

	@OriginalMember(owner = "client!uha", name = "H", descriptor = "[I")
	public static final int[] anIntArray543 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIB)I")
	public static int method8299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static300.anIntArray311[arg1 & 0x3] : Static419.anIntArray426[arg1 & 0x3];
	}
}
