import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class4_Sub3_Sub15 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "Lclient!jo;")
	private Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "Lclient!jo;")
	private Class4_Sub1 aClass4_Sub1_3;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Lclient!jo;")
	private Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "[Lclient!jo;")
	private Class4_Sub1[] aClass4_Sub1Array19;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class4_Sub3_Sub15(@OriginalArg(0) Class4_Sub10 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg0.method4666();
		this.aClass4_Sub1Array19 = new Class4_Sub1[local9];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local9][];
		@Pc(20) int local20;
		@Pc(27) Class4_Sub1 local27;
		@Pc(46) int local46;
		@Pc(53) int local53;
		for (local20 = 0; local20 < local9; local20++) {
			local27 = Static223.method3586(arg0);
			if (local27.method4725() >= 0) {
				local5++;
			}
			if (local27.method4728() >= 0) {
				local15++;
			}
			local46 = local27.aClass4_Sub1Array42.length;
			local18[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local18[local20][local53] = arg0.method4666();
			}
			this.aClass4_Sub1Array19[local20] = local27;
		}
		this.anIntArray306 = new int[local15];
		local15 = 0;
		this.anIntArray307 = new int[local5];
		local5 = 0;
		for (local20 = 0; local20 < local9; local20++) {
			local27 = this.aClass4_Sub1Array19[local20];
			local46 = local27.aClass4_Sub1Array42.length;
			for (local53 = 0; local53 < local46; local53++) {
				local27.aClass4_Sub1Array42[local53] = this.aClass4_Sub1Array19[local18[local20][local53]];
			}
			local53 = local27.method4725();
			@Pc(133) int local133 = local27.method4728();
			if (local53 > 0) {
				this.anIntArray307[local5++] = local53;
			}
			if (local133 > 0) {
				this.anIntArray306[local15++] = local133;
			}
			local18[local20] = null;
		}
		this.aClass4_Sub1_3 = this.aClass4_Sub1Array19[arg0.method4666()];
		this.aClass4_Sub1_1 = this.aClass4_Sub1Array19[arg0.method4666()];
		this.aClass4_Sub1_2 = this.aClass4_Sub1Array19[arg0.method4666()];
		local18 = null;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(DIILclient!kj;Lclient!fh;IZ)Lclient!vn;")
	public Class4_Sub3_Sub14_Sub1 method2658(@OriginalArg(0) double arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) Class58 arg3, @OriginalArg(5) int arg4) {
		Static13.method200(arg0);
		Static229.anInterface3_1 = arg2;
		Static12.aClass58_7 = arg3;
		Static33.method524(arg1, arg4);
		@Pc(27) Class4_Sub3_Sub14_Sub1 local27 = new Class4_Sub3_Sub14_Sub1(arg1, arg4);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass4_Sub1Array19.length; local29++) {
			this.aClass4_Sub1Array19[local29].method4734(arg4, arg1);
		}
		local29 = 0;
		@Pc(53) int local53;
		for (local53 = 0; local53 < arg4; local53++) {
			@Pc(73) int[] local73;
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			if (this.aClass4_Sub1_3.aBoolean398) {
				@Pc(71) int[] local71 = this.aClass4_Sub1_3.method4731(local53);
				local73 = local71;
				local75 = local71;
				local77 = local71;
			} else {
				@Pc(85) int[][] local85 = this.aClass4_Sub1_3.method4732(local53);
				local75 = local85[1];
				local77 = local85[2];
				local73 = local85[0];
			}
			for (@Pc(101) int local101 = arg1 - 1; local101 >= 0; local101--) {
				@Pc(112) int local112 = local73[local101] >> 4;
				@Pc(118) int local118 = local75[local101] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				if (local112 > 255) {
					local112 = 255;
				}
				if (local112 < 0) {
					local112 = 0;
				}
				local112 = Static150.anIntArray267[local112];
				local118 = Static150.anIntArray267[local118];
				@Pc(158) int local158 = local77[local101] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				if (local158 < 0) {
					local158 = 0;
				}
				local158 = Static150.anIntArray267[local158];
				local27.anIntArray241[local29++] = local158 + (local112 << 16) + (local118 << 8);
			}
		}
		for (local53 = 0; local53 < this.aClass4_Sub1Array19.length; local53++) {
			this.aClass4_Sub1Array19[local53].method4733();
		}
		return local27;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBILclient!fh;DLclient!kj;Z)[I")
	public int[] method2659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(12) int[] local12 = new int[arg1 * arg0 * 4];
		Static13.method200(arg3);
		Static229.anInterface3_1 = arg4;
		Static12.aClass58_7 = arg2;
		Static33.method524(arg0, arg1);
		@Pc(25) int local25;
		for (local25 = 0; local25 < this.aClass4_Sub1Array19.length; local25++) {
			this.aClass4_Sub1Array19[local25].method4734(arg1, arg0);
		}
		local25 = 0;
		for (@Pc(57) int local57 = 0; local57 < arg1; local57++) {
			if (arg5) {
				local25 = local57;
			}
			@Pc(83) int[] local83;
			@Pc(91) int[] local91;
			@Pc(87) int[] local87;
			@Pc(99) int[] local99;
			if (this.aClass4_Sub1_3.aBoolean398) {
				local99 = this.aClass4_Sub1_3.method4731(local57);
				local91 = local99;
				local83 = local99;
				local87 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass4_Sub1_3.method4732(local57);
				local83 = local79[0];
				local87 = local79[2];
				local91 = local79[1];
			}
			if (this.aClass4_Sub1_1.aBoolean398) {
				local99 = this.aClass4_Sub1_1.method4731(local57);
			} else {
				local99 = this.aClass4_Sub1_1.method4732(local57)[0];
			}
			for (@Pc(129) int local129 = arg0 - 1; local129 >= 0; local129--) {
				@Pc(137) int local137 = local83[local129] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(153) int local153 = local91[local129] >> 4;
				@Pc(159) int local159 = local87[local129] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local137 = Static150.anIntArray267[local137];
				if (local153 < 0) {
					local153 = 0;
				}
				if (local159 > 255) {
					local159 = 255;
				}
				local153 = Static150.anIntArray267[local153];
				if (local159 < 0) {
					local159 = 0;
				}
				local159 = Static150.anIntArray267[local159];
				@Pc(208) int local208;
				if (local137 == 0 && local153 == 0 && local159 == 0) {
					local208 = 0;
				} else {
					local208 = local99[local129] >> 4;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 < 0) {
						local208 = 0;
					}
				}
				local12[local25++] = (local153 << 8) + (local137 << 16) + (local208 << 24) + local159;
				if (arg5) {
					local25 += arg0 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.aClass4_Sub1Array19.length; local261++) {
			this.aClass4_Sub1Array19[local261].method4733();
		}
		return local12;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBZLclient!kj;Lclient!fh;I)[F")
	public float[] method2661(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) Class58 arg3, @OriginalArg(5) int arg4) {
		Static229.anInterface3_1 = arg2;
		@Pc(29) float[] local29 = new float[arg4 * 4 * arg0];
		Static12.aClass58_7 = arg3;
		Static33.method524(arg4, arg0);
		@Pc(37) int local37;
		for (local37 = 0; local37 < this.aClass4_Sub1Array19.length; local37++) {
			this.aClass4_Sub1Array19[local37].method4734(arg0, arg4);
		}
		local37 = 0;
		@Pc(61) int local61;
		for (local61 = 0; local61 < arg0; local61++) {
			if (arg1) {
				local37 = local61 << 2;
			}
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			@Pc(93) int[] local93;
			if (this.aClass4_Sub1_3.aBoolean398) {
				@Pc(101) int[] local101 = this.aClass4_Sub1_3.method4731(local61);
				local93 = local101;
				local85 = local101;
				local89 = local101;
			} else {
				@Pc(81) int[][] local81 = this.aClass4_Sub1_3.method4732(local61);
				local85 = local81[1];
				local89 = local81[0];
				local93 = local81[2];
			}
			@Pc(117) int[] local117;
			if (this.aClass4_Sub1_1.aBoolean398) {
				local117 = this.aClass4_Sub1_1.method4731(local61);
			} else {
				local117 = this.aClass4_Sub1_1.method4732(local61)[0];
			}
			@Pc(137) int[] local137;
			if (this.aClass4_Sub1_2.aBoolean398) {
				local137 = this.aClass4_Sub1_2.method4731(local61);
			} else {
				local137 = this.aClass4_Sub1_2.method4732(local61)[0];
			}
			for (@Pc(151) int local151 = arg4 - 1; local151 >= 0; local151--) {
				@Pc(163) float local163 = (float) local117[local151] / 4096.0F;
				@Pc(176) float local176 = ((float) local137[local151] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local163 < 0.0F) {
					local163 = 0.0F;
				} else if (local163 > 1.0F) {
					local163 = 1.0F;
				}
				local29[local37++] = (float) local89[local151] * local176;
				local29[local37++] = local176 * (float) local85[local151];
				local29[local37++] = (float) local93[local151] * local176;
				local29[local37++] = local163;
				if (arg1) {
					local37 += (arg4 << 2) - 4;
				}
			}
		}
		for (local61 = 0; local61 < this.aClass4_Sub1Array19.length; local61++) {
			this.aClass4_Sub1Array19[local61].method4733();
		}
		return local29;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!kj;Lclient!fh;I)Z")
	public boolean method2662(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class58 arg1) {
		@Pc(26) int local26;
		if (Static227.anInt4367 > 0) {
			for (local26 = 0; local26 < this.anIntArray307.length; local26++) {
				if (!arg1.method1370(Static227.anInt4367, this.anIntArray307[local26])) {
					return false;
				}
			}
		} else {
			for (local26 = 0; local26 < this.anIntArray307.length; local26++) {
				if (!arg1.method1359(this.anIntArray307[local26])) {
					return false;
				}
			}
		}
		for (local26 = 0; local26 < this.anIntArray306.length; local26++) {
			if (!arg0.method416(this.anIntArray306[local26])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!kj;Lclient!fh;IDIZ)Lclient!jn;")
	public Class4_Sub3_Sub14_Sub1_Sub1 method2663(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4) {
		Static13.method200(arg3);
		Static229.anInterface3_1 = arg1;
		Static12.aClass58_7 = arg2;
		Static33.method524(arg4, arg0);
		@Pc(30) Class4_Sub3_Sub14_Sub1_Sub1 local30 = new Class4_Sub3_Sub14_Sub1_Sub1(arg4, arg0);
		@Pc(32) int local32;
		for (local32 = 0; local32 < this.aClass4_Sub1Array19.length; local32++) {
			this.aClass4_Sub1Array19[local32].method4734(arg0, arg4);
		}
		local32 = 0;
		@Pc(56) int local56;
		for (local56 = 0; local56 < arg0; local56++) {
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			@Pc(75) int[] local75;
			if (this.aClass4_Sub1_3.aBoolean398) {
				local75 = this.aClass4_Sub1_3.method4731(local56);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass4_Sub1_3.method4732(local56);
				local81 = local89[0];
				local77 = local89[1];
				local79 = local89[2];
			}
			if (this.aClass4_Sub1_1.aBoolean398) {
				local75 = this.aClass4_Sub1_1.method4731(local56);
			} else {
				local75 = this.aClass4_Sub1_1.method4732(local56)[0];
			}
			for (@Pc(125) int local125 = arg4 - 1; local125 >= 0; local125--) {
				@Pc(136) int local136 = local81[local125] >> 4;
				@Pc(142) int local142 = local79[local125] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				@Pc(153) int local153 = local77[local125] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				local142 = Static150.anIntArray267[local142];
				local136 = Static150.anIntArray267[local136];
				if (local153 < 0) {
					local153 = 0;
				}
				local153 = Static150.anIntArray267[local153];
				@Pc(214) int local214;
				if (local136 == 0 && local153 == 0 && local142 == 0) {
					local214 = 0;
				} else {
					local214 = local75[local125] >> 4;
					if (local214 > 255) {
						local214 = 255;
					}
					if (local214 < 0) {
						local214 = 0;
					}
				}
				local30.anIntArray241[local32++] = (local153 << 8) + (local214 << 24) + (local136 << 16) + local142;
			}
		}
		for (local56 = 0; local56 < this.aClass4_Sub1Array19.length; local56++) {
			this.aClass4_Sub1Array19[local56].method4733();
		}
		return local30;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(DZILclient!fh;Lclient!kj;IZI)[I")
	public int[] method2666(@OriginalArg(0) double arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		Static13.method200(arg0);
		Static229.anInterface3_1 = arg3;
		Static12.aClass58_7 = arg2;
		Static33.method524(arg6, arg4);
		@Pc(21) int[] local21 = new int[arg6 * arg4];
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.aClass4_Sub1Array19.length; local23++) {
			this.aClass4_Sub1Array19[local23].method4734(arg4, arg6);
		}
		@Pc(45) int local45;
		@Pc(43) byte local43;
		if (arg5) {
			local23 = arg6 - 1;
			local45 = -1;
			local43 = -1;
		} else {
			local43 = 1;
			local45 = arg6;
			local23 = 0;
		}
		@Pc(59) int local59 = 0;
		@Pc(61) int local61;
		for (local61 = 0; local61 < arg4; local61++) {
			if (arg1) {
				local59 = local61;
			}
			@Pc(88) int[] local88;
			@Pc(96) int[] local96;
			@Pc(92) int[] local92;
			if (this.aClass4_Sub1_3.aBoolean398) {
				@Pc(104) int[] local104 = this.aClass4_Sub1_3.method4731(local61);
				local96 = local104;
				local92 = local104;
				local88 = local104;
			} else {
				@Pc(84) int[][] local84 = this.aClass4_Sub1_3.method4732(local61);
				local88 = local84[0];
				local92 = local84[2];
				local96 = local84[1];
			}
			for (@Pc(112) int local112 = local23; local112 != local45; local112 += local43) {
				@Pc(125) int local125 = local88[local112] >> 4;
				@Pc(131) int local131 = local96[local112] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				@Pc(142) int local142 = local92[local112] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				local131 = Static150.anIntArray267[local131];
				local125 = Static150.anIntArray267[local125];
				if (local142 < 0) {
					local142 = 0;
				}
				local142 = Static150.anIntArray267[local142];
				local21[local59++] = local142 + (local125 << 16) + (local131 << 8);
				if (arg1) {
					local59 += arg6 - 1;
				}
			}
		}
		for (local61 = 0; local61 < this.aClass4_Sub1Array19.length; local61++) {
			this.aClass4_Sub1Array19[local61].method4733();
		}
		return local21;
	}
}
