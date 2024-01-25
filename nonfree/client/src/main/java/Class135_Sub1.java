import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class135_Sub1 extends Class135 {

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method5890() throws IOException {
		return this.method5889();
	}
}
