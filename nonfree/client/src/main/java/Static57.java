import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "[I")
	public static int[] anIntArray125 = new int[128];

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public static int anInt1270 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Z")
	public static boolean method1073(@OriginalArg(0) int arg0) {
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (Static20.aClass4_Sub2_Sub4_Sub2_7 == null) {
			if (Static251.aBoolean330 || Static41.aClass4_Sub2_Sub4_2 == null) {
				Static20.aClass4_Sub2_Sub4_Sub2_7 = new Class4_Sub2_Sub4_Sub2(512, 512);
			} else {
				Static20.aClass4_Sub2_Sub4_Sub2_7 = (Class4_Sub2_Sub4_Sub2) Static41.aClass4_Sub2_Sub4_2;
			}
			@Pc(31) int[] local31 = Static20.aClass4_Sub2_Sub4_Sub2_7.anIntArray409;
			local34 = local31.length;
			for (local36 = 0; local36 < local34; local36++) {
				local31[local36] = 1;
			}
			for (local36 = 1; local36 < 103; local36++) {
				local72 = (103 - local36) * 512 * 4 + 24628;
				for (local76 = 1; local76 < 103; local76++) {
					if ((Static27.aByteArrayArrayArray2[arg0][local76][local36] & 0x18) == 0) {
						Static84.method1415(local31, local72, arg0, local76, local36);
					}
					if (arg0 < 3 && (Static27.aByteArrayArrayArray2[arg0 + 1][local76][local36] & 0x8) != 0) {
						Static84.method1415(local31, local72, arg0 + 1, local76, local36);
					}
					local72 += 4;
				}
			}
			Static145.anInt5622 = 0;
			for (local36 = 0; local36 < 104; local36++) {
				for (local72 = 0; local72 < 104; local72++) {
					@Pc(156) long local156 = Static32.method638(Static222.anInt4467, local36 + 0, local72);
					if (local156 != 0L) {
						@Pc(169) Class73 local169 = Static296.method4591((int) (local156 >>> 32) & Integer.MAX_VALUE);
						@Pc(172) int local172 = local169.anInt2265;
						@Pc(177) int local177;
						if (local169.anIntArray196 != null) {
							for (local177 = 0; local177 < local169.anIntArray196.length; local177++) {
								if (local169.anIntArray196[local177] != -1) {
									@Pc(199) Class73 local199 = Static296.method4591(local169.anIntArray196[local177]);
									if (local199.anInt2265 >= 0) {
										local172 = local199.anInt2265;
										break;
									}
								}
							}
						}
						if (local172 >= 0) {
							local177 = local36;
							@Pc(222) int local222 = local72;
							if (local172 != 22 && local172 != 29 && local172 != 34 && local172 != 36 && local172 != 46 && local172 != 47 && local172 != 48) {
								@Pc(256) int[][] local256 = Static223.aClass12Array1[Static222.anInt4467].anIntArrayArray1;
								for (@Pc(258) int local258 = 0; local258 < 10; local258++) {
									@Pc(268) int local268 = (int) (Math.random() * 4.0D);
									if (local268 == 0 && local177 > 0 && local177 > local36 - 3 && (local256[local177 - 1][local222] & 0x2C0108) == 0) {
										local177--;
									}
									if (local268 == 1 && local177 < 103 && local36 + 3 > local177 && (local256[local177 + 1][local222] & 0x2C0180) == 0) {
										local177++;
									}
									if (local268 == 2 && local222 > 0 && local222 > local72 - 3 && (local256[local177][local222 - 1] & 0x2C0102) == 0) {
										local222--;
									}
									if (local268 == 3 && local222 < 103 && local222 < local72 + 3 && (local256[local177][local222 + 1] & 0x2C0120) == 0) {
										local222++;
									}
								}
							}
							Static69.anIntArray134[Static145.anInt5622] = local169.anInt2237;
							Static48.anIntArray116[Static145.anInt5622] = local177;
							Static153.anIntArray245[Static145.anInt5622] = local222;
							Static145.anInt5622++;
						}
					}
				}
			}
		}
		@Pc(443) int local443 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + (228 - -((int) (Math.random() * 20.0D)) << 16) + 238 - 10;
		local34 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		Static20.aClass4_Sub2_Sub4_Sub2_7.method4151();
		for (local36 = 1; local36 < 103; local36++) {
			for (local72 = 1; local72 < 103; local72++) {
				if ((Static27.aByteArrayArrayArray2[arg0][local72][local36] & 0x18) == 0 && !Static112.method1888(local36, local34, arg0, local72, local443)) {
					if (Static251.aBoolean330) {
						Static258.anIntArray399 = null;
					} else {
						Static147.aClass42_1.method3934();
					}
					return false;
				}
				if (arg0 < 3 && (Static27.aByteArrayArrayArray2[arg0 + 1][local72][local36] & 0x8) != 0 && !Static112.method1888(local36, local34, arg0 + 1, local72, local443)) {
					if (Static251.aBoolean330) {
						Static258.anIntArray399 = null;
					} else {
						Static147.aClass42_1.method3934();
					}
					return false;
				}
			}
		}
		if (Static251.aBoolean330) {
			@Pc(571) int[] local571 = Static20.aClass4_Sub2_Sub4_Sub2_7.anIntArray409;
			local72 = local571.length;
			for (local76 = 0; local76 < local72; local76++) {
				if (local571[local76] == 0) {
					local571[local76] = 1;
				}
			}
			Static41.aClass4_Sub2_Sub4_2 = new Class4_Sub2_Sub4_Sub1(Static20.aClass4_Sub2_Sub4_Sub2_7);
		} else {
			Static41.aClass4_Sub2_Sub4_2 = Static20.aClass4_Sub2_Sub4_Sub2_7;
		}
		if (Static251.aBoolean330) {
			Static258.anIntArray399 = null;
		} else {
			Static147.aClass42_1.method3934();
		}
		Static20.aClass4_Sub2_Sub4_Sub2_7 = null;
		return true;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII)V")
	public static void method1074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg2 - arg3;
		@Pc(15) int local15 = arg0 - arg4;
		if (local6 == 0) {
			if (local15 != 0) {
				Static307.method4703(arg4, arg3, arg0, arg1);
			}
		} else if (local15 == 0) {
			Static46.method928(arg3, arg4, arg2, arg1);
		} else {
			@Pc(48) int local48 = (local15 << 12) / local6;
			@Pc(57) int local57 = arg4 - (local48 * arg3 >> 12);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (Static173.anInt3481 > arg2) {
				local62 = Static173.anInt3481;
				local70 = (local48 * Static173.anInt3481 >> 12) + local57;
			} else if (arg2 > Static121.anInt2460) {
				local62 = Static121.anInt2460;
				local70 = (local48 * Static121.anInt2460 >> 12) + local57;
			} else {
				local70 = arg0;
				local62 = arg2;
			}
			@Pc(96) int local96;
			@Pc(104) int local104;
			if (Static173.anInt3481 > arg3) {
				local96 = Static173.anInt3481;
				local104 = (local48 * Static173.anInt3481 >> 12) + local57;
			} else if (arg3 <= Static121.anInt2460) {
				local96 = arg3;
				local104 = arg4;
			} else {
				local96 = Static121.anInt2460;
				local104 = local57 + (local48 * Static121.anInt2460 >> 12);
			}
			if (Static293.anInt5688 > local104) {
				local96 = (Static293.anInt5688 - local57 << 12) / local48;
				local104 = Static293.anInt5688;
			} else if (local104 > Static100.anInt1982) {
				local96 = (Static100.anInt1982 - local57 << 12) / local48;
				local104 = Static100.anInt1982;
			}
			if (local70 < Static293.anInt5688) {
				local70 = Static293.anInt5688;
				local62 = (Static293.anInt5688 - local57 << 12) / local48;
			} else if (local70 > Static100.anInt1982) {
				local70 = Static100.anInt1982;
				local62 = (Static100.anInt1982 - local57 << 12) / local48;
			}
			Static58.method2506(arg1, local96, local62, local70, local104);
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static void method1075() {
		for (@Pc(9) int local9 = 0; local9 < Static291.anInt5649; local9++) {
			@Pc(16) int local16 = Static148.anIntArray237[local9];
			@Pc(20) Class13_Sub5_Sub1 local20 = Static100.aClass13_Sub5_Sub1Array1[local16];
			@Pc(24) int local24 = Static256.aClass4_Sub24_Sub1_3.method3110();
			if ((local24 & 0x20) != 0) {
				local24 += Static256.aClass4_Sub24_Sub1_3.method3110() << 8;
			}
			Static231.method3629(local16, local20, local24);
		}
	}
}
