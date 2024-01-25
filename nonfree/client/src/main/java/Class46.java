import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class Class46 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	public int anInt7975;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method6690() throws IOException;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method6691() throws IOException {
		return new Socket(this.aString104, this.anInt7975);
	}
}
