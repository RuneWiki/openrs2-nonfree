import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!mj", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static275.method4233(30000L);
		return -1;
	}
}
