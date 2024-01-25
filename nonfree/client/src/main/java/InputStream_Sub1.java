import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!jb", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static140.method2004(30000L);
		return -1;
	}
}
