import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class16_Sub1_Sub5_Sub1 extends Class16_Sub1_Sub5 {

	@OriginalMember(owner = "client!lh", name = "Fc", descriptor = "I")
	public int anInt4317;

	@OriginalMember(owner = "client!lh", name = "Gc", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!lh", name = "Oc", descriptor = "Lclient!cj;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!lh", name = "Rc", descriptor = "I")
	private int anInt4324;

	@OriginalMember(owner = "client!lh", name = "Xc", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!lh", name = "ed", descriptor = "I")
	public int anInt4335;

	@OriginalMember(owner = "client!lh", name = "zc", descriptor = "B")
	private byte aByte45 = 0;

	@OriginalMember(owner = "client!lh", name = "Bc", descriptor = "I")
	public int anInt4313 = -1;

	@OriginalMember(owner = "client!lh", name = "vc", descriptor = "B")
	private byte aByte44 = 0;

	@OriginalMember(owner = "client!lh", name = "Qc", descriptor = "I")
	public int anInt4323 = -1;

	@OriginalMember(owner = "client!lh", name = "Kc", descriptor = "I")
	public int anInt4319 = -1;

	@OriginalMember(owner = "client!lh", name = "Yc", descriptor = "I")
	public int anInt4330 = -1;

	@OriginalMember(owner = "client!lh", name = "cd", descriptor = "I")
	public int anInt4333 = -1;

	@OriginalMember(owner = "client!lh", name = "fd", descriptor = "I")
	public int anInt4336 = 0;

	@OriginalMember(owner = "client!lh", name = "Vc", descriptor = "I")
	public int anInt4328 = 0;

	@OriginalMember(owner = "client!lh", name = "Zc", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!lh", name = "ld", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!lh", name = "Mc", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!lh", name = "bd", descriptor = "I")
	public int anInt4332 = 0;

	@OriginalMember(owner = "client!lh", name = "Hc", descriptor = "B")
	private byte aByte46 = 0;

	@OriginalMember(owner = "client!lh", name = "jd", descriptor = "I")
	public int anInt4339 = -1;

	@OriginalMember(owner = "client!lh", name = "td", descriptor = "I")
	public int anInt4346 = -1;

	@OriginalMember(owner = "client!lh", name = "Pc", descriptor = "I")
	public int anInt4322 = -1;

	@OriginalMember(owner = "client!lh", name = "dd", descriptor = "I")
	public int anInt4334 = 0;

	@OriginalMember(owner = "client!lh", name = "qd", descriptor = "I")
	public int anInt4345 = 0;

	@OriginalMember(owner = "client!lh", name = "wd", descriptor = "I")
	public int anInt4348 = 255;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!iv;I)V")
	public void method3422(@OriginalArg(0) Class4_Sub12 arg0) {
		arg0.anInt2997 = 0;
		@Pc(14) int local14 = arg0.method2490();
		this.aByte46 = (byte) (local14 & 0x1);
		@Pc(31) boolean local31 = (local14 & 0x2) != 0;
		@Pc(42) boolean local42 = (local14 & 0x4) != 0;
		@Pc(46) int local46 = super.method4751();
		this.method4754((local14 >> 3 & 0x7) + 1);
		this.aByte44 = (byte) (local14 >> 6 & 0x3);
		super.anInt6893 += this.method4751() - local46 << 6;
		super.anInt6892 += this.method4751() - local46 << 6;
		this.aByte45 = arg0.method2542();
		this.anInt4339 = arg0.method2542();
		this.anInt4346 = arg0.method2542();
		@Pc(106) int local106 = -1;
		this.anInt4328 = 0;
		@Pc(112) int[] local112 = new int[12];
		@Pc(134) int local134;
		@Pc(141) int local141;
		@Pc(180) int local180;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			@Pc(122) int local122 = arg0.method2490();
			if (local122 == 0) {
				local112[local114] = 0;
			} else {
				local134 = arg0.method2490();
				local141 = (local122 << 8) + local134;
				if (local114 == 0 && local141 == 65535) {
					local106 = arg0.method2536();
					this.anInt4328 = arg0.method2490();
					break;
				}
				if (local141 >= 32768) {
					local141 = Static119.anIntArray170[local141 - 32768];
					local112[local114] = local141 | 0x40000000;
					local180 = Static444.aClass206_3.method4703(local141).anInt6181;
					if (local180 != 0) {
						this.anInt4328 = local180;
					}
				} else {
					local112[local114] = local141 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(205) int[] local205 = new int[5];
		for (local134 = 0; local134 < 5; local134++) {
			local141 = arg0.method2490();
			if (local141 < 0 || local141 >= Static26.aShortArrayArray2[local134].length) {
				local141 = 0;
			}
			local205[local134] = local141;
		}
		this.anInt4324 = arg0.method2536();
		this.aString43 = arg0.method2537();
		if (local31) {
			this.aString44 = arg0.method2537();
		} else {
			this.aString44 = this.aString43;
		}
		this.anInt4345 = arg0.method2490();
		if (local42) {
			this.anInt4336 = arg0.method2536();
			this.anInt4332 = this.anInt4345;
			this.anInt4330 = -1;
		} else {
			this.anInt4336 = 0;
			this.anInt4332 = arg0.method2490();
			this.anInt4330 = arg0.method2490();
			if (this.anInt4330 == 255) {
				this.anInt4330 = -1;
			}
		}
		local141 = this.anInt4334;
		this.anInt4334 = arg0.method2490();
		@Pc(336) int local336;
		if (this.anInt4334 == 0) {
			Static349.method4705(this);
		} else {
			local180 = this.anInt4313;
			@Pc(333) int local333 = this.anInt4319;
			local336 = this.anInt4333;
			@Pc(339) int local339 = this.anInt4322;
			@Pc(342) int local342 = this.anInt4348;
			this.anInt4313 = arg0.method2536();
			this.anInt4319 = arg0.method2536();
			this.anInt4333 = arg0.method2536();
			this.anInt4322 = arg0.method2536();
			this.anInt4348 = arg0.method2490();
			if (local141 != this.anInt4334 || this.anInt4313 != local180 || this.anInt4319 != local333 || this.anInt4333 != local336 || local339 != this.anInt4322 || this.anInt4348 != local342) {
				Static149.method2555(this);
			}
		}
		if (this.aClass37_1 == null) {
			this.aClass37_1 = new Class37();
		}
		local180 = this.aClass37_1.anInt871;
		@Pc(422) int[] local422 = this.aClass37_1.anIntArray52;
		this.aClass37_1.method835(this.aByte46 == 1, local106, this.method4749(), local112, local205);
		if (local106 != local180) {
			super.anInt6893 = (super.anIntArray426[0] << 7) + (this.method4751() << 6);
			super.anInt6892 = (super.anIntArray427[0] << 7) + (this.method4751() << 6);
		}
		if (super.anInt6037 == Static207.anInt5452 && local422 != null) {
			for (local336 = 0; local336 < local205.length; local336++) {
				if (local422[local336] != local205[local336]) {
					Static444.aClass206_3.method4701();
					break;
				}
			}
		}
		if (super.aClass3_Sub2_7 != null) {
			super.aClass3_Sub2_7.method164();
		}
		if (super.anInt6076 == -1 || !super.aBoolean562) {
			return;
		}
		@Pc(521) Class151 local521 = this.method4757();
		if (!local521.method3642(super.anInt6076)) {
			super.anInt6076 = -1;
			super.aBoolean562 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
		if (this.aClass37_1 != null && (super.aBoolean563 || this.method3430(arg0, 0))) {
			this.method4741(super.aBoolean563, super.aClass110Array3, arg0);
			super.aClass110Array3[0] = super.aClass110Array3[1] = super.aClass110Array3[2] = super.aClass110Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BIII)V")
	public void method3423(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt6021 != -1 && Static182.aClass55_1.method1397(super.anInt6021).anInt4410 == 1) {
			super.anInt6021 = -1;
		}
		@Pc(36) Class161 local36;
		if (super.anInt6029 != -1) {
			local36 = Static352.aClass194_2.method4421(super.anInt6029);
			if (local36.aBoolean459 && local36.anInt5002 != -1 && Static182.aClass55_1.method1397(local36.anInt5002).anInt4410 == 1) {
				super.anInt6029 = -1;
			}
		}
		if (super.anInt6045 != -1) {
			local36 = Static352.aClass194_2.method4421(super.anInt6045);
			if (local36.aBoolean459 && local36.anInt5002 != -1 && Static182.aClass55_1.method1397(local36.anInt5002).anInt4410 == 1) {
				super.anInt6045 = -1;
			}
		}
		this.anInt4323 = -1;
		if (arg2 < 0 || arg2 >= Static326.anInt5666 || arg1 < 0 || Static283.anInt5187 <= arg1) {
			this.method3426(arg1, arg2);
		} else if (super.anIntArray426[0] >= 0 && super.anIntArray426[0] < Static326.anInt5666 && super.anIntArray427[0] >= 0 && super.anIntArray427[0] < Static283.anInt5187) {
			if (arg0 == 2) {
				Static111.method2022(this, arg2, arg1);
			}
			this.method3427(arg1, arg2, arg0);
		} else {
			this.method3426(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(B)I")
	@Override
	public int method4756() {
		return -1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass37_1 == null || !this.method3430(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class31 local19 = arg1.method4289();
		@Pc(26) int local26 = super.aClass35_7.method811();
		local19.ra(local26);
		local19.o(super.anInt6893, super.anInt6889, super.anInt6892);
		@Pc(39) boolean local39 = false;
		for (@Pc(41) int local41 = 0; local41 < super.aClass110Array3.length; local41++) {
			if (super.aClass110Array3[local41] != null && super.aClass110Array3[local41].method4894(arg2, arg0, local19, true)) {
				local39 = true;
				break;
			}
		}
		super.aClass110Array3[0] = super.aClass110Array3[1] = super.aClass110Array3[2] = super.aClass110Array3[3] = null;
		return local39;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		if (this.aClass37_1 == null || !this.method3430(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class31 local19 = arg0.method4289();
		@Pc(24) int local24 = super.aClass35_7.method811();
		local19.ra(local24);
		local19.o(super.anInt6893, super.anInt6889, super.anInt6892);
		@Pc(38) float local38 = arg0.W();
		@Pc(47) float local47 = arg0.xa();
		if (Static323.aClass50_Sub1_1.aBoolean302) {
			@Pc(54) Class151 local54 = this.method4757();
			if (local54.aBoolean428 && (this.aClass37_1.anInt871 == -1 || Static329.aClass240_1.method5229(this.aClass37_1.anInt871).aBoolean684)) {
				@Pc(85) Class138 local85 = super.anInt6021 != -1 && super.anInt6046 == 0 ? Static182.aClass55_1.method1397(super.anInt6021) : null;
				@Pc(105) Class138 local105 = super.anInt6076 == -1 || this.aBoolean402 || super.aBoolean562 && local85 != null ? null : Static182.aClass55_1.method1397(super.anInt6076);
				@Pc(139) Class110 local139 = Static6.method48(super.anInt6042, super.anInt6070, super.aClass110Array3[0], 0, super.anInt6040, 0, arg0, 160, 1, local24, local105 == null ? super.anInt6060 : super.anInt6016, super.aBoolean560, local105 == null ? local85 : local105, 240);
				if (local139 != null) {
					arg0.g(local38, local47 - 128.0F);
					arg0.method4309(false);
					local139.method4889(local19, null, 0);
					arg0.method4309(true);
				}
			}
		}
		if (Static1.aClass16_Sub1_Sub5_Sub1_1 == this) {
			arg0.g(local38, local47 - 144.0F);
			local19.j(super.anInt6893, super.anInt6889, super.anInt6892);
			for (@Pc(180) int local180 = Static306.aClass38Array1.length - 1; local180 >= 0; local180--) {
				@Pc(186) Class38 local186 = Static306.aClass38Array1[local180];
				if (local186 != null && local186.anInt888 != -1) {
					@Pc(228) int local228;
					@Pc(221) int local221;
					if (local186.anInt891 == 1 && local186.anInt885 >= 0 && local186.anInt885 < Static143.aClass16_Sub1_Sub5_Sub2Array1.length) {
						@Pc(212) Class16_Sub1_Sub5_Sub2 local212 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local186.anInt885];
						if (local212 != null) {
							local221 = local212.anInt6893 - Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893;
							local228 = local212.anInt6892 - Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892;
							this.method3429(local228, super.aClass110Array3[0], local221, arg0, 5760000, local186.anInt888, local19);
						}
					}
					if (local186.anInt891 == 2) {
						@Pc(255) int local255 = local186.anInt892 + 64 - Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893;
						local221 = local186.anInt894 + 64 - Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892;
						local228 = local186.anInt889 << 7;
						local228 *= local228;
						this.method3429(local221, super.aClass110Array3[0], local255, arg0, local228, local186.anInt888, local19);
					}
					if (local186.anInt891 == 10 && local186.anInt885 >= 0 && Static267.aClass16_Sub1_Sub5_Sub1Array1.length > local186.anInt885) {
						@Pc(303) Class16_Sub1_Sub5_Sub1 local303 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local186.anInt885];
						if (local303 != null) {
							local221 = local303.anInt6893 - Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893;
							local228 = local303.anInt6892 - Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892;
							this.method3429(local228, super.aClass110Array3[0], local221, arg0, 5760000, local186.anInt888, local19);
						}
					}
				}
			}
			local19.ra(local24);
			local19.o(super.anInt6893, super.anInt6889, super.anInt6892);
		}
		arg0.g(local38, local47);
		@Pc(360) Class3_Sub3 local360 = Static38.method672(super.aClass110Array3.length);
		if (super.aClass3_Sub2_7 == null) {
			arg0.method4307(super.aClass110Array3, local19, local360.aClass3_Sub5Array1, Static1.aClass16_Sub1_Sub5_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(367) Class146 local367 = super.aClass3_Sub2_7.method171();
			arg0.method4299(super.aClass110Array3, local367, local19, local360.aClass3_Sub5Array1, Static1.aClass16_Sub1_Sub5_Sub1_1 == this ? 1 : 0);
		}
		this.method4741(false, super.aClass110Array3, arg0);
		if (super.aClass110Array3[2] != null) {
			if (local24 != 0) {
				super.aClass110Array3[2].Q(local24);
			}
			super.aClass110Array3[2].JA(-super.aClass4_Sub23_3.anInt3198 + super.anInt6893, -super.aClass4_Sub23_3.anInt3188 + super.anInt6889, -super.aClass4_Sub23_3.anInt3203 + super.anInt6892);
		}
		super.aClass110Array3[0] = super.aClass110Array3[1] = super.aClass110Array3[2] = super.aClass110Array3[3] = null;
		super.anInt6061 = Static361.anInt6264;
		return local360;
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)I")
	@Override
	public int method5342() {
		return super.anInt6030;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I")
	@Override
	protected int method4749() {
		return this.anInt4324;
	}

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)Z")
	public boolean method3425() {
		return this.aClass37_1 != null;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)V")
	public void method3426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6086 = 0;
		super.anInt6085 = 0;
		super.anInt6087 = 0;
		super.anIntArray426[0] = arg1;
		super.anIntArray427[0] = arg0;
		@Pc(26) int local26 = this.method4751();
		super.anInt6893 = local26 * 64 + super.anIntArray426[0] * 128;
		super.anInt6892 = super.anIntArray427[0] * 128 + local26 * 64;
		if (Static1.aClass16_Sub1_Sub5_Sub1_1 == this) {
			Static222.method3355();
		}
		if (super.aClass3_Sub2_7 != null) {
			super.aClass3_Sub2_7.method164();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBB)V")
	public void method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6086 < 9) {
			super.anInt6086++;
		}
		for (@Pc(20) int local20 = super.anInt6086; local20 > 0; local20--) {
			super.anIntArray426[local20] = super.anIntArray426[local20 - 1];
			super.anIntArray427[local20] = super.anIntArray427[local20 - 1];
			super.aByteArray84[local20] = super.aByteArray84[local20 - 1];
		}
		super.anIntArray426[0] = arg1;
		super.aByteArray84[0] = arg2;
		super.anIntArray427[0] = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5338() {
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method3428() {
		@Pc(15) String local15 = "";
		if (Static440.aStringArray40 != null) {
			local15 = local15 + Static440.aStringArray40[this.aByte44];
		}
		@Pc(37) int[] local37;
		if (this.aByte46 == 1 && Static171.anIntArray217 != null) {
			local37 = Static171.anIntArray217;
		} else {
			local37 = Static290.anIntArray490;
		}
		if (local37 != null && local37[this.aByte44] != -1) {
			@Pc(58) Class200 local58 = Static416.aClass158_1.method3790(local37[this.aByte44]);
			if (local58.aChar4 == 's') {
				local15 = local15 + local58.method4538(this.aByte45 & 0xFF);
			} else {
				Static94.method1654(new Throwable(), "gdn1");
				local37[this.aByte44] = -1;
			}
		}
		local15 = local15 + this.aString43;
		if (Static438.aStringArray39 != null) {
			local15 = local15 + Static438.aStringArray39[this.aByte44];
		}
		return local15;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!t;ILclient!ya;IIILclient!c;)V")
	private void method3429(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class31 arg6) {
		@Pc(11) int local11 = arg2 * arg2 + arg0 * arg0;
		if (local11 < 16384 || arg4 < local11) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg2, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(55) Class110 local55 = Static238.method3545(arg5, super.anInt6070, arg3, super.anInt6042, local35, super.anInt6040);
		if (local55 != null) {
			arg3.method4309(false);
			local55.method4889(arg6, null, 0);
			arg3.method4309(true);
		}
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)I")
	@Override
	public int method4751() {
		return this.aClass37_1 == null || this.aClass37_1.anInt871 == -1 ? super.method4751() : Static329.aClass240_1.method5229(this.aClass37_1.anInt871).anInt7201;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLclient!ya;I)Z")
	private boolean method3430(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class151 local11 = this.method4757();
		@Pc(30) Class138 local30 = super.anInt6021 != -1 && super.anInt6046 == 0 ? Static182.aClass55_1.method1397(super.anInt6021) : null;
		@Pc(50) Class138 local50 = super.anInt6076 == -1 || this.aBoolean402 || super.aBoolean562 && local30 != null ? null : Static182.aClass55_1.method1397(super.anInt6076);
		@Pc(59) int local59 = local11.anInt4662;
		@Pc(62) int local62 = local11.anInt4670;
		if (local59 != 0 || local62 != 0 || local11.anInt4674 != 0 || local11.anInt4660 != 0) {
			arg1 |= 0x7;
		}
		@Pc(104) boolean local104 = super.aByte68 != 0 && super.anInt6020 <= Static24.anInt5323 && Static24.anInt5323 < super.anInt6068;
		if (local104) {
			arg1 |= 0x80000;
		}
		@Pc(145) Class110 local145 = super.aClass110Array3[0] = this.aClass37_1.method833(Static222.aClass249_1, Static420.aClass109_2, local50, arg1, super.aClass165Array3, Static329.aClass240_1, super.anInt6058, super.anInt6060, local30, Static182.aClass55_1, super.anInt6036, super.anInt6016, arg0, Static444.aClass206_3, super.anInt6065, Static257.aClass114_1, super.anInt6073);
		@Pc(148) int local148 = Static317.method4232();
		if (Static70.anInt1503 < 96 && local148 > 50) {
			Static343.method743();
		}
		@Pc(177) int local177;
		if (Static373.aClass219_6 != Static104.aClass219_2 && local148 < 50) {
			local177 = 50 - local148;
			while (Static102.anInt2043 < local177) {
				Static392.aByteArrayArray28[Static102.anInt2043] = new byte[102400];
				Static102.anInt2043++;
			}
			while (local177 < Static102.anInt2043) {
				Static102.anInt2043--;
				Static392.aByteArrayArray28[Static102.anInt2043] = null;
			}
		} else if (Static373.aClass219_6 != Static104.aClass219_2) {
			Static392.aByteArrayArray28 = new byte[50][];
			Static102.anInt2043 = 0;
		}
		if (local145 == null) {
			return false;
		}
		super.anInt6030 = local145.MA();
		this.method4747(local145);
		local177 = super.aClass35_7.method811();
		if (local59 == 0 && local62 == 0) {
			this.method4752(this.method4751() << 7, 0, 0, local177, this.method4751() << 7);
		} else {
			this.method4752(local59, local11.anInt4671, local11.anInt4693, local177, local62);
			if (super.anInt6070 != 0) {
				local145.Z(super.anInt6070);
			}
			if (super.anInt6042 != 0) {
				local145.R(super.anInt6042);
			}
			if (super.anInt6040 != 0) {
				local145.JA(0, super.anInt6040, 0);
			}
		}
		if (local104) {
			local145.method4893(super.aByte71, super.aByte69, super.aByte70, super.aByte68 & 0xFF);
		}
		@Pc(318) Class161 local318;
		@Pc(330) boolean local330;
		@Pc(332) int local332;
		@Pc(375) Class110 local375;
		if (this.aBoolean402 || super.anInt6029 == -1 || super.anInt6027 == -1) {
			super.aClass110Array3[1] = null;
		} else {
			local318 = Static352.aClass194_2.method4421(super.anInt6029);
			local330 = local318.aByte47 == 3 && (local59 != 0 || local62 != 0);
			local332 = local7;
			if (local330) {
				local332 = local7 | 0x7;
			} else {
				if (super.anInt6017 != 0) {
					local332 = local7 | 0x5;
				}
				if (super.anInt6014 != 0) {
					local332 |= 0x2;
				}
			}
			local375 = super.aClass110Array3[1] = local318.method3830(super.anInt6027, super.anInt6033, Static182.aClass55_1, super.anInt6083, local332, arg0);
			if (local375 != null) {
				if (super.anInt6014 != 0) {
					local375.JA(0, -super.anInt6014 << 0, 0);
				}
				if (super.anInt6017 != 0) {
					local375.Q(super.anInt6017 * 2048);
				}
				if (local330) {
					if (super.anInt6070 != 0) {
						local375.Z(super.anInt6070);
					}
					if (super.anInt6042 != 0) {
						local375.R(super.anInt6042);
					}
					if (super.anInt6040 != 0) {
						local375.JA(0, super.anInt6040, 0);
					}
				}
			}
		}
		if (this.aBoolean402 || super.anInt6045 == -1 || super.anInt6022 == -1) {
			super.aClass110Array3[3] = null;
		} else {
			local318 = Static352.aClass194_2.method4421(super.anInt6045);
			local330 = local318.aByte47 == 3 && (local59 != 0 || local62 != 0);
			local332 = local7;
			if (local330) {
				local332 = local7 | 0x7;
			} else {
				if (super.anInt6056 != 0) {
					local332 = local7 | 0x5;
				}
				if (super.anInt6053 != 0) {
					local332 |= 0x2;
				}
			}
			local375 = super.aClass110Array3[3] = local318.method3837(arg0, super.anInt6062, Static182.aClass55_1, super.anInt6022, local332, super.anInt6069);
			if (local375 != null) {
				if (super.anInt6053 != 0) {
					local375.JA(0, -super.anInt6053 << 0, 0);
				}
				if (super.anInt6056 != 0) {
					local375.Q(super.anInt6056 * 2048);
				}
				if (local330) {
					if (super.anInt6070 != 0) {
						local375.Z(super.anInt6070);
					}
					if (super.anInt6042 != 0) {
						local375.R(super.anInt6042);
					}
					if (super.anInt6040 != 0) {
						local375.JA(0, super.anInt6040, 0);
					}
				}
			}
		}
		super.aClass110Array3[2] = null;
		if (!this.aBoolean402 && super.aClass4_Sub23_3 != null) {
			if (Static24.anInt5323 >= super.aClass4_Sub23_3.anInt3202) {
				super.aClass4_Sub23_3 = null;
			} else if (super.aClass4_Sub23_3.anInt3191 <= Static24.anInt5323) {
				@Pc(618) Class110 local618 = super.aClass4_Sub23_3.method2719(arg0, local7 | 0x7);
				if (local618 != null) {
					local618.JA(super.aClass4_Sub23_3.anInt3198 - super.anInt6893, super.aClass4_Sub23_3.anInt3188 - super.anInt6889, -super.anInt6892 + super.aClass4_Sub23_3.anInt3203);
					if (local177 != 0) {
						local618.Q(-local177 & 0x3FFF);
					}
					super.aClass110Array3[2] = local618;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
	@Override
	public void method5333() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method3432() {
		return this.aString44;
	}
}
