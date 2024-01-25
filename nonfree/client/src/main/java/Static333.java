import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qt", name = "Zc", descriptor = "I")
	public static int anInt6155 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B[B)[B")
	public static byte[] method4851(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(arg0);
		@Pc(12) int local12 = local8.method6053();
		@Pc(23) int local23 = local8.method6014();
		if (local23 < 0 || Static243.anInt4636 != 0 && Static243.anInt4636 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(92) byte[] local92 = new byte[local23];
			local8.method6032(local92, local23);
			return local92;
		} else {
			@Pc(45) int local45 = local8.method6014();
			if (local45 < 0 || Static243.anInt4636 != 0 && Static243.anInt4636 < local45) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local45];
			if (local12 == 1) {
				Static109.method1849(local69, local45, arg0, local23);
			} else {
				Static258.aClass99_4.method2725(local69, local8);
			}
			return local69;
		}
	}
}
