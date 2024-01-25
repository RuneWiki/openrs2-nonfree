import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class Class51 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	public int anInt1804;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method1505() throws IOException {
		return new Socket(this.aString21, this.anInt1804);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method1506() throws IOException;
}
