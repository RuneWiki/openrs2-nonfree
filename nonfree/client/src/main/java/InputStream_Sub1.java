import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ic", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static263.method3671(30000L);
		return -1;
	}
}
