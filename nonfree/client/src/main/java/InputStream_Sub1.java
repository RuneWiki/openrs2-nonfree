import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!in", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static374.method5521(30000L);
		return -1;
	}
}
