import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	public static int anInt2364;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)Lclient!ep;")
	public static Class93 method2145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class93 local7 = Static223.method4011(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass93Array4 == null || arg0 >= local7.aClass93Array4.length) {
			return null;
		} else {
			return local7.aClass93Array4[arg0];
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)I")
	public static int method2146() {
		return Static544.anInt9330++;
	}
}
