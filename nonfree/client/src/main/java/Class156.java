import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class Class156 {

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
	public int anInt9748;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "Ljava/lang/String;")
	public String aString109;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method8153() throws IOException;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method8154() throws IOException {
		return new Socket(this.aString109, this.anInt9748);
	}
}
