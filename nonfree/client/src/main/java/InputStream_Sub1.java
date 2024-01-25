import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!gg", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static149.method2211(30000L);
		return -1;
	}
}
