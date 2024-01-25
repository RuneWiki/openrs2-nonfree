import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!te", name = "j", descriptor = "[I")
	public static int[] anIntArray687;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_182 = new Class225(38, 0);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BILclient!ha;IIII)Lclient!ka;")
	public static Class45 method8326(@OriginalArg(1) int arg0, @OriginalArg(2) Class145 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class45 local12 = (Class45) Static33.aClass85_3.method1737(local6);
		if (local12 == null) {
			@Pc(28) Class229 local28 = Static594.method8178(arg4, Static700.aClass254_167);
			if (local28 == null) {
				return null;
			}
			if (local28.anInt5933 < 13) {
				local28.method5315();
			}
			local12 = arg1.method9700(local28, 2055, Static226.anInt3596, 64, 768);
			Static33.aClass85_3.method1745(local6, 16383, local12);
		}
		local12 = local12.method5768((byte) 6, 2055, true);
		if (arg0 != 0) {
			local12.a(arg0);
		}
		if (arg2 != 0) {
			local12.FA(arg2);
		}
		if (arg5 != 0) {
			local12.VA(arg5);
		}
		if (arg3 != 0) {
			local12.H(0, arg3, 0);
		}
		return local12;
	}
}
