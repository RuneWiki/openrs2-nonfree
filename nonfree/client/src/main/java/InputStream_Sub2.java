import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class InputStream_Sub2 extends InputStream {

	@OriginalMember(owner = "client!pca", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static579.method8004(30000L);
		return -1;
	}
}
