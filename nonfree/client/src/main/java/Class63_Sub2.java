import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8346() throws IOException {
		return this.method8348();
	}
}
