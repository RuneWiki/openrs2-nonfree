import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!gaa", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static214.method4061(30000L);
		return -1;
	}
}
