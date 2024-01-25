import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public abstract class Class17 {

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "Ljava/lang/String;")
	public String aString76;

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
	public int anInt6195;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method5296() throws IOException;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method5299() throws IOException {
		return new Socket(this.aString76, this.anInt6195);
	}
}
