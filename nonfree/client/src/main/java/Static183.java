import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "Lclient!vv;")
	public static Class306 aClass306_1;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method3017(@OriginalArg(1) File arg0) {
		return Static410.method6419((int) arg0.length(), arg0);
	}
}
