import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!ld", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static140.method2004(30000L);
		return -1;
	}
}
