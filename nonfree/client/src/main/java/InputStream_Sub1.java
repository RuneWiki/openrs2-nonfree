import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!rd", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static230.method4022(30000L);
		return -1;
	}
}
