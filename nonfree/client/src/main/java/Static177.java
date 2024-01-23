import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
	public static int anInt3841;

	@OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
	public static int anInt3842;

	@OriginalMember(owner = "client!qj", name = "Y", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1048 = Static231.method3737("Loading)3)3)3");

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1047 = aClass107_1048;

	@OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
	public static int anInt3840 = -1;

	@OriginalMember(owner = "client!qj", name = "S", descriptor = "[I")
	public static int[] anIntArray333 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!qj", name = "T", descriptor = "[I")
	public static int[] anIntArray334 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
	public static int anInt3843 = 0;

	@OriginalMember(owner = "client!qj", name = "Z", descriptor = "[I")
	public static int[] anIntArray335 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!ed;IB)V")
	public static void method2802(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub5_Sub1 arg1, @OriginalArg(2) int arg2) {
		if ((arg0 & 0x20) != 0) {
			arg1.aClass107_826 = Static194.aClass1_Sub26_Sub1_3.method2978();
			if (arg1.aClass107_826.method3086(0) == 126) {
				arg1.aClass107_826 = arg1.aClass107_826.method3084(1);
				Static136.method2282(arg1.aClass107_826, 2, arg1.method1018());
			} else if (Static204.aClass5_Sub5_Sub1_2 == arg1) {
				Static136.method2282(arg1.aClass107_826, 2, arg1.method1018());
			}
			arg1.anInt3012 = 0;
			arg1.anInt3017 = 0;
			arg1.anInt2998 = 150;
		}
		@Pc(73) int local73;
		if ((arg0 & 0x400) != 0) {
			arg1.anInt3045 = Static194.aClass1_Sub26_Sub1_3.method2977();
			local73 = Static194.aClass1_Sub26_Sub1_3.method2960();
			arg1.anInt3029 = (local73 & 0xFFFF) + Static128.anInt2802;
			if (arg1.anInt3045 == 65535) {
				arg1.anInt3045 = -1;
			}
			arg1.anInt3043 = local73 >> 16;
			arg1.anInt3050 = 0;
			arg1.anInt3038 = 0;
			if (arg1.anInt3029 > Static128.anInt2802) {
				arg1.anInt3038 = -1;
			}
		}
		if ((arg0 & 0x100) != 0) {
			arg1.anInt3033 = Static194.aClass1_Sub26_Sub1_3.method2968();
			arg1.anInt3015 = Static194.aClass1_Sub26_Sub1_3.method2968();
			arg1.anInt3014 = Static194.aClass1_Sub26_Sub1_3.method2945();
			arg1.anInt3018 = Static194.aClass1_Sub26_Sub1_3.method2945();
			arg1.anInt3042 = Static194.aClass1_Sub26_Sub1_3.method2987() + Static128.anInt2802;
			arg1.anInt3024 = Static194.aClass1_Sub26_Sub1_3.method2987() + Static128.anInt2802;
			arg1.anInt3003 = Static194.aClass1_Sub26_Sub1_3.method2945();
			arg1.anInt3006 = 1;
			arg1.anInt3041 = 0;
		}
		@Pc(172) int local172;
		if ((arg0 & 0x200) != 0) {
			local73 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local172 = Static194.aClass1_Sub26_Sub1_3.method2945();
			arg1.method2312(local172, local73, Static128.anInt2802);
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt3011 = Static194.aClass1_Sub26_Sub1_3.method2983();
			arg1.anInt3026 = Static194.aClass1_Sub26_Sub1_3.method2987();
		}
		if ((arg0 & 0x8) != 0) {
			local73 = Static194.aClass1_Sub26_Sub1_3.method2972();
			@Pc(213) byte[] local213 = new byte[local73];
			@Pc(218) Class1_Sub26 local218 = new Class1_Sub26(local213);
			Static194.aClass1_Sub26_Sub1_3.method2961(local213, local73);
			Static29.aClass1_Sub26Array1[arg2] = local218;
			arg1.method1017(local218);
		}
		if ((arg0 & 0x2) != 0) {
			local73 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local172 = Static194.aClass1_Sub26_Sub1_3.method2942();
			arg1.method2312(local172, local73, Static128.anInt2802);
			arg1.anInt3010 = Static128.anInt2802 + 300;
			arg1.anInt3051 = Static194.aClass1_Sub26_Sub1_3.method2968();
		}
		if ((arg0 & 0x1) != 0) {
			local73 = Static194.aClass1_Sub26_Sub1_3.method2987();
			if (local73 == 65535) {
				local73 = -1;
			}
			local172 = Static194.aClass1_Sub26_Sub1_3.method2968();
			Static104.method2404(local73, arg1, local172);
		}
		if ((arg0 & 0x10) != 0) {
			arg1.anInt3025 = Static194.aClass1_Sub26_Sub1_3.method2987();
			if (arg1.anInt3025 == 65535) {
				arg1.anInt3025 = -1;
			}
		}
		if ((arg0 & 0x4) == 0) {
			return;
		}
		local73 = Static194.aClass1_Sub26_Sub1_3.method2987();
		local172 = Static194.aClass1_Sub26_Sub1_3.method2968();
		@Pc(325) int local325 = Static194.aClass1_Sub26_Sub1_3.method2972();
		@Pc(336) boolean local336 = (local73 & 0x8000) != 0;
		@Pc(339) int local339 = Static194.aClass1_Sub26_Sub1_3.anInt4021;
		if (arg1.aClass107_351 != null && arg1.aClass56_10 != null) {
			@Pc(350) long local350 = arg1.aClass107_351.method3066();
			@Pc(352) boolean local352 = false;
			if (local172 <= 1) {
				if (!local336 && (Static49.anInt1281 == 1 || Static99.anInt929 == 1)) {
					local352 = true;
				} else {
					for (@Pc(373) int local373 = 0; local373 < Static174.anInt3793; local373++) {
						if (Static201.aLongArray7[local373] == local350) {
							local352 = true;
							break;
						}
					}
				}
			}
			if (!local352 && Static97.anInt2101 == 0) {
				Static39.aClass1_Sub26_1.anInt4021 = 0;
				Static194.aClass1_Sub26_Sub1_3.method2956(local325, Static39.aClass1_Sub26_1.aByteArray52);
				Static39.aClass1_Sub26_1.anInt4021 = 0;
				@Pc(415) int local415 = -1;
				@Pc(434) Class107 local434;
				if (local336) {
					local73 &= 0x7FFF;
					@Pc(425) Class77 local425 = Static191.method3125(Static39.aClass1_Sub26_1);
					local415 = local425.anInt2811;
					local434 = local425.aClass1_Sub2_Sub10_1.method1719(Static39.aClass1_Sub26_1);
				} else {
					local434 = Static164.method3329(Static94.method1586(Static39.aClass1_Sub26_1).method3087());
				}
				arg1.aClass107_826 = local434.method3101();
				arg1.anInt3012 = local73 >> 8;
				arg1.anInt2998 = 150;
				arg1.anInt3017 = local73 & 0xFF;
				if (local172 == 2) {
					Static174.method2775(null, Static149.method2437(new Class107[] { Static185.aClass107_1330, arg1.method1018() }), local434, local336 ? 17 : 1, local415);
				} else if (local172 == 1) {
					Static174.method2775(null, Static149.method2437(new Class107[] { Static29.aClass107_203, arg1.method1018() }), local434, local336 ? 17 : 1, local415);
				} else {
					Static174.method2775(null, arg1.method1018(), local434, local336 ? 17 : 2, local415);
				}
			}
		}
		Static194.aClass1_Sub26_Sub1_3.anInt4021 = local339 + local325;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)Lclient!fb;")
	public static Class1_Sub1 method2807(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub4();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub13_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub13();
		} else {
			return null;
		}
	}
}
