import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!jj;")
	public static Class98 aClass98_9;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_45 = new Class216();

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public static int anInt6875 = 0;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!on;")
	public static Class146 aClass146_17 = null;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static265.method5886(arg0)) {
			Static43.method1052(Static265.aClass146ArrayArray41[arg0], -1, arg7, arg6, arg3, arg1, arg8, arg4, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IC)Z")
	public static boolean method5927(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLclient!kb;BIII)V")
	public static void method5928(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static99.anInt2257 >= 50 || (arg1 == null || arg1.anIntArrayArray100 == null || arg3 >= arg1.anIntArrayArray100.length || arg1.anIntArrayArray100[arg3] == null)) {
			return;
		}
		@Pc(36) int local36 = arg1.anIntArrayArray100[arg3][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(69) int local69;
		if (arg1.anIntArrayArray100[arg3].length > 1) {
			local69 = (int) (Math.random() * (double) arg1.anIntArrayArray100[arg3].length);
			if (local69 > 0) {
				local40 = arg1.anIntArrayArray100[arg3][local69];
			}
		}
		if (local50 == 0) {
			if (arg0) {
				Static76.method1678(local40, 255, local46, 0);
			}
		} else if (Static303.anInt6082 != 0) {
			Static135.anIntArray240[Static99.anInt2257] = local40;
			Static99.anIntArray216[Static99.anInt2257] = local46;
			Static71.anIntArray160[Static99.anInt2257] = 0;
			Static285.aClass134Array1[Static99.anInt2257] = null;
			Static163.anIntArray156[Static99.anInt2257] = 255;
			local69 = (arg2 - 64) / 128;
			@Pc(128) int local128 = (arg4 - 64) / 128;
			Static333.anIntArray497[Static99.anInt2257] = (local128 << 8) + ((local69 << 16) + local50);
			Static99.anInt2257++;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!gh;)V")
	public static void method5929(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1) {
		Static301.aClass73Array31[arg0] = arg1;
	}
}
