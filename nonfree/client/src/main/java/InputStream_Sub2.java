import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!st", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static620.method7045(-4, 30000L);
		return -1;
	}
}
