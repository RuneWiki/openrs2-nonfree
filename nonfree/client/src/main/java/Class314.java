import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class Class314 {

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Ljava/lang/String;")
	public String aString127;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
	public int anInt10665;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method9059() throws IOException;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method9061() throws IOException {
		return new Socket(this.aString127, this.anInt10665);
	}
}
