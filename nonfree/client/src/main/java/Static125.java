import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "J")
	public static long aLong58;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!ri;")
	public static Class284 aClass284_41;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_95 = new Class123(36, -2);

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Z")
	public static boolean aBoolean197 = true;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
	public static void method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static189.aClass333ArrayArrayArray1[0][arg1][arg2] != null && Static189.aClass333ArrayArrayArray1[0][arg1][arg2].aClass333_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static189.aClass333ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(44) Class333 local44 = Static189.aClass333ArrayArrayArray1[local22][arg1][arg2] = new Class333(local22);
				if (local20) {
					local44.aByte127++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg0) {
			Static155.method2857(arg6, arg5, arg2, arg4, arg3, arg1);
		} else if (Static384.anInt6641 <= arg3 - arg6 && arg6 + arg3 <= Static191.anInt4134 && arg1 - arg0 >= Static112.anInt2687 && arg1 + arg0 <= Static333.anInt6022) {
			Static57.method1395(arg4, arg2, arg3, arg0, arg5, arg1, arg6);
		} else {
			Static436.method6078(arg3, arg1, arg5, arg6, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([JII[IB)V")
	public static void method2372(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) long local24 = arg0[local18];
		arg0[local18] = arg0[arg1];
		arg0[arg1] = local24;
		@Pc(38) int local38 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg2; local60 < arg1; local60++) {
			if (arg0[local60] < (long) (local60 & local58) + local24) {
				@Pc(81) long local81 = arg0[local60];
				arg0[local60] = arg0[local20];
				arg0[local20] = local81;
				@Pc(95) int local95 = arg3[local60];
				arg3[local60] = arg3[local20];
				arg3[local20++] = local95;
			}
		}
		arg0[arg1] = arg0[local20];
		arg0[local20] = local24;
		arg3[arg1] = arg3[local20];
		arg3[local20] = local38;
		method2372(arg0, local20 - 1, arg2, arg3);
		method2372(arg0, arg1, local20 + 1, arg3);
	}
}
