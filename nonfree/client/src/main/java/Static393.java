import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!nea", name = "n", descriptor = "Lclient!o;")
	public static Class259 aClass259_5;

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	public static void method6033() {
		@Pc(8) Class6_Sub15_Sub1 local8 = Static525.aClass260_4.aClass6_Sub15_Sub1_2;
		for (@Pc(10) int local10 = 0; local10 < Static563.anInt9103; local10++) {
			@Pc(16) int local16 = Static610.anIntArray630[local10];
			@Pc(24) Class60_Sub1_Sub1_Sub3_Sub2 local24 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) local16)).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			@Pc(28) int local28 = local8.method3030();
			if ((local28 & 0x10) != 0) {
				local28 += local8.method3030() << 8;
			}
			if ((local28 & 0x1000) != 0) {
				local28 += local8.method3030() << 16;
			}
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(79) int local79;
			@Pc(83) int local83;
			@Pc(89) int local89;
			if ((local28 & 0x200) != 0) {
				local66 = local8.method3018();
				local70 = local8.method3022();
				if (local66 == 65535) {
					local66 = -1;
				}
				local79 = local8.method3030();
				local83 = local79 & 0x7;
				local89 = local79 >> 3 & 0xF;
				if (local89 == 15) {
					local89 = -1;
				}
				local24.method4420(1, local89, local70, local66, local83);
			}
			if ((local28 & 0x100) != 0) {
				local24.aByte74 = local8.method3027();
				local24.aByte77 = local8.method2990();
				local24.aByte76 = local8.method3033();
				local24.aByte75 = (byte) local8.method3036();
				local24.anInt4877 = Static141.anInt8737 + local8.method3005();
				local24.anInt4874 = Static141.anInt8737 + local8.method3042();
			}
			if ((local28 & 0x1) != 0) {
				if (local24.aClass294_1.method7159((byte) -109)) {
					Static85.method1252(local24);
				}
				local24.method4435(Static221.aClass164_1.method4157(local8.method3018()));
				local24.method4432(local24.aClass294_1.anInt8169);
				local24.anInt4865 = local24.aClass294_1.anInt8162 << 3;
				if (local24.aClass294_1.method7159((byte) -91)) {
					Static268.method4558((Class60_Sub1_Sub1_Sub3_Sub1) null, local24.anIntArray264[0], 0, local24.anIntArray263[0], local24, (Class125) null, local24.aByte135);
				}
			}
			if ((local28 & 0x80000) != 0) {
				local24.anInt4884 = local8.method3048();
				if (local24.anInt4884 == 65535) {
					local24.anInt4884 = local24.aClass294_1.anInt8142;
				}
			}
			@Pc(264) int local264;
			@Pc(248) int[] local248;
			@Pc(251) int[] local251;
			if ((local28 & 0x400) != 0) {
				local66 = local8.method3021();
				local248 = new int[local66];
				local251 = new int[local66];
				@Pc(254) int[] local254 = new int[local66];
				for (local89 = 0; local89 < local66; local89++) {
					local264 = local8.method3048();
					if (local264 == 65535) {
						local264 = -1;
					}
					local248[local89] = local264;
					local251[local89] = local8.method3034();
					local254[local89] = local8.method3048();
				}
				Static114.method2145(local248, local24, local251, local254);
			}
			if ((local28 & 0x40000) != 0) {
				local66 = local8.method3042();
				local70 = local8.method3051();
				if (local66 == 65535) {
					local66 = -1;
				}
				local79 = local8.method3036();
				local83 = local79 & 0x7;
				local89 = local79 >> 3 & 0xF;
				if (local89 == 15) {
					local89 = -1;
				}
				local24.method4420(2, local89, local70, local66, local83);
			}
			if ((local28 & 0x4000) != 0) {
				local66 = local8.method3005();
				local24.anInt4847 = local8.method3021();
				local24.anInt4833 = local8.method3034();
				local24.aBoolean371 = (local66 & 0x8000) != 0;
				local24.anInt4863 = local66 & 0x7FFF;
				local24.anInt4828 = local24.anInt4863 + Static141.anInt8737 + local24.anInt4847;
			}
			if ((local28 & 0x2000) != 0) {
				local24.anInt4867 = local8.method3033();
				local24.anInt4873 = local8.method3027();
				local24.anInt4871 = local8.method3027();
				local24.anInt4876 = local8.method3033();
				local24.anInt4869 = local8.method3005() + Static141.anInt8737;
				local24.anInt4875 = local8.method3005() + Static141.anInt8737;
				local24.anInt4870 = local8.method3036();
				local24.anInt4871 += local24.anIntArray263[0];
				local24.anInt4867 += local24.anIntArray263[0];
				local24.anInt4876 += local24.anIntArray264[0];
				local24.anInt4873 += local24.anIntArray264[0];
				local24.anInt4879 = 1;
				local24.anInt4880 = 0;
			}
			if ((local28 & 0x800) != 0) {
				local66 = local8.method3021();
				local248 = new int[local66];
				local251 = new int[local66];
				for (local83 = 0; local83 < local66; local83++) {
					local89 = local8.method3005();
					if ((local89 & 0xC000) == 49152) {
						local264 = local8.method3048();
						local248[local83] = local264 | local89 << 16;
					} else {
						local248[local83] = local89;
					}
					local251[local83] = local8.method3018();
				}
				local24.method4422(local248, local251);
			}
			if ((local28 & 0x40) != 0) {
				local66 = local8.method3005();
				if (local66 == 65535) {
					local66 = -1;
				}
				local70 = local8.method3032();
				local79 = local8.method3030();
				local83 = local79 & 0x7;
				local89 = local79 >> 3 & 0xF;
				if (local89 == 15) {
					local89 = -1;
				}
				local24.method4420(0, local89, local70, local66, local83);
			}
			if ((local28 & 0x8) != 0) {
				@Pc(610) int[] local610 = new int[4];
				for (local70 = 0; local70 < 4; local70++) {
					local610[local70] = local8.method3042();
					if (local610[local70] == 65535) {
						local610[local70] = -1;
					}
				}
				local79 = local8.method3030();
				Static365.method5544(local610, local24, local79, true);
			}
			@Pc(745) int local745;
			@Pc(774) int local774;
			@Pc(762) short[] local762;
			@Pc(733) short[] local733;
			@Pc(803) long local803;
			@Pc(705) int[] local705;
			if ((local28 & 0x8000) != 0) {
				local66 = local24.aClass294_1.anIntArray512.length;
				local70 = 0;
				if (local24.aClass294_1.aShortArray108 != null) {
					local70 = local24.aClass294_1.aShortArray108.length;
				}
				local79 = 0;
				if (local24.aClass294_1.aShortArray109 != null) {
					local79 = local24.aClass294_1.aShortArray109.length;
				}
				local83 = local8.method3030();
				if ((local83 & 0x1) == 1) {
					local24.aClass174_1 = null;
				} else {
					local705 = null;
					if ((local83 & 0x2) == 2) {
						local705 = new int[local66];
						for (local264 = 0; local264 < local66; local264++) {
							local705[local264] = local8.method3018();
						}
					}
					local733 = null;
					if ((local83 & 0x4) == 4) {
						local733 = new short[local70];
						for (local745 = 0; local745 < local70; local745++) {
							local733[local745] = (short) local8.method3048();
						}
					}
					local762 = null;
					if ((local83 & 0x8) == 8) {
						local762 = new short[local79];
						for (local774 = 0; local774 < local79; local774++) {
							local762[local774] = (short) local8.method3042();
						}
					}
					local803 = (long) local24.anInt4899++ << 32 | (long) local16;
					local24.aClass174_1 = new Class174(local803, local705, local733, local762);
				}
			}
			if ((local28 & 0x10000) != 0) {
				local24.aString51 = local8.method3046();
				if ("".equals(local24.aString51) || local24.aString51.equals(local24.aClass294_1.aString91)) {
					local24.aString51 = local24.aClass294_1.aString91;
				}
			}
			if ((local28 & 0x20) != 0) {
				local24.anInt4883 = local8.method3005();
				local24.anInt4885 = local8.method3018();
			}
			if ((local28 & 0x2) != 0) {
				local24.aString50 = local8.method3046();
				local24.anInt4860 = 100;
			}
			if ((local28 & 0x80) != 0) {
				local24.anInt4858 = local8.method3042();
				if (local24.anInt4858 == 65535) {
					local24.anInt4858 = -1;
				}
			}
			if ((local28 & 0x4) != 0) {
				local66 = local8.method3034();
				if (local66 > 0) {
					for (local70 = 0; local70 < local66; local70++) {
						local83 = -1;
						local89 = -1;
						local79 = local8.method2992();
						local264 = -1;
						if (local79 == 32767) {
							local79 = local8.method2992();
							local89 = local8.method2992();
							local83 = local8.method2992();
							local264 = local8.method2992();
						} else if (local79 == 32766) {
							local79 = -1;
						} else {
							local89 = local8.method2992();
						}
						local745 = local8.method2992();
						local774 = local8.method3030();
						local24.method4431(local79, Static141.anInt8737, local774, local83, local89, local264, local745);
					}
				}
			}
			if ((local28 & 0x20000) != 0) {
				local66 = local24.aClass294_1.anIntArray514.length;
				local70 = 0;
				if (local24.aClass294_1.aShortArray108 != null) {
					local70 = local24.aClass294_1.aShortArray108.length;
				}
				if (local24.aClass294_1.aShortArray109 != null) {
					local70 = local24.aClass294_1.aShortArray109.length;
				}
				local83 = local8.method3034();
				if ((local83 & 0x1) != 1) {
					local705 = null;
					if ((local83 & 0x2) == 2) {
						local705 = new int[local66];
						for (local264 = 0; local264 < local66; local264++) {
							local705[local264] = local8.method3005();
						}
					}
					local733 = null;
					if ((local83 & 0x4) == 4) {
						local733 = new short[local70];
						for (local745 = 0; local745 < local70; local745++) {
							local733[local745] = (short) local8.method3005();
						}
					}
					local762 = null;
					if ((local83 & 0x8) == 8) {
						local762 = new short[0];
						for (local774 = 0; local774 < 0; local774++) {
							local762[local774] = (short) local8.method3042();
						}
					}
					local803 = (long) local24.anInt4894++ << 32 | (long) local16;
					new Class174(local803, local705, local733, local762);
				}
			}
		}
	}
}
