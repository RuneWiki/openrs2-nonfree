import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static414 {

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "Lclient!wb;")
	public static Class258 aClass258_2;

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
	public static int anInt6927 = 13156520;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "Lclient!ha;")
	public static final Class6_Sub15 aClass6_Sub15_7 = new Class6_Sub15(new byte[5000]);

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "[I")
	public static final int[] anIntArray597 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
	public static int anInt6928 = -1;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZI)I")
	public static int method5612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static179.aByteArrayArrayArray3[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static179.aByteArrayArrayArray3[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
