import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!pf", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static143.method2414(30000L);
		return -1;
	}
}
