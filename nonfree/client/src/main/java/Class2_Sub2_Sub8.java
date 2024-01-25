import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fca", name = "v", descriptor = "[I")
	private final int[] anIntArray185;

	@OriginalMember(owner = "client!fca", name = "t", descriptor = "[I")
	private final int[] anIntArray184;

	@OriginalMember(owner = "client!fca", name = "C", descriptor = "Lclient!eia;")
	private final Class2_Sub6 aClass2_Sub6_3;

	@OriginalMember(owner = "client!fca", name = "x", descriptor = "Lclient!eia;")
	private final Class2_Sub6 aClass2_Sub6_1;

	@OriginalMember(owner = "client!fca", name = "B", descriptor = "Lclient!eia;")
	private final Class2_Sub6 aClass2_Sub6_2;

	@OriginalMember(owner = "client!fca", name = "D", descriptor = "[Lclient!eia;")
	private final Class2_Sub6[] aClass2_Sub6Array10;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
	private Class2_Sub2_Sub8() {
		this.anIntArray185 = new int[0];
		this.anIntArray184 = new int[0];
		this.aClass2_Sub6_3 = new Class2_Sub6_Sub2(0);
		this.aClass2_Sub6_3.anInt10160 = 1;
		this.aClass2_Sub6_1 = new Class2_Sub6_Sub2();
		this.aClass2_Sub6_1.anInt10160 = 1;
		this.aClass2_Sub6_2 = new Class2_Sub6_Sub2();
		this.aClass2_Sub6Array10 = new Class2_Sub6[] { this.aClass2_Sub6_1, this.aClass2_Sub6_2, this.aClass2_Sub6_3 };
		this.aClass2_Sub6_2.anInt10160 = 1;
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class2_Sub2_Sub8(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(7) int local7 = arg0.method8547();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub6Array10 = new Class2_Sub6[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub6 local26 = Static211.method2736(arg0);
			if (local26.method8463() >= 0) {
				local9++;
			}
			if (local26.method8472() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass2_Sub6Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method8547();
			}
			this.aClass2_Sub6Array10[local20] = local26;
		}
		this.anIntArray185 = new int[local9];
		local9 = 0;
		this.anIntArray184 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class2_Sub6 local95 = this.aClass2_Sub6Array10[local88];
			local47 = local95.aClass2_Sub6Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass2_Sub6Array42[local101] = this.aClass2_Sub6Array10[local18[local88][local101]];
			}
			@Pc(127) int local127 = local95.method8463();
			@Pc(131) int local131 = local95.method8472();
			if (local127 > 0) {
				this.anIntArray185[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray184[local11++] = local131;
			}
			local18[local88] = null;
		}
		this.aClass2_Sub6_1 = this.aClass2_Sub6Array10[arg0.method8547()];
		this.aClass2_Sub6_2 = this.aClass2_Sub6Array10[arg0.method8547()];
		this.aClass2_Sub6_3 = this.aClass2_Sub6Array10[arg0.method8547()];
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZDLclient!d;ZIIILclient!wu;)[I")
	public int[] method2220(@OriginalArg(0) boolean arg0, @OriginalArg(1) double arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class380 arg6) {
		Static171.anInterface6_11 = arg2;
		Static113.aClass380_36 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub6Array10.length; local11++) {
			this.aClass2_Sub6Array10[local11].method8460(arg4, arg5);
		}
		Static196.method2806(arg1);
		Static110.method1644(arg5, arg4);
		@Pc(43) int[] local43 = new int[arg4 * arg5];
		@Pc(53) int local53;
		@Pc(47) int local47;
		@Pc(49) byte local49;
		if (arg0) {
			local47 = -1;
			local49 = -1;
			local53 = arg5 - 1;
		} else {
			local47 = arg5;
			local49 = 1;
			local53 = 0;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg4; local65++) {
			if (arg3) {
				local63 = local65;
			}
			@Pc(85) int[] local85;
			@Pc(89) int[] local89;
			@Pc(93) int[] local93;
			if (this.aClass2_Sub6_1.aBoolean743) {
				@Pc(101) int[] local101 = this.aClass2_Sub6_1.method8469(local65);
				local89 = local101;
				local85 = local101;
				local93 = local101;
			} else {
				@Pc(81) int[][] local81 = this.aClass2_Sub6_1.method8470(local65);
				local85 = local81[0];
				local89 = local81[1];
				local93 = local81[2];
			}
			for (@Pc(109) int local109 = local53; local109 != local47; local109 += local49) {
				@Pc(117) int local117 = local85[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local89[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(150) int local150 = local93[local109] >> 4;
				if (local150 > 255) {
					local150 = 255;
				}
				local135 = Static79.anIntArray111[local135];
				local117 = Static79.anIntArray111[local117];
				if (local150 < 0) {
					local150 = 0;
				}
				local150 = Static79.anIntArray111[local150];
				@Pc(183) int local183 = (local135 << 8) + (local117 << 16) + local150;
				if (local183 != 0) {
					local183 |= 0xFF000000;
				}
				local43[local63++] = local183;
				if (arg3) {
					local63 += arg5 - 1;
				}
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.aClass2_Sub6Array10.length; local226++) {
			this.aClass2_Sub6Array10[local226].method8471();
		}
		return local43;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!wu;ILclient!d;)Z")
	public boolean method2221(@OriginalArg(0) Class380 arg0, @OriginalArg(2) Interface6 arg1) {
		@Pc(18) int local18;
		if (Static491.anInt8075 < 0) {
			for (local18 = 0; local18 < this.anIntArray185.length; local18++) {
				if (!arg0.method8638(this.anIntArray185[local18])) {
					return false;
				}
			}
		} else {
			for (local18 = 0; local18 < this.anIntArray185.length; local18++) {
				if (!arg0.method8619(Static491.anInt8075, this.anIntArray185[local18])) {
					return false;
				}
			}
		}
		for (local18 = 0; local18 < this.anIntArray184.length; local18++) {
			if (!arg1.method1493(this.anIntArray184[local18])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!d;ZLclient!wu;IIB)[F")
	public float[] method2223(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static171.anInterface6_11 = arg0;
		Static113.aClass380_36 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub6Array10.length; local11++) {
			this.aClass2_Sub6Array10[local11].method8460(arg3, arg4);
		}
		Static110.method1644(arg4, arg3);
		@Pc(38) float[] local38 = new float[arg3 * arg4 * 4];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
			@Pc(56) int[] local56;
			@Pc(60) int[] local60;
			@Pc(58) int[] local58;
			if (this.aClass2_Sub6_1.aBoolean743) {
				@Pc(54) int[] local54 = this.aClass2_Sub6_1.method8469(local42);
				local56 = local54;
				local58 = local54;
				local60 = local54;
			} else {
				@Pc(68) int[][] local68 = this.aClass2_Sub6_1.method8470(local42);
				local60 = local68[1];
				local58 = local68[2];
				local56 = local68[0];
			}
			@Pc(92) int[] local92;
			if (this.aClass2_Sub6_2.aBoolean743) {
				local92 = this.aClass2_Sub6_2.method8469(local42);
			} else {
				local92 = this.aClass2_Sub6_2.method8470(local42)[0];
			}
			@Pc(110) int[] local110;
			if (this.aClass2_Sub6_3.aBoolean743) {
				local110 = this.aClass2_Sub6_3.method8469(local42);
			} else {
				local110 = this.aClass2_Sub6_3.method8470(local42)[0];
			}
			if (arg1) {
				local40 = local42 << 2;
			}
			for (@Pc(130) int local130 = arg4 - 1; local130 >= 0; local130--) {
				@Pc(139) float local139 = (float) local92[local130] / 4096.0F;
				if (local139 < 0.0F) {
					local139 = 0.0F;
				} else if (local139 > 1.0F) {
					local139 = 1.0F;
				}
				@Pc(166) float local166 = ((float) local110[local130] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local38[local40++] = local166 * (float) local56[local130];
				local38[local40++] = local166 * (float) local60[local130];
				local38[local40++] = local166 * (float) local58[local130];
				local38[local40++] = local139;
				if (arg1) {
					local40 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass2_Sub6Array10.length; local227++) {
			this.aClass2_Sub6Array10[local227].method8471();
		}
		return local38;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!d;Lclient!wu;ZIBID)[I")
	public int[] method2225(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) double arg5) {
		Static171.anInterface6_11 = arg0;
		Static113.aClass380_36 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub6Array10.length; local11++) {
			this.aClass2_Sub6Array10[local11].method8460(arg4, arg3);
		}
		Static196.method2806(arg5);
		Static110.method1644(arg3, arg4);
		@Pc(39) int[] local39 = new int[arg4 * arg3];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg4; local43++) {
			@Pc(67) int[] local67;
			@Pc(59) int[] local59;
			@Pc(63) int[] local63;
			@Pc(75) int[] local75;
			if (this.aClass2_Sub6_1.aBoolean743) {
				local75 = this.aClass2_Sub6_1.method8469(local43);
				local63 = local75;
				local59 = local75;
				local67 = local75;
			} else {
				@Pc(55) int[][] local55 = this.aClass2_Sub6_1.method8470(local43);
				local59 = local55[1];
				local63 = local55[2];
				local67 = local55[0];
			}
			if (arg2) {
				local41 = local43;
			}
			if (this.aClass2_Sub6_2.aBoolean743) {
				local75 = this.aClass2_Sub6_2.method8469(local43);
			} else {
				local75 = this.aClass2_Sub6_2.method8470(local43)[0];
			}
			for (@Pc(109) int local109 = arg3 - 1; local109 >= 0; local109--) {
				@Pc(117) int local117 = local67[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(132) int local132 = local59[local109] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(147) int local147 = local63[local109] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				local117 = Static79.anIntArray111[local117];
				local132 = Static79.anIntArray111[local132];
				if (local147 < 0) {
					local147 = 0;
				}
				local147 = Static79.anIntArray111[local147];
				@Pc(181) int local181;
				if (local117 == 0 && local132 == 0 && local147 == 0) {
					local181 = 0;
				} else {
					local181 = local75[local109] >> 4;
					if (local181 > 255) {
						local181 = 255;
					}
					if (local181 < 0) {
						local181 = 0;
					}
				}
				local39[local41++] = (local132 << 8) + (local117 << 16) + (local181 << 24) + local147;
				if (arg2) {
					local41 += arg3 - 1;
				}
			}
		}
		for (@Pc(246) int local246 = 0; local246 < this.aClass2_Sub6Array10.length; local246++) {
			this.aClass2_Sub6Array10[local246].method8471();
		}
		return local39;
	}
}
