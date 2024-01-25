import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!bj", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static566.method8004(30000L);
		return -1;
	}
}
