import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!mv", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static214.method3478(30000L);
		return -1;
	}
}
