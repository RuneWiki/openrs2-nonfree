import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!db", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static408.method5841(30000L);
		return -1;
	}
}
