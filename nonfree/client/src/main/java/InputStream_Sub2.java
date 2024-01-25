import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!fn", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static209.method3565(30000L);
		return -1;
	}
}
