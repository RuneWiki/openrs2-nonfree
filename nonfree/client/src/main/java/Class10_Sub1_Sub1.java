import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!aj", name = "F", descriptor = "[I")
	private final int[] anIntArray10;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "[I")
	private final int[] anIntArray9;

	@OriginalMember(owner = "client!aj", name = "H", descriptor = "Lclient!ej;")
	private final Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "Lclient!ej;")
	private final Class10_Sub2 aClass10_Sub2_3;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Lclient!ej;")
	private final Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!aj", name = "B", descriptor = "[Lclient!ej;")
	private final Class10_Sub2[] aClass10_Sub2Array1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	private Class10_Sub1_Sub1() {
		this.anIntArray10 = new int[0];
		this.anIntArray9 = new int[0];
		this.aClass10_Sub2_2 = new Class10_Sub2_Sub6(0);
		this.aClass10_Sub2_2.anInt7569 = 1;
		this.aClass10_Sub2_3 = new Class10_Sub2_Sub6();
		this.aClass10_Sub2_3.anInt7569 = 1;
		this.aClass10_Sub2_1 = new Class10_Sub2_Sub6();
		this.aClass10_Sub2_1.anInt7569 = 1;
		this.aClass10_Sub2Array1 = new Class10_Sub2[] { this.aClass10_Sub2_3, this.aClass10_Sub2_1, this.aClass10_Sub2_2 };
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!nn;)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class10_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method2502();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass10_Sub2Array1 = new Class10_Sub2[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class10_Sub2 local26 = Static437.method5684(arg0);
			if (local26.method6046() >= 0) {
				local9++;
			}
			if (local26.method6038() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass10_Sub2Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method2502();
			}
			this.aClass10_Sub2Array1[local20] = local26;
		}
		this.anIntArray9 = new int[local9];
		local9 = 0;
		this.anIntArray10 = new int[local11];
		local11 = 0;
		for (@Pc(92) int local92 = 0; local92 < local7; local92++) {
			@Pc(99) Class10_Sub2 local99 = this.aClass10_Sub2Array1[local92];
			local47 = local99.aClass10_Sub2Array42.length;
			for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
				local99.aClass10_Sub2Array42[local105] = this.aClass10_Sub2Array1[local14[local92][local105]];
			}
			@Pc(127) int local127 = local99.method6046();
			@Pc(131) int local131 = local99.method6038();
			if (local127 > 0) {
				this.anIntArray9[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray10[local11++] = local131;
			}
			local14[local92] = null;
		}
		this.aClass10_Sub2_3 = this.aClass10_Sub2Array1[arg0.method2502()];
		this.aClass10_Sub2_1 = this.aClass10_Sub2Array1[arg0.method2502()];
		this.aClass10_Sub2_2 = this.aClass10_Sub2Array1[arg0.method2502()];
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZLclient!l;DILclient!ph;Z)[I")
	public int[] method111(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class187 arg5, @OriginalArg(7) boolean arg6) {
		Static318.aClass187_94 = arg5;
		Static157.anInterface7_4 = arg2;
		for (@Pc(17) int local17 = 0; local17 < this.aClass10_Sub2Array1.length; local17++) {
			this.aClass10_Sub2Array1[local17].method6039(arg4, arg0);
		}
		Static74.method1396(arg3);
		Static229.method3414(arg0, arg4);
		@Pc(49) int[] local49 = new int[arg0 * arg4];
		@Pc(57) int local57;
		@Pc(55) int local55;
		@Pc(53) byte local53;
		if (arg1) {
			local53 = -1;
			local55 = -1;
			local57 = arg0 - 1;
		} else {
			local53 = 1;
			local55 = arg0;
			local57 = 0;
		}
		@Pc(69) int local69 = 0;
		for (@Pc(71) int local71 = 0; local71 < arg4; local71++) {
			if (arg6) {
				local69 = local71;
			}
			@Pc(89) int[] local89;
			@Pc(91) int[] local91;
			@Pc(93) int[] local93;
			if (this.aClass10_Sub2_3.aBoolean499) {
				@Pc(87) int[] local87 = this.aClass10_Sub2_3.method6035(local71);
				local89 = local87;
				local91 = local87;
				local93 = local87;
			} else {
				@Pc(101) int[][] local101 = this.aClass10_Sub2_3.method6037(local71);
				local91 = local101[1];
				local89 = local101[0];
				local93 = local101[2];
			}
			for (@Pc(115) int local115 = local57; local115 != local55; local115 += local53) {
				@Pc(123) int local123 = local89[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(138) int local138 = local91[local115] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(155) int local155 = local93[local115] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				if (local155 < 0) {
					local155 = 0;
				}
				local123 = Static47.anIntArray70[local123];
				local138 = Static47.anIntArray70[local138];
				local155 = Static47.anIntArray70[local155];
				@Pc(189) int local189 = (local138 << 8) + (local123 << 16) + local155;
				if (local189 != 0) {
					local189 |= 0xFF000000;
				}
				local49[local69++] = local189;
				if (arg6) {
					local69 += arg0 - 1;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass10_Sub2Array1.length; local225++) {
			this.aClass10_Sub2Array1[local225].method6047();
		}
		return local49;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ph;Lclient!l;B)Z")
	public boolean method113(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Interface7 arg1) {
		@Pc(9) int local9;
		if (Static380.anInt6529 < 0) {
			for (local9 = 0; local9 < this.anIntArray9.length; local9++) {
				if (!arg0.method4282(this.anIntArray9[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray9.length; local9++) {
				if (!arg0.method4284(this.anIntArray9[local9], Static380.anInt6529)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray10.length; local9++) {
			if (!arg1.method4450(this.anIntArray10[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIDLclient!l;Lclient!ph;II)[I")
	public int[] method115(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class187 arg4, @OriginalArg(5) int arg5) {
		Static157.anInterface7_4 = arg3;
		Static318.aClass187_94 = arg4;
		for (@Pc(23) int local23 = 0; local23 < this.aClass10_Sub2Array1.length; local23++) {
			this.aClass10_Sub2Array1[local23].method6039(arg1, arg5);
		}
		Static74.method1396(arg2);
		Static229.method3414(arg5, arg1);
		@Pc(53) int[] local53 = new int[arg1 * 4 * arg5];
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < arg1; local57++) {
			@Pc(81) int[] local81;
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			@Pc(89) int[] local89;
			if (this.aClass10_Sub2_3.aBoolean499) {
				local89 = this.aClass10_Sub2_3.method6035(local57);
				local81 = local89;
				local73 = local89;
				local77 = local89;
			} else {
				@Pc(69) int[][] local69 = this.aClass10_Sub2_3.method6037(local57);
				local73 = local69[1];
				local77 = local69[2];
				local81 = local69[0];
			}
			if (this.aClass10_Sub2_1.aBoolean499) {
				local89 = this.aClass10_Sub2_1.method6035(local57);
			} else {
				local89 = this.aClass10_Sub2_1.method6037(local57)[0];
			}
			if (arg0) {
				local55 = local57;
			}
			for (@Pc(123) int local123 = arg5 - 1; local123 >= 0; local123--) {
				@Pc(131) int local131 = local81[local123] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(148) int local148 = local73[local123] >> 4;
				if (local148 > 255) {
					local148 = 255;
				}
				if (local148 < 0) {
					local148 = 0;
				}
				@Pc(168) int local168 = local77[local123] >> 4;
				if (local168 > 255) {
					local168 = 255;
				}
				local148 = Static47.anIntArray70[local148];
				local131 = Static47.anIntArray70[local131];
				if (local168 < 0) {
					local168 = 0;
				}
				local168 = Static47.anIntArray70[local168];
				@Pc(208) int local208;
				if (local131 == 0 && local148 == 0 && local168 == 0) {
					local208 = 0;
				} else {
					local208 = local89[local123] >> 4;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 < 0) {
						local208 = 0;
					}
				}
				local53[local55++] = (local148 << 8) + (local131 << 16) + (local208 << 24) + local168;
				if (arg0) {
					local55 += arg5 - 1;
				}
			}
		}
		for (@Pc(263) int local263 = 0; local263 < this.aClass10_Sub2Array1.length; local263++) {
			this.aClass10_Sub2Array1[local263].method6047();
		}
		return local53;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILclient!ph;Lclient!l;IZ)[F")
	public float[] method116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(5) boolean arg4) {
		Static318.aClass187_94 = arg2;
		Static157.anInterface7_4 = arg3;
		for (@Pc(17) int local17 = 0; local17 < this.aClass10_Sub2Array1.length; local17++) {
			this.aClass10_Sub2Array1[local17].method6039(arg1, arg0);
		}
		Static229.method3414(arg0, arg1);
		@Pc(44) float[] local44 = new float[arg1 * arg0 * 4];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(64) int[] local64;
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			if (this.aClass10_Sub2_3.aBoolean499) {
				@Pc(60) int[] local60 = this.aClass10_Sub2_3.method6035(local48);
				local62 = local60;
				local64 = local60;
				local66 = local60;
			} else {
				@Pc(74) int[][] local74 = this.aClass10_Sub2_3.method6037(local48);
				local66 = local74[1];
				local64 = local74[0];
				local62 = local74[2];
			}
			@Pc(96) int[] local96;
			if (this.aClass10_Sub2_1.aBoolean499) {
				local96 = this.aClass10_Sub2_1.method6035(local48);
			} else {
				local96 = this.aClass10_Sub2_1.method6037(local48)[0];
			}
			@Pc(118) int[] local118;
			if (this.aClass10_Sub2_2.aBoolean499) {
				local118 = this.aClass10_Sub2_2.method6035(local48);
			} else {
				local118 = this.aClass10_Sub2_2.method6037(local48)[0];
			}
			if (arg4) {
				local46 = local48 << 2;
			}
			for (@Pc(136) int local136 = arg0 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				@Pc(158) float local158 = ((float) local118[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				local44[local46++] = local158 * (float) local64[local136];
				local44[local46++] = (float) local66[local136] * local158;
				local44[local46++] = (float) local62[local136] * local158;
				local44[local46++] = local145;
				if (arg4) {
					local46 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass10_Sub2Array1.length; local233++) {
			this.aClass10_Sub2Array1[local233].method6047();
		}
		return local44;
	}
}
