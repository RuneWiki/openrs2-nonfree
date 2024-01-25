import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static79 {

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(CB)Z")
	public static boolean method1393(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method1394(@OriginalArg(1) File arg0) {
		return Static233.method4205((int) arg0.length(), arg0);
	}
}
