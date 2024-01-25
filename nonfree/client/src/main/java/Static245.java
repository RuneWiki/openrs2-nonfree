import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public static int anInt4707;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_76 = new Class322(52, 6);

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt4710 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4314(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class6_Sub15 local16 = new Class6_Sub15(arg0);
		@Pc(20) int local20 = local16.method3030();
		@Pc(24) int local24 = local16.method3015();
		if (local24 < 0 || Static264.anInt5013 != 0 && Static264.anInt5013 < local24) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(45) byte[] local45 = new byte[local24];
			local16.method3019(local24, 0, local45);
			return local45;
		} else {
			@Pc(57) int local57 = local16.method3015();
			if (local57 < 0 || Static264.anInt5013 != 0 && Static264.anInt5013 < local57) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local57];
			if (local20 == 1) {
				Static595.method8241(local79, local57, arg0, local24);
			} else {
				@Pc(86) Class346 local86 = Static526.aClass346_1;
				synchronized (Static526.aClass346_1) {
					Static526.aClass346_1.method8231(local16, local79);
				}
			}
			return local79;
		}
	}
}
