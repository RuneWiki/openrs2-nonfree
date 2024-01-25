import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static291 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static int anInt5976 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/io/File;B)[B")
	public static byte[] method4716(@OriginalArg(0) File arg0) {
		return Static267.method4193((int) arg0.length(), arg0);
	}
}
