import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!em", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static26.method592(30000L);
		return -1;
	}
}
