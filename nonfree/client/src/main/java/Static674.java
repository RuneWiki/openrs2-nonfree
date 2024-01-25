import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	public static int anInt10876;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!ha;")
	public static Class13 aClass13_22;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "F")
	public static float aFloat227;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!jp;)V")
	public static void method9361(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static10.aClass344_1 != null) {
			@Pc(22) int local22;
			try {
				Static10.aClass344_1.method8361(0L);
				Static10.aClass344_1.method8359(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method8637(local8, 24, 0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ID)V")
	public static void method9362(@OriginalArg(1) double arg0) {
		if (arg0 == Static540.aDouble28) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static402.anIntArray559[local15] = local27 > 255 ? 255 : local27;
		}
		Static540.aDouble28 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public static void method9363() {
		@Pc(9) int local9 = Static210.aClass3_Sub25_Sub1_3.method8609();
		@Pc(13) int local13 = Static210.aClass3_Sub25_Sub1_3.method8639();
		@Pc(22) boolean local22 = Static210.aClass3_Sub25_Sub1_3.method8646() == 1;
		Static567.anInt5924 = Static210.aClass3_Sub25_Sub1_3.method8646();
		@Pc(30) int local30 = Static210.aClass3_Sub25_Sub1_3.method8644();
		Static283.method4526();
		Static628.method8786(local9);
		Static210.aClass3_Sub25_Sub1_3.method3399();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static158.anInt927 >> 3; local44++) {
				for (local48 = 0; local48 < Static515.anInt8292 >> 3; local48++) {
					local55 = Static210.aClass3_Sub25_Sub1_3.method3402(1);
					if (local55 == 1) {
						Static637.anIntArrayArrayArray20[local40][local44][local48] = Static210.aClass3_Sub25_Sub1_3.method3402(26);
					} else {
						Static637.anIntArrayArrayArray20[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static210.aClass3_Sub25_Sub1_3.method3393();
		local44 = (Static467.anInt7682 - Static210.aClass3_Sub25_Sub1_3.anInt9765) / 16;
		Static597.anIntArrayArray58 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static597.anIntArrayArray58[local48][local55] = Static210.aClass3_Sub25_Sub1_3.method8618();
			}
		}
		Static73.aByteArrayArray6 = new byte[local44][];
		Static460.anIntArray648 = null;
		Static198.anIntArray945 = new int[local44];
		Static134.aByteArrayArray10 = new byte[local44][];
		Static647.anIntArray907 = new int[local44];
		Static635.aByteArrayArray28 = null;
		Static654.aByteArrayArray30 = new byte[local44][];
		Static250.anIntArray410 = new int[local44];
		Static585.aByteArrayArray25 = new byte[local44][];
		Static281.anIntArray439 = new int[local44];
		Static77.anIntArray125 = new int[local44];
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(187) int local187 = 0; local187 < Static158.anInt927 >> 3; local187++) {
				for (@Pc(191) int local191 = 0; local191 < Static515.anInt8292 >> 3; local191++) {
					@Pc(201) int local201 = Static637.anIntArrayArrayArray20[local55][local187][local191];
					if (local201 != -1) {
						@Pc(211) int local211 = local201 >> 14 & 0x3FF;
						@Pc(217) int local217 = local201 >> 3 & 0x7FF;
						@Pc(227) int local227 = (local211 / 8 << 8) + local217 / 8;
						for (@Pc(229) int local229 = 0; local229 < local44; local229++) {
							if (local227 == Static77.anIntArray125[local229]) {
								local227 = -1;
								break;
							}
						}
						if (local227 != -1) {
							Static77.anIntArray125[local44] = local227;
							@Pc(258) int local258 = local227 >> 8 & 0xFF;
							@Pc(262) int local262 = local227 & 0xFF;
							Static647.anIntArray907[local44] = Static590.aClass15_146.method514("m" + local258 + "_" + local262);
							Static250.anIntArray410[local44] = Static590.aClass15_146.method514("l" + local258 + "_" + local262);
							Static198.anIntArray945[local44] = Static590.aClass15_146.method514("um" + local258 + "_" + local262);
							Static281.anIntArray439[local44] = Static590.aClass15_146.method514("ul" + local258 + "_" + local262);
							local44++;
						}
					}
				}
			}
		}
		Static65.method1331(local30, local22, local13, 11);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	public static void method9364(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub40 local14 = (Class3_Sub40) Static244.aClass83_11.method2368((long) arg0);
		if (local14 != null) {
			local14.aClass121_Sub1_1.method3602();
			Static332.method5029(local14.anInt5753, local14.aBoolean413);
			local14.method9380();
		}
	}
}
