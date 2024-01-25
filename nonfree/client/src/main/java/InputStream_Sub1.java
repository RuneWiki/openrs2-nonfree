import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!wm", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static170.method1617(30000L);
		return -1;
	}
}
