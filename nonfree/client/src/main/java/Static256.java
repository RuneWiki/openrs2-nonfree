import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
	public static int anInt4099;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_24 = new Class254();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([BI)[B")
	public static byte[] method3267(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static459.method2110(arg0, 0, local9, 0, local6);
		return local9;
	}
}
