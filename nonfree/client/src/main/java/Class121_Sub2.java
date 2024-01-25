import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class121_Sub2 extends Class121 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method5705() throws IOException {
		return this.method5707();
	}
}
