import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!li", name = "b", descriptor = "[I")
	public static int[] anIntArray704;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "[I")
	public static final int[] anIntArray703 = new int[8];

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Z")
	public static boolean method8996() {
		return Static556.anInt9319 >= 1;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I")
	public static int method8998(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
