import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!cn", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static167.method6157(30000L);
		return -1;
	}
}
