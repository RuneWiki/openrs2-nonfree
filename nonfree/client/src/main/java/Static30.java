import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public static int anInt570 = -2;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public static int anInt575 = 0;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public static int anInt576 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Z")
	public static boolean method570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static219.method4263(arg1, arg0) | Static500.method7312(arg0, arg1) | Static554.method7815(arg1, arg0)) & Static485.method7122(arg0, arg1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!s;)V")
	public static void method571(@OriginalArg(0) int arg0, @OriginalArg(1) Class274 arg1) {
		Static500.aClass274Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method572(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static409.anInt6024; local16++) {
			if (arg0.equalsIgnoreCase(Static573.aStringArray40[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method573() {
		if (Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 0 && Static552.anInt9440 != Static630.anInt10396) {
			Static610.method8290(Static79.anInt1964, 11, false, Static472.anInt6106);
		} else {
			Static641.method8642(Static47.aClass33_3);
			if (Static362.anInt6989 != Static552.anInt9440) {
				Static159.method3381();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method574(@OriginalArg(1) Class33 arg0) {
		if (Static443.anInt8026 < 2 && !Static82.aBoolean192 || Static233.aClass108_7 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static82.aBoolean192 && Static443.anInt8026 < 2) {
			local41 = Static330.aString71 + Static287.aClass176_32.method4986(Static380.anInt7247) + Static275.aString60 + " ->";
		} else if (Static109.aBoolean233 && Static326.aClass238_1.method6948(81) && Static443.anInt8026 > 2) {
			local41 = Static590.method8097(Static300.aClass3_Sub1_Sub4_3);
		} else {
			@Pc(61) Class3_Sub1_Sub4 local61 = Static300.aClass3_Sub1_Sub4_3;
			if (local61 == null) {
				return;
			}
			local41 = Static590.method8097(local61);
			@Pc(70) int[] local70 = null;
			if (Static603.method8220(local61.anInt3485)) {
				local70 = Static367.aClass281_1.method6975((int) local61.aLong74).anIntArray441;
			} else if (local61.anInt3482 != -1) {
				local70 = Static367.aClass281_1.method6975(local61.anInt3482).anIntArray441;
			} else if (Static438.method6668(local61.anInt3485)) {
				@Pc(162) Class3_Sub49 local162 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local61.aLong74);
				if (local162 != null) {
					@Pc(167) Class2_Sub3_Sub1_Sub2_Sub1 local167 = local162.aClass2_Sub3_Sub1_Sub2_Sub1_2;
					@Pc(170) Class22 local170 = local167.aClass22_1;
					if (local170.anIntArray29 != null) {
						local170 = local170.method425(Static514.aClass166_1);
					}
					if (local170 != null) {
						local70 = local170.anIntArray31;
					}
				}
			} else if (Static530.method7543(local61.anInt3485)) {
				@Pc(125) Class272 local125;
				if (local61.anInt3485 == 1002) {
					local125 = Static541.aClass349_4.method8123((int) local61.aLong74);
				} else {
					local125 = Static541.aClass349_4.method8123((int) (local61.aLong74 >>> 32 & 0x7FFFFFFFL));
				}
				if (local125.anIntArray523 != null) {
					local125 = local125.method6856(Static514.aClass166_1);
				}
				if (local125 != null) {
					local70 = local125.anIntArray524;
				}
			}
			if (local70 != null) {
				local41 = local41 + Static211.method4159(local70);
			}
		}
		if (Static443.anInt8026 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static443.anInt8026 - 2) + Static287.aClass176_25.method4986(Static380.anInt7247);
		}
		if (Static157.aClass108_4 != null) {
			@Pc(262) Class25 local262 = Static157.aClass108_4.method3528(arg0);
			if (local262 == null) {
				local262 = Static16.aClass25_1;
			}
			local262.method5850(Static157.aClass108_4.anInt4045, local41, Static333.anIntArray312, Static99.anInt2578, Static507.anInt8946, Static157.aClass108_4.anInt4037, Static157.aClass108_4.anInt4026, Static603.aClass5Array20, Static157.aClass108_4.anInt4094, Static610.anIntArray611, Static157.aClass108_4.anInt4069, Static215.anInt4987, Static157.aClass108_4.anInt4067, Static121.aRandom2);
			Static251.method4761(Static333.anIntArray312[2], Static333.anIntArray312[1], Static333.anIntArray312[3], Static333.anIntArray312[0]);
		} else if (Static552.aClass108_12 != null && Static648.aClass62_16 == Static592.aClass62_13) {
			@Pc(243) int local243 = Static16.aClass25_1.method5837(Static603.aClass5Array20, Static121.aRandom2, local41, Static64.anInt9908 + 16, Static245.anInt5496 + 4, Static610.anIntArray611, Static99.anInt2578);
			Static251.method4761(Static224.aClass315_11.method7572(local41) + local243, Static64.anInt9908, 16, Static245.anInt5496 + 4);
			return;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method575(@OriginalArg(0) String arg0) {
		return Static142.method3162(arg0, ws.class);
	}
}
