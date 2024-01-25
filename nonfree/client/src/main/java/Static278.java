import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "[B")
	public static byte[] aByteArray50;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
	public static int anInt4447 = -1;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B[[I)V")
	public static void method3851(@OriginalArg(1) int[][] arg0) {
		Static543.anIntArrayArray57 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3854(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static373.method5028(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
	public static int method3855() {
		@Pc(14) int local14 = Static111.aClass323_1.method7297();
		if (Static365.aClass323Array1.length - 1 > local14) {
			Static111.aClass323_1 = Static365.aClass323Array1[local14 + 1];
		}
		return 100;
	}
}
