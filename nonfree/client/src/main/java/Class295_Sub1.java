import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class295_Sub1 extends Class295 {

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method7725() throws IOException {
		return this.method7724();
	}
}
