import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method5541() throws IOException {
		return this.method5544();
	}
}
