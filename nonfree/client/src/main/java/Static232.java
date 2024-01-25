import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "[I")
	public static final int[] anIntArray393 = new int[100];

	@OriginalMember(owner = "client!oh", name = "N", descriptor = "Z")
	public static final boolean aBoolean436 = false;

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "[B")
	public static final byte[] aByteArray69 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4276(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = arg0.charAt(local20) + (local18 << 5) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
	public static void method4277() {
		@Pc(1) Class107 local1 = Static196.aClass107_21;
		synchronized (Static196.aClass107_21) {
			Static196.aClass107_21.method3011(5);
		}
	}
}
