import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	public static int anInt4732;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Lclient!l;")
	public static Class57 aClass57_15;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "[I")
	public static final int[] anIntArray378 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	public static int anInt4747 = -50;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Z")
	public static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public static void method4024() {
		@Pc(9) int local9 = Static156.anInt3023 * 128 + 64;
		@Pc(15) int local15 = Static158.anInt3055 * 128 + 64;
		@Pc(24) int local24 = Static286.method4919(local9, local15, Static163.anInt3184) - Static256.anInt5088;
		if (Static145.anInt2900 < 100) {
			if (local9 > Static110.anInt2324) {
				Static110.anInt2324 += (local9 - Static110.anInt2324) * Static145.anInt2900 / 1000 + Static210.anInt4316;
				if (Static110.anInt2324 > local9) {
					Static110.anInt2324 = local9;
				}
			}
			if (local9 < Static110.anInt2324) {
				Static110.anInt2324 -= Static145.anInt2900 * (Static110.anInt2324 - local9) / 1000 + Static210.anInt4316;
				if (local9 > Static110.anInt2324) {
					Static110.anInt2324 = local9;
				}
			}
			if (local24 > Static175.anInt3631) {
				Static175.anInt3631 += Static210.anInt4316 + (local24 - Static175.anInt3631) * Static145.anInt2900 / 1000;
				if (local24 < Static175.anInt3631) {
					Static175.anInt3631 = local24;
				}
			}
			if (Static175.anInt3631 > local24) {
				Static175.anInt3631 -= Static210.anInt4316 + (Static175.anInt3631 - local24) * Static145.anInt2900 / 1000;
				if (local24 > Static175.anInt3631) {
					Static175.anInt3631 = local24;
				}
			}
			if (Static210.anInt4317 < local15) {
				Static210.anInt4317 += (local15 - Static210.anInt4317) * Static145.anInt2900 / 1000 + Static210.anInt4316;
				if (local15 < Static210.anInt4317) {
					Static210.anInt4317 = local15;
				}
			}
			if (Static210.anInt4317 > local15) {
				Static210.anInt4317 -= Static145.anInt2900 * (Static210.anInt4317 - local15) / 1000 + Static210.anInt4316;
				if (local15 > Static210.anInt4317) {
					Static210.anInt4317 = local15;
				}
			}
		} else {
			Static210.anInt4317 = Static158.anInt3055 * 128 + 64;
			Static110.anInt2324 = Static156.anInt3023 * 128 + 64;
			Static175.anInt3631 = Static286.method4919(Static110.anInt2324, Static210.anInt4317, Static163.anInt3184) - Static256.anInt5088;
		}
		local9 = Static341.anInt6652 * 128 + 64;
		local15 = Static327.anInt6306 * 128 + 64;
		local24 = Static286.method4919(local9, local15, Static163.anInt3184) - Static26.anInt694;
		@Pc(237) int local237 = local9 - Static110.anInt2324;
		@Pc(242) int local242 = local24 - Static175.anInt3631;
		@Pc(247) int local247 = local15 - Static210.anInt4317;
		@Pc(258) int local258 = (int) Math.sqrt((double) (local247 * local247 + local237 * local237));
		@Pc(269) int local269 = (int) (Math.atan2((double) local242, (double) local258) * 2607.5945876176133D) & 0x3FFF;
		if (local269 < 1024) {
			local269 = 1024;
		}
		@Pc(287) int local287 = (int) (Math.atan2((double) local237, (double) local247) * -2607.5945876176133D) & 0x3FFF;
		if (local269 > 3072) {
			local269 = 3072;
		}
		if (local269 > Static154.anInt6368) {
			Static154.anInt6368 += Static335.anInt6512 + (local269 - Static154.anInt6368 >> 3) * Static119.anInt2573 / 1000 << 3;
			if (local269 < Static154.anInt6368) {
				Static154.anInt6368 = local269;
			}
		}
		if (Static154.anInt6368 > local269) {
			Static154.anInt6368 -= Static335.anInt6512 + (Static154.anInt6368 - local269 >> 3) * Static119.anInt2573 / 1000 << 3;
			if (Static154.anInt6368 < local269) {
				Static154.anInt6368 = local269;
			}
		}
		@Pc(363) int local363 = local287 - Static350.anInt6797;
		if (local363 > 8192) {
			local363 -= 16384;
		}
		if (local363 < -8192) {
			local363 += 16384;
		}
		local363 >>= 0x3;
		if (local363 > 0) {
			Static350.anInt6797 += local363 * Static119.anInt2573 / 1000 + Static335.anInt6512 << 3;
			Static350.anInt6797 &= 0x3FFF;
		}
		if (local363 < 0) {
			Static350.anInt6797 -= -local363 * Static119.anInt2573 / 1000 + Static335.anInt6512 << 3;
			Static350.anInt6797 &= 0x3FFF;
		}
		@Pc(421) int local421 = local287 - Static350.anInt6797;
		if (local421 > 8192) {
			local421 -= 16384;
		}
		if (local421 < -8192) {
			local421 += 16384;
		}
		if (local421 < 0 && local363 > 0 || local421 > 0 && local363 < 0) {
			Static350.anInt6797 = local287;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4025(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(18) byte local18 = 2;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local18 == 0) {
				local26 = Character.toLowerCase(local26);
			} else if (local18 == 2 || Character.isUpperCase(local26)) {
				local26 = Static23.method435(local26);
			}
			if (Character.isLetter(local26)) {
				local18 = 0;
			} else if (local26 == '.' || local26 == '?' || local26 == '!') {
				local18 = 2;
			} else if (!Character.isSpaceChar(local26)) {
				local18 = 1;
			} else if (local18 != 2) {
				local18 = 1;
			}
			local11[local20] = local26;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(CII)C")
	public static char method4026(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!de;ILjava/lang/Object;)V")
	public static void method4027(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static134.method2241(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public static void method4029() {
		Static216.aClass198_39.method5236();
		Static164.aClass198_58.method5236();
	}
}
