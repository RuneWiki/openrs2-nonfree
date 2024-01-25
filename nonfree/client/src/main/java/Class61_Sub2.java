import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class61_Sub2 extends Class61 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6031() throws IOException {
		return this.method6032();
	}
}
