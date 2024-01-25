import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!rc", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static379.method5233(30000L);
		return -1;
	}
}
