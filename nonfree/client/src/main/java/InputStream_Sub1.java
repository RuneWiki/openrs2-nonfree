import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!nb", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static443.method5991(30000L);
		return -1;
	}
}
