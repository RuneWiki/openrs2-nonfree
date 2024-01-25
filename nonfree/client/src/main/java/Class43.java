import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public abstract class Class43 {

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "Ljava/lang/String;")
	public String aString61;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
	public int anInt4739;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method4072() throws IOException;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method4073() throws IOException {
		return new Socket(this.aString61, this.anInt4739);
	}
}
