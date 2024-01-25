import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class2_Sub7_Sub16 extends Class2_Sub7 {

	@OriginalMember(owner = "client!rn", name = "L", descriptor = "[I")
	private final int[] anIntArray496;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "[I")
	private final int[] anIntArray495;

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "Lclient!aa;")
	private final Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!rn", name = "C", descriptor = "Lclient!aa;")
	private final Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!rn", name = "I", descriptor = "Lclient!aa;")
	private final Class2_Sub1 aClass2_Sub1_3;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "[Lclient!aa;")
	private final Class2_Sub1[] aClass2_Sub1Array33;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	private Class2_Sub7_Sub16() {
		this.anIntArray496 = new int[0];
		this.anIntArray495 = new int[0];
		this.aClass2_Sub1_1 = new Class2_Sub1_Sub35(0);
		this.aClass2_Sub1_1.anInt7039 = 1;
		this.aClass2_Sub1_2 = new Class2_Sub1_Sub35();
		this.aClass2_Sub1_2.anInt7039 = 1;
		this.aClass2_Sub1_3 = new Class2_Sub1_Sub35();
		this.aClass2_Sub1_3.anInt7039 = 1;
		this.aClass2_Sub1Array33 = new Class2_Sub1[] { this.aClass2_Sub1_2, this.aClass2_Sub1_3, this.aClass2_Sub1_1 };
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!vt;)V")
	public Class2_Sub7_Sub16(@OriginalArg(0) Class2_Sub24 arg0) {
		@Pc(7) int local7 = arg0.method5732();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub1Array33 = new Class2_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub1 local26 = Static120.method2133(arg0);
			if (local26.method6066() >= 0) {
				local9++;
			}
			if (local26.method6058() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method5732();
			}
			this.aClass2_Sub1Array33[local20] = local26;
		}
		this.anIntArray496 = new int[local9];
		local9 = 0;
		this.anIntArray495 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class2_Sub1 local98 = this.aClass2_Sub1Array33[local91];
			local50 = local98.aClass2_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass2_Sub1Array42[local104] = this.aClass2_Sub1Array33[local18[local91][local104]];
			}
			@Pc(130) int local130 = local98.method6066();
			@Pc(134) int local134 = local98.method6058();
			if (local130 > 0) {
				this.anIntArray496[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray495[local11++] = local134;
			}
			local18[local91] = null;
		}
		this.aClass2_Sub1_2 = this.aClass2_Sub1Array33[arg0.method5732()];
		this.aClass2_Sub1_3 = this.aClass2_Sub1Array33[arg0.method5732()];
		this.aClass2_Sub1_1 = this.aClass2_Sub1Array33[arg0.method5732()];
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZBLclient!g;ZLclient!eg;DII)[I")
	public int[] method5010(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) double arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static266.anInterface3_6 = arg3;
		Static160.aClass83_65 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub1Array33.length; local11++) {
			this.aClass2_Sub1Array33[local11].method6068(arg6, arg5);
		}
		Static264.method3358(arg4);
		Static262.method4488(arg5, arg6);
		@Pc(51) int[] local51 = new int[arg6 * arg5];
		@Pc(61) int local61;
		@Pc(55) int local55;
		@Pc(57) byte local57;
		if (arg2) {
			local55 = -1;
			local57 = -1;
			local61 = arg5 - 1;
		} else {
			local55 = arg5;
			local61 = 0;
			local57 = 1;
		}
		@Pc(71) int local71 = 0;
		for (@Pc(73) int local73 = 0; local73 < arg6; local73++) {
			if (arg0) {
				local71 = local73;
			}
			@Pc(93) int[] local93;
			@Pc(95) int[] local95;
			@Pc(91) int[] local91;
			if (this.aClass2_Sub1_2.aBoolean498) {
				@Pc(89) int[] local89 = this.aClass2_Sub1_2.method6059(local73);
				local91 = local89;
				local93 = local89;
				local95 = local89;
			} else {
				@Pc(103) int[][] local103 = this.aClass2_Sub1_2.method6060(local73);
				local91 = local103[2];
				local93 = local103[0];
				local95 = local103[1];
			}
			for (@Pc(117) int local117 = local61; local117 != local55; local117 += local57) {
				@Pc(125) int local125 = local93[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(143) int local143 = local95[local117] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(160) int local160 = local91[local117] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local143 = Static183.anIntArray291[local143];
				if (local160 < 0) {
					local160 = 0;
				}
				local125 = Static183.anIntArray291[local125];
				local160 = Static183.anIntArray291[local160];
				@Pc(191) int local191 = local160 + (local143 << 8) + (local125 << 16);
				if (local191 != 0) {
					local191 |= 0xFF000000;
				}
				local51[local71++] = local191;
				if (arg0) {
					local71 += arg5 - 1;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass2_Sub1Array33.length; local227++) {
			this.aClass2_Sub1Array33[local227].method6065();
		}
		return local51;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZILclient!eg;Lclient!g;BDI)[I")
	public int[] method5011(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(5) double arg4, @OriginalArg(6) int arg5) {
		Static160.aClass83_65 = arg3;
		Static266.anInterface3_6 = arg2;
		for (@Pc(18) int local18 = 0; local18 < this.aClass2_Sub1Array33.length; local18++) {
			this.aClass2_Sub1Array33[local18].method6068(arg5, arg1);
		}
		Static264.method3358(arg4);
		Static262.method4488(arg1, arg5);
		@Pc(48) int[] local48 = new int[arg5 * arg1 * 4];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < arg5; local52++) {
			@Pc(76) int[] local76;
			@Pc(68) int[] local68;
			@Pc(72) int[] local72;
			@Pc(84) int[] local84;
			if (this.aClass2_Sub1_2.aBoolean498) {
				local84 = this.aClass2_Sub1_2.method6059(local52);
				local76 = local84;
				local68 = local84;
				local72 = local84;
			} else {
				@Pc(64) int[][] local64 = this.aClass2_Sub1_2.method6060(local52);
				local68 = local64[1];
				local72 = local64[2];
				local76 = local64[0];
			}
			if (arg0) {
				local50 = local52;
			}
			if (this.aClass2_Sub1_3.aBoolean498) {
				local84 = this.aClass2_Sub1_3.method6059(local52);
			} else {
				local84 = this.aClass2_Sub1_3.method6060(local52)[0];
			}
			for (@Pc(118) int local118 = arg1 - 1; local118 >= 0; local118--) {
				@Pc(126) int local126 = local76[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(143) int local143 = local68[local118] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(160) int local160 = local72[local118] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local143 = Static183.anIntArray291[local143];
				local126 = Static183.anIntArray291[local126];
				if (local160 < 0) {
					local160 = 0;
				}
				local160 = Static183.anIntArray291[local160];
				@Pc(195) int local195;
				if (local126 == 0 && local143 == 0 && local160 == 0) {
					local195 = 0;
				} else {
					local195 = local84[local118] >> 4;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 < 0) {
						local195 = 0;
					}
				}
				local48[local50++] = (local143 << 8) + (local195 << 24) + (local126 << 16) + local160;
				if (arg0) {
					local50 += arg1 - 1;
				}
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.aClass2_Sub1Array33.length; local253++) {
			this.aClass2_Sub1Array33[local253].method6065();
		}
		return local48;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!eg;Lclient!g;)Z")
	public boolean method5013(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(10) int local10;
		if (Static113.anInt5763 < 0) {
			for (local10 = 0; local10 < this.anIntArray496.length; local10++) {
				if (!arg1.method1958(this.anIntArray496[local10])) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray496.length; local10++) {
				if (!arg1.method1949(this.anIntArray496[local10], Static113.anInt5763)) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray495.length; local10++) {
			if (!arg0.method1277(this.anIntArray495[local10])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!eg;ZILclient!g;II)[F")
	public float[] method5015(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(5) int arg4) {
		Static266.anInterface3_6 = arg0;
		Static160.aClass83_65 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub1Array33.length; local11++) {
			this.aClass2_Sub1Array33[local11].method6068(arg4, arg2);
		}
		Static262.method4488(arg2, arg4);
		@Pc(42) float[] local42 = new float[arg4 * arg2 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
			@Pc(70) int[] local70;
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			if (this.aClass2_Sub1_2.aBoolean498) {
				@Pc(78) int[] local78 = this.aClass2_Sub1_2.method6059(local46);
				local62 = local78;
				local66 = local78;
				local70 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass2_Sub1_2.method6060(local46);
				local62 = local58[1];
				local66 = local58[2];
				local70 = local58[0];
			}
			@Pc(94) int[] local94;
			if (this.aClass2_Sub1_3.aBoolean498) {
				local94 = this.aClass2_Sub1_3.method6059(local46);
			} else {
				local94 = this.aClass2_Sub1_3.method6060(local46)[0];
			}
			if (arg1) {
				local44 = local46 << 2;
			}
			@Pc(120) int[] local120;
			if (this.aClass2_Sub1_1.aBoolean498) {
				local120 = this.aClass2_Sub1_1.method6059(local46);
			} else {
				local120 = this.aClass2_Sub1_1.method6060(local46)[0];
			}
			for (@Pc(134) int local134 = arg2 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local120[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local70[local134] * local170;
				local42[local44++] = (float) local62[local134] * local170;
				local42[local44++] = (float) local66[local134] * local170;
				local42[local44++] = local143;
				if (arg1) {
					local44 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass2_Sub1Array33.length; local231++) {
			this.aClass2_Sub1Array33[local231].method6065();
		}
		return local42;
	}
}
