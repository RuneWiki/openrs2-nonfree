import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aba", name = "H", descriptor = "I")
	public static int anInt63;

	@OriginalMember(owner = "client!aba", name = "Z", descriptor = "Lclient!nfa;")
	public static Class228 aClass228_1;

	@OriginalMember(owner = "client!aba", name = "B", descriptor = "[Lclient!fd;")
	public static final Class3_Sub7[] aClass3_Sub7Array1 = new Class3_Sub7[2048];

	@OriginalMember(owner = "client!aba", name = "C", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_1 = new Class276(79, 2);

	@OriginalMember(owner = "client!aba", name = "W", descriptor = "Lclient!fs;")
	public static final Class109 aClass109_1 = new Class109("WTQA", 2);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIII)V")
	public static void method122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg2;
		@Pc(18) int local18 = -arg2;
		Static426.method6794(arg2 + arg3, Static333.anIntArrayArray56[arg0], arg3 - arg2, arg1);
		@Pc(33) int local33 = -1;
		while (local7 < local15) {
			local33 += 2;
			local7++;
			local18 += local33;
			if (local18 >= 0) {
				local15--;
				local18 -= local15 << 1;
				@Pc(59) int[] local59 = Static333.anIntArrayArray56[local15 + arg0];
				@Pc(66) int[] local66 = Static333.anIntArrayArray56[arg0 - local15];
				@Pc(71) int local71 = arg3 + local7;
				@Pc(76) int local76 = arg3 - local7;
				Static426.method6794(local71, local59, local76, arg1);
				Static426.method6794(local71, local66, local76, arg1);
			}
			@Pc(92) int local92 = local15 + arg3;
			@Pc(96) int local96 = arg3 - local15;
			@Pc(102) int[] local102 = Static333.anIntArrayArray56[arg0 + local7];
			@Pc(109) int[] local109 = Static333.anIntArrayArray56[arg0 - local7];
			Static426.method6794(local92, local102, local96, arg1);
			Static426.method6794(local92, local109, local96, arg1);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIFIFFFFLclient!jr;II[BI)V")
	public static void method123(@OriginalArg(2) int arg0, @OriginalArg(3) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) Class175 arg6, @OriginalArg(11) int arg7, @OriginalArg(12) byte[] arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(15) int local15;
		@Pc(41) int local41;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			local15 = arg7;
			arg6.method6586(arg2 / (float) 16, local10, 0, arg0, arg1 / (float) 128, arg5 / (float) 128, arg4 * 127.0F);
			for (local41 = 0; local41 < 16384; local41++) {
				arg8[local15] = (byte) ((float) arg8[local15] + local10[local41]);
				local15++;
			}
			arg4 *= arg3;
			arg1 *= 2.0F;
			arg2 *= 2.0F;
			arg5 *= 2.0F;
		}
		local15 = arg7;
		for (local41 = 0; local41 < 16384; local41++) {
			arg8[local15] = (byte) (arg8[local15] + 127);
			local15++;
		}
	}

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "(B)V")
	public static void method124() {
		if (Static197.anInterface24Array1 == null) {
			return;
		}
		@Pc(15) Interface24[] local15 = Static197.anInterface24Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(22) Interface24 local22 = local15[local17];
			local22.method6802();
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(JI)V")
	public static void method125(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static338.method5799(arg0 - 1L);
			Static338.method5799(1L);
		} else {
			Static338.method5799(arg0);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIILclient!wk;I)V")
	public static void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class171 local7 = arg2.method6316();
		@Pc(17) int local17 = arg2.anInt7592 - arg2.aClass358_7.anInt10350 & 0x3FFF;
		if (arg1 == -1) {
			if (local17 != 0 || arg2.anInt7626 > 25) {
				if (arg3 < 0 && local7.anInt5077 != -1) {
					arg2.anInt7655 = local7.anInt5077;
				} else if (arg3 <= 0 || local7.anInt5118 == -1) {
					arg2.anInt7655 = local7.anInt5101;
				} else {
					arg2.anInt7655 = local7.anInt5118;
				}
				arg2.aBoolean645 = false;
			} else if (!arg2.aBoolean645 || !local7.method4289(arg2.anInt7655)) {
				arg2.anInt7655 = local7.method4287();
				arg2.aBoolean645 = arg2.anInt7655 != -1;
			}
		} else if (arg2.anInt7634 != -1 && (local17 >= 10240 || local17 <= 2048)) {
			@Pc(113) int local113 = Static300.anIntArray466[arg0] - arg2.aClass358_7.anInt10350 & 0x3FFF;
			arg2.aBoolean645 = false;
			if (arg1 == 2 && local7.anInt5079 != -1) {
				if (local113 > 2048 && local113 <= 6144 && local7.anInt5094 != -1) {
					arg2.anInt7655 = local7.anInt5094;
				} else if (local113 >= 10240 && local113 < 14336 && local7.anInt5113 != -1) {
					arg2.anInt7655 = local7.anInt5113;
				} else if (local113 <= 6144 || local113 >= 10240 || local7.anInt5082 == -1) {
					arg2.anInt7655 = local7.anInt5079;
				} else {
					arg2.anInt7655 = local7.anInt5082;
				}
			} else if (arg1 == 0 && local7.anInt5115 != -1) {
				if (local113 > 2048 && local113 <= 6144 && local7.anInt5117 != -1) {
					arg2.anInt7655 = local7.anInt5117;
				} else if (local113 >= 10240 && local113 < 14336 && local7.anInt5104 != -1) {
					arg2.anInt7655 = local7.anInt5104;
				} else if (local113 <= 6144 || local113 >= 10240 || local7.anInt5080 == -1) {
					arg2.anInt7655 = local7.anInt5115;
				} else {
					arg2.anInt7655 = local7.anInt5080;
				}
			} else if (local113 > 2048 && local113 <= 6144 && local7.anInt5087 != -1) {
				arg2.anInt7655 = local7.anInt5087;
			} else if (local113 >= 10240 && local113 < 14336 && local7.anInt5092 != -1) {
				arg2.anInt7655 = local7.anInt5092;
			} else if (local113 <= 6144 || local113 >= 10240 || local7.anInt5106 == -1) {
				arg2.anInt7655 = local7.anInt5101;
			} else {
				arg2.anInt7655 = local7.anInt5106;
			}
		} else if (local17 == 0 && arg2.anInt7626 <= 25) {
			if (arg1 == 2 && local7.anInt5079 != -1) {
				arg2.anInt7655 = local7.anInt5079;
			} else if (arg1 == 0 && local7.anInt5115 != -1) {
				arg2.anInt7655 = local7.anInt5115;
			} else {
				arg2.anInt7655 = local7.anInt5101;
			}
			arg2.aBoolean645 = false;
		} else {
			arg2.aBoolean645 = false;
			if (arg1 == 2 && local7.anInt5079 != -1) {
				if (arg3 < 0 && local7.anInt5081 != -1) {
					arg2.anInt7655 = local7.anInt5081;
				} else if (arg3 <= 0 || local7.anInt5083 == -1) {
					arg2.anInt7655 = local7.anInt5079;
				} else {
					arg2.anInt7655 = local7.anInt5083;
				}
			} else if (arg1 == 0 && local7.anInt5115 != -1) {
				if (arg3 < 0 && local7.anInt5114 != -1) {
					arg2.anInt7655 = local7.anInt5114;
				} else if (arg3 <= 0 || local7.anInt5116 == -1) {
					arg2.anInt7655 = local7.anInt5115;
				} else {
					arg2.anInt7655 = local7.anInt5116;
				}
			} else if (arg3 < 0 && local7.anInt5107 != -1) {
				arg2.anInt7655 = local7.anInt5107;
			} else if (arg3 <= 0 || local7.anInt5111 == -1) {
				arg2.anInt7655 = local7.anInt5101;
			} else {
				arg2.anInt7655 = local7.anInt5111;
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!ji;B)V")
	public static void method127(@OriginalArg(0) Class15_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static10.anObject1 == null) {
			@Pc(5) Class73_Sub1_Sub2 local5 = new Class73_Sub1_Sub2();
			local12 = local5.method2216();
			Static10.anObject1 = Static499.method7539(local12);
		}
		if (Static520.anObject17 == null) {
			@Pc(27) Class73_Sub2_Sub1 local27 = new Class73_Sub2_Sub1();
			local12 = local27.method4494();
			Static520.anObject17 = Static499.method7539(local12);
		}
		@Pc(46) Class124 local46 = arg0.aClass124_1;
		if (local46.method3094() && Static435.anObject15 == null) {
			local12 = Static129.method8415(0.5F, 4.0F, 4.0F, 0.6F, 16.0F, new Class175_Sub1(419684));
			Static435.anObject15 = Static499.method7539(local12);
		}
	}
}
