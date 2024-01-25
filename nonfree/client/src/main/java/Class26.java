import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class Class26 {

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public int anInt9255;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method7874() throws IOException;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	protected final Socket method7875() throws IOException {
		return new Socket(this.aString95, this.anInt9255);
	}
}
