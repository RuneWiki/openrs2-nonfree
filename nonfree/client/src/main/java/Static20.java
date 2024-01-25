import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_2 = new Class236(15, 18);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[B)[B")
	public static byte[] method603(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub3 local8 = new Class5_Sub3(arg0);
		@Pc(12) int local12 = local8.method4220();
		@Pc(16) int local16 = local8.method4230();
		if (local16 < 0 || Static234.anInt4419 != 0 && local16 > Static234.anInt4419) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(36) byte[] local36 = new byte[local16];
			local8.method4177(local36, local16);
			return local36;
		} else {
			@Pc(48) int local48 = local8.method4230();
			if (local48 < 0 || Static234.anInt4419 != 0 && local48 > Static234.anInt4419) {
				throw new RuntimeException();
			}
			@Pc(62) byte[] local62 = new byte[local48];
			if (local12 == 1) {
				Static462.method6418(local62, local48, arg0, local16);
			} else {
				@Pc(69) Class259 local69 = Static292.aClass259_1;
				synchronized (Static292.aClass259_1) {
					Static292.aClass259_1.method6136(local62, local8);
				}
			}
			return local62;
		}
	}
}
