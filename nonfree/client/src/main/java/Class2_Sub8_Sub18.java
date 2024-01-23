import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class2_Sub8_Sub18 extends Class2_Sub8 {

	@OriginalMember(owner = "client!pl", name = "I", descriptor = "[I")
	private int[] anIntArray447;

	@OriginalMember(owner = "client!pl", name = "D", descriptor = "[I")
	private int[] anIntArray446;

	@OriginalMember(owner = "client!pl", name = "G", descriptor = "Lclient!ng;")
	private Class2_Sub1 aClass2_Sub1_3;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "Lclient!ng;")
	private Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "Lclient!ng;")
	private Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!pl", name = "F", descriptor = "[Lclient!ng;")
	private Class2_Sub1[] aClass2_Sub1Array34;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class2_Sub8_Sub18(@OriginalArg(0) Class2_Sub16 arg0) {
		@Pc(7) int local7 = arg0.method2146();
		this.aClass2_Sub1Array34 = new Class2_Sub1[local7];
		@Pc(13) int local13 = 0;
		@Pc(16) int[][] local16 = new int[local7][];
		@Pc(18) int local18 = 0;
		@Pc(20) int local20;
		@Pc(31) Class2_Sub1 local31;
		@Pc(47) int local47;
		@Pc(54) int local54;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = Static71.method1386(arg0);
			if (local31.method4596() >= 0) {
				local13++;
			}
			if (local31.method4593() >= 0) {
				local18++;
			}
			local47 = local31.aClass2_Sub1Array42.length;
			local16[local20] = new int[local47];
			for (local54 = 0; local54 < local47; local54++) {
				local16[local20][local54] = arg0.method2146();
			}
			this.aClass2_Sub1Array34[local20] = local31;
		}
		this.anIntArray447 = new int[local13];
		this.anIntArray446 = new int[local18];
		local18 = 0;
		local13 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = this.aClass2_Sub1Array34[local20];
			local47 = local31.aClass2_Sub1Array42.length;
			for (local54 = 0; local54 < local47; local54++) {
				local31.aClass2_Sub1Array42[local54] = this.aClass2_Sub1Array34[local16[local20][local54]];
			}
			local54 = local31.method4596();
			@Pc(130) int local130 = local31.method4593();
			if (local54 > 0) {
				this.anIntArray447[local13++] = local54;
			}
			if (local130 > 0) {
				this.anIntArray446[local18++] = local130;
			}
			local16[local20] = null;
		}
		this.aClass2_Sub1_1 = this.aClass2_Sub1Array34[arg0.method2146()];
		this.aClass2_Sub1_2 = this.aClass2_Sub1Array34[arg0.method2146()];
		local16 = null;
		this.aClass2_Sub1_3 = this.aClass2_Sub1Array34[arg0.method2146()];
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILclient!ek;ZILclient!li;)[F")
	public float[] method3630(@OriginalArg(1) int arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface1 arg4) {
		Static263.aClass42_88 = arg1;
		@Pc(14) float[] local14 = new float[arg3 * arg0 * 4];
		Static136.anInterface1_1 = arg4;
		Static140.method2491(arg3, arg0);
		@Pc(27) int local27;
		for (local27 = 0; local27 < this.aClass2_Sub1Array34.length; local27++) {
			this.aClass2_Sub1Array34[local27].method4589(arg0, arg3);
		}
		local27 = 0;
		@Pc(51) int local51;
		for (local51 = 0; local51 < arg3; local51++) {
			if (arg2) {
				local27 = local51 << 2;
			}
			@Pc(76) int[] local76;
			@Pc(80) int[] local80;
			@Pc(78) int[] local78;
			if (this.aClass2_Sub1_1.aBoolean385) {
				@Pc(74) int[] local74 = this.aClass2_Sub1_1.method4587(local51);
				local76 = local74;
				local78 = local74;
				local80 = local74;
			} else {
				@Pc(88) int[][] local88 = this.aClass2_Sub1_1.method4586(local51);
				local78 = local88[2];
				local76 = local88[0];
				local80 = local88[1];
			}
			@Pc(112) int[] local112;
			if (this.aClass2_Sub1_2.aBoolean385) {
				local112 = this.aClass2_Sub1_2.method4587(local51);
			} else {
				local112 = this.aClass2_Sub1_2.method4586(local51)[0];
			}
			@Pc(132) int[] local132;
			if (this.aClass2_Sub1_3.aBoolean385) {
				local132 = this.aClass2_Sub1_3.method4587(local51);
			} else {
				local132 = this.aClass2_Sub1_3.method4586(local51)[0];
			}
			for (@Pc(144) int local144 = arg0 - 1; local144 >= 0; local144--) {
				@Pc(156) float local156 = (float) local112[local144] / 4096.0F;
				@Pc(169) float local169 = ((float) local132[local144] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local156 < 0.0F) {
					local156 = 0.0F;
				} else if (local156 > 1.0F) {
					local156 = 1.0F;
				}
				local14[local27++] = (float) local76[local144] * local169;
				local14[local27++] = (float) local80[local144] * local169;
				local14[local27++] = (float) local78[local144] * local169;
				local14[local27++] = local156;
				if (arg2) {
					local27 += (arg0 << 2) - 4;
				}
			}
		}
		for (local51 = 0; local51 < this.aClass2_Sub1Array34.length; local51++) {
			this.aClass2_Sub1Array34[local51].method4591();
		}
		return local14;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZDLclient!li;ZLclient!ek;III)[I")
	public int[] method3632(@OriginalArg(0) boolean arg0, @OriginalArg(1) double arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class42 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		Static215.method3577(arg1);
		Static136.anInterface1_1 = arg2;
		Static263.aClass42_88 = arg4;
		Static140.method2491(arg5, arg6);
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass2_Sub1Array34.length; local18++) {
			this.aClass2_Sub1Array34[local18].method4589(arg6, arg5);
		}
		@Pc(43) int[] local43 = new int[arg5 * arg6];
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg0) {
			local47 = -1;
			local49 = -1;
			local18 = arg6 - 1;
		} else {
			local49 = arg6;
			local18 = 0;
			local47 = 1;
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65;
		for (local65 = 0; local65 < arg5; local65++) {
			if (arg3) {
				local63 = local65;
			}
			@Pc(93) int[] local93;
			@Pc(91) int[] local91;
			@Pc(89) int[] local89;
			if (this.aClass2_Sub1_1.aBoolean385) {
				@Pc(87) int[] local87 = this.aClass2_Sub1_1.method4587(local65);
				local89 = local87;
				local91 = local87;
				local93 = local87;
			} else {
				@Pc(101) int[][] local101 = this.aClass2_Sub1_1.method4586(local65);
				local89 = local101[2];
				local91 = local101[1];
				local93 = local101[0];
			}
			for (@Pc(115) int local115 = local18; local115 != local49; local115 += local47) {
				@Pc(124) int local124 = local93[local115] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				local124 = Static256.anIntArray488[local124];
				@Pc(148) int local148 = local91[local115] >> 4;
				if (local148 > 255) {
					local148 = 255;
				}
				if (local148 < 0) {
					local148 = 0;
				}
				local148 = Static256.anIntArray488[local148];
				@Pc(171) int local171 = local89[local115] >> 4;
				if (local171 > 255) {
					local171 = 255;
				}
				if (local171 < 0) {
					local171 = 0;
				}
				local171 = Static256.anIntArray488[local171];
				local43[local63++] = (local148 << 8) + (local124 << 16) + local171;
				if (arg3) {
					local63 += arg6 - 1;
				}
			}
		}
		for (local65 = 0; local65 < this.aClass2_Sub1Array34.length; local65++) {
			this.aClass2_Sub1Array34[local65].method4591();
		}
		return local43;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZDIILclient!ek;ILclient!li;)Lclient!ki;")
	public Class2_Sub8_Sub1_Sub1_Sub1 method3634(@OriginalArg(1) double arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class42 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Interface1 arg4) {
		Static215.method3577(arg0);
		Static263.aClass42_88 = arg2;
		Static136.anInterface1_1 = arg4;
		Static140.method2491(arg1, arg3);
		@Pc(22) Class2_Sub8_Sub1_Sub1_Sub1 local22 = new Class2_Sub8_Sub1_Sub1_Sub1(arg3, arg1);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass2_Sub1Array34.length; local24++) {
			this.aClass2_Sub1Array34[local24].method4589(arg3, arg1);
		}
		local24 = 0;
		@Pc(48) int local48;
		for (local48 = 0; local48 < arg1; local48++) {
			@Pc(72) int[] local72;
			@Pc(74) int[] local74;
			@Pc(70) int[] local70;
			@Pc(68) int[] local68;
			if (this.aClass2_Sub1_1.aBoolean385) {
				local68 = this.aClass2_Sub1_1.method4587(local48);
				local70 = local68;
				local72 = local68;
				local74 = local68;
			} else {
				@Pc(82) int[][] local82 = this.aClass2_Sub1_1.method4586(local48);
				local72 = local82[0];
				local70 = local82[2];
				local74 = local82[1];
			}
			if (this.aClass2_Sub1_2.aBoolean385) {
				local68 = this.aClass2_Sub1_2.method4587(local48);
			} else {
				local68 = this.aClass2_Sub1_2.method4586(local48)[0];
			}
			for (@Pc(120) int local120 = arg3 - 1; local120 >= 0; local120--) {
				@Pc(131) int local131 = local72[local120] >> 4;
				@Pc(137) int local137 = local74[local120] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				local131 = Static256.anIntArray488[local131];
				@Pc(172) int local172 = local70[local120] >> 4;
				if (local172 > 255) {
					local172 = 255;
				}
				if (local172 < 0) {
					local172 = 0;
				}
				local172 = Static256.anIntArray488[local172];
				local137 = Static256.anIntArray488[local137];
				@Pc(208) int local208;
				if (local131 == 0 && local137 == 0 && local172 == 0) {
					local208 = 0;
				} else {
					local208 = local68[local120] >> 4;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 < 0) {
						local208 = 0;
					}
				}
				local22.anIntArray340[local24++] = local172 + (local137 << 8) + (local208 << 24) + (local131 << 16);
			}
		}
		for (local48 = 0; local48 < this.aClass2_Sub1Array34.length; local48++) {
			this.aClass2_Sub1Array34[local48].method4591();
		}
		return local22;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ek;Lclient!li;IIDIZ)[I")
	public int[] method3635(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int[] local8 = new int[arg4 * arg2 * 4];
		Static215.method3577(arg3);
		Static136.anInterface1_1 = arg1;
		Static263.aClass42_88 = arg0;
		Static140.method2491(arg2, arg4);
		@Pc(25) int local25;
		for (local25 = 0; local25 < this.aClass2_Sub1Array34.length; local25++) {
			this.aClass2_Sub1Array34[local25].method4589(arg4, arg2);
		}
		local25 = 0;
		@Pc(45) int local45;
		for (local45 = 0; local45 < arg2; local45++) {
			if (arg5) {
				local25 = local45;
			}
			@Pc(70) int[] local70;
			@Pc(68) int[] local68;
			@Pc(72) int[] local72;
			@Pc(66) int[] local66;
			if (this.aClass2_Sub1_1.aBoolean385) {
				local66 = this.aClass2_Sub1_1.method4587(local45);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.aClass2_Sub1_1.method4586(local45);
				local70 = local80[0];
				local72 = local80[2];
				local68 = local80[1];
			}
			if (this.aClass2_Sub1_2.aBoolean385) {
				local66 = this.aClass2_Sub1_2.method4587(local45);
			} else {
				local66 = this.aClass2_Sub1_2.method4586(local45)[0];
			}
			for (@Pc(116) int local116 = arg4 - 1; local116 >= 0; local116--) {
				@Pc(125) int local125 = local70[local116] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				@Pc(138) int local138 = local68[local116] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				local125 = Static256.anIntArray488[local125];
				@Pc(162) int local162 = local72[local116] >> 4;
				if (local138 < 0) {
					local138 = 0;
				}
				if (local162 > 255) {
					local162 = 255;
				}
				if (local162 < 0) {
					local162 = 0;
				}
				local138 = Static256.anIntArray488[local138];
				local162 = Static256.anIntArray488[local162];
				@Pc(205) int local205;
				if (local125 == 0 && local138 == 0 && local162 == 0) {
					local205 = 0;
				} else {
					local205 = local66[local116] >> 4;
					if (local205 > 255) {
						local205 = 255;
					}
					if (local205 < 0) {
						local205 = 0;
					}
				}
				local8[local25++] = local162 + (local138 << 8) + (local205 << 24) + (local125 << 16);
				if (arg5) {
					local25 += arg4 - 1;
				}
			}
		}
		for (local45 = 0; local45 < this.aClass2_Sub1Array34.length; local45++) {
			this.aClass2_Sub1Array34[local45].method4591();
		}
		return local8;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBDZLclient!li;ILclient!ek;)Lclient!sc;")
	public Class2_Sub8_Sub1_Sub1 method3636(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1, @OriginalArg(4) Interface1 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class42 arg4) {
		Static215.method3577(arg1);
		Static136.anInterface1_1 = arg2;
		Static263.aClass42_88 = arg4;
		Static140.method2491(arg0, arg3);
		@Pc(27) Class2_Sub8_Sub1_Sub1 local27 = new Class2_Sub8_Sub1_Sub1(arg3, arg0);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass2_Sub1Array34.length; local29++) {
			this.aClass2_Sub1Array34[local29].method4589(arg3, arg0);
		}
		local29 = 0;
		@Pc(49) int local49;
		for (local49 = 0; local49 < arg0; local49++) {
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			if (this.aClass2_Sub1_1.aBoolean385) {
				@Pc(71) int[] local71 = this.aClass2_Sub1_1.method4587(local49);
				local73 = local71;
				local75 = local71;
				local77 = local71;
			} else {
				@Pc(87) int[][] local87 = this.aClass2_Sub1_1.method4586(local49);
				local77 = local87[1];
				local75 = local87[0];
				local73 = local87[2];
			}
			for (@Pc(103) int local103 = arg3 - 1; local103 >= 0; local103--) {
				@Pc(114) int local114 = local75[local103] >> 4;
				@Pc(120) int local120 = local77[local103] >> 4;
				if (local114 > 255) {
					local114 = 255;
				}
				if (local120 > 255) {
					local120 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				if (local114 < 0) {
					local114 = 0;
				}
				local114 = Static256.anIntArray488[local114];
				local120 = Static256.anIntArray488[local120];
				@Pc(158) int local158 = local73[local103] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				if (local158 < 0) {
					local158 = 0;
				}
				local158 = Static256.anIntArray488[local158];
				local27.anIntArray340[local29++] = local158 + (local114 << 16) + (local120 << 8);
			}
		}
		for (local49 = 0; local49 < this.aClass2_Sub1Array34.length; local49++) {
			this.aClass2_Sub1Array34[local49].method4591();
		}
		return local27;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ek;BLclient!li;)Z")
	public boolean method3637(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Interface1 arg1) {
		@Pc(10) int local10;
		if (Static89.anInt2131 > 0) {
			for (local10 = 0; local10 < this.anIntArray447.length; local10++) {
				if (!arg0.method1273(Static89.anInt2131, this.anIntArray447[local10])) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray447.length; local10++) {
				if (!arg0.method1253(this.anIntArray447[local10])) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray446.length; local10++) {
			if (!arg1.method4106(this.anIntArray446[local10])) {
				return false;
			}
		}
		return true;
	}
}
