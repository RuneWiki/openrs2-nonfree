import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class Class63 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Ljava/lang/String;")
	public String aString111;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public int anInt10282;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method8304() throws IOException;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method8305() throws IOException {
		return new Socket(this.aString111, this.anInt10282);
	}
}
