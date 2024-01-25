import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class Class199 {

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
	public int anInt10292;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "Ljava/lang/String;")
	public String aString128;

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method8877() throws IOException;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method8879() throws IOException {
		return new Socket(this.aString128, this.anInt10292);
	}
}
