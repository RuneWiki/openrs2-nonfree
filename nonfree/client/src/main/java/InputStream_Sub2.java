import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!ca", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static566.method8004(30000L);
		return -1;
	}
}
