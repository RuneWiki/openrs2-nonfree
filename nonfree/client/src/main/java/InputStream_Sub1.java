import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!nda", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static650.method9565(30000L);
		return -1;
	}
}
