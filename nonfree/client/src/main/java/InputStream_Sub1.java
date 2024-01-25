import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
	public static final int[] anIntArray169 = new int[4096];

	static {
		for (@Pc(8) int local8 = 0; local8 < 4096; local8++) {
			anIntArray169[local8] = Static34.method815(local8);
		}
	}

	@OriginalMember(owner = "client!fg", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static423.method5918(30000L);
		return -1;
	}
}
