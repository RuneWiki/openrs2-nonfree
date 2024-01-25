import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!wc", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static214.method2089(30000L);
		return -1;
	}
}
