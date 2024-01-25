import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!co", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static440.method6322(30000L);
		return -1;
	}
}
