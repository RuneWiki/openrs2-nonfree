import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class5_Sub9_Sub21 extends Class5_Sub9 {

	@OriginalMember(owner = "client!va", name = "u", descriptor = "[I")
	private final int[] anIntArray532;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "[I")
	private final int[] anIntArray531;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Lclient!ik;")
	private final Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Lclient!ik;")
	private final Class5_Sub2 aClass5_Sub2_2;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "Lclient!ik;")
	private final Class5_Sub2 aClass5_Sub2_3;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "[Lclient!ik;")
	private final Class5_Sub2[] aClass5_Sub2Array39;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	private Class5_Sub9_Sub21() {
		this.anIntArray532 = new int[0];
		this.anIntArray531 = new int[0];
		this.aClass5_Sub2_1 = new Class5_Sub2_Sub17(0);
		this.aClass5_Sub2_1.anInt6591 = 1;
		this.aClass5_Sub2_2 = new Class5_Sub2_Sub17();
		this.aClass5_Sub2_2.anInt6591 = 1;
		this.aClass5_Sub2_3 = new Class5_Sub2_Sub17();
		this.aClass5_Sub2_3.anInt6591 = 1;
		this.aClass5_Sub2Array39 = new Class5_Sub2[] { this.aClass5_Sub2_2, this.aClass5_Sub2_3, this.aClass5_Sub2_1 };
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class5_Sub9_Sub21(@OriginalArg(0) Class5_Sub1 arg0) {
		@Pc(7) int local7 = arg0.method1832();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass5_Sub2Array39 = new Class5_Sub2[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub2 local26 = Static263.method4510(arg0);
			if (local26.method5815() >= 0) {
				local9++;
			}
			if (local26.method5814() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass5_Sub2Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method1832();
			}
			this.aClass5_Sub2Array39[local20] = local26;
		}
		this.anIntArray531 = new int[local9];
		local9 = 0;
		this.anIntArray532 = new int[local11];
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class5_Sub2 local94 = this.aClass5_Sub2Array39[local87];
			local50 = local94.aClass5_Sub2Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass5_Sub2Array42[local100] = this.aClass5_Sub2Array39[local14[local87][local100]];
			}
			@Pc(126) int local126 = local94.method5815();
			@Pc(130) int local130 = local94.method5814();
			if (local126 > 0) {
				this.anIntArray531[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray532[local11++] = local130;
			}
			local14[local87] = null;
		}
		this.aClass5_Sub2_2 = this.aClass5_Sub2Array39[arg0.method1832()];
		this.aClass5_Sub2_3 = this.aClass5_Sub2Array39[arg0.method1832()];
		this.aClass5_Sub2_1 = this.aClass5_Sub2Array39[arg0.method1832()];
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!bm;ILclient!ra;)Z")
	public boolean method5499(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Class170 arg1) {
		@Pc(12) int local12;
		if (Static133.anInt6597 <= 0) {
			for (local12 = 0; local12 < this.anIntArray531.length; local12++) {
				if (!arg1.method4568(this.anIntArray531[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray531.length; local12++) {
				if (!arg1.method4578(this.anIntArray531[local12], Static133.anInt6597)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray532.length; local12++) {
			if (!arg0.method2003(this.anIntArray532[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZLclient!bm;Lclient!ra;)[F")
	public float[] method5500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Interface1 arg3, @OriginalArg(5) Class170 arg4) {
		Static277.aClass170_92 = arg4;
		Static264.anInterface1_4 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array39.length; local11++) {
			this.aClass5_Sub2Array39[local11].method5812(arg1, arg0);
		}
		Static319.method5393(arg0, arg1);
		@Pc(42) float[] local42 = new float[arg1 * 4 * arg0];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(64) int[] local64;
			@Pc(60) int[] local60;
			@Pc(62) int[] local62;
			if (this.aClass5_Sub2_2.aBoolean488) {
				@Pc(58) int[] local58 = this.aClass5_Sub2_2.method5821(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(72) int[][] local72 = this.aClass5_Sub2_2.method5806(local46);
				local60 = local72[1];
				local62 = local72[2];
				local64 = local72[0];
			}
			@Pc(98) int[] local98;
			if (this.aClass5_Sub2_3.aBoolean488) {
				local98 = this.aClass5_Sub2_3.method5821(local46);
			} else {
				local98 = this.aClass5_Sub2_3.method5806(local46)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass5_Sub2_1.aBoolean488) {
				local116 = this.aClass5_Sub2_1.method5821(local46);
			} else {
				local116 = this.aClass5_Sub2_1.method5806(local46)[0];
			}
			if (arg2) {
				local44 = local46 << 2;
			}
			for (@Pc(138) int local138 = arg0 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local98[local138] / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				@Pc(174) float local174 = ((float) local116[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = local174 * (float) local64[local138];
				local42[local44++] = local174 * (float) local60[local138];
				local42[local44++] = (float) local62[local138] * local174;
				local42[local44++] = local147;
				if (arg2) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass5_Sub2Array39.length; local235++) {
			this.aClass5_Sub2Array39[local235].method5807();
		}
		return local42;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(DIILclient!bm;BZLclient!ra;)[I")
	public int[] method5501(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class170 arg5) {
		Static264.anInterface1_4 = arg3;
		Static277.aClass170_92 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array39.length; local11++) {
			this.aClass5_Sub2Array39[local11].method5812(arg2, arg1);
		}
		Static195.method3509(arg0);
		Static319.method5393(arg1, arg2);
		@Pc(51) int[] local51 = new int[arg2 * 4 * arg1];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg2; local55++) {
			@Pc(75) int[] local75;
			@Pc(71) int[] local71;
			@Pc(79) int[] local79;
			@Pc(89) int[] local89;
			if (this.aClass5_Sub2_2.aBoolean488) {
				local89 = this.aClass5_Sub2_2.method5821(local55);
				local71 = local89;
				local75 = local89;
				local79 = local89;
			} else {
				@Pc(67) int[][] local67 = this.aClass5_Sub2_2.method5806(local55);
				local71 = local67[1];
				local75 = local67[0];
				local79 = local67[2];
			}
			if (arg4) {
				local53 = local55;
			}
			if (this.aClass5_Sub2_3.aBoolean488) {
				local89 = this.aClass5_Sub2_3.method5821(local55);
			} else {
				local89 = this.aClass5_Sub2_3.method5806(local55)[0];
			}
			for (@Pc(125) int local125 = arg1 - 1; local125 >= 0; local125--) {
				@Pc(133) int local133 = local75[local125] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(151) int local151 = local71[local125] >> 4;
				if (local151 > 255) {
					local151 = 255;
				}
				if (local151 < 0) {
					local151 = 0;
				}
				@Pc(169) int local169 = local79[local125] >> 4;
				if (local169 > 255) {
					local169 = 255;
				}
				local133 = Static202.anIntArray284[local133];
				local151 = Static202.anIntArray284[local151];
				if (local169 < 0) {
					local169 = 0;
				}
				local169 = Static202.anIntArray284[local169];
				@Pc(207) int local207;
				if (local133 == 0 && local151 == 0 && local169 == 0) {
					local207 = 0;
				} else {
					local207 = local89[local125] >> 4;
					if (local207 > 255) {
						local207 = 255;
					}
					if (local207 < 0) {
						local207 = 0;
					}
				}
				local51[local53++] = local169 + (local151 << 8) + (local207 << 24) + (local133 << 16);
				if (arg4) {
					local53 += arg1 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.aClass5_Sub2Array39.length; local261++) {
			this.aClass5_Sub2Array39[local261].method5807();
		}
		return local51;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(DIBIZLclient!bm;Lclient!ra;Z)[I")
	public int[] method5505(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface1 arg4, @OriginalArg(6) Class170 arg5, @OriginalArg(7) boolean arg6) {
		Static264.anInterface1_4 = arg4;
		Static277.aClass170_92 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array39.length; local11++) {
			this.aClass5_Sub2Array39[local11].method5812(arg2, arg1);
		}
		Static195.method3509(arg0);
		Static319.method5393(arg1, arg2);
		@Pc(43) int[] local43 = new int[arg1 * arg2];
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(51) byte local51;
		if (arg3) {
			local49 = arg1 - 1;
			local51 = -1;
			local53 = -1;
		} else {
			local51 = 1;
			local53 = arg1;
			local49 = 0;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(74) int local74 = 0; local74 < arg2; local74++) {
			@Pc(88) int[] local88;
			@Pc(90) int[] local90;
			@Pc(92) int[] local92;
			if (this.aClass5_Sub2_2.aBoolean488) {
				@Pc(86) int[] local86 = this.aClass5_Sub2_2.method5821(local74);
				local88 = local86;
				local90 = local86;
				local92 = local86;
			} else {
				@Pc(100) int[][] local100 = this.aClass5_Sub2_2.method5806(local74);
				local90 = local100[1];
				local88 = local100[0];
				local92 = local100[2];
			}
			if (arg6) {
				local63 = local74;
			}
			for (@Pc(118) int local118 = local49; local118 != local53; local118 += local51) {
				@Pc(126) int local126 = local88[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(144) int local144 = local90[local118] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(159) int local159 = local92[local118] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				local126 = Static202.anIntArray284[local126];
				if (local159 < 0) {
					local159 = 0;
				}
				local144 = Static202.anIntArray284[local144];
				local159 = Static202.anIntArray284[local159];
				@Pc(194) int local194 = (local126 << 16) + ((local144 << 8) + local159);
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local43[local63++] = local194;
				if (arg6) {
					local63 += arg1 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass5_Sub2Array39.length; local229++) {
			this.aClass5_Sub2Array39[local229].method5807();
		}
		return local43;
	}
}
