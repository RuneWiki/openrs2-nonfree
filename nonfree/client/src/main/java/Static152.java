import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1176 = Static64.method1101("floorshadows");

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!sf;")
	public static Class105 aClass105_17 = new Class105();

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1177 = Static64.method1101("::fpson");

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1178 = Static64.method1101("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public static void method2614(@OriginalArg(1) int arg0) {
		Static166.anInt3735 += arg0 * 128;
		if (Static179.anIntArray298.length < Static166.anInt3735) {
			Static166.anInt3735 -= Static179.anIntArray298.length;
			@Pc(29) int local29 = (int) (Math.random() * 12.0D);
			Static110.method1052(Static8.aClass41_Sub1Array1[local29]);
		}
		@Pc(48) int local48 = arg0 * 128;
		@Pc(54) int local54 = (256 - arg0) * 128;
		@Pc(56) int local56 = 0;
		@Pc(82) int local82;
		for (@Pc(58) int local58 = 0; local58 < local54; local58++) {
			local82 = Static206.anIntArray329[local56 + local48] - Static179.anIntArray298[Static179.anIntArray298.length - 1 & Static166.anInt3735 + local56] * arg0 / 6;
			if (local82 < 0) {
				local82 = 0;
			}
			Static206.anIntArray329[local56++] = local82;
		}
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(115) int local115;
		for (local82 = 256 - arg0; local82 < 256; local82++) {
			local106 = local82 * 128;
			for (local108 = 0; local108 < 128; local108++) {
				local115 = (int) (Math.random() * 100.0D);
				if (local115 < 50 && local108 > 10 && local108 < 118) {
					Static206.anIntArray329[local108 + local106] = 255;
				} else {
					Static206.anIntArray329[local108 + local106] = 0;
				}
			}
		}
		for (local106 = 0; local106 < 256 - arg0; local106++) {
			Static177.anIntArray297[local106] = Static177.anIntArray297[arg0 + local106];
		}
		for (local108 = 256 - arg0; local108 < 256; local108++) {
			Static177.anIntArray297[local108] = (int) (Math.sin((double) Static192.anInt4165 / 14.0D) * 16.0D + Math.sin((double) Static192.anInt4165 / 15.0D) * 14.0D + Math.sin((double) Static192.anInt4165 / 16.0D) * 12.0D);
			Static192.anInt4165++;
		}
		Static75.anInt1212 += arg0;
		local115 = (arg0 + (Static109.anInt2430 & 0x1)) / 2;
		if (local115 <= 0) {
			return;
		}
		@Pc(245) int local245;
		@Pc(252) int local252;
		for (@Pc(236) int local236 = 0; local236 < Static75.anInt1212; local236++) {
			local245 = (int) (Math.random() * 124.0D) + 2;
			local252 = (int) (Math.random() * 128.0D) + 128;
			Static206.anIntArray329[(local252 << 7) + local245] = 192;
		}
		Static75.anInt1212 = 0;
		@Pc(276) int local276;
		@Pc(279) int local279;
		for (local245 = 0; local245 < 256; local245++) {
			local252 = 0;
			local276 = local245 * 128;
			for (local279 = -local115; local279 < 128; local279++) {
				if (local279 + local115 < 128) {
					local252 += Static206.anIntArray329[local276 + local279 + local115];
				}
				if (local279 - local115 - 1 >= 0) {
					local252 -= Static206.anIntArray329[local279 + local276 - local115 - 1];
				}
				if (local279 >= 0) {
					Static47.anIntArray66[local276 + local279] = local252 / (local115 * 2 + 1);
				}
			}
		}
		for (local252 = 0; local252 < 128; local252++) {
			local276 = 0;
			for (local279 = -local115; local279 < 256; local279++) {
				@Pc(360) int local360 = local279 * 128;
				if (local115 + local279 < 256) {
					local276 += Static47.anIntArray66[local360 + local252 + local115 * 128];
				}
				if (local279 - local115 - 1 >= 0) {
					local276 -= Static47.anIntArray66[local360 + local252 - local115 * 128 - 128];
				}
				if (local279 >= 0) {
					Static206.anIntArray329[local360 + local252] = local276 / (local115 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[IJZ)Lclient!ia;")
	public static Class51 method2616(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Static120.anInterface1_1 != null) {
			@Pc(12) Class51 local12 = Static120.anInterface1_1.method3497(arg2, arg1, arg0);
			if (local12 != null) {
				return local12;
			}
		}
		return arg0 == 5 ? Static202.method3323(arg2).method1437() : Static208.method3449(arg2);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
	public static void method2617() {
		@Pc(9) byte[][] local9 = Static43.aByteArrayArray1;
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static208.method3447();
			for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
				for (@Pc(29) int local29 = 0; local29 < 13; local29++) {
					@Pc(33) boolean local33 = false;
					@Pc(41) int local41 = anIntArrayArrayArray8[local11][local25][local29];
					if (local41 != -1) {
						@Pc(50) int local50 = local41 >> 24 & 0x3;
						@Pc(63) int local63 = local41 >> 1 & 0x3;
						@Pc(69) int local69 = local41 >> 14 & 0x3FF;
						@Pc(75) int local75 = local41 >> 3 & 0x7FF;
						@Pc(86) int local86 = (local69 / 8 << 8) + (local75 / 8);
						for (@Pc(88) int local88 = 0; local88 < Static164.anIntArray240.length; local88++) {
							if (local86 == Static164.anIntArray240[local88] && local9[local88] != null) {
								local33 = true;
								Static59.method1034(local63, local9[local88], (local75 & 0x7) * 8, local50, local11, (local69 & 0x7) * 8, local25 * 8, Static228.aClass90Array1, local29 * 8);
								break;
							}
						}
					}
					if (!local33) {
						Static163.method2757(local11, local29 * 8, local25 * 8, 8, 8);
					}
				}
			}
		}
	}
}
