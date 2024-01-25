import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_26 = new Class243();

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_69 = new Class217(12, 8);

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "[I")
	public static int[] anIntArray277 = new int[2];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!cu;)V")
	public static void method3338(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (Static415.aClass103_5 == null) {
			return;
		}
		try {
			Static415.aClass103_5.method2519(0L);
			Static415.aClass103_5.method2518(arg1.aByteArray46, 24, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method3339(@OriginalArg(1) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(17) byte[] local17 = (byte[]) arg0;
			return Static163.method4906(local17, arg1);
		} else if (arg0 instanceof Class79) {
			@Pc(29) Class79 local29 = (Class79) arg0;
			return local29.method4226(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method3340() {
		Static381.aClass243_53.method5200();
		for (@Pc(18) Class3_Sub14 local18 = (Class3_Sub14) Static184.aClass243_21.method5208(); local18 != null; local18 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
			if (local18.anInt2182 < 1000) {
				local18.method5977();
				Static381.aClass243_53.method5198(local18);
			}
		}
		Static381.aClass243_53.method5212(Static184.aClass243_21);
		@Pc(44) int local44 = -1;
		@Pc(49) Class3_Sub23 local49 = (Class3_Sub23) Static79.aClass243_34.method5208();
		if (local49 != null) {
			local44 = local49.method3478();
		}
		if (!Static438.aBoolean636) {
			if (local44 == 0 && (Static216.anInt4119 == 1 && Static158.anInt3162 > 2 || Static21.method469())) {
				local44 = 2;
			}
			if (local44 == 2 && Static158.anInt3162 > 0 && local49 != null) {
				if (Static238.aClass156_9 == null && Static31.anInt6062 == 0) {
					Static193.method3084(local49.method3475(), local49.method3474());
				} else {
					Static292.anInt5273 = 2;
				}
			}
			if (local44 == 0 && Static158.anInt3162 > 0) {
				Static439.method5749();
			}
			if (Static238.aClass156_9 == null && Static31.anInt6062 == 0) {
				Static292.anInt5273 = 0;
				Static191.aClass3_Sub14_1 = null;
				return;
			}
			return;
		}
		@Pc(133) int local133;
		@Pc(137) int local137;
		if (local44 == -1) {
			local133 = Static290.aClass100_1.method3218();
			local137 = Static290.aClass100_1.method3213();
			if (local133 < Static124.anInt7631 - 10 || local133 > Static126.anInt2657 + Static124.anInt7631 + 10 || Static442.anInt7488 - 10 > local137 || Static442.anInt7488 + Static242.anInt4631 + 10 < local137) {
				Static438.aBoolean636 = false;
				Static313.method4344(Static126.anInt2657, Static242.anInt4631, Static124.anInt7631, Static442.anInt7488);
			}
		}
		if (local44 != 0) {
			return;
		}
		local133 = Static124.anInt7631;
		local137 = Static442.anInt7488;
		@Pc(184) int local184 = Static126.anInt2657;
		@Pc(188) int local188 = local49.method3475();
		@Pc(192) int local192 = local49.method3474();
		@Pc(194) int local194 = -1;
		@Pc(214) int local214;
		for (@Pc(196) int local196 = 0; local196 < Static158.anInt3162; local196++) {
			if (Static378.aBoolean550) {
				local214 = local137 + (Static158.anInt3162 - local196 - 1) * 16 + 33;
				if (local188 > local133 && local184 + local133 > local188 && local192 > local214 - 13 && local214 + 4 > local192) {
					local194 = local196;
				}
			} else {
				local214 = local137 + (Static158.anInt3162 - local196 + -1) * 16 + 31;
				if (local188 > local133 && local188 < local184 + local133 && local214 - 13 < local192 && local192 < local214 + 3) {
					local194 = local196;
				}
			}
		}
		if (local194 != -1) {
			local214 = 0;
			@Pc(304) Class40 local304 = new Class40(Static184.aClass243_21);
			for (@Pc(309) Class3_Sub14 local309 = (Class3_Sub14) local304.method1127(); local309 != null; local309 = (Class3_Sub14) local304.method1126()) {
				if (local194 == local214) {
					Static68.method1329(local188, local309, local192);
				}
				local214++;
			}
		}
		Static438.aBoolean636 = false;
		Static313.method4344(Static126.anInt2657, Static242.anInt4631, Static124.anInt7631, Static442.anInt7488);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)V")
	public static void method3342(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static128.anInt2672 + Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318;
		@Pc(15) int local15 = Static1.anInt13 + Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321;
		if (Static35.anInt1000 - local10 < -500 || Static35.anInt1000 - local10 > 500 || Static215.anInt4111 - local15 < -500 || Static215.anInt4111 - local15 > 500) {
			Static215.anInt4111 = local15;
			Static35.anInt1000 = local10;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		if (local10 != Static35.anInt1000) {
			local57 = local10 - Static35.anInt1000;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 <= 0) {
				if (local65 == 0) {
					local65 = -1;
				} else if (local57 > local65) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = 1;
			} else if (local57 < local65) {
				local65 = local57;
			}
			Static35.anInt1000 += local65;
		}
		if (local15 != Static215.anInt4111) {
			local57 = local15 - Static215.anInt4111;
			local65 = (int) (arg0 * (long) local57 / 320L);
			if (local57 <= 0) {
				if (local65 == 0) {
					local65 = -1;
				} else if (local65 < local57) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = 1;
			} else if (local65 > local57) {
				local65 = local57;
			}
			Static215.anInt4111 += local65;
		}
		if (!Static374.aClass20_Sub1_1.aBoolean186) {
			Static180.aFloat27 += (float) arg0 * Static300.aFloat57 / 6.0F;
			Static252.aFloat47 += Static352.aFloat67 * (float) arg0 / 6.0F;
		}
		Static264.method3840();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)Z")
	public static boolean method3343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static420.method5370(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static336.anInt5747;
		@Pc(14) int local14 = arg2 << Static336.anInt5747;
		@Pc(23) int local23 = Static444.aClass159Array3[arg0].I(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static336.anInt5747 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static336.anInt5747 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static336.anInt5747 - 7);
		if (arg3 == 1) {
			if (local10 > Static3.anInt65) {
				if (!Static328.method4427(local10, local23, local14)) {
					return false;
				}
				if (!Static328.method4427(local10, local23, local14 + Static421.anInt6887)) {
					return false;
				}
				if (!Static328.method4427(local10, local23, local14 + Static205.anInt3992)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static328.method4427(local10, local31, local14)) {
					return false;
				}
				if (!Static328.method4427(local10, local31, local14 + Static421.anInt6887)) {
					return false;
				}
				if (!Static328.method4427(local10, local31, local14 + Static205.anInt3992)) {
					return false;
				}
			}
			if (!Static328.method4427(local10, local39, local14)) {
				return false;
			} else if (Static328.method4427(local10, local39, local14 + Static421.anInt6887)) {
				return Static328.method4427(local10, local39, local14 + Static205.anInt3992);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static254.anInt4875) {
				if (!Static328.method4427(local10, local23, local14 + Static205.anInt3992)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static421.anInt6887, local23, local14 + Static205.anInt3992)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static205.anInt3992, local23, local14 + Static205.anInt3992)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static328.method4427(local10, local31, local14 + Static205.anInt3992)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static421.anInt6887, local31, local14 + Static205.anInt3992)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static205.anInt3992, local31, local14 + Static205.anInt3992)) {
					return false;
				}
			}
			if (!Static328.method4427(local10, local39, local14 + Static205.anInt3992)) {
				return false;
			} else if (Static328.method4427(local10 + Static421.anInt6887, local39, local14 + Static205.anInt3992)) {
				return Static328.method4427(local10 + Static205.anInt3992, local39, local14 + Static205.anInt3992);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static3.anInt65) {
				if (!Static328.method4427(local10 + Static205.anInt3992, local23, local14)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static205.anInt3992, local23, local14 + Static421.anInt6887)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static205.anInt3992, local23, local14 + Static205.anInt3992)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static328.method4427(local10 + Static205.anInt3992, local31, local14)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static205.anInt3992, local31, local14 + Static421.anInt6887)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static205.anInt3992, local31, local14 + Static205.anInt3992)) {
					return false;
				}
			}
			if (!Static328.method4427(local10 + Static205.anInt3992, local39, local14)) {
				return false;
			} else if (Static328.method4427(local10 + Static205.anInt3992, local39, local14 + Static421.anInt6887)) {
				return Static328.method4427(local10 + Static205.anInt3992, local39, local14 + Static205.anInt3992);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static254.anInt4875) {
				if (!Static328.method4427(local10, local23, local14)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static421.anInt6887, local23, local14)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static205.anInt3992, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static328.method4427(local10, local31, local14)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static421.anInt6887, local31, local14)) {
					return false;
				}
				if (!Static328.method4427(local10 + Static205.anInt3992, local31, local14)) {
					return false;
				}
			}
			if (!Static328.method4427(local10, local39, local14)) {
				return false;
			} else if (Static328.method4427(local10 + Static421.anInt6887, local39, local14)) {
				return Static328.method4427(local10 + Static205.anInt3992, local39, local14);
			} else {
				return false;
			}
		} else if (!Static328.method4427(local10 + Static421.anInt6887, local47, local14 + Static421.anInt6887)) {
			return false;
		} else if (arg3 == 16) {
			return Static328.method4427(local10, local39, local14 + Static205.anInt3992);
		} else if (arg3 == 32) {
			return Static328.method4427(local10 + Static205.anInt3992, local39, local14 + Static205.anInt3992);
		} else if (arg3 == 64) {
			return Static328.method4427(local10 + Static205.anInt3992, local39, local14);
		} else if (arg3 == 128) {
			return Static328.method4427(local10, local39, local14);
		} else {
			return true;
		}
	}
}
