import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_6 = new Class102(10);

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!cs;)V")
	public static void method1703(@OriginalArg(1) Class4_Sub1_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt5788 - Static101.anInt2262;
		@Pc(25) int local25 = arg0.anInt5750 * 512 + arg0.method5059() * 256;
		@Pc(37) int local37 = arg0.anInt5729 * 512 + arg0.method5059() * 256;
		arg0.anInt5794 = 0;
		arg0.anInt8916 += (local25 - arg0.anInt8916) / local9;
		arg0.anInt8911 += (local37 - arg0.anInt8911) / local9;
		if (arg0.anInt5758 == 0) {
			arg0.method5065(8192);
		}
		if (arg0.anInt5758 == 1) {
			arg0.method5065(12288);
		}
		if (arg0.anInt5758 == 2) {
			arg0.method5065(0);
		}
		if (arg0.anInt5758 == 3) {
			arg0.method5065(4096);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)Z")
	public static boolean method1704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static500.aBoolean598 || !Static378.aBoolean511) {
			return false;
		} else if (Static127.anInt2678 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static403.anIntArrayArrayArray21[arg2][arg0][arg1];
			if (-Static489.anInt8492 == local22) {
				return false;
			} else if (local22 == Static489.anInt8492) {
				return true;
			} else if (Static2.aClass51Array1 == Static364.aClass51Array3) {
				return false;
			} else {
				@Pc(54) int local54 = arg0 << Static308.anInt5834;
				@Pc(58) int local58 = arg1 << Static308.anInt5834;
				if (Static441.method6862(local54 + 1, Static364.aClass51Array3[arg2].method7835(arg0, arg1 + 1), Static384.anInt7200 + local54 - 1, Static384.anInt7200 + -1 + local58, local58 + Static384.anInt7200 - 1, Static364.aClass51Array3[arg2].method7835(arg0, arg1), local58 + 1, Static364.aClass51Array3[arg2].method7835(arg0 + 1, arg1 - -1), local54 + 1) && Static441.method6862(Static384.anInt7200 + local54 - 1, Static364.aClass51Array3[arg2].method7835(arg0 + 1, arg1 + 1), local54 + Static384.anInt7200 - 1, Static384.anInt7200 + (local58 - 1), local58 + 1, Static364.aClass51Array3[arg2].method7835(arg0, arg1), local58 + 1, Static364.aClass51Array3[arg2].method7835(arg0 + 1, arg1), local54 + 1)) {
					Static178.anInt10121++;
					Static403.anIntArrayArrayArray21[arg2][arg0][arg1] = Static489.anInt8492;
					return true;
				} else {
					Static403.anIntArrayArrayArray21[arg2][arg0][arg1] = -Static489.anInt8492;
					return false;
				}
			}
		}
	}
}
