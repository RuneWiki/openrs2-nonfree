import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!eg", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static202.method3246(30000L);
		return -1;
	}
}
