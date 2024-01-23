import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!lo", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static282.method4345(30000L);
		return -1;
	}
}
