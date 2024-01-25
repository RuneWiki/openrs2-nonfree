import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "Lclient!mn;")
	public static Class171 aClass171_87;

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
	public static int anInt6509;

	@OriginalMember(owner = "client!cr", name = "A", descriptor = "[I")
	public static int[] anIntArray532;

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "Lclient!of;")
	public static final Class188 aClass188_48 = new Class188(4);

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
	public static int anInt6508 = -1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(FILclient!bl;FFIFIIFI)[B")
	public static byte[] method5176(@OriginalArg(0) float arg0, @OriginalArg(2) Class27 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(6) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static277.method3960(arg0, arg1, local10, arg4, arg2, 0, arg3, arg5);
		return local10;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(IB)Lclient!cg;")
	public static Class37 method5177(@OriginalArg(0) int arg0) {
		@Pc(24) Class37[] local24 = Static275.method3931();
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			if (arg0 == local24[local26].anInt763) {
				return local24[local26];
			}
		}
		return null;
	}
}
