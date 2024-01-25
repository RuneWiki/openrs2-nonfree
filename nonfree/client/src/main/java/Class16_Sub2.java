import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6927() throws IOException {
		return this.method6926();
	}
}
