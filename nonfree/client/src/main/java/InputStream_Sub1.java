import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!fo", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static105.method2138(30000L);
		return -1;
	}
}
