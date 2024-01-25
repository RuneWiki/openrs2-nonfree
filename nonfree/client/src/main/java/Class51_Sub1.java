import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method5751() throws IOException {
		return this.method5752();
	}
}
