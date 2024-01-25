import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!ml;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "[Lclient!qi;")
	public static Class24_Sub3[] aClass24_Sub3Array3;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
	public static int anInt6751;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
	public static int anInt6752 = 0;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
	public static int anInt6753 = 0;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBIIIILclient!za;)Lclient!e;")
	public static Class63 method5286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class50 arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(14) Class63 local14 = (Class63) Static294.aClass267_84.method6014(local6);
		if (local14 == null) {
			@Pc(24) Class192 local24 = Static378.method5099(Static3.aClass187_76, arg2);
			if (local24 == null) {
				return null;
			}
			if (local24.anInt5443 < 13) {
				local24.method4347();
			}
			local14 = arg5.method5864(local24, 2055, Static187.anInt3756, 64, 768);
			Static294.aClass267_84.method6008(local14, local6);
		}
		local14 = local14.method6093((byte) 2, 2055, true);
		if (arg1 != 0) {
			local14.ma(arg1);
		}
		if (arg0 != 0) {
			local14.W(arg0);
		}
		if (arg3 != 0) {
			local14.K(arg3);
		}
		if (arg4 != 0) {
			local14.a(0, arg4, 0);
		}
		return local14;
	}
}
