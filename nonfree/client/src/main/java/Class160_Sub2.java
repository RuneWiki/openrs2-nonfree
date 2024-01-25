import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class160_Sub2 extends Class160 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4964() throws IOException {
		return this.method4961();
	}
}
