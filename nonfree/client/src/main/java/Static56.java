import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public static int anInt1240;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!vm;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!qj;")
	public static Class165 aClass165_21;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_33 = new Class140(64);

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public static int anInt1244 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIILclient!lo;IILclient!hc;IIZBILclient!aa;)Lclient!hc;")
	public static Class78 method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class78 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class2 arg13) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg5 != null) {
			local11 = arg5.method3559(-1, false, arg7) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = (long) ((arg10 << 24) + (arg1 << 16) + arg4) + ((long) arg3 << 32) + ((long) arg12 << 48);
		@Pc(51) Class140 local51 = Static135.aClass140_73;
		@Pc(59) Class78 local59;
		synchronized (Static135.aClass140_73) {
			local59 = (Class78) Static135.aClass140_73.method3816(local49);
		}
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(168) int local168;
		@Pc(172) int local172;
		if (local59 == null || arg13.method3247(local59.method4398(), local11) != 0) {
			if (local59 != null) {
				local11 = arg13.method3292(local11, local59.method4398());
			}
			@Pc(94) byte local94;
			if (arg4 == 1) {
				local94 = 9;
			} else if (arg4 == 2) {
				local94 = 12;
			} else if (arg4 == 3) {
				local94 = 15;
			} else if (arg4 == 4) {
				local94 = 18;
			} else {
				local94 = 21;
			}
			@Pc(131) int[] local131 = new int[] { 64, 96, 128 };
			@Pc(149) Class12 local149 = new Class12(local94 * 3 + 1, -local94 + local94 * 6, 0);
			local156 = local149.method365(0, 0, 0);
			@Pc(160) int[][] local160 = new int[3][local94];
			@Pc(174) int local174;
			@Pc(198) int local198;
			for (local162 = 0; local162 < 3; local162++) {
				local168 = local131[local162];
				local172 = local131[local162];
				for (local174 = 0; local174 < local94; local174++) {
					@Pc(182) int local182 = (local174 << 14) / local94;
					@Pc(190) int local190 = Class1_Sub1_Sub16.anIntArray587[local182] * local168 >> 15;
					local198 = Class1_Sub1_Sub16.anIntArray586[local182] * local172 >> 15;
					local160[local162][local174] = local149.method365(local198, 0, local190);
				}
			}
			for (local168 = 0; local168 < 3; local168++) {
				local172 = (local168 * 256 + 128) / 3;
				local174 = 256 - local172;
				@Pc(253) byte local253 = (byte) (arg10 * local172 + arg1 * local174 >> 8);
				@Pc(298) short local298 = (short) ((local172 * (arg12 & 0x380) + (arg3 & 0x380) * local174 & 0x38000) + (local172 * (arg12 & 0xFC00) + local174 * (arg3 & 0xFC00) & 0xFC0000) + ((arg12 & 0x7F) * local172 + local174 * (arg3 & 0x7F) & 0x7F00) >> 8);
				for (local198 = 0; local198 < local94; local198++) {
					if (local168 == 0) {
						local149.method373(local156, local160[0][local198], local253, (byte) 1, (short) -1, local160[0][(local198 + 1) % local94], (byte) -1, local298);
					} else {
						local149.method373(local160[local168 - 1][local198], local160[local168][(local198 + 1) % local94], local253, (byte) 1, (short) -1, local160[local168 - 1][(local198 + 1) % local94], (byte) -1, local298);
						local149.method373(local160[local168 - 1][local198], local160[local168][local198], local253, (byte) 1, (short) -1, local160[local168][(local198 + 1) % local94], (byte) -1, local298);
					}
				}
			}
			local59 = arg13.method3251(local149, local11, Static351.anInt6507, 64, 768);
			@Pc(425) Class140 local425 = Static135.aClass140_73;
			synchronized (Static135.aClass140_73) {
				Static135.aClass140_73.method3817(local49, local59);
			}
		}
		@Pc(444) int local444 = arg4 * 64 - 1;
		@Pc(447) int local447 = -local444;
		@Pc(450) int local450 = -local444;
		@Pc(452) int local452 = local444;
		local156 = local444;
		if (arg11) {
			if (arg2 > 13312 || arg2 < 3072) {
				local450 -= 128;
			}
			if (arg2 > 1024 && arg2 < 7168) {
				local447 -= 128;
			}
			if (arg2 > 9216 && arg2 < 15360) {
				local452 = local444 + 128;
			}
			if (arg2 > 5120 && arg2 < 11264) {
				local156 = local444 + 128;
			}
		}
		@Pc(502) int local502 = arg8.method4387();
		local162 = arg8.method4363();
		local168 = arg8.method4378();
		if (local447 > local502) {
			local502 = local447;
		}
		if (local452 < local162) {
			local162 = local452;
		}
		if (local450 > local168) {
			local168 = local450;
		}
		local172 = arg8.method4391();
		if (local156 < local172) {
			local172 = local156;
		}
		@Pc(541) Class1_Sub1_Sub3 local541 = null;
		if (arg5 != null) {
			@Pc(548) int local548 = arg5.anIntArray446[arg7];
			local541 = Static210.method3849(local548 >> 16);
			arg7 = local548 & 0xFFFF;
		}
		if (local541 == null) {
			local59 = local59.method4394((byte) 3, local11, true);
			local59.method4393((local162 - local502) / 2, 128, (local172 - local168) / 2);
			local59.method4399((local502 + local162) / 2, 0, (local168 + local172) / 2);
		} else {
			local59 = local59.method4394((byte) 3, local11, true);
			local59.method4393((local162 - local502) / 2, 128, (local172 - local168) / 2);
			local59.method4399((local502 + local162) / 2, 0, (local168 + local172) / 2);
			local59.method4364(local541, arg7);
		}
		if (arg6 != 0) {
			local59.method4369(arg6);
		}
		if (arg9 != 0) {
			local59.method4389(arg9);
		}
		if (arg0 != 0) {
			local59.method4399(0, arg0, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;ZZLclient!rj;)V")
	public static void method1211(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(21) int local21 = Static273.aClass38_8.method1309(null, 250, arg0);
		@Pc(30) int local30 = Static273.aClass38_8.method1311(null, 250, arg0) * 13;
		Static34.aClass2_6.method3300(6, 6, local21 + 4 + 4, local30 + 4 + 4, -16777216, 0);
		Static34.aClass2_6.method3263(6, 6, local21 + 4 + 4, local30 - -4 + 4, -1, 0);
		arg2.method4442(arg0, 1, 0, 0, null, 1, local21, 0, -1, 10, -1, 10, null, local30, null);
		Static50.method1133(local30 + 8, local21 - -8, 6, 6);
		if (arg1) {
			Static34.aClass2_6.method3264();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
	public static void method1212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static106.anInt2157 <= arg4 && Static251.anInt6512 >= arg2 && Static49.anInt1124 <= arg0 && Static291.anInt5657 >= arg1) {
			Static155.method2948(arg2, arg1, arg0, arg4, arg3);
		} else {
			Static333.method4246(arg3, arg0, arg2, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!rg;III)V")
	public static void method1213(@OriginalArg(0) Class177 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static317.aClass177_22 != null || Static179.aBoolean310 || (arg0 == null || Static241.method4286(arg0) == null)) {
			return;
		}
		Static317.aClass177_22 = arg0;
		Static66.aClass177_3 = Static241.method4286(arg0);
		Static40.anInt4331 = 0;
		Static119.aBoolean174 = false;
		Static318.anInt6103 = arg2;
		Static313.anInt6037 = arg1;
	}
}
