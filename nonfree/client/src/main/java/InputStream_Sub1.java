import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!hw", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static55.method845(30000L);
		return -1;
	}
}
