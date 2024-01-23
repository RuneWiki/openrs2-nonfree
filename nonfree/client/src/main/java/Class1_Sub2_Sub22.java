import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "[I")
	private int[] anIntArray542;

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "Lclient!lf;")
	private Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "Lclient!lf;")
	private Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!lf;")
	private Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "[Lclient!lf;")
	private Class1_Sub3[] aClass1_Sub3Array41;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class1_Sub2_Sub22(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method2690();
		@Pc(9) int local9 = 0;
		this.aClass1_Sub3Array41 = new Class1_Sub3[local7];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(20) int local20;
		@Pc(27) Class1_Sub3 local27;
		@Pc(47) int local47;
		@Pc(54) int local54;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = Static137.method2330(arg0);
			if (local27.method4446() >= 0) {
				local9++;
			}
			if (local27.method4454() >= 0) {
				local15++;
			}
			local47 = local27.aClass1_Sub3Array42.length;
			local18[local20] = new int[local47];
			for (local54 = 0; local54 < local47; local54++) {
				local18[local20][local54] = arg0.method2690();
			}
			this.aClass1_Sub3Array41[local20] = local27;
		}
		this.anIntArray541 = new int[local9];
		this.anIntArray542 = new int[local15];
		local15 = 0;
		local9 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = this.aClass1_Sub3Array41[local20];
			local47 = local27.aClass1_Sub3Array42.length;
			for (local54 = 0; local54 < local47; local54++) {
				local27.aClass1_Sub3Array42[local54] = this.aClass1_Sub3Array41[local18[local20][local54]];
			}
			local54 = local27.method4446();
			@Pc(134) int local134 = local27.method4454();
			if (local54 > 0) {
				this.anIntArray541[local9++] = local54;
			}
			if (local134 > 0) {
				this.anIntArray542[local15++] = local134;
			}
			local18[local20] = null;
		}
		this.aClass1_Sub3_1 = this.aClass1_Sub3Array41[arg0.method2690()];
		this.aClass1_Sub3_2 = this.aClass1_Sub3Array41[arg0.method2690()];
		this.aClass1_Sub3_3 = this.aClass1_Sub3Array41[arg0.method2690()];
		local18 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZBDLclient!km;Lclient!rf;)Lclient!kn;")
	public Class1_Sub2_Sub11_Sub2 method4351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) double arg2, @OriginalArg(5) Class91 arg3, @OriginalArg(6) Interface4 arg4) {
		Static221.method3473(arg2);
		Static181.anInterface4_1 = arg4;
		Static254.aClass91_181 = arg3;
		Static92.method1623(arg1, arg0);
		@Pc(33) Class1_Sub2_Sub11_Sub2 local33 = new Class1_Sub2_Sub11_Sub2(arg1, arg0);
		@Pc(35) int local35;
		for (local35 = 0; local35 < this.aClass1_Sub3Array41.length; local35++) {
			this.aClass1_Sub3Array41[local35].method4448(arg1, arg0);
		}
		local35 = 0;
		@Pc(55) int local55;
		for (local55 = 0; local55 < arg0; local55++) {
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			@Pc(89) int[] local89;
			if (this.aClass1_Sub3_1.aBoolean451) {
				@Pc(97) int[] local97 = this.aClass1_Sub3_1.method4453(local55);
				local81 = local97;
				local89 = local97;
				local85 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub3_1.method4452(local55);
				local81 = local77[0];
				local85 = local77[1];
				local89 = local77[2];
			}
			for (@Pc(105) int local105 = 0; local105 != arg1; local105++) {
				@Pc(118) int local118 = local89[local105] >> 4;
				@Pc(124) int local124 = local85[local105] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				@Pc(138) int local138 = local81[local105] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				local124 = Static83.anIntArray173[local124];
				local118 = Static83.anIntArray173[local118];
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				local138 = Static83.anIntArray173[local138];
				local33.anIntArray426[local35++] = (local138 << 16) - (-(local124 << 8) - local118);
			}
		}
		for (local55 = 0; local55 < this.aClass1_Sub3Array41.length; local55++) {
			this.aClass1_Sub3Array41[local55].method4456();
		}
		return local33;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!km;Lclient!rf;DIZII)Lclient!sl;")
	public Class1_Sub2_Sub11_Sub2_Sub1 method4352(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static221.method3473(arg2);
		Static181.anInterface4_1 = arg1;
		Static254.aClass91_181 = arg0;
		Static92.method1623(arg4, arg3);
		@Pc(22) Class1_Sub2_Sub11_Sub2_Sub1 local22 = new Class1_Sub2_Sub11_Sub2_Sub1(arg4, arg3);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass1_Sub3Array41.length; local24++) {
			this.aClass1_Sub3Array41[local24].method4448(arg4, arg3);
		}
		local24 = 0;
		@Pc(55) int local55;
		for (local55 = 0; local55 < arg3; local55++) {
			@Pc(82) int[] local82;
			@Pc(86) int[] local86;
			@Pc(78) int[] local78;
			@Pc(94) int[] local94;
			if (this.aClass1_Sub3_1.aBoolean451) {
				local94 = this.aClass1_Sub3_1.method4453(local55);
				local86 = local94;
				local78 = local94;
				local82 = local94;
			} else {
				@Pc(74) int[][] local74 = this.aClass1_Sub3_1.method4452(local55);
				local78 = local74[2];
				local82 = local74[0];
				local86 = local74[1];
			}
			if (this.aClass1_Sub3_2.aBoolean451) {
				local94 = this.aClass1_Sub3_2.method4453(local55);
			} else {
				local94 = this.aClass1_Sub3_2.method4452(local55)[0];
			}
			for (@Pc(124) int local124 = arg4 - 1; local124 >= 0; local124--) {
				@Pc(132) int local132 = local82[local124] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				@Pc(144) int local144 = local78[local124] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				local144 = Static83.anIntArray173[local144];
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(174) int local174 = local86[local124] >> 4;
				local132 = Static83.anIntArray173[local132];
				if (local174 > 255) {
					local174 = 255;
				}
				if (local174 < 0) {
					local174 = 0;
				}
				local174 = Static83.anIntArray173[local174];
				@Pc(206) int local206;
				if (local132 == 0 && local174 == 0 && local144 == 0) {
					local206 = 0;
				} else {
					local206 = local94[local124] >> 4;
					if (local206 > 255) {
						local206 = 255;
					}
					if (local206 < 0) {
						local206 = 0;
					}
				}
				local22.anIntArray426[local24++] = (local174 << 8) + (local206 << 24) + (local132 << 16) + local144;
			}
		}
		for (local55 = 0; local55 < this.aClass1_Sub3Array41.length; local55++) {
			this.aClass1_Sub3Array41[local55].method4456();
		}
		return local22;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIIILclient!rf;Lclient!km;)[F")
	public float[] method4354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) Class91 arg4) {
		Static254.aClass91_181 = arg4;
		@Pc(14) float[] local14 = new float[arg2 * arg1 * 4];
		Static181.anInterface4_1 = arg3;
		Static92.method1623(arg2, arg1);
		@Pc(22) int local22;
		for (local22 = 0; local22 < this.aClass1_Sub3Array41.length; local22++) {
			this.aClass1_Sub3Array41[local22].method4448(arg2, arg1);
		}
		local22 = 0;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			if (arg0) {
				local22 = local46 << 2;
			}
			@Pc(74) int[] local74;
			@Pc(70) int[] local70;
			@Pc(78) int[] local78;
			if (this.aClass1_Sub3_1.aBoolean451) {
				@Pc(86) int[] local86 = this.aClass1_Sub3_1.method4453(local46);
				local74 = local86;
				local70 = local86;
				local78 = local86;
			} else {
				@Pc(66) int[][] local66 = this.aClass1_Sub3_1.method4452(local46);
				local70 = local66[1];
				local74 = local66[0];
				local78 = local66[2];
			}
			@Pc(104) int[] local104;
			if (this.aClass1_Sub3_2.aBoolean451) {
				local104 = this.aClass1_Sub3_2.method4453(local46);
			} else {
				local104 = this.aClass1_Sub3_2.method4452(local46)[0];
			}
			@Pc(124) int[] local124;
			if (this.aClass1_Sub3_3.aBoolean451) {
				local124 = this.aClass1_Sub3_3.method4453(local46);
			} else {
				local124 = this.aClass1_Sub3_3.method4452(local46)[0];
			}
			for (@Pc(136) int local136 = arg2 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local104[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(172) float local172 = ((float) local124[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local14[local22++] = local172 * (float) local74[local136];
				local14[local22++] = local172 * (float) local70[local136];
				local14[local22++] = local172 * (float) local78[local136];
				local14[local22++] = local145;
				if (arg0) {
					local22 += (arg2 << 2) - 4;
				}
			}
		}
		for (local46 = 0; local46 < this.aClass1_Sub3Array41.length; local46++) {
			this.aClass1_Sub3Array41[local46].method4456();
		}
		return local14;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!km;ZLclient!rf;)Z")
	public boolean method4355(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Interface4 arg1) {
		@Pc(9) int local9;
		if (Static100.anInt2368 > 0) {
			for (local9 = 0; local9 < this.anIntArray541.length; local9++) {
				if (!arg0.method2515(this.anIntArray541[local9], Static100.anInt2368)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray541.length; local9++) {
				if (!arg0.method2501(this.anIntArray541[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray542.length; local9++) {
			if (!arg1.method2256(this.anIntArray542[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!km;IIZDLclient!rf;IZ)[I")
	public int[] method4356(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) double arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static221.method3473(arg3);
		Static254.aClass91_181 = arg0;
		Static181.anInterface4_1 = arg4;
		@Pc(23) int[] local23 = new int[arg5 * arg1];
		Static92.method1623(arg1, arg5);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass1_Sub3Array41.length; local29++) {
			this.aClass1_Sub3Array41[local29].method4448(arg1, arg5);
		}
		@Pc(57) int local57;
		@Pc(55) byte local55;
		if (arg2) {
			local29 = arg1 - 1;
			local55 = -1;
			local57 = -1;
		} else {
			local29 = 0;
			local55 = 1;
			local57 = arg1;
		}
		@Pc(69) int local69 = 0;
		@Pc(71) int local71;
		for (local71 = 0; local71 < arg5; local71++) {
			if (arg6) {
				local69 = local71;
			}
			@Pc(101) int[] local101;
			@Pc(97) int[] local97;
			@Pc(105) int[] local105;
			if (this.aClass1_Sub3_1.aBoolean451) {
				@Pc(113) int[] local113 = this.aClass1_Sub3_1.method4453(local71);
				local105 = local113;
				local97 = local113;
				local101 = local113;
			} else {
				@Pc(93) int[][] local93 = this.aClass1_Sub3_1.method4452(local71);
				local97 = local93[1];
				local101 = local93[0];
				local105 = local93[2];
			}
			for (@Pc(121) int local121 = local29; local121 != local57; local121 += local55) {
				@Pc(130) int local130 = local101[local121] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				@Pc(149) int local149 = local97[local121] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				local149 = Static83.anIntArray173[local149];
				@Pc(171) int local171 = local105[local121] >> 4;
				if (local171 > 255) {
					local171 = 255;
				}
				local130 = Static83.anIntArray173[local130];
				if (local171 < 0) {
					local171 = 0;
				}
				local171 = Static83.anIntArray173[local171];
				local23[local69++] = (local130 << 16) - (-(local149 << 8) - local171);
				if (arg6) {
					local69 += arg1 - 1;
				}
			}
		}
		for (local71 = 0; local71 < this.aClass1_Sub3Array41.length; local71++) {
			this.aClass1_Sub3Array41[local71].method4456();
		}
		return local23;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(DLclient!rf;IZLclient!km;BI)[I")
	public int[] method4357(@OriginalArg(0) double arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class91 arg4, @OriginalArg(6) int arg5) {
		Static221.method3473(arg0);
		Static254.aClass91_181 = arg4;
		Static181.anInterface4_1 = arg1;
		Static92.method1623(arg2, arg5);
		@Pc(23) int[] local23 = new int[arg2 * arg5 * 4];
		@Pc(25) int local25;
		for (local25 = 0; local25 < this.aClass1_Sub3Array41.length; local25++) {
			this.aClass1_Sub3Array41[local25].method4448(arg2, arg5);
		}
		local25 = 0;
		@Pc(49) int local49;
		for (local49 = 0; local49 < arg5; local49++) {
			if (arg3) {
				local25 = local49;
			}
			@Pc(83) int[] local83;
			@Pc(85) int[] local85;
			@Pc(81) int[] local81;
			@Pc(79) int[] local79;
			if (this.aClass1_Sub3_1.aBoolean451) {
				local79 = this.aClass1_Sub3_1.method4453(local49);
				local81 = local79;
				local83 = local79;
				local85 = local79;
			} else {
				@Pc(93) int[][] local93 = this.aClass1_Sub3_1.method4452(local49);
				local85 = local93[1];
				local81 = local93[2];
				local83 = local93[0];
			}
			if (this.aClass1_Sub3_2.aBoolean451) {
				local79 = this.aClass1_Sub3_2.method4453(local49);
			} else {
				local79 = this.aClass1_Sub3_2.method4452(local49)[0];
			}
			for (@Pc(129) int local129 = arg2 - 1; local129 >= 0; local129--) {
				@Pc(137) int local137 = local81[local129] >> 4;
				@Pc(143) int local143 = local85[local129] >> 4;
				@Pc(149) int local149 = local83[local129] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				if (local149 > 255) {
					local149 = 255;
				}
				local137 = Static83.anIntArray173[local137];
				if (local143 < 0) {
					local143 = 0;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				local149 = Static83.anIntArray173[local149];
				local143 = Static83.anIntArray173[local143];
				@Pc(222) int local222;
				if (local149 == 0 && local143 == 0 && local137 == 0) {
					local222 = 0;
				} else {
					local222 = local79[local129] >> 4;
					if (local222 > 255) {
						local222 = 255;
					}
					if (local222 < 0) {
						local222 = 0;
					}
				}
				local23[local25++] = (local143 << 8) + (local149 << 16) + (local222 << 24) + local137;
				if (arg3) {
					local25 += arg2 - 1;
				}
			}
		}
		for (local49 = 0; local49 < this.aClass1_Sub3Array41.length; local49++) {
			this.aClass1_Sub3Array41[local49].method4456();
		}
		return local23;
	}
}
