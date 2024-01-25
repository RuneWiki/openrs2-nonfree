import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "Lclient!ji;")
	public static Class159 aClass159_2;

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "Z")
	public static boolean aBoolean222;

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "[Lclient!lp;")
	public static Class194[] aClass194Array1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "[I")
	public static final int[] anIntArray221 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_40 = new Class45(32, 7);

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/lang/String;Z)I")
	public static int method2466(@OriginalArg(1) String arg0) {
		return Static468.method7048(arg0, 16);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!bea;IILclient!nj;I)V")
	public static void method2467(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class12_Sub8_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg3 & 0x100) != 0) {
			local7 = arg2.method5222();
		}
		if ((arg3 & 0x2000) != 0) {
			arg0.anInt4149 = arg2.method5168();
			arg0.anInt4163 = arg2.method5209();
			arg0.anInt4180 = arg2.method5173();
			arg0.anInt4162 = arg2.method5222();
			arg0.anInt4141 = arg2.method5204() + Static409.anInt7683;
			arg0.anInt4148 = arg2.method5198() + Static409.anInt7683;
			arg0.anInt4173 = arg2.method5177();
			arg0.anInt4203 = 0;
			if (arg0.aBoolean41) {
				arg0.anInt4180 += arg0.anInt758;
				arg0.anInt4162 += arg0.anInt738;
				arg0.anInt4163 += arg0.anInt738;
				arg0.anInt4149 += arg0.anInt758;
				arg0.anInt4201 = 0;
			} else {
				arg0.anInt4201 = 1;
				arg0.anInt4180 += arg0.anIntArray316[0];
				arg0.anInt4149 += arg0.anIntArray316[0];
				arg0.anInt4162 += arg0.anIntArray317[0];
				arg0.anInt4163 += arg0.anIntArray317[0];
			}
		}
		@Pc(149) int local149;
		if ((arg3 & 0x40000) != 0) {
			local149 = arg2.method5184();
			@Pc(152) int[] local152 = new int[local149];
			@Pc(155) int[] local155 = new int[local149];
			@Pc(158) int[] local158 = new int[local149];
			for (@Pc(160) int local160 = 0; local160 < local149; local160++) {
				@Pc(166) int local166 = arg2.method5199();
				if (local166 == 65535) {
					local166 = -1;
				}
				local152[local160] = local166;
				local155[local160] = arg2.method5202();
				local158[local160] = arg2.method5198();
			}
			Static329.method5248(arg0, local155, local152, local158);
		}
		if ((arg3 & 0x4) != 0) {
			local149 = arg2.method5199();
			if (local149 == 65535) {
				local149 = -1;
			}
			arg0.anInt4135 = local149;
		}
		if ((arg3 & 0x20000) != 0) {
			arg0.aByte60 = arg2.method5209();
			arg0.aByte59 = arg2.method5168();
			arg0.aByte58 = arg2.method5222();
			arg0.aByte57 = (byte) arg2.method5184();
			arg0.anInt4139 = Static409.anInt7683 + arg2.method5199();
			arg0.anInt4198 = Static409.anInt7683 + arg2.method5204();
		}
		if ((arg3 & 0x200) != 0) {
			local149 = arg2.method5204();
			arg0.anInt4133 = arg2.method5177();
			arg0.anInt4128 = arg2.method5216();
			arg0.aBoolean336 = (local149 & 0x8000) != 0;
			arg0.anInt4129 = local149 & 0x7FFF;
			arg0.anInt4137 = Static409.anInt7683 + arg0.anInt4129 + arg0.anInt4133;
		}
		if ((arg3 & 0x40) != 0) {
			arg0.anInt746 = arg2.method5204();
			if (arg0.anInt4201 == 0) {
				arg0.method3601(arg0.anInt746);
				arg0.anInt746 = -1;
			}
		}
		if ((arg3 & 0x8) != 0) {
			Static219.aByteArray58[arg1] = arg2.method5222();
		}
		@Pc(361) int local361;
		if ((arg3 & 0x20) != 0) {
			local149 = arg2.method5218();
			local361 = arg2.method5202();
			arg0.method3603(Static409.anInt7683, local149, local361);
			arg0.anInt4144 = Static409.anInt7683 + 300;
			arg0.anInt4165 = arg2.method5216();
		}
		if ((arg3 & 0x4000) != 0) {
			arg0.aBoolean43 = arg2.method5184() == 1;
		}
		@Pc(410) int local410;
		if ((arg3 & 0x400) != 0) {
			local149 = Static409.anInt7683;
			local361 = arg2.method5218();
			local410 = arg2.method5202();
			arg0.method3603(local149, local361, local410);
		}
		if ((arg3 & 0x1) != 0) {
			local149 = arg2.method5184();
			@Pc(427) byte[] local427 = new byte[local149];
			@Pc(432) Class12_Sub8 local432 = new Class12_Sub8(local427);
			arg2.method5228(local427, local149);
			Static494.aClass12_Sub8Array1[arg1] = local432;
			arg0.method784(local432);
		}
		if ((arg3 & 0x800) != 0) {
			local149 = arg2.method5199();
			local361 = arg2.method5186();
			if (local149 == 65535) {
				local149 = -1;
			}
			local410 = arg2.method5177();
			arg0.method3589(false, local410, local149, local361);
		}
		if ((arg3 & 0x8000) != 0) {
			arg0.aString38 = arg2.method5206();
			if (arg0.aString38.charAt(0) == '~') {
				arg0.aString38 = arg0.aString38.substring(1);
				Static406.method6373(arg0.method780(), 2, 0, arg0.method778(), arg0.aString38);
			} else if (Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0) {
				Static406.method6373(arg0.method780(), 2, 0, arg0.method778(), arg0.aString38);
			}
			arg0.anInt4160 = 0;
			arg0.anInt4175 = 0;
			arg0.anInt4170 = 150;
		}
		if ((arg3 & 0x2) != 0) {
			local149 = arg2.method5204();
			local361 = arg2.method5184();
			local410 = arg2.method5202();
			@Pc(562) int local562 = arg2.anInt6217;
			@Pc(573) boolean local573 = (local149 & 0x8000) != 0;
			if (arg0.aString6 != null && arg0.aClass58_1 != null) {
				@Pc(581) boolean local581 = false;
				if (local361 <= 1) {
					if (!local573 && (Static451.aBoolean358 && !Static163.aBoolean313 || Static541.aBoolean683)) {
						local581 = true;
					} else if (Static303.method4926(arg0.aString6)) {
						local581 = true;
					}
				}
				if (!local581 && Static339.anInt6471 == 0) {
					Static222.aClass12_Sub8_4.anInt6217 = 0;
					arg2.method5181(local410, Static222.aClass12_Sub8_4.aByteArray82);
					Static222.aClass12_Sub8_4.anInt6217 = 0;
					@Pc(624) int local624 = -1;
					@Pc(643) String local643;
					if (local573) {
						local149 &= 0x7FFF;
						@Pc(634) Class270 local634 = Static407.method6384(Static222.aClass12_Sub8_4);
						local624 = local634.anInt8103;
						local643 = local634.aClass12_Sub4_Sub17_1.method6771(Static222.aClass12_Sub8_4);
					} else {
						local643 = Static440.method6680(Static68.method1561(Static222.aClass12_Sub8_4));
					}
					arg0.aString38 = local643.trim();
					arg0.anInt4170 = 150;
					arg0.anInt4160 = local149 & 0xFF;
					arg0.anInt4175 = local149 >> 8;
					@Pc(682) int local682;
					if (local361 == 1 || local361 == 2) {
						local682 = local573 ? 17 : 1;
					} else {
						local682 = local573 ? 17 : 2;
					}
					if (local361 == 2) {
						Static36.method6954(0, "<img=1>" + arg0.method778(), local624, local682, null, local643, "<img=1>" + arg0.method780());
					} else if (local361 == 1) {
						Static36.method6954(0, "<img=0>" + arg0.method778(), local624, local682, null, local643, "<img=0>" + arg0.method780());
					} else {
						Static36.method6954(0, arg0.method778(), local624, local682, null, local643, arg0.method780());
					}
				}
			}
			arg2.anInt6217 = local410 + local562;
		}
		if ((arg3 & 0x10) != 0) {
			local149 = arg2.method5198();
			if (local149 == 65535) {
				local149 = -1;
			}
			local361 = arg2.method5177();
			Static138.method2812(arg0, local361, local149);
		}
		if ((arg3 & 0x10000) != 0) {
			local149 = arg2.method5199();
			local361 = arg2.method5213();
			if (local149 == 65535) {
				local149 = -1;
			}
			local410 = arg2.method5202();
			arg0.method3589(true, local410, local149, local361);
		}
		if (!arg0.aBoolean41) {
			return;
		}
		if (local7 == 127) {
			arg0.method782(arg0.anInt758, arg0.anInt738);
			return;
		}
		@Pc(848) byte local848;
		if (local7 == -1) {
			local848 = Static219.aByteArray58[arg1];
		} else {
			local848 = local7;
		}
		arg0.method779(local848, arg0.anInt758, arg0.anInt738);
	}
}
