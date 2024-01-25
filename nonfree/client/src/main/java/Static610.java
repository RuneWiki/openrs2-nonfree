import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "Lclient!vk;")
	public static final Class362 aClass362_1 = new Class362(0, 3, Static409.aClass242_17);

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "Lclient!vk;")
	public static final Class362 aClass362_2 = new Class362(1, 3, Static409.aClass242_17);

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Lclient!vk;")
	public static final Class362 aClass362_3 = new Class362(2, 4, Static409.aClass242_13);

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "Lclient!vk;")
	public static final Class362 aClass362_4 = new Class362(3, 1, Static409.aClass242_17);

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Lclient!vk;")
	public static final Class362 aClass362_5 = new Class362(4, 2, Static409.aClass242_17);

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "Lclient!vk;")
	public static final Class362 aClass362_6 = new Class362(5, 3, Static409.aClass242_17);

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "Lclient!vk;")
	public static final Class362 aClass362_7 = new Class362(6, 4, Static409.aClass242_17);

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
	public static final int anInt10084 = Static88.method1511(16);

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
	public static final int[] anIntArray612 = new int[32];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method8505(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static635.method8384(0, arg0.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!bs;ILclient!vt;I)V")
	public static void method8507(@OriginalArg(1) Class20_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub40_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg1 & 0x1) != 0) {
			Static114.aByteArray40[arg3] = arg2.method8583();
		}
		if ((arg1 & 0x1000) != 0) {
			arg0.aString61 = arg2.method8611();
			if (arg0.aString61.charAt(0) == '~') {
				arg0.aString61 = arg0.aString61.substring(1);
				Static145.method2337(0, arg0.method1026(), arg0.aString61, 2, arg0.aString13, arg0.method1025());
			} else if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == arg0) {
				Static145.method2337(0, arg0.method1026(), arg0.aString61, 2, arg0.aString13, arg0.method1025());
			}
			arg0.anInt5506 = 0;
			arg0.anInt5552 = 150;
			arg0.anInt5510 = 0;
		}
		@Pc(98) int local98;
		@Pc(109) int local109;
		@Pc(113) int local113;
		@Pc(117) int local117;
		@Pc(123) int local123;
		if ((arg1 & 0x100) != 0) {
			local98 = arg2.method8571();
			if (local98 == 65535) {
				local98 = -1;
			}
			local109 = arg2.method8581();
			local113 = arg2.method8560();
			local117 = local113 & 0x7;
			local123 = local113 >> 3 & 0xF;
			if (local123 == 15) {
				local123 = -1;
			}
			arg0.method4918(true, local117, local98, local109, local123);
		}
		if ((arg1 & 0x4000) != 0) {
			local98 = arg2.method8614();
			arg0.anInt5539 = arg2.method8576();
			arg0.anInt5498 = arg2.method8604();
			arg0.anInt5488 = local98 & 0x7FFF;
			arg0.aBoolean374 = (local98 & 0x8000) != 0;
			arg0.anInt5565 = arg0.anInt5539 + arg0.anInt5488 + Static113.anInt2243;
		}
		@Pc(216) int local216;
		@Pc(190) int[] local190;
		@Pc(193) int[] local193;
		if ((arg1 & 0x10000) != 0) {
			local98 = arg2.method8604();
			local190 = new int[local98];
			local193 = new int[local98];
			for (local117 = 0; local117 < local98; local117++) {
				local123 = arg2.method8585();
				if ((local123 & 0xC000) == 49152) {
					local216 = arg2.method8552();
					local190[local117] = local216 | local123 << 16;
				} else {
					local190[local117] = local123;
				}
				local193[local117] = arg2.method8552();
			}
			arg0.method4907(local190, local193);
		}
		if ((arg1 & 0x80) != 0) {
			@Pc(249) int[] local249 = new int[4];
			for (local109 = 0; local109 < 4; local109++) {
				local249[local109] = arg2.method8614();
				if (local249[local109] == 65535) {
					local249[local109] = -1;
				}
			}
			local113 = arg2.method8573();
			Static315.method5285(arg0, local113, local249);
		}
		if ((arg1 & 0x8000) != 0) {
			local7 = arg2.method8602();
		}
		if ((arg1 & 0x40000) != 0) {
			arg0.aByte64 = arg2.method8570();
			arg0.aByte65 = arg2.method8590();
			arg0.aByte66 = arg2.method8590();
			arg0.aByte67 = (byte) arg2.method8604();
			arg0.anInt5536 = Static113.anInt2243 + arg2.method8571();
			arg0.anInt5528 = Static113.anInt2243 + arg2.method8571();
		}
		if ((arg1 & 0x800) != 0) {
			arg0.aBoolean74 = arg2.method8604() == 1;
		}
		if ((arg1 & 0x20) != 0) {
			local98 = arg2.method8560();
			if (local98 > 0) {
				for (local109 = 0; local109 < local98; local109++) {
					local117 = -1;
					local123 = -1;
					local113 = arg2.method8587();
					local216 = -1;
					if (local113 == 32767) {
						local113 = arg2.method8587();
						local123 = arg2.method8587();
						local117 = arg2.method8587();
						local216 = arg2.method8587();
					} else if (local113 == 32766) {
						local113 = -1;
					} else {
						local123 = arg2.method8587();
					}
					@Pc(417) int local417 = arg2.method8587();
					@Pc(421) int local421 = arg2.method8576();
					arg0.method4909(local123, local216, local117, local421, local113, local417, Static113.anInt2243);
				}
			}
		}
		if ((arg1 & 0x200) != 0) {
			arg0.anInt5548 = arg2.method8590();
			arg0.anInt5563 = arg2.method8602();
			arg0.anInt5542 = arg2.method8570();
			arg0.anInt5490 = arg2.method8602();
			arg0.anInt5512 = arg2.method8552() + Static113.anInt2243;
			arg0.anInt5553 = arg2.method8585() + Static113.anInt2243;
			arg0.anInt5525 = arg2.method8560();
			if (arg0.aBoolean76) {
				arg0.anInt5563 += arg0.anInt1207;
				arg0.anInt5548 += arg0.anInt1204;
				arg0.anInt5542 += arg0.anInt1204;
				arg0.anInt5490 += arg0.anInt1207;
				arg0.anInt5574 = 0;
			} else {
				arg0.anInt5490 += arg0.anIntArray336[0];
				arg0.anInt5548 += arg0.anIntArray335[0];
				arg0.anInt5542 += arg0.anIntArray335[0];
				arg0.anInt5574 = 1;
				arg0.anInt5563 += arg0.anIntArray336[0];
			}
			arg0.anInt5576 = 0;
		}
		if ((arg1 & 0x2) != 0) {
			arg0.anInt1219 = arg2.method8552();
			if (arg0.anInt5574 == 0) {
				arg0.method4919(arg0.anInt1219);
				arg0.anInt1219 = -1;
			}
		}
		if ((arg1 & 0x8) != 0) {
			local98 = arg2.method8552();
			if (local98 == 65535) {
				local98 = -1;
			}
			arg0.anInt5572 = local98;
		}
		if ((arg1 & 0x2000) != 0) {
			local98 = arg2.method8573();
			local190 = new int[local98];
			local193 = new int[local98];
			@Pc(614) int[] local614 = new int[local98];
			for (local123 = 0; local123 < local98; local123++) {
				local216 = arg2.method8614();
				if (local216 == 65535) {
					local216 = -1;
				}
				local190[local123] = local216;
				local193[local123] = arg2.method8560();
				local614[local123] = arg2.method8585();
			}
			Static278.method4870(local193, arg0, local190, local614);
		}
		if ((arg1 & 0x10) != 0) {
			local98 = arg2.method8614();
			if (local98 == 65535) {
				local98 = -1;
			}
			local109 = arg2.method8568();
			local113 = arg2.method8604();
			local117 = local113 & 0x7;
			local123 = local113 >> 3 & 0xF;
			if (local123 == 15) {
				local123 = -1;
			}
			arg0.method4918(false, local117, local98, local109, local123);
		}
		if ((arg1 & 0x40) != 0) {
			local109 = arg2.method8576();
			@Pc(726) byte[] local726 = new byte[local109];
			@Pc(731) Class6_Sub40 local731 = new Class6_Sub40(local726);
			arg2.method8595(local726, local109, 0);
			Static594.aClass6_Sub40Array1[arg3] = local731;
			arg0.method1028(local731);
		}
		if (!arg0.aBoolean76) {
			return;
		}
		if (local7 == 127) {
			arg0.method1024(arg0.anInt1207, arg0.anInt1204);
			return;
		}
		@Pc(767) byte local767;
		if (local7 == -1) {
			local767 = Static114.aByteArray40[arg3];
		} else {
			local767 = local7;
		}
		Static92.method1519(local767, arg0);
		arg0.method1021(local767, arg0.anInt1204, arg0.anInt1207);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lclient!vk;")
	public static Class362 method8508(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass362_1;
		} else if (arg0 == 1) {
			return aClass362_2;
		} else if (arg0 == 2) {
			return aClass362_3;
		} else if (arg0 == 3) {
			return aClass362_4;
		} else if (arg0 == 4) {
			return aClass362_5;
		} else if (arg0 == 5) {
			return aClass362_6;
		} else if (arg0 == 6) {
			return aClass362_7;
		} else {
			return null;
		}
	}
}
