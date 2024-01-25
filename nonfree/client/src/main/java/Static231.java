import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static231 {

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
	public static int anInt4727 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!hca;")
	public static Class127 method4069(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class127_Sub1(arg0, 7500);
	}
}
