import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8073() throws IOException {
		return this.method8074();
	}
}
