import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ca", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static520.method7923(30000L);
		return -1;
	}
}
