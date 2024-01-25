import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!aea", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static391.method5400(30000L);
		return -1;
	}
}
