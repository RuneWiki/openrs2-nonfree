import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
	public static int anInt3544 = 0;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([BZ)[B")
	public static byte[] method2877(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub26 local8 = new Class3_Sub26(arg0);
		@Pc(19) int local19 = local8.method6814();
		@Pc(23) int local23 = local8.method6816();
		if (local23 < 0 || Static298.anInt5567 != 0 && Static298.anInt5567 < local23) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(42) byte[] local42 = new byte[local23];
			local8.method6794(local42, local23);
			return local42;
		} else {
			@Pc(54) int local54 = local8.method6816();
			if (local54 < 0 || Static298.anInt5567 != 0 && Static298.anInt5567 < local54) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] local71 = new byte[local54];
			if (local19 == 1) {
				Static14.method130(local71, local54, arg0, local23);
			} else {
				@Pc(78) Class21 local78 = Static59.aClass21_1;
				synchronized (Static59.aClass21_1) {
					Static59.aClass21_1.method218(local8, local71);
				}
			}
			return local71;
		}
	}
}
