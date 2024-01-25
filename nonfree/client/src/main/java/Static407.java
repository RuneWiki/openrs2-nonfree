import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILclient!ha;Lclient!d;)V")
	public static void method5570(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Interface4 arg1) {
		if (Static487.aClass6_Sub2_Sub11_2 == null) {
			return;
		}
		if (Static433.anInt7858 < 10) {
			if (!Static487.aClass353_72.method8397(Static487.aClass6_Sub2_Sub11_2.aString57)) {
				Static433.anInt7858 = Static446.aClass353_82.method8418(Static487.aClass6_Sub2_Sub11_2.aString57) / 10;
				return;
			}
			Static13.method237();
			Static433.anInt7858 = 10;
		}
		if (Static433.anInt7858 == 10) {
			Static487.anInt7453 = Static487.aClass6_Sub2_Sub11_2.anInt5233 >> 6 << 6;
			Static487.anInt7459 = Static487.aClass6_Sub2_Sub11_2.anInt5238 >> 6 << 6;
			Static487.anInt7457 = (Static487.aClass6_Sub2_Sub11_2.anInt5229 >> 6 << 6) + 64 - Static487.anInt7453;
			Static487.anInt7462 = (Static487.aClass6_Sub2_Sub11_2.anInt5234 >> 6 << 6) + 64 - Static487.anInt7459;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static487.aClass6_Sub2_Sub11_2.method4682(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131, (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 >> 9) + Static195.anInt3961, (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 >> 9) + Static606.anInt8651, local74)) {
				local76 = local74[1] - Static487.anInt7459;
				local78 = local74[2] - Static487.anInt7453;
			}
			if (!Static555.aBoolean644 && local76 >= 0 && Static487.anInt7462 > local76 && local78 >= 0 && local78 < Static487.anInt7457) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static526.anInt9146 = local76;
				Static78.anInt1658 = local78;
			} else if (Static299.anInt5836 == -1 || Static527.anInt9154 == -1) {
				Static487.aClass6_Sub2_Sub11_2.method4683(Static487.aClass6_Sub2_Sub11_2.anInt5240 & 0x3FFF, local74, Static487.aClass6_Sub2_Sub11_2.anInt5240 >> 14 & 0x3FFF);
				Static78.anInt1658 = local74[2] - Static487.anInt7453;
				Static526.anInt9146 = local74[1] - Static487.anInt7459;
			} else {
				Static487.aClass6_Sub2_Sub11_2.method4683(Static527.anInt9154, local74, Static299.anInt5836);
				if (local74 != null) {
					Static78.anInt1658 = local74[2] - Static487.anInt7453;
					Static526.anInt9146 = local74[1] - Static487.anInt7459;
				}
				Static527.anInt9154 = -1;
				Static299.anInt5836 = -1;
				Static555.aBoolean644 = false;
			}
			if (Static487.aClass6_Sub2_Sub11_2.anInt5235 == 37) {
				Static487.aFloat144 = 3.0F;
				Static487.aFloat145 = 3.0F;
			} else if (Static487.aClass6_Sub2_Sub11_2.anInt5235 == 50) {
				Static487.aFloat144 = 4.0F;
				Static487.aFloat145 = 4.0F;
			} else if (Static487.aClass6_Sub2_Sub11_2.anInt5235 == 75) {
				Static487.aFloat144 = 6.0F;
				Static487.aFloat145 = 6.0F;
			} else if (Static487.aClass6_Sub2_Sub11_2.anInt5235 == 100) {
				Static487.aFloat144 = 8.0F;
				Static487.aFloat145 = 8.0F;
			} else if (Static487.aClass6_Sub2_Sub11_2.anInt5235 == 200) {
				Static487.aFloat144 = 16.0F;
				Static487.aFloat145 = 16.0F;
			} else {
				Static487.aFloat144 = 8.0F;
				Static487.aFloat145 = 8.0F;
			}
			Static487.anInt7451 = (int) Static487.aFloat144 >> 1;
			Static487.aByteArrayArrayArray21 = Static476.method8761(Static487.anInt7451);
			Static287.method7460();
			Static487.method6425();
			Static485.aClass8_56 = new Class8();
			Static487.anInt7449 += (int) (Math.random() * 5.0D) - 2;
			if (Static487.anInt7449 < -8) {
				Static487.anInt7449 = -8;
			}
			if (Static487.anInt7449 > 8) {
				Static487.anInt7449 = 8;
			}
			Static487.anInt7450 += (int) (Math.random() * 5.0D) - 2;
			if (Static487.anInt7450 < -16) {
				Static487.anInt7450 = -16;
			}
			if (Static487.anInt7450 > 16) {
				Static487.anInt7450 = 16;
			}
			Static487.method6435(arg1, Static487.anInt7449 >> 2 << 10, Static487.anInt7450 >> 1);
			Static487.aClass337_4.method8118(1024, 256);
			Static487.aClass304_2.method7760(256, 256);
			Static487.aClass210_4.method5638(4096);
			Static230.aClass233_3.method6392(256);
			Static433.anInt7858 = 20;
		} else if (Static433.anInt7858 == 20) {
			Static643.method8975(true);
			Static487.method6433(arg0, Static487.anInt7449, Static487.anInt7450);
			Static433.anInt7858 = 60;
			Static643.method8975(true);
			Static360.method5725();
		} else if (Static433.anInt7858 == 60) {
			if (Static487.aClass353_72.method8414(Static487.aClass6_Sub2_Sub11_2.aString57 + "_staticelements")) {
				if (!Static487.aClass353_72.method8397(Static487.aClass6_Sub2_Sub11_2.aString57 + "_staticelements")) {
					return;
				}
				Static487.aClass356_3 = Static386.method4906(Static265.aBoolean260, Static487.aClass353_72, Static487.aClass6_Sub2_Sub11_2.aString57 + "_staticelements");
			} else {
				Static487.aClass356_3 = new Class356(0);
			}
			Static487.method6419();
			Static433.anInt7858 = 70;
			Static643.method8975(true);
			Static360.method5725();
		} else if (Static433.anInt7858 == 70) {
			Static574.aClass276_8 = new Class276(arg0, 11, true, Static271.aCanvas6);
			Static433.anInt7858 = 73;
			Static643.method8975(true);
			Static360.method5725();
		} else if (Static433.anInt7858 == 73) {
			Static525.aClass276_7 = new Class276(arg0, 12, true, Static271.aCanvas6);
			Static433.anInt7858 = 76;
			Static643.method8975(true);
			Static360.method5725();
		} else if (Static433.anInt7858 == 76) {
			Static408.aClass276_5 = new Class276(arg0, 14, true, Static271.aCanvas6);
			Static433.anInt7858 = 79;
			Static643.method8975(true);
			Static360.method5725();
		} else if (Static433.anInt7858 == 79) {
			Static112.aClass276_1 = new Class276(arg0, 17, true, Static271.aCanvas6);
			Static433.anInt7858 = 82;
			Static643.method8975(true);
			Static360.method5725();
		} else if (Static433.anInt7858 == 82) {
			Static384.aClass276_4 = new Class276(arg0, 19, true, Static271.aCanvas6);
			Static433.anInt7858 = 85;
			Static643.method8975(true);
			Static360.method5725();
		} else if (Static433.anInt7858 == 85) {
			Static160.aClass276_2 = new Class276(arg0, 22, true, Static271.aCanvas6);
			Static433.anInt7858 = 88;
			Static643.method8975(true);
			Static360.method5725();
		} else if (Static433.anInt7858 == 88) {
			Static501.aClass276_6 = new Class276(arg0, 26, true, Static271.aCanvas6);
			Static433.anInt7858 = 91;
			Static643.method8975(true);
			Static360.method5725();
		} else {
			Static293.aClass276_3 = new Class276(arg0, 30, true, Static271.aCanvas6);
			Static433.anInt7858 = 100;
			Static643.method8975(true);
			Static360.method5725();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5571(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static463.anInt8194; local16++) {
			if (arg0.equalsIgnoreCase(Static234.aStringArray36[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static321.aStringArray47[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method5573(@OriginalArg(1) Class100 arg0) {
		for (@Pc(6) Class20_Sub8 local6 = (Class20_Sub8) Static361.aClass81_6.method2118(); local6 != null; local6 = (Class20_Sub8) Static361.aClass81_6.method2128()) {
			if (local6.aBoolean521) {
				local6.method6638(arg0);
			}
		}
	}
}
