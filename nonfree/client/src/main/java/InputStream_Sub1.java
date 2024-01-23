import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ia", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static303.method4677(30000L);
		return -1;
	}
}
