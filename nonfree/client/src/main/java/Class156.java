import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public abstract class Class156 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	public int anInt5335;

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method4581() throws IOException {
		return new Socket(this.aString54, this.anInt5335);
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method4584() throws IOException;
}
