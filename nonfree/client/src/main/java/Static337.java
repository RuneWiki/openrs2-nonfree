import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_296 = new Class12(95, -1);

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "Lclient!uj;")
	public static final Class242 aClass242_6 = new Class242();

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B[SI)[S")
	public static short[] method4857(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static459.method1549(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
