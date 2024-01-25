import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method1140() throws IOException {
		return this.method1141();
	}
}
