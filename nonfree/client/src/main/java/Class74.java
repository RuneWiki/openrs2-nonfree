import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class Class74 {

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	public int anInt5882;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method5052() throws IOException {
		return new Socket(this.aString58, this.anInt5882);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method5053() throws IOException;
}
