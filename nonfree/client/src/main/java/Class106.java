import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public abstract class Class106 {

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
	public int anInt9885;

	@OriginalMember(owner = "client!sga", name = "h", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method8223() throws IOException {
		return new Socket(this.aString106, this.anInt9885);
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method8226() throws IOException;
}
