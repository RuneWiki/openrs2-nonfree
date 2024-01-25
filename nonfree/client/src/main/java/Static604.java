import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!st", name = "u", descriptor = "Lclient!afa;")
	public static Class9_Sub1_Sub1_Sub2_Sub1 aClass9_Sub1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!st", name = "y", descriptor = "I")
	public static int anInt9164;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "Lclient!kka;")
	public static final Class214 aClass214_3 = new Class214(128);

	@OriginalMember(owner = "client!st", name = "D", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_91 = new Class144(48, 3);

	@OriginalMember(owner = "client!st", name = "F", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_85 = new Class307(3000000, 200);

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(I)I")
	public static int method7755() {
		return Static565.anInt8601;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg0;
		@Pc(21) int local21 = arg2 - arg0;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg2 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local41 + (1 - local57) * local25;
		@Pc(83) int local83 = local29 - (local57 - 1) * local45;
		@Pc(91) int local91 = local33 * (1 - local66) + local49;
		@Pc(100) int local100 = local37 - local53 * (local66 - 1);
		@Pc(104) int local104 = local25 << 2;
		@Pc(108) int local108 = local29 << 2;
		@Pc(112) int local112 = local33 << 2;
		@Pc(116) int local116 = local37 << 2;
		@Pc(120) int local120 = local41 * 3;
		@Pc(126) int local126 = (local57 - 3) * local45;
		@Pc(130) int local130 = local49 * 3;
		@Pc(136) int local136 = (local66 - 3) * local53;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = local104 * (arg2 - 1);
		@Pc(146) int local146 = local116;
		@Pc(171) int local171;
		@Pc(179) int local179;
		@Pc(188) int local188;
		@Pc(197) int local197;
		if (arg4 >= Static549.anInt5294 && Static334.anInt5381 >= arg4) {
			@Pc(162) int[] local162 = Static118.anIntArrayArray7[arg4];
			local171 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1 - arg5);
			local179 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg5 + arg1);
			local188 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1 - local16);
			local197 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1 + local16);
			Static202.method3077(local162, local171, arg6, local188);
			Static202.method3077(local162, local188, arg3, local197);
			Static202.method3077(local162, local197, arg6, local179);
		}
		@Pc(221) int local221 = local112 * (local21 - 1);
		while (local9 > 0) {
			@Pc(236) boolean local236 = local9 <= local21;
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local120;
					local83 += local138;
					local138 += local108;
					local120 += local108;
					local7++;
				}
			}
			if (local236) {
				if (local91 < 0) {
					while (local91 < 0) {
						local100 += local146;
						local91 += local130;
						local130 += local116;
						local146 += local116;
						local11++;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local91 += local130;
					local130 += local116;
					local146 += local116;
					local11++;
				}
				local91 += -local221;
				local100 += -local136;
				local221 -= local112;
				local136 -= local112;
			}
			if (local83 < 0) {
				local83 += local138;
				local75 += local120;
				local120 += local108;
				local138 += local108;
				local7++;
			}
			local75 += -local144;
			local83 += -local126;
			local9--;
			local144 -= local104;
			local126 -= local104;
			local171 = arg4 - local9;
			local179 = local9 + arg4;
			if (Static549.anInt5294 <= local179 && Static334.anInt5381 >= local171) {
				local188 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1 + local7);
				local197 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1 - local7);
				if (local236) {
					@Pc(423) int local423 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1 + local11);
					@Pc(432) int local432 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1 - local11);
					@Pc(443) int[] local443;
					if (Static549.anInt5294 <= local171) {
						local443 = Static118.anIntArrayArray7[local171];
						Static202.method3077(local443, local197, arg6, local432);
						Static202.method3077(local443, local432, arg3, local423);
						Static202.method3077(local443, local423, arg6, local188);
					}
					if (Static334.anInt5381 >= local179) {
						local443 = Static118.anIntArrayArray7[local179];
						Static202.method3077(local443, local197, arg6, local432);
						Static202.method3077(local443, local432, arg3, local423);
						Static202.method3077(local443, local423, arg6, local188);
					}
				} else {
					if (local171 >= Static549.anInt5294) {
						Static202.method3077(Static118.anIntArrayArray7[local171], local197, arg6, local188);
					}
					if (local179 <= Static334.anInt5381) {
						Static202.method3077(Static118.anIntArrayArray7[local179], local197, arg6, local188);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
	public static boolean method7757(@OriginalArg(2) String arg0) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		}
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(48) char local48 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local48 == '-') {
					local31 = true;
					continue;
				}
				if (local48 == '+' && true) {
					continue;
				}
			}
			@Pc(83) int local83;
			if (local48 >= '0' && local48 <= '9') {
				local83 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local83 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local83 = local48 - 'W';
			} else {
				return false;
			}
			if (local83 >= 10) {
				return false;
			}
			if (local31) {
				local83 = -local83;
			}
			@Pc(145) int local145 = local83 + local35 * 10;
			if (local145 / 10 != local35) {
				return false;
			}
			local33 = true;
			local35 = local145;
		}
		if (128 == 128) {
			return local33;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([I[Ljava/lang/String;I)V")
	public static void method7758(@OriginalArg(0) int[] arg0, @OriginalArg(1) String[] arg1) {
		Static654.method8581(arg1.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(B)V")
	public static void method7759() {
		if (Static546.anIntArray610 != null) {
			return;
		}
		Static546.anIntArray610 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
			@Pc(45) float local45 = ((float) (local32 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(54) float local54 = (float) (local32 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
				@Pc(63) float local63 = (float) local56 / 128.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(69) float local69 = 0.0F;
				@Pc(73) float local73 = local45 / 60.0F;
				@Pc(76) int local76 = (int) local73;
				@Pc(80) int local80 = local76 % 6;
				@Pc(86) float local86 = (float) -local76 + local73;
				@Pc(92) float local92 = local63 * (1.0F - local54);
				@Pc(101) float local101 = (1.0F - local86 * local54) * local63;
				@Pc(112) float local112 = local63 * (1.0F - (1.0F - local86) * local54);
				if (local80 == 0) {
					local65 = local63;
					local67 = local112;
					local69 = local92;
				} else if (local80 == 1) {
					local67 = local63;
					local65 = local101;
					local69 = local92;
				} else if (local80 == 2) {
					local69 = local112;
					local67 = local63;
					local65 = local92;
				} else if (local80 == 3) {
					local69 = local63;
					local65 = local92;
					local67 = local101;
				} else if (local80 == 4) {
					local67 = local92;
					local65 = local112;
					local69 = local63;
				} else if (local80 == 5) {
					local67 = local92;
					local69 = local101;
					local65 = local63;
				}
				local65 = (float) Math.pow((double) local65, local20);
				local67 = (float) Math.pow((double) local67, local20);
				local69 = (float) Math.pow((double) local69, local20);
				@Pc(210) int local210 = (int) (local65 * 256.0F);
				@Pc(215) int local215 = (int) (local67 * 256.0F);
				@Pc(220) int local220 = (int) (local69 * 256.0F);
				@Pc(234) int local234 = (local215 << 8) + (local210 << 16) + local220 - 16777216;
				Static546.anIntArray610[local22++] = local234;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!wia;)V")
	public static void method7760(@OriginalArg(1) Class403 arg0) {
		Static332.aClass403_1 = arg0;
	}
}
