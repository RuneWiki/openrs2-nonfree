import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class283 {

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	public int anInt9730;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Ljava/lang/String;")
	public String aString98;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method8265() throws IOException {
		return new Socket(this.aString98, this.anInt9730);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method8270() throws IOException;
}
