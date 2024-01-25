import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!bo", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static331.method4343(30000L);
		return -1;
	}
}
