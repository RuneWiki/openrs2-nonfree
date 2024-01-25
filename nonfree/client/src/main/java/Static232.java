import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Lclient!mn;")
	public static Class133 aClass133_1;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "Lclient!nq;")
	public static Class144 aClass144_77;

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
	public static int anInt4702;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
	public static int anInt4703;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILclient!mj;IIIILclient!uo;III)Lclient!mj;")
	public static Class126 method4149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class129 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg8;
		@Pc(12) Class126 local12 = (Class126) Static296.aClass26_53.method332(local6);
		if (local12 == null) {
			@Pc(27) Class31 local27 = Static119.method1790(Static296.aClass144_94, arg8);
			if (local27 == null) {
				return null;
			}
			local12 = arg6.method4929(local27, 1031, Static201.anInt6766, 64, 768);
			Static296.aClass26_53.method330(local6, local12);
		}
		local12 = local12.method3158((byte) 2, 1031, true);
		if (arg1 != 0) {
			local12.method3125(arg1);
		}
		if (arg7 != 0) {
			local12.method3145(arg7);
		}
		if (arg5 != 0) {
			local12.method3156(arg5);
		}
		if (arg3 != 0) {
			local12.method3128(0, arg3, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(III)Lclient!hh;")
	public static Class92 method4151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class92 local7 = new Class92();
		local7.anInt2177 = -1;
		local7.anInt2163 = -1;
		local7.anInt2165 = arg0 + 5 + 1;
		local7.anInt2181 = arg1 + 1 + 5;
		local7.anIntArrayArray18 = new int[local7.anInt2181][local7.anInt2165];
		local7.method1770();
		return local7;
	}
}
