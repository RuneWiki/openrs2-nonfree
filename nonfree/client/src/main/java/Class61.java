import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class Class61 {

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	public int anInt6843;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method6031() throws IOException;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	protected final Socket method6032() throws IOException {
		return new Socket(this.aString82, this.anInt6843);
	}
}
