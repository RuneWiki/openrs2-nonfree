import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	public static int anInt7324 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B[B)[B")
	public static byte[] method5976(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local6];
		Static553.method2534(arg0, 0, local16, 0, local6);
		return local16;
	}
}
