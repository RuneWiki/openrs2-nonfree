import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!lha", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!lha", name = "G", descriptor = "Lclient!ft;")
	public static Class122 aClass122_24;

	@OriginalMember(owner = "client!lha", name = "L", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_76 = new Class241(61, 3);

	@OriginalMember(owner = "client!lha", name = "D", descriptor = "Lclient!cb;")
	public static final Class51 aClass51_8 = new Class51();

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!em;IIILclient!eea;)V")
	public static void method5308(@OriginalArg(0) Class60_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub15_Sub1 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if ((arg1 & 0x1) != 0) {
			local18 = arg3.method3042();
			local22 = arg3.method3022();
			if (local18 == 65535) {
				local18 = -1;
			}
			local33 = arg3.method3021();
			local37 = local33 & 0x7;
			local43 = local33 >> 3 & 0xF;
			if (local43 == 15) {
				local43 = -1;
			}
			arg0.method4420(0, local43, local22, local18, local37);
		}
		@Pc(96) int local96;
		@Pc(68) int[] local68;
		@Pc(71) int[] local71;
		if ((arg1 & 0x40000) != 0) {
			local18 = arg3.method3030();
			local68 = new int[local18];
			local71 = new int[local18];
			for (local37 = 0; local37 < local18; local37++) {
				local43 = arg3.method3042();
				if ((local43 & 0xC000) == 49152) {
					local96 = arg3.method3048();
					local68[local37] = local96 | local43 << 16;
				} else {
					local68[local37] = local43;
				}
				local71[local37] = arg3.method3018();
			}
			arg0.method4422(local68, local71);
		}
		if ((arg1 & 0x800) != 0) {
			local18 = arg3.method3005();
			arg0.anInt4847 = arg3.method3021();
			arg0.anInt4833 = arg3.method3034();
			arg0.anInt4863 = local18 & 0x7FFF;
			arg0.aBoolean371 = (local18 & 0x8000) != 0;
			arg0.anInt4828 = Static141.anInt8737 + arg0.anInt4863 + arg0.anInt4847;
		}
		if ((arg1 & 0x10) != 0) {
			local18 = arg3.method3034();
			if (local18 > 0) {
				for (local22 = 0; local22 < local18; local22++) {
					local37 = -1;
					local43 = -1;
					local33 = arg3.method2992();
					local96 = -1;
					if (local33 == 32767) {
						local33 = arg3.method2992();
						local43 = arg3.method2992();
						local37 = arg3.method2992();
						local96 = arg3.method2992();
					} else if (local33 == 32766) {
						local33 = -1;
					} else {
						local43 = arg3.method2992();
					}
					@Pc(241) int local241 = arg3.method2992();
					@Pc(247) int local247 = arg3.method3030();
					arg0.method4431(local33, Static141.anInt8737, local247, local37, local43, local96, local241);
				}
			}
		}
		if ((arg1 & 0x4) != 0) {
			local18 = arg3.method3030();
			@Pc(278) byte[] local278 = new byte[local18];
			@Pc(283) Class6_Sub15 local283 = new Class6_Sub15(local278);
			arg3.method3012(local278, local18);
			Static372.aClass6_Sub15Array4[arg2] = local283;
			arg0.method2706(local283);
		}
		if ((arg1 & 0x10000) != 0) {
			arg0.aBoolean227 = arg3.method3034() == 1;
		}
		if ((arg1 & 0x200) != 0) {
			local18 = arg3.method3042();
			local22 = arg3.method3015();
			if (local18 == 65535) {
				local18 = -1;
			}
			local33 = arg3.method3030();
			local37 = local33 & 0x7;
			local43 = local33 >> 3 & 0xF;
			if (local43 == 15) {
				local43 = -1;
			}
			arg0.method4420(1, local43, local22, local18, local37);
		}
		if ((arg1 & 0x100) != 0) {
			local7 = arg3.method2990();
		}
		if ((arg1 & 0x8000) != 0) {
			arg0.aString50 = arg3.method3046();
			if (arg0.aString50.charAt(0) == '~') {
				arg0.aString50 = arg0.aString50.substring(1);
				Static14.method193(arg0.method2701(), arg0.aString24, arg0.method2703(), 0, arg0.aString50, 2);
			} else if (arg0 == Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1) {
				Static14.method193(arg0.method2701(), arg0.aString24, arg0.method2703(), 0, arg0.aString50, 2);
			}
			arg0.anInt4848 = 0;
			arg0.anInt4826 = 0;
			arg0.anInt4860 = 150;
		}
		if ((arg1 & 0x20000) != 0) {
			local18 = arg3.method3048();
			local22 = arg3.method3051();
			if (local18 == 65535) {
				local18 = -1;
			}
			local33 = arg3.method3021();
			local37 = local33 & 0x7;
			local43 = local33 >> 3 & 0xF;
			if (local43 == 15) {
				local43 = -1;
			}
			arg0.method4420(2, local43, local22, local18, local37);
		}
		if ((arg1 & 0x1000) != 0) {
			arg0.anInt4867 = arg3.method3014();
			arg0.anInt4873 = arg3.method3014();
			arg0.anInt4871 = arg3.method2990();
			arg0.anInt4876 = arg3.method3027();
			arg0.anInt4869 = arg3.method3018() + Static141.anInt8737;
			arg0.anInt4875 = arg3.method3018() + Static141.anInt8737;
			arg0.anInt4870 = arg3.method3021();
			if (arg0.aBoolean228) {
				arg0.anInt4876 += arg0.anInt2840;
				arg0.anInt4879 = 0;
				arg0.anInt4867 += arg0.anInt2839;
				arg0.anInt4871 += arg0.anInt2839;
				arg0.anInt4873 += arg0.anInt2840;
			} else {
				arg0.anInt4871 += arg0.anIntArray263[0];
				arg0.anInt4873 += arg0.anIntArray264[0];
				arg0.anInt4876 += arg0.anIntArray264[0];
				arg0.anInt4867 += arg0.anIntArray263[0];
				arg0.anInt4879 = 1;
			}
			arg0.anInt4880 = 0;
		}
		if ((arg1 & 0x20) != 0) {
			@Pc(641) int[] local641 = new int[4];
			for (local22 = 0; local22 < 4; local22++) {
				local641[local22] = arg3.method3018();
				if (local641[local22] == 65535) {
					local641[local22] = -1;
				}
			}
			local33 = arg3.method3021();
			Static365.method5544(local641, arg0, local33, false);
		}
		if ((arg1 & 0x80) != 0) {
			arg0.anInt2853 = arg3.method3005();
			if (arg0.anInt4879 == 0) {
				arg0.method4419(arg0.anInt2853);
				arg0.anInt2853 = -1;
			}
		}
		if ((arg1 & 0x4000) != 0) {
			local18 = arg3.method3036();
			local68 = new int[local18];
			local71 = new int[local18];
			@Pc(727) int[] local727 = new int[local18];
			for (local43 = 0; local43 < local18; local43++) {
				local96 = arg3.method3042();
				if (local96 == 65535) {
					local96 = -1;
				}
				local68[local43] = local96;
				local71[local43] = arg3.method3021();
				local727[local43] = arg3.method3018();
			}
			Static114.method2145(local68, arg0, local71, local727);
		}
		if ((arg1 & 0x2) != 0) {
			Static27.aByteArray4[arg2] = arg3.method3033();
		}
		if ((arg1 & 0x40) != 0) {
			local18 = arg3.method3005();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg0.anInt4858 = local18;
		}
		if ((arg1 & 0x80000) != 0) {
			arg0.aByte74 = arg3.method2990();
			arg0.aByte77 = arg3.method3033();
			arg0.aByte76 = arg3.method3014();
			arg0.aByte75 = (byte) arg3.method3036();
			arg0.anInt4877 = Static141.anInt8737 + arg3.method3048();
			arg0.anInt4874 = Static141.anInt8737 + arg3.method3048();
		}
		if ((arg1 & 0x2000) != 0) {
			arg0.aBoolean226 = arg3.method3030() == 1;
		}
		if (!arg0.aBoolean228) {
			return;
		}
		if (local7 == 127) {
			arg0.method2707(arg0.anInt2839, arg0.anInt2840);
			return;
		}
		@Pc(884) byte local884;
		if (local7 == -1) {
			local884 = Static27.aByteArray4[arg2];
		} else {
			local884 = local7;
		}
		Static182.method3446(arg0, local884);
		arg0.method2705(arg0.anInt2840, arg0.anInt2839, local884);
	}
}
