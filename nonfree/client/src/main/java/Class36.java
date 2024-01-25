import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public abstract class Class36 {

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
	public int anInt5659;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method4644() throws IOException;

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method4645() throws IOException {
		return new Socket(this.aString55, this.anInt5659);
	}
}
