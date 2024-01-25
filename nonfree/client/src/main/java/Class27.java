import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public abstract class Class27 {

	@OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
	public int anInt1167;

	@OriginalMember(owner = "client!hha", name = "e", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method1140() throws IOException;

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method1141() throws IOException {
		return new Socket(this.aString11, this.anInt1167);
	}
}
