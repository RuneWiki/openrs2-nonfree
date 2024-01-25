import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "[I")
	private final int[] anIntArray302;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "[I")
	private final int[] anIntArray301;

	@OriginalMember(owner = "client!ht", name = "H", descriptor = "Lclient!al;")
	private final Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!ht", name = "F", descriptor = "Lclient!al;")
	private final Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "Lclient!al;")
	private final Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "[Lclient!al;")
	private final Class1_Sub3[] aClass1_Sub3Array13;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	private Class1_Sub2_Sub8() {
		this.anIntArray302 = new int[0];
		this.anIntArray301 = new int[0];
		this.aClass1_Sub3_3 = new Class1_Sub3_Sub36(0);
		this.aClass1_Sub3_3.anInt9504 = 1;
		this.aClass1_Sub3_2 = new Class1_Sub3_Sub36();
		this.aClass1_Sub3_2.anInt9504 = 1;
		this.aClass1_Sub3_1 = new Class1_Sub3_Sub36();
		this.aClass1_Sub3Array13 = new Class1_Sub3[] { this.aClass1_Sub3_2, this.aClass1_Sub3_1, this.aClass1_Sub3_3 };
		this.aClass1_Sub3_1.anInt9504 = 1;
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class1_Sub2_Sub8(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method4487();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass1_Sub3Array13 = new Class1_Sub3[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub3 local26 = Static332.method5653(arg0);
			if (local26.method8204() >= 0) {
				local9++;
			}
			if (local26.method8189() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub3Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method4487();
			}
			this.aClass1_Sub3Array13[local20] = local26;
		}
		this.anIntArray301 = new int[local9];
		this.anIntArray302 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class1_Sub3 local95 = this.aClass1_Sub3Array13[local88];
			local47 = local95.aClass1_Sub3Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass1_Sub3Array42[local101] = this.aClass1_Sub3Array13[local18[local88][local101]];
			}
			@Pc(127) int local127 = local95.method8204();
			@Pc(131) int local131 = local95.method8189();
			if (local127 > 0) {
				this.anIntArray301[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray302[local11++] = local131;
			}
			local18[local88] = null;
		}
		this.aClass1_Sub3_2 = this.aClass1_Sub3Array13[arg0.method4487()];
		this.aClass1_Sub3_1 = this.aClass1_Sub3Array13[arg0.method4487()];
		this.aClass1_Sub3_3 = this.aClass1_Sub3Array13[arg0.method4487()];
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZILclient!dn;ZLclient!n;I)[F")
	public float[] method3615(@OriginalArg(1) int arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Interface13 arg3, @OriginalArg(5) int arg4) {
		Static312.aClass69_62 = arg1;
		Static526.anInterface13_14 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array13.length; local11++) {
			this.aClass1_Sub3Array13[local11].method8198(arg0, arg4);
		}
		Static338.method3566(arg0, arg4);
		@Pc(42) float[] local42 = new float[arg0 * arg4 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
			@Pc(62) int[] local62;
			@Pc(70) int[] local70;
			@Pc(66) int[] local66;
			if (this.aClass1_Sub3_2.aBoolean708) {
				@Pc(78) int[] local78 = this.aClass1_Sub3_2.method8193(local46);
				local70 = local78;
				local66 = local78;
				local62 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass1_Sub3_2.method8190(local46);
				local62 = local58[0];
				local66 = local58[2];
				local70 = local58[1];
			}
			@Pc(94) int[] local94;
			if (this.aClass1_Sub3_1.aBoolean708) {
				local94 = this.aClass1_Sub3_1.method8193(local46);
			} else {
				local94 = this.aClass1_Sub3_1.method8190(local46)[0];
			}
			@Pc(114) int[] local114;
			if (this.aClass1_Sub3_3.aBoolean708) {
				local114 = this.aClass1_Sub3_3.method8193(local46);
			} else {
				local114 = this.aClass1_Sub3_3.method8190(local46)[0];
			}
			if (arg2) {
				local44 = local46 << 2;
			}
			for (@Pc(134) int local134 = arg0 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local114[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local62[local134] * local170;
				local42[local44++] = (float) local70[local134] * local170;
				local42[local44++] = (float) local66[local134] * local170;
				local42[local44++] = local143;
				if (arg2) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass1_Sub3Array13.length; local237++) {
			this.aClass1_Sub3Array13[local237].method8195();
		}
		return local42;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!n;Lclient!dn;DBIZI)[I")
	public int[] method3616(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) double arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static526.anInterface13_14 = arg0;
		Static312.aClass69_62 = arg1;
		for (@Pc(17) int local17 = 0; local17 < this.aClass1_Sub3Array13.length; local17++) {
			this.aClass1_Sub3Array13[local17].method8198(arg3, arg5);
		}
		Static312.method5403(arg2);
		Static338.method3566(arg3, arg5);
		@Pc(51) int[] local51 = new int[arg5 * 4 * arg3];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg5; local55++) {
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			@Pc(79) int[] local79;
			@Pc(87) int[] local87;
			if (this.aClass1_Sub3_2.aBoolean708) {
				local87 = this.aClass1_Sub3_2.method8193(local55);
				local79 = local87;
				local75 = local87;
				local71 = local87;
			} else {
				@Pc(67) int[][] local67 = this.aClass1_Sub3_2.method8190(local55);
				local71 = local67[0];
				local75 = local67[1];
				local79 = local67[2];
			}
			if (this.aClass1_Sub3_1.aBoolean708) {
				local87 = this.aClass1_Sub3_1.method8193(local55);
			} else {
				local87 = this.aClass1_Sub3_1.method8190(local55)[0];
			}
			if (arg4) {
				local53 = local55;
			}
			for (@Pc(121) int local121 = arg3 - 1; local121 >= 0; local121--) {
				@Pc(129) int local129 = local71[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				@Pc(144) int local144 = local75[local121] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(164) int local164 = local79[local121] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				local129 = Static417.anIntArray703[local129];
				if (local164 < 0) {
					local164 = 0;
				}
				local144 = Static417.anIntArray703[local144];
				local164 = Static417.anIntArray703[local164];
				@Pc(204) int local204;
				if (local129 == 0 && local144 == 0 && local164 == 0) {
					local204 = 0;
				} else {
					local204 = local87[local121] >> 4;
					if (local204 > 255) {
						local204 = 255;
					}
					if (local204 < 0) {
						local204 = 0;
					}
				}
				local51[local53++] = (local144 << 8) + (local204 << 24) + (local129 << 16) + local164;
				if (arg4) {
					local53 += arg3 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.aClass1_Sub3Array13.length; local261++) {
			this.aClass1_Sub3Array13[local261].method8195();
		}
		return local51;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZZDILclient!n;BILclient!dn;)[I")
	public int[] method3618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface13 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class69 arg6) {
		Static312.aClass69_62 = arg6;
		Static526.anInterface13_14 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array13.length; local11++) {
			this.aClass1_Sub3Array13[local11].method8198(arg5, arg3);
		}
		Static312.method5403(arg2);
		Static338.method3566(arg5, arg3);
		@Pc(43) int[] local43 = new int[arg3 * arg5];
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(51) byte local51;
		if (arg1) {
			local49 = arg5 - 1;
			local51 = -1;
			local53 = -1;
		} else {
			local49 = 0;
			local51 = 1;
			local53 = arg5;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
			@Pc(85) int[] local85;
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			if (this.aClass1_Sub3_2.aBoolean708) {
				@Pc(97) int[] local97 = this.aClass1_Sub3_2.method8193(local65);
				local89 = local97;
				local85 = local97;
				local81 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub3_2.method8190(local65);
				local81 = local77[1];
				local85 = local77[0];
				local89 = local77[2];
			}
			if (arg0) {
				local63 = local65;
			}
			for (@Pc(109) int local109 = local49; local109 != local53; local109 += local51) {
				@Pc(117) int local117 = local85[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local81[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(152) int local152 = local89[local109] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local135 = Static417.anIntArray703[local135];
				local117 = Static417.anIntArray703[local117];
				if (local152 < 0) {
					local152 = 0;
				}
				local152 = Static417.anIntArray703[local152];
				@Pc(185) int local185 = local152 + (local135 << 8) + (local117 << 16);
				if (local185 != 0) {
					local185 |= 0xFF000000;
				}
				local43[local63++] = local185;
				if (arg0) {
					local63 += arg5 - 1;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass1_Sub3Array13.length; local224++) {
			this.aClass1_Sub3Array13[local224].method8195();
		}
		return local43;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!dn;ILclient!n;)Z")
	public boolean method3620(@OriginalArg(0) Class69 arg0, @OriginalArg(2) Interface13 arg1) {
		@Pc(10) int local10;
		if (Static219.anInt4314 < 0) {
			for (local10 = 0; local10 < this.anIntArray301.length; local10++) {
				if (!arg0.method1896(this.anIntArray301[local10])) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray301.length; local10++) {
				if (!arg0.method1893(Static219.anInt4314, this.anIntArray301[local10])) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray302.length; local10++) {
			if (!arg1.method5788(this.anIntArray302[local10])) {
				return false;
			}
		}
		return true;
	}
}
