import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt3243;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!fd;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "J")
	public static long aLong120;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1909 = Static107.method1838(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public static int anInt3246 = 0;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1910 = Static107.method1838("<col=ffff00>");

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1911 = Static107.method1838("::errortest");

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public static int anInt3248 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ff;IIII)V")
	public static void method2250(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static177.method2757();
		Static161.method2805(arg1, arg2, arg0.anInt1357 + arg1, arg0.anInt1427 + arg2);
		if (Static19.anInt890 == 2 || Static19.anInt890 == 5) {
			Static161.method2800(arg1, arg2, arg0.anIntArray127, arg0.anIntArray118);
		} else {
			@Pc(47) int local47 = Static110.anInt2692 + Static66.anInt1789 & 0x7FF;
			@Pc(54) int local54 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32 + 48;
			@Pc(62) int local62 = 464 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
			Static94.aClass2_Sub4_Sub3_Sub4_4.method2819(arg1, arg2, arg0.anInt1357, arg0.anInt1427, local54, local62, local47, Static178.anInt3957 + 256, arg0.anIntArray127, arg0.anIntArray118);
			@Pc(113) int local113;
			@Pc(99) int local99;
			for (@Pc(83) int local83 = 0; local83 < Static14.anInt600; local83++) {
				local99 = Static56.anIntArray133[local83] * 4 + 2 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
				local113 = Static147.anIntArray313[local83] * 4 + 2 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32;
				Static6.method227(local99, arg1, arg0, local113, arg2, Static150.aClass2_Sub4_Sub3_Sub4Array11[local83]);
			}
			@Pc(161) int local161;
			@Pc(172) int local172;
			for (local113 = 0; local113 < 104; local113++) {
				for (local99 = 0; local99 < 104; local99++) {
					@Pc(147) Class65 local147 = Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local113][local99];
					if (local147 != null) {
						local161 = local113 * 4 + 2 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32;
						local172 = local99 * 4 + 2 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
						Static6.method227(local172, arg1, arg0, local161, arg2, Static125.aClass2_Sub4_Sub3_Sub4Array10[0]);
					}
				}
			}
			@Pc(239) int local239;
			for (local99 = 0; local99 < Static29.anInt884; local99++) {
				@Pc(202) Class2_Sub4_Sub1_Sub1_Sub1 local202 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[Static129.anIntArray274[local99]];
				if (local202 != null && local202.method1093()) {
					@Pc(211) Class2_Sub4_Sub4 local211 = local202.aClass2_Sub4_Sub4_1;
					if (local211 != null && local211.anIntArray66 != null) {
						local211 = local211.method595();
					}
					if (local211 != null && local211.aBoolean31 && local211.aBoolean33) {
						local239 = local202.anInt1635 / 32 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
						local172 = local202.anInt1633 / 32 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32;
						Static6.method227(local239, arg1, arg0, local172, arg2, Static125.aClass2_Sub4_Sub3_Sub4Array10[1]);
					}
				}
			}
			@Pc(278) Class2_Sub4_Sub1_Sub1_Sub2 local278;
			for (@Pc(270) int local270 = 0; local270 < Static35.anInt973; local270++) {
				local278 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[Static160.anIntArray327[local270]];
				if (local278 != null && local278.method1093()) {
					local172 = local278.anInt1633 / 32 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32;
					local239 = local278.anInt1635 / 32 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
					@Pc(307) boolean local307 = false;
					@Pc(312) long local312 = local278.aClass28_953.method1129();
					for (@Pc(314) int local314 = 0; local314 < Static38.anInt1022; local314++) {
						if (Static77.aLongArray7[local314] == local312 && Static112.anIntArray261[local314] != 0) {
							local307 = true;
							break;
						}
					}
					@Pc(344) boolean local344 = false;
					if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1660 != 0 && local278.anInt1660 != 0 && Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1660 == local278.anInt1660) {
						local344 = true;
					}
					if (local307) {
						Static6.method227(local239, arg1, arg0, local172, arg2, Static125.aClass2_Sub4_Sub3_Sub4Array10[3]);
					} else if (local344) {
						Static6.method227(local239, arg1, arg0, local172, arg2, Static125.aClass2_Sub4_Sub3_Sub4Array10[4]);
					} else {
						Static6.method227(local239, arg1, arg0, local172, arg2, Static125.aClass2_Sub4_Sub3_Sub4Array10[2]);
					}
				}
			}
			if (Static100.anInt2509 != 0 && Static156.anInt3491 % 20 < 10) {
				if (Static100.anInt2509 == 1 && Static168.anInt3787 >= 0 && Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1.length > Static168.anInt3787) {
					@Pc(433) Class2_Sub4_Sub1_Sub1_Sub1 local433 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[Static168.anInt3787];
					if (local433 != null) {
						local239 = local433.anInt1635 / 32 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
						local172 = local433.anInt1633 / 32 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32;
						Static5.method156(arg2, local239, arg1, arg0, Static152.aClass2_Sub4_Sub3_Sub4Array12[1], local172);
					}
				}
				if (Static100.anInt2509 == 2) {
					local172 = (Static21.anInt727 - Static39.anInt1055) * 4 + 2 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
					local161 = (Static125.anInt2945 - Static3.anInt2434) * 4 + 2 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32;
					Static5.method156(arg2, local172, arg1, arg0, Static152.aClass2_Sub4_Sub3_Sub4Array12[1], local161);
				}
				if (Static100.anInt2509 == 10 && Static152.anInt3420 >= 0 && Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1.length > Static152.anInt3420) {
					local278 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[Static152.anInt3420];
					if (local278 != null) {
						local172 = local278.anInt1633 / 32 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32;
						local239 = local278.anInt1635 / 32 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
						Static5.method156(arg2, local239, arg1, arg0, Static152.aClass2_Sub4_Sub3_Sub4Array12[1], local172);
					}
				}
			}
			if (Static98.anInt2452 != 0) {
				local161 = Static98.anInt2452 * 4 + 2 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 / 32;
				local172 = Static109.anInt2643 * 4 + 2 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 / 32;
				Static6.method227(local172, arg1, arg0, local161, arg2, Static152.aClass2_Sub4_Sub3_Sub4Array12[0]);
			}
			Static161.method2809(arg0.anInt1357 / 2 + arg1 - 1, arg2 + -1 + arg0.anInt1427 / 2, 3, 3, 16777215);
		}
		Static59.aBooleanArray11[arg3] = true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBII)I")
	public static int method2251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static49.aByteArrayArrayArray4[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static49.aByteArrayArrayArray4[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method2252() {
		aClass22_3 = null;
		aClass28_1911 = null;
		aClass28_1909 = null;
		anIntArray285 = null;
		aClass28_1910 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!rc;)V")
	public static void method2253(@OriginalArg(1) Class2_Sub4_Sub3_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static19.anIntArray71.length; local9++) {
			Static19.anIntArray71[local9] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) (Math.random() * 128.0D * (double) 256);
			Static19.anIntArray71[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(72) int local72;
		for (local36 = 0; local36 < 20; local36++) {
			for (local60 = 1; local60 < 255; local60++) {
				for (local64 = 1; local64 < 127; local64++) {
					local72 = local64 + (local60 << 7);
					Static164.anIntArray338[local72] = (Static19.anIntArray71[local72 + 128] + Static19.anIntArray71[local72 - 1] + Static19.anIntArray71[local72 - -1] + Static19.anIntArray71[local72 - 128]) / 4;
				}
			}
			@Pc(119) int[] local119 = Static19.anIntArray71;
			Static19.anIntArray71 = Static164.anIntArray338;
			Static164.anIntArray338 = local119;
		}
		if (arg0 == null) {
			return;
		}
		local60 = 0;
		for (local64 = 0; local64 < arg0.anInt3234; local64++) {
			for (local72 = 0; local72 < arg0.anInt3233; local72++) {
				if (arg0.aByteArray38[local60++] != 0) {
					@Pc(158) int local158 = local64 + arg0.anInt3237 + 16;
					@Pc(165) int local165 = arg0.anInt3236 + local72 + 16;
					@Pc(171) int local171 = (local158 << 7) + local165;
					Static19.anIntArray71[local171] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIIB)Lclient!gg;")
	public static Class28 method2254(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(26) int local26 = 1;
		@Pc(30) int local30 = arg1 / 10;
		while (local30 != 0) {
			local30 /= 10;
			local26++;
		}
		@Pc(46) int local46 = local26;
		if (arg1 < 0 || arg0) {
			local46 = local26 + 1;
		}
		@Pc(57) byte[] local57 = new byte[local46];
		if (arg1 < 0) {
			local57[0] = 45;
		} else if (arg0) {
			local57[0] = 43;
		}
		for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
			@Pc(79) int local79 = arg1 % 10;
			if (local79 < 0) {
				local79 = -local79;
			}
			if (local79 > 9) {
				local79 += 39;
			}
			arg1 /= 10;
			local57[local46 - local73 - 1] = (byte) (local79 + 48);
		}
		@Pc(119) Class28 local119 = new Class28();
		local119.anInt1718 = local46;
		local119.aByteArray14 = local57;
		return local119;
	}
}
