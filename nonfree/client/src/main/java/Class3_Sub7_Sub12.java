import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class3_Sub7_Sub12 extends Class3_Sub7 {

	@OriginalMember(owner = "client!js", name = "G", descriptor = "[I")
	private final int[] anIntArray217;

	@OriginalMember(owner = "client!js", name = "C", descriptor = "[I")
	private final int[] anIntArray216;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "Lclient!qs;")
	private final Class3_Sub3 aClass3_Sub3_3;

	@OriginalMember(owner = "client!js", name = "H", descriptor = "Lclient!qs;")
	private final Class3_Sub3 aClass3_Sub3_2;

	@OriginalMember(owner = "client!js", name = "x", descriptor = "Lclient!qs;")
	private final Class3_Sub3 aClass3_Sub3_1;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "[Lclient!qs;")
	private final Class3_Sub3[] aClass3_Sub3Array20;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	private Class3_Sub7_Sub12() {
		this.anIntArray217 = new int[0];
		this.anIntArray216 = new int[0];
		this.aClass3_Sub3_3 = new Class3_Sub3_Sub38(0);
		this.aClass3_Sub3_3.anInt6851 = 1;
		this.aClass3_Sub3_2 = new Class3_Sub3_Sub38();
		this.aClass3_Sub3_2.anInt6851 = 1;
		this.aClass3_Sub3_1 = new Class3_Sub3_Sub38();
		this.aClass3_Sub3_1.anInt6851 = 1;
		this.aClass3_Sub3Array20 = new Class3_Sub3[] { this.aClass3_Sub3_2, this.aClass3_Sub3_1, this.aClass3_Sub3_3 };
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!fb;)V")
	public Class3_Sub7_Sub12(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) int local7 = arg0.method3643();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub3Array20 = new Class3_Sub3[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub3 local26 = Static28.method584(arg0);
			if (local26.method5732() >= 0) {
				local9++;
			}
			if (local26.method5728() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass3_Sub3Array42.length;
			local18[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local18[local20][local53] = arg0.method3643();
			}
			this.aClass3_Sub3Array20[local20] = local26;
		}
		this.anIntArray217 = new int[local9];
		this.anIntArray216 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(98) int local98 = 0; local98 < local7; local98++) {
			@Pc(105) Class3_Sub3 local105 = this.aClass3_Sub3Array20[local98];
			local53 = local105.aClass3_Sub3Array42.length;
			for (@Pc(111) int local111 = 0; local111 < local53; local111++) {
				local105.aClass3_Sub3Array42[local111] = this.aClass3_Sub3Array20[local18[local98][local111]];
			}
			@Pc(133) int local133 = local105.method5732();
			@Pc(137) int local137 = local105.method5728();
			if (local133 > 0) {
				this.anIntArray217[local9++] = local133;
			}
			if (local137 > 0) {
				this.anIntArray216[local11++] = local137;
			}
			local18[local98] = null;
		}
		this.aClass3_Sub3_2 = this.aClass3_Sub3Array20[arg0.method3643()];
		this.aClass3_Sub3_1 = this.aClass3_Sub3Array20[arg0.method3643()];
		this.aClass3_Sub3_3 = this.aClass3_Sub3Array20[arg0.method3643()];
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!ir;ILclient!wh;)Z")
	public boolean method2522(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Interface9 arg1) {
		@Pc(12) int local12;
		if (Static44.anInt901 > 0) {
			for (local12 = 0; local12 < this.anIntArray217.length; local12++) {
				if (!arg0.method2298(Static44.anInt901, this.anIntArray217[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray217.length; local12++) {
				if (!arg0.method2289(this.anIntArray217[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray216.length; local12++) {
			if (!arg1.method2394(this.anIntArray216[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZILclient!ir;ILclient!wh;I)[F")
	public float[] method2524(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface9 arg4) {
		Static241.aClass100_97 = arg2;
		Static305.anInterface9_6 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub3Array20.length; local11++) {
			this.aClass3_Sub3Array20[local11].method5725(arg3, arg1);
		}
		Static36.method664(arg3, arg1);
		@Pc(42) float[] local42 = new float[arg1 * arg3 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			@Pc(70) int[] local70;
			if (this.aClass3_Sub3_2.aBoolean454) {
				@Pc(78) int[] local78 = this.aClass3_Sub3_2.method5727(local46);
				local66 = local78;
				local70 = local78;
				local62 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass3_Sub3_2.method5734(local46);
				local62 = local58[1];
				local66 = local58[0];
				local70 = local58[2];
			}
			@Pc(94) int[] local94;
			if (this.aClass3_Sub3_1.aBoolean454) {
				local94 = this.aClass3_Sub3_1.method5727(local46);
			} else {
				local94 = this.aClass3_Sub3_1.method5734(local46)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass3_Sub3_3.aBoolean454) {
				local116 = this.aClass3_Sub3_3.method5727(local46);
			} else {
				local116 = this.aClass3_Sub3_3.method5734(local46)[0];
			}
			if (arg0) {
				local44 = local46 << 2;
			}
			for (@Pc(134) int local134 = arg3 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local116[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = local170 * (float) local66[local134];
				local42[local44++] = local170 * (float) local62[local134];
				local42[local44++] = (float) local70[local134] * local170;
				local42[local44++] = local143;
				if (arg0) {
					local44 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass3_Sub3Array20.length; local224++) {
			this.aClass3_Sub3Array20[local224].method5724();
		}
		return local42;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IDZLclient!wh;BLclient!ir;I)[I")
	public int[] method2526(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface9 arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5) {
		Static241.aClass100_97 = arg4;
		Static305.anInterface9_6 = arg3;
		for (@Pc(24) int local24 = 0; local24 < this.aClass3_Sub3Array20.length; local24++) {
			this.aClass3_Sub3Array20[local24].method5725(arg5, arg0);
		}
		Static333.method5472(arg1);
		Static36.method664(arg5, arg0);
		@Pc(58) int[] local58 = new int[arg5 * arg0 * 4];
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < arg0; local62++) {
			@Pc(76) int[] local76;
			@Pc(80) int[] local80;
			@Pc(78) int[] local78;
			@Pc(74) int[] local74;
			if (this.aClass3_Sub3_2.aBoolean454) {
				local74 = this.aClass3_Sub3_2.method5727(local62);
				local76 = local74;
				local78 = local74;
				local80 = local74;
			} else {
				@Pc(88) int[][] local88 = this.aClass3_Sub3_2.method5734(local62);
				local80 = local88[1];
				local78 = local88[2];
				local76 = local88[0];
			}
			if (arg2) {
				local60 = local62;
			}
			if (this.aClass3_Sub3_1.aBoolean454) {
				local74 = this.aClass3_Sub3_1.method5727(local62);
			} else {
				local74 = this.aClass3_Sub3_1.method5734(local62)[0];
			}
			for (@Pc(128) int local128 = arg5 - 1; local128 >= 0; local128--) {
				@Pc(136) int local136 = local76[local128] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(153) int local153 = local80[local128] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				if (local153 < 0) {
					local153 = 0;
				}
				@Pc(170) int local170 = local78[local128] >> 4;
				if (local170 > 255) {
					local170 = 255;
				}
				local136 = Static140.anIntArray193[local136];
				local153 = Static140.anIntArray193[local153];
				if (local170 < 0) {
					local170 = 0;
				}
				local170 = Static140.anIntArray193[local170];
				@Pc(205) int local205;
				if (local136 == 0 && local153 == 0 && local170 == 0) {
					local205 = 0;
				} else {
					local205 = local74[local128] >> 4;
					if (local205 > 255) {
						local205 = 255;
					}
					if (local205 < 0) {
						local205 = 0;
					}
				}
				local58[local60++] = (local153 << 8) + ((local205 << 24) - (-(local136 << 16) - local170));
				if (arg2) {
					local60 += arg5 - 1;
				}
			}
		}
		for (@Pc(265) int local265 = 0; local265 < this.aClass3_Sub3Array20.length; local265++) {
			this.aClass3_Sub3Array20[local265].method5724();
		}
		return local58;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLclient!wh;DZIILclient!ir;I)[I")
	public int[] method2527(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) int arg6) {
		Static241.aClass100_97 = arg5;
		Static305.anInterface9_6 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub3Array20.length; local11++) {
			this.aClass3_Sub3Array20[local11].method5725(arg6, arg4);
		}
		Static333.method5472(arg2);
		Static36.method664(arg6, arg4);
		@Pc(39) int[] local39 = new int[arg6 * arg4];
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(43) byte local43;
		if (arg3) {
			local43 = -1;
			local47 = arg6 - 1;
			local49 = -1;
		} else {
			local43 = 1;
			local47 = 0;
			local49 = arg6;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(74) int local74 = 0; local74 < arg4; local74++) {
			if (arg0) {
				local59 = local74;
			}
			@Pc(94) int[] local94;
			@Pc(98) int[] local98;
			@Pc(102) int[] local102;
			if (this.aClass3_Sub3_2.aBoolean454) {
				@Pc(110) int[] local110 = this.aClass3_Sub3_2.method5727(local74);
				local94 = local110;
				local98 = local110;
				local102 = local110;
			} else {
				@Pc(90) int[][] local90 = this.aClass3_Sub3_2.method5734(local74);
				local94 = local90[0];
				local98 = local90[1];
				local102 = local90[2];
			}
			for (@Pc(118) int local118 = local47; local118 != local49; local118 += local43) {
				@Pc(126) int local126 = local94[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(146) int local146 = local98[local118] >> 4;
				if (local146 > 255) {
					local146 = 255;
				}
				if (local146 < 0) {
					local146 = 0;
				}
				@Pc(164) int local164 = local102[local118] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				local126 = Static140.anIntArray193[local126];
				if (local164 < 0) {
					local164 = 0;
				}
				local146 = Static140.anIntArray193[local146];
				local164 = Static140.anIntArray193[local164];
				@Pc(195) int local195 = local164 + (local126 << 16) + (local146 << 8);
				if (local195 != 0) {
					local195 |= 0xFF000000;
				}
				local39[local59++] = local195;
				if (arg0) {
					local59 += arg6 - 1;
				}
			}
		}
		for (@Pc(234) int local234 = 0; local234 < this.aClass3_Sub3Array20.length; local234++) {
			this.aClass3_Sub3Array20[local234].method5724();
		}
		return local39;
	}
}
