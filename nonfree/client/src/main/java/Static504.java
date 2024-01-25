import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static504 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public static int anInt8038;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Z")
	public static boolean aBoolean626 = true;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method6789(@OriginalArg(0) File arg0) {
		return Static83.method1823(arg0, (int) arg0.length());
	}
}
