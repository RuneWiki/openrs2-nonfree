import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Z")
	public static boolean method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static146.method2200(arg0)) {
			return false;
		} else {
			return Static146.method2200(arg1);
		}
	}
}
