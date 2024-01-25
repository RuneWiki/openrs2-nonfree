import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class14_Sub1_Sub1_Sub3_Sub1 extends Class14_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!fha", name = "hd", descriptor = "Lclient!uea;")
	public Class339 aClass339_1;

	@OriginalMember(owner = "client!fha", name = "id", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!fha", name = "nd", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!fha", name = "rd", descriptor = "I")
	public int anInt2732;

	@OriginalMember(owner = "client!fha", name = "Dd", descriptor = "I")
	private int anInt2741;

	@OriginalMember(owner = "client!fha", name = "Nd", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!fha", name = "Zc", descriptor = "I")
	public int anInt2719 = -1;

	@OriginalMember(owner = "client!fha", name = "Qc", descriptor = "I")
	public int anInt2711 = -1;

	@OriginalMember(owner = "client!fha", name = "Uc", descriptor = "I")
	public int anInt2714 = -1;

	@OriginalMember(owner = "client!fha", name = "dd", descriptor = "I")
	public int anInt2722 = 0;

	@OriginalMember(owner = "client!fha", name = "ld", descriptor = "I")
	public int anInt2727 = 0;

	@OriginalMember(owner = "client!fha", name = "ed", descriptor = "I")
	public int anInt2723 = 0;

	@OriginalMember(owner = "client!fha", name = "ud", descriptor = "I")
	public int anInt2734 = -1;

	@OriginalMember(owner = "client!fha", name = "xd", descriptor = "Z")
	public boolean aBoolean238 = false;

	@OriginalMember(owner = "client!fha", name = "sd", descriptor = "I")
	public int anInt2733 = -1;

	@OriginalMember(owner = "client!fha", name = "yd", descriptor = "I")
	public int anInt2737 = 255;

	@OriginalMember(owner = "client!fha", name = "fd", descriptor = "B")
	private byte aByte61 = 0;

	@OriginalMember(owner = "client!fha", name = "td", descriptor = "Z")
	public boolean aBoolean237 = false;

	@OriginalMember(owner = "client!fha", name = "Ed", descriptor = "I")
	public int anInt2742 = -1;

	@OriginalMember(owner = "client!fha", name = "Jd", descriptor = "I")
	public int anInt2746 = -1;

	@OriginalMember(owner = "client!fha", name = "Id", descriptor = "Z")
	public boolean aBoolean240 = false;

	@OriginalMember(owner = "client!fha", name = "kd", descriptor = "I")
	public int anInt2726 = -1;

	@OriginalMember(owner = "client!fha", name = "ad", descriptor = "I")
	public int anInt2720 = 0;

	@OriginalMember(owner = "client!fha", name = "Pd", descriptor = "B")
	private byte aByte63 = 0;

	@OriginalMember(owner = "client!fha", name = "Fd", descriptor = "I")
	public int anInt2743 = 0;

	@OriginalMember(owner = "client!fha", name = "Cd", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!fha", name = "Kd", descriptor = "B")
	private byte aByte62 = 0;

	@OriginalMember(owner = "client!fha", name = "Rd", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!fha", name = "j", descriptor = "(I)I")
	@Override
	public int method2509() {
		return this.aClass339_1 == null || this.aClass339_1.anInt9388 == -1 ? super.method2509() : Static258.aClass138_1.method3202(this.aClass339_1.anInt9388).anInt7335;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(B)I")
	@Override
	protected int method2524() {
		return this.anInt2741;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BZII)V")
	public void method2367(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt2972 < 9) {
			super.anInt2972++;
		}
		for (@Pc(32) int local32 = super.anInt2972; local32 > 0; local32--) {
			super.anIntArray253[local32] = super.anIntArray253[local32 - 1];
			super.anIntArray252[local32] = super.anIntArray252[local32 - 1];
			super.aByteArray27[local32] = super.aByteArray27[local32 - 1];
		}
		super.anIntArray253[0] = arg2;
		super.anIntArray252[0] = arg1;
		super.aByteArray27[0] = arg0;
	}

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "(B)Z")
	public boolean method2368() {
		return this.aClass339_1 != null;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
		if (this.aClass339_1 == null || !super.aBoolean259 && !this.method2377(0, arg0)) {
			return;
		}
		@Pc(28) Class117 local28 = arg0.method7018();
		local28.method7242(super.aClass130_7.method2930());
		local28.method7247(super.anInt9317, super.anInt9321 - 5, super.anInt9315);
		this.method2516(super.aClass180Array3, arg0, local28, super.aBoolean259);
		for (@Pc(55) int local55 = 0; local55 < super.aClass180Array3.length; local55++) {
			super.aClass180Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass339_1 == null || !this.method2377(131072, arg0)) {
			return false;
		}
		@Pc(19) Class117 local19 = arg0.method7018();
		@Pc(24) int local24 = super.aClass130_7.method2930();
		local19.method7242(local24);
		local19.method7247(super.anInt9317, super.anInt9321, super.anInt9315);
		@Pc(37) boolean local37 = false;
		for (@Pc(44) int local44 = 0; super.aClass180Array3.length > local44; local44++) {
			if (super.aClass180Array3[local44] != null && (Static605.aBoolean812 ? super.aClass180Array3[local44].method7929(arg2, arg1, local19, true, 0, Static461.anInt7840) : super.aClass180Array3[local44].method7946(arg2, arg1, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass180Array3[0] = super.aClass180Array3[1] = super.aClass180Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZLclient!ee;)V")
	public void method2369(@OriginalArg(1) Class5_Sub12 arg0) {
		arg0.anInt10154 = 0;
		@Pc(12) int local12 = arg0.method8645();
		this.aByte61 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean239;
		this.aBoolean239 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method2509();
		this.method2525((local12 >> 3 & 0x7) + 1);
		this.aByte62 = (byte) (local12 >> 6 & 0x3);
		super.anInt9317 += this.method2509() - local45 << 8;
		super.anInt9315 += this.method2509() - local45 << 8;
		this.aByte63 = arg0.method8635();
		this.anInt2734 = arg0.method8635();
		this.anInt2733 = arg0.method8635();
		this.aBoolean241 = arg0.method8635() == 1;
		if (Static363.aClass346_4 == Static34.aClass346_2 && Static408.anInt7025 >= 2) {
			this.aBoolean241 = false;
		}
		@Pc(124) int local124 = -1;
		this.anInt2720 = 0;
		@Pc(130) int[] local130 = new int[12];
		@Pc(153) int local153;
		@Pc(159) int local159;
		@Pc(199) int local199;
		for (@Pc(132) int local132 = 0; local132 < 12; local132++) {
			@Pc(138) int local138 = arg0.method8645();
			if (local138 == 0) {
				local130[local132] = 0;
			} else {
				local153 = arg0.method8645();
				local159 = local153 + (local138 << 8);
				if (local132 == 0 && local159 == 65535) {
					local124 = arg0.method8631();
					this.anInt2720 = arg0.method8645();
					break;
				}
				if (local159 >= 32768) {
					local159 = Static417.anIntArray573[local159 - 32768];
					local130[local132] = local159 | 0x40000000;
					local199 = Static479.aClass348_1.method8197(local159).anInt9052;
					if (local199 != 0) {
						this.anInt2720 = local199;
					}
				} else {
					local130[local132] = local159 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(221) int[] local221 = new int[5];
		for (local153 = 0; local153 < 5; local153++) {
			local159 = arg0.method8645();
			if (Static550.aShortArrayArrayArray3.length < 1 || local159 < 0 || local159 >= Static550.aShortArrayArrayArray3[0][local153].length) {
				local159 = 0;
			}
			local221[local153] = local159;
		}
		this.anInt2741 = arg0.method8631();
		this.aString43 = arg0.method8617();
		this.aString42 = this.aString43;
		if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == this) {
			Static195.aString54 = this.aString43;
		}
		this.anInt2723 = arg0.method8645();
		if (local41) {
			this.anInt2722 = arg0.method8631();
			this.anInt2719 = -1;
			if (this.anInt2722 == 65535) {
				this.anInt2722 = -1;
			}
			this.anInt2743 = this.anInt2723;
		} else {
			this.anInt2722 = 0;
			this.anInt2743 = arg0.method8645();
			this.anInt2719 = arg0.method8645();
			if (this.anInt2719 == 255) {
				this.anInt2719 = -1;
			}
		}
		local159 = this.anInt2727;
		this.anInt2727 = arg0.method8645();
		@Pc(363) int local363;
		if (this.anInt2727 == 0) {
			Static261.method3993(this);
		} else {
			local199 = this.anInt2742;
			@Pc(360) int local360 = this.anInt2726;
			local363 = this.anInt2746;
			@Pc(366) int local366 = this.anInt2711;
			@Pc(369) int local369 = this.anInt2737;
			this.anInt2742 = arg0.method8631();
			this.anInt2726 = arg0.method8631();
			this.anInt2746 = arg0.method8631();
			this.anInt2711 = arg0.method8631();
			this.anInt2737 = arg0.method8645();
			if (this.aBoolean239 != local21 || this.anInt2727 != local159 || this.anInt2742 != local199 || this.anInt2726 != local360 || local363 != this.anInt2746 || local366 != this.anInt2711 || this.anInt2737 != local369) {
				Static482.method8273(this);
			}
		}
		if (this.aClass339_1 == null) {
			this.aClass339_1 = new Class339();
		}
		local199 = this.aClass339_1.anInt9388;
		@Pc(453) int[] local453 = this.aClass339_1.anIntArray746;
		this.aClass339_1.method8050(this.aByte61 == 1, local130, local124, this.method2524(), local221);
		if (local199 != local124) {
			super.anInt9317 = (super.anIntArray253[0] << 9) + (this.method2509() << 8);
			super.anInt9315 = (super.anIntArray252[0] << 9) + (this.method2509() << 8);
		}
		if (Static620.anInt10055 == super.anInt2960 && local453 != null) {
			for (local363 = 0; local363 < local221.length; local363++) {
				if (local221[local363] != local453[local363]) {
					Static479.aClass348_1.method8207();
					break;
				}
			}
		}
		if (super.aClass14_Sub8_4 != null) {
			super.aClass14_Sub8_4.method4457();
		}
		if (super.anInt2924 == -1 || !super.aBoolean257) {
			return;
		}
		@Pc(557) Class295 local557 = this.method2519();
		if (!local557.method6936(super.anInt2924)) {
			super.aBoolean257 = false;
			super.anInt2924 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIB)V")
	public void method2371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt2973 = 0;
		super.anIntArray253[0] = arg1;
		super.anInt2971 = 0;
		super.anInt2972 = 0;
		super.anIntArray252[0] = arg0;
		@Pc(31) int local31 = this.method2509();
		super.anInt9315 = super.anIntArray252[0] * 512 + local31 * 256;
		super.anInt9317 = local31 * 256 + super.anIntArray253[0] * 512;
		if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == this) {
			Static571.method8044();
		}
		if (super.aClass14_Sub8_4 != null) {
			super.aClass14_Sub8_4.method4457();
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BIII)V")
	public void method2372(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt2930 != -1 && Static396.aClass359_2.method8415(super.anInt2930).anInt4873 == 1) {
			super.anIntArray243 = null;
			super.anInt2930 = -1;
		}
		for (@Pc(29) int local29 = 0; super.aClass315Array3.length > local29; local29++) {
			if (super.aClass315Array3[local29].anInt8720 != -1) {
				@Pc(48) Class68 local48 = Static452.aClass170_4.method4001(super.aClass315Array3[local29].anInt8720);
				if (local48.aBoolean114 && local48.anInt1416 != -1 && Static396.aClass359_2.method8415(local48.anInt1416).anInt4873 == 1) {
					super.aClass315Array3[local29].anInt8720 = -1;
				}
			}
		}
		this.anInt2714 = -1;
		if (arg2 < 0 || arg2 >= Static111.anInt1752 || arg1 < 0 || arg1 >= Static279.anInt4567) {
			this.method2371(arg1, arg2);
		} else if (super.anIntArray253[0] >= 0 && Static111.anInt1752 > super.anIntArray253[0] && super.anIntArray252[0] >= 0 && Static279.anInt4567 > super.anIntArray252[0]) {
			if (arg0 == 2) {
				Static150.method2196(arg1, arg2, this);
			}
			this.method2367(arg0, arg1, arg2);
		} else {
			this.method2371(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method2373() {
		return this.aString42;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		if (this.aClass339_1 == null || !this.method2377(2048, arg0)) {
			return null;
		}
		@Pc(19) Class117 local19 = arg0.method7018();
		@Pc(24) int local24 = super.aClass130_7.method2930();
		local19.method7242(local24);
		@Pc(42) Class156 local42 = Static535.aClass156ArrayArrayArray2[super.aByte125][super.anInt9317 >> Static162.anInt2830][super.anInt9315 >> Static162.anInt2830];
		if (local42 == null || local42.aClass14_Sub1_Sub5_1 == null) {
			super.anInt2907 = (int) ((float) super.anInt2907 - (float) super.anInt2907 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt2907 - local42.aClass14_Sub1_Sub5_1.aShort102;
			super.anInt2907 = (int) ((float) super.anInt2907 - (float) local69 / 10.0F);
		}
		local19.method7247(super.anInt9317, -super.anInt2907 + super.anInt9321 - 20, super.anInt9315);
		@Pc(96) Class14_Sub10 local96 = null;
		super.aBoolean258 = false;
		if (Static627.aClass5_Sub46_31.aClass11_Sub26_1.method7773() == 1) {
			@Pc(111) Class295 local111 = this.method2519();
			if (local111.aBoolean661 && (this.aClass339_1.anInt9388 == -1 || Static258.aClass138_1.method3202(this.aClass339_1.anInt9388).aBoolean610)) {
				@Pc(146) Class200 local146 = super.anInt2930 != -1 && super.anInt2918 == 0 ? Static396.aClass359_2.method8415(super.anInt2930) : null;
				@Pc(167) Class200 local167 = super.anInt2924 == -1 || this.aBoolean237 || super.aBoolean257 && local146 != null ? null : Static396.aClass359_2.method8415(super.anInt2924);
				@Pc(199) Class180 local199 = Static106.method1535(super.anInt2958, super.aClass180Array3[0], 1, arg0, super.anInt2932, super.anInt2917, local167 == null ? super.anInt2914 : super.anInt2933, local24, 160, 240, 0, local167 == null ? local146 : local167, 0);
				if (local199 != null) {
					local96 = Static443.method6589(true, super.aClass180Array3.length + 1);
					super.aBoolean258 = true;
					arg0.C(false);
					if (Static605.aBoolean812) {
						local199.method7950(local19, local96.aClass14_Sub9Array1[super.aClass180Array3.length], Static461.anInt7840, 0);
					} else {
						local199.method7949(local19, local96.aClass14_Sub9Array1[super.aClass180Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(260) int local260;
		if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == this) {
			local19.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			for (local260 = Static568.aClass16Array1.length - 1; local260 >= 0; local260--) {
				@Pc(266) Class16 local266 = Static568.aClass16Array1[local260];
				if (local266 != null && local266.anInt397 != -1) {
					@Pc(297) int local297;
					if (local266.anInt407 == 1) {
						@Pc(285) Class5_Sub13 local285 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local266.anInt403);
						if (local285 != null) {
							@Pc(290) Class14_Sub1_Sub1_Sub3_Sub2 local290 = local285.aClass14_Sub1_Sub1_Sub3_Sub2_1;
							local297 = local290.anInt9317 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317;
							@Pc(304) int local304 = local290.anInt9315 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315;
							if (Static605.aBoolean812) {
								this.method2376(Static461.anInt7840, super.aClass180Array3[0], local297, local304, 92160000, local266.anInt397, arg0, local19);
							} else {
								this.method2378(local266.anInt397, local19, arg0, local297, local304, 92160000, super.aClass180Array3[0]);
							}
						}
					}
					@Pc(360) int local360;
					if (local266.anInt407 == 2) {
						@Pc(351) int local351 = local266.anInt398 + 256 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317;
						local360 = local266.anInt402 + 256 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315;
						local297 = local266.anInt406 << 9;
						local297 *= local297;
						if (Static605.aBoolean812) {
							this.method2376(Static461.anInt7840, super.aClass180Array3[0], local351, local360, local297, local266.anInt397, arg0, local19);
						} else {
							this.method2378(local266.anInt397, local19, arg0, local351, local360, local297, super.aClass180Array3[0]);
						}
					}
					if (local266.anInt407 == 10 && local266.anInt403 >= 0 && Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1.length > local266.anInt403) {
						@Pc(428) Class14_Sub1_Sub1_Sub3_Sub1 local428 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local266.anInt403];
						if (local428 != null) {
							local360 = local428.anInt9317 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317;
							local297 = local428.anInt9315 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315;
							if (Static605.aBoolean812) {
								this.method2376(Static461.anInt7840, super.aClass180Array3[0], local360, local297, 92160000, local266.anInt397, arg0, local19);
							} else {
								this.method2378(local266.anInt397, local19, arg0, local360, local297, 92160000, super.aClass180Array3[0]);
							}
						}
					}
				}
			}
			local19.method7242(local24);
			local19.method7247(super.anInt9317, super.anInt9321, super.anInt9315);
		}
		local19.method7242(local24);
		local19.method7247(super.anInt9317, super.anInt9321 - super.anInt2907 - 5, super.anInt9315);
		if (local96 == null) {
			local96 = Static443.method6589(true, super.aClass180Array3.length);
		}
		this.method2516(super.aClass180Array3, arg0, local19, false);
		if (Static605.aBoolean812) {
			for (local260 = 0; local260 < super.aClass180Array3.length; local260++) {
				if (super.aClass180Array3[local260] != null) {
					super.aClass180Array3[local260].method7950(local19, local96.aClass14_Sub9Array1[local260], Static461.anInt7840, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local260 = 0; super.aClass180Array3.length > local260; local260++) {
				if (super.aClass180Array3[local260] != null) {
					super.aClass180Array3[local260].method7949(local19, local96.aClass14_Sub9Array1[local260], Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass14_Sub8_4 != null) {
			@Pc(606) Class345 local606 = super.aClass14_Sub8_4.method4458();
			if (Static605.aBoolean812) {
				arg0.method6986(local606, Static461.anInt7840);
			} else {
				arg0.method7058(local606);
			}
		}
		for (local260 = 0; super.aClass180Array3.length > local260; local260++) {
			if (super.aClass180Array3[local260] != null) {
				super.aBoolean258 |= super.aClass180Array3[local260].F();
			}
			super.aClass180Array3[local260] = null;
		}
		super.anInt2931 = Static92.anInt9992;
		return local96;
	}

	@OriginalMember(owner = "client!fha", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)I")
	@Override
	public int method2517() {
		return -1;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method2375() {
		@Pc(7) String local7 = "";
		if (Static172.aStringArray12 != null) {
			local7 = local7 + Static172.aStringArray12[this.aByte62];
		}
		@Pc(36) int[] local36;
		if (this.aByte61 == 1 && Static520.anIntArray677 != null) {
			local36 = Static520.anIntArray677;
		} else {
			local36 = Static74.anIntArray100;
		}
		if (local36 != null && local36[this.aByte62] != -1) {
			@Pc(57) Class238 local57 = Static561.aClass275_1.method6617(local36[this.aByte62]);
			if (local57.aChar4 == 's') {
				local7 = local7 + local57.method5742(this.aByte63 & 0xFF);
			} else {
				Static280.method4194("gdn1", new Throwable());
				local36[this.aByte62] = -1;
			}
		}
		local7 = local7 + this.aString43;
		if (Static382.aStringArray45 != null) {
			local7 = local7 + Static382.aStringArray45[this.aByte62];
		}
		return local7;
	}

	@OriginalMember(owner = "client!fha", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return false;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILclient!ka;IIIIILclient!ha;Lclient!ofa;)V")
	private void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) Class180 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class126 arg6, @OriginalArg(8) Class117 arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg3 * arg3;
		if (local11 < 262144 || arg4 < local11) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg2, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class180 local51 = Static130.method1931(super.anInt2958, arg6, super.anInt2917, arg5, super.anInt2932, local39);
		if (local51 != null) {
			arg6.C(false);
			local51.method7950(arg7, (Class14_Sub9) null, arg0, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IZLclient!ha;)Z")
	private boolean method2377(@OriginalArg(0) int arg0, @OriginalArg(2) Class126 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class295 local11 = this.method2519();
		@Pc(33) Class200 local33 = super.anInt2930 != -1 && super.anInt2918 == 0 ? Static396.aClass359_2.method8415(super.anInt2930) : null;
		@Pc(54) Class200 local54 = super.anInt2924 == -1 || this.aBoolean237 || super.aBoolean257 && local33 != null ? null : Static396.aClass359_2.method8415(super.anInt2924);
		@Pc(57) int local57 = local11.anInt7981;
		@Pc(60) int local60 = local11.anInt7971;
		if (local57 != 0 || local60 != 0 || local11.anInt7983 != 0 || local11.anInt7992 != 0) {
			arg0 |= 0x7;
		}
		@Pc(85) int local85 = super.aClass130_7.method2930();
		@Pc(111) boolean local111 = super.aByte69 != 0 && super.anInt2955 <= Static235.anInt3998 && Static235.anInt3998 < super.anInt2915;
		if (local111) {
			arg0 |= 0x80000;
		}
		@Pc(155) Class180 local155 = super.aClass180Array3[0] = this.aClass339_1.method8048(Static396.aClass359_2, super.anInt2954, Static479.aClass348_1, arg1, super.anInt2903, super.anIntArray244, Static564.aClass304_1, arg0, super.aClass299Array3, local54, Static258.aClass138_1, super.anInt2914, super.anInt2933, super.anInt2947, local85, Static575.aClass190_2, Static608.aClass151_1, super.anInt2963, local33);
		@Pc(158) int local158 = Static585.method8196();
		if (Static125.anInt2059 < 96 && local158 > 50) {
			Static393.method6104();
		}
		if (Static363.aClass346_4 != Static34.aClass346_2 && local158 < 50) {
			@Pc(191) int local191 = 50 - local158;
			while (Static112.anInt1777 < local191) {
				Static641.aByteArrayArray27[Static112.anInt1777] = new byte[102400];
				Static112.anInt1777++;
			}
			while (local191 < Static112.anInt1777) {
				Static112.anInt1777--;
				Static641.aByteArrayArray27[Static112.anInt1777] = null;
			}
		} else if (Static34.aClass346_2 != Static363.aClass346_4) {
			Static641.aByteArrayArray27 = new byte[50][];
			Static112.anInt1777 = 0;
		}
		if (local155 == null) {
			return false;
		}
		super.anInt2967 = local155.fa();
		super.anInt2938 = local155.ma();
		this.method2510(local155);
		if (local57 == 0 && local60 == 0) {
			this.method2511(this.method2509() << 9, 0, this.method2509() << 9, local85, 0);
		} else {
			this.method2511(local57, local11.anInt7994, local60, local85, local11.anInt8000);
			if (super.anInt2917 != 0) {
				local155.FA(super.anInt2917);
			}
			if (super.anInt2958 != 0) {
				local155.VA(super.anInt2958);
			}
			if (super.anInt2932 != 0) {
				local155.H(0, super.anInt2932, 0);
			}
		}
		if (local111) {
			local155.method7942(super.aByte70, super.aByte67, super.aByte71, super.aByte69 & 0xFF);
		}
		if (!this.aBoolean237) {
			this.method2523(local57, local7, local85, local11, local60, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILclient!ofa;Lclient!ha;IIIBLclient!ka;)V")
	private void method2378(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class180 arg6) {
		@Pc(19) int local19 = arg4 * arg4 + arg3 * arg3;
		if (local19 < 262144 || local19 > arg5) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class180 local51 = Static130.method1931(super.anInt2958, arg2, super.anInt2917, arg0, super.anInt2932, local39);
		if (local51 != null) {
			arg2.C(false);
			local51.method7949(arg1, (Class14_Sub9) null, 0);
			arg2.C(true);
		}
	}
}
