import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!ok", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static374.method5521(30000L);
		return -1;
	}
}
