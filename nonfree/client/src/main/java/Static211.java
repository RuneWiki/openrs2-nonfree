import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "[I")
	public static int[] anIntArray738;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray24 = new byte[1000][];

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(II)V")
	public static void method7570(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(2, (long) arg0);
		local9.method2194();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZIZ)V")
	public static void method7571(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static538.anInt8867--;
			if (Static538.anInt8867 == 0) {
				Static363.anIntArray518 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static73.anInt1386--;
		if (Static73.anInt1386 == 0) {
			anIntArray738 = null;
			return;
		}
	}
}
