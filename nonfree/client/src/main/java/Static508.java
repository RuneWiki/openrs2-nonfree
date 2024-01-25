import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	public static int anInt8798;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "[S")
	public static short[] aShortArray130 = new short[256];

	@OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
	public static final int[] anIntArray521 = new int[1000];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!oo;)V")
	public static void method6862(@OriginalArg(1) Class3_Sub26_Sub1 arg0) {
		arg0.method5554();
		@Pc(16) int local16 = Static147.anInt3433;
		@Pc(26) Class25_Sub2_Sub2_Sub5_Sub1 local26 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local16] = new Class25_Sub2_Sub2_Sub5_Sub1();
		local26.anInt8529 = local16;
		@Pc(34) int local34 = arg0.method5553(30);
		@Pc(39) byte local39 = (byte) (local34 >> 28);
		@Pc(45) int local45 = local34 >> 14 & 0x3FFF;
		@Pc(49) int local49 = local34 & 0x3FFF;
		local26.anIntArray512[0] = local45 - Static321.anInt5874;
		local26.anInt8476 = (local26.anIntArray512[0] << 9) + (local26.method6668() << 8);
		local26.anIntArray513[0] = local49 - Static137.anInt3293;
		local26.anInt8482 = (local26.anIntArray513[0] << 9) + (local26.method6668() << 8);
		Static594.anInt10310 = local26.aByte117 = local26.aByte118 = local39;
		if (Static269.method4098(local26.anIntArray512[0], local26.anIntArray513[0])) {
			local26.aByte118++;
		}
		if (Static173.aClass3_Sub26Array1[local16] != null) {
			local26.method5677(Static173.aClass3_Sub26Array1[local16]);
		}
		Static31.anInt499 = 0;
		Static315.anIntArray279[Static31.anInt499++] = local16;
		Static213.aByteArray106[local16] = 0;
		Static333.anInt6021 = 0;
		for (@Pc(147) int local147 = 1; local147 < 2048; local147++) {
			if (local147 != local16) {
				@Pc(157) int local157 = arg0.method5553(18);
				@Pc(161) int local161 = local157 >> 16;
				@Pc(167) int local167 = local157 >> 8 & 0xFF;
				@Pc(171) int local171 = local157 & 0xFF;
				@Pc(179) Class286 local179 = Static267.aClass286Array1[local147] = new Class286();
				local179.aBoolean556 = false;
				local179.anInt8078 = 0;
				local179.anInt8076 = (local167 << 14) + (local161 << 28) + local171;
				local179.anInt8077 = -1;
				Static488.anIntArray501[Static333.anInt6021++] = local147;
				Static213.aByteArray106[local147] = 0;
			}
		}
		arg0.method5547();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ofa;I)Z")
	public static boolean method6863(@OriginalArg(0) Interface14 arg0) {
		@Pc(18) Class194 local18 = Static536.aClass146_4.method3721(arg0.method4958());
		if (local18.anInt5810 == -1) {
			return true;
		} else {
			@Pc(31) Class40 local31 = Static493.aClass296_4.method6523(local18.anInt5810);
			return local31.anInt1275 == -1 ? true : local31.method1177();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[Lclient!ac;")
	public static Class5[] method6865() {
		return new Class5[] { Static412.aClass5_7, Static205.aClass5_6, Static28.aClass5_1, Static587.aClass5_5, Static512.aClass5_9, Static431.aClass5_8 };
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!oo;BI)V")
	public static void method6870(@OriginalArg(0) Class3_Sub26_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method5553(1) == 1;
		if (local15) {
			Static479.anIntArray492[Static222.anInt4597++] = arg1;
		}
		@Pc(30) int local30 = arg0.method5553(2);
		@Pc(34) Class25_Sub2_Sub2_Sub5_Sub1 local34 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(153) int local153;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local30 == 1) {
				local153 = arg0.method5553(3);
				local158 = local34.anIntArray512[0];
				local163 = local34.anIntArray513[0];
				if (local153 == 0) {
					local163--;
					local158--;
				} else if (local153 == 1) {
					local163--;
				} else if (local153 == 2) {
					local158++;
					local163--;
				} else if (local153 == 3) {
					local158--;
				} else if (local153 == 4) {
					local158++;
				} else if (local153 == 5) {
					local163++;
					local158--;
				} else if (local153 == 6) {
					local163++;
				} else if (local153 == 7) {
					local158++;
					local163++;
				}
				if (local15) {
					local34.anInt7143 = local163;
					local34.anInt7178 = local158;
					local34.aBoolean493 = true;
				} else {
					local34.method5669(Static112.aByteArray56[arg1], local163, local158);
				}
			} else if (local30 == 2) {
				local153 = arg0.method5553(4);
				local158 = local34.anIntArray512[0];
				local163 = local34.anIntArray513[0];
				if (local153 == 0) {
					local163 -= 2;
					local158 -= 2;
				} else if (local153 == 1) {
					local163 -= 2;
					local158--;
				} else if (local153 == 2) {
					local163 -= 2;
				} else if (local153 == 3) {
					local158++;
					local163 -= 2;
				} else if (local153 == 4) {
					local163 -= 2;
					local158 += 2;
				} else if (local153 == 5) {
					local158 -= 2;
					local163--;
				} else if (local153 == 6) {
					local158 += 2;
					local163--;
				} else if (local153 == 7) {
					local158 -= 2;
				} else if (local153 == 8) {
					local158 += 2;
				} else if (local153 == 9) {
					local163++;
					local158 -= 2;
				} else if (local153 == 10) {
					local163++;
					local158 += 2;
				} else if (local153 == 11) {
					local163 += 2;
					local158 -= 2;
				} else if (local153 == 12) {
					local163 += 2;
					local158--;
				} else if (local153 == 13) {
					local163 += 2;
				} else if (local153 == 14) {
					local158++;
					local163 += 2;
				} else if (local153 == 15) {
					local163 += 2;
					local158 += 2;
				}
				if (local15) {
					local34.aBoolean493 = true;
					local34.anInt7178 = local158;
					local34.anInt7143 = local163;
				} else {
					local34.method5669(Static112.aByteArray56[arg1], local163, local158);
				}
			} else {
				local153 = arg0.method5553(1);
				@Pc(429) int local429;
				@Pc(439) int local439;
				@Pc(450) int local450;
				@Pc(457) int local457;
				if (local153 == 0) {
					local158 = arg0.method5553(12);
					local163 = local158 >> 10;
					local429 = local158 >> 5 & 0x1F;
					if (local429 > 15) {
						local429 -= 32;
					}
					local439 = local158 & 0x1F;
					if (local439 > 15) {
						local439 -= 32;
					}
					local450 = local429 + local34.anIntArray512[0];
					local457 = local439 + local34.anIntArray513[0];
					if (local15) {
						local34.anInt7143 = local457;
						local34.aBoolean493 = true;
						local34.anInt7178 = local450;
					} else {
						local34.method5669(Static112.aByteArray56[arg1], local457, local450);
					}
					local34.aByte117 = local34.aByte118 = (byte) (local34.aByte117 + local163 & 0x3);
					if (Static269.method4098(local450, local457)) {
						local34.aByte118++;
					}
					if (arg1 == Static147.anInt3433) {
						Static594.anInt10310 = local34.aByte117;
					}
				} else {
					local158 = arg0.method5553(30);
					local163 = local158 >> 28;
					local429 = local158 >> 14 & 0x3FFF;
					local439 = local158 & 0x3FFF;
					local450 = (Static321.anInt5874 + local34.anIntArray512[0] + local429 & 0x3FFF) - Static321.anInt5874;
					local457 = (local34.anIntArray513[0] + Static137.anInt3293 + local439 & 0x3FFF) - Static137.anInt3293;
					if (local15) {
						local34.anInt7143 = local457;
						local34.anInt7178 = local450;
						local34.aBoolean493 = true;
					} else {
						local34.method5669(Static112.aByteArray56[arg1], local457, local450);
					}
					local34.aByte117 = local34.aByte118 = (byte) (local34.aByte117 + local163 & 0x3);
					if (Static269.method4098(local450, local457)) {
						local34.aByte118++;
					}
					if (Static147.anInt3433 == arg1) {
						Static594.anInt10310 = local34.aByte117;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean493 = false;
		} else if (Static147.anInt3433 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(65) Class286 local65 = Static267.aClass286Array1[arg1] = new Class286();
			local65.anInt8076 = (local34.anIntArray513[0] + Static137.anInt3293 >> 6) + (local34.anIntArray512[0] + Static321.anInt5874 >> 6 << 14) + (local34.aByte117 << 28);
			if (local34.anInt7144 == -1) {
				local65.anInt8078 = local34.aClass252_7.method5714();
			} else {
				local65.anInt8078 = local34.anInt7144;
			}
			local65.aBoolean556 = local34.aBoolean494;
			local65.anInt8077 = local34.anInt8536;
			if (local34.anInt7154 > 0) {
				Static52.method1263(local34);
			}
			Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[arg1] = null;
			if (arg0.method5553(1) != 0) {
				Static557.method4956(arg0, arg1);
			}
		}
	}
}
