import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class Class32 {

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
	public int anInt5576;

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "Ljava/lang/String;")
	public String aString76;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method4818() throws IOException;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method4820() throws IOException {
		return new Socket(this.aString76, this.anInt5576);
	}
}
