import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method6690() throws IOException {
		return this.method6691();
	}
}
