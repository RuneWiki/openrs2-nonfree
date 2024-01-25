import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class160 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public int anInt5967;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	protected final Socket method4961() throws IOException {
		return new Socket(this.aString50, this.anInt5967);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method4964() throws IOException;
}
