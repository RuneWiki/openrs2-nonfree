import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method4072() throws IOException {
		return this.method4073();
	}
}
