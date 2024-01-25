import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ri", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static248.method4401(30000L);
		return -1;
	}
}
