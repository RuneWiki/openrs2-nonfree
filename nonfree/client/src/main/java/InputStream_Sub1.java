import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!vd", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static429.method5376(30000L);
		return -1;
	}
}
