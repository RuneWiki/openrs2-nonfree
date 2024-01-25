import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class219 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Ljava/lang/String;")
	public String aString142;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public int anInt9427;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method7531() throws IOException;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method7533() throws IOException {
		return new Socket(this.aString142, this.anInt9427);
	}
}
