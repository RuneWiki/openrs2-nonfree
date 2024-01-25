import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!hm", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static183.method3079(30000L);
		return -1;
	}
}
