import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIB[BII)Z")
	public static boolean method5776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(39) int local39 = -((arg0 + 7) / 8);
		@Pc(48) int local48 = -((arg4 + 7) / 8);
		for (@Pc(50) int local50 = local39; local50 < 0; local50++) {
			for (@Pc(54) int local54 = local48; local54 < 0; local54++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local19;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!vc;ZI)V")
	public static void method5779(@OriginalArg(0) Class344 arg0, @OriginalArg(2) int arg1) {
		if (Static306.aBoolean381) {
			arg1 = 0;
			Static306.aBoolean381 = false;
		}
		if (Static176.aClass344_1 != null && Static176.aClass344_1.method7281(arg0)) {
			return;
		}
		Static176.aClass344_1 = arg0;
		Static11.aLong10 = Static158.method2936();
		Static118.anInt2718 = arg1;
		Static594.anInt9732 = arg1;
		if (Static594.anInt9732 == 0) {
			Static310.method4549();
			return;
		}
		Static277.aFloat102 = Static352.aFloat139;
		Static529.aFloat156 = Static503.aFloat153;
		Static65.anInt1507 = Static196.anInt9123;
		Static18.aClass12_1 = Static193.aClass12_2;
		Static413.aFloat141 = Static156.aFloat88;
		Static183.anInt3514 = Static596.anInt9772;
		Static385.aFloat140 = Static465.aFloat149;
		Static195.aFloat91 = Static462.aFloat146;
		Static57.anInt1190 = Static221.anInt3922;
		Static112.aFloat47 = Static480.aFloat151;
	}
}
