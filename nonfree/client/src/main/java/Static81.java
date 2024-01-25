import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!ai;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([BZ)[B")
	public static byte[] method1145(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static596.method7719(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
