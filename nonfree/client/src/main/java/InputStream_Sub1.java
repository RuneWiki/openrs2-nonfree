import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!nf", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static135.method2458(30000L);
		return -1;
	}
}
