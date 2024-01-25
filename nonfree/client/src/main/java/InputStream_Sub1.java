import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!bb", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static223.method4582(30000L);
		return -1;
	}
}
