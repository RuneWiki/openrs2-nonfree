import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method4644() throws IOException {
		return this.method4645();
	}
}
