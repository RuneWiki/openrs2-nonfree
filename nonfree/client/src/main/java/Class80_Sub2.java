import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	@Override
	public Socket method3527() throws IOException {
		return this.method3529();
	}
}
