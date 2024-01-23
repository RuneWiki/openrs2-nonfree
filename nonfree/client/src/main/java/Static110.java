import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
	public static int anInt2029;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public static int anInt2023 = 0;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "[Lclient!sd;")
	public static Class10_Sub5_Sub2[] aClass10_Sub5_Sub2Array1 = new Class10_Sub5_Sub2[32768];

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "Z")
	public static boolean aBoolean160 = true;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIIIIZ)V")
	public static void method1778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3;
		@Pc(8) int local8;
		for (local3 = 0; local3 < 104; local3++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static158.anIntArrayArray46[local3][local8] = 0;
				Static57.anIntArrayArray14[local3][local8] = 99999999;
			}
		}
		local3 = arg8;
		local8 = arg2;
		@Pc(41) byte local41 = 0;
		Static158.anIntArrayArray46[arg8][arg2] = 99;
		Static57.anIntArrayArray14[arg8][arg2] = 0;
		Static76.anIntArray141[0] = arg8;
		@Pc(65) int local65 = local41 + 1;
		Static35.anIntArray55[0] = arg2;
		@Pc(69) boolean local69 = false;
		@Pc(71) int local71 = 0;
		@Pc(76) int[][] local76 = Static138.aClass153Array1[Static99.anInt1826].anIntArrayArray69;
		@Pc(203) int local203;
		@Pc(257) int local257;
		label329: while (local65 != local71) {
			local3 = Static76.anIntArray141[local71];
			local8 = Static35.anIntArray55[local71];
			local71 = local71 + 1 & 0xFFF;
			if (arg6 == local3 && arg0 == local8) {
				local69 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static138.aClass153Array1[Static99.anInt1826].method4086(arg0, arg3 - 1, arg5, local3, local8, arg6, arg4)) {
					local69 = true;
					break;
				}
				if (arg3 < 10 && Static138.aClass153Array1[Static99.anInt1826].method4077(arg6, arg3 - 1, arg4, local8, arg0, local3, arg5)) {
					local69 = true;
					break;
				}
			}
			if (arg9 != 0 && arg1 != 0 && Static138.aClass153Array1[Static99.anInt1826].method4079(arg9, arg1, local8, local3, arg5, arg0, arg6, arg7)) {
				local69 = true;
				break;
			}
			local203 = Static57.anIntArrayArray14[local3][local8] + 1;
			if (local3 > 0 && Static158.anIntArrayArray46[local3 - 1][local8] == 0 && (local76[local3 - 1][local8] & 0x2C010E) == 0 && (local76[local3 - 1][local8 + arg5 - 1] & 0x2C0138) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg5 - 1) {
						Static76.anIntArray141[local65] = local3 - 1;
						Static35.anIntArray55[local65] = local8;
						local65 = local65 + 1 & 0xFFF;
						Static158.anIntArrayArray46[local3 - 1][local8] = 2;
						Static57.anIntArrayArray14[local3 - 1][local8] = local203;
						break;
					}
					if ((local76[local3 - 1][local257 + local8] & 0x2C013E) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local3 < 102 && Static158.anIntArrayArray46[local3 + 1][local8] == 0 && (local76[arg5 + local3][local8] & 0x2C0183) == 0 && (local76[local3 + arg5][arg5 + local8 - 1] & 0x2C01E0) == 0) {
				local257 = 1;
				while (true) {
					if (arg5 - 1 <= local257) {
						Static76.anIntArray141[local65] = local3 + 1;
						Static35.anIntArray55[local65] = local8;
						local65 = local65 + 1 & 0xFFF;
						Static158.anIntArrayArray46[local3 + 1][local8] = 8;
						Static57.anIntArrayArray14[local3 + 1][local8] = local203;
						break;
					}
					if ((local76[local3 + arg5][local8 + local257] & 0x2C01E3) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local8 > 0 && Static158.anIntArrayArray46[local3][local8 - 1] == 0 && (local76[local3][local8 - 1] & 0x2C010E) == 0 && (local76[local3 + arg5 - 1][local8 - 1] & 0x2C0183) == 0) {
				local257 = 1;
				while (true) {
					if (arg5 - 1 <= local257) {
						Static76.anIntArray141[local65] = local3;
						Static35.anIntArray55[local65] = local8 - 1;
						local65 = local65 + 1 & 0xFFF;
						Static158.anIntArrayArray46[local3][local8 - 1] = 1;
						Static57.anIntArrayArray14[local3][local8 - 1] = local203;
						break;
					}
					if ((local76[local3 + local257][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local8 < 102 && Static158.anIntArrayArray46[local3][local8 + 1] == 0 && (local76[local3][local8 + arg5] & 0x2C0138) == 0 && (local76[arg5 + local3 - 1][local8 + arg5] & 0x2C01E0) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg5 - 1) {
						Static76.anIntArray141[local65] = local3;
						Static35.anIntArray55[local65] = local8 + 1;
						Static158.anIntArrayArray46[local3][local8 + 1] = 4;
						Static57.anIntArrayArray14[local3][local8 + 1] = local203;
						local65 = local65 + 1 & 0xFFF;
						break;
					}
					if ((local76[local3 + local257][local8 + arg5] & 0x2C01F8) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local3 > 0 && local8 > 0 && Static158.anIntArrayArray46[local3 - 1][local8 - 1] == 0 && (local76[local3 - 1][local8 - 1] & 0x2C010E) == 0) {
				local257 = 1;
				while (true) {
					if (local257 >= arg5) {
						Static76.anIntArray141[local65] = local3 - 1;
						Static35.anIntArray55[local65] = local8 - 1;
						Static158.anIntArrayArray46[local3 - 1][local8 - 1] = 3;
						Static57.anIntArrayArray14[local3 - 1][local8 - 1] = local203;
						local65 = local65 + 1 & 0xFFF;
						break;
					}
					if ((local76[local3 - 1][local8 + local257 - 1] & 0x2C013E) != 0 || (local76[local257 + local3 - 1][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local3 < 102 && local8 > 0 && Static158.anIntArrayArray46[local3 + 1][local8 - 1] == 0 && (local76[arg5 + local3][local8 - 1] & 0x2C0183) == 0) {
				local257 = 1;
				while (true) {
					if (arg5 <= local257) {
						Static76.anIntArray141[local65] = local3 + 1;
						Static35.anIntArray55[local65] = local8 - 1;
						Static158.anIntArrayArray46[local3 + 1][local8 - 1] = 9;
						local65 = local65 + 1 & 0xFFF;
						Static57.anIntArrayArray14[local3 + 1][local8 - 1] = local203;
						break;
					}
					if ((local76[local3 + arg5][local8 + local257 - 1] & 0x2C01E3) != 0 || (local76[local3 + local257][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local3 > 0 && local8 < 102 && Static158.anIntArrayArray46[local3 - 1][local8 + 1] == 0 && (local76[local3 - 1][local8 + arg5] & 0x2C0138) == 0) {
				local257 = 1;
				while (true) {
					if (arg5 <= local257) {
						Static76.anIntArray141[local65] = local3 - 1;
						Static35.anIntArray55[local65] = local8 + 1;
						Static158.anIntArrayArray46[local3 - 1][local8 + 1] = 6;
						Static57.anIntArrayArray14[local3 - 1][local8 + 1] = local203;
						local65 = local65 + 1 & 0xFFF;
						break;
					}
					if ((local76[local3 - 1][local257 + local8] & 0x2C013E) != 0 || (local76[local3 + local257 - 1][local8 + arg5] & 0x2C01F8) != 0) {
						break;
					}
					local257++;
				}
			}
			if (local3 < 102 && local8 < 102 && Static158.anIntArrayArray46[local3 + 1][local8 + 1] == 0 && (local76[local3 + arg5][arg5 + local8] & 0x2C01E0) == 0) {
				for (local257 = 1; local257 < arg5; local257++) {
					if ((local76[local3 + local257][local8 + arg5] & 0x2C01F8) != 0 || (local76[arg5 + local3][local257 + local8] & 0x2C01E3) != 0) {
						continue label329;
					}
				}
				Static76.anIntArray141[local65] = local3 + 1;
				Static35.anIntArray55[local65] = local8 + 1;
				local65 = local65 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local3 + 1][local8 + 1] = 12;
				Static57.anIntArrayArray14[local3 + 1][local8 + 1] = local203;
			}
		}
		if (!local69) {
			local203 = 1000;
			local257 = 100;
			for (@Pc(1111) int local1111 = arg6 - 10; local1111 <= arg6 + 10; local1111++) {
				for (@Pc(1121) int local1121 = arg0 - 10; local1121 <= arg0 + 10; local1121++) {
					if (local1111 >= 0 && local1121 >= 0 && local1111 < 104 && local1121 < 104 && Static57.anIntArrayArray14[local1111][local1121] < 100) {
						@Pc(1157) int local1157 = 0;
						if (local1111 < arg6) {
							local1157 = arg6 - local1111;
						} else if (arg9 + arg6 - 1 < local1111) {
							local1157 = local1111 + 1 - arg9 - arg6;
						}
						@Pc(1185) int local1185 = 0;
						if (arg0 > local1121) {
							local1185 = arg0 - local1121;
						} else if (arg0 + arg1 - 1 < local1121) {
							local1185 = local1121 + 1 - arg1 - arg0;
						}
						@Pc(1220) int local1220 = local1157 * local1157 + local1185 * local1185;
						if (local203 > local1220 || local1220 == local203 && local257 > Static57.anIntArrayArray14[local1111][local1121]) {
							local8 = local1121;
							local3 = local1111;
							local257 = Static57.anIntArrayArray14[local1111][local1121];
							local203 = local1220;
						}
					}
				}
			}
			if (local203 == 1000) {
				return;
			}
			if (local3 == arg8 && arg2 == local8) {
				return;
			}
		}
		Static247.anInt4992 = local8;
		Static6.aBoolean11 = false;
		Static81.anInt1533 = local3;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I")
	public static int method1779() {
		return Static12.anInt234 == 0 ? 0 : Static59.anInterface1Array1[Static12.anInt234].method3986();
	}
}
