import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "[Lclient!dba;")
	public static final Class64[] aClass64Array2 = new Class64[14];

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)Z")
	public static boolean method2804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static403.method6321(arg0, arg1) || Static226.method4100(arg1, arg0) || Static530.method7857(arg1, arg0);
	}
}
