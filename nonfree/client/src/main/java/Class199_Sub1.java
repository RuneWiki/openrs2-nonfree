import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class199_Sub1 extends Class199 {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method8877() throws IOException {
		return this.method8879();
	}
}
