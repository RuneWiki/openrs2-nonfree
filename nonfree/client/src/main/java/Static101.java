import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!ra;")
	public static Class170 aClass170_44;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!ra;")
	public static Class170 aClass170_45;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Lclient!ra;")
	public static Class170 aClass170_46;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	public static void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static133.method5819(Static80.anInt4809, arg0 + arg1, Static184.anInt6250);
		@Pc(31) int local31 = Static133.method5819(Static80.anInt4809, arg1 - arg0, Static184.anInt6250);
		Static247.method3552(arg3, local31, Static332.anIntArrayArray56[arg2], local22);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(60) int local60;
			@Pc(65) int local65;
			@Pc(83) int local83;
			@Pc(92) int local92;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local60 = arg2 - local9;
				local65 = arg2 + local9;
				if (Static314.anInt6018 <= local65 && Static334.anInt6315 >= local60) {
					local83 = Static133.method5819(Static80.anInt4809, local7 + arg1, Static184.anInt6250);
					local92 = Static133.method5819(Static80.anInt4809, arg1 - local7, Static184.anInt6250);
					if (Static334.anInt6315 >= local65) {
						Static247.method3552(arg3, local92, Static332.anIntArrayArray56[local65], local83);
					}
					if (Static314.anInt6018 <= local60) {
						Static247.method3552(arg3, local92, Static332.anIntArrayArray56[local60], local83);
					}
				}
			}
			local7++;
			local60 = arg2 - local7;
			local65 = local7 + arg2;
			if (Static314.anInt6018 <= local65 && Static334.anInt6315 >= local60) {
				local83 = Static133.method5819(Static80.anInt4809, arg1 + local9, Static184.anInt6250);
				local92 = Static133.method5819(Static80.anInt4809, arg1 - local9, Static184.anInt6250);
				if (local65 <= Static334.anInt6315) {
					Static247.method3552(arg3, local92, Static332.anIntArrayArray56[local65], local83);
				}
				if (local60 >= Static314.anInt6018) {
					Static247.method3552(arg3, local92, Static332.anIntArrayArray56[local60], local83);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZZ)V")
	public static void method2032(@OriginalArg(1) boolean arg0) {
		Static262.method4498(arg0, Static17.anInt5991, Static246.anInt4801, Static207.anInt4106);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!en;JI)V")
	public static void method2033(@OriginalArg(0) Class59 arg0, @OriginalArg(1) long arg1) {
		Static140.anInt2789 = Static336.anInt5416;
		Static230.anInt4514 = 0;
		Static336.anInt5416 = 0;
		@Pc(14) long local14 = Static284.method4783();
		for (@Pc(19) Class63_Sub5 local19 = (Class63_Sub5) Static337.aClass24_6.method619(); local19 != null; local19 = (Class63_Sub5) Static337.aClass24_6.method627()) {
			if (local19.method4123(arg0, arg1)) {
				Static230.anInt4514++;
			}
		}
		if (Static177.aBoolean156 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static337.aClass24_6.method624() + ", running: " + Static230.anInt4514 + ". Particles: " + Static336.anInt5416 + ". Time taken: " + (Static284.method4783() - local14) + "ms");
		}
	}
}
