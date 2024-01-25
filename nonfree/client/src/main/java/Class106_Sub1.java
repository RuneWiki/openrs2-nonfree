import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method6796() throws IOException {
		return this.method6795();
	}
}
