import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
	public static int anInt6765;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)I", line = 8)
	public static int method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[B)[B", line = 29)
	public static byte[] method6073(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static390.method4608(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V", line = 64)
	public static void method6078(@OriginalArg(1) int arg0) {
		Class217.anIntArray409 = new int[arg0];
		Class233.anIntArray448 = new int[arg0];
		Class77.anIntArray136 = new int[arg0];
		Class11_Sub3_Sub1.anIntArray122 = new int[arg0];
		Class11_Sub5_Sub2_Sub2.anIntArray318 = new int[arg0];
	}
}
