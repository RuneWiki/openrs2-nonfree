import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
	public static int anInt7862;

	@OriginalMember(owner = "client!pi", name = "N", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
	public static int anInt7863;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
	public static void method7011(@OriginalArg(0) byte arg0) {
		if (arg0 != 48) {
			method7011((byte) -75);
		}
		for (@Pc(17) Class2_Sub6_Sub17 local17 = (Class2_Sub6_Sub17) Static120.aClass60_37.method1226(7); local17 != null; local17 = (Class2_Sub6_Sub17) Static120.aClass60_37.method1228()) {
			@Pc(22) Class4_Sub2_Sub1_Sub3 local22 = local17.aClass4_Sub2_Sub1_Sub3_1;
			if (local22.anInt8198 < Static528.anInt8386) {
				local17.method9872();
				local22.method7305();
			} else if (Static528.anInt8386 >= local22.anInt8189) {
				local22.method7313();
				if (local22.anInt8209 > 0) {
					if (Static166.anInt2884 == 3) {
						@Pc(140) Class4_Sub2_Sub1_Sub2 local140 = Static199.aClass61Array1[local22.anInt8209 - 1].method1238();
						if (local140 != null && local140.anInt10229 >= 0 && local140.anInt10229 < Static426.anInt6942 * 512 && local140.anInt10228 >= 0 && local140.anInt10228 < Static280.anInt6752 * 512) {
							local22.method7309(local140.anInt10229, local140.anInt10228, arg0 - 45, Static324.method4554(local22.aByte133, local140.anInt10229, local140.anInt10228) + -local22.anInt8220, Static528.anInt8386);
						}
					} else {
						@Pc(72) Class2_Sub49 local72 = (Class2_Sub49) Static467.aClass218_37.method5095((long) (local22.anInt8209 - 1), arg0 - 48);
						if (local72 != null) {
							@Pc(77) Class4_Sub2_Sub1_Sub2_Sub2 local77 = local72.aClass4_Sub2_Sub1_Sub2_Sub2_3;
							if (local77.anInt10229 >= 0 && Static426.anInt6942 * 512 > local77.anInt10229 && local77.anInt10228 >= 0 && Static280.anInt6752 * 512 > local77.anInt10228) {
								local22.method7309(local77.anInt10229, local77.anInt10228, 3, Static324.method4554(local22.aByte133, local77.anInt10229, local77.anInt10228) - local22.anInt8220, Static528.anInt8386);
							}
						}
					}
				}
				if (local22.anInt8209 < 0) {
					@Pc(208) int local208 = -local22.anInt8209 - 1;
					@Pc(217) Class4_Sub2_Sub1_Sub2_Sub1 local217;
					if (Class4_Sub2_Sub1_Sub2.lb == local208) {
						local217 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2;
					} else {
						local217 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local208];
					}
					if (local217 != null && local217.anInt10229 >= 0 && Static426.anInt6942 * 512 > local217.anInt10229 && local217.anInt10228 >= 0 && local217.anInt10228 < Static280.anInt6752 * 512) {
						local22.method7309(local217.anInt10229, local217.anInt10228, 3, Static324.method4554(local22.aByte133, local217.anInt10229, local217.anInt10228) - local22.anInt8220, Static528.anInt8386);
					}
				}
				local22.method7310(Static371.anInt5922);
				Static432.method6282(local22, true);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([BBII)[B")
	public static byte[] method7014(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte[] local12 = new byte[32768];
		Static728.method274(arg0, arg1, local12, 0, 32768);
		return local12;
	}
}
