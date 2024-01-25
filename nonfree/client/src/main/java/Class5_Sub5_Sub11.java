import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class5_Sub5_Sub11 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "[I")
	private final int[] anIntArray247;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "[I")
	private final int[] anIntArray248;

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "Lclient!rfa;")
	private final Class5_Sub1 aClass5_Sub1_3;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "Lclient!rfa;")
	private final Class5_Sub1 aClass5_Sub1_2;

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "Lclient!rfa;")
	private final Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "[Lclient!rfa;")
	private final Class5_Sub1[] aClass5_Sub1Array13;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	private Class5_Sub5_Sub11() {
		this.anIntArray247 = new int[0];
		this.anIntArray248 = new int[0];
		this.aClass5_Sub1_3 = new Class5_Sub1_Sub30(0);
		this.aClass5_Sub1_3.anInt10698 = 1;
		this.aClass5_Sub1_2 = new Class5_Sub1_Sub30();
		this.aClass5_Sub1_2.anInt10698 = 1;
		this.aClass5_Sub1_1 = new Class5_Sub1_Sub30();
		this.aClass5_Sub1Array13 = new Class5_Sub1[] { this.aClass5_Sub1_2, this.aClass5_Sub1_1, this.aClass5_Sub1_3 };
		this.aClass5_Sub1_1.anInt10698 = 1;
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class5_Sub5_Sub11(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(7) int local7 = arg0.method8529();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass5_Sub1Array13 = new Class5_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(57) int local57;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub1 local26 = Static678.method9309(arg0);
			if (local26.method9202() >= 0) {
				local9++;
			}
			if (local26.method9211() >= 0) {
				local11++;
			}
			@Pc(50) int local50 = local26.aClass5_Sub1Array42.length;
			local18[local20] = new int[local50];
			for (local57 = 0; local57 < local50; local57++) {
				local18[local20][local57] = arg0.method8529();
			}
			this.aClass5_Sub1Array13[local20] = local26;
		}
		this.anIntArray248 = new int[local9];
		local9 = 0;
		this.anIntArray247 = new int[local11];
		local11 = 0;
		for (@Pc(104) int local104 = 0; local104 < local7; local104++) {
			@Pc(113) Class5_Sub1 local113 = this.aClass5_Sub1Array13[local104];
			local57 = local113.aClass5_Sub1Array42.length;
			for (@Pc(119) int local119 = 0; local119 < local57; local119++) {
				local113.aClass5_Sub1Array42[local119] = this.aClass5_Sub1Array13[local18[local104][local119]];
			}
			@Pc(147) int local147 = local113.method9202();
			@Pc(151) int local151 = local113.method9211();
			if (local147 > 0) {
				this.anIntArray248[local9++] = local147;
			}
			if (local151 > 0) {
				this.anIntArray247[local11++] = local151;
			}
			local18[local104] = null;
		}
		this.aClass5_Sub1_2 = this.aClass5_Sub1Array13[arg0.method8529()];
		this.aClass5_Sub1_1 = this.aClass5_Sub1Array13[arg0.method8529()];
		this.aClass5_Sub1_3 = this.aClass5_Sub1Array13[arg0.method8529()];
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!la;ILclient!d;DIIZZ)[I")
	public int[] method3721(@OriginalArg(0) Class208 arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		Static448.anInterface1_8 = arg1;
		Static587.aClass208_133 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub1Array13.length; local11++) {
			this.aClass5_Sub1Array13[local11].method9213(arg4, arg3);
		}
		Static179.method2590(arg2);
		Static345.method5217(arg4, arg3);
		@Pc(45) int[] local45 = new int[arg4 * arg3];
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(63) byte local63;
		if (arg5) {
			local61 = arg3 - 1;
			local63 = -1;
			local65 = -1;
		} else {
			local63 = 1;
			local61 = 0;
			local65 = arg3;
		}
		@Pc(75) int local75 = 0;
		for (@Pc(77) int local77 = 0; local77 < arg4; local77++) {
			@Pc(103) int[] local103;
			@Pc(99) int[] local99;
			@Pc(95) int[] local95;
			if (this.aClass5_Sub1_2.aBoolean786) {
				@Pc(111) int[] local111 = this.aClass5_Sub1_2.method9212(local77);
				local99 = local111;
				local103 = local111;
				local95 = local111;
			} else {
				@Pc(91) int[][] local91 = this.aClass5_Sub1_2.method9205(local77);
				local95 = local91[2];
				local99 = local91[1];
				local103 = local91[0];
			}
			if (arg6) {
				local75 = local77;
			}
			for (@Pc(123) int local123 = local61; local123 != local65; local123 += local63) {
				@Pc(131) int local131 = local103[local123] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(149) int local149 = local99[local123] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				@Pc(166) int local166 = local95[local123] >> 4;
				if (local166 > 255) {
					local166 = 255;
				}
				local131 = Static449.anIntArray465[local131];
				if (local166 < 0) {
					local166 = 0;
				}
				local149 = Static449.anIntArray465[local149];
				local166 = Static449.anIntArray465[local166];
				@Pc(199) int local199 = local166 + (local131 << 16) + (local149 << 8);
				if (local199 != 0) {
					local199 |= 0xFF000000;
				}
				local45[local75++] = local199;
				if (arg6) {
					local75 += arg3 - 1;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass5_Sub1Array13.length; local237++) {
			this.aClass5_Sub1Array13[local237].method9207();
		}
		return local45;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(DILclient!d;Lclient!la;ZII)[I")
	public int[] method3722(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) Class208 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		Static448.anInterface1_8 = arg2;
		Static587.aClass208_133 = arg3;
		for (@Pc(19) int local19 = 0; local19 < this.aClass5_Sub1Array13.length; local19++) {
			this.aClass5_Sub1Array13[local19].method9213(arg5, arg1);
		}
		Static179.method2590(arg0);
		Static345.method5217(arg5, arg1);
		@Pc(53) int[] local53 = new int[arg5 * arg1];
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < arg5; local57++) {
			@Pc(79) int[] local79;
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			if (this.aClass5_Sub1_2.aBoolean786) {
				local73 = this.aClass5_Sub1_2.method9212(local57);
				local75 = local73;
				local77 = local73;
				local79 = local73;
			} else {
				@Pc(87) int[][] local87 = this.aClass5_Sub1_2.method9205(local57);
				local75 = local87[1];
				local77 = local87[2];
				local79 = local87[0];
			}
			if (arg4) {
				local55 = local57;
			}
			if (this.aClass5_Sub1_1.aBoolean786) {
				local73 = this.aClass5_Sub1_1.method9212(local57);
			} else {
				local73 = this.aClass5_Sub1_1.method9205(local57)[0];
			}
			for (@Pc(127) int local127 = arg1 - 1; local127 >= 0; local127--) {
				@Pc(135) int local135 = local79[local127] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(150) int local150 = local75[local127] >> 4;
				if (local150 > 255) {
					local150 = 255;
				}
				if (local150 < 0) {
					local150 = 0;
				}
				@Pc(165) int local165 = local77[local127] >> 4;
				if (local165 > 255) {
					local165 = 255;
				}
				local135 = Static449.anIntArray465[local135];
				local150 = Static449.anIntArray465[local150];
				if (local165 < 0) {
					local165 = 0;
				}
				local165 = Static449.anIntArray465[local165];
				@Pc(207) int local207;
				if (local135 == 0 && local150 == 0 && local165 == 0) {
					local207 = 0;
				} else {
					local207 = local73[local127] >> 4;
					if (local207 > 255) {
						local207 = 255;
					}
					if (local207 < 0) {
						local207 = 0;
					}
				}
				local53[local55++] = local165 + (local135 << 16) + (local207 << 24) + (local150 << 8);
				if (arg4) {
					local55 += arg1 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass5_Sub1Array13.length; local258++) {
			this.aClass5_Sub1Array13[local258].method9207();
		}
		return local53;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!d;Lclient!la;ZI)[F")
	public float[] method3724(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class208 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		Static587.aClass208_133 = arg2;
		Static448.anInterface1_8 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub1Array13.length; local11++) {
			this.aClass5_Sub1Array13[local11].method9213(arg4, arg0);
		}
		Static345.method5217(arg4, arg0);
		@Pc(44) float[] local44 = new float[arg0 * arg4 * 4];
		@Pc(46) int local46 = 0;
		if (-52 <= -100) {
			this.method3721((Class208) null, (Interface1) null, 0.4971580910332832D, 120, -106, false, false);
		}
		for (@Pc(66) int local66 = 0; local66 < arg4; local66++) {
			@Pc(86) int[] local86;
			@Pc(82) int[] local82;
			@Pc(84) int[] local84;
			if (this.aClass5_Sub1_2.aBoolean786) {
				@Pc(80) int[] local80 = this.aClass5_Sub1_2.method9212(local66);
				local82 = local80;
				local84 = local80;
				local86 = local80;
			} else {
				@Pc(94) int[][] local94 = this.aClass5_Sub1_2.method9205(local66);
				local82 = local94[1];
				local84 = local94[2];
				local86 = local94[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass5_Sub1_1.aBoolean786) {
				local116 = this.aClass5_Sub1_1.method9212(local66);
			} else {
				local116 = this.aClass5_Sub1_1.method9205(local66)[0];
			}
			@Pc(136) int[] local136;
			if (this.aClass5_Sub1_3.aBoolean786) {
				local136 = this.aClass5_Sub1_3.method9212(local66);
			} else {
				local136 = this.aClass5_Sub1_3.method9205(local66)[0];
			}
			if (arg3) {
				local46 = local66 << 2;
			}
			for (@Pc(156) int local156 = arg0 - 1; local156 >= 0; local156--) {
				@Pc(165) float local165 = (float) local116[local156] / 4096.0F;
				if (local165 < 0.0F) {
					local165 = 0.0F;
				} else if (local165 > 1.0F) {
					local165 = 1.0F;
				}
				@Pc(194) float local194 = ((float) local136[local156] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local44[local46++] = (float) local86[local156] * local194;
				local44[local46++] = local194 * (float) local82[local156];
				local44[local46++] = local194 * (float) local84[local156];
				local44[local46++] = local165;
				if (arg3) {
					local46 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.aClass5_Sub1Array13.length; local253++) {
			this.aClass5_Sub1Array13[local253].method9207();
		}
		return local44;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!d;Lclient!la;I)Z")
	public boolean method3725(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class208 arg1) {
		@Pc(12) int local12;
		if (Static396.anInt6780 >= 0) {
			for (local12 = 0; local12 < this.anIntArray248.length; local12++) {
				if (!arg1.method4980(this.anIntArray248[local12], Static396.anInt6780)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray248.length; local12++) {
				if (!arg1.method4977(this.anIntArray248[local12])) {
					return false;
				}
			}
		}
		if (6775 != 6775) {
			Static253.anInt4356 = 16;
		}
		for (local12 = 0; local12 < this.anIntArray247.length; local12++) {
			if (!arg0.method2860(this.anIntArray247[local12])) {
				return false;
			}
		}
		return true;
	}
}
