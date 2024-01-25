import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!mp", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static252.method2874(30000L);
		return -1;
	}
}
