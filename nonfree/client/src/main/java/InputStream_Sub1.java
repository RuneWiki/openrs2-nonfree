import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!es", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static83.method1499(30000L);
		return -1;
	}
}
