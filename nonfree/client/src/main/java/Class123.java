import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class Class123 {

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
	public int anInt6491;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method5541() throws IOException;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	protected final Socket method5544() throws IOException {
		return new Socket(this.aString47, this.anInt6491);
	}
}
