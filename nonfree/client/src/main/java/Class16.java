import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class Class16 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Ljava/lang/String;")
	public String aString236;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	public int anInt8859;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	protected final Socket method6926() throws IOException {
		return new Socket(this.aString236, this.anInt8859);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method6927() throws IOException;
}
