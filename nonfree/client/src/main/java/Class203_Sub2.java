import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class203_Sub2 extends Class203 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8374() throws IOException {
		return this.method8373();
	}
}
