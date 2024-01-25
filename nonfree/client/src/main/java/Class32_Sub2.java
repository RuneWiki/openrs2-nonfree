import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method7985() throws IOException {
		return this.method7983();
	}
}
