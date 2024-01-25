import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method7874() throws IOException {
		return this.method7875();
	}
}
