import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!baa", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static344.method5698(30000L);
		return -1;
	}
}
