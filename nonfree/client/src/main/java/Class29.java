import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class Class29 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	public int anInt6805;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Ljava/net/Socket;")
	protected final Socket method5719() throws IOException {
		return new Socket(this.aString66, this.anInt6805);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method5721() throws IOException;
}
