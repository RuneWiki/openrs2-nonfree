import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method891() throws IOException {
		return this.method890();
	}
}
