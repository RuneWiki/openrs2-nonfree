import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_21 = new Class186(104, -2);

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_22 = new Class186(25, 8);

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_23 = new Class186(93, 0);

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public static int anInt667 = -1;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
	public static final int[] anIntArray56 = new int[500];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)I")
	public static int method523(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BIII)I")
	public static int method528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static327.aByteArrayArrayArray11[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static327.aByteArrayArrayArray11[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
