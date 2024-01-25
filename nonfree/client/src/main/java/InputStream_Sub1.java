import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!nc", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static190.method3690(30000L);
		return -1;
	}
}
