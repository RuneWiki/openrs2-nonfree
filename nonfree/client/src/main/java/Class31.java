import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class Class31 {

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Ljava/lang/String;")
	public String aString142;

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
	public int anInt10371;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method8759() throws IOException {
		return new Socket(this.aString142, this.anInt10371);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method8761() throws IOException;
}
