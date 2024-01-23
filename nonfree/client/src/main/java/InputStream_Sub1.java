import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!jf", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static150.method2552(30000L);
		return -1;
	}
}
