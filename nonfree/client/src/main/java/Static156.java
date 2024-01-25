import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "Lclient!nf;")
	public static Class159 aClass159_3;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_85 = new Class77(99, 4);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method2599(@OriginalArg(1) String arg0) {
		return Static3.method83(arg0, 16);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BI)I")
	public static int method2600(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
