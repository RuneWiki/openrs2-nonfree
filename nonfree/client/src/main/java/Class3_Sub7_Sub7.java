import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class3_Sub7_Sub7 extends Class3_Sub7 {

	@OriginalMember(owner = "client!fv", name = "U", descriptor = "[I")
	private final int[] anIntArray141;

	@OriginalMember(owner = "client!fv", name = "P", descriptor = "[I")
	private final int[] anIntArray140;

	@OriginalMember(owner = "client!fv", name = "X", descriptor = "Lclient!ng;")
	private final Class3_Sub6 aClass3_Sub6_3;

	@OriginalMember(owner = "client!fv", name = "J", descriptor = "Lclient!ng;")
	private final Class3_Sub6 aClass3_Sub6_2;

	@OriginalMember(owner = "client!fv", name = "I", descriptor = "Lclient!ng;")
	private final Class3_Sub6 aClass3_Sub6_1;

	@OriginalMember(owner = "client!fv", name = "M", descriptor = "[Lclient!ng;")
	private final Class3_Sub6[] aClass3_Sub6Array12;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	private Class3_Sub7_Sub7() {
		this.anIntArray141 = new int[0];
		this.anIntArray140 = new int[0];
		this.aClass3_Sub6_3 = new Class3_Sub6_Sub9(0);
		this.aClass3_Sub6_3.anInt10200 = 1;
		this.aClass3_Sub6_2 = new Class3_Sub6_Sub9();
		this.aClass3_Sub6_2.anInt10200 = 1;
		this.aClass3_Sub6_1 = new Class3_Sub6_Sub9();
		this.aClass3_Sub6_1.anInt10200 = 1;
		this.aClass3_Sub6Array12 = new Class3_Sub6[] { this.aClass3_Sub6_2, this.aClass3_Sub6_1, this.aClass3_Sub6_3 };
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class3_Sub7_Sub7(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(7) int local7 = arg0.method6814();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass3_Sub6Array12 = new Class3_Sub6[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub6 local26 = Static72.method1742(arg0);
			if (local26.method8008() >= 0) {
				local9++;
			}
			if (local26.method8007() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass3_Sub6Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method6814();
			}
			this.aClass3_Sub6Array12[local20] = local26;
		}
		this.anIntArray140 = new int[local9];
		this.anIntArray141 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class3_Sub6 local102 = this.aClass3_Sub6Array12[local95];
			local50 = local102.aClass3_Sub6Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass3_Sub6Array42[local108] = this.aClass3_Sub6Array12[local14[local95][local108]];
			}
			@Pc(134) int local134 = local102.method8008();
			@Pc(138) int local138 = local102.method8007();
			if (local134 > 0) {
				this.anIntArray140[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray141[local11++] = local138;
			}
			local14[local95] = null;
		}
		this.aClass3_Sub6_2 = this.aClass3_Sub6Array12[arg0.method6814()];
		this.aClass3_Sub6_1 = this.aClass3_Sub6Array12[arg0.method6814()];
		this.aClass3_Sub6_3 = this.aClass3_Sub6Array12[arg0.method6814()];
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!ri;IILclient!fa;Z)[F")
	public float[] method2921(@OriginalArg(0) int arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) boolean arg4) {
		Static188.aClass284_56 = arg1;
		Static246.anInterface4_7 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub6Array12.length; local11++) {
			this.aClass3_Sub6Array12[local11].method8004(arg0, arg2);
		}
		Static15.method152(arg2, arg0);
		@Pc(42) float[] local42 = new float[arg0 * 4 * arg2];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg2; local46++) {
			@Pc(70) int[] local70;
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			if (this.aClass3_Sub6_2.aBoolean720) {
				@Pc(78) int[] local78 = this.aClass3_Sub6_2.method8009(local46);
				local66 = local78;
				local62 = local78;
				local70 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass3_Sub6_2.method8006(local46);
				local62 = local58[1];
				local66 = local58[2];
				local70 = local58[0];
			}
			@Pc(96) int[] local96;
			if (this.aClass3_Sub6_1.aBoolean720) {
				local96 = this.aClass3_Sub6_1.method8009(local46);
			} else {
				local96 = this.aClass3_Sub6_1.method8006(local46)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass3_Sub6_3.aBoolean720) {
				local116 = this.aClass3_Sub6_3.method8009(local46);
			} else {
				local116 = this.aClass3_Sub6_3.method8006(local46)[0];
			}
			if (arg4) {
				local44 = local46 << 2;
			}
			for (@Pc(136) int local136 = arg0 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(172) float local172 = ((float) local116[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local70[local136] * local172;
				local42[local44++] = local172 * (float) local62[local136];
				local42[local44++] = local172 * (float) local66[local136];
				local42[local44++] = local145;
				if (arg4) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass3_Sub6Array12.length; local233++) {
			this.aClass3_Sub6Array12[local233].method8002();
		}
		return local42;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!fa;DBZILclient!ri;)[I")
	public int[] method2922(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class284 arg5) {
		Static188.aClass284_56 = arg5;
		Static246.anInterface4_7 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub6Array12.length; local11++) {
			this.aClass3_Sub6Array12[local11].method8004(arg0, arg4);
		}
		Static196.method3427(arg2);
		Static15.method152(arg4, arg0);
		@Pc(45) int[] local45 = new int[arg0 * 4 * arg4];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg4; local49++) {
			@Pc(63) int[] local63;
			@Pc(65) int[] local65;
			@Pc(67) int[] local67;
			@Pc(61) int[] local61;
			if (this.aClass3_Sub6_2.aBoolean720) {
				local61 = this.aClass3_Sub6_2.method8009(local49);
				local63 = local61;
				local65 = local61;
				local67 = local61;
			} else {
				@Pc(75) int[][] local75 = this.aClass3_Sub6_2.method8006(local49);
				local65 = local75[1];
				local67 = local75[2];
				local63 = local75[0];
			}
			if (arg3) {
				local47 = local49;
			}
			if (this.aClass3_Sub6_1.aBoolean720) {
				local61 = this.aClass3_Sub6_1.method8009(local49);
			} else {
				local61 = this.aClass3_Sub6_1.method8006(local49)[0];
			}
			for (@Pc(115) int local115 = arg0 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local63[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(141) int local141 = local65[local115] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(156) int local156 = local67[local115] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local141 = Static191.anIntArray176[local141];
				if (local156 < 0) {
					local156 = 0;
				}
				local123 = Static191.anIntArray176[local123];
				local156 = Static191.anIntArray176[local156];
				@Pc(197) int local197;
				if (local123 == 0 && local141 == 0 && local156 == 0) {
					local197 = 0;
				} else {
					local197 = local61[local115] >> 4;
					if (local197 > 255) {
						local197 = 255;
					}
					if (local197 < 0) {
						local197 = 0;
					}
				}
				local45[local47++] = (local141 << 8) + ((local197 << 24) + (local123 << 16)) + local156;
				if (arg3) {
					local47 += arg0 - 1;
				}
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.aClass3_Sub6Array12.length; local253++) {
			this.aClass3_Sub6Array12[local253].method8002();
		}
		return local45;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ri;ZLclient!fa;)Z")
	public boolean method2923(@OriginalArg(0) Class284 arg0, @OriginalArg(2) Interface4 arg1) {
		@Pc(9) int local9;
		if (Static290.anInt5403 < 0) {
			for (local9 = 0; local9 < this.anIntArray140.length; local9++) {
				if (!arg0.method6347(this.anIntArray140[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray140.length; local9++) {
				if (!arg0.method6336(Static290.anInt5403, this.anIntArray140[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray141.length; local9++) {
			if (!arg1.method7227(this.anIntArray141[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ri;ZIDIILclient!fa;Z)[I")
	public int[] method2926(@OriginalArg(0) Class284 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface4 arg5, @OriginalArg(7) boolean arg6) {
		Static188.aClass284_56 = arg0;
		Static246.anInterface4_7 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub6Array12.length; local11++) {
			this.aClass3_Sub6Array12[local11].method8004(arg2, arg4);
		}
		Static196.method3427(arg3);
		Static15.method152(arg4, arg2);
		@Pc(45) int[] local45 = new int[arg2 * arg4];
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(53) byte local53;
		if (arg6) {
			local51 = arg2 - 1;
			local53 = -1;
			local55 = -1;
		} else {
			local55 = arg2;
			local53 = 1;
			local51 = 0;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg4; local67++) {
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			@Pc(91) int[] local91;
			if (this.aClass3_Sub6_2.aBoolean720) {
				@Pc(99) int[] local99 = this.aClass3_Sub6_2.method8009(local67);
				local91 = local99;
				local83 = local99;
				local87 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass3_Sub6_2.method8006(local67);
				local83 = local79[0];
				local87 = local79[1];
				local91 = local79[2];
			}
			if (arg1) {
				local65 = local67;
			}
			for (@Pc(111) int local111 = local51; local111 != local55; local111 += local53) {
				@Pc(119) int local119 = local83[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(136) int local136 = local87[local111] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(151) int local151 = local91[local111] >> 4;
				if (local151 > 255) {
					local151 = 255;
				}
				local136 = Static191.anIntArray176[local136];
				if (local151 < 0) {
					local151 = 0;
				}
				local119 = Static191.anIntArray176[local119];
				local151 = Static191.anIntArray176[local151];
				@Pc(182) int local182 = local151 + (local136 << 8) + (local119 << 16);
				if (local182 != 0) {
					local182 |= 0xFF000000;
				}
				local45[local65++] = local182;
				if (arg1) {
					local65 += arg2 - 1;
				}
			}
		}
		for (@Pc(218) int local218 = 0; local218 < this.aClass3_Sub6Array12.length; local218++) {
			this.aClass3_Sub6Array12[local218].method8002();
		}
		return local45;
	}
}
