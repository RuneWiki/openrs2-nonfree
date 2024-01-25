import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	public static int anInt6396;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public static int anInt6387 = 0;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public static int anInt6389 = 0;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "[I")
	public static final int[] anIntArray414 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZI)I")
	public static int method5317(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class6_Sub37 local8 = Static375.method5604(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && local8.anIntArray408.length > arg0) {
			return local8.anIntArray408[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BII)Z")
	public static boolean method5318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
