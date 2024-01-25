import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!cia", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static351.method5279(30000L);
		return -1;
	}
}
