import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7345(@OriginalArg(0) Class137 arg0) {
		Static204.aClass185Array7 = new Class185[Static572.anIntArray713.length];
		for (@Pc(11) int local11 = 0; local11 < Static572.anIntArray713.length; local11++) {
			@Pc(17) int local17 = Static572.anIntArray713[local11];
			@Pc(22) Class158 local22 = Static527.method7557(Static593.aClass386_123, local17);
			@Pc(30) Class38 local30 = arg0.method7870(local22, Static688.method8616(Static536.aClass386_115, local17));
			Static204.aClass185Array7[local11] = new Class185(local30, local22);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIII)I")
	public static int method7346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static156.anInt3087 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(18) int local18 = arg2 - Static498.anInt8795;
		@Pc(29) int local29 = arg1 - Static498.anInt8796;
		for (@Pc(34) Class14_Sub46 local34 = (Class14_Sub46) Static498.aClass262_60.method6318(); local34 != null; local34 = (Class14_Sub46) Static498.aClass262_60.method6311()) {
			if (arg0 == local34.anInt8309) {
				@Pc(43) int local43 = local34.anInt8308;
				@Pc(46) int local46 = local34.anInt8307;
				@Pc(56) int local56 = Static498.anInt8796 + local46 | local43 + Static498.anInt8795 << 14;
				@Pc(76) int local76 = (local18 - local43) * (local18 - local43) + (local29 - local46) * (-local46 + local29);
				if (local12 < 0 || local76 < local14) {
					local12 = local56;
					local14 = local76;
				}
			}
		}
		return local12;
	}
}
