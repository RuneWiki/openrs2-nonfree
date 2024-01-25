import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class Class69 {

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
	public int anInt4617;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method3985() throws IOException {
		return new Socket(this.aString66, this.anInt4617);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method3986() throws IOException;
}
