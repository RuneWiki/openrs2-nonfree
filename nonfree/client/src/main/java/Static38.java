import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "[I")
	public static final int[] anIntArray61 = new int[13];

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
	public static int anInt672 = 1;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class7_Sub37 local7 = null;
		for (@Pc(16) Class7_Sub37 local16 = (Class7_Sub37) Static276.aClass85_30.method2010(); local16 != null; local16 = (Class7_Sub37) Static276.aClass85_30.method2000()) {
			if (local16.anInt5482 == arg5 && arg3 == local16.anInt5481 && local16.anInt5477 == arg4 && local16.anInt5473 == arg0) {
				local7 = local16;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class7_Sub37();
			local7.anInt5482 = arg5;
			local7.anInt5473 = arg0;
			local7.anInt5481 = arg3;
			local7.anInt5477 = arg4;
			if (arg3 >= 0 && arg4 >= 0 && arg3 < Static333.anInt3375 && Static102.anInt2086 > arg4) {
				Static388.method4968(local7);
			}
			Static276.aClass85_30.method2011(local7);
		}
		local7.anInt5480 = -1;
		local7.anInt5475 = arg1;
		local7.anInt5478 = arg6;
		local7.anInt5474 = 0;
		local7.anInt5476 = arg2;
	}
}
