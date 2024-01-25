import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!lfa", name = "t", descriptor = "Lclient!oja;")
	public static final Class257 aClass257_5 = new Class257();

	@OriginalMember(owner = "client!lfa", name = "A", descriptor = "Lclient!af;")
	public static final Class10 aClass10_35 = new Class10(4);

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)V")
	public static void method4910() {
		if (Static566.anInt9416 == 1 || Static566.anInt9416 == 3 || Static337.anInt2689 != Static566.anInt9416 && (Static566.anInt9416 == 0 || Static337.anInt2689 == 0)) {
			Static133.anInt2316 = 0;
			Static490.anInt8336 = 0;
			Static349.aClass209_32.method5041();
		}
		Static337.anInt2689 = Static566.anInt9416;
	}

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)V")
	public static void method4913() {
		for (@Pc(12) int local12 = 0; local12 < Static105.anInt1939; local12++) {
			@Pc(18) int local18 = Static69.anIntArray70[local12];
			@Pc(26) Class2_Sub1_Sub1_Sub3_Sub2 local26 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) local18)).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			@Pc(32) int local32 = Static204.aClass6_Sub23_Sub1_1.method8374();
			if ((local32 & 0x8) != 0) {
				local32 += Static204.aClass6_Sub23_Sub1_1.method8374() << 8;
			}
			if ((local32 & 0x1000) != 0) {
				local32 += Static204.aClass6_Sub23_Sub1_1.method8374() << 16;
			}
			@Pc(71) int local71;
			@Pc(74) int[] local74;
			@Pc(77) int[] local77;
			@Pc(79) int local79;
			@Pc(85) int local85;
			@Pc(96) int local96;
			if ((local32 & 0x800) != 0) {
				local71 = Static204.aClass6_Sub23_Sub1_1.method8343();
				local74 = new int[local71];
				local77 = new int[local71];
				for (local79 = 0; local79 < local71; local79++) {
					local85 = Static204.aClass6_Sub23_Sub1_1.method8403();
					if ((local85 & 0xC000) == 49152) {
						local96 = Static204.aClass6_Sub23_Sub1_1.method8367();
						local74[local79] = local85 << 16 | local96;
					} else {
						local74[local79] = local85;
					}
					local77[local79] = Static204.aClass6_Sub23_Sub1_1.method8365();
				}
				local26.method4322(local77, local74);
			}
			@Pc(147) int local147;
			@Pc(151) int local151;
			if ((local32 & 0x2) != 0) {
				local71 = Static204.aClass6_Sub23_Sub1_1.method8363();
				if (local71 == 65535) {
					local71 = -1;
				}
				local147 = Static204.aClass6_Sub23_Sub1_1.method8348();
				local151 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local79 = local151 & 0x7;
				local85 = local151 >> 3 & 0xF;
				if (local85 == 15) {
					local85 = -1;
				}
				local26.method4333(local71, local79, 0, local147, local85);
			}
			if ((local32 & 0x10) != 0) {
				local26.anInt5136 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local26.anInt5126 = Static204.aClass6_Sub23_Sub1_1.method8367();
			}
			@Pc(260) int local260;
			@Pc(264) int local264;
			if ((local32 & 0x1) != 0) {
				local71 = Static204.aClass6_Sub23_Sub1_1.method8343();
				if (local71 > 0) {
					for (local147 = 0; local147 < local71; local147++) {
						local79 = -1;
						local85 = -1;
						local96 = -1;
						local151 = Static204.aClass6_Sub23_Sub1_1.method8404();
						if (local151 == 32767) {
							local151 = Static204.aClass6_Sub23_Sub1_1.method8404();
							local85 = Static204.aClass6_Sub23_Sub1_1.method8404();
							local79 = Static204.aClass6_Sub23_Sub1_1.method8404();
							local96 = Static204.aClass6_Sub23_Sub1_1.method8404();
						} else if (local151 == 32766) {
							local151 = -1;
						} else {
							local85 = Static204.aClass6_Sub23_Sub1_1.method8404();
						}
						local260 = Static204.aClass6_Sub23_Sub1_1.method8404();
						local264 = Static204.aClass6_Sub23_Sub1_1.method8337();
						local26.method4320(local260, local85, Static90.anInt1698, local79, local264, local96, local151);
					}
				}
			}
			if ((local32 & 0x20000) != 0) {
				local26.anInt5137 = Static204.aClass6_Sub23_Sub1_1.method8363();
				if (local26.anInt5137 == 65535) {
					local26.anInt5137 = local26.aClass91_1.anInt2338;
				}
			}
			@Pc(347) int[] local347;
			@Pc(375) short[] local375;
			@Pc(400) short[] local400;
			@Pc(439) long local439;
			if ((local32 & 0x4000) != 0) {
				local71 = local26.aClass91_1.anIntArray141.length;
				local147 = 0;
				if (local26.aClass91_1.aShortArray48 != null) {
					local147 = local26.aClass91_1.aShortArray48.length;
				}
				local151 = 0;
				if (local26.aClass91_1.aShortArray49 != null) {
					local151 = local26.aClass91_1.aShortArray49.length;
				}
				local79 = Static204.aClass6_Sub23_Sub1_1.method8397();
				if ((local79 & 0x1) == 1) {
					local26.aClass236_1 = null;
				} else {
					local347 = null;
					if ((local79 & 0x2) == 2) {
						local347 = new int[local71];
						for (local96 = 0; local96 < local71; local96++) {
							local347[local96] = Static204.aClass6_Sub23_Sub1_1.method8363();
						}
					}
					local375 = null;
					if ((local79 & 0x4) == 4) {
						local375 = new short[local147];
						for (local260 = 0; local260 < local147; local260++) {
							local375[local260] = (short) Static204.aClass6_Sub23_Sub1_1.method8365();
						}
					}
					local400 = null;
					if ((local79 & 0x8) == 8) {
						local400 = new short[local151];
						for (local264 = 0; local264 < local151; local264++) {
							local400[local264] = (short) Static204.aClass6_Sub23_Sub1_1.method8367();
						}
					}
					local439 = (long) local18 | (long) local26.anInt5128++ << 32;
					local26.aClass236_1 = new Class236(local439, local347, local375, local400);
				}
			}
			if ((local32 & 0x400) != 0) {
				local71 = Static204.aClass6_Sub23_Sub1_1.method8343();
				local74 = new int[local71];
				local77 = new int[local71];
				@Pc(470) int[] local470 = new int[local71];
				for (local85 = 0; local85 < local71; local85++) {
					local96 = Static204.aClass6_Sub23_Sub1_1.method8363();
					if (local96 == 65535) {
						local96 = -1;
					}
					local74[local85] = local96;
					local77[local85] = Static204.aClass6_Sub23_Sub1_1.method8337();
					local470[local85] = Static204.aClass6_Sub23_Sub1_1.method8403();
				}
				Static269.method3989(local77, local470, local26, local74);
			}
			if ((local32 & 0x20) != 0) {
				if (local26.aClass91_1.method2032()) {
					Static89.method8412(local26);
				}
				local26.method4341(Static95.aClass188_1.method4262(Static204.aClass6_Sub23_Sub1_1.method8403()));
				local26.method4323(local26.aClass91_1.anInt2346);
				local26.anInt5050 = local26.aClass91_1.anInt2349 << 3;
				if (local26.aClass91_1.method2032()) {
					Static513.method7270(local26, (Class308) null, local26.anIntArray302[0], local26.anIntArray301[0], (Class2_Sub1_Sub1_Sub3_Sub1) null, 0, local26.aByte140);
				}
			}
			if ((local32 & 0x40000) != 0) {
				local71 = local26.aClass91_1.anIntArray139.length;
				local147 = 0;
				if (local26.aClass91_1.aShortArray48 != null) {
					local147 = local26.aClass91_1.aShortArray48.length;
				}
				if (local26.aClass91_1.aShortArray49 != null) {
					local147 = local26.aClass91_1.aShortArray49.length;
				}
				local79 = Static204.aClass6_Sub23_Sub1_1.method8343();
				if ((local79 & 0x1) != 1) {
					local347 = null;
					if ((local79 & 0x2) == 2) {
						local347 = new int[local71];
						for (local96 = 0; local96 < local71; local96++) {
							local347[local96] = Static204.aClass6_Sub23_Sub1_1.method8363();
						}
					}
					local375 = null;
					if ((local79 & 0x4) == 4) {
						local375 = new short[local147];
						for (local260 = 0; local260 < local147; local260++) {
							local375[local260] = (short) Static204.aClass6_Sub23_Sub1_1.method8367();
						}
					}
					local400 = null;
					if ((local79 & 0x8) == 8) {
						local400 = new short[0];
						for (local264 = 0; local264 < 0; local264++) {
							local400[local264] = (short) Static204.aClass6_Sub23_Sub1_1.method8403();
						}
					}
					local439 = (long) local26.anInt5143++ << 32 | (long) local18;
					new Class236(local439, local347, local375, local400);
				}
			}
			if ((local32 & 0x100) != 0) {
				local26.anInt5094 = Static204.aClass6_Sub23_Sub1_1.method8391();
				local26.anInt5076 = Static204.aClass6_Sub23_Sub1_1.method8350();
				local26.anInt5060 = Static204.aClass6_Sub23_Sub1_1.method8350();
				local26.anInt5073 = Static204.aClass6_Sub23_Sub1_1.method8350();
				local26.anInt5100 = Static204.aClass6_Sub23_Sub1_1.method8367() + Static90.anInt1698;
				local26.anInt5117 = Static204.aClass6_Sub23_Sub1_1.method8403() + Static90.anInt1698;
				local26.anInt5069 = Static204.aClass6_Sub23_Sub1_1.method8337();
				local26.anInt5119 = 1;
				local26.anInt5060 += local26.anIntArray302[0];
				local26.anInt5120 = 0;
				local26.anInt5076 += local26.anIntArray301[0];
				local26.anInt5073 += local26.anIntArray301[0];
				local26.anInt5094 += local26.anIntArray302[0];
			}
			if ((local32 & 0x10000) != 0) {
				local71 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local147 = Static204.aClass6_Sub23_Sub1_1.method8336();
				if (local71 == 65535) {
					local71 = -1;
				}
				local151 = Static204.aClass6_Sub23_Sub1_1.method8343();
				local79 = local151 & 0x7;
				local85 = local151 >> 3 & 0xF;
				if (local85 == 15) {
					local85 = -1;
				}
				local26.method4333(local71, local79, 2, local147, local85);
			}
			if ((local32 & 0x8000) != 0) {
				local71 = Static204.aClass6_Sub23_Sub1_1.method8363();
				if (local71 == 65535) {
					local71 = -1;
				}
				local147 = Static204.aClass6_Sub23_Sub1_1.method8336();
				local151 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local79 = local151 & 0x7;
				local85 = local151 >> 3 & 0xF;
				if (local85 == 15) {
					local85 = -1;
				}
				local26.method4333(local71, local79, 1, local147, local85);
			}
			if ((local32 & 0x2000) != 0) {
				local71 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local26.anInt5086 = Static204.aClass6_Sub23_Sub1_1.method8337();
				local26.anInt5091 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local26.anInt5111 = local71 & 0x7FFF;
				local26.aBoolean330 = (local71 & 0x8000) != 0;
				local26.anInt5108 = local26.anInt5086 + local26.anInt5111 + Static90.anInt1698;
			}
			if ((local32 & 0x40) != 0) {
				local26.anInt5066 = Static204.aClass6_Sub23_Sub1_1.method8365();
				if (local26.anInt5066 == 65535) {
					local26.anInt5066 = -1;
				}
			}
			if ((local32 & 0x4) != 0) {
				@Pc(972) int[] local972 = new int[4];
				for (local147 = 0; local147 < 4; local147++) {
					local972[local147] = Static204.aClass6_Sub23_Sub1_1.method8363();
					if (local972[local147] == 65535) {
						local972[local147] = -1;
					}
				}
				local151 = Static204.aClass6_Sub23_Sub1_1.method8397();
				Static389.method5546(local151, local972, local26);
			}
			if ((local32 & 0x80) != 0) {
				local26.aString66 = Static204.aClass6_Sub23_Sub1_1.method8354();
				local26.anInt5106 = 100;
			}
			if ((local32 & 0x80000) != 0) {
				local26.aString67 = Static204.aClass6_Sub23_Sub1_1.method8354();
				if ("".equals(local26.aString67) || local26.aString67.equals(local26.aClass91_1.aString25)) {
					local26.aString67 = local26.aClass91_1.aString25;
				}
			}
			if ((local32 & 0x200) != 0) {
				local26.aByte90 = Static204.aClass6_Sub23_Sub1_1.method8391();
				local26.aByte89 = Static204.aClass6_Sub23_Sub1_1.method8384();
				local26.aByte93 = Static204.aClass6_Sub23_Sub1_1.method8384();
				local26.aByte92 = (byte) Static204.aClass6_Sub23_Sub1_1.method8343();
				local26.anInt5055 = Static90.anInt1698 + Static204.aClass6_Sub23_Sub1_1.method8365();
				local26.anInt5116 = Static90.anInt1698 + Static204.aClass6_Sub23_Sub1_1.method8363();
			}
		}
	}
}
