import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
	public static int anInt7898;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_126 = new Class397(102, -1);

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "I")
	public static int anInt7889 = -1;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_10 = new Class344(4, 3);

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
	public static int anInt7902 = 0;

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)[Lclient!ra;")
	public static Class320[] method6773() {
		return new Class320[] { Static142.aClass320_9, Static10.aClass320_1, Static168.aClass320_10, Static653.aClass320_39, Static532.aClass320_32, Static212.aClass320_12, Static524.aClass320_31, Static460.aClass320_24, Static126.aClass320_8, Static644.aClass320_38, Static119.aClass320_22, Static349.aClass320_17, Static203.aClass320_11, Static541.aClass320_33, Static397.aClass320_20, Static594.aClass320_27, Static495.aClass320_28, Static668.aClass320_40, Static460.aClass320_25, Static501.aClass320_29, Static695.aClass320_26, Static61.aClass320_4, Static616.aClass320_35, Static703.aClass320_42, Static596.aClass320_34, Static407.aClass320_21, Static228.aClass320_43, Static348.aClass320_16, Static522.aClass320_30, Static68.aClass320_5, Static627.aClass320_37 };
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)Z")
	public static boolean method6774(@OriginalArg(1) int arg0) {
		if (arg0 == 2 || arg0 == 51 || arg0 == 10 || arg0 == 6 || arg0 == 12 || arg0 == 1006) {
			return true;
		} else {
			return arg0 == 21;
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IBIBLclient!afa;)V")
	public static void method6775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class9_Sub1_Sub1_Sub2_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray644[0];
		@Pc(15) int local15 = arg2.anIntArray643[0];
		if (local10 < 0 || Static497.anInt7926 <= local10 || local15 < 0 || local15 >= Static646.anInt9979 || (arg0 < 0 || Static497.anInt7926 <= arg0 || arg1 < 0 || arg1 >= Static646.anInt9979)) {
			return;
		}
		@Pc(102) int local102 = Static173.method8685(true, arg0, Static125.anIntArray151, 0, -4, local15, arg2.method7485(), 0, local10, arg1, Static68.anIntArray87, 0, Static455.aClass109Array1[arg2.aByte139], 0);
		if (local102 >= 1 && local102 <= 3) {
			for (@Pc(118) int local118 = 0; local118 < local102 - 1; local118++) {
				arg2.method479((byte) 2, Static68.anIntArray87[local118], Static125.anIntArray151[local118]);
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!vla;IIIBI)V")
	public static void method6781(@OriginalArg(0) Class3_Sub56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt10749 == -1 && arg0.anIntArray770 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg0.anInt10746 * Static580.aClass3_Sub22_24.aClass21_Sub16_2.method5404() >> 8;
		if (arg0.anInt10744 < arg1) {
			local19 = arg1 - arg0.anInt10744;
		} else if (arg0.anInt10743 > arg1) {
			local19 = arg0.anInt10743 - arg1;
		}
		if (arg0.anInt10748 < arg2) {
			local19 += arg2 - arg0.anInt10748;
		} else if (arg0.anInt10741 > arg2) {
			local19 += arg0.anInt10741 - arg2;
		}
		if (arg0.anInt10739 == 0 || arg0.anInt10739 < local19 - 256 || Static580.aClass3_Sub22_24.aClass21_Sub16_2.method5404() == 0 || arg4 != arg0.anInt10753) {
			if (arg0.aClass3_Sub33_Sub5_1 != null) {
				Static391.aClass3_Sub33_Sub4_1.method8544(arg0.aClass3_Sub33_Sub5_1);
				arg0.aClass3_Sub27_1 = null;
				arg0.aClass3_Sub33_Sub5_1 = null;
				arg0.aClass3_Sub34_Sub1_1 = null;
			}
			if (arg0.aClass3_Sub33_Sub5_2 != null) {
				Static391.aClass3_Sub33_Sub4_1.method8544(arg0.aClass3_Sub33_Sub5_2);
				arg0.aClass3_Sub34_Sub1_2 = null;
				arg0.aClass3_Sub33_Sub5_2 = null;
				arg0.aClass3_Sub27_2 = null;
			}
			return;
		}
		local19 -= 256;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(177) int local177 = arg0.anInt10739 - arg0.anInt10752;
		if (local177 < 0) {
			local177 = arg0.anInt10739;
		}
		@Pc(184) int local184 = local29;
		@Pc(189) int local189 = local19 - arg0.anInt10752;
		if (local189 > 0 && local177 > 0) {
			local184 = (local177 - local189) * local29 / local177;
		}
		Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485();
		@Pc(223) int local223 = 8192;
		@Pc(234) int local234 = (arg0.anInt10744 + arg0.anInt10743) / 2 - arg1;
		@Pc(246) int local246 = (arg0.anInt10748 + arg0.anInt10741) / 2 - arg2;
		@Pc(269) int local269;
		@Pc(289) int local289;
		if (local234 != 0 || local246 != 0) {
			local269 = -Static46.anInt1301 - (int) (Math.atan2((double) local234, (double) local246) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local269 > 8192) {
				local269 = 16384 - local269;
			}
			if (local19 <= 0) {
				local289 = 8192;
			} else if (local19 >= 4096) {
				local289 = 16384;
			} else {
				local289 = local19 * 8192 / 4096 + 8192;
			}
			local223 = (16384 - local289 >> 1) + local269 * local289 / 8192;
		}
		@Pc(407) Class3_Sub33_Sub5 local407;
		if (arg0.aClass3_Sub33_Sub5_1 != null) {
			arg0.aClass3_Sub33_Sub5_1.method8742(local184);
			arg0.aClass3_Sub33_Sub5_1.method8740(local223);
		} else if (arg0.anInt10749 >= 0) {
			local269 = arg0.anInt10740 == 256 && arg0.anInt10751 == 256 ? 256 : Static155.method2526(arg0.anInt10740, arg0.anInt10751);
			if (arg0.aBoolean731) {
				if (arg0.aClass3_Sub27_1 == null) {
					arg0.aClass3_Sub27_1 = Static230.method3366(Static388.aClass182_81, arg0.anInt10749);
				}
				if (arg0.aClass3_Sub27_1 != null) {
					if (arg0.aClass3_Sub34_Sub1_1 == null) {
						arg0.aClass3_Sub34_Sub1_1 = arg0.aClass3_Sub27_1.method3362(new int[] { 22050 });
					}
					if (arg0.aClass3_Sub34_Sub1_1 != null) {
						local407 = Static737.method8739(arg0.aClass3_Sub34_Sub1_1, local269, local184 << 6, local223);
						local407.method8730(-1);
						Static391.aClass3_Sub33_Sub4_1.method8545(local407);
						arg0.aClass3_Sub33_Sub5_1 = local407;
					}
				}
			} else {
				@Pc(424) Class402 local424 = Static738.method9472(Static692.aClass182_126, arg0.anInt10749, 0);
				if (local424 != null) {
					@Pc(431) Class3_Sub34_Sub1 local431 = local424.method9474().method9470(Static53.aClass359_1);
					@Pc(439) Class3_Sub33_Sub5 local439 = Static737.method8739(local431, local269, local184 << 6, local223);
					local439.method8730(-1);
					Static391.aClass3_Sub33_Sub4_1.method8545(local439);
					arg0.aClass3_Sub33_Sub5_1 = local439;
				}
			}
		}
		if (arg0.aClass3_Sub33_Sub5_2 != null) {
			arg0.aClass3_Sub33_Sub5_2.method8742(local184);
			arg0.aClass3_Sub33_Sub5_2.method8740(local223);
			if (!arg0.aClass3_Sub33_Sub5_2.method9597()) {
				arg0.aClass3_Sub33_Sub5_2 = null;
				arg0.aClass3_Sub34_Sub1_2 = null;
				arg0.aClass3_Sub27_2 = null;
			}
		} else if (arg0.anIntArray770 != null && (arg0.anInt10742 -= arg3) <= 0) {
			local269 = arg0.anInt10740 == 256 && arg0.anInt10751 == 256 ? 256 : arg0.anInt10751 + (int) (Math.random() * (double) (arg0.anInt10740 - arg0.anInt10751));
			if (!arg0.aBoolean730) {
				local289 = (int) ((double) arg0.anIntArray770.length * Math.random());
				@Pc(540) Class402 local540 = Static738.method9472(Static692.aClass182_126, arg0.anIntArray770[local289], 0);
				if (local540 != null) {
					@Pc(547) Class3_Sub34_Sub1 local547 = local540.method9474().method9470(Static53.aClass359_1);
					@Pc(555) Class3_Sub33_Sub5 local555 = Static737.method8739(local547, local269, local184 << 6, local223);
					local555.method8730(0);
					Static391.aClass3_Sub33_Sub4_1.method8545(local555);
					arg0.anInt10742 = arg0.anInt10755 + (int) (Math.random() * (double) (arg0.anInt10745 - arg0.anInt10755));
					arg0.aClass3_Sub33_Sub5_2 = local555;
					return;
				}
				return;
			}
			if (arg0.aClass3_Sub27_2 == null) {
				local289 = (int) ((double) arg0.anIntArray770.length * Math.random());
				arg0.aClass3_Sub27_2 = Static230.method3366(Static388.aClass182_81, arg0.anIntArray770[local289]);
			}
			if (arg0.aClass3_Sub27_2 != null) {
				if (arg0.aClass3_Sub34_Sub1_2 == null) {
					arg0.aClass3_Sub34_Sub1_2 = arg0.aClass3_Sub27_2.method3362(new int[] { 22050 });
				}
				if (arg0.aClass3_Sub34_Sub1_2 != null) {
					local407 = Static737.method8739(arg0.aClass3_Sub34_Sub1_2, local269, local184 << 6, local223);
					local407.method8730(0);
					Static391.aClass3_Sub33_Sub4_1.method8545(local407);
					arg0.anInt10742 = arg0.anInt10755 + (int) (Math.random() * (double) (arg0.anInt10745 - arg0.anInt10755));
					arg0.aClass3_Sub33_Sub5_2 = local407;
					return;
				}
			}
		}
	}
}
