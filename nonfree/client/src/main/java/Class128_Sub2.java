import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class128_Sub2 extends Class128 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4886() throws IOException {
		return this.method4885();
	}
}
