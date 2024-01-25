import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public static int anInt5047;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public static int anInt5053 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZIII)V")
	public static void method4013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg2, 4);
		local8.method4716();
		local8.anInt5868 = arg0;
		local8.anInt5867 = arg1;
		local8.anInt5870 = arg3;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZ)V")
	public static void method4014(@OriginalArg(0) boolean arg0) {
		Static109.method1891(Static286.anInt4051, arg0, Static183.anInt3293, Static251.anInt4258);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method4015(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 - 96;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method4016() {
		if (Static434.anIntArray609 != null) {
			return;
		}
		Static434.anIntArray609 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(83) float local83 = local71 - (float) local74;
				@Pc(90) float local90 = local61 * (1.0F - local52);
				@Pc(99) float local99 = local61 * (1.0F - local52 * local83);
				@Pc(110) float local110 = (1.0F - local52 * (1.0F - local83)) * local61;
				if (local78 == 0) {
					local67 = local90;
					local65 = local110;
					local63 = local61;
				} else if (local78 == 1) {
					local65 = local61;
					local63 = local99;
					local67 = local90;
				} else if (local78 == 2) {
					local67 = local110;
					local63 = local90;
					local65 = local61;
				} else if (local78 == 3) {
					local67 = local61;
					local65 = local99;
					local63 = local90;
				} else if (local78 == 4) {
					local65 = local90;
					local67 = local61;
					local63 = local110;
				} else if (local78 == 5) {
					local65 = local90;
					local67 = local99;
					local63 = local61;
				}
				local63 = (float) Math.pow((double) local63, local25);
				local65 = (float) Math.pow((double) local65, local25);
				local67 = (float) Math.pow((double) local67, local25);
				@Pc(207) int local207 = (int) (local63 * 256.0F);
				@Pc(212) int local212 = (int) (local65 * 256.0F);
				@Pc(217) int local217 = (int) (local67 * 256.0F);
				@Pc(231) int local231 = (local207 << 16) - (-(local212 << 8) - local217) - 16777216;
				Static434.anIntArray609[local27++] = local231;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!t;IIBZILclient!ya;IIIILclient!lc;III)Lclient!t;")
	public static Class163 method4017(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class51 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class139 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg10 != null) {
			local11 = arg10.method3129(arg6, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg4 << 48) + (long) ((arg12 << 24) + (arg2 << 16) + arg1) + ((long) arg8 << 32);
		@Pc(50) Class126 local50 = Static124.aClass126_19;
		@Pc(58) Class163 local58;
		synchronized (Static124.aClass126_19) {
			local58 = (Class163) Static124.aClass126_19.method2822(local48);
		}
		@Pc(150) int local150;
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(166) int local166;
		if (local58 == null || arg5.method5352(local58.P(), local11) != 0) {
			if (local58 != null) {
				local11 = arg5.method5323(local11, local58.P());
			}
			@Pc(85) byte local85;
			if (arg1 == 1) {
				local85 = 9;
			} else if (arg1 == 2) {
				local85 = 12;
			} else if (arg1 == 3) {
				local85 = 15;
			} else if (arg1 == 4) {
				local85 = 18;
			} else {
				local85 = 21;
			}
			@Pc(125) int[] local125 = new int[] { 64, 96, 128 };
			@Pc(143) Class117 local143 = new Class117(local85 * 3 + 1, -local85 + 2 * 3 * local85, 0);
			local150 = local143.method2588(0, 0, 0);
			@Pc(154) int[][] local154 = new int[3][local85];
			@Pc(168) int local168;
			@Pc(192) int local192;
			for (local156 = 0; local156 < 3; local156++) {
				local162 = local125[local156];
				local166 = local125[local156];
				for (local168 = 0; local168 < local85; local168++) {
					@Pc(176) int local176 = (local168 << 14) / local85;
					@Pc(184) int local184 = Class22_Sub7.anIntArray411[local176] * local162 >> 15;
					local192 = Class22_Sub7.anIntArray410[local176] * local166 >> 15;
					local154[local156][local168] = local143.method2588(0, local192, local184);
				}
			}
			for (local162 = 0; local162 < 3; local162++) {
				local166 = (local162 * 256 + 128) / 3;
				local168 = 256 - local166;
				@Pc(242) byte local242 = (byte) (arg12 * local166 + local168 * arg2 >> 8);
				@Pc(287) short local287 = (short) (((arg8 & 0xFC00) * local168 + (arg4 & 0xFC00) * local166 & 0xFC0000) + ((arg4 & 0x380) * local166 + (arg8 & 0x380) * local168 & 0x38000) + ((arg8 & 0x7F) * local168 + local166 * (arg4 & 0x7F) & 0x7F00) >> 8);
				for (local192 = 0; local192 < local85; local192++) {
					if (local162 == 0) {
						local143.method2590(local154[0][local192], (short) -1, (byte) 1, local287, local150, local242, (byte) -1, local154[0][(local192 + 1) % local85]);
					} else {
						local143.method2590(local154[local162][(local192 + 1) % local85], (short) -1, (byte) 1, local287, local154[local162 - 1][local192], local242, (byte) -1, local154[local162 - 1][(local192 + 1) % local85]);
						local143.method2590(local154[local162][local192], (short) -1, (byte) 1, local287, local154[local162 - 1][local192], local242, (byte) -1, local154[local162][(local192 + 1) % local85]);
					}
				}
			}
			local58 = arg5.method5346(local143, local11, Static287.anInt6590, 64, 768);
			@Pc(410) Class126 local410 = Static124.aClass126_19;
			synchronized (Static124.aClass126_19) {
				Static124.aClass126_19.method2824(local48, local58);
			}
		}
		@Pc(429) int local429 = (arg1 << 6) - 1;
		@Pc(432) int local432 = -local429;
		@Pc(435) int local435 = -local429;
		@Pc(437) int local437 = local429;
		local150 = local429;
		if (arg3) {
			if (arg13 > 13312 || arg13 < 3072) {
				local435 -= 128;
			}
			if (arg13 > 9216 && arg13 < 15360) {
				local437 = local429 + 128;
			}
			if (arg13 > 1024 && arg13 < 7168) {
				local432 -= 128;
			}
			if (arg13 > 5120 && arg13 < 11264) {
				local150 = local429 + 128;
			}
		}
		@Pc(478) int local478 = arg0.HA();
		local156 = arg0.NA();
		local162 = arg0.PA();
		if (local162 < local435) {
			local162 = local435;
		}
		local166 = arg0.m();
		if (local478 < local432) {
			local478 = local432;
		}
		if (local437 < local156) {
			local156 = local437;
		}
		if (local166 > local150) {
			local166 = local150;
		}
		@Pc(530) Class7_Sub4_Sub18 local530 = null;
		if (arg10 != null) {
			@Pc(537) int local537 = arg10.anIntArray344[arg6];
			local530 = Static364.aClass151_2.method3289(local537 >> 16);
			arg6 = local537 & 0xFFFF;
		}
		if (local530 == null) {
			local58 = local58.method4654((byte) 3, local11, true);
			local58.H(local156 - local478 >> 1, 128, local166 - local162 >> 1);
			local58.JA(local478 + local156 >> 1, 0, local166 + local162 >> 1);
		} else {
			local58 = local58.method4654((byte) 3, local11, true);
			local58.H(local156 - local478 >> 1, 128, local166 - local162 >> 1);
			local58.JA(local156 + local478 >> 1, 0, local166 + local162 >> 1);
			local58.method4652(local530, arg6);
		}
		if (arg9 != 0) {
			local58.Z(arg9);
		}
		if (arg11 != 0) {
			local58.R(arg11);
		}
		if (arg7 != 0) {
			local58.JA(0, arg7, 0);
		}
		return local58;
	}
}
