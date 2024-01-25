import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ofa", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static318.method4952(30000L);
		return -1;
	}
}
