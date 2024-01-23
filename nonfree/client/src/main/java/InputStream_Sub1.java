import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ih", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static162.method2645(30000L);
		return -1;
	}
}
