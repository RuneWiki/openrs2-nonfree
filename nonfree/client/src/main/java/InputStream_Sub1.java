import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!eh", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static193.method3169(30000L);
		return -1;
	}
}
