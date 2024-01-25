import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method8761() throws IOException {
		return this.method8759();
	}
}
