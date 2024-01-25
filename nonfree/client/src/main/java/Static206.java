import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Lclient!pw;")
	public static Class275 aClass275_1;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIB)Z")
	public static boolean method3642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static325.aBoolean431) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static458.aClass115ArrayArray2[local13] == null || Static458.aClass115ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class115 local40 = Static458.aClass115ArrayArray2[local13][local17];
		@Pc(55) Class4_Sub18 local55;
		if (arg1 == -1 && local40.anInt3519 == 0) {
			for (local55 = (Class4_Sub18) Static354.aClass124_32.method3267(); local55 != null; local55 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
				if (local55.anInt3158 == 50 || local55.anInt3158 == 1006 || local55.anInt3158 == 10 || local55.anInt3158 == 4 || local55.anInt3158 == 12) {
					for (@Pc(86) Class115 local86 = Static92.method2118(local55.anInt3161); local86 != null; local86 = Static352.method7380(local86)) {
						if (local86.anInt3464 == local40.anInt3464) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class4_Sub18) Static354.aClass124_32.method3267(); local55 != null; local55 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
				if (local55.anInt3163 == arg1 && local55.anInt3161 == local40.anInt3464 && (local55.anInt3158 == 50 || local55.anInt3158 == 1006 || local55.anInt3158 == 10 || local55.anInt3158 == 4 || local55.anInt3158 == 12)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method3643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(16) String local16 = arg2[arg0];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg0 + arg1;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg0; local31 < local27; local31++) {
				@Pc(37) String local37 = arg2[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local29);
			for (@Pc(62) int local62 = arg0; local62 < local27; local62++) {
				@Pc(68) String local68 = arg2[local62];
				if (local68 == null) {
					local60.append("null");
				} else {
					local60.append(local68);
				}
			}
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)S")
	public static short method3645(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(38) int local38 = local19 > 64 ? (127 - local19) * local15 >> 7 : local15 * local19 >> 7;
		@Pc(43) int local43 = local19 + local38;
		@Pc(56) int local56;
		if (local43 == 0) {
			local56 = local38 << 1;
		} else {
			local56 = (local38 << 8) / local43;
		}
		return (short) (local43 | local9 << 10 | local56 >> 4 << 7);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!eda;[[BZ)V")
	public static void method3646(@OriginalArg(0) Class85_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local15; local22++) {
			@Pc(28) byte[] local28 = arg1[local22];
			if (local28 != null) {
				@Pc(35) Class4_Sub9 local35 = new Class4_Sub9(local28);
				local41 = Static380.anIntArray543[local22] >> 8;
				@Pc(47) int local47 = Static380.anIntArray543[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static373.anInt6695;
				@Pc(61) int local61 = local47 * 64 - Static6.anInt97;
				Static464.method6712();
				arg0.method2386(local61, local35, Static6.anInt97, local54, Static15.aClass84Array1, Static373.anInt6695);
				arg0.method2390(local35, local54, local12, Static185.aClass66_14, local61);
				if (!arg0.aBoolean215 && local41 == Static304.anInt5549 / 8 && Static403.anInt6995 / 8 == local47 && local12[0] != -1) {
					Static122.aClass255_3 = Static5.aClass60_1.method1362(local12[1], local12[0], local12[3], Static276.aClass110_1, local12[2]);
					Static529.anInt8997 = local12[4];
				}
			}
		}
		for (@Pc(130) int local130 = 0; local130 < local15; local130++) {
			@Pc(143) int local143 = (Static380.anIntArray543[local130] >> 8) * 64 - Static373.anInt6695;
			local41 = (Static380.anIntArray543[local130] & 0xFF) * 64 - Static6.anInt97;
			@Pc(158) byte[] local158 = arg1[local130];
			if (local158 == null && Static403.anInt6995 < 800) {
				Static464.method6712();
				arg0.method2381(local41, local143);
			}
		}
	}
}
