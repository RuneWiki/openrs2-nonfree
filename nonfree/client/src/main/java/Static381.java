import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "[J")
	public static long[] aLongArray16;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "[I")
	public static final int[] anIntArray427 = new int[2];

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "[I")
	public static final int[] anIntArray428 = new int[4096];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([BZ)[B")
	public static byte[] method6149(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static653.method6858(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public static void method6150() {
		Static383.aClass5_12.L(Static199.anInt3921, Static262.aClass3_Sub27_12.aClass21_Sub20_1.method6682() == 1 ? Static271.anInt4937 + 256 << 2 : -1, 0);
	}
}
