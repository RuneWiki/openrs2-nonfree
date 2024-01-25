import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!tu", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static179.method3254(30000L);
		return -1;
	}
}
