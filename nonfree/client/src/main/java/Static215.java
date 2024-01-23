import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!lj;")
	public static Class60 aClass60_4;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "[I")
	public static int[] anIntArray489;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
	public static int anInt4739;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "Lclient!i;")
	private static Class41 aClass41_1272 = Static184.method2923("Loading )2 please wait)3");

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "Lclient!i;")
	public static Class41 aClass41_1270 = aClass41_1272;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "[I")
	public static int[] anIntArray490 = new int[128];

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "Lclient!i;")
	public static Class41 aClass41_1271 = Static184.method2923("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!nc;IIIII)V")
	public static void method3281(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static10.anInt369) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static44.anInt1331) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static59.anInt1642 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class2_Sub7 local62 = Static27.aClass2_Sub7ArrayArrayArray4[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static56.anIntArrayArrayArray7[local17][local23][local32] + Static56.anIntArrayArrayArray7[local17][local23 + 1][local32] + Static56.anIntArrayArrayArray7[local17][local23][local32 + 1] + Static56.anIntArrayArrayArray7[local17][local23 + 1][local32 + 1]) / 4 - (Static56.anIntArrayArrayArray7[arg1][arg2][arg3] + Static56.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + Static56.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + Static56.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class71 local151 = local62.aClass71_1;
									if (local151 != null) {
										if (local151.aClass12_5.method2716()) {
											arg0.method2714(local151.aClass12_5, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass12_6 != null && local151.aClass12_6.method2716()) {
											arg0.method2714(local151.aClass12_6, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt1382; local222++) {
										@Pc(228) Class51 local228 = local62.aClass51Array1[local222];
										if (local228 != null && local228.aClass12_4.method2716() && (local23 == local228.anInt2305 || local23 == local3) && (local32 == local228.anInt2308 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt2312 + 1 - local228.anInt2305;
											@Pc(265) int local265 = local228.anInt2307 + 1 - local228.anInt2308;
											arg0.method2714(local228.aClass12_4, (local228.anInt2305 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt2308 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V")
	public static void method3282(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub16_Sub1 local10;
		if (Static96.aClass2_Sub2_Sub16_2 == null) {
			local10 = new Class2_Sub2_Sub16_Sub1(512, 512);
		} else {
			local10 = (Class2_Sub2_Sub16_Sub1) Static96.aClass2_Sub2_Sub16_2;
		}
		@Pc(21) int[] local21 = local10.anIntArray354;
		@Pc(24) int local24 = local21.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			local21[local26] = 1;
		}
		@Pc(53) int local53;
		@Pc(55) int local55;
		for (@Pc(42) int local42 = 1; local42 < 103; local42++) {
			local53 = (103 - local42) * 2048 + 24628;
			for (local55 = 1; local55 < 103; local55++) {
				if ((Static102.aByteArrayArrayArray7[arg0][local55][local42] & 0x18) == 0) {
					Static105.method1791(local21, local53, arg0, local55, local42);
				}
				if (arg0 < 3 && (Static102.aByteArrayArrayArray7[arg0 + 1][local55][local42] & 0x8) != 0) {
					Static105.method1791(local21, local53, arg0 + 1, local55, local42);
				}
				local53 += 4;
			}
		}
		local10.method2415();
		local55 = (int) (Math.random() * 20.0D) + 228 << 16;
		local53 = ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) + 228 << 8) - (-((int) (Math.random() * 20.0D)) - 238)) - 10;
		@Pc(154) int local154;
		for (@Pc(150) int local150 = 1; local150 < 103; local150++) {
			for (local154 = 1; local154 < 103; local154++) {
				if ((Static102.aByteArrayArrayArray7[arg0][local154][local150] & 0x18) == 0) {
					Static113.method1935(local150, local55, arg0, local53, local154);
				}
				if (arg0 < 3 && (Static102.aByteArrayArrayArray7[arg0 + 1][local154][local150] & 0x8) != 0) {
					Static113.method1935(local150, local55, arg0 + 1, local53, local154);
				}
			}
		}
		Static46.anInt4143 = 0;
		for (local154 = 0; local154 < 104; local154++) {
			for (@Pc(217) int local217 = 0; local217 < 104; local217++) {
				@Pc(224) long local224 = Static65.method1200(Static134.anInt3147, local154, local217);
				if (local224 != 0L) {
					@Pc(239) Class2_Sub2_Sub14 local239 = Static168.method2705(Integer.MAX_VALUE & (int) (local224 >>> 32));
					@Pc(242) int local242 = local239.anInt3065;
					if (local242 >= 0) {
						@Pc(246) int local246 = local154;
						@Pc(248) int local248 = local217;
						if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
							@Pc(284) int[][] local284 = Static149.aClass42Array1[Static134.anInt3147].anIntArrayArray19;
							for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
								@Pc(293) int local293 = (int) (Math.random() * 4.0D);
								if (local293 == 0 && local246 > 0 && local154 - 3 < local246 && (local284[local246 - 1][local248] & 0x12C0108) == 0) {
									local246--;
								}
								if (local293 == 1 && local246 < 103 && local154 + 3 > local246 && (local284[local246 + 1][local248] & 0x12C0180) == 0) {
									local246++;
								}
								if (local293 == 2 && local248 > 0 && local248 > local217 - 3 && (local284[local246][local248 - 1] & 0x12C0102) == 0) {
									local248--;
								}
								if (local293 == 3 && local248 < 103 && local248 < local217 + 3 && (local284[local246][local248 + 1] & 0x12C0120) == 0) {
									local248++;
								}
							}
						}
						Static131.anIntArray322[Static46.anInt4143] = local239.anInt3075;
						Static124.anIntArray312[Static46.anInt4143] = local246;
						Static119.anIntArray307[Static46.anInt4143] = local248;
						Static46.anInt4143++;
					}
				}
			}
		}
		Static96.aClass2_Sub2_Sub16_2 = local10;
		Static178.aClass22_1.method1213();
	}
}
