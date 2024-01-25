import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	public static int anInt4344;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!kq;)V")
	public static void method4025(@OriginalArg(1) Class110 arg0) {
		Static210.anInt4175 = 3;
		Static88.method1694(true);
		Static41.aBoolean83 = true;
		Static211.anInt4208 = 255;
		Static217.aBoolean365 = true;
		Static337.aBoolean564 = true;
		Static127.aBoolean226 = true;
		Static8.anInt201 = 127;
		Static44.aBoolean87 = true;
		Static216.aBoolean364 = true;
		Static158.anInt3151 = 0;
		Static158.anInt3147 = 2;
		Static176.anInt3649 = 0;
		Static115.anInt2304 = 127;
		Static264.aBoolean464 = true;
		Static123.anInt2389 = 0;
		Static114.anInt2288 = 0;
		Static8.aBoolean28 = true;
		Static331.anInt6338 = 1;
		Static1.aBoolean14 = true;
		Static305.aBoolean515 = true;
		if (Static157.anInt3131 >= 96) {
			Static135.method2613(2);
		} else {
			Static135.method2613(0);
		}
		Static268.aBoolean429 = true;
		Static71.aBoolean129 = true;
		Static335.anInt6377 = 2;
		Static142.anInt3154 = 2;
		Static102.aBoolean179 = false;
		Static166.aBoolean296 = false;
		Static73.anInt1510 = 0;
		Static344.aBoolean555 = false;
		Static75.anInt1518 = 0;
		@Pc(81) Class99 local81 = null;
		try {
			@Pc(85) Class134 local85 = arg0.method3358();
			while (local85.anInt4033 == 0) {
				Static134.method2598(1L);
			}
			if (local85.anInt4033 == 1) {
				local81 = (Class99) local85.anObject6;
				@Pc(107) byte[] local107 = new byte[(int) local81.method2722()];
				@Pc(121) int local121;
				for (@Pc(109) int local109 = 0; local109 < local107.length; local109 += local121) {
					local121 = local81.method2724(local107, local109, local107.length - local109);
					if (local121 == -1) {
						throw new IOException("EOF");
					}
				}
				Static96.method5653(new Class1_Sub7(local107));
			}
		} catch (@Pc(145) Exception local145) {
		}
		try {
			if (local81 != null) {
				local81.method2725();
			}
		} catch (@Pc(152) Exception local152) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZIIB)V")
	public static void method4027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static138.aClass204ArrayArrayArray1 == null) {
			Static34.aClass2_6.method3277(arg1, arg4, arg3, -16777216, arg0);
			return;
		}
		Static108.anInt2197++;
		if (Static130.aClass5_Sub3_Sub3_Sub1_1 != null && Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 - (Static130.aClass5_Sub3_Sub3_Sub1_1.method4541() - 1) * 64 >> 7 == Static94.anInt1845 && Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 + 64 - Static130.aClass5_Sub3_Sub3_Sub1_1.method4541() * 64 >> 7 == Static152.anInt3053) {
			Static152.anInt3053 = -1;
			Static94.anInt1845 = -1;
			Static198.method3728();
		}
		Static121.method2171();
		if (!arg2) {
			Static78.method1539();
		}
		Static179.method3490();
		Static10.method290(arg0, arg1, true, arg3, arg4);
		@Pc(83) int local83 = Static140.anInt2777;
		@Pc(85) int local85 = Static332.anInt6364;
		@Pc(87) int local87 = Static258.anInt5022;
		@Pc(89) int local89 = Static244.anInt4759;
		@Pc(98) int local98;
		@Pc(129) int local129;
		if (Static81.anInt1609 == 1) {
			local98 = (int) Static233.aFloat86;
			if (Static16.anInt334 >> 8 > local98) {
				local98 = Static16.anInt334 >> 8;
			}
			if (Static138.aBooleanArray9[4] && Static243.anIntArray606[4] + 128 > local98) {
				local98 = Static243.anIntArray606[4] + 128;
			}
			local129 = (int) Static304.aFloat110 + Static252.anInt4857 & 0x3FFF;
			Static153.method2920(local98, Static16.method362(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050, Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047, Static285.anInt5511) - 50, local87, local129, Static81.anInt1607, (local98 >> 3) * 3 + 600, Static140.anInt2779);
		} else if (Static81.anInt1609 == 4) {
			local98 = (int) Static233.aFloat86;
			if (Static16.anInt334 >> 8 > local98) {
				local98 = Static16.anInt334 >> 8;
			}
			if (Static138.aBooleanArray9[4] && local98 < Static243.anIntArray606[4] + 128) {
				local98 = Static243.anIntArray606[4] + 128;
			}
			local129 = (int) Static304.aFloat110 & 0x3FFF;
			Static153.method2920(local98, Static16.method362(Static339.anInt6426, Static230.anInt4531, Static285.anInt5511) - 50, local87, local129, Static81.anInt1607, (local98 >> 3) * 3 + 600, Static140.anInt2779);
		} else if (Static81.anInt1609 == 5) {
			Static253.method4483(local87);
		}
		local98 = Static221.anInt4363;
		local129 = Static194.anInt3958;
		@Pc(236) int local236 = Static164.anInt3425;
		@Pc(238) int local238 = Static107.anInt2183;
		@Pc(240) int local240 = Static5.anInt99;
		@Pc(289) int local289;
		for (@Pc(248) int local248 = 0; local248 < 5; local248++) {
			if (Static138.aBooleanArray9[local248]) {
				local289 = (int) ((double) (Static44.anIntArray119[local248] * 2 + 1) * Math.random() - (double) Static44.anIntArray119[local248] + Math.sin((double) Static43.anIntArray338[local248] * ((double) Static79.anIntArray427[local248] / 100.0D)) * (double) Static243.anIntArray606[local248]);
				if (local248 == 1) {
					Static194.anInt3958 += local289;
				}
				if (local248 == 4) {
					Static107.anInt2183 += local289;
					if (Static107.anInt2183 < 1024) {
						Static107.anInt2183 = 1024;
					} else if (Static107.anInt2183 > 3072) {
						Static107.anInt2183 = 3072;
					}
				}
				if (local248 == 0) {
					Static221.anInt4363 += local289;
				}
				if (local248 == 3) {
					Static5.anInt99 = local289 + Static5.anInt99 & 0x3FFF;
				}
				if (local248 == 2) {
					Static164.anInt3425 += local289;
				}
			}
		}
		if (Static221.anInt4363 < 0) {
			Static221.anInt4363 = 0;
		}
		if ((Static222.anInt4391 << 7) - 1 < Static221.anInt4363) {
			Static221.anInt4363 = (Static222.anInt4391 << 7) - 1;
		}
		if (Static164.anInt3425 < 0) {
			Static164.anInt3425 = 0;
		}
		if (Static164.anInt3425 > (Static74.anInt3404 << 7) - 1) {
			Static164.anInt3425 = (Static74.anInt3404 << 7) - 1;
		}
		Static245.method4332();
		Static45.method1028();
		Static34.aClass2_6.method3250(local83, local89, local83 + local85, local89 + local87);
		Static34.aClass2_6.method3294();
		local289 = Static172.anInt5801;
		if (Static92.aClass32_1 == null) {
			Static34.aClass2_6.method3309(local289);
		} else {
			Static92.aClass32_1.method1035(Static34.aClass2_6, local83, local85, Static107.anInt2183, Static311.anInt5991 << 3, local87, local89, local289, Static5.anInt99);
		}
		Static278.method4804();
		Static302.aClass21_6.method2812(Static221.anInt4363, Static194.anInt3958, Static164.anInt3425, -Static107.anInt2183 & 0x3FFF, -Static5.anInt99 & 0x3FFF, -Static54.anInt3491 & 0x3FFF);
		Static34.aClass2_6.method3239(Static302.aClass21_6);
		Static34.aClass2_6.method3278(local83 + local85 / 2, local89 + local87 / 2, Static335.anInt6381 << 1, Static335.anInt6381 << 1);
		Static96.method5658(Static335.anInt6381 << 1, Static335.anInt6381 << 1, local89 + local87 / 2, local85 / 2 + local83);
		Static198.method3726(-Static54.anInt3491 & 0x3FFF, Static194.anInt3958, -Static5.anInt99 & 0x3FFF, Static221.anInt4363, Static164.anInt3425, -Static107.anInt2183 & 0x3FFF);
		@Pc(520) byte local520 = Static269.method4691() == 2 ? (byte) Static108.anInt2197 : 1;
		Static206.method3830(Static34.aClass2_6, Static215.anInt4246, Static138.anInt2755, Static302.aClass21_6, Static221.anInt4363, Static194.anInt3958, Static164.anInt3425, Static186.aByteArrayArrayArray8, Static37.anIntArray110, Static117.anIntArray286, Static210.anIntArray500, Static314.anIntArray759, Static82.anIntArray192, Static285.anInt5511 + 1, local520, Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7, Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7, !Static1.aBoolean14);
		Static278.method4804();
		if (Static239.anInt4649 == 30) {
			Static11.method4794(local87, local85, local89, local83);
			Static199.method3743(local87, local83, local85, local89);
			Static45.method1027(local83, local89, local87, local85);
			Static228.method4137(local87, local89, local85, local83);
		}
		Static268.method4683();
		Static107.anInt2183 = local238;
		Static164.anInt3425 = local236;
		Static5.anInt99 = local240;
		Static194.anInt3958 = local129;
		Static221.anInt4363 = local98;
		if (Static103.aBoolean181 && Static253.aClass205_3.method5347() == 0) {
			Static103.aBoolean181 = false;
		}
		if (Static103.aBoolean181) {
			Static34.aClass2_6.method3277(local89, local87, local83, -16777216, local85);
			Static56.method1211(Static118.aString194, false, Static9.aClass13_1);
		}
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	public static void method4028() {
		for (@Pc(7) int local7 = 0; local7 < Static125.anInt2470; local7++) {
			@Pc(19) int local19 = Static320.anIntArray768[local7];
			@Pc(23) Class5_Sub3_Sub3_Sub1 local23 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local19];
			@Pc(29) int local29 = Static232.aClass1_Sub7_Sub1_4.method3141();
			if ((local29 & 0x2) != 0) {
				local29 += Static232.aClass1_Sub7_Sub1_4.method3141() << 8;
			}
			Static178.method3485(local23, local29, local19);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method4029(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
