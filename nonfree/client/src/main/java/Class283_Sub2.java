import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class283_Sub2 extends Class283 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8270() throws IOException {
		return this.method8265();
	}
}
