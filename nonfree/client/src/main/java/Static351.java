import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
	public static int anInt9535 = 0;

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "[I")
	public static final int[] anIntArray714 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([BI)[B")
	public static byte[] method7783(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub21 local8 = new Class6_Sub21(arg0);
		@Pc(12) int local12 = local8.method6069();
		@Pc(16) int local16 = local8.method6036();
		if (local16 < 0 || Static96.anInt1857 != 0 && local16 > Static96.anInt1857) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(92) byte[] local92 = new byte[local16];
			local8.method6053(local16, local92);
			return local92;
		} else {
			@Pc(43) int local43 = local8.method6036();
			if (local43 < 0 || Static96.anInt1857 != 0 && local43 > Static96.anInt1857) {
				throw new RuntimeException();
			}
			@Pc(60) byte[] local60 = new byte[local43];
			if (local12 == 1) {
				Static576.method7699(local60, local43, arg0, local16);
			} else {
				@Pc(74) Class357 local74 = Static295.aClass357_1;
				synchronized (Static295.aClass357_1) {
					Static295.aClass357_1.method7818(local8, local60);
				}
			}
			return local60;
		}
	}
}
