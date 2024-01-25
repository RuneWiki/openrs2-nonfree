import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class Class80 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Ljava/lang/String;")
	public String aString75;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public int anInt4280;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	public abstract Socket method3527() throws IOException;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method3529() throws IOException {
		return new Socket(this.aString75, this.anInt4280);
	}
}
