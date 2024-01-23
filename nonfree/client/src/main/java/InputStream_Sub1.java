import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!kj", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static16.method242(30000L);
		return -1;
	}
}
