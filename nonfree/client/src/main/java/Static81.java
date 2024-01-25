import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/io/File;B)[B")
	public static byte[] method1875(@OriginalArg(0) File arg0) {
		return Static585.method8313((int) arg0.length(), arg0);
	}
}
