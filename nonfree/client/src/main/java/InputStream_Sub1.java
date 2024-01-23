import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!cf", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static48.method934(30000L);
		return -1;
	}
}
