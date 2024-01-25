import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!pt", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static500.method7308(30000L);
		return -1;
	}
}
