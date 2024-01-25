import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!tp", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static244.method4311(30000L);
		return -1;
	}
}
