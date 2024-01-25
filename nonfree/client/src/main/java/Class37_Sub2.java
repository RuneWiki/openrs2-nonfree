import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6875() throws IOException {
		return this.method6873();
	}
}
