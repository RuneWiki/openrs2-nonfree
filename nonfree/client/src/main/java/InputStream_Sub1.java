import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ga", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static77.method1653(30000L);
		return -1;
	}
}
