import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class Class6 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	public int anInt10337;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljava/lang/String;")
	public String aString229;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method8073() throws IOException;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method8074() throws IOException {
		return new Socket(this.aString229, this.anInt10337);
	}
}
