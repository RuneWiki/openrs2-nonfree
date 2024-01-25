import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!dk", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static314.method4821(30000L);
		return -1;
	}
}
