import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method5053() throws IOException {
		return this.method5052();
	}
}
