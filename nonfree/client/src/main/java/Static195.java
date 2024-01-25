import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!jv", name = "A", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_56 = new Class186(14, -1);

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_57 = new Class231("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!jv", name = "B", descriptor = "[I")
	public static final int[] anIntArray308 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[B)Z")
	public static boolean method3060(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub15 local8 = new Class6_Sub15(arg0);
		@Pc(17) int local17 = local8.method3111();
		if (local17 != 1) {
			return false;
		}
		@Pc(31) boolean local31 = local8.method3111() == 1;
		if (local31) {
			Static362.method5126(local8);
		}
		Static118.method1903(local8);
		return true;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)V")
	public static void method3061(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub1_Sub12 local14 = Static449.method5975(arg0, 4);
		local14.method3048();
	}

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)Lclient!jt;")
	public static Class6_Sub1_Sub12 method3063() {
		@Pc(13) Class6_Sub1_Sub12 local13 = (Class6_Sub1_Sub12) Static287.aClass202_9.method4476();
		if (local13 != null) {
			local13.method5977();
			local13.method5984();
			return local13;
		}
		do {
			local13 = (Class6_Sub1_Sub12) Static217.aClass202_2.method4476();
			if (local13 == null) {
				return null;
			}
			if (local13.method3046() > Static154.method2527()) {
				return null;
			}
			local13.method5977();
			local13.method5984();
		} while ((local13.aLong218 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3066(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static101.method1691(arg3, arg5, 0, arg0, arg1, arg4, arg2);
	}
}
