import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class Class29 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	public int anInt957;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method890() throws IOException {
		return new Socket(this.aString8, this.anInt957);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method891() throws IOException;
}
