import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public abstract class Class184 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "Ljava/lang/String;")
	public String aString112;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
	public int anInt9996;

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method8209() throws IOException {
		return new Socket(this.aString112, this.anInt9996);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method8210() throws IOException;
}
