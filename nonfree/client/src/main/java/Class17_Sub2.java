import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method5296() throws IOException {
		return this.method5299();
	}
}
