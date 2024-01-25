import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!oha", name = "t", descriptor = "I")
	public static int anInt8042 = 0;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6762(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static735.method9185(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6763(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)I")
	public static int method6764() {
		return Static293.anInt5243 == 1 ? Static306.anInt5501 : Static396.anInt7103;
	}
}
