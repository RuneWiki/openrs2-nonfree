import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B[B)[B")
	public static byte[] method7551(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static686.method4972(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7552(@OriginalArg(0) String arg0) {
		return Static207.aHashtable5.containsKey(arg0);
	}
}
