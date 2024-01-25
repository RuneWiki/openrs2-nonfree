import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class6_Sub5_Sub21 extends Class6_Sub5 {

	@OriginalMember(owner = "client!mp", name = "E", descriptor = "[I")
	private final int[] anIntArray326;

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "[I")
	private final int[] anIntArray325;

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "Lclient!dt;")
	private final Class6_Sub1 aClass6_Sub1_2;

	@OriginalMember(owner = "client!mp", name = "H", descriptor = "Lclient!dt;")
	private final Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!mp", name = "y", descriptor = "Lclient!dt;")
	private final Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!mp", name = "B", descriptor = "[Lclient!dt;")
	private final Class6_Sub1[] aClass6_Sub1Array24;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	private Class6_Sub5_Sub21() {
		this.anIntArray326 = new int[0];
		this.anIntArray325 = new int[0];
		this.aClass6_Sub1_2 = new Class6_Sub1_Sub13(0);
		this.aClass6_Sub1_2.anInt10697 = 1;
		this.aClass6_Sub1_3 = new Class6_Sub1_Sub13();
		this.aClass6_Sub1_3.anInt10697 = 1;
		this.aClass6_Sub1_1 = new Class6_Sub1_Sub13();
		this.aClass6_Sub1Array24 = new Class6_Sub1[] { this.aClass6_Sub1_3, this.aClass6_Sub1_1, this.aClass6_Sub1_2 };
		this.aClass6_Sub1_1.anInt10697 = 1;
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class6_Sub5_Sub21(@OriginalArg(0) Class6_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method8246();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass6_Sub1Array24 = new Class6_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub1 local26 = Static188.method3489(arg0);
			if (local26.method8727() >= 0) {
				local9++;
			}
			if (local26.method8723() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass6_Sub1Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method8246();
			}
			this.aClass6_Sub1Array24[local20] = local26;
		}
		this.anIntArray326 = new int[local9];
		local9 = 0;
		this.anIntArray325 = new int[local11];
		local11 = 0;
		for (@Pc(84) int local84 = 0; local84 < local7; local84++) {
			@Pc(91) Class6_Sub1 local91 = this.aClass6_Sub1Array24[local84];
			local47 = local91.aClass6_Sub1Array42.length;
			for (@Pc(97) int local97 = 0; local97 < local47; local97++) {
				local91.aClass6_Sub1Array42[local97] = this.aClass6_Sub1Array24[local18[local84][local97]];
			}
			@Pc(119) int local119 = local91.method8727();
			@Pc(123) int local123 = local91.method8723();
			if (local119 > 0) {
				this.anIntArray326[local9++] = local119;
			}
			if (local123 > 0) {
				this.anIntArray325[local11++] = local123;
			}
			local18[local84] = null;
		}
		this.aClass6_Sub1_3 = this.aClass6_Sub1Array24[arg0.method8246()];
		this.aClass6_Sub1_1 = this.aClass6_Sub1Array24[arg0.method8246()];
		this.aClass6_Sub1_2 = this.aClass6_Sub1Array24[arg0.method8246()];
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!ni;Lclient!d;)Z")
	public boolean method5764(@OriginalArg(1) Class223 arg0, @OriginalArg(2) Interface7 arg1) {
		@Pc(12) int local12;
		if (Static410.anInt7633 < 0) {
			for (local12 = 0; local12 < this.anIntArray326.length; local12++) {
				if (!arg0.method5951(this.anIntArray326[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray326.length; local12++) {
				if (!arg0.method5960(this.anIntArray326[local12], Static410.anInt7633)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray325.length; local12++) {
			if (!arg1.method6928(this.anIntArray325[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!d;Lclient!ni;BIIZ)[F")
	public float[] method5765(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static76.anInterface7_5 = arg0;
		Static244.aClass223_59 = arg1;
		for (@Pc(19) int local19 = 0; local19 < this.aClass6_Sub1Array24.length; local19++) {
			this.aClass6_Sub1Array24[local19].method8729(arg3, arg2);
		}
		Static25.method714(arg2, arg3);
		@Pc(46) float[] local46 = new float[arg2 * 4 * arg3];
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg3; local50++) {
			@Pc(64) int[] local64;
			@Pc(68) int[] local68;
			@Pc(66) int[] local66;
			if (this.aClass6_Sub1_3.aBoolean842) {
				@Pc(62) int[] local62 = this.aClass6_Sub1_3.method8721(local50);
				local64 = local62;
				local66 = local62;
				local68 = local62;
			} else {
				@Pc(76) int[][] local76 = this.aClass6_Sub1_3.method8728(local50);
				local66 = local76[2];
				local68 = local76[1];
				local64 = local76[0];
			}
			@Pc(98) int[] local98;
			if (this.aClass6_Sub1_1.aBoolean842) {
				local98 = this.aClass6_Sub1_1.method8721(local50);
			} else {
				local98 = this.aClass6_Sub1_1.method8728(local50)[0];
			}
			@Pc(120) int[] local120;
			if (this.aClass6_Sub1_2.aBoolean842) {
				local120 = this.aClass6_Sub1_2.method8721(local50);
			} else {
				local120 = this.aClass6_Sub1_2.method8728(local50)[0];
			}
			if (arg4) {
				local48 = local50 << 2;
			}
			for (@Pc(138) int local138 = arg2 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local98[local138] / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				@Pc(174) float local174 = ((float) local120[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local46[local48++] = local174 * (float) local64[local138];
				local46[local48++] = local174 * (float) local68[local138];
				local46[local48++] = (float) local66[local138] * local174;
				local46[local48++] = local147;
				if (arg4) {
					local48 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass6_Sub1Array24.length; local231++) {
			this.aClass6_Sub1Array24[local231].method8724();
		}
		return local46;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZLclient!d;DZLclient!ni;IB)[I")
	public int[] method5766(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) double arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class223 arg5, @OriginalArg(6) int arg6) {
		Static244.aClass223_59 = arg5;
		Static76.anInterface7_5 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub1Array24.length; local11++) {
			this.aClass6_Sub1Array24[local11].method8729(arg0, arg6);
		}
		Static507.method7287(arg3);
		Static25.method714(arg6, arg0);
		@Pc(43) int[] local43 = new int[arg0 * arg6];
		@Pc(53) int local53;
		@Pc(47) int local47;
		@Pc(49) byte local49;
		if (arg1) {
			local47 = -1;
			local49 = -1;
			local53 = arg6 - 1;
		} else {
			local49 = 1;
			local53 = 0;
			local47 = arg6;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg0; local65++) {
			if (arg4) {
				local63 = local65;
			}
			@Pc(85) int[] local85;
			@Pc(93) int[] local93;
			@Pc(89) int[] local89;
			if (this.aClass6_Sub1_3.aBoolean842) {
				@Pc(101) int[] local101 = this.aClass6_Sub1_3.method8721(local65);
				local93 = local101;
				local89 = local101;
				local85 = local101;
			} else {
				@Pc(81) int[][] local81 = this.aClass6_Sub1_3.method8728(local65);
				local85 = local81[0];
				local89 = local81[2];
				local93 = local81[1];
			}
			for (@Pc(109) int local109 = local53; local109 != local47; local109 += local49) {
				@Pc(117) int local117 = local85[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(132) int local132 = local93[local109] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(149) int local149 = local89[local109] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				local117 = Static317.anIntArray293[local117];
				local132 = Static317.anIntArray293[local132];
				local149 = Static317.anIntArray293[local149];
				@Pc(186) int local186 = (local117 << 16) - (-(local132 << 8) - local149);
				if (local186 != 0) {
					local186 |= 0xFF000000;
				}
				local43[local63++] = local186;
				if (arg4) {
					local63 += arg6 - 1;
				}
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.aClass6_Sub1Array24.length; local226++) {
			this.aClass6_Sub1Array24[local226].method8724();
		}
		return local43;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZDILclient!d;Lclient!ni;BI)[I")
	public int[] method5768(@OriginalArg(0) boolean arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class223 arg4, @OriginalArg(6) int arg5) {
		Static244.aClass223_59 = arg4;
		Static76.anInterface7_5 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub1Array24.length; local11++) {
			this.aClass6_Sub1Array24[local11].method8729(arg2, arg5);
		}
		Static507.method7287(arg1);
		Static25.method714(arg5, arg2);
		@Pc(47) int[] local47 = new int[arg5 * arg2];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg2; local51++) {
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			@Pc(83) int[] local83;
			if (this.aClass6_Sub1_3.aBoolean842) {
				local83 = this.aClass6_Sub1_3.method8721(local51);
				local67 = local83;
				local71 = local83;
				local75 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass6_Sub1_3.method8728(local51);
				local67 = local63[0];
				local71 = local63[1];
				local75 = local63[2];
			}
			if (arg0) {
				local49 = local51;
			}
			if (this.aClass6_Sub1_1.aBoolean842) {
				local83 = this.aClass6_Sub1_1.method8721(local51);
			} else {
				local83 = this.aClass6_Sub1_1.method8728(local51)[0];
			}
			for (@Pc(117) int local117 = arg5 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local67[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(143) int local143 = local71[local117] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(163) int local163 = local75[local117] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				local143 = Static317.anIntArray293[local143];
				if (local163 < 0) {
					local163 = 0;
				}
				local125 = Static317.anIntArray293[local125];
				local163 = Static317.anIntArray293[local163];
				@Pc(203) int local203;
				if (local125 == 0 && local143 == 0 && local163 == 0) {
					local203 = 0;
				} else {
					local203 = local83[local117] >> 4;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 < 0) {
						local203 = 0;
					}
				}
				local47[local49++] = (local143 << 8) + (local125 << 16) + (local203 << 24) + local163;
				if (arg0) {
					local49 += arg5 - 1;
				}
			}
		}
		for (@Pc(263) int local263 = 0; local263 < this.aClass6_Sub1Array24.length; local263++) {
			this.aClass6_Sub1Array24[local263].method8724();
		}
		return local47;
	}
}
