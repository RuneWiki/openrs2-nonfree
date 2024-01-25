import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!to", name = "N", descriptor = "I")
	public static int anInt10097;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!dfa;IIII)Z")
	public static boolean method8474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static177.aBoolean501 || !Static183.aBoolean267) {
			return false;
		} else if (Static195.anInt7170 < 100) {
			return false;
		} else if (arg5 != arg1 || arg3 != arg0) {
			for (@Pc(60) int local60 = arg5; local60 <= arg1; local60++) {
				for (@Pc(66) int local66 = arg0; local66 <= arg3; local66++) {
					if (-Static257.anInt4776 == Static90.anIntArrayArrayArray2[arg4][local60][local66]) {
						return false;
					}
				}
			}
			if (Static610.method8343(arg2)) {
				Static149.anInt2804++;
				return true;
			} else {
				return false;
			}
		} else if (!Static601.method8270(arg0, arg5, arg4)) {
			return false;
		} else if (Static610.method8343(arg2)) {
			Static149.anInt2804++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!wka;I)V")
	public static void method8475(@OriginalArg(0) Class19_Sub1_Sub3_Sub2 arg0) {
		@Pc(6) Class100 local6 = arg0.aClass100_9;
		if (Static269.anInt4883 == arg0.anInt7814 || !local6.method8963() || local6.method8969()) {
			@Pc(34) int local34 = arg0.anInt7814 - arg0.anInt7812;
			@Pc(39) int local39 = Static269.anInt4883 - arg0.anInt7812;
			@Pc(51) int local51 = arg0.anInt7811 * 512 + arg0.method6592() * 256;
			@Pc(63) int local63 = arg0.anInt7816 * 512 + arg0.method6592() * 256;
			@Pc(74) int local74 = arg0.anInt7820 * 512 + arg0.method6592() * 256;
			@Pc(88) int local88 = arg0.anInt7809 * 512 + arg0.method6592() * 256;
			arg0.anInt11211 = (local88 * local39 + (local34 - local39) * local63) / local34;
			arg0.anInt11204 = (local51 * (local34 - local39) + local74 * local39) / local34;
		}
		arg0.anInt7821 = 0;
		if (arg0.anInt7817 == 0) {
			arg0.method6597(8192, false);
		}
		if (arg0.anInt7817 == 1) {
			arg0.method6597(12288, false);
		}
		if (arg0.anInt7817 == 2) {
			arg0.method6597(0, false);
		}
		if (arg0.anInt7817 == 3) {
			arg0.method6597(4096, false);
		}
	}
}
