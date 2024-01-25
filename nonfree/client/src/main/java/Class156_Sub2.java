import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class156_Sub2 extends Class156 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method8153() throws IOException {
		return this.method8154();
	}
}
