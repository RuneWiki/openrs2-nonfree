import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public abstract class Class128 {

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	public int anInt5388;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method4885() throws IOException {
		return new Socket(this.aString66, this.anInt5388);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method4886() throws IOException;
}
