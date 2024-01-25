import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4818() throws IOException {
		return this.method4820();
	}
}
