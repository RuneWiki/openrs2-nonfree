import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class Class248 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	public int anInt8927;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	protected final Socket method7789() throws IOException {
		return new Socket(this.aString105, this.anInt8927);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method7790() throws IOException;
}
