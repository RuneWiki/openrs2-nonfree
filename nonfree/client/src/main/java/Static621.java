import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
	public static int anInt9954;

	@OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
	public static int anInt9951 = 0;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V")
	public static void method8748() {
		Static210.aClass3_Sub25_Sub1_3.method3399();
		@Pc(18) int local18 = Static210.aClass3_Sub25_Sub1_3.method3402(8);
		@Pc(27) int local27;
		if (local18 < Static561.anInt9114) {
			for (local27 = local18; local27 < Static561.anInt9114; local27++) {
				Static96.anIntArray149[Static651.anInt10356++] = Static131.anIntArray226[local27];
			}
		}
		if (local18 > Static561.anInt9114) {
			throw new RuntimeException("gnpov1");
		}
		Static561.anInt9114 = 0;
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(65) int local65 = Static131.anIntArray226[local27];
			@Pc(73) Class28_Sub1_Sub1_Sub1_Sub2 local73 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) local65)).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			@Pc(78) int local78 = Static210.aClass3_Sub25_Sub1_3.method3402(1);
			if (local78 == 0) {
				Static131.anIntArray226[Static561.anInt9114++] = local65;
				local73.anInt10786 = Static360.anInt5808;
			} else {
				@Pc(101) int local101 = Static210.aClass3_Sub25_Sub1_3.method3402(2);
				if (local101 == 0) {
					Static131.anIntArray226[Static561.anInt9114++] = local65;
					local73.anInt10786 = Static360.anInt5808;
					Static394.anIntArray548[Static28.anInt551++] = local65;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local101 == 1) {
						Static131.anIntArray226[Static561.anInt9114++] = local65;
						local73.anInt10786 = Static360.anInt5808;
						local143 = Static210.aClass3_Sub25_Sub1_3.method3402(3);
						local73.method9330(1, local143);
						local153 = Static210.aClass3_Sub25_Sub1_3.method3402(1);
						if (local153 == 1) {
							Static394.anIntArray548[Static28.anInt551++] = local65;
						}
					} else if (local101 == 2) {
						Static131.anIntArray226[Static561.anInt9114++] = local65;
						local73.anInt10786 = Static360.anInt5808;
						if (Static210.aClass3_Sub25_Sub1_3.method3402(1) == 1) {
							local143 = Static210.aClass3_Sub25_Sub1_3.method3402(3);
							local73.method9330(2, local143);
							local153 = Static210.aClass3_Sub25_Sub1_3.method3402(3);
							local73.method9330(2, local153);
						} else {
							local143 = Static210.aClass3_Sub25_Sub1_3.method3402(3);
							local73.method9330(0, local143);
						}
						local143 = Static210.aClass3_Sub25_Sub1_3.method3402(1);
						if (local143 == 1) {
							Static394.anIntArray548[Static28.anInt551++] = local65;
						}
					} else if (local101 == 3) {
						Static96.anIntArray149[Static651.anInt10356++] = local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	public static void method8751(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static46.anInt1071 = 1;
		Static41.anInt961 = -1;
		Static191.method3505(arg0, false, arg1, false);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;C)Ljava/lang/String;")
	public static String method8752(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(22) int local22 = local11 - 1;
		if (local22 != 0) {
			@Pc(29) int local29 = 0;
			while (true) {
				local29 = arg0.indexOf(13, local29);
				if (local29 < 0) {
					break;
				}
				local13 += local22;
				local29++;
			}
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(local13);
		@Pc(53) int local53 = 0;
		while (true) {
			@Pc(58) int local58 = arg0.indexOf(13, local53);
			if (local58 < 0) {
				local51.append(arg0.substring(local53));
				return local51.toString();
			}
			local51.append(arg0.substring(local53, local58));
			local53 = local58 + 1;
			local51.append(arg1);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZ)Lclient!nd;")
	public static Class235 method8753(@OriginalArg(0) int arg0) {
		@Pc(10) Class235 local10 = (Class235) Static374.aClass165_40.method4389((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static524.aClass15_131.method517(arg0, 0);
		local10 = new Class235();
		if (local20 != null) {
			local10.method5551(new Class3_Sub25(local20));
		}
		local10.method5549();
		Static374.aClass165_40.method4392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(IB)V")
	public static void method8754(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static588.anInt9467 - Static316.anInt5288;
		if (local8 >= 100) {
			Static428.anInt6834 = 1;
			Static153.anInt3036 = -1;
			Static410.anInt6542 = -1;
			return;
		}
		@Pc(21) int local21 = (int) Static667.aFloat212;
		if (Static106.anInt2202 >> 8 > local21) {
			local21 = Static106.anInt2202 >> 8;
		}
		if (Class300.lb[4] && local21 < Static460.anIntArray646[4] + 128) {
			local21 = Static460.anIntArray646[4] + 128;
		}
		@Pc(62) int local62 = Static173.anInt3446 + (int) Static618.aFloat207 & 0x3FFF;
		Static143.method2623(Static350.anInt5703, local62, Static168.method3058(Static309.anInt5138, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731) - 200, local21, arg0, Static474.anInt7824, (local21 >> 3) * 3 + 600 << 2);
		@Pc(107) float local107 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static520.anInt8367 = (int) ((float) Static305.anInt5099 + local107 * (float) (Static520.anInt8367 - Static305.anInt5099));
		Static509.anInt8222 = (int) (local107 * (float) (Static509.anInt8222 - Static187.anInt3785) + (float) Static187.anInt3785);
		Static146.anInt2945 = (int) ((float) Static374.anInt5985 + local107 * (float) (Static146.anInt2945 - Static374.anInt5985));
		Static652.anInt10382 = (int) ((float) Static169.anInt3338 + (float) (Static652.anInt10382 - Static169.anInt3338) * local107);
		@Pc(158) int local158 = Static57.anInt1188 - Static598.anInt9577;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static57.anInt1188 = (int) (local107 * (float) local158 + (float) Static598.anInt9577);
		Static57.anInt1188 &= 0x3FFF;
	}
}
