import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public abstract class Class121 {

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
	public int anInt6641;

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method5705() throws IOException;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method5707() throws IOException {
		return new Socket(this.aString70, this.anInt6641);
	}
}
