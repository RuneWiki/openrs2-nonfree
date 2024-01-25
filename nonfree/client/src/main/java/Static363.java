import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "[B")
	public static final byte[] aByteArray67 = new byte[2048];

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;B)V")
	public static void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		@Pc(6) Class2_Sub52 local6 = Static550.method8448();
		local6.aClass2_Sub8_Sub2_2.method5170(Static527.aClass361_7.anInt10749);
		local6.aClass2_Sub8_Sub2_2.method5192(0);
		@Pc(28) int local28 = local6.aClass2_Sub8_Sub2_2.anInt5725;
		local6.aClass2_Sub8_Sub2_2.method5192(643);
		@Pc(37) int[] local37 = Static619.method9236(local6);
		@Pc(41) int local41 = local6.aClass2_Sub8_Sub2_2.anInt5725;
		local6.aClass2_Sub8_Sub2_2.method5212(arg3);
		local6.aClass2_Sub8_Sub2_2.method5192(Static568.anInt9915);
		local6.aClass2_Sub8_Sub2_2.method5212(arg2);
		local6.aClass2_Sub8_Sub2_2.method5209(Static113.aLong66);
		local6.aClass2_Sub8_Sub2_2.method5170(Static204.anInt8130);
		local6.aClass2_Sub8_Sub2_2.method5170(Static551.aClass229_15.anInt6908);
		Static551.method8454(local6.aClass2_Sub8_Sub2_2);
		@Pc(78) String local78 = Static185.aString42;
		local6.aClass2_Sub8_Sub2_2.method5170(local78 == null ? 0 : 1);
		if (local78 != null) {
			local6.aClass2_Sub8_Sub2_2.method5212(local78);
		}
		local6.aClass2_Sub8_Sub2_2.method5170(arg0);
		local6.aClass2_Sub8_Sub2_2.method5170(arg1 ? 1 : 0);
		local6.aClass2_Sub8_Sub2_2.anInt5725 += 7;
		local6.aClass2_Sub8_Sub2_2.method5229(local6.aClass2_Sub8_Sub2_2.anInt5725, local37, local41);
		local6.aClass2_Sub8_Sub2_2.method5162(local6.aClass2_Sub8_Sub2_2.anInt5725 - local28);
		Static38.method791(local6);
		Static532.anInt9332 = -3;
		Static276.anInt5123 = 0;
		Static387.anInt7336 = 1;
		Static113.anInt2042 = 0;
		if (arg0 < 13) {
			Static425.aBoolean580 = true;
			Static99.method1702();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLclient!ol;)Lclient!faa;")
	public static Class100 method6180(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(7) Class100 local7 = new Class100();
		local7.anInt2789 = arg0.method5211();
		local7.aClass2_Sub1_Sub8_1 = Static644.aClass186_2.method4870(local7.anInt2789);
		return local7;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!uf;Lclient!ha;III)V")
	public static void method6181(@OriginalArg(0) Class357 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) Class1 local19 = arg0.method8989(arg1);
		if (local19 == null) {
			return;
		}
		arg1.KA(arg2, arg3, arg0.anInt10395 + arg2, arg0.anInt10465 + arg3);
		if (Static460.anInt11073 == 2 || Static460.anInt11073 == 5 || Static292.aClass71_8 == null) {
			arg1.A(-16777216, local19, arg2, arg3);
			return;
		}
		@Pc(62) int local62;
		@Pc(54) int local54;
		@Pc(60) int local60;
		@Pc(64) int local64;
		if (Static484.anInt8685 == 4) {
			local54 = Static106.anInt1972;
			local60 = (int) -Static278.aFloat108 & 0x3FFF;
			local62 = Static293.anInt7589;
			local64 = 4096;
		} else {
			local54 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024;
			local60 = Static275.anInt5119 + (int) -Static278.aFloat108 & 0x3FFF;
			local64 = 4096 - Static199.anInt4199 * 16;
			local62 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022;
		}
		@Pc(101) int local101 = local62 / 128 + 48 + 208 - Static222.anInt4533 * 2;
		@Pc(117) int local117 = Static668.anInt11370 * 4 + 48 - local54 / 128 - (Static668.anInt11370 - 104) * 2;
		Static292.aClass71_8.method7693((float) arg0.anInt10395 / 2.0F + (float) arg2, (float) arg0.anInt10465 / 2.0F + (float) arg3, (float) local101, (float) local117, local64, local60 << 2, local19, arg2, arg3);
		@Pc(168) int local168;
		@Pc(177) int local177;
		@Pc(188) int local188;
		@Pc(199) int local199;
		for (@Pc(151) Class2_Sub14 local151 = (Class2_Sub14) Static526.aClass271_55.method7177(); local151 != null; local151 = (Class2_Sub14) Static526.aClass271_55.method7175()) {
			@Pc(156) int local156 = local151.anInt1303;
			local168 = (Static638.aClass75_3.anIntArray102[local156] >> 14 & 0x3FFF) - Static640.anInt11085;
			local177 = (Static638.aClass75_3.anIntArray102[local156] & 0x3FFF) - Static490.anInt8763;
			local188 = local168 * 4 + 2 - local62 / 128;
			local199 = local177 * 4 + 2 - local54 / 128;
			Static531.method8223(arg3, local19, arg0, arg1, arg2, local199, Static638.aClass75_3.anIntArray103[local156], local188);
		}
		for (local168 = 0; local168 < Static660.anInt10682; local168++) {
			local177 = Static174.anIntArray171[local168] * 4 + 2 - local62 / 128;
			local188 = Static629.anIntArray566[local168] * 4 + 2 - local54 / 128;
			@Pc(255) Class331 local255 = Static251.aClass328_1.method8261(Static419.anIntArray376[local168]);
			if (local255.anIntArray486 != null) {
				local255 = local255.method8304(Static113.aClass282_1);
				if (local255 == null || local255.anInt9426 == -1) {
					continue;
				}
			}
			Static531.method8223(arg3, local19, arg0, arg1, arg2, local188, local255.anInt9426, local177);
		}
		@Pc(337) int local337;
		@Pc(348) int local348;
		for (@Pc(291) Class2_Sub47 local291 = (Class2_Sub47) Static18.aClass335_2.method8358(); local291 != null; local291 = (Class2_Sub47) Static18.aClass335_2.method8355()) {
			local188 = (int) (local291.aLong313 >> 28 & 0x3L);
			if (local188 == Static598.anInt10389) {
				local199 = (int) (local291.aLong313 & 0x3FFFL) - Static640.anInt11085;
				@Pc(326) int local326 = (int) (local291.aLong313 >> 14 & 0x3FFFL) - Static490.anInt8763;
				local337 = local199 * 4 + 2 - local62 / 128;
				local348 = local326 * 4 + 2 - local54 / 128;
				Static131.method2330(arg0, arg2, local19, arg3, local348, local337, Static14.aClass71Array35[0]);
			}
		}
		@Pc(438) int local438;
		for (local188 = 0; local188 < Static532.anInt9330; local188++) {
			@Pc(379) Class2_Sub6 local379 = (Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local188]);
			if (local379 != null) {
				@Pc(384) Class15_Sub3_Sub3_Sub1_Sub2 local384 = local379.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				if (local384.method3700() && local384.aByte142 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142) {
					@Pc(400) Class312 local400 = local384.aClass312_1;
					if (local400 != null && local400.anIntArray458 != null) {
						local400 = local400.method7953(Static113.aClass282_1);
					}
					if (local400 != null && local400.aBoolean658 && local400.aBoolean656) {
						local348 = local384.anInt11022 / 128 - local62 / 128;
						local438 = local384.anInt11024 / 128 - local54 / 128;
						if (local400.anInt9064 == -1) {
							Static131.method2330(arg0, arg2, local19, arg3, local438, local348, Static14.aClass71Array35[1]);
						} else {
							Static531.method8223(arg3, local19, arg0, arg1, arg2, local438, local400.anInt9064, local348);
						}
					}
				}
			}
		}
		local199 = Static383.anInt7249;
		@Pc(475) int[] local475 = Static404.anIntArray362;
		@Pc(525) int local525;
		@Pc(529) int local529;
		@Pc(554) int local554;
		for (local337 = 0; local337 < local199; local337++) {
			@Pc(485) Class15_Sub3_Sub3_Sub1_Sub1 local485 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local475[local337]];
			if (local485 != null && local485.method2229() && !local485.aBoolean175 && local485 != Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 && local485.aByte142 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142) {
				local438 = local485.anInt11022 / 128 - local62 / 128;
				local525 = local485.anInt11024 / 128 - local54 / 128;
				@Pc(527) boolean local527 = false;
				for (local529 = 0; local529 < Static340.anInt6395; local529++) {
					if (local485.aString29.equals(Static438.aStringArray47[local529]) && Static568.anIntArray497[local529] != 0) {
						local527 = true;
						break;
					}
				}
				@Pc(552) boolean local552 = false;
				for (local554 = 0; local554 < Static250.anInt4884; local554++) {
					if (local485.aString29.equals(Static523.aClass263Array1[local554].aString91)) {
						local552 = true;
						break;
					}
				}
				@Pc(574) boolean local574 = false;
				if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2371 != 0 && local485.anInt2371 != 0 && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2371 == local485.anInt2371) {
					local574 = true;
				}
				if (local485.aBoolean172) {
					Static131.method2330(arg0, arg2, local19, arg3, local525, local438, Static14.aClass71Array35[6]);
				} else if (local485.aBoolean173) {
					Static131.method2330(arg0, arg2, local19, arg3, local525, local438, Static14.aClass71Array35[7]);
				} else if (local527) {
					Static131.method2330(arg0, arg2, local19, arg3, local525, local438, Static14.aClass71Array35[3]);
				} else if (local552) {
					Static131.method2330(arg0, arg2, local19, arg3, local525, local438, Static14.aClass71Array35[5]);
				} else if (local574) {
					Static131.method2330(arg0, arg2, local19, arg3, local525, local438, Static14.aClass71Array35[4]);
				} else {
					Static131.method2330(arg0, arg2, local19, arg3, local525, local438, Static14.aClass71Array35[2]);
				}
			}
		}
		@Pc(684) Class326[] local684 = Static382.aClass326Array3;
		@Pc(765) int local765;
		for (local438 = 0; local438 < local684.length; local438++) {
			@Pc(692) Class326 local692 = local684[local438];
			if (local692 != null && local692.anInt9321 != 0 && Static62.anInt1184 % 20 < 10) {
				@Pc(728) int local728;
				if (local692.anInt9321 == 1) {
					@Pc(714) Class2_Sub6 local714 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local692.anInt9316);
					if (local714 != null) {
						@Pc(719) Class15_Sub3_Sub3_Sub1_Sub2 local719 = local714.aClass15_Sub3_Sub3_Sub1_Sub2_1;
						local728 = local719.anInt11022 / 128 - local62 / 128;
						local554 = local719.anInt11024 / 128 - local54 / 128;
						Static394.method7230(arg2, arg3, arg0, local728, local554, 360000L, local19, local692.anInt9319);
					}
				}
				if (local692.anInt9321 == 2) {
					local765 = local692.anInt9318 / 128 - local62 / 128;
					local529 = local692.anInt9317 / 128 - local54 / 128;
					@Pc(781) long local781 = (long) (local692.anInt9322 << 7);
					@Pc(785) long local785 = local781 * local781;
					Static394.method7230(arg2, arg3, arg0, local765, local529, local785, local19, local692.anInt9319);
				}
				if (local692.anInt9321 == 10 && local692.anInt9316 >= 0 && Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1.length > local692.anInt9316) {
					@Pc(815) Class15_Sub3_Sub3_Sub1_Sub1 local815 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local692.anInt9316];
					if (local815 != null) {
						local529 = local815.anInt11022 / 128 - local62 / 128;
						local728 = local815.anInt11024 / 128 - local54 / 128;
						Static394.method7230(arg2, arg3, arg0, local529, local728, 360000L, local19, local692.anInt9319);
					}
				}
			}
		}
		if (Static484.anInt8685 == 4) {
			return;
		}
		if (Static587.anInt10248 != 0) {
			local525 = Static587.anInt10248 * 4 + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() + -1) * 2 + 2 - local62 / 128;
			local765 = Static472.anInt8440 * 4 + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() * 2 + 2 - local54 / 128 - 2;
			Static131.method2330(arg0, arg2, local19, arg3, local765, local525, Static385.aClass71Array31[Static191.aBoolean318 ? 1 : 0]);
		}
		if (!Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aBoolean175) {
			arg1.method8061(arg0.anInt10465 / 2 + arg3 - 1, 3, -1, arg0.anInt10395 / 2 + arg2 - 1, 3);
			return;
		}
	}
}
