import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!to", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static163.method2863(30000L);
		return -1;
	}
}
