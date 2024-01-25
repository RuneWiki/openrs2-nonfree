import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
	public static int anInt7770;

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "[Lclient!hba;")
	public static final Class147_Sub1[] aClass147_Sub1Array1 = new Class147_Sub1[37];

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIII)V")
	public static void method6932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static650.aClass2_Sub30_29.aClass11_Sub5_5.method1696(1) != 0 && arg1 != 0 && Static66.anInt1152 < 50 && arg4 != -1) {
			Static461.aClass177Array1[Static66.anInt1152++] = new Class177((byte) 1, arg4, arg1, arg3, arg2, 0, arg0, (Class4_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B[[I)V")
	public static void method6936(@OriginalArg(1) int[][] arg0) {
		Static449.anIntArrayArray48 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!bi;Lclient!tw;II)V")
	public static void method6937(@OriginalArg(1) Class4_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) Class2_Sub20_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		@Pc(45) int local45;
		if ((arg3 & 0x10) != 0) {
			@Pc(12) int[] local12 = new int[4];
			for (local14 = 0; local14 < 4; local14++) {
				local12[local14] = arg1.method8575();
				if (local12[local14] == 65535) {
					local12[local14] = -1;
				}
			}
			local45 = arg1.method8557();
			Static274.method3838(false, local12, local45, arg0, 29498);
		}
		@Pc(55) byte local55 = -1;
		@Pc(80) int local80;
		@Pc(86) int local86;
		@Pc(103) boolean local103;
		@Pc(63) int local63;
		if ((arg3 & 0x800) != 0) {
			local63 = arg1.method8575();
			if (local63 == 65535) {
				local63 = -1;
			}
			local14 = arg1.method8529((byte) 124);
			local45 = arg1.method8581(-17416);
			local80 = local45 & 0x7;
			local86 = local45 >> 3 & 0xF;
			if (local86 == 15) {
				local86 = -1;
			}
			local103 = (local45 >> 7 & 0x1) == 1;
			arg0.method2047(local103, local14, local63, local80, 1, local86);
		}
		@Pc(126) int[] local126;
		@Pc(129) int[] local129;
		@Pc(156) int local156;
		if ((arg3 & 0x40000) != 0) {
			local63 = arg1.method8557();
			local126 = new int[local63];
			local129 = new int[local63];
			for (local80 = 0; local80 < local63; local80++) {
				local86 = arg1.method8559();
				if ((local86 & 0xC000) == 49152) {
					local156 = arg1.method8554(31493);
					local126[local80] = local156 | local86 << 16;
				} else {
					local126[local80] = local86;
				}
				local129[local80] = arg1.method8554(31493);
			}
			arg0.method2060(local126, local129, (byte) -81);
		}
		if ((arg3 & 0x4) != 0) {
			local63 = arg1.method8557();
			@Pc(199) byte[] local199 = new byte[local63];
			@Pc(204) Class2_Sub20 local204 = new Class2_Sub20(local199);
			arg1.method8573(local63, 0, local199);
			Static388.aClass2_Sub20Array1[arg2] = local204;
			arg0.method730(local204);
		}
		if ((arg3 & 0x2000) != 0) {
			local63 = arg1.method8588();
			local126 = new int[local63];
			local129 = new int[local63];
			@Pc(235) int[] local235 = new int[local63];
			for (local86 = 0; local86 < local63; local86++) {
				local156 = arg1.method8554(31493);
				if (local156 == 65535) {
					local156 = -1;
				}
				local126[local86] = local156;
				local129[local86] = arg1.method8588();
				local235[local86] = arg1.method8575();
			}
			Static285.method3987(0, local126, local235, local129, arg0);
		}
		if ((arg3 & 0x80) != 0) {
			local63 = arg1.method8581(-17416);
			if (local63 > 0) {
				for (local14 = 0; local14 < local63; local14++) {
					local80 = -1;
					local86 = -1;
					local45 = arg1.method8592(255);
					local156 = -1;
					if (local45 == 32767) {
						local45 = arg1.method8592(255);
						local86 = arg1.method8592(255);
						local80 = arg1.method8592(255);
						local156 = arg1.method8592(255);
					} else if (local45 == 32766) {
						local45 = -1;
					} else {
						local86 = arg1.method8592(255);
					}
					@Pc(357) int local357 = arg1.method8592(255);
					@Pc(361) int local361 = arg1.method8557();
					arg0.method2061(local80, Static528.anInt8386, local86, local361, local45, local156, local357);
				}
			}
		}
		if ((arg3 & 0x400) != 0) {
			arg0.anInt2363 = arg1.method8594();
			arg0.anInt2361 = arg1.method8566();
			arg0.anInt2359 = arg1.method8566();
			arg0.anInt2362 = arg1.method8566();
			arg0.anInt2358 = arg1.method8530() + Static528.anInt8386;
			arg0.anInt2367 = arg1.method8530() + Static528.anInt8386;
			arg0.anInt2356 = arg1.method8557();
			if (arg0.aBoolean101) {
				arg0.anInt2362 += arg0.anInt847;
				arg0.anInt2359 += arg0.anInt843;
				arg0.anInt2371 = 0;
				arg0.anInt2361 += arg0.anInt847;
				arg0.anInt2363 += arg0.anInt843;
			} else {
				arg0.anInt2371 = 1;
				arg0.anInt2361 += arg0.anIntArray182[0];
				arg0.anInt2359 += arg0.anIntArray183[0];
				arg0.anInt2362 += arg0.anIntArray182[0];
				arg0.anInt2363 += arg0.anIntArray183[0];
			}
			arg0.anInt2370 = 0;
		}
		if ((arg3 & 0x20) != 0) {
			Static192.aByteArray37[arg2] = arg1.method8536();
		}
		if ((arg3 & 0x20000) != 0) {
			arg0.aBoolean99 = arg1.method8581(-17416) == 1;
		}
		if ((arg3 & 0x10000) != 0) {
			arg0.aByte60 = arg1.method8594();
			arg0.aByte58 = arg1.method8566();
			arg0.aByte61 = arg1.method8566();
			arg0.aByte59 = (byte) arg1.method8588();
			arg0.anInt2364 = Static528.anInt8386 + arg1.method8559();
			arg0.anInt2366 = Static528.anInt8386 + arg1.method8554(31493);
		}
		if ((arg3 & 0x4000) != 0) {
			local63 = arg1.method8559();
			arg0.anInt2310 = arg1.method8588();
			arg0.anInt2342 = arg1.method8557();
			arg0.anInt2349 = local63 & 0x7FFF;
			arg0.aBoolean246 = (local63 & 0x8000) != 0;
			arg0.anInt2325 = arg0.anInt2310 + arg0.anInt2349 + Static528.anInt8386;
		}
		if ((arg3 & 0x8000) != 0) {
			local55 = arg1.method8594();
		}
		if ((arg3 & 0x80000) != 0) {
			local63 = arg1.method8530();
			local14 = arg1.method8540();
			if (local63 == 65535) {
				local63 = -1;
			}
			local45 = arg1.method8588();
			local80 = local45 & 0x7;
			local86 = local45 >> 3 & 0xF;
			if (local86 == 15) {
				local86 = -1;
			}
			local103 = (local45 >> 7 & 0x1) == 1;
			arg0.method2047(local103, local14, local63, local80, 3, local86);
		}
		if ((arg3 & 0x1000) != 0) {
			@Pc(731) String local731 = arg1.method8553();
			if (local731.charAt(0) == '~') {
				local731 = local731.substring(1);
				Static296.method4163(0, arg0.method738(), local731, 2, arg0.aString3, arg0.method729());
			} else if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == arg0) {
				Static296.method4163(0, arg0.method738(), local731, 2, arg0.aString3, arg0.method729());
			}
			arg0.method731(0, local731, 0);
		}
		if ((arg3 & 0x40) != 0) {
			local63 = arg1.method8530();
			if (local63 == 65535) {
				local63 = -1;
			}
			arg0.anInt2348 = local63;
		}
		if ((arg3 & 0x8) != 0) {
			local63 = arg1.method8554(31493);
			if (local63 == 65535) {
				local63 = -1;
			}
			local14 = arg1.method8578();
			local45 = arg1.method8588();
			local80 = local45 & 0x7;
			local86 = local45 >> 3 & 0xF;
			if (local86 == 15) {
				local86 = -1;
			}
			local103 = (local45 >> 7 & 0x1) == 1;
			arg0.method2047(local103, local14, local63, local80, 0, local86);
		}
		if ((arg3 & 0x1) != 0) {
			arg0.anInt848 = arg1.method8530();
			if (arg0.anInt2371 == 0) {
				arg0.method2056(arg0.anInt848);
				arg0.anInt848 = -1;
			}
		}
		if ((arg3 & 0x100000) != 0) {
			local63 = arg1.method8559();
			local14 = arg1.method8555(-9372);
			if (local63 == 65535) {
				local63 = -1;
			}
			local45 = arg1.method8588();
			local80 = local45 & 0x7;
			local86 = local45 >> 3 & 0xF;
			if (local86 == 15) {
				local86 = -1;
			}
			local103 = (local45 >> 7 & 0x1) == 1;
			arg0.method2047(local103, local14, local63, local80, 2, local86);
		}
		if ((arg3 & 0x200) != 0) {
			arg0.aBoolean102 = arg1.method8588() == 1;
		}
		if (!arg0.aBoolean101) {
			return;
		}
		if (local55 == 127) {
			arg0.method736(arg0.anInt847, arg0.anInt843);
			return;
		}
		@Pc(1013) byte local1013;
		if (local55 == -1) {
			local1013 = Static192.aByteArray37[arg2];
		} else {
			local1013 = local55;
		}
		Static296.method4165(local1013, arg0);
		arg0.method734(arg0.anInt843, local1013, arg0.anInt847, (byte) 25);
	}
}
