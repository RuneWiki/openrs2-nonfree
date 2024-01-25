import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
	public static int anInt9853 = 0;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B[B)[B")
	public static byte[] method8014(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub7 local8 = new Class3_Sub7(arg0);
		@Pc(20) int local20 = local8.method6538();
		@Pc(24) int local24 = local8.method6497();
		if (local24 < 0 || Static259.anInt5542 != 0 && local24 > Static259.anInt5542) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(46) byte[] local46 = new byte[local24];
			local8.method6540(local46, local24);
			return local46;
		} else {
			@Pc(60) int local60 = local8.method6497();
			if (local60 < 0 || Static259.anInt5542 != 0 && local60 > Static259.anInt5542) {
				throw new RuntimeException();
			}
			@Pc(77) byte[] local77 = new byte[local60];
			if (local20 == 1) {
				Static278.method4832(local77, local60, arg0, local24);
			} else {
				@Pc(82) Class139 local82 = Static338.aClass139_1;
				synchronized (Static338.aClass139_1) {
					Static338.aClass139_1.method3290(local8, local77);
				}
			}
			return local77;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z")
	public static boolean method8015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(III)Z")
	public static boolean method8016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static377.method6099(arg1, arg0) || Static574.method8204(arg1, arg0);
	}
}
