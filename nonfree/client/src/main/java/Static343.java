import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	public static int anInt5712;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Z")
	public static boolean aBoolean381 = true;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IJ)V")
	public static void method5120(@OriginalArg(1) long arg0) {
		Static462.aCalendar5.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILclient!oi;IIIIBLclient!oi;I)V")
	public static void method5121(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) Class4_Sub1_Sub1_Sub2 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg5.method5927();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class155 local21 = (Class155) Static651.aClass168_95.method3860((long) local7);
		if (local21 == null) {
			@Pc(28) Class362[] local28 = Static692.method8280(Static27.aClass126_18, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static273.aClass100_6.method8640(local28[0], true);
			Static651.aClass168_95.method3853((long) local7, local21);
		}
		Static489.method6888(arg1.aByte139, 256, arg4 >> 1, arg0 >> 1, arg1.anInt9803, arg1.anInt9805, 0, 256, arg1.method5932() * 256);
		@Pc(75) int local75 = Static663.anIntArray616[0] + arg2 - 18;
		@Pc(83) int local83 = local75 + arg6 / 4 * 18;
		@Pc(91) int local91 = Static663.anIntArray616[1] + arg3 - 70;
		@Pc(99) int local99 = local91 + arg6 % 4 * 18;
		local21.method7202(local83, local99);
		if (arg1 == arg5) {
			Static273.aClass100_6.method8620(local99 - 1, -256, 18, local83 - 1, 18);
		}
		Static395.method5811(local99 - 1, local83 - -18, local99 + 18, local83 + -1);
		@Pc(145) Class4_Sub3 local145 = Static471.method6669();
		local145.aClass4_Sub1_Sub1_Sub2_1 = arg5;
		local145.anInt960 = local83;
		local145.anInt963 = local83 + 16;
		local145.anInt962 = local99 + 16;
		local145.anInt961 = local99;
		Static605.aClass387_8.method9017(local145);
	}
}
