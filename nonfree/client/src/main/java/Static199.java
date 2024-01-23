import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static int anInt4143;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt4139 = 0;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public static int anInt4145 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
	public static int method3362() {
		try {
			if (Static257.anInt5346 == 0) {
				if (Static269.aLong281 > Static6.method126() - 5000L) {
					return 0;
				}
				Static23.aClass28_1 = Static299.aClass177_5.method4686(Static26.anInt553, Static141.aString142);
				Static230.aLong203 = Static6.method126();
				Static257.anInt5346 = 1;
			}
			if (Static6.method126() > Static230.aLong203 + 30000L) {
				return Static70.method1318(1000);
			}
			@Pc(86) int local86;
			@Pc(125) int local125;
			if (Static257.anInt5346 == 1) {
				if (Static23.aClass28_1.anInt726 == 2) {
					return Static70.method1318(1001);
				}
				if (Static23.aClass28_1.anInt726 != 1) {
					return -1;
				}
				Static42.aClass45_1 = new Class45((Socket) Static23.aClass28_1.anObject2, Static299.aClass177_5);
				Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
				local86 = 0;
				Static23.aClass28_1 = null;
				if (Static145.aBoolean256) {
					local86 = Static257.anInt5354;
				}
				Static95.aClass2_Sub26_Sub1_1.method4239(23);
				Static95.aClass2_Sub26_Sub1_1.method4260(local86);
				Static42.aClass45_1.method1043(Static95.aClass2_Sub26_Sub1_1.anInt5328, Static95.aClass2_Sub26_Sub1_1.aByteArray72);
				if (Static107.aClass3_2 != null) {
					Static107.aClass3_2.method2229();
				}
				if (Static68.aClass3_1 != null) {
					Static68.aClass3_1.method2229();
				}
				local125 = Static42.aClass45_1.method1047();
				if (Static107.aClass3_2 != null) {
					Static107.aClass3_2.method2229();
				}
				if (Static68.aClass3_1 != null) {
					Static68.aClass3_1.method2229();
				}
				if (local125 != 0) {
					return Static70.method1318(local125);
				}
				Static257.anInt5346 = 2;
			}
			if (Static257.anInt5346 == 2) {
				if (Static42.aClass45_1.method1040() < 2) {
					return -1;
				}
				Static200.anInt4162 = Static42.aClass45_1.method1047();
				Static200.anInt4162 <<= 0x8;
				Static200.anInt4162 += Static42.aClass45_1.method1047();
				Static246.anInt5064 = 0;
				Static257.anInt5346 = 3;
				Static31.aByteArray2 = new byte[Static200.anInt4162];
			}
			if (Static257.anInt5346 != 3) {
				return -1;
			}
			local86 = Static42.aClass45_1.method1040();
			if (local86 < 1) {
				return -1;
			}
			if (Static200.anInt4162 - Static246.anInt5064 < local86) {
				local86 = Static200.anInt4162 - Static246.anInt5064;
			}
			Static42.aClass45_1.method1048(local86, Static246.anInt5064, Static31.aByteArray2);
			Static246.anInt5064 += local86;
			if (Static246.anInt5064 < Static200.anInt4162) {
				return -1;
			} else if (Static247.method3965(Static31.aByteArray2)) {
				Static278.aClass132_Sub1Array2 = new Class132_Sub1[Static184.anInt3909];
				local125 = 0;
				for (@Pc(241) int local241 = Static12.anInt317; local241 <= Static106.anInt2316; local241++) {
					@Pc(248) Class132_Sub1 local248 = Static163.method2818(local241);
					if (local248 != null) {
						Static278.aClass132_Sub1Array2[local125++] = local248;
					}
				}
				Static42.aClass45_1.method1045();
				Static31.aByteArray2 = null;
				Static257.anInt5346 = 0;
				Static55.anInt1260 = 0;
				Static42.aClass45_1 = null;
				Static269.aLong281 = Static6.method126();
				return 0;
			} else {
				return Static70.method1318(1002);
			}
		} catch (@Pc(278) IOException local278) {
			return Static70.method1318(1003);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Lclient!j;")
	public static Class2_Sub15 method3363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class2_Sub15 local5 = new Class2_Sub15();
		local5.anInt2420 = arg0;
		local5.anInt2424 = arg1;
		Static152.aClass79_14.method1994((long) arg2, local5);
		Static174.method3012(arg1);
		@Pc(34) Class115 local34 = Static90.method1692(arg2);
		if (local34 != null) {
			Static298.method4263(local34);
		}
		if (Static50.aClass115_6 != null) {
			Static298.method4263(Static50.aClass115_6);
			Static50.aClass115_6 = null;
		}
		@Pc(48) int local48 = Static216.anInt4481;
		@Pc(50) int local50;
		for (local50 = 0; local50 < local48; local50++) {
			if (Static293.method4856(Static289.aShortArray93[local50])) {
				Static195.method3284(local50);
			}
		}
		if (Static216.anInt4481 == 1) {
			Static299.aBoolean203 = false;
			Static121.method2215(Static63.anInt1431, Static221.anInt4607, Static243.anInt3779, Static297.anInt6219);
		} else {
			Static121.method2215(Static63.anInt1431, Static221.anInt4607, Static243.anInt3779, Static297.anInt6219);
			local50 = Static153.aClass2_Sub3_Sub5_1.method3325(Static169.aString178);
			for (@Pc(80) int local80 = 0; local80 < Static216.anInt4481; local80++) {
				@Pc(89) int local89 = Static153.aClass2_Sub3_Sub5_1.method3325(Static196.method3333(local80));
				if (local89 > local50) {
					local50 = local89;
				}
			}
			Static63.anInt1431 = Static216.anInt4481 * 15 + (Static201.aBoolean347 ? 26 : 22);
			Static297.anInt6219 = local50 + 8;
		}
		if (local34 != null) {
			Static126.method2252(local34, false);
		}
		Static95.method1829(arg1);
		if (Static17.anInt427 != -1) {
			Static11.method254(1, Static17.anInt427);
		}
		return local5;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method3364() {
		while (true) {
			if (Static250.aClass2_Sub26_Sub1_2.method4281(Static4.anInt151) >= 27) {
				@Pc(16) int local16 = Static250.aClass2_Sub26_Sub1_2.method4278(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static201.aClass36_Sub3_Sub1Array1[local16] == null) {
						local21 = true;
						Static201.aClass36_Sub3_Sub1Array1[local16] = new Class36_Sub3_Sub1();
					}
					@Pc(38) Class36_Sub3_Sub1 local38 = Static201.aClass36_Sub3_Sub1Array1[local16];
					Static9.anIntArray12[Static71.anInt1550++] = local16;
					local38.anInt5091 = Static148.anInt3168;
					if (local38.aClass33_1 != null && local38.aClass33_1.method722()) {
						Static17.method355(local38);
					}
					@Pc(65) int local65 = Static250.aClass2_Sub26_Sub1_2.method4278(5);
					@Pc(70) int local70 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
					if (local65 > 15) {
						local65 -= 32;
					}
					if (local70 == 1) {
						Static161.anIntArray256[Static102.anInt2234++] = local16;
					}
					@Pc(93) int local93 = Static250.aClass2_Sub26_Sub1_2.method4278(5);
					@Pc(100) int local100 = Static134.anIntArray204[Static250.aClass2_Sub26_Sub1_2.method4278(3)];
					if (local21) {
						local38.anInt5063 = local38.anInt5069 = local100;
					}
					if (local93 > 15) {
						local93 -= 32;
					}
					local38.method2418(Static112.method2081(Static250.aClass2_Sub26_Sub1_2.method4278(14)));
					@Pc(131) int local131 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
					local38.method4098(local38.aClass33_1.anInt888);
					local38.anInt5140 = local38.aClass33_1.anInt864;
					local38.anInt5132 = local38.aClass33_1.anInt853;
					if (local38.anInt5132 == 0) {
						local38.anInt5069 = 0;
					}
					local38.method4092(local93 + Static111.aClass36_Sub3_Sub2_1.anIntArray465[0], local38.method4097(), local131 == 1, Static111.aClass36_Sub3_Sub2_1.anIntArray468[0] + local65);
					if (local38.aClass33_1.method722()) {
						Static185.method3168(local38, local38.anIntArray465[0], null, 0, Static208.anInt4335, null, local38.anIntArray468[0]);
					}
					continue;
				}
			}
			Static250.aClass2_Sub26_Sub1_2.method4279();
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	public static void method3365() {
		Static38.method732(Static171.anInt3648);
		@Pc(18) int local18 = (Static271.anInt5632 >> 10) + (Static125.anInt5772 >> 3);
		@Pc(30) int local30 = (Static203.anInt4236 >> 3) + (Static255.anInt5182 >> 10);
		Static155.aByteArrayArray126 = new byte[18][];
		Static18.aByteArrayArray13 = new byte[18][];
		Static43.aByteArrayArray23 = new byte[18][];
		Static275.aByteArrayArray117 = new byte[18][];
		Static293.anIntArray520 = new int[18];
		Static47.anIntArray91 = new int[18];
		Static90.anIntArray147 = new int[18];
		Static63.anIntArray105 = new int[18];
		Static181.anIntArrayArray33 = new int[18][4];
		Static218.anIntArray377 = new int[18];
		Static67.anIntArray522 = new int[18];
		Static75.aByteArrayArray34 = new byte[18][];
		@Pc(81) int local81 = 0;
		@Pc(87) int local87;
		for (local87 = (local18 - 6) / 8; local87 <= (local18 + 6) / 8; local87++) {
			for (@Pc(104) int local104 = (local30 - 6) / 8; local104 <= (local30 + 6) / 8; local104++) {
				@Pc(118) int local118 = (local87 << 8) + local104;
				Static63.anIntArray105[local81] = local118;
				Static293.anIntArray520[local81] = Static11.aClass84_8.method2121("m" + local87 + "_" + local104);
				Static47.anIntArray91[local81] = Static11.aClass84_8.method2121("l" + local87 + "_" + local104);
				Static67.anIntArray522[local81] = Static11.aClass84_8.method2121("n" + local87 + "_" + local104);
				Static90.anIntArray147[local81] = Static11.aClass84_8.method2121("um" + local87 + "_" + local104);
				Static218.anIntArray377[local81] = Static11.aClass84_8.method2121("ul" + local87 + "_" + local104);
				if (Static67.anIntArray522[local81] == -1) {
					Static293.anIntArray520[local81] = -1;
					Static47.anIntArray91[local81] = -1;
					Static90.anIntArray147[local81] = -1;
					Static218.anIntArray377[local81] = -1;
				}
				local81++;
			}
		}
		for (local87 = local81; local87 < Static67.anIntArray522.length; local87++) {
			Static67.anIntArray522[local87] = -1;
			Static293.anIntArray520[local87] = -1;
			Static47.anIntArray91[local87] = -1;
			Static90.anIntArray147[local87] = -1;
			Static218.anIntArray377[local87] = -1;
		}
		Static87.method1633(true, 0, local30, false, 8, local18, 8);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
	public static void method3366() {
		Static39.aClass46_6.method1077();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[F")
	public static float[] method3367(@OriginalArg(1) int arg0) {
		@Pc(12) float local12 = Static117.method2156() + Static117.method2150();
		@Pc(14) int local14 = Static117.method2151();
		Static29.aFloatArray4[3] = 1.0F;
		@Pc(27) float local27 = (float) (local14 >> 16 & 0xFF) / 255.0F;
		@Pc(36) float local36 = (float) (local14 >> 8 & 0xFF) / 255.0F;
		@Pc(38) float local38 = 0.58823526F;
		Static29.aFloatArray4[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F * local27 * local38 * local12;
		@Pc(62) float local62 = (float) (local14 & 0xFF) / 255.0F;
		Static29.aFloatArray4[1] = local12 * local38 * local36 * ((float) (arg0 >> 8 & 0xFF) / 255.0F);
		Static29.aFloatArray4[2] = local62 * ((float) (arg0 & 0xFF) / 255.0F) * local38 * local12;
		return Static29.aFloatArray4;
	}
}
