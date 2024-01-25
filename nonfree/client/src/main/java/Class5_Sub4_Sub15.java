import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class5_Sub4_Sub15 extends Class5_Sub4 {

	@OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
	private final int[] anIntArray442;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "[I")
	private final int[] anIntArray441;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "Lclient!gl;")
	private final Class5_Sub2 aClass5_Sub2_2;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "Lclient!gl;")
	private final Class5_Sub2 aClass5_Sub2_3;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "Lclient!gl;")
	private final Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "[Lclient!gl;")
	private final Class5_Sub2[] aClass5_Sub2Array21;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	private Class5_Sub4_Sub15() {
		this.anIntArray442 = new int[0];
		this.anIntArray441 = new int[0];
		this.aClass5_Sub2_2 = new Class5_Sub2_Sub6(0);
		this.aClass5_Sub2_2.anInt10385 = 1;
		this.aClass5_Sub2_3 = new Class5_Sub2_Sub6();
		this.aClass5_Sub2_3.anInt10385 = 1;
		this.aClass5_Sub2_1 = new Class5_Sub2_Sub6();
		this.aClass5_Sub2_1.anInt10385 = 1;
		this.aClass5_Sub2Array21 = new Class5_Sub2[] { this.aClass5_Sub2_3, this.aClass5_Sub2_1, this.aClass5_Sub2_2 };
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class5_Sub4_Sub15(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method8645();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass5_Sub2Array21 = new Class5_Sub2[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub2 local26 = Static195.method3086(arg0);
			if (local26.method8830() >= 0) {
				local9++;
			}
			if (local26.method8828() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass5_Sub2Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method8645();
			}
			this.aClass5_Sub2Array21[local20] = local26;
		}
		this.anIntArray441 = new int[local9];
		this.anIntArray442 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class5_Sub2 local98 = this.aClass5_Sub2Array21[local91];
			local50 = local98.aClass5_Sub2Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass5_Sub2Array42[local104] = this.aClass5_Sub2Array21[local14[local91][local104]];
			}
			@Pc(126) int local126 = local98.method8830();
			@Pc(130) int local130 = local98.method8828();
			if (local126 > 0) {
				this.anIntArray441[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray442[local11++] = local130;
			}
			local14[local91] = null;
		}
		this.aClass5_Sub2_3 = this.aClass5_Sub2Array21[arg0.method8645()];
		this.aClass5_Sub2_1 = this.aClass5_Sub2Array21[arg0.method8645()];
		this.aClass5_Sub2_2 = this.aClass5_Sub2Array21[arg0.method8645()];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!d;ILclient!wu;DIZ)[I")
	public int[] method5200(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class384 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static469.aClass384_110 = arg2;
		Static52.anInterface8_1 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array21.length; local11++) {
			this.aClass5_Sub2Array21[local11].method8824(arg1, arg4);
		}
		Static509.method7364(arg3);
		Static114.method1654(arg4, arg1);
		@Pc(44) int[] local44 = new int[arg4 * arg1];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg4; local48++) {
			@Pc(72) int[] local72;
			@Pc(64) int[] local64;
			@Pc(68) int[] local68;
			@Pc(80) int[] local80;
			if (this.aClass5_Sub2_3.aBoolean834) {
				local80 = this.aClass5_Sub2_3.method8820(local48);
				local68 = local80;
				local64 = local80;
				local72 = local80;
			} else {
				@Pc(60) int[][] local60 = this.aClass5_Sub2_3.method8827(local48);
				local64 = local60[1];
				local68 = local60[2];
				local72 = local60[0];
			}
			if (this.aClass5_Sub2_1.aBoolean834) {
				local80 = this.aClass5_Sub2_1.method8820(local48);
			} else {
				local80 = this.aClass5_Sub2_1.method8827(local48)[0];
			}
			if (arg5) {
				local46 = local48;
			}
			for (@Pc(114) int local114 = arg1 - 1; local114 >= 0; local114--) {
				@Pc(122) int local122 = local72[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(139) int local139 = local64[local114] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(159) int local159 = local68[local114] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				local139 = Static75.anIntArray101[local139];
				local122 = Static75.anIntArray101[local122];
				if (local159 < 0) {
					local159 = 0;
				}
				local159 = Static75.anIntArray101[local159];
				@Pc(191) int local191;
				if (local122 == 0 && local139 == 0 && local159 == 0) {
					local191 = 0;
				} else {
					local191 = local80[local114] >> 4;
					if (local191 > 255) {
						local191 = 255;
					}
					if (local191 < 0) {
						local191 = 0;
					}
				}
				local44[local46++] = (local139 << 8) + ((local191 << 24) - (-(local122 << 16) - local159));
				if (arg5) {
					local46 += arg1 - 1;
				}
			}
		}
		for (@Pc(246) int local246 = 0; local246 < this.aClass5_Sub2Array21.length; local246++) {
			this.aClass5_Sub2Array21[local246].method8829();
		}
		return local44;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZBILclient!d;Lclient!wu;I)[F")
	public float[] method5201(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) Class384 arg3, @OriginalArg(5) int arg4) {
		Static52.anInterface8_1 = arg2;
		Static469.aClass384_110 = arg3;
		for (@Pc(16) int local16 = 0; local16 < this.aClass5_Sub2Array21.length; local16++) {
			this.aClass5_Sub2Array21[local16].method8824(arg4, arg1);
		}
		Static114.method1654(arg1, arg4);
		@Pc(43) float[] local43 = new float[arg4 * arg1 * 4];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg1; local47++) {
			@Pc(61) int[] local61;
			@Pc(63) int[] local63;
			@Pc(65) int[] local65;
			if (this.aClass5_Sub2_3.aBoolean834) {
				@Pc(59) int[] local59 = this.aClass5_Sub2_3.method8820(local47);
				local61 = local59;
				local63 = local59;
				local65 = local59;
			} else {
				@Pc(73) int[][] local73 = this.aClass5_Sub2_3.method8827(local47);
				local61 = local73[0];
				local65 = local73[2];
				local63 = local73[1];
			}
			@Pc(97) int[] local97;
			if (this.aClass5_Sub2_1.aBoolean834) {
				local97 = this.aClass5_Sub2_1.method8820(local47);
			} else {
				local97 = this.aClass5_Sub2_1.method8827(local47)[0];
			}
			if (arg0) {
				local45 = local47 << 2;
			}
			@Pc(123) int[] local123;
			if (this.aClass5_Sub2_2.aBoolean834) {
				local123 = this.aClass5_Sub2_2.method8820(local47);
			} else {
				local123 = this.aClass5_Sub2_2.method8827(local47)[0];
			}
			for (@Pc(135) int local135 = arg4 - 1; local135 >= 0; local135--) {
				@Pc(144) float local144 = (float) local97[local135] / 4096.0F;
				if (local144 < 0.0F) {
					local144 = 0.0F;
				} else if (local144 > 1.0F) {
					local144 = 1.0F;
				}
				@Pc(171) float local171 = ((float) local123[local135] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local43[local45++] = local171 * (float) local61[local135];
				local43[local45++] = local171 * (float) local63[local135];
				local43[local45++] = local171 * (float) local65[local135];
				local43[local45++] = local144;
				if (arg0) {
					local45 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass5_Sub2Array21.length; local225++) {
			this.aClass5_Sub2Array21[local225].method8829();
		}
		return local43;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!d;Lclient!wu;Z)Z")
	public boolean method5202(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class384 arg1) {
		@Pc(12) int local12;
		if (Static109.anInt1720 < 0) {
			for (local12 = 0; local12 < this.anIntArray441.length; local12++) {
				if (!arg1.method8883(this.anIntArray441[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray441.length; local12++) {
				if (!arg1.method8878(this.anIntArray441[local12], Static109.anInt1720)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray442.length; local12++) {
			if (!arg0.method7811(this.anIntArray442[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBZDLclient!wu;Lclient!d;IZ)[I")
	public int[] method5204(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) double arg2, @OriginalArg(4) Class384 arg3, @OriginalArg(5) Interface8 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static469.aClass384_110 = arg3;
		Static52.anInterface8_1 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array21.length; local11++) {
			this.aClass5_Sub2Array21[local11].method8824(arg5, arg0);
		}
		Static509.method7364(arg2);
		Static114.method1654(arg0, arg5);
		@Pc(49) int[] local49 = new int[arg0 * arg5];
		@Pc(57) int local57;
		@Pc(53) int local53;
		@Pc(59) byte local59;
		if (arg1) {
			local53 = -1;
			local57 = arg5 - 1;
			local59 = -1;
		} else {
			local57 = 0;
			local53 = arg5;
			local59 = 1;
		}
		@Pc(69) int local69 = 0;
		for (@Pc(71) int local71 = 0; local71 < arg0; local71++) {
			if (arg6) {
				local69 = local71;
			}
			@Pc(89) int[] local89;
			@Pc(91) int[] local91;
			@Pc(93) int[] local93;
			if (this.aClass5_Sub2_3.aBoolean834) {
				@Pc(87) int[] local87 = this.aClass5_Sub2_3.method8820(local71);
				local89 = local87;
				local91 = local87;
				local93 = local87;
			} else {
				@Pc(101) int[][] local101 = this.aClass5_Sub2_3.method8827(local71);
				local91 = local101[1];
				local93 = local101[2];
				local89 = local101[0];
			}
			for (@Pc(115) int local115 = local57; local115 != local53; local115 += local59) {
				@Pc(123) int local123 = local89[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(143) int local143 = local91[local115] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(158) int local158 = local93[local115] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local143 = Static75.anIntArray101[local143];
				if (local158 < 0) {
					local158 = 0;
				}
				local123 = Static75.anIntArray101[local123];
				local158 = Static75.anIntArray101[local158];
				@Pc(194) int local194 = local158 + (local123 << 16) + (local143 << 8);
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local49[local69++] = local194;
				if (arg6) {
					local69 += arg5 - 1;
				}
			}
		}
		for (@Pc(230) int local230 = 0; local230 < this.aClass5_Sub2Array21.length; local230++) {
			this.aClass5_Sub2Array21[local230].method8829();
		}
		return local49;
	}
}
