import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!oo", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static63.method1019(30000L);
		return -1;
	}
}
