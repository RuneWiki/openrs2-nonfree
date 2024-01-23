import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!lf", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static30.method587(30000L);
		return -1;
	}
}
