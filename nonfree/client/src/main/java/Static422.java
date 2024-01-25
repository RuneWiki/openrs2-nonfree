import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)V")
	public static void method4717(@OriginalArg(0) int arg0) {
		Static436.anInt7297 = arg0;
		Static280.anInt4669 = -1;
		Static280.anInt4669 = -1;
		Static368.method5132();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB[BIII)V")
	public static void method4718(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(16) int local16 = arg0 - arg2 >> 2;
		arg3 += arg2;
		while (true) {
			local16--;
			if (local16 < 0) {
				local16 = arg0 - arg2 & 0x3;
				while (true) {
					local16--;
					if (local16 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(25) int local25 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg1[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg1[local30] = 1;
			arg3 = local35 + 1;
			arg1[local35] = 1;
		}
	}
}
