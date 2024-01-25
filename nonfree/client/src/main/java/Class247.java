import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public abstract class Class247 {

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
	public int anInt6263;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method5553() throws IOException {
		return new Socket(this.aString69, this.anInt6263);
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method5554() throws IOException;
}
