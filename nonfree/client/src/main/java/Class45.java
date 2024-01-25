import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public abstract class Class45 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "Ljava/lang/String;")
	public String aString116;

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
	public int anInt10756;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method8770() throws IOException;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method8773() throws IOException {
		return new Socket(this.aString116, this.anInt10756);
	}
}
