import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public final class Class314_Sub2 extends Class314 {

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method9059() throws IOException {
		return this.method9061();
	}
}
