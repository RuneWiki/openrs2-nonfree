import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public final class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method3986() throws IOException {
		return this.method3985();
	}
}
