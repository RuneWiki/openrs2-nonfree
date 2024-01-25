import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class Class295 {

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
	public int anInt9401;

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method7724() throws IOException {
		return new Socket(this.aString96, this.anInt9401);
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method7725() throws IOException;
}
