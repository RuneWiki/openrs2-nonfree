import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class Class32 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public int anInt9485;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method7983() throws IOException {
		return new Socket(this.aString89, this.anInt9485);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method7985() throws IOException;
}
