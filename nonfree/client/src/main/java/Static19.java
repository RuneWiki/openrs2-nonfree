import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!an", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "client!an", name = "K", descriptor = "I")
	public static int anInt200 = 13156520;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method205(@OriginalArg(0) File arg0) {
		return Static337.method4918(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z")
	public static boolean method208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static492.method6622(arg0, arg1) & Static409.method1339(arg0, arg1);
	}
}
