import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
	public static int anInt5476;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "Lclient!kha;")
	public static Class181 aClass181_54;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "[I")
	public static final int[] anIntArray314 = new int[14];

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	public static int anInt5482 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([IIILclient!id;)Lclient!wv;")
	public static Class382 method4636(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class142 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(21) float[][] local21 = null;
		if (arg2.aByteArray56 != null) {
			@Pc(27) int local27 = arg2.anInt5164;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(33) int[] local33 = new int[local27];
			@Pc(36) int[] local36 = new int[local27];
			@Pc(39) int[] local39 = new int[local27];
			@Pc(42) int[] local42 = new int[local27];
			@Pc(45) int[] local45 = new int[local27];
			for (@Pc(47) int local47 = 0; local47 < local27; local47++) {
				local30[local47] = Integer.MAX_VALUE;
				local33[local47] = -2147483647;
				local36[local47] = Integer.MAX_VALUE;
				local39[local47] = -2147483647;
				local42[local47] = Integer.MAX_VALUE;
				local45[local47] = -2147483647;
			}
			local9 = new int[local27];
			local11 = new int[local27];
			@Pc(91) int local91;
			@Pc(143) int local143;
			for (@Pc(85) int local85 = 0; local85 < arg1; local85++) {
				local91 = arg0[local85];
				if (arg2.aByteArray56[local91] != -1) {
					@Pc(105) int local105 = arg2.aByteArray56[local91] & 0xFF;
					for (@Pc(107) int local107 = 0; local107 < 3; local107++) {
						@Pc(116) short local116;
						if (local107 == 0) {
							local116 = arg2.aShortArray68[local91];
						} else if (local107 == 1) {
							local116 = arg2.aShortArray74[local91];
						} else {
							local116 = arg2.aShortArray73[local91];
						}
						@Pc(138) int local138 = arg2.anIntArray301[local116];
						local143 = arg2.anIntArray293[local116];
						@Pc(148) int local148 = arg2.anIntArray299[local116];
						if (local30[local105] > local138) {
							local30[local105] = local138;
						}
						if (local33[local105] < local138) {
							local33[local105] = local138;
						}
						if (local143 < local36[local105]) {
							local36[local105] = local143;
						}
						if (local143 > local39[local105]) {
							local39[local105] = local143;
						}
						if (local148 < local42[local105]) {
							local42[local105] = local148;
						}
						if (local148 > local45[local105]) {
							local45[local105] = local148;
						}
					}
				}
			}
			local7 = new int[local27];
			local21 = new float[local27][];
			for (local91 = 0; local91 < local27; local91++) {
				@Pc(251) byte local251 = arg2.aByteArray52[local91];
				if (local251 > 0) {
					local7[local91] = (local33[local91] + local30[local91]) / 2;
					local9[local91] = (local36[local91] + local39[local91]) / 2;
					local11[local91] = (local45[local91] + local42[local91]) / 2;
					@Pc(308) float local308;
					@Pc(310) float local310;
					@Pc(339) float local339;
					if (local251 == 1) {
						local143 = arg2.anIntArray302[local91];
						if (local143 == 0) {
							local308 = 1.0F;
							local310 = 1.0F;
						} else if (local143 > 0) {
							local310 = (float) local143 / 1024.0F;
							local308 = 1.0F;
						} else {
							local308 = (float) -local143 / 1024.0F;
							local310 = 1.0F;
						}
						local339 = 64.0F / (float) arg2.anIntArray294[local91];
					} else if (local251 == 2) {
						local308 = 64.0F / (float) arg2.anIntArray302[local91];
						local310 = 64.0F / (float) arg2.anIntArray303[local91];
						local339 = 64.0F / (float) arg2.anIntArray294[local91];
					} else {
						local339 = (float) arg2.anIntArray294[local91] / 1024.0F;
						local308 = (float) arg2.anIntArray302[local91] / 1024.0F;
						local310 = (float) arg2.anIntArray303[local91] / 1024.0F;
					}
					local21[local91] = Static527.method7491(local339, local308, arg2.aShortArray66[local91], arg2.aShortArray69[local91], local310, arg2.aShortArray67[local91], arg2.aByteArray57[local91] & 0xFF);
				}
			}
		}
		return new Class382(local7, local9, local11, local21);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLclient!gaa;ILclient!ha;I)V")
	public static void method4639(@OriginalArg(1) Class108 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class1 local15 = arg0.method3526(arg2);
		if (local15 == null) {
			return;
		}
		arg2.KA(arg3, arg1, arg0.anInt4067 + arg3, arg0.anInt4037 + arg1);
		if (Static381.anInt7250 == 2 || Static381.anInt7250 == 5 || Static497.aClass5_36 == null) {
			arg2.A(-16777216, local15, arg3, arg1);
			return;
		}
		@Pc(58) int local58;
		@Pc(54) int local54;
		@Pc(64) int local64;
		@Pc(56) int local56;
		if (Static516.anInt9019 == 4) {
			local54 = Static149.anInt3681;
			local56 = 4096;
			local58 = Static89.anInt2312;
			local64 = (int) -Static502.aFloat230 & 0x3FFF;
		} else {
			local54 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424;
			local56 = 4096 - Static127.anInt3186 * 16;
			local58 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428;
			local64 = Static30.anInt575 + (int) -Static502.aFloat230 & 0x3FFF;
		}
		@Pc(100) int local100 = local58 / 128 + 48 - (Static394.anInt7540 + -104) * 2;
		@Pc(119) int local119 = Static462.anInt8391 * 4 + 48 - (Static462.anInt8391 - 104) * 2 - local54 / 128;
		Static497.aClass5_36.method7593((float) arg3 + (float) arg0.anInt4067 / 2.0F, (float) arg1 + (float) arg0.anInt4037 / 2.0F, (float) local100, (float) local119, local56, local64 << 2, local15, arg3, arg1);
		@Pc(169) int local169;
		@Pc(179) int local179;
		@Pc(190) int local190;
		@Pc(201) int local201;
		for (@Pc(153) Class3_Sub8 local153 = (Class3_Sub8) Static609.aClass276_63.method6907(); local153 != null; local153 = (Class3_Sub8) Static609.aClass276_63.method6912()) {
			@Pc(158) int local158 = local153.anInt706;
			local169 = (Static236.aClass57_3.anIntArray92[local158] >> 14 & 0x3FFF) - Static446.anInt8090;
			local179 = (Static236.aClass57_3.anIntArray92[local158] & 0x3FFF) - Static124.anInt3150;
			local190 = local169 * 4 + 2 - local58 / 128;
			local201 = local179 * 4 + 2 - local54 / 128;
			Static491.method7209(local15, local190, local201, arg3, arg2, arg1, Static236.aClass57_3.anIntArray93[local158], arg0);
		}
		for (local169 = 0; local169 < Static359.anInt9618; local169++) {
			local179 = Static321.anIntArray321[local169] * 4 + 2 - local58 / 128;
			local190 = Static460.anIntArray527[local169] * 4 + 2 - local54 / 128;
			@Pc(257) Class272 local257 = Static541.aClass349_4.method8123(Static514.anIntArray565[local169]);
			if (local257.anIntArray523 != null) {
				local257 = local257.method6856(Static514.aClass166_1);
				if (local257 == null || local257.anInt8291 == -1) {
					continue;
				}
			}
			Static491.method7209(local15, local179, local190, arg3, arg2, arg1, local257.anInt8291, arg0);
		}
		@Pc(342) int local342;
		@Pc(353) int local353;
		for (@Pc(294) Class3_Sub46 local294 = (Class3_Sub46) Static644.aClass307_55.method7421(); local294 != null; local294 = (Class3_Sub46) Static644.aClass307_55.method7428()) {
			local190 = (int) (local294.aLong277 >> 28 & 0x3L);
			if (local190 == Static113.anInt10083) {
				local201 = (int) (local294.aLong277 & 0x3FFFL) - Static446.anInt8090;
				@Pc(331) int local331 = (int) (local294.aLong277 >> 14 & 0x3FFFL) - Static124.anInt3150;
				local342 = local201 * 4 + 2 - local58 / 128;
				local353 = local331 * 4 + 2 - local54 / 128;
				Static625.method8489(arg3, local342, arg1, arg0, local353, local15, Static457.aClass5Array13[0]);
			}
		}
		@Pc(439) int local439;
		for (local190 = 0; local190 < Static377.anInt7132; local190++) {
			@Pc(384) Class3_Sub49 local384 = (Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local190]);
			if (local384 != null) {
				@Pc(389) Class2_Sub3_Sub1_Sub2_Sub1 local389 = local384.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				if (local389.method2686() && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 == local389.aByte128) {
					@Pc(401) Class22 local401 = local389.aClass22_1;
					if (local401 != null && local401.anIntArray29 != null) {
						local401 = local401.method425(Static514.aClass166_1);
					}
					if (local401 != null && local401.aBoolean41 && local401.aBoolean38) {
						local353 = local389.anInt10428 / 128 - local58 / 128;
						local439 = local389.anInt10424 / 128 - local54 / 128;
						if (local401.anInt406 == -1) {
							Static625.method8489(arg3, local353, arg1, arg0, local439, local15, Static457.aClass5Array13[1]);
						} else {
							Static491.method7209(local15, local353, local439, arg3, arg2, arg1, local401.anInt406, arg0);
						}
					}
				}
			}
		}
		local201 = Static385.anInt10557;
		@Pc(476) int[] local476 = Static493.anIntArray555;
		@Pc(527) int local527;
		@Pc(531) int local531;
		@Pc(559) int local559;
		for (local342 = 0; local342 < local201; local342++) {
			@Pc(486) Class2_Sub3_Sub1_Sub2_Sub2 local486 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local476[local342]];
			if (local486 != null && local486.method5328() && !local486.aBoolean537 && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 != local486 && local486.aByte128 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128) {
				local439 = local486.anInt10428 / 128 - local58 / 128;
				local527 = local486.anInt10424 / 128 - local54 / 128;
				@Pc(529) boolean local529 = false;
				for (local531 = 0; local531 < Static409.anInt6024; local531++) {
					if (local486.aString68.equals(Static573.aStringArray40[local531]) && Static85.anIntArray91[local531] != 0) {
						local529 = true;
						break;
					}
				}
				@Pc(557) boolean local557 = false;
				for (local559 = 0; local559 < Static126.anInt3181; local559++) {
					if (local486.aString68.equals(Static646.aClass323Array1[local559].aString107)) {
						local557 = true;
						break;
					}
				}
				@Pc(579) boolean local579 = false;
				if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6377 != 0 && local486.anInt6377 != 0 && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6377 == local486.anInt6377) {
					local579 = true;
				}
				if (local486.aBoolean540) {
					Static625.method8489(arg3, local439, arg1, arg0, local527, local15, Static457.aClass5Array13[6]);
				} else if (local529) {
					Static625.method8489(arg3, local439, arg1, arg0, local527, local15, Static457.aClass5Array13[3]);
				} else if (local557) {
					Static625.method8489(arg3, local439, arg1, arg0, local527, local15, Static457.aClass5Array13[5]);
				} else if (local579) {
					Static625.method8489(arg3, local439, arg1, arg0, local527, local15, Static457.aClass5Array13[4]);
				} else {
					Static625.method8489(arg3, local439, arg1, arg0, local527, local15, Static457.aClass5Array13[2]);
				}
			}
		}
		@Pc(674) Class369[] local674 = Static253.aClass369Array1;
		@Pc(759) int local759;
		for (local439 = 0; local439 < local674.length; local439++) {
			@Pc(682) Class369 local682 = local674[local439];
			if (local682 != null && local682.anInt10333 != 0 && Static251.anInt5580 % 20 < 10) {
				@Pc(723) int local723;
				if (local682.anInt10333 == 1) {
					@Pc(709) Class3_Sub49 local709 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local682.anInt10340);
					if (local709 != null) {
						@Pc(714) Class2_Sub3_Sub1_Sub2_Sub1 local714 = local709.aClass2_Sub3_Sub1_Sub2_Sub1_2;
						local723 = local714.anInt10428 / 128 - local58 / 128;
						local559 = local714.anInt10424 / 128 - local54 / 128;
						Static370.method5913(360000L, local682.anInt10337, local15, local559, local723, arg0, arg3, arg1);
					}
				}
				if (local682.anInt10333 == 2) {
					local759 = local682.anInt10341 / 128 - local58 / 128;
					local531 = local682.anInt10342 / 128 - local54 / 128;
					@Pc(775) long local775 = (long) (local682.anInt10339 << 7);
					@Pc(779) long local779 = local775 * local775;
					Static370.method5913(local779, local682.anInt10337, local15, local531, local759, arg0, arg3, arg1);
				}
				if (local682.anInt10333 == 10 && local682.anInt10340 >= 0 && Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2.length > local682.anInt10340) {
					@Pc(810) Class2_Sub3_Sub1_Sub2_Sub2 local810 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local682.anInt10340];
					if (local810 != null) {
						local531 = local810.anInt10428 / 128 - local58 / 128;
						local723 = local810.anInt10424 / 128 - local54 / 128;
						Static370.method5913(360000L, local682.anInt10337, local15, local723, local531, arg0, arg3, arg1);
					}
				}
			}
		}
		if (Static516.anInt9019 == 4) {
			return;
		}
		if (Static326.anInt6537 != 0) {
			local527 = Static326.anInt6537 * 4 + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308() + -1) * 2 + 2 - local58 / 128;
			local759 = Static29.anInt565 * 4 + Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308() * 2 + 2 - local54 / 128 - 2;
			Static625.method8489(arg3, local527, arg1, arg0, local759, local15, Static484.aClass5Array15[Static160.aBoolean329 ? 1 : 0]);
		}
		if (!Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aBoolean537) {
			arg2.method6209(arg1 + arg0.anInt4037 / 2 - 1, 3, 3, arg3 + arg0.anInt4067 / 2 - 1, -1);
			return;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/awt/Color;ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;B)V")
	public static void method4641(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static177.aCanvas10.getGraphics();
			if (Static553.aFont2 == null) {
				Static553.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static411.anImage1 == null) {
					Static411.anImage1 = Static177.aCanvas10.createImage(Static114.anInt2970, Static256.anInt5669);
				}
				@Pc(48) Graphics local48 = Static411.anImage1.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static114.anInt2970, Static256.anInt5669);
				local63 = Static114.anInt2970 / 2 - 152;
				@Pc(69) int local69 = Static256.anInt5669 / 2 - 18;
				local48.setColor(arg4);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg0);
				local48.fillRect(local63 + 2, local69 + 2, arg1 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(local63 + arg1 * 3 + 2, local69 + 2, 300 - arg1 * 3, 30);
				local48.setFont(Static553.aFont2);
				local48.setColor(arg3);
				local48.drawString(arg2, (304 - arg2.length() * 6) / 2 + local63, local69 - -22);
				if (Static472.aString64 != null) {
					local48.setFont(Static553.aFont2);
					local48.setColor(arg3);
					local48.drawString(Static472.aString64, Static114.anInt2970 / 2 - Static472.aString64.length() * 6 / 2, Static256.anInt5669 / 2 + -26);
				}
				local2.drawImage(Static411.anImage1, 0, 0, null);
			} catch (@Pc(184) Exception local184) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static114.anInt2970, Static256.anInt5669);
				@Pc(199) int local199 = Static114.anInt2970 / 2 - 152;
				local63 = Static256.anInt5669 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(local199, local63, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local199 + 2, local63 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local199 + 1, local63 + 1, 301, 31);
				local2.fillRect(arg1 * 3 + local199 + 2, local63 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static553.aFont2);
				local2.setColor(arg3);
				if (Static472.aString64 != null) {
					local2.setFont(Static553.aFont2);
					local2.setColor(arg3);
					local2.drawString(Static472.aString64, Static114.anInt2970 / 2 - Static472.aString64.length() * 6 / 2, Static256.anInt5669 / 2 + -26);
				}
				local2.drawString(arg2, (304 - arg2.length() * 6) / 2 + local199, local63 + 22);
			}
		} catch (@Pc(313) Exception local313) {
			Static177.aCanvas10.repaint();
		}
	}
}
