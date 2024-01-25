import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class Class51 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
	public int anInt6831;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method5751() throws IOException;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method5752() throws IOException {
		return new Socket(this.aString77, this.anInt6831);
	}
}
