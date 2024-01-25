import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!mh;")
	public static Class156 aClass156_2;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Z")
	public static boolean aBoolean297 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!ya;ILclient!ga;II)V")
	public static void method3742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface4 arg4, @OriginalArg(6) int arg5) {
		if (Static24.anInt346 < 100) {
			Static108.method1873(arg2, arg4);
		}
		arg2.OA(arg5, arg1, arg5 + arg0, arg1 - -arg3);
		@Pc(36) int local36;
		@Pc(54) int local54;
		if (Static24.anInt346 < 100) {
			local36 = arg5 + arg0 / 2;
			arg2.O(arg5, arg1, arg0, arg3, -16777216, 0);
			local54 = arg3 / 2 + arg1 - 18 - 20;
			arg2.method5287(local36 - 152, local54, 304, 34, Static386.aColorArray3[Static17.anInt265].getRGB(), 0);
			arg2.O(local36 - 150, local54 - -2, Static24.anInt346 * 3, 30, Static123.aColorArray2[Static17.anInt265].getRGB(), 0);
			Static305.aClass63_15.method4585(-1, Static86.aColorArray1[Static17.anInt265].getRGB(), Static444.aClass55_145.method1205(Static5.anInt20), local36, local54 + 20);
			return;
		}
		@Pc(109) int local109 = Static203.anInt3590 - (int) ((float) arg0 / Static93.aFloat126);
		local36 = Static21.anInt321 + (int) ((float) arg3 / Static93.aFloat126);
		local54 = (int) ((float) arg0 / Static93.aFloat126) + Static203.anInt3590;
		Static246.anInt4200 = Static21.anInt321 - (int) ((float) arg3 / Static93.aFloat126);
		@Pc(143) int local143 = Static21.anInt321 - (int) ((float) arg3 / Static93.aFloat126);
		Static56.anInt942 = (int) ((float) (arg0 * 2) / Static93.aFloat126);
		Static153.anInt5628 = (int) ((float) (arg3 * 2) / Static93.aFloat126);
		Static5.anInt22 = Static203.anInt3590 - (int) ((float) arg0 / Static93.aFloat126);
		Static93.method3417(Static93.anInt4322 + local109, Static93.anInt4323 + local36, local54 + Static93.anInt4322, local143 + Static93.anInt4323, arg5, arg1, arg0 + arg5, arg3 + 1 + arg1);
		Static93.method3410(arg2);
		@Pc(196) Class85 local196 = Static93.method3409(arg2);
		Static152.method2292(arg2, local196);
		if (Static339.anInt5508 > 0) {
			Static129.anInt2479--;
			if (Static129.anInt2479 == 0) {
				Static129.anInt2479 = 20;
				Static339.anInt5508--;
			}
		}
		if (!Static416.aBoolean433) {
			return;
		}
		@Pc(227) int local227 = arg0 + arg5 - 5;
		@Pc(233) int local233 = arg3 + arg1 - 8;
		Static259.aClass63_7.method4584(local233, local227, 16776960, "Fps:" + Static446.anInt7362);
		@Pc(250) int local250 = local233 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(261) int local261 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(263) int local263 = 16776960;
		if (local261 > 65536) {
			local263 = 16711680;
		}
		Static259.aClass63_7.method4584(local250, local227, local263, "Mem:" + local261 + "k");
		local233 = local250 - 15;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)I")
	public static int method3743(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local76 < 0.5D) {
				local70 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local70 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(164) int local164 = (int) (local60 * 256.0D);
		@Pc(169) int local169 = (int) (local70 * 256.0D);
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		@Pc(190) int local190 = (int) (local76 * 256.0D);
		if (local190 < 0) {
			local190 = 0;
		} else if (local190 > 255) {
			local190 = 255;
		}
		if (local190 > 243) {
			local169 >>= 0x4;
		} else if (local190 > 217) {
			local169 >>= 0x3;
		} else if (local190 > 192) {
			local169 >>= 0x2;
		} else if (local190 > 179) {
			local169 >>= 0x1;
		}
		return (local190 >> 1) + ((local164 & 0xFF) >> 2 << 10) + (local169 >> 5 << 7);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!dr;Z)V")
	public static void method3744(@OriginalArg(0) Class7_Sub14_Sub1 arg0) {
		arg0.method1361();
		@Pc(15) int local15 = Static296.anInt4920;
		@Pc(25) Class26_Sub2_Sub4_Sub2 local25 = Static104.aClass26_Sub2_Sub4_Sub2_2 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local15] = new Class26_Sub2_Sub4_Sub2();
		local25.anInt7080 = local15;
		@Pc(33) int local33 = arg0.method1358(30);
		@Pc(38) byte local38 = (byte) (local33 >> 28);
		@Pc(44) int local44 = local33 >> 14 & 0x3FFF;
		@Pc(48) int local48 = local33 & 0x3FFF;
		local25.anIntArray603[0] = local44 - Static359.anInt5713;
		local25.anInt7388 = (local25.anIntArray603[0] << 7) + (local25.method5512() << 6);
		local25.anIntArray604[0] = local48 - Static314.anInt5181;
		local25.anInt7383 = (local25.anIntArray604[0] << 7) + (local25.method5512() << 6);
		Static268.anInt4539 = local25.aByte102 = local38;
		if (Static102.aClass7_Sub14Array1[local15] != null) {
			local25.method5525(Static102.aClass7_Sub14Array1[local15]);
		}
		Static36.anInt647 = 0;
		Static362.anIntArray533[Static36.anInt647++] = local15;
		Static245.aByteArray57[local15] = 0;
		Static233.anInt5380 = 0;
		for (@Pc(127) int local127 = 1; local127 < 2048; local127++) {
			if (local15 != local127) {
				@Pc(137) int local137 = arg0.method1358(18);
				@Pc(141) int local141 = local137 >> 16;
				@Pc(147) int local147 = local137 >> 8 & 0xFF;
				@Pc(151) int local151 = local137 & 0xFF;
				@Pc(159) Class89 local159 = Static136.aClass89Array1[local127] = new Class89();
				local159.aBoolean136 = false;
				local159.anInt2433 = local151 + (local141 << 28) + (local147 << 14);
				local159.anInt2430 = 0;
				local159.anInt2432 = -1;
				Static233.anIntArray490[Static233.anInt5380++] = local127;
				Static245.aByteArray57[local127] = 0;
			}
		}
		arg0.method1353();
	}
}
