import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class11_Sub1_Sub3_Sub2 extends Class11_Sub1_Sub3 {

	@OriginalMember(owner = "client!ir", name = "Mc", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!ir", name = "Tc", descriptor = "I")
	public int anInt3365;

	@OriginalMember(owner = "client!ir", name = "md", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!ir", name = "od", descriptor = "I")
	private int anInt3381;

	@OriginalMember(owner = "client!ir", name = "sd", descriptor = "Lclient!jl;")
	public Class131 aClass131_1;

	@OriginalMember(owner = "client!ir", name = "ud", descriptor = "I")
	public int anInt3384;

	@OriginalMember(owner = "client!ir", name = "xc", descriptor = "I")
	public int anInt3347 = -1;

	@OriginalMember(owner = "client!ir", name = "Dc", descriptor = "I")
	public int anInt3351 = 0;

	@OriginalMember(owner = "client!ir", name = "Bc", descriptor = "Z")
	public boolean aBoolean326 = false;

	@OriginalMember(owner = "client!ir", name = "Ac", descriptor = "B")
	private byte aByte58 = 0;

	@OriginalMember(owner = "client!ir", name = "Oc", descriptor = "Z")
	public boolean aBoolean327 = false;

	@OriginalMember(owner = "client!ir", name = "Zc", descriptor = "I")
	public int anInt3370 = 0;

	@OriginalMember(owner = "client!ir", name = "Yc", descriptor = "I")
	public int anInt3369 = 0;

	@OriginalMember(owner = "client!ir", name = "Sc", descriptor = "I")
	public int anInt3364 = -1;

	@OriginalMember(owner = "client!ir", name = "cd", descriptor = "I")
	public int anInt3373 = -1;

	@OriginalMember(owner = "client!ir", name = "Vc", descriptor = "I")
	public int anInt3367 = -1;

	@OriginalMember(owner = "client!ir", name = "ld", descriptor = "I")
	public int anInt3379 = 0;

	@OriginalMember(owner = "client!ir", name = "Uc", descriptor = "I")
	public int anInt3366 = 0;

	@OriginalMember(owner = "client!ir", name = "bd", descriptor = "I")
	public int anInt3372 = -1;

	@OriginalMember(owner = "client!ir", name = "dd", descriptor = "B")
	private byte aByte59 = 0;

	@OriginalMember(owner = "client!ir", name = "rd", descriptor = "B")
	private byte aByte60 = 0;

	@OriginalMember(owner = "client!ir", name = "gd", descriptor = "Z")
	public boolean aBoolean328 = false;

	@OriginalMember(owner = "client!ir", name = "id", descriptor = "I")
	public int anInt3376 = -1;

	@OriginalMember(owner = "client!ir", name = "Pc", descriptor = "I")
	public int anInt3361 = -1;

	@OriginalMember(owner = "client!ir", name = "td", descriptor = "I")
	public int anInt3383 = 255;

	@OriginalMember(owner = "client!ir", name = "Wc", descriptor = "I")
	public int anInt3368 = -1;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(B)I")
	@Override
	protected int method2639() {
		return this.anInt3381;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!za;Lclient!c;Lclient!e;IIII)V")
	private void method2646(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(16) int local16 = arg5 * arg5 + arg6 * arg6;
		if (local16 < 16384 || local16 > arg4) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg5, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(50) Class8 local50 = Static383.method4928(super.anInt3290, arg0, local38, arg1, super.anInt3286, super.anInt3331);
		if (local50 != null) {
			arg1.method5677(false);
			local50.method5987(arg2, null, 0);
			arg1.method5677(true);
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)Z")
	public boolean method2647() {
		return this.aClass131_1 != null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)I")
	@Override
	public int method2635() {
		return this.aClass131_1 == null || this.aClass131_1.anInt3605 == -1 ? super.method2635() : Static428.aClass196_1.method4163(this.aClass131_1.anInt3605).anInt7346;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		if (this.aClass131_1 == null || !this.method2652(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class34 local19 = arg0.method5685();
		@Pc(24) int local24 = super.aClass41_7.method704();
		local19.ca(local24);
		local19.W(super.anInt6428, super.anInt6437, super.anInt6430);
		@Pc(38) float local38 = arg0.T();
		@Pc(41) float local41 = arg0.aa();
		@Pc(103) int local103;
		if (Static126.aClass19_Sub1_1.aBoolean381) {
			@Pc(48) Class164 local48 = this.method2640();
			if (local48.aBoolean416 && (this.aClass131_1.anInt3605 == -1 || Static428.aClass196_1.method4163(this.aClass131_1.anInt3605).aBoolean634)) {
				@Pc(80) Class64 local80 = super.anInt3302 != -1 && super.anInt3337 == 0 ? Static402.aClass37_2.method665(super.anInt3302) : null;
				@Pc(101) Class64 local101 = super.anInt3317 == -1 || this.aBoolean326 || super.aBoolean322 && local80 != null ? null : Static402.aClass37_2.method665(super.anInt3317);
				local103 = 0;
				if (super.anInt3313 != 0) {
					local103 = this.method2628();
				}
				@Pc(146) Class8 local146 = Static92.method3331(160, local24, super.anInt3290, local101 == null ? local80 : local101, 240, 0, arg0, local103, super.anInt3331, local101 == null ? super.anInt3296 : super.anInt3298, super.anInt3286, super.aClass8Array3[0], 1, 0);
				if (local146 != null) {
					arg0.da(local38, local41 - 128.0F);
					arg0.method5677(false);
					local146.method5987(local19, null, 0);
					arg0.method5677(true);
				}
			}
		}
		if (Static94.aClass11_Sub1_Sub3_Sub2_1 == this) {
			arg0.da(local38, local41 - 144.0F);
			local19.U(super.anInt6428, super.anInt6437, super.anInt6430);
			for (@Pc(187) int local187 = Static13.aClass78Array1.length - 1; local187 >= 0; local187--) {
				@Pc(193) Class78 local193 = Static13.aClass78Array1[local187];
				if (local193 != null && local193.anInt1707 != -1) {
					@Pc(223) int local223;
					if (local193.anInt1697 == 1) {
						@Pc(211) Class1_Sub44 local211 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local193.anInt1704);
						if (local211 != null) {
							@Pc(216) Class11_Sub1_Sub3_Sub1 local216 = local211.aClass11_Sub1_Sub3_Sub1_2;
							local223 = local216.anInt6428 - Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428;
							@Pc(230) int local230 = local216.anInt6430 - Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430;
							this.method2646(local193.anInt1707, arg0, local19, super.aClass8Array3[0], 5760000, local223, local230);
						}
					}
					if (local193.anInt1697 == 2) {
						@Pc(259) int local259 = local193.anInt1703 + 64 - Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428;
						local103 = local193.anInt1700 + 64 - Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430;
						local223 = local193.anInt1705 << 7;
						local223 *= local223;
						this.method2646(local193.anInt1707, arg0, local19, super.aClass8Array3[0], local223, local259, local103);
					}
					if (local193.anInt1697 == 10 && local193.anInt1704 >= 0 && local193.anInt1704 < Static399.aClass11_Sub1_Sub3_Sub2Array1.length) {
						@Pc(317) Class11_Sub1_Sub3_Sub2 local317 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local193.anInt1704];
						if (local317 != null) {
							local103 = local317.anInt6428 - Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428;
							local223 = local317.anInt6430 - Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430;
							this.method2646(local193.anInt1707, arg0, local19, super.aClass8Array3[0], 5760000, local103, local223);
						}
					}
				}
			}
			local19.ca(local24);
			local19.W(super.anInt6428, super.anInt6437, super.anInt6430);
		}
		arg0.da(local38, local41);
		@Pc(374) Class111_Sub3 local374 = Static238.method3398(super.aClass8Array3.length);
		if (super.aClass111_Sub4_3 == null) {
			arg0.method5723(super.aClass8Array3, local19, local374.aClass111_Sub8Array1, Static94.aClass11_Sub1_Sub3_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(396) Class232 local396 = super.aClass111_Sub4_3.method3422();
			arg0.method5673(super.aClass8Array3, local396, local19, local374.aClass111_Sub8Array1, Static94.aClass11_Sub1_Sub3_Sub2_1 == this ? 1 : 0);
		}
		this.method2629(super.aClass8Array3, arg0, false);
		if (super.aClass8Array3[2] != null) {
			if (local24 != 0) {
				super.aClass8Array3[2].ma(local24);
			}
			super.aClass8Array3[2].a(super.anInt6428 - super.aClass1_Sub24_3.anInt3673, super.anInt6437 - super.aClass1_Sub24_3.anInt3672, -super.aClass1_Sub24_3.anInt3679 + super.anInt6430);
		}
		super.aClass8Array3[0] = super.aClass8Array3[1] = super.aClass8Array3[2] = super.aClass8Array3[3] = null;
		super.anInt3276 = Static330.anInt5429;
		return local374;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)I")
	@Override
	public int method5184() {
		return super.anInt3319;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass131_1 == null || !this.method2652(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class34 local19 = arg1.method5685();
		@Pc(24) int local24 = super.aClass41_7.method704();
		local19.ca(local24);
		local19.W(super.anInt6428, super.anInt6437, super.anInt6430);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass8Array3.length; local39++) {
			if (super.aClass8Array3[local39] != null && super.aClass8Array3[local39].method5985(arg0, arg2, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass8Array3[0] = super.aClass8Array3[1] = super.aClass8Array3[2] = super.aClass8Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
		if (this.aClass131_1 != null && (super.aBoolean325 || this.method2652(arg0, 0))) {
			this.method2629(super.aClass8Array3, arg0, super.aBoolean325);
			super.aClass8Array3[0] = super.aClass8Array3[1] = super.aClass8Array3[2] = super.aClass8Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method2649(@OriginalArg(0) Class1_Sub19 arg0) {
		arg0.anInt3698 = 0;
		@Pc(12) int local12 = arg0.method2915();
		this.aByte59 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method2635();
		this.method2637((local12 >> 3 & 0x7) + 1);
		this.aByte60 = (byte) (local12 >> 6 & 0x3);
		super.anInt6428 += this.method2635() - local41 << 6;
		super.anInt6430 += this.method2635() - local41 << 6;
		this.aByte58 = arg0.method2917();
		this.anInt3372 = arg0.method2917();
		this.anInt3376 = arg0.method2917();
		this.anInt3370 = 0;
		@Pc(105) int local105 = -1;
		@Pc(108) int[] local108 = new int[12];
		@Pc(128) int local128;
		@Pc(134) int local134;
		@Pc(171) int local171;
		for (@Pc(110) int local110 = 0; local110 < 12; local110++) {
			@Pc(116) int local116 = arg0.method2915();
			if (local116 == 0) {
				local108[local110] = 0;
			} else {
				local128 = arg0.method2915();
				local134 = local128 + (local116 << 8);
				if (local110 == 0 && local134 == 65535) {
					local105 = arg0.method2896();
					this.anInt3370 = arg0.method2915();
					break;
				}
				if (local134 >= 32768) {
					local134 = Static442.anIntArray501[local134 - 32768];
					local108[local110] = local134 | 0x40000000;
					local171 = Static285.aClass226_2.method4788(local134).anInt3838;
					if (local171 != 0) {
						this.anInt3370 = local171;
					}
				} else {
					local108[local110] = Integer.MIN_VALUE | local134 - 256;
				}
			}
		}
		@Pc(198) int[] local198 = new int[5];
		for (local128 = 0; local128 < 5; local128++) {
			local134 = arg0.method2915();
			if (local134 < 0 || local134 >= Static440.aShortArrayArray7[local128].length) {
				local134 = 0;
			}
			local198[local128] = local134;
		}
		this.anInt3381 = arg0.method2896();
		this.aString33 = arg0.method2914();
		if (local29) {
			this.aString32 = arg0.method2914();
		} else {
			this.aString32 = this.aString33;
		}
		this.anInt3369 = arg0.method2915();
		if (local37) {
			this.anInt3351 = arg0.method2896();
			this.anInt3347 = -1;
			this.anInt3379 = this.anInt3369;
		} else {
			this.anInt3351 = 0;
			this.anInt3379 = arg0.method2915();
			this.anInt3347 = arg0.method2915();
			if (this.anInt3347 == 255) {
				this.anInt3347 = -1;
			}
		}
		local134 = this.anInt3366;
		this.anInt3366 = arg0.method2915();
		@Pc(310) int local310;
		if (this.anInt3366 == 0) {
			Static303.method4047(this);
		} else {
			local171 = this.anInt3364;
			@Pc(307) int local307 = this.anInt3367;
			local310 = this.anInt3373;
			@Pc(313) int local313 = this.anInt3368;
			@Pc(316) int local316 = this.anInt3383;
			this.anInt3364 = arg0.method2896();
			this.anInt3367 = arg0.method2896();
			this.anInt3373 = arg0.method2896();
			this.anInt3368 = arg0.method2896();
			this.anInt3383 = arg0.method2915();
			if (this.anInt3366 != local134 || local171 != this.anInt3364 || this.anInt3367 != local307 || local310 != this.anInt3373 || local313 != this.anInt3368 || this.anInt3383 != local316) {
				Static195.method2806(this);
			}
		}
		if (this.aClass131_1 == null) {
			this.aClass131_1 = new Class131();
		}
		local171 = this.aClass131_1.anInt3605;
		@Pc(405) int[] local405 = this.aClass131_1.anIntArray267;
		this.aClass131_1.method2829(local105, local198, this.aByte59 == 1, local108, this.method2639());
		if (local105 != local171) {
			super.anInt6428 = (super.anIntArray246[0] << 7) + (this.method2635() << 6);
			super.anInt6430 = (super.anIntArray247[0] << 7) + (this.method2635() << 6);
		}
		if (super.anInt3279 == Static220.anInt4038 && local405 != null) {
			for (local310 = 0; local310 < local198.length; local310++) {
				if (local405[local310] != local198[local310]) {
					Static285.aClass226_2.method4782();
					break;
				}
			}
		}
		if (super.aClass111_Sub4_3 != null) {
			super.aClass111_Sub4_3.method3418();
		}
		if (super.anInt3317 == -1 || !super.aBoolean322) {
			return;
		}
		@Pc(513) Class164 local513 = this.method2640();
		if (!local513.method3660(super.anInt3317)) {
			super.aBoolean322 = false;
			super.anInt3317 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method2650() {
		return this.aString32;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BIBI)V")
	public void method2651(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt3302 != -1 && Static402.aClass37_2.method665(super.anInt3302).anInt1189 == 1) {
			super.anInt3302 = -1;
		}
		@Pc(37) Class121 local37;
		if (super.anInt3266 != -1) {
			local37 = Static46.aClass123_5.method2677(super.anInt3266);
			if (local37.aBoolean319 && local37.anInt3204 != -1 && Static402.aClass37_2.method665(local37.anInt3204).anInt1189 == 1) {
				super.anInt3266 = -1;
			}
		}
		if (super.anInt3328 != -1) {
			local37 = Static46.aClass123_5.method2677(super.anInt3328);
			if (local37.aBoolean319 && local37.anInt3204 != -1 && Static402.aClass37_2.method665(local37.anInt3204).anInt1189 == 1) {
				super.anInt3328 = -1;
			}
		}
		this.anInt3361 = -1;
		if (arg0 < 0 || arg0 >= Static147.anInt2300 || arg2 < 0 || Static293.anInt4886 <= arg2) {
			this.method2655(arg2, arg0);
		} else if (super.anIntArray246[0] >= 0 && super.anIntArray246[0] < Static147.anInt2300 && super.anIntArray247[0] >= 0 && super.anIntArray247[0] < Static293.anInt4886) {
			if (arg1 == 2) {
				Static190.method2741(arg2, arg0, this);
			}
			this.method2653(arg2, arg0, arg1);
		} else {
			this.method2655(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!za;I)Z")
	private boolean method2652(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1;
		@Pc(19) Class164 local19 = this.method2640();
		@Pc(34) Class64 local34 = super.anInt3302 != -1 && super.anInt3337 == 0 ? Static402.aClass37_2.method665(super.anInt3302) : null;
		@Pc(54) Class64 local54 = super.anInt3317 == -1 || this.aBoolean326 || super.aBoolean322 && local34 != null ? null : Static402.aClass37_2.method665(super.anInt3317);
		@Pc(57) int local57 = local19.anInt4601;
		@Pc(60) int local60 = local19.anInt4623;
		if (local57 != 0 || local60 != 0 || local19.anInt4597 != 0 || local19.anInt4637 != 0) {
			arg1 |= 0x7;
		}
		@Pc(103) boolean local103 = super.aByte57 != 0 && Static98.anInt1304 >= super.anInt3326 && super.anInt3321 > Static98.anInt1304;
		if (local103) {
			arg1 |= 0x80000;
		}
		@Pc(144) Class8 local144 = super.aClass8Array3[0] = this.aClass131_1.method2830(Static428.aClass196_1, arg0, Static241.aClass97_1, Static32.aClass4_1, super.anInt3296, super.anInt3280, super.aClass9Array3, local54, super.anInt3275, Static106.aClass199_131, Static402.aClass37_2, super.anInt3307, local34, super.anInt3298, super.anInt3268, Static285.aClass226_2, arg1);
		@Pc(147) int local147 = Static336.method4400();
		if (Static45.anInt669 < 96 && local147 > 50) {
			Static369.method4805();
		}
		@Pc(170) int local170;
		if (Static268.aClass170_5 != Static254.aClass170_4 && local147 < 50) {
			local170 = 50 - local147;
			while (Static2.anInt35 < local170) {
				Static98.aByteArrayArray28[Static2.anInt35] = new byte[102400];
				Static2.anInt35++;
			}
			while (local170 < Static2.anInt35) {
				Static2.anInt35--;
				Static98.aByteArrayArray28[Static2.anInt35] = null;
			}
		} else if (Static254.aClass170_4 != Static268.aClass170_5) {
			Static98.aByteArrayArray28 = new byte[50][];
			Static2.anInt35 = 0;
		}
		if (local144 == null) {
			return false;
		}
		super.anInt3319 = local144.B();
		this.method2643(local144);
		local170 = super.aClass41_7.method704();
		if (local57 == 0 && local60 == 0) {
			this.method2634(this.method2635() << 7, local170, 0, this.method2635() << 7, 0);
		} else {
			this.method2634(local57, local170, local19.anInt4639, local60, local19.anInt4615);
			if (super.anInt3290 != 0) {
				local144.W(super.anInt3290);
			}
			if (super.anInt3331 != 0) {
				local144.K(super.anInt3331);
			}
			if (super.anInt3286 != 0) {
				local144.a(0, super.anInt3286, 0);
			}
		}
		if (local103) {
			local144.method5982(super.aByte56, super.aByte55, super.aByte54, super.aByte57 & 0xFF);
		}
		@Pc(330) Class121 local330;
		@Pc(347) boolean local347;
		@Pc(349) int local349;
		@Pc(392) Class8 local392;
		if (this.aBoolean326 || super.anInt3266 == -1 || super.anInt3338 == -1) {
			super.aClass8Array3[1] = null;
		} else {
			local330 = Static46.aClass123_5.method2677(super.anInt3266);
			local347 = local330.aByte51 == 3 && (local57 != 0 || local60 != 0);
			local349 = local15;
			if (local347) {
				local349 = local15 | 0x7;
			} else {
				if (super.anInt3271 != 0) {
					local349 = local15 | 0x5;
				}
				if (super.anInt3325 != 0) {
					local349 |= 0x2;
				}
			}
			local392 = super.aClass8Array3[1] = local330.method2598(super.anInt3267, arg0, super.anInt3338, local349, super.anInt3300, Static402.aClass37_2);
			if (local392 != null) {
				if (super.anInt3325 != 0) {
					local392.a(0, -super.anInt3325 << 0, 0);
				}
				if (super.anInt3271 != 0) {
					local392.ma(super.anInt3271 * 2048);
				}
				if (local347) {
					if (super.anInt3290 != 0) {
						local392.W(super.anInt3290);
					}
					if (super.anInt3331 != 0) {
						local392.K(super.anInt3331);
					}
					if (super.anInt3286 != 0) {
						local392.a(0, super.anInt3286, 0);
					}
				}
			}
		}
		if (this.aBoolean326 || super.anInt3328 == -1 || super.anInt3304 == -1) {
			super.aClass8Array3[3] = null;
		} else {
			local330 = Static46.aClass123_5.method2677(super.anInt3328);
			local347 = local330.aByte51 == 3 && (local57 != 0 || local60 != 0);
			local349 = local15;
			if (local347) {
				local349 = local15 | 0x7;
			} else {
				if (super.anInt3340 != 0) {
					local349 = local15 | 0x5;
				}
				if (super.anInt3270 != 0) {
					local349 |= 0x2;
				}
			}
			local392 = super.aClass8Array3[3] = local330.method2601(super.anInt3303, super.anInt3323, super.anInt3304, arg0, Static402.aClass37_2, local349);
			if (local392 != null) {
				if (super.anInt3270 != 0) {
					local392.a(0, -super.anInt3270 << 0, 0);
				}
				if (super.anInt3340 != 0) {
					local392.ma(super.anInt3340 * 2048);
				}
				if (local347) {
					if (super.anInt3290 != 0) {
						local392.W(super.anInt3290);
					}
					if (super.anInt3331 != 0) {
						local392.K(super.anInt3331);
					}
					if (super.anInt3286 != 0) {
						local392.a(0, super.anInt3286, 0);
					}
				}
			}
		}
		super.aClass8Array3[2] = null;
		if (!this.aBoolean326 && super.aClass1_Sub24_3 != null) {
			if (super.aClass1_Sub24_3.anInt3675 <= Static98.anInt1304) {
				super.aClass1_Sub24_3 = null;
			} else if (Static98.anInt1304 >= super.aClass1_Sub24_3.anInt3674) {
				@Pc(624) Class8 local624 = super.aClass1_Sub24_3.method2870(local15 | 0x7, arg0);
				if (local624 != null) {
					local624.a(super.aClass1_Sub24_3.anInt3673 - super.anInt6428, -super.anInt6437 + super.aClass1_Sub24_3.anInt3672, super.aClass1_Sub24_3.anInt3679 - super.anInt6430);
					if (local170 != 0) {
						local624.ma(-local170 & 0x3FFF);
					}
					super.aClass8Array3[2] = local624;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I")
	@Override
	public int method2636() {
		return -1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBIB)V")
	public void method2653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt3342 < 9) {
			super.anInt3342++;
		}
		for (@Pc(22) int local22 = super.anInt3342; local22 > 0; local22--) {
			super.anIntArray246[local22] = super.anIntArray246[local22 - 1];
			super.anIntArray247[local22] = super.anIntArray247[local22 - 1];
			super.aByteArray35[local22] = super.aByteArray35[local22 - 1];
		}
		super.anIntArray246[0] = arg1;
		super.anIntArray247[0] = arg0;
		super.aByteArray35[0] = arg2;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2654() {
		@Pc(7) String local7 = "";
		if (Static177.aStringArray19 != null) {
			local7 = local7 + Static177.aStringArray19[this.aByte60];
		}
		@Pc(35) int[] local35;
		if (this.aByte59 == 1 && Static449.anIntArray523 != null) {
			local35 = Static449.anIntArray523;
		} else {
			local35 = Static201.anIntArray272;
		}
		if (local35 != null && local35[this.aByte60] != -1) {
			@Pc(56) Class179 local56 = Static118.aClass273_1.method5978(local35[this.aByte60]);
			if (local56.aChar3 == 's') {
				local7 = local7 + local56.method3900(this.aByte58 & 0xFF);
			} else {
				Static338.method4409(new Throwable(), "gdn1");
				local35[this.aByte60] = -1;
			}
		}
		local7 = local7 + this.aString33;
		if (Static73.aStringArray6 != null) {
			local7 = local7 + Static73.aStringArray6[this.aByte60];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)V")
	public void method2655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt3345 = 0;
		super.anIntArray246[0] = arg1;
		super.anInt3344 = 0;
		super.anInt3342 = 0;
		super.anIntArray247[0] = arg0;
		@Pc(26) int local26 = this.method2635();
		super.anInt6430 = local26 * 64 + super.anIntArray247[0] * 128;
		super.anInt6428 = local26 * 64 + super.anIntArray246[0] * 128;
		if (Static94.aClass11_Sub1_Sub3_Sub2_1 == this) {
			Static111.method1401();
		}
		if (super.aClass111_Sub4_3 != null) {
			super.aClass111_Sub4_3.method3418();
		}
	}
}
