import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!wh", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static270.method5481(30000L);
		return -1;
	}
}
