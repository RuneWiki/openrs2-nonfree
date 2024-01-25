import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
	public static int anInt2710;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_45 = new Class11(55, -1);

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
	public static int anInt2707 = -1;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_46 = new Class11(52, 8);

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public static int anInt2711 = 0;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
	public static final int[] anIntArray559 = new int[32];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIII)V")
	public static void method2589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static243.anInt4326 <= arg5 - arg4 && arg5 + arg4 <= Static235.anInt4193 && Static138.anInt932 <= arg1 - arg4 && arg1 + arg4 <= Static40.anInt818) {
			Static312.method4642(arg3, arg5, arg2, arg4, arg0, arg1);
		} else {
			Static24.method447(arg0, arg2, arg1, arg4, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)Lclient!jg;")
	public static Class120 method2590(@OriginalArg(1) int arg0) {
		@Pc(10) Class120 local10 = (Class120) Static48.aClass160_8.method3599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static391.aClass171_100.method3745(0, arg0);
		local10 = new Class120();
		if (local20 != null) {
			local10.method2868(new Class2_Sub16(local20));
		}
		local10.method2866();
		Static48.aClass160_8.method3602((long) arg0, local10);
		return local10;
	}
}
