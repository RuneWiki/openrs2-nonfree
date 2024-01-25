import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public final class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8226() throws IOException {
		return this.method8223();
	}
}
