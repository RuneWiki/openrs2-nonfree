import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class3_Sub3_Sub18 extends Class3_Sub3 {

	@OriginalMember(owner = "client!wba", name = "s", descriptor = "[I")
	private final int[] anIntArray680;

	@OriginalMember(owner = "client!wba", name = "x", descriptor = "[I")
	private final int[] anIntArray681;

	@OriginalMember(owner = "client!wba", name = "E", descriptor = "Lclient!mfa;")
	private final Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!wba", name = "z", descriptor = "Lclient!mfa;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!wba", name = "F", descriptor = "Lclient!mfa;")
	private final Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!wba", name = "t", descriptor = "[Lclient!mfa;")
	private final Class3_Sub1[] aClass3_Sub1Array40;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
	private Class3_Sub3_Sub18() {
		this.anIntArray680 = new int[0];
		this.anIntArray681 = new int[0];
		this.aClass3_Sub1_2 = new Class3_Sub1_Sub30(0);
		this.aClass3_Sub1_2.anInt9360 = 1;
		this.aClass3_Sub1_1 = new Class3_Sub1_Sub30();
		this.aClass3_Sub1_1.anInt9360 = 1;
		this.aClass3_Sub1_3 = new Class3_Sub1_Sub30();
		this.aClass3_Sub1Array40 = new Class3_Sub1[] { this.aClass3_Sub1_1, this.aClass3_Sub1_3, this.aClass3_Sub1_2 };
		this.aClass3_Sub1_3.anInt9360 = 1;
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!qh;)V")
	public Class3_Sub3_Sub18(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method3118();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub1Array40 = new Class3_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub1 local26 = Static526.method6986(arg0);
			if (local26.method7762() >= 0) {
				local9++;
			}
			if (local26.method7770() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass3_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method3118();
			}
			this.aClass3_Sub1Array40[local20] = local26;
		}
		this.anIntArray680 = new int[local9];
		local9 = 0;
		this.anIntArray681 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class3_Sub1 local98 = this.aClass3_Sub1Array40[local91];
			local50 = local98.aClass3_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass3_Sub1Array42[local104] = this.aClass3_Sub1Array40[local18[local91][local104]];
			}
			@Pc(130) int local130 = local98.method7762();
			@Pc(134) int local134 = local98.method7770();
			if (local130 > 0) {
				this.anIntArray680[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray681[local11++] = local134;
			}
			local18[local91] = null;
		}
		this.aClass3_Sub1_1 = this.aClass3_Sub1Array40[arg0.method3118()];
		this.aClass3_Sub1_3 = this.aClass3_Sub1Array40[arg0.method3118()];
		this.aClass3_Sub1_2 = this.aClass3_Sub1Array40[arg0.method3118()];
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILclient!om;Lclient!fa;ZII)[F")
	public float[] method7634(@OriginalArg(0) int arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		Static454.aClass246_214 = arg1;
		Static381.anInterface8_11 = arg2;
		for (@Pc(19) int local19 = 0; local19 < this.aClass3_Sub1Array40.length; local19++) {
			this.aClass3_Sub1Array40[local19].method7771(arg0, arg4);
		}
		Static296.method4706(arg0, arg4);
		@Pc(46) float[] local46 = new float[arg0 * 4 * arg4];
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg0; local50++) {
			@Pc(64) int[] local64;
			@Pc(68) int[] local68;
			@Pc(66) int[] local66;
			if (this.aClass3_Sub1_1.aBoolean728) {
				@Pc(62) int[] local62 = this.aClass3_Sub1_1.method7767(local50);
				local64 = local62;
				local66 = local62;
				local68 = local62;
			} else {
				@Pc(76) int[][] local76 = this.aClass3_Sub1_1.method7773(local50);
				local64 = local76[0];
				local68 = local76[1];
				local66 = local76[2];
			}
			@Pc(100) int[] local100;
			if (this.aClass3_Sub1_3.aBoolean728) {
				local100 = this.aClass3_Sub1_3.method7767(local50);
			} else {
				local100 = this.aClass3_Sub1_3.method7773(local50)[0];
			}
			if (arg3) {
				local48 = local50 << 2;
			}
			@Pc(128) int[] local128;
			if (this.aClass3_Sub1_2.aBoolean728) {
				local128 = this.aClass3_Sub1_2.method7767(local50);
			} else {
				local128 = this.aClass3_Sub1_2.method7773(local50)[0];
			}
			for (@Pc(142) int local142 = arg4 - 1; local142 >= 0; local142--) {
				@Pc(151) float local151 = (float) local100[local142] / 4096.0F;
				if (local151 < 0.0F) {
					local151 = 0.0F;
				} else if (local151 > 1.0F) {
					local151 = 1.0F;
				}
				@Pc(178) float local178 = ((float) local128[local142] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local46[local48++] = (float) local64[local142] * local178;
				local46[local48++] = local178 * (float) local68[local142];
				local46[local48++] = (float) local66[local142] * local178;
				local46[local48++] = local151;
				if (arg3) {
					local48 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(239) int local239 = 0; local239 < this.aClass3_Sub1Array40.length; local239++) {
			this.aClass3_Sub1Array40[local239].method7764();
		}
		return local46;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZLclient!om;IIIZDLclient!fa;)[I")
	public int[] method7637(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) double arg5, @OriginalArg(7) Interface8 arg6) {
		Static454.aClass246_214 = arg1;
		Static381.anInterface8_11 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array40.length; local11++) {
			this.aClass3_Sub1Array40[local11].method7771(arg2, arg3);
		}
		Static207.method3703(arg5);
		Static296.method4706(arg2, arg3);
		@Pc(49) int[] local49 = new int[arg2 * arg3];
		@Pc(55) int local55;
		@Pc(53) int local53;
		@Pc(57) byte local57;
		if (arg4) {
			local55 = arg3 - 1;
			local57 = -1;
			local53 = -1;
		} else {
			local53 = arg3;
			local55 = 0;
			local57 = 1;
		}
		@Pc(69) int local69 = 0;
		for (@Pc(71) int local71 = 0; local71 < arg2; local71++) {
			if (arg0) {
				local69 = local71;
			}
			@Pc(89) int[] local89;
			@Pc(91) int[] local91;
			@Pc(93) int[] local93;
			if (this.aClass3_Sub1_1.aBoolean728) {
				@Pc(87) int[] local87 = this.aClass3_Sub1_1.method7767(local71);
				local89 = local87;
				local91 = local87;
				local93 = local87;
			} else {
				@Pc(101) int[][] local101 = this.aClass3_Sub1_1.method7773(local71);
				local93 = local101[2];
				local89 = local101[0];
				local91 = local101[1];
			}
			for (@Pc(115) int local115 = local55; local115 != local53; local115 += local57) {
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
				local138 = Static273.anIntArray591[local138];
				local123 = Static273.anIntArray591[local123];
				if (local155 < 0) {
					local155 = 0;
				}
				local155 = Static273.anIntArray591[local155];
				@Pc(187) int local187 = (local123 << 16) - (-(local138 << 8) - local155);
				if (local187 != 0) {
					local187 |= 0xFF000000;
				}
				local49[local69++] = local187;
				if (arg0) {
					local69 += arg3 - 1;
				}
			}
		}
		for (@Pc(230) int local230 = 0; local230 < this.aClass3_Sub1Array40.length; local230++) {
			this.aClass3_Sub1Array40[local230].method7764();
		}
		return local49;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!om;IDIILclient!fa;Z)[I")
	public int[] method7638(@OriginalArg(0) Class246 arg0, @OriginalArg(2) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface8 arg4, @OriginalArg(6) boolean arg5) {
		Static454.aClass246_214 = arg0;
		Static381.anInterface8_11 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array40.length; local11++) {
			this.aClass3_Sub1Array40[local11].method7771(arg3, arg2);
		}
		Static207.method3703(arg1);
		Static296.method4706(arg3, arg2);
		@Pc(45) int[] local45 = new int[arg2 * arg3 * 4];
		@Pc(47) int local47 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			@Pc(75) int[] local75;
			if (this.aClass3_Sub1_1.aBoolean728) {
				local75 = this.aClass3_Sub1_1.method7767(local63);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass3_Sub1_1.method7773(local63);
				local81 = local89[0];
				local79 = local89[2];
				local77 = local89[1];
			}
			if (this.aClass3_Sub1_3.aBoolean728) {
				local75 = this.aClass3_Sub1_3.method7767(local63);
			} else {
				local75 = this.aClass3_Sub1_3.method7773(local63)[0];
			}
			if (arg5) {
				local47 = local63;
			}
			for (@Pc(133) int local133 = arg2 - 1; local133 >= 0; local133--) {
				@Pc(141) int local141 = local81[local133] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(158) int local158 = local77[local133] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				if (local158 < 0) {
					local158 = 0;
				}
				@Pc(178) int local178 = local79[local133] >> 4;
				if (local178 > 255) {
					local178 = 255;
				}
				local141 = Static273.anIntArray591[local141];
				local158 = Static273.anIntArray591[local158];
				if (local178 < 0) {
					local178 = 0;
				}
				local178 = Static273.anIntArray591[local178];
				@Pc(215) int local215;
				if (local141 == 0 && local158 == 0 && local178 == 0) {
					local215 = 0;
				} else {
					local215 = local75[local133] >> 4;
					if (local215 > 255) {
						local215 = 255;
					}
					if (local215 < 0) {
						local215 = 0;
					}
				}
				local45[local47++] = (local158 << 8) + (local141 << 16) + (local215 << 24) + local178;
				if (arg5) {
					local47 += arg2 - 1;
				}
			}
		}
		for (@Pc(271) int local271 = 0; local271 < this.aClass3_Sub1Array40.length; local271++) {
			this.aClass3_Sub1Array40[local271].method7764();
		}
		return local45;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!fa;Lclient!om;I)Z")
	public boolean method7639(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class246 arg1) {
		@Pc(17) int local17;
		if (Static538.anInt8449 >= 0) {
			for (local17 = 0; local17 < this.anIntArray680.length; local17++) {
				if (!arg1.method5654(Static538.anInt8449, this.anIntArray680[local17])) {
					return false;
				}
			}
		} else {
			for (local17 = 0; local17 < this.anIntArray680.length; local17++) {
				if (!arg1.method5667(this.anIntArray680[local17])) {
					return false;
				}
			}
		}
		for (local17 = 0; local17 < this.anIntArray681.length; local17++) {
			if (!arg0.method6559(this.anIntArray681[local17])) {
				return false;
			}
		}
		return true;
	}
}
