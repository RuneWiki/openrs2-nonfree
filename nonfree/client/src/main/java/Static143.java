import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
	public static int anInt2899;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "[I")
	public static final int[] anIntArray180 = new int[1];

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "Lclient!st;")
	public static final Class314 aClass314_46 = new Class314(43, -1);

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_4 = new Class178(12, 0, 1, 0);

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
	public static int anInt2900 = 0;

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
	public static int anInt2901 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(JI)V")
	public static void method2414(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static318.method5301(arg0 - 1L);
			Static318.method5301(1L);
		} else {
			Static318.method5301(arg0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)[Lclient!ub;")
	public static Class334[] method2415() {
		if (Static426.aClass334Array1 == null) {
			@Pc(16) Class334[] local16 = Static443.method6643(Static48.aClass298_12);
			@Pc(20) Class334[] local20 = new Class334[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27 = Static32.aClass3_Sub41_3.aClass7_Sub20_1.method6317();
			@Pc(89) int local89;
			@Pc(95) Class334 local95;
			label69: for (@Pc(29) int local29 = 0; local29 < local16.length; local29++) {
				@Pc(35) Class334 local35 = local16[local29];
				if ((local35.anInt9334 <= 0 || local35.anInt9334 >= 24) && local35.anInt9336 >= 800 && local35.anInt9335 >= 600 && (local27 != 2 || local35.anInt9336 <= 800 && local35.anInt9335 <= 600) && (local27 != 1 || local35.anInt9336 <= 1024 && local35.anInt9335 <= 768)) {
					for (local89 = 0; local89 < local22; local89++) {
						local95 = local20[local89];
						if (local95.anInt9336 == local35.anInt9336 && local35.anInt9335 == local95.anInt9335) {
							if (local35.anInt9334 > local95.anInt9334) {
								local20[local89] = local35;
							}
							continue label69;
						}
					}
					local20[local22] = local35;
					local22++;
				}
			}
			Static426.aClass334Array1 = new Class334[local22];
			Static651.method752(local20, 0, Static426.aClass334Array1, 0, local22);
			@Pc(159) int[] local159 = new int[Static426.aClass334Array1.length];
			for (local89 = 0; local89 < Static426.aClass334Array1.length; local89++) {
				local95 = Static426.aClass334Array1[local89];
				local159[local89] = local95.anInt9335 * local95.anInt9336;
			}
			Static457.method6778(Static426.aClass334Array1, local159);
		}
		return Static426.aClass334Array1;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
	public static void method2416() {
		Static436.aClass344Array1 = null;
		if (Static80.aBoolean118 && Static339.method917() != 1) {
			Static595.method8230(Static82.anInt1653 == 3 || Static82.anInt1653 == 7, Static617.method8423(), 0, 0, Static449.method6754());
		}
		@Pc(36) int local36 = 0;
		@Pc(44) int local44 = 0;
		if (Static80.aBoolean118) {
			local36 = Static211.method3297();
			local44 = Static551.method7856();
		}
		Static502.method7304(local44 + Static190.anInt3576, -1, local36, local36 + Static330.anInt6254, Static528.anInt8950, local44, local44, local36);
		if (Static436.aClass344Array1 != null) {
			Static169.method2819(Static422.anInt7634, Static190.anInt3576 + local44, Static495.aClass344_11.anInt9589, Static590.anInt9671, local36, local44, true, -1412584499, Static436.aClass344Array1, Static330.anInt6254 + local36);
			Static436.aClass344Array1 = null;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLclient!ni;)V")
	public static void method2418(@OriginalArg(1) Class9_Sub2_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt10171 - Static304.anInt8391;
		@Pc(25) int local25 = arg0.anInt10190 * 512 + arg0.method8619() * 256;
		@Pc(36) int local36 = arg0.anInt10199 * 512 + arg0.method8619() * 256;
		arg0.anInt10158 += (local36 - arg0.anInt10158) / local9;
		arg0.anInt10152 += (local25 - arg0.anInt10152) / local9;
		arg0.anInt10235 = 0;
		if (arg0.anInt10168 == 0) {
			arg0.method8635(8192);
		}
		if (arg0.anInt10168 == 1) {
			arg0.method8635(12288);
		}
		if (arg0.anInt10168 == 2) {
			arg0.method8635(0);
		}
		if (arg0.anInt10168 == 3) {
			arg0.method8635(4096);
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V")
	public static void method2419() {
		@Pc(7) int local7 = Static174.anInt3362;
		@Pc(15) int[] local15 = Static495.anIntArray529;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class9_Sub2_Sub1_Sub2_Sub1 local25 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local15[local17]];
			if (local25 != null) {
				Static378.method5964(local25.method8619(), local25);
			}
		}
	}
}
