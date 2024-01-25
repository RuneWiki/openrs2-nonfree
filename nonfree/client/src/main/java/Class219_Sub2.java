import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class219_Sub2 extends Class219 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method7531() throws IOException {
		return this.method7533();
	}
}
