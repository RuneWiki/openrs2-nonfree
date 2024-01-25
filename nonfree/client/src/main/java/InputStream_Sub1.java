import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!bj", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static224.method3441(30000L);
		return -1;
	}
}
