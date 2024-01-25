import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class3_Sub7_Sub12 extends Class3_Sub7 {

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "[I")
	private final int[] anIntArray519;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "[I")
	private final int[] anIntArray520;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "Lclient!jd;")
	private final Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Lclient!jd;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "Lclient!jd;")
	private final Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "[Lclient!jd;")
	private final Class3_Sub1[] aClass3_Sub1Array33;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	private Class3_Sub7_Sub12() {
		this.anIntArray519 = new int[0];
		this.anIntArray520 = new int[0];
		this.aClass3_Sub1_3 = new Class3_Sub1_Sub29(0);
		this.aClass3_Sub1_3.anInt6208 = 1;
		this.aClass3_Sub1_1 = new Class3_Sub1_Sub29();
		this.aClass3_Sub1_1.anInt6208 = 1;
		this.aClass3_Sub1_2 = new Class3_Sub1_Sub29();
		this.aClass3_Sub1Array33 = new Class3_Sub1[] { this.aClass3_Sub1_1, this.aClass3_Sub1_2, this.aClass3_Sub1_3 };
		this.aClass3_Sub1_2.anInt6208 = 1;
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!rp;)V")
	public Class3_Sub7_Sub12(@OriginalArg(0) Class3_Sub5 arg0) {
		@Pc(7) int local7 = arg0.method2739();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub1Array33 = new Class3_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub1 local26 = Static91.method2643(arg0);
			if (local26.method5553() >= 0) {
				local9++;
			}
			if (local26.method5542() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass3_Sub1Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method2739();
			}
			this.aClass3_Sub1Array33[local20] = local26;
		}
		this.anIntArray520 = new int[local9];
		this.anIntArray519 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class3_Sub1 local95 = this.aClass3_Sub1Array33[local88];
			local47 = local95.aClass3_Sub1Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass3_Sub1Array42[local101] = this.aClass3_Sub1Array33[local18[local88][local101]];
			}
			@Pc(123) int local123 = local95.method5553();
			@Pc(127) int local127 = local95.method5542();
			if (local123 > 0) {
				this.anIntArray520[local9++] = local123;
			}
			if (local127 > 0) {
				this.anIntArray519[local11++] = local127;
			}
			local18[local88] = null;
		}
		this.aClass3_Sub1_1 = this.aClass3_Sub1Array33[arg0.method2739()];
		this.aClass3_Sub1_2 = this.aClass3_Sub1Array33[arg0.method2739()];
		this.aClass3_Sub1_3 = this.aClass3_Sub1Array33[arg0.method2739()];
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILclient!b;ILclient!wp;IZD)[I")
	public int[] method4231(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface10 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) double arg6) {
		Static221.anInterface10_4 = arg4;
		Static245.aClass20_55 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array33.length; local11++) {
			this.aClass3_Sub1Array33[local11].method5544(arg3, arg1);
		}
		Static100.method1660(arg6);
		Static223.method3716(arg3, arg1);
		@Pc(41) int[] local41 = new int[arg1 * arg3];
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(45) byte local45;
		if (arg5) {
			local45 = -1;
			local49 = -1;
			local47 = arg3 - 1;
		} else {
			local45 = 1;
			local47 = 0;
			local49 = arg3;
		}
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			if (this.aClass3_Sub1_1.aBoolean487) {
				@Pc(75) int[] local75 = this.aClass3_Sub1_1.method5550(local63);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(91) int[][] local91 = this.aClass3_Sub1_1.method5541(local63);
				local79 = local91[2];
				local81 = local91[0];
				local77 = local91[1];
			}
			if (arg0) {
				local61 = local63;
			}
			for (@Pc(109) int local109 = local47; local109 != local49; local109 += local45) {
				@Pc(117) int local117 = local81[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local77[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(150) int local150 = local79[local109] >> 4;
				if (local150 > 255) {
					local150 = 255;
				}
				local117 = Static285.anIntArray557[local117];
				if (local150 < 0) {
					local150 = 0;
				}
				local135 = Static285.anIntArray557[local135];
				local150 = Static285.anIntArray557[local150];
				@Pc(181) int local181 = local150 + (local135 << 8) + (local117 << 16);
				if (local181 != 0) {
					local181 |= 0xFF000000;
				}
				local41[local61++] = local181;
				if (arg0) {
					local61 += arg3 - 1;
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.aClass3_Sub1Array33.length; local217++) {
			this.aClass3_Sub1Array33[local217].method5543();
		}
		return local41;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILclient!b;ILclient!wp;DZ)[I")
	public int[] method4232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(4) Interface10 arg3, @OriginalArg(5) double arg4, @OriginalArg(6) boolean arg5) {
		Static221.anInterface10_4 = arg3;
		Static245.aClass20_55 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array33.length; local11++) {
			this.aClass3_Sub1Array33[local11].method5544(arg0, arg1);
		}
		Static100.method1660(arg4);
		Static223.method3716(arg0, arg1);
		@Pc(45) int[] local45 = new int[arg0 * 4 * arg1];
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
			@Pc(87) int[] local87;
			@Pc(79) int[] local79;
			@Pc(83) int[] local83;
			@Pc(95) int[] local95;
			if (this.aClass3_Sub1_1.aBoolean487) {
				local95 = this.aClass3_Sub1_1.method5550(local63);
				local83 = local95;
				local79 = local95;
				local87 = local95;
			} else {
				@Pc(75) int[][] local75 = this.aClass3_Sub1_1.method5541(local63);
				local79 = local75[1];
				local83 = local75[2];
				local87 = local75[0];
			}
			if (this.aClass3_Sub1_2.aBoolean487) {
				local95 = this.aClass3_Sub1_2.method5550(local63);
			} else {
				local95 = this.aClass3_Sub1_2.method5541(local63)[0];
			}
			if (arg5) {
				local61 = local63;
			}
			for (@Pc(129) int local129 = arg0 - 1; local129 >= 0; local129--) {
				@Pc(137) int local137 = local87[local129] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(154) int local154 = local79[local129] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				@Pc(169) int local169 = local83[local129] >> 4;
				if (local169 > 255) {
					local169 = 255;
				}
				local154 = Static285.anIntArray557[local154];
				local137 = Static285.anIntArray557[local137];
				if (local169 < 0) {
					local169 = 0;
				}
				local169 = Static285.anIntArray557[local169];
				@Pc(202) int local202;
				if (local137 == 0 && local154 == 0 && local169 == 0) {
					local202 = 0;
				} else {
					local202 = local95[local129] >> 4;
					if (local202 > 255) {
						local202 = 255;
					}
					if (local202 < 0) {
						local202 = 0;
					}
				}
				local45[local61++] = local169 + (local137 << 16) + (local202 << 24) + (local154 << 8);
				if (arg5) {
					local61 += arg0 - 1;
				}
			}
		}
		for (@Pc(256) int local256 = 0; local256 < this.aClass3_Sub1Array33.length; local256++) {
			this.aClass3_Sub1Array33[local256].method5543();
		}
		return local45;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLclient!b;Lclient!wp;)Z")
	public boolean method4233(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Interface10 arg1) {
		@Pc(18) int local18;
		if (Static108.anInt2138 >= 0) {
			for (local18 = 0; local18 < this.anIntArray520.length; local18++) {
				if (!arg0.method233(Static108.anInt2138, this.anIntArray520[local18])) {
					return false;
				}
			}
		} else {
			for (local18 = 0; local18 < this.anIntArray520.length; local18++) {
				if (!arg0.method226(this.anIntArray520[local18])) {
					return false;
				}
			}
		}
		for (local18 = 0; local18 < this.anIntArray519.length; local18++) {
			if (!arg1.method191(this.anIntArray519[local18])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!b;Lclient!wp;IIZ)[F")
	public float[] method4235(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Interface10 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		Static245.aClass20_55 = arg1;
		Static221.anInterface10_4 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array33.length; local11++) {
			this.aClass3_Sub1Array33[local11].method5544(arg3, arg0);
		}
		Static223.method3716(arg3, arg0);
		@Pc(40) float[] local40 = new float[arg0 * arg3 * 4];
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = 0; local44 < arg0; local44++) {
			@Pc(68) int[] local68;
			@Pc(60) int[] local60;
			@Pc(64) int[] local64;
			if (this.aClass3_Sub1_1.aBoolean487) {
				@Pc(76) int[] local76 = this.aClass3_Sub1_1.method5550(local44);
				local64 = local76;
				local60 = local76;
				local68 = local76;
			} else {
				@Pc(56) int[][] local56 = this.aClass3_Sub1_1.method5541(local44);
				local60 = local56[1];
				local64 = local56[2];
				local68 = local56[0];
			}
			@Pc(92) int[] local92;
			if (this.aClass3_Sub1_2.aBoolean487) {
				local92 = this.aClass3_Sub1_2.method5550(local44);
			} else {
				local92 = this.aClass3_Sub1_2.method5541(local44)[0];
			}
			if (arg4) {
				local42 = local44 << 2;
			}
			@Pc(118) int[] local118;
			if (this.aClass3_Sub1_3.aBoolean487) {
				local118 = this.aClass3_Sub1_3.method5550(local44);
			} else {
				local118 = this.aClass3_Sub1_3.method5541(local44)[0];
			}
			for (@Pc(132) int local132 = arg3 - 1; local132 >= 0; local132--) {
				@Pc(141) float local141 = (float) local92[local132] / 4096.0F;
				@Pc(154) float local154 = ((float) local118[local132] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local141 < 0.0F) {
					local141 = 0.0F;
				} else if (local141 > 1.0F) {
					local141 = 1.0F;
				}
				local40[local42++] = local154 * (float) local68[local132];
				local40[local42++] = local154 * (float) local60[local132];
				local40[local42++] = local154 * (float) local64[local132];
				local40[local42++] = local141;
				if (arg4) {
					local42 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass3_Sub1Array33.length; local225++) {
			this.aClass3_Sub1Array33[local225].method5543();
		}
		return local40;
	}
}
