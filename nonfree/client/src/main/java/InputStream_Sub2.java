import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!vm", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static55.method845(30000L);
		return -1;
	}
}
