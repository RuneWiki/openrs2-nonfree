import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class Class135 {

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public int anInt6756;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method5889() throws IOException {
		return new Socket(this.aString82, this.anInt6756);
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method5890() throws IOException;
}
