import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class4_Sub2_Sub17 extends Class4_Sub2 {

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!qe", name = "J", descriptor = "Lclient!da;")
	private Class4_Sub6 aClass4_Sub6_3;

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "Lclient!da;")
	private Class4_Sub6 aClass4_Sub6_2;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "Lclient!da;")
	private Class4_Sub6 aClass4_Sub6_1;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "[Lclient!da;")
	private Class4_Sub6[] aClass4_Sub6Array29;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!p;)V")
	public Class4_Sub2_Sub17(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg0.method1874();
		this.aClass4_Sub6Array29 = new Class4_Sub6[local9];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local9][];
		@Pc(20) int local20;
		@Pc(31) Class4_Sub6 local31;
		@Pc(51) int local51;
		@Pc(58) int local58;
		for (local20 = 0; local20 < local9; local20++) {
			local31 = Static218.method4260(arg0);
			if (local31.method4384() >= 0) {
				local15++;
			}
			if (local31.method4378() >= 0) {
				local5++;
			}
			local51 = local31.aClass4_Sub6Array42.length;
			local18[local20] = new int[local51];
			for (local58 = 0; local58 < local51; local58++) {
				local18[local20][local58] = arg0.method1874();
			}
			this.aClass4_Sub6Array29[local20] = local31;
		}
		this.anIntArray384 = new int[local15];
		local15 = 0;
		this.anIntArray383 = new int[local5];
		local5 = 0;
		for (local20 = 0; local20 < local9; local20++) {
			local31 = this.aClass4_Sub6Array29[local20];
			local51 = local31.aClass4_Sub6Array42.length;
			for (local58 = 0; local58 < local51; local58++) {
				local31.aClass4_Sub6Array42[local58] = this.aClass4_Sub6Array29[local18[local20][local58]];
			}
			local58 = local31.method4384();
			@Pc(146) int local146 = local31.method4378();
			if (local58 > 0) {
				this.anIntArray384[local15++] = local58;
			}
			if (local146 > 0) {
				this.anIntArray383[local5++] = local146;
			}
			local18[local20] = null;
		}
		local18 = null;
		this.aClass4_Sub6_2 = this.aClass4_Sub6Array29[arg0.method1874()];
		this.aClass4_Sub6_1 = this.aClass4_Sub6Array29[arg0.method1874()];
		this.aClass4_Sub6_3 = this.aClass4_Sub6Array29[arg0.method1874()];
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!t;ZILclient!lc;ZDI)[I")
	public int[] method3408(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class98 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) double arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int[] local6 = new int[arg6 * arg2];
		Static114.method1941(arg5);
		Static211.aClass98_127 = arg3;
		Static224.anInterface5_1 = arg0;
		Static147.method2365(arg2, arg6);
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.aClass4_Sub6Array29.length; local23++) {
			this.aClass4_Sub6Array29[local23].method4383(arg2, arg6);
		}
		@Pc(45) int local45;
		@Pc(47) byte local47;
		if (arg4) {
			local45 = -1;
			local23 = arg6 - 1;
			local47 = -1;
		} else {
			local23 = 0;
			local45 = arg6;
			local47 = 1;
		}
		@Pc(59) int local59 = 0;
		@Pc(61) int local61;
		for (local61 = 0; local61 < arg2; local61++) {
			if (arg1) {
				local59 = local61;
			}
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			@Pc(91) int[] local91;
			if (this.aClass4_Sub6_2.aBoolean355) {
				@Pc(99) int[] local99 = this.aClass4_Sub6_2.method4375(local61);
				local87 = local99;
				local91 = local99;
				local83 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass4_Sub6_2.method4379(local61);
				local83 = local79[0];
				local87 = local79[1];
				local91 = local79[2];
			}
			for (@Pc(107) int local107 = local23; local107 != local45; local107 += local47) {
				@Pc(120) int local120 = local87[local107] >> 4;
				@Pc(126) int local126 = local83[local107] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				@Pc(138) int local138 = local91[local107] >> 4;
				if (local126 < 0) {
					local126 = 0;
				}
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				local126 = Static277.anIntArray459[local126];
				local138 = Static277.anIntArray459[local138];
				if (local120 > 255) {
					local120 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				local120 = Static277.anIntArray459[local120];
				local6[local59++] = local138 + (local126 << 16) + (local120 << 8);
				if (arg1) {
					local59 += arg6 - 1;
				}
			}
		}
		for (local61 = 0; local61 < this.aClass4_Sub6Array29.length; local61++) {
			this.aClass4_Sub6Array29[local61].method4373();
		}
		return local6;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!t;ZDLclient!lc;I)Lclient!qi;")
	public Class4_Sub2_Sub1_Sub1_Sub1 method3411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) Class98 arg4) {
		Static114.method1941(arg3);
		Static211.aClass98_127 = arg4;
		Static224.anInterface5_1 = arg2;
		Static147.method2365(arg0, arg1);
		@Pc(22) Class4_Sub2_Sub1_Sub1_Sub1 local22 = new Class4_Sub2_Sub1_Sub1_Sub1(arg1, arg0);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass4_Sub6Array29.length; local24++) {
			this.aClass4_Sub6Array29[local24].method4383(arg0, arg1);
		}
		local24 = 0;
		@Pc(55) int local55;
		for (local55 = 0; local55 < arg0; local55++) {
			@Pc(79) int[] local79;
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			@Pc(95) int[] local95;
			if (this.aClass4_Sub6_2.aBoolean355) {
				local95 = this.aClass4_Sub6_2.method4375(local55);
				local87 = local95;
				local83 = local95;
				local79 = local95;
			} else {
				@Pc(75) int[][] local75 = this.aClass4_Sub6_2.method4379(local55);
				local79 = local75[0];
				local83 = local75[1];
				local87 = local75[2];
			}
			if (this.aClass4_Sub6_1.aBoolean355) {
				local95 = this.aClass4_Sub6_1.method4375(local55);
			} else {
				local95 = this.aClass4_Sub6_1.method4379(local55)[0];
			}
			for (@Pc(125) int local125 = arg1 - 1; local125 >= 0; local125--) {
				@Pc(136) int local136 = local79[local125] >> 4;
				@Pc(142) int local142 = local83[local125] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local136 > 255) {
					local136 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(164) int local164 = local87[local125] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				local142 = Static277.anIntArray459[local142];
				if (local136 < 0) {
					local136 = 0;
				}
				if (local164 < 0) {
					local164 = 0;
				}
				local136 = Static277.anIntArray459[local136];
				local164 = Static277.anIntArray459[local164];
				@Pc(210) int local210;
				if (local136 == 0 && local142 == 0 && local164 == 0) {
					local210 = 0;
				} else {
					local210 = local95[local125] >> 4;
					if (local210 > 255) {
						local210 = 255;
					}
					if (local210 < 0) {
						local210 = 0;
					}
				}
				local22.anIntArray387[local24++] = local164 + (local142 << 8) + (local210 << 24) + (local136 << 16);
			}
		}
		for (local55 = 0; local55 < this.aClass4_Sub6Array29.length; local55++) {
			this.aClass4_Sub6Array29[local55].method4373();
		}
		return local22;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!t;ILclient!lc;)Z")
	public boolean method3413(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Class98 arg1) {
		@Pc(12) int local12;
		if (Static258.anInt4864 <= 0) {
			for (local12 = 0; local12 < this.anIntArray384.length; local12++) {
				if (!arg1.method2391(this.anIntArray384[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray384.length; local12++) {
				if (!arg1.method2382(this.anIntArray384[local12], Static258.anInt4864)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray383.length; local12++) {
			if (!arg0.method1963(this.anIntArray383[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BDLclient!lc;Lclient!t;IIZ)Lclient!af;")
	public Class4_Sub2_Sub1_Sub1 method3416(@OriginalArg(1) double arg0, @OriginalArg(2) Class98 arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static114.method1941(arg0);
		Static224.anInterface5_1 = arg2;
		Static211.aClass98_127 = arg1;
		Static147.method2365(arg4, arg3);
		@Pc(22) Class4_Sub2_Sub1_Sub1 local22 = new Class4_Sub2_Sub1_Sub1(arg3, arg4);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass4_Sub6Array29.length; local24++) {
			this.aClass4_Sub6Array29[local24].method4383(arg4, arg3);
		}
		local24 = 0;
		@Pc(44) int local44;
		for (local44 = 0; local44 < arg4; local44++) {
			@Pc(74) int[] local74;
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			if (this.aClass4_Sub6_2.aBoolean355) {
				@Pc(82) int[] local82 = this.aClass4_Sub6_2.method4375(local44);
				local70 = local82;
				local74 = local82;
				local66 = local82;
			} else {
				@Pc(62) int[][] local62 = this.aClass4_Sub6_2.method4379(local44);
				local66 = local62[1];
				local70 = local62[2];
				local74 = local62[0];
			}
			for (@Pc(90) int local90 = 0; local90 != arg3; local90++) {
				@Pc(103) int local103 = local74[local90] >> 4;
				if (local103 > 255) {
					local103 = 255;
				}
				if (local103 < 0) {
					local103 = 0;
				}
				local103 = Static277.anIntArray459[local103];
				@Pc(127) int local127 = local70[local90] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(143) int local143 = local66[local90] >> 4;
				local127 = Static277.anIntArray459[local127];
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				local143 = Static277.anIntArray459[local143];
				local22.anIntArray387[local24++] = local127 + (local103 << 16) + (local143 << 8);
			}
		}
		for (local44 = 0; local44 < this.aClass4_Sub6Array29.length; local44++) {
			this.aClass4_Sub6Array29[local44].method4373();
		}
		return local22;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!t;IILclient!lc;ZI)[F")
	public float[] method3417(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class98 arg3, @OriginalArg(4) boolean arg4) {
		Static224.anInterface5_1 = arg0;
		Static211.aClass98_127 = arg3;
		@Pc(19) float[] local19 = new float[arg1 * arg2 * 4];
		Static147.method2365(arg1, arg2);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass4_Sub6Array29.length; local29++) {
			this.aClass4_Sub6Array29[local29].method4383(arg1, arg2);
		}
		local29 = 0;
		@Pc(49) int local49;
		for (local49 = 0; local49 < arg1; local49++) {
			if (arg4) {
				local29 = local49 << 2;
			}
			@Pc(74) int[] local74;
			@Pc(78) int[] local78;
			@Pc(82) int[] local82;
			if (this.aClass4_Sub6_2.aBoolean355) {
				@Pc(90) int[] local90 = this.aClass4_Sub6_2.method4375(local49);
				local82 = local90;
				local74 = local90;
				local78 = local90;
			} else {
				@Pc(70) int[][] local70 = this.aClass4_Sub6_2.method4379(local49);
				local74 = local70[0];
				local78 = local70[1];
				local82 = local70[2];
			}
			@Pc(108) int[] local108;
			if (this.aClass4_Sub6_1.aBoolean355) {
				local108 = this.aClass4_Sub6_1.method4375(local49);
			} else {
				local108 = this.aClass4_Sub6_1.method4379(local49)[0];
			}
			@Pc(128) int[] local128;
			if (this.aClass4_Sub6_3.aBoolean355) {
				local128 = this.aClass4_Sub6_3.method4375(local49);
			} else {
				local128 = this.aClass4_Sub6_3.method4379(local49)[0];
			}
			for (@Pc(140) int local140 = arg2 - 1; local140 >= 0; local140--) {
				@Pc(152) float local152 = (float) local108[local140] / 4096.0F;
				if (local152 < 0.0F) {
					local152 = 0.0F;
				} else if (local152 > 1.0F) {
					local152 = 1.0F;
				}
				@Pc(179) float local179 = ((float) local128[local140] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local19[local29++] = local179 * (float) local74[local140];
				local19[local29++] = local179 * (float) local78[local140];
				local19[local29++] = local179 * (float) local82[local140];
				local19[local29++] = local152;
				if (arg4) {
					local29 += (arg2 << 2) - 4;
				}
			}
		}
		for (local49 = 0; local49 < this.aClass4_Sub6Array29.length; local49++) {
			this.aClass4_Sub6Array29[local49].method4373();
		}
		return local19;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(DLclient!t;BIILclient!lc;Z)[I")
	public int[] method3419(@OriginalArg(0) double arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class98 arg4, @OriginalArg(6) boolean arg5) {
		Static114.method1941(arg0);
		Static224.anInterface5_1 = arg1;
		Static211.aClass98_127 = arg4;
		@Pc(19) int[] local19 = new int[arg2 * 4 * arg3];
		Static147.method2365(arg3, arg2);
		@Pc(32) int local32;
		for (local32 = 0; local32 < this.aClass4_Sub6Array29.length; local32++) {
			this.aClass4_Sub6Array29[local32].method4383(arg3, arg2);
		}
		local32 = 0;
		@Pc(52) int local52;
		for (local52 = 0; local52 < arg3; local52++) {
			if (arg5) {
				local32 = local52;
			}
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			@Pc(77) int[] local77;
			@Pc(93) int[] local93;
			if (this.aClass4_Sub6_2.aBoolean355) {
				local93 = this.aClass4_Sub6_2.method4375(local52);
				local77 = local93;
				local81 = local93;
				local85 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass4_Sub6_2.method4379(local52);
				local77 = local73[2];
				local81 = local73[0];
				local85 = local73[1];
			}
			if (this.aClass4_Sub6_1.aBoolean355) {
				local93 = this.aClass4_Sub6_1.method4375(local52);
			} else {
				local93 = this.aClass4_Sub6_1.method4379(local52)[0];
			}
			for (@Pc(123) int local123 = arg2 - 1; local123 >= 0; local123--) {
				@Pc(132) int local132 = local81[local123] >> 4;
				@Pc(138) int local138 = local85[local123] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				local138 = Static277.anIntArray459[local138];
				@Pc(162) int local162 = local77[local123] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				if (local162 > 255) {
					local162 = 255;
				}
				if (local162 < 0) {
					local162 = 0;
				}
				local132 = Static277.anIntArray459[local132];
				local162 = Static277.anIntArray459[local162];
				@Pc(213) int local213;
				if (local132 == 0 && local138 == 0 && local162 == 0) {
					local213 = 0;
				} else {
					local213 = local93[local123] >> 4;
					if (local213 > 255) {
						local213 = 255;
					}
					if (local213 < 0) {
						local213 = 0;
					}
				}
				local19[local32++] = local162 + (local132 << 16) + (local213 << 24) + (local138 << 8);
				if (arg5) {
					local32 += arg2 - 1;
				}
			}
		}
		for (local52 = 0; local52 < this.aClass4_Sub6Array29.length; local52++) {
			this.aClass4_Sub6Array29[local52].method4373();
		}
		return local19;
	}
}
