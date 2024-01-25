import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static187 {

	@OriginalMember(owner = "client!gk", name = "G", descriptor = "Lclient!fi;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_29 = new Class181(46, 3);

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_30 = new Class181(7, 3);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZII)Z")
	public static boolean method3002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
