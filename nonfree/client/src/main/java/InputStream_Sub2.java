import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!qm", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static183.method3079(30000L);
		return -1;
	}
}
