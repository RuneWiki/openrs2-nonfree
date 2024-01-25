import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class47 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method2655() throws IOException {
		return new Socket(this.aString52, this.anInt3113);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method2658() throws IOException;
}
