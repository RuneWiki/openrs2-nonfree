import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_89 = new Class44(41, 6);

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_90 = new Class44(36, 1);

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "J")
	public static long aLong138 = 0L;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "Z")
	public static boolean aBoolean322 = false;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[200];

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IFFFZ)F")
	public static float method3908(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(12) float[] local12 = Static136.aFloatArrayArray2[arg0];
		return local12[1] * arg2 + local12[0] * arg1 + local12[2] * arg3;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Lclient!nu;")
	public static Class12_Sub2_Sub5 method3910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class12_Sub2_Sub5 local14 = local7.aClass12_Sub2_Sub5_1;
			local7.aClass12_Sub2_Sub5_1 = null;
			Static432.method6337(local14);
			return local14;
		}
	}
}
