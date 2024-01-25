import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class37 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public int anInt8644;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method6873() throws IOException {
		return new Socket(this.aString72, this.anInt8644);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method6875() throws IOException;
}
