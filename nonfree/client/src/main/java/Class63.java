import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class63 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public int anInt9464;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method8346() throws IOException;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method8348() throws IOException {
		return new Socket(this.aString105, this.anInt9464);
	}
}
