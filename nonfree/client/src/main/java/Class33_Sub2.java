import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4072() throws IOException {
		return this.method4071();
	}
}
