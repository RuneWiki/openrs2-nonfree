import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class156_Sub1 extends Class156 {

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4584() throws IOException {
		return this.method4581();
	}
}
