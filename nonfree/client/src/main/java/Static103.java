import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!eu", name = "ub", descriptor = "Lclient!er;")
	public static final Class69 aClass69_22 = new Class69(8);

	@OriginalMember(owner = "client!eu", name = "Ib", descriptor = "I")
	public static int anInt2206 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B[S)[S")
	public static short[] method1617(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static457.method1219(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
