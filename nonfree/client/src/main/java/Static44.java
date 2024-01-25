import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_18 = new Class100(51, -1);

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(Z)V")
	public static void method948() {
		while (true) {
			if (Static481.aClass14_Sub29_Sub1_2.method4284(Static638.anInt10676) >= 15) {
				@Pc(23) int local23 = Static481.aClass14_Sub29_Sub1_2.method4289(15);
				if (local23 != 32767) {
					@Pc(28) boolean local28 = false;
					@Pc(35) Class14_Sub44 local35 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local23);
					@Pc(41) Class12_Sub2_Sub2_Sub1_Sub1 local41;
					if (local35 == null) {
						local41 = new Class12_Sub2_Sub2_Sub1_Sub1();
						local41.anInt2945 = local23;
						local35 = new Class14_Sub44(local41);
						Static579.aClass187_73.method4077((long) local23, local35);
						local28 = true;
						Static151.aClass14_Sub44Array1[Static570.anInt9823++] = local35;
					}
					local41 = local35.aClass12_Sub2_Sub2_Sub1_Sub1_2;
					Static530.anIntArray671[Static471.anInt8216++] = local23;
					local41.anInt2941 = Static125.anInt2486;
					if (local41.aClass283_1 != null && local41.aClass283_1.method7127()) {
						Static423.method6258(local41);
					}
					local41.method611(Static63.aClass37_1.method974(Static481.aClass14_Sub29_Sub1_2.method4289(14)));
					@Pc(105) int local105 = Static481.aClass14_Sub29_Sub1_2.method4289(2);
					@Pc(110) int local110 = Static481.aClass14_Sub29_Sub1_2.method4289(1);
					if (local110 == 1) {
						Static272.anIntArray383[Static621.anInt10451++] = local23;
					}
					@Pc(128) int local128 = Static481.aClass14_Sub29_Sub1_2.method4289(5);
					if (local128 > 15) {
						local128 -= 32;
					}
					@Pc(145) int local145 = Static481.aClass14_Sub29_Sub1_2.method4289(3) + 4 << 11 & 0x39A4;
					@Pc(150) int local150 = Static481.aClass14_Sub29_Sub1_2.method4289(5);
					if (local150 > 15) {
						local150 -= 32;
					}
					@Pc(161) int local161 = Static481.aClass14_Sub29_Sub1_2.method4289(1);
					local41.method2415(local41.aClass283_1.anInt8617);
					local41.anInt2931 = local41.aClass283_1.anInt8616 << 3;
					if (local28) {
						local41.method2423(true, local145);
					}
					local41.method616(local41.method2422(), local105, local161 == 1, local150 + Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0], Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0] - -local128);
					if (local41.aClass283_1.method7127()) {
						Static413.method1523((Class203) null, local41, (Class12_Sub2_Sub2_Sub1_Sub2) null, local41.anIntArray242[0], local41.anIntArray241[0], 0, local41.aByte146);
					}
					continue;
				}
			}
			Static481.aClass14_Sub29_Sub1_2.method4290();
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)I")
	public static int method950(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
