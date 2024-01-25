import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class3_Sub11_Sub19 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "[I")
	private final int[] anIntArray833;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "[I")
	private final int[] anIntArray832;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!le;")
	private final Class3_Sub9 aClass3_Sub9_3;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!le;")
	private final Class3_Sub9 aClass3_Sub9_2;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!le;")
	private final Class3_Sub9 aClass3_Sub9_1;

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "[Lclient!le;")
	private final Class3_Sub9[] aClass3_Sub9Array38;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	private Class3_Sub11_Sub19() {
		this.anIntArray833 = new int[0];
		this.anIntArray832 = new int[0];
		this.aClass3_Sub9_3 = new Class3_Sub9_Sub16(0);
		this.aClass3_Sub9_3.anInt10587 = 1;
		this.aClass3_Sub9_2 = new Class3_Sub9_Sub16();
		this.aClass3_Sub9_2.anInt10587 = 1;
		this.aClass3_Sub9_1 = new Class3_Sub9_Sub16();
		this.aClass3_Sub9Array38 = new Class3_Sub9[] { this.aClass3_Sub9_2, this.aClass3_Sub9_1, this.aClass3_Sub9_3 };
		this.aClass3_Sub9_1.anInt10587 = 1;
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class3_Sub11_Sub19(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(7) int local7 = arg0.method8632();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub9Array38 = new Class3_Sub9[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub9 local26 = Static64.method1327(arg0);
			if (local26.method9169() >= 0) {
				local9++;
			}
			if (local26.method9170() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass3_Sub9Array42.length;
			local18[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local18[local20][local53] = arg0.method8632();
			}
			this.aClass3_Sub9Array38[local20] = local26;
		}
		this.anIntArray833 = new int[local9];
		this.anIntArray832 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(90) int local90 = 0; local90 < local7; local90++) {
			@Pc(97) Class3_Sub9 local97 = this.aClass3_Sub9Array38[local90];
			local53 = local97.aClass3_Sub9Array42.length;
			for (@Pc(103) int local103 = 0; local103 < local53; local103++) {
				local97.aClass3_Sub9Array42[local103] = this.aClass3_Sub9Array38[local18[local90][local103]];
			}
			@Pc(125) int local125 = local97.method9169();
			@Pc(129) int local129 = local97.method9170();
			if (local125 > 0) {
				this.anIntArray833[local9++] = local125;
			}
			if (local129 > 0) {
				this.anIntArray832[local11++] = local129;
			}
			local18[local90] = null;
		}
		this.aClass3_Sub9_2 = this.aClass3_Sub9Array38[arg0.method8632()];
		this.aClass3_Sub9_1 = this.aClass3_Sub9Array38[arg0.method8632()];
		this.aClass3_Sub9_3 = this.aClass3_Sub9Array38[arg0.method8632()];
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!d;Lclient!aj;B)Z")
	public boolean method8409(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class15 arg1) {
		@Pc(12) int local12;
		if (Static355.anInt5754 >= 0) {
			for (local12 = 0; local12 < this.anIntArray833.length; local12++) {
				if (!arg1.method542(this.anIntArray833[local12], Static355.anInt5754)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray833.length; local12++) {
				if (!arg1.method526(this.anIntArray833[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray832.length; local12++) {
			if (!arg0.method4672(this.anIntArray832[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZILclient!aj;Lclient!d;I)[F")
	public float[] method8410(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15 arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) int arg4) {
		Static641.aClass15_159 = arg2;
		Static529.anInterface4_13 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub9Array38.length; local11++) {
			this.aClass3_Sub9Array38[local11].method9164(arg4, arg1);
		}
		Static230.method3909(arg4, arg1);
		@Pc(51) float[] local51 = new float[arg1 * arg4 * 4];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg1; local55++) {
			@Pc(75) int[] local75;
			@Pc(71) int[] local71;
			@Pc(79) int[] local79;
			if (this.aClass3_Sub9_2.aBoolean804) {
				@Pc(87) int[] local87 = this.aClass3_Sub9_2.method9165(local55);
				local75 = local87;
				local79 = local87;
				local71 = local87;
			} else {
				@Pc(67) int[][] local67 = this.aClass3_Sub9_2.method9168(local55);
				local71 = local67[1];
				local75 = local67[0];
				local79 = local67[2];
			}
			@Pc(105) int[] local105;
			if (this.aClass3_Sub9_1.aBoolean804) {
				local105 = this.aClass3_Sub9_1.method9165(local55);
			} else {
				local105 = this.aClass3_Sub9_1.method9168(local55)[0];
			}
			@Pc(123) int[] local123;
			if (this.aClass3_Sub9_3.aBoolean804) {
				local123 = this.aClass3_Sub9_3.method9165(local55);
			} else {
				local123 = this.aClass3_Sub9_3.method9168(local55)[0];
			}
			if (arg0) {
				local53 = local55 << 2;
			}
			for (@Pc(143) int local143 = arg4 - 1; local143 >= 0; local143--) {
				@Pc(152) float local152 = (float) local105[local143] / 4096.0F;
				@Pc(165) float local165 = ((float) local123[local143] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local152 < 0.0F) {
					local152 = 0.0F;
				} else if (local152 > 1.0F) {
					local152 = 1.0F;
				}
				local51[local53++] = local165 * (float) local75[local143];
				local51[local53++] = (float) local71[local143] * local165;
				local51[local53++] = (float) local79[local143] * local165;
				local51[local53++] = local152;
				if (arg0) {
					local53 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass3_Sub9Array38.length; local237++) {
			this.aClass3_Sub9Array38[local237].method9171();
		}
		return local51;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!aj;IZDLclient!d;ZIZ)[I")
	public int[] method8411(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) double arg3, @OriginalArg(4) Interface4 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		Static529.anInterface4_13 = arg4;
		Static641.aClass15_159 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub9Array38.length; local11++) {
			this.aClass3_Sub9Array38[local11].method9164(arg1, arg6);
		}
		Static674.method9362(arg3);
		Static230.method3909(arg1, arg6);
		@Pc(43) int[] local43 = new int[arg6 * arg1];
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(47) byte local47;
		if (arg2) {
			local47 = -1;
			local51 = arg1 - 1;
			local53 = -1;
		} else {
			local53 = arg1;
			local51 = 0;
			local47 = 1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg6; local65++) {
			@Pc(85) int[] local85;
			@Pc(89) int[] local89;
			@Pc(81) int[] local81;
			if (this.aClass3_Sub9_2.aBoolean804) {
				@Pc(97) int[] local97 = this.aClass3_Sub9_2.method9165(local65);
				local89 = local97;
				local81 = local97;
				local85 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass3_Sub9_2.method9168(local65);
				local81 = local77[2];
				local85 = local77[0];
				local89 = local77[1];
			}
			if (arg5) {
				local63 = local65;
			}
			for (@Pc(109) int local109 = local51; local109 != local53; local109 += local47) {
				@Pc(117) int local117 = local85[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(132) int local132 = local89[local109] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(147) int local147 = local81[local109] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				local117 = Static402.anIntArray559[local117];
				if (local147 < 0) {
					local147 = 0;
				}
				local132 = Static402.anIntArray559[local132];
				local147 = Static402.anIntArray559[local147];
				@Pc(179) int local179 = (local117 << 16) + (local132 << 8) + local147;
				if (local179 != 0) {
					local179 |= 0xFF000000;
				}
				local43[local63++] = local179;
				if (arg5) {
					local63 += arg1 - 1;
				}
			}
		}
		for (@Pc(211) int local211 = 0; local211 < this.aClass3_Sub9Array38.length; local211++) {
			this.aClass3_Sub9Array38[local211].method9171();
		}
		return local43;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IDZLclient!aj;Lclient!d;II)[I")
	public int[] method8412(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) Interface4 arg4, @OriginalArg(6) int arg5) {
		Static529.anInterface4_13 = arg4;
		Static641.aClass15_159 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub9Array38.length; local11++) {
			this.aClass3_Sub9Array38[local11].method9164(arg5, arg0);
		}
		Static674.method9362(arg1);
		Static230.method3909(arg5, arg0);
		@Pc(39) int[] local39 = new int[arg0 * arg5];
		@Pc(41) int local41 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			@Pc(64) int[] local64;
			@Pc(60) int[] local60;
			if (this.aClass3_Sub9_2.aBoolean804) {
				local60 = this.aClass3_Sub9_2.method9165(local48);
				local62 = local60;
				local64 = local60;
				local66 = local60;
			} else {
				@Pc(74) int[][] local74 = this.aClass3_Sub9_2.method9168(local48);
				local62 = local74[0];
				local66 = local74[1];
				local64 = local74[2];
			}
			if (arg2) {
				local41 = local48;
			}
			if (this.aClass3_Sub9_1.aBoolean804) {
				local60 = this.aClass3_Sub9_1.method9165(local48);
			} else {
				local60 = this.aClass3_Sub9_1.method9168(local48)[0];
			}
			for (@Pc(114) int local114 = arg5 - 1; local114 >= 0; local114--) {
				@Pc(122) int local122 = local62[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(137) int local137 = local66[local114] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(157) int local157 = local64[local114] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				local137 = Static402.anIntArray559[local137];
				local122 = Static402.anIntArray559[local122];
				local157 = Static402.anIntArray559[local157];
				@Pc(194) int local194;
				if (local122 == 0 && local137 == 0 && local157 == 0) {
					local194 = 0;
				} else {
					local194 = local60[local114] >> 4;
					if (local194 > 255) {
						local194 = 255;
					}
					if (local194 < 0) {
						local194 = 0;
					}
				}
				local39[local41++] = (local137 << 8) + ((local194 << 24) + (local122 << 16)) + local157;
				if (arg2) {
					local41 += arg5 - 1;
				}
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.aClass3_Sub9Array38.length; local249++) {
			this.aClass3_Sub9Array38[local249].method9171();
		}
		return local39;
	}
}
