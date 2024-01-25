import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6500() throws IOException {
		return this.method6498();
	}
}
