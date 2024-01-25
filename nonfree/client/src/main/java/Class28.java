import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public abstract class Class28 {

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
	public int anInt7834;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method6498() throws IOException {
		return new Socket(this.aString82, this.anInt7834);
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method6500() throws IOException;
}
