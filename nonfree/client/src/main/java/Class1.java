import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public abstract class Class1 {

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
	public int anInt110;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method171() throws IOException {
		return new Socket(this.aString3, this.anInt110);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method172() throws IOException;
}
