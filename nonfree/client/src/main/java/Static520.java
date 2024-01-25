import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method7288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class2_Sub3 local7 = null;
		for (@Pc(12) Class2_Sub3 local12 = (Class2_Sub3) Static234.aClass238_27.method5833(); local12 != null; local12 = (Class2_Sub3) Static234.aClass238_27.method5838()) {
			if (local12.anInt294 == arg0 && arg5 == local12.anInt296 && arg3 == local12.anInt286 && arg6 == local12.anInt290) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub3();
			local7.anInt296 = arg5;
			local7.anInt290 = arg6;
			local7.anInt294 = arg0;
			local7.anInt286 = arg3;
			if (arg5 >= 0 && arg3 >= 0 && arg5 < Static3.anInt46 && Static270.anInt5194 > arg3) {
				Static258.method8461(local7);
			}
			Static234.aClass238_27.method5837(local7);
		}
		local7.anInt283 = 0;
		local7.anInt291 = arg2;
		local7.anInt292 = arg1;
		local7.anInt295 = arg4;
		local7.anInt293 = -1;
	}
}
