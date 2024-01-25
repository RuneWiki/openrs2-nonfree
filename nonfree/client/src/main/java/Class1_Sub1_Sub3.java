import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "[I")
	private final int[] anIntArray212;

	@OriginalMember(owner = "client!eea", name = "x", descriptor = "[I")
	private final int[] anIntArray213;

	@OriginalMember(owner = "client!eea", name = "r", descriptor = "Lclient!ar;")
	private final Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "Lclient!ar;")
	private final Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!eea", name = "u", descriptor = "Lclient!ar;")
	private final Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "[Lclient!ar;")
	private final Class1_Sub3[] aClass1_Sub3Array12;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub3() {
		this.anIntArray212 = new int[0];
		this.anIntArray213 = new int[0];
		this.aClass1_Sub3_2 = new Class1_Sub3_Sub10(0);
		this.aClass1_Sub3_2.anInt8686 = 1;
		this.aClass1_Sub3_1 = new Class1_Sub3_Sub10();
		this.aClass1_Sub3_1.anInt8686 = 1;
		this.aClass1_Sub3_3 = new Class1_Sub3_Sub10();
		this.aClass1_Sub3Array12 = new Class1_Sub3[] { this.aClass1_Sub3_1, this.aClass1_Sub3_3, this.aClass1_Sub3_2 };
		this.aClass1_Sub3_3.anInt8686 = 1;
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) Class1_Sub6 arg0) {
		@Pc(7) int local7 = arg0.method3922();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub3Array12 = new Class1_Sub3[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub3 local26 = Static102.method1744(arg0);
			if (local26.method7124() >= 0) {
				local9++;
			}
			if (local26.method7127() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub3Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method3922();
			}
			this.aClass1_Sub3Array12[local20] = local26;
		}
		this.anIntArray213 = new int[local9];
		local9 = 0;
		this.anIntArray212 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class1_Sub3 local95 = this.aClass1_Sub3Array12[local88];
			local47 = local95.aClass1_Sub3Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass1_Sub3Array42[local101] = this.aClass1_Sub3Array12[local14[local88][local101]];
			}
			@Pc(123) int local123 = local95.method7124();
			@Pc(127) int local127 = local95.method7127();
			if (local123 > 0) {
				this.anIntArray213[local9++] = local123;
			}
			if (local127 > 0) {
				this.anIntArray212[local11++] = local127;
			}
			local14[local88] = null;
		}
		this.aClass1_Sub3_1 = this.aClass1_Sub3Array12[arg0.method3922()];
		this.aClass1_Sub3_3 = this.aClass1_Sub3Array12[arg0.method3922()];
		this.aClass1_Sub3_2 = this.aClass1_Sub3Array12[arg0.method3922()];
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIZLclient!n;ILclient!kr;D)[I")
	public int[] method1827(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class171 arg4, @OriginalArg(6) double arg5) {
		Static354.aClass171_104 = arg4;
		Static63.anInterface8_6 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array12.length; local11++) {
			this.aClass1_Sub3Array12[local11].method7119(arg0, arg3);
		}
		Static188.method2931(arg5);
		Static190.method2953(arg0, arg3);
		@Pc(47) int[] local47 = new int[arg0 * arg3 * 4];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg3; local51++) {
			@Pc(71) int[] local71;
			@Pc(67) int[] local67;
			@Pc(75) int[] local75;
			@Pc(83) int[] local83;
			if (this.aClass1_Sub3_1.aBoolean614) {
				local83 = this.aClass1_Sub3_1.method7123(local51);
				local71 = local83;
				local75 = local83;
				local67 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass1_Sub3_1.method7125(local51);
				local67 = local63[1];
				local71 = local63[0];
				local75 = local63[2];
			}
			if (arg1) {
				local49 = local51;
			}
			if (this.aClass1_Sub3_3.aBoolean614) {
				local83 = this.aClass1_Sub3_3.method7123(local51);
			} else {
				local83 = this.aClass1_Sub3_3.method7125(local51)[0];
			}
			for (@Pc(117) int local117 = arg0 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local71[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(140) int local140 = local67[local117] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(157) int local157 = local75[local117] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				local140 = Static193.anIntArray695[local140];
				local125 = Static193.anIntArray695[local125];
				local157 = Static193.anIntArray695[local157];
				@Pc(201) int local201;
				if (local125 == 0 && local140 == 0 && local157 == 0) {
					local201 = 0;
				} else {
					local201 = local83[local117] >> 4;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 < 0) {
						local201 = 0;
					}
				}
				local47[local49++] = local157 + (local201 << 24) + (local125 << 16) + (local140 << 8);
				if (arg1) {
					local49 += arg0 - 1;
				}
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.aClass1_Sub3Array12.length; local253++) {
			this.aClass1_Sub3Array12[local253].method7122();
		}
		return local47;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!n;Lclient!kr;I)Z")
	public boolean method1828(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class171 arg1) {
		@Pc(9) int local9;
		if (Static501.anInt8494 >= 0) {
			for (local9 = 0; local9 < this.anIntArray213.length; local9++) {
				if (!arg1.method4336(this.anIntArray213[local9], Static501.anInt8494)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray213.length; local9++) {
				if (!arg1.method4327(this.anIntArray213[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray212.length; local9++) {
			if (!arg0.method879(this.anIntArray212[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!kr;ILclient!n;ZZDI)[I")
	public int[] method1829(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface8 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) double arg6) {
		Static63.anInterface8_6 = arg3;
		Static354.aClass171_104 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array12.length; local11++) {
			this.aClass1_Sub3Array12[local11].method7119(arg0, arg2);
		}
		Static188.method2931(arg6);
		Static190.method2953(arg0, arg2);
		@Pc(43) int[] local43 = new int[arg0 * arg2];
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(49) byte local49;
		if (arg5) {
			local51 = -1;
			local47 = arg0 - 1;
			local49 = -1;
		} else {
			local47 = 0;
			local49 = 1;
			local51 = arg0;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg2; local65++) {
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub3_1.aBoolean614) {
				@Pc(97) int[] local97 = this.aClass1_Sub3_1.method7123(local65);
				local85 = local97;
				local89 = local97;
				local81 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub3_1.method7125(local65);
				local81 = local77[0];
				local85 = local77[2];
				local89 = local77[1];
			}
			if (arg4) {
				local63 = local65;
			}
			for (@Pc(109) int local109 = local47; local109 != local51; local109 += local49) {
				@Pc(117) int local117 = local81[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(134) int local134 = local89[local109] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(152) int local152 = local85[local109] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local117 = Static193.anIntArray695[local117];
				if (local152 < 0) {
					local152 = 0;
				}
				local134 = Static193.anIntArray695[local134];
				local152 = Static193.anIntArray695[local152];
				@Pc(186) int local186 = (local117 << 16) - (-(local134 << 8) - local152);
				if (local186 != 0) {
					local186 |= 0xFF000000;
				}
				local43[local63++] = local186;
				if (arg4) {
					local63 += arg0 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass1_Sub3Array12.length; local229++) {
			this.aClass1_Sub3Array12[local229].method7122();
		}
		return local43;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZLclient!kr;IILclient!n;)[F")
	public float[] method1831(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface8 arg4) {
		Static354.aClass171_104 = arg2;
		Static63.anInterface8_6 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array12.length; local11++) {
			this.aClass1_Sub3Array12[local11].method7119(arg3, arg0);
		}
		Static190.method2953(arg3, arg0);
		@Pc(42) float[] local42 = new float[arg0 * arg3 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			@Pc(64) int[] local64;
			@Pc(60) int[] local60;
			@Pc(62) int[] local62;
			if (this.aClass1_Sub3_1.aBoolean614) {
				@Pc(58) int[] local58 = this.aClass1_Sub3_1.method7123(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(72) int[][] local72 = this.aClass1_Sub3_1.method7125(local46);
				local62 = local72[2];
				local60 = local72[1];
				local64 = local72[0];
			}
			@Pc(96) int[] local96;
			if (this.aClass1_Sub3_3.aBoolean614) {
				local96 = this.aClass1_Sub3_3.method7123(local46);
			} else {
				local96 = this.aClass1_Sub3_3.method7125(local46)[0];
			}
			if (arg1) {
				local44 = local46 << 2;
			}
			@Pc(122) int[] local122;
			if (this.aClass1_Sub3_2.aBoolean614) {
				local122 = this.aClass1_Sub3_2.method7123(local46);
			} else {
				local122 = this.aClass1_Sub3_2.method7125(local46)[0];
			}
			for (@Pc(134) int local134 = arg3 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local96[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local122[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local64[local134] * local170;
				local42[local44++] = local170 * (float) local60[local134];
				local42[local44++] = (float) local62[local134] * local170;
				local42[local44++] = local143;
				if (arg1) {
					local44 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass1_Sub3Array12.length; local237++) {
			this.aClass1_Sub3Array12[local237].method7122();
		}
		return local42;
	}
}
