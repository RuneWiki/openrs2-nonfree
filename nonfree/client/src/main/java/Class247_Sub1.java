import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public final class Class247_Sub1 extends Class247 {

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method5554() throws IOException {
		return this.method5553();
	}
}
