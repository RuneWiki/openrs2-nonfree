import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8304() throws IOException {
		return this.method8305();
	}
}
