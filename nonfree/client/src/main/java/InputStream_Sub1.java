import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!se", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static81.method1477(30000L);
		return -1;
	}
}
