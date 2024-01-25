import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Lclient!ug;")
	public static Class346 aClass346_1;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public static void method8595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class84 local28 = Static348.aClass84ArrayArrayArray5[local9][arg0][arg1] = Static348.aClass84ArrayArrayArray5[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class333 local33 = local28.aClass333_1; local33 != null; local33 = local33.aClass333_3) {
					@Pc(37) Class16_Sub1_Sub1 local37 = local33.aClass16_Sub1_Sub1_1;
					if (local37.aShort103 == arg0 && local37.aShort106 == arg1) {
						local37.aByte109--;
					}
				}
				if (local28.aClass16_Sub1_Sub3_1 != null) {
					local28.aClass16_Sub1_Sub3_1.aByte109--;
				}
				if (local28.aClass16_Sub1_Sub2_1 != null) {
					local28.aClass16_Sub1_Sub2_1.aByte109--;
				}
				if (local28.aClass16_Sub1_Sub2_2 != null) {
					local28.aClass16_Sub1_Sub2_2.aByte109--;
				}
				if (local28.aClass16_Sub1_Sub4_1 != null) {
					local28.aClass16_Sub1_Sub4_1.aByte109--;
				}
				if (local28.aClass16_Sub1_Sub4_2 != null) {
					local28.aClass16_Sub1_Sub4_2.aByte109--;
				}
			}
		}
		if (Static348.aClass84ArrayArrayArray5[0][arg0][arg1] == null) {
			Static348.aClass84ArrayArrayArray5[0][arg0][arg1] = new Class84(0);
			Static348.aClass84ArrayArrayArray5[0][arg0][arg1].aByte42 = 1;
		}
		Static348.aClass84ArrayArrayArray5[0][arg0][arg1].aClass84_1 = local7;
		Static348.aClass84ArrayArrayArray5[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)V")
	public static void method8597() {
		if (!Static316.method4864()) {
			return;
		}
		if (Static97.aStringArray10 == null) {
			Static462.method6524();
		}
		Static243.anInt7075 = 0;
		Static352.aBoolean439 = true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!ka;III)Lclient!wg;")
	public static Class379 method8598(@OriginalArg(0) int arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg1 == null ? null : new Class379(arg3, arg0, arg2, arg1.na(), arg1.V(), arg1.RA(), arg1.fa(), arg1.EA(), arg1.HA(), arg1.G());
	}
}
