import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!si", name = "eb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!si", name = "hb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!si", name = "ib", descriptor = "Z")
	public static boolean aBoolean319;

	@OriginalMember(owner = "client!si", name = "O", descriptor = "Lclient!gj;")
	public static Class59 aClass59_35 = new Class59();

	@OriginalMember(owner = "client!si", name = "fb", descriptor = "[I")
	public static int[] anIntArray415 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!si", name = "gb", descriptor = "I")
	public static int anInt4698 = -1;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([SI[Ljava/lang/String;ZI)V")
	public static void method4070(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if (local20 == null || arg2[local46] != null && (local46 & 0x1) > arg2[local46].compareTo(local20)) {
				@Pc(78) String local78 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local78;
				@Pc(92) short local92 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local92;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method4070(arg0, local16 - 1, arg2, arg3);
		method4070(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!lf;)V")
	public static void method4072(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(5) int local5 = arg0.method1362();
		Static83.aClass113Array1 = new Class113[local5];
		@Pc(22) int local22;
		for (local22 = 0; local22 < local5; local22++) {
			Static83.aClass113Array1[local22] = new Class113();
			Static83.aClass113Array1[local22].anInt3432 = arg0.method1362();
			Static83.aClass113Array1[local22].aString199 = arg0.method1382();
		}
		Static61.anInt1170 = arg0.method1362();
		Static196.anInt3705 = arg0.method1362();
		Static114.anInt2372 = arg0.method1362();
		Static272.aClass29_Sub1Array4 = new Class29_Sub1[Static196.anInt3705 + 1 - Static61.anInt1170];
		for (local22 = 0; local22 < Static114.anInt2372; local22++) {
			@Pc(81) int local81 = arg0.method1362();
			@Pc(89) Class29_Sub1 local89 = Static272.aClass29_Sub1Array4[local81] = new Class29_Sub1();
			local89.anInt5326 = arg0.method1378();
			local89.anInt5331 = arg0.method1392();
			local89.anInt5342 = Static61.anInt1170 + local81;
			local89.aString324 = arg0.method1382();
			local89.aString325 = arg0.method1382();
		}
		Static239.anInt4333 = arg0.method1392();
		Static212.aBoolean26 = true;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZIBII)V")
	public static void method4074(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static36.method641(false);
		Static297.aBoolean360 = arg0;
		Static181.anInt3482 = arg3;
		Static252.anInt4556 = arg2;
		Static109.method3584(arg1);
		Static240.aClass142_22 = new Class142(8);
		Static56.aClass142_4 = new Class142(8);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!hi;IB)I")
	public static int method4075(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		if (!Static37.method679(arg0).method3057(arg1) && arg0.anObjectArray25 == null) {
			return -1;
		} else if (arg0.anIntArray197 == null || arg1 >= arg0.anIntArray197.length) {
			return -1;
		} else {
			return arg0.anIntArray197[arg1];
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)V")
	public static void method4078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub11 local9 = Static5.method35(arg0, 12);
		local9.method2866();
		local9.anInt3315 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
	public static void method4079() {
		if (Static125.anInt2557 < 0) {
			Static125.anInt2557 = 0;
			Static61.anInt1168 = -1;
			Static132.anInt3684 = -1;
		}
		if (Static109.anInt4234 < Static125.anInt2557) {
			Static125.anInt2557 = Static109.anInt4234;
			Static61.anInt1168 = -1;
			Static132.anInt3684 = -1;
		}
		if (Static293.anInt5263 < 0) {
			Static132.anInt3684 = -1;
			Static61.anInt1168 = -1;
			Static293.anInt5263 = 0;
		}
		if (Static293.anInt5263 > Static109.anInt4231) {
			Static61.anInt1168 = -1;
			Static132.anInt3684 = -1;
			Static293.anInt5263 = Static109.anInt4231;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public static void method4080() {
		Static53.aClass187_33.method4525();
		Static182.aClass187_93.method4525();
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(IIIII)I")
	public static int method4081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static29.aBoolean21) {
			arg2 = 1000000;
			Static29.aBoolean21 = false;
		}
		@Pc(18) Class126 local18 = Static85.aClass126ArrayArray1[arg1][arg3];
		@Pc(28) float local28 = ((float) arg0 * 0.1F + 0.7F) * local18.aFloat109;
		@Pc(31) int local31 = local18.anInt3816;
		@Pc(34) float local34 = local18.aFloat113;
		@Pc(42) float local42 = local18.aFloat114;
		@Pc(45) int local45 = local18.anInt3818;
		if (!Static183.aBoolean241) {
			local45 = 0;
		}
		@Pc(53) int local53 = local18.anInt3814;
		@Pc(56) Class1_Sub2_Sub20 local56 = local18.aClass1_Sub2_Sub20_5;
		@Pc(59) float local59 = local18.aFloat111;
		@Pc(62) float local62 = local18.aFloat112;
		@Pc(65) float local65 = local18.aFloat110;
		if (Static304.anInt5395 != local31 || local28 != Static13.aFloat9 || Static219.aFloat126 != local34 || Static16.aFloat174 != local42 || local53 != Static173.anInt3372 || local45 != Static288.anInt5154 || local56 != Static75.aClass1_Sub2_Sub20_3 || Static79.aFloat52 != local65 || Static178.aFloat104 != local62 || Static311.aFloat172 != local59) {
			Static164.aFloat96 = Static96.aFloat63;
			Static168.anInt3299 = Static180.anInt3464;
			Static252.aFloat141 = Static255.aFloat145;
			Static273.anInt4953 = Static6.anInt56;
			Static164.aFloat97 = Static206.aFloat120;
			Static32.aClass1_Sub2_Sub20_4 = Static22.aClass1_Sub2_Sub20_1;
			Static51.anInt1017 = Static51.anInt1018;
			Static217.aFloat125 = Static70.aFloat48;
			Static201.aFloat116 = Static272.aFloat173;
			Static229.aFloat130 = Static154.aFloat87;
			if (Static256.aClass1_Sub2_Sub20_6 == null || Static32.aClass1_Sub2_Sub20_4 == Static256.aClass1_Sub2_Sub20_6) {
				Static256.aClass1_Sub2_Sub20_6 = new Class1_Sub2_Sub20();
			}
			Static75.aClass1_Sub2_Sub20_3 = local56;
			Static304.anInt5395 = local31;
			Static219.aFloat126 = local34;
			Static173.anInt3372 = local53;
			Static311.aFloat172 = local59;
			Static16.aFloat174 = local42;
			Static79.aFloat52 = local65;
			Static288.anInt5154 = local45;
			Static13.aFloat9 = local28;
			Static111.anInt2294 = 0;
			Static178.aFloat104 = local62;
		}
		if (Static111.anInt2294 < 65536) {
			Static111.anInt2294 += arg2 * 250;
			if (Static111.anInt2294 < 65536) {
				@Pc(178) int local178 = Static111.anInt2294 >> 8;
				@Pc(186) float local186 = (float) (65536 - Static111.anInt2294) / 65536.0F;
				@Pc(192) int local192 = 65536 - Static111.anInt2294 >> 8;
				Static180.anInt3464 = ((Static173.anInt3372 & 0xFF00) * local178 + local192 * (Static168.anInt3299 & 0xFF00) & 0xFF0000) + ((Static173.anInt3372 & 0xFF00FF) * local178 + (Static168.anInt3299 & 0xFF00FF) * local192 & 0xFF00FF00) >> 8;
				Static51.anInt1018 = ((Static51.anInt1017 & 0xFF00FF) * local192 + local178 * (Static304.anInt5395 & 0xFF00FF) & 0xFF00FF00) + (local192 * (Static51.anInt1017 & 0xFF00) + local178 * (Static304.anInt5395 & 0xFF00) & 0xFF0000) >> 8;
				Static6.anInt56 = Static288.anInt5154 * local178 + local192 * Static273.anInt4953 >> 8;
				@Pc(268) float local268 = (float) Static111.anInt2294 / 65536.0F;
				Static206.aFloat120 = local186 * Static164.aFloat97 + local268 * Static79.aFloat52;
				Static70.aFloat48 = local186 * Static217.aFloat125 + Static13.aFloat9 * local268;
				Static272.aFloat173 = local186 * Static201.aFloat116 + local268 * Static16.aFloat174;
				Static96.aFloat63 = local186 * Static164.aFloat96 + Static219.aFloat126 * local268;
				Static255.aFloat145 = Static178.aFloat104 * local268 + Static252.aFloat141 * local186;
				Static154.aFloat87 = Static311.aFloat172 * local268 + local186 * Static229.aFloat130;
				if (Static75.aClass1_Sub2_Sub20_3 != Static32.aClass1_Sub2_Sub20_4) {
					if (Static32.aClass1_Sub2_Sub20_4 == null || Static75.aClass1_Sub2_Sub20_3 == null) {
						Static22.aClass1_Sub2_Sub20_1 = null;
					} else {
						Static22.aClass1_Sub2_Sub20_1 = Static256.aClass1_Sub2_Sub20_6.method4228(Static32.aClass1_Sub2_Sub20_4, Static75.aClass1_Sub2_Sub20_3, (float) Static111.anInt2294 / 65536.0F);
					}
				}
			} else {
				Static6.anInt56 = Static288.anInt5154;
				Static70.aFloat48 = Static13.aFloat9;
				Static96.aFloat63 = Static219.aFloat126;
				Static272.aFloat173 = Static16.aFloat174;
				Static154.aFloat87 = Static311.aFloat172;
				Static32.aClass1_Sub2_Sub20_4 = null;
				Static206.aFloat120 = Static79.aFloat52;
				Static22.aClass1_Sub2_Sub20_1 = Static75.aClass1_Sub2_Sub20_3;
				Static51.anInt1018 = Static304.anInt5395;
				Static255.aFloat145 = Static178.aFloat104;
				Static111.anInt2294 = 65536;
				Static180.anInt3464 = Static173.anInt3372;
			}
		}
		return Static180.anInt3464;
	}
}
