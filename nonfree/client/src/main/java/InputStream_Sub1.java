import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!cm", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static214.method3478(30000L);
		return -1;
	}
}
