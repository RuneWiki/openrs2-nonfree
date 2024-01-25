import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method1506() throws IOException {
		return this.method1505();
	}
}
