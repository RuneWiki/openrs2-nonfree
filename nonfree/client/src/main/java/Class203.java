import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public abstract class Class203 {

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
	public int anInt9926;

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "Ljava/lang/String;")
	public String aString112;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method8373() throws IOException {
		return new Socket(this.aString112, this.anInt9926);
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method8374() throws IOException;
}
