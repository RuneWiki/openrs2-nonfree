import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class106 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
	public int anInt8264;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	protected final Socket method6795() throws IOException {
		return new Socket(this.aString95, this.anInt8264);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method6796() throws IOException;
}
