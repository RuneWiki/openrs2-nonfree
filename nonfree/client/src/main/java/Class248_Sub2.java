import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class248_Sub2 extends Class248 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method7790() throws IOException {
		return this.method7789();
	}
}
