import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!mm", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static435.method5503(30000L);
		return -1;
	}
}
