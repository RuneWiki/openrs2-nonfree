import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!qq", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static328.method5696(30000L);
		return -1;
	}
}
