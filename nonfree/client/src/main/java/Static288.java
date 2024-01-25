import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public static int anInt4713;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	public static final int anInt4710 = 0;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "[I")
	public static final int[] anIntArray454 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public static void method4061(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg0, 11);
		local8.method770();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZ)I")
	public static int method4062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class6_Sub13 local8 = Static59.method44(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && local8.anIntArray172.length > arg0) {
			return local8.anIntArray172[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBI)Z")
	public static boolean method4064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static275.method3945(arg1, arg0) & Static544.method7514(arg1, arg0);
	}
}
