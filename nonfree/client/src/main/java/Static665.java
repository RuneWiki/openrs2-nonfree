import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static665 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!fja;")
	public static Class118 method8673(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class118_Sub1(arg0, 15000);
	}
}
