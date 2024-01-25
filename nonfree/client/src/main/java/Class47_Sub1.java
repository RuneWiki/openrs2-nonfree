import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method2658() throws IOException {
		return this.method2655();
	}
}
