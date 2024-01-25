import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!sh", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static366.method5214(30000L);
		return -1;
	}
}
