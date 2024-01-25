import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class21_Sub1_Sub1_Sub1_Sub2 extends Class21_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!hw", name = "Yc", descriptor = "Lclient!lw;")
	public Class206 aClass206_1;

	@OriginalMember(owner = "client!hw", name = "Zc", descriptor = "I")
	public int anInt4288;

	@OriginalMember(owner = "client!hw", name = "fd", descriptor = "Ljava/lang/String;")
	public String aString87;

	@OriginalMember(owner = "client!hw", name = "gd", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!hw", name = "Bd", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!hw", name = "Fd", descriptor = "I")
	private int anInt4313;

	@OriginalMember(owner = "client!hw", name = "Vc", descriptor = "I")
	public int anInt4287 = 0;

	@OriginalMember(owner = "client!hw", name = "hd", descriptor = "B")
	private byte aByte67 = 0;

	@OriginalMember(owner = "client!hw", name = "md", descriptor = "I")
	public int anInt4298 = -1;

	@OriginalMember(owner = "client!hw", name = "ud", descriptor = "I")
	public int anInt4303 = -1;

	@OriginalMember(owner = "client!hw", name = "pd", descriptor = "Z")
	public boolean aBoolean301 = false;

	@OriginalMember(owner = "client!hw", name = "Cd", descriptor = "I")
	public int anInt4311 = -1;

	@OriginalMember(owner = "client!hw", name = "nd", descriptor = "Z")
	public boolean aBoolean299 = false;

	@OriginalMember(owner = "client!hw", name = "od", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!hw", name = "ld", descriptor = "I")
	public int anInt4297 = 255;

	@OriginalMember(owner = "client!hw", name = "ed", descriptor = "I")
	public int anInt4293 = -1;

	@OriginalMember(owner = "client!hw", name = "Od", descriptor = "I")
	public int anInt4322 = -1;

	@OriginalMember(owner = "client!hw", name = "zd", descriptor = "I")
	public int anInt4308 = 0;

	@OriginalMember(owner = "client!hw", name = "Ld", descriptor = "I")
	public int anInt4319 = 0;

	@OriginalMember(owner = "client!hw", name = "Pd", descriptor = "I")
	public int anInt4323 = -1;

	@OriginalMember(owner = "client!hw", name = "dd", descriptor = "I")
	public int anInt4292 = 0;

	@OriginalMember(owner = "client!hw", name = "Ed", descriptor = "B")
	private byte aByte68 = 0;

	@OriginalMember(owner = "client!hw", name = "xd", descriptor = "I")
	public int anInt4306 = -1;

	@OriginalMember(owner = "client!hw", name = "Id", descriptor = "I")
	public int anInt4316 = -1;

	@OriginalMember(owner = "client!hw", name = "Jd", descriptor = "I")
	public int anInt4317 = 0;

	@OriginalMember(owner = "client!hw", name = "Sd", descriptor = "Z")
	public boolean aBoolean303 = false;

	@OriginalMember(owner = "client!hw", name = "Wc", descriptor = "B")
	private byte aByte66 = 0;

	@OriginalMember(owner = "client!hw", name = "Rd", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		if (this.aClass206_1 == null || !this.method3353(arg0, 2048)) {
			return null;
		}
		@Pc(21) Class81 local21 = arg0.method7812();
		@Pc(28) int local28 = super.aClass133_7.method2990();
		local21.o(local28);
		@Pc(51) Class182 local51 = Static571.aClass182ArrayArrayArray3[super.aByte127][super.anInt10551 >> Static392.anInt3635][super.anInt10550 >> Static392.anInt3635];
		@Pc(63) int local63;
		if (local51 == null || local51.aClass21_Sub1_Sub5_1 == null) {
			super.anInt4201 = (int) ((float) super.anInt4201 - (float) super.anInt4201 / 10.0F);
		} else {
			local63 = super.anInt4201 - local51.aClass21_Sub1_Sub5_1.aShort87;
			super.anInt4201 = (int) ((float) super.anInt4201 - (float) local63 / 10.0F);
		}
		local21.U(super.anInt10551, super.anInt10554 - super.anInt4201 - 20, super.anInt10550);
		super.aBoolean298 = false;
		if (Static455.aClass4_Sub35_Sub1_1.aBoolean684) {
			@Pc(112) Class252 local112 = this.method3322();
			if (local112.aBoolean550 && (this.aClass206_1.anInt6217 == -1 || Class21_Sub1_Sub2_Sub1.lb.method4992(this.aClass206_1.anInt6217).aBoolean132)) {
				@Pc(147) Class111 local147 = super.anInt4209 != -1 && super.anInt4214 == 0 ? Static17.aClass254_1.method5936(super.anInt4209) : null;
				@Pc(168) Class111 local168 = super.anInt4254 == -1 || this.aBoolean300 || super.aBoolean294 && local147 != null ? null : Static17.aClass254_1.method5936(super.anInt4254);
				@Pc(200) Class65 local200 = Static86.method1808(0, 1, arg0, local168 == null ? local147 : local168, local28, 160, super.anInt4267, 240, super.aClass65Array3[0], local168 == null ? super.anInt4272 : super.anInt4243, 0, super.anInt4211, super.anInt4246);
				if (local200 != null) {
					super.aBoolean298 = true;
					arg0.ZA(false);
					if (Static263.aBoolean371) {
						local200.method7686(local21, null, Static18.anInt941, 0);
					} else {
						local200.method7679(local21, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 == this) {
			local21.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			for (local63 = Static553.aClass292Array1.length - 1; local63 >= 0; local63--) {
				@Pc(248) Class292 local248 = Static553.aClass292Array1[local63];
				if (local248 != null && local248.anInt8836 != -1) {
					@Pc(282) int local282;
					if (local248.anInt8837 == 1) {
						@Pc(271) Class4_Sub29 local271 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local248.anInt8834);
						if (local271 != null) {
							@Pc(276) Class21_Sub1_Sub1_Sub1_Sub1 local276 = local271.aClass21_Sub1_Sub1_Sub1_Sub1_1;
							local282 = local276.anInt10551 - Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551;
							@Pc(288) int local288 = local276.anInt10550 - Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550;
							if (Static263.aBoolean371) {
								this.method3354(local248.anInt8836, local282, arg0, super.aClass65Array3[0], Static18.anInt941, local21, local288, 92160000);
							} else {
								this.method3342(local248.anInt8836, local282, local21, local288, 92160000, arg0, super.aClass65Array3[0]);
							}
						}
					}
					@Pc(344) int local344;
					if (local248.anInt8837 == 2) {
						@Pc(335) int local335 = local248.anInt8828 + 256 - Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551;
						local344 = local248.anInt8833 + 256 - Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550;
						local282 = local248.anInt8835 << 9;
						local282 *= local282;
						if (Static263.aBoolean371) {
							this.method3354(local248.anInt8836, local335, arg0, super.aClass65Array3[0], Static18.anInt941, local21, local344, local282);
						} else {
							this.method3342(local248.anInt8836, local335, local21, local344, local282, arg0, super.aClass65Array3[0]);
						}
					}
					if (local248.anInt8837 == 10 && local248.anInt8834 >= 0 && local248.anInt8834 < Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(410) Class21_Sub1_Sub1_Sub1_Sub2 local410 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local248.anInt8834];
						if (local410 != null) {
							local344 = local410.anInt10551 - Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551;
							local282 = local410.anInt10550 - Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550;
							if (Static263.aBoolean371) {
								this.method3354(local248.anInt8836, local344, arg0, super.aClass65Array3[0], Static18.anInt941, local21, local282, 92160000);
							} else {
								this.method3342(local248.anInt8836, local344, local21, local282, 92160000, arg0, super.aClass65Array3[0]);
							}
						}
					}
				}
			}
			local21.o(local28);
			local21.U(super.anInt10551, super.anInt10554, super.anInt10550);
		}
		local21.o(local28);
		local21.U(super.anInt10551, -super.anInt4201 + super.anInt10554 - 5, super.anInt10550);
		@Pc(501) Class21_Sub4 local501 = Static227.method3708(super.aClass65Array3.length);
		this.method3335(false, arg0, local21, super.aClass65Array3);
		@Pc(513) int local513;
		if (Static263.aBoolean371) {
			for (local513 = 0; super.aClass65Array3.length > local513; local513++) {
				if (super.aClass65Array3[local513] != null) {
					super.aClass65Array3[local513].method7686(local21, local501.aClass21_Sub7Array1[local513], Static18.anInt941, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local513 = 0; local513 < super.aClass65Array3.length; local513++) {
				if (super.aClass65Array3[local513] != null) {
					super.aClass65Array3[local513].method7679(local21, local501.aClass21_Sub7Array1[local513], Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass21_Sub5_4 != null) {
			@Pc(587) Class276 local587 = super.aClass21_Sub5_4.method3048();
			if (Static263.aBoolean371) {
				arg0.method7832(local587, Static18.anInt941);
			} else {
				arg0.method7777(local587);
			}
		}
		for (local513 = 0; super.aClass65Array3.length > local513; local513++) {
			if (super.aClass65Array3[local513] != null) {
				super.aBoolean298 |= super.aClass65Array3[local513].LA();
			}
		}
		super.anInt4203 = Static70.anInt1864;
		super.aClass65Array3[0] = super.aClass65Array3[1] = super.aClass65Array3[2] = null;
		return local501;
	}

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "(I)I")
	@Override
	public int method3339() {
		return this.aClass206_1 == null || this.aClass206_1.anInt6217 == -1 ? super.method3339() : Class21_Sub1_Sub2_Sub1.lb.method4992(this.aClass206_1.anInt6217).anInt1581;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		if (this.aClass206_1 == null || !this.method3353(arg2, 131072)) {
			return false;
		}
		@Pc(27) Class81 local27 = arg2.method7812();
		@Pc(32) int local32 = super.aClass133_7.method2990();
		local27.o(local32);
		local27.U(super.anInt10551, super.anInt10554, super.anInt10550);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; local47 < super.aClass65Array3.length; local47++) {
			if (super.aClass65Array3[local47] != null && (Static263.aBoolean371 ? super.aClass65Array3[local47].method7685(arg0, arg1, local27, true, Static18.anInt941) : super.aClass65Array3[local47].method7684(arg0, arg1, local27, true))) {
				local45 = true;
				break;
			}
		}
		super.aClass65Array3[0] = super.aClass65Array3[1] = super.aClass65Array3[2] = null;
		return local45;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILclient!q;IIILclient!r;Lclient!da;)V")
	private void method3342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class7 arg5, @OriginalArg(7) Class65 arg6) {
		@Pc(11) int local11 = arg1 * arg1 + arg3 * arg3;
		if (local11 < 262144 || local11 > arg4) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg1, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(55) Class65 local55 = Static1.method3889(super.anInt4211, super.anInt4267, super.anInt4246, local35, arg0, arg5);
		if (local55 != null) {
			arg5.ZA(false);
			local55.method7679(arg2, null, 0);
			arg5.ZA(true);
		}
	}

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return false;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method3345() {
		@Pc(7) String local7 = "";
		if (Static264.aStringArray19 != null) {
			local7 = local7 + Static264.aStringArray19[this.aByte68];
		}
		@Pc(34) int[] local34;
		if (this.aByte67 == 1 && Static153.anIntArray161 != null) {
			local34 = Static153.anIntArray161;
		} else {
			local34 = Static292.anIntArray326;
		}
		if (local34 != null && local34[this.aByte68] != -1) {
			@Pc(55) Class168 local55 = Static167.aClass291_2.method6677(local34[this.aByte68]);
			if (local55.aChar2 == 's') {
				local7 = local7 + local55.method3983(this.aByte66 & 0xFF);
			} else {
				Static109.method2014("gdn1", new Throwable());
				local34[this.aByte68] = -1;
			}
		}
		local7 = local7 + this.aString88;
		if (Static64.aStringArray4 != null) {
			local7 = local7 + Static64.aStringArray4[this.aByte68];
		}
		return local7;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZI)V")
	public void method3346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt4277 = 0;
		super.anInt4280 = 0;
		super.anIntArray206[0] = arg0;
		super.anInt4279 = 0;
		super.anIntArray207[0] = arg1;
		@Pc(30) int local30 = this.method3339();
		super.anInt10550 = super.anIntArray207[0] * 512 + local30 * 256;
		super.anInt10551 = local30 * 256 + super.anIntArray206[0] * 512;
		if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 == this) {
			Static41.method1090();
		}
		if (super.aClass21_Sub5_4 != null) {
			super.aClass21_Sub5_4.method3050();
		}
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(Z)I")
	@Override
	public int method3327() {
		return -1;
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)I")
	@Override
	protected int method3333() {
		return this.anInt4313;
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
		if (this.aClass206_1 == null || !super.aBoolean297 && !this.method3353(arg0, 0)) {
			return;
		}
		@Pc(27) Class81 local27 = arg0.method7812();
		local27.o(super.aClass133_7.method2990());
		local27.U(super.anInt10551, super.anInt10554 - 5, super.anInt10550);
		this.method3335(super.aBoolean297, arg0, local27, super.aClass65Array3);
		super.aClass65Array3[0] = super.aClass65Array3[1] = super.aClass65Array3[2] = null;
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(B)Z")
	public boolean method3347() {
		return this.aClass206_1 != null;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method3348() {
		return this.aString87;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIB)V")
	public void method3351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt4209 != -1 && Static17.aClass254_1.method5936(super.anInt4209).anInt3150 == 1) {
			super.anInt4209 = -1;
			super.anIntArray205 = null;
		}
		@Pc(40) Class49 local40;
		if (super.anInt4233 != -1) {
			local40 = Static342.aClass132_2.method2958(super.anInt4233);
			if (local40.aBoolean119 && local40.anInt1459 != -1 && Static17.aClass254_1.method5936(local40.anInt1459).anInt3150 == 1) {
				super.anInt4233 = -1;
			}
		}
		if (super.anInt4224 != -1) {
			local40 = Static342.aClass132_2.method2958(super.anInt4224);
			if (local40.aBoolean119 && local40.anInt1459 != -1 && Static17.aClass254_1.method5936(local40.anInt1459).anInt3150 == 1) {
				super.anInt4224 = -1;
			}
		}
		this.anInt4323 = -1;
		if (arg1 < 0 || Static338.anInt6508 <= arg1 || arg0 < 0 || Static390.anInt7654 <= arg0) {
			this.method3346(arg1, arg0);
		} else if (super.anIntArray206[0] >= 0 && super.anIntArray206[0] < Static338.anInt6508 && super.anIntArray207[0] >= 0 && Static390.anInt7654 > super.anIntArray207[0]) {
			if (arg2 == 2) {
				Static573.method8077(this, arg0, arg1);
			}
			this.method3355(arg1, arg2, arg0);
		} else {
			this.method3346(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILclient!r;I)Z")
	private boolean method3353(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class252 local11 = this.method3322();
		@Pc(27) Class111 local27 = super.anInt4209 != -1 && super.anInt4214 == 0 ? Static17.aClass254_1.method5936(super.anInt4209) : null;
		@Pc(47) Class111 local47 = super.anInt4254 == -1 || this.aBoolean300 || super.aBoolean294 && local27 != null ? null : Static17.aClass254_1.method5936(super.anInt4254);
		@Pc(50) int local50 = local11.anInt7475;
		@Pc(53) int local53 = local11.anInt7481;
		if (local50 != 0 || local53 != 0 || local11.anInt7517 != 0 || local11.anInt7506 != 0) {
			arg1 |= 0x7;
		}
		@Pc(83) int local83 = super.aClass133_7.method2990();
		@Pc(109) boolean local109 = super.aByte64 != 0 && super.anInt4273 <= Static306.anInt6122 && Static306.anInt6122 < super.anInt4217;
		if (local109) {
			arg1 |= 0x80000;
		}
		@Pc(155) Class65 local155 = super.aClass65Array3[0] = this.aClass206_1.method4886(local83, Static338.aClass29_1, local47, super.anInt4272, Static203.aClass230_1, super.aClass237Array3, Static523.aClass173_1, super.anInt4252, local27, arg1, arg0, Class21_Sub1_Sub2_Sub1.lb, super.anInt4257, super.anInt4266, super.anInt4198, Static17.aClass254_1, super.anInt4243, Static516.aClass127_2, super.anIntArray202);
		@Pc(158) int local158 = Static529.method7481();
		if (Static503.anInt9410 < 96 && local158 > 50) {
			Static478.method6940();
		}
		if (Static383.aClass326_7 != Static342.aClass326_6 && local158 < 50) {
			@Pc(191) int local191 = 50 - local158;
			while (Static215.anInt4516 < local191) {
				Static302.aByteArrayArray20[Static215.anInt4516] = new byte[102400];
				Static215.anInt4516++;
			}
			while (Static215.anInt4516 > local191) {
				Static215.anInt4516--;
				Static302.aByteArrayArray20[Static215.anInt4516] = null;
			}
		} else if (Static383.aClass326_7 != Static342.aClass326_6) {
			Static302.aByteArrayArray20 = new byte[50][];
			Static215.anInt4516 = 0;
		}
		if (local155 == null) {
			return false;
		}
		super.anInt4268 = local155.J();
		super.anInt4241 = local155.RA();
		this.method3330(local155);
		if (local50 == 0 && local53 == 0) {
			this.method3324(0, this.method3339() << 9, this.method3339() << 9, 0, local83);
		} else {
			this.method3324(local11.anInt7509, local53, local50, local11.anInt7480, local83);
			if (super.anInt4246 != 0) {
				local155.MA(super.anInt4246);
			}
			if (super.anInt4211 != 0) {
				local155.W(super.anInt4211);
			}
			if (super.anInt4267 != 0) {
				local155.oa(0, super.anInt4267, 0);
			}
		}
		if (local109) {
			local155.method7683(super.aByte62, super.aByte65, super.aByte63, super.aByte64 & 0xFF);
		}
		@Pc(356) boolean local356;
		@Pc(358) int local358;
		@Pc(398) Class65 local398;
		@Pc(338) Class49 local338;
		if (this.aBoolean300 || super.anInt4233 == -1 || super.anInt4236 == -1) {
			super.aClass65Array3[1] = null;
		} else {
			local338 = Static342.aClass132_2.method2958(super.anInt4233);
			local356 = local338.aByte14 == 3 && (local50 != 0 || local53 != 0);
			local358 = local7;
			if (local356) {
				local358 = local7 | 0x7;
			} else {
				if (super.anInt4222 != 0) {
					local358 = local7 | 0x5;
				}
				if (super.anInt4234 != 0) {
					local358 |= 0x2;
				}
			}
			local398 = super.aClass65Array3[1] = local338.method1282(super.anInt4236, local358, Static17.aClass254_1, super.anInt4204, arg0, super.anInt4271);
			if (local398 != null) {
				if (super.anInt4234 != 0) {
					local398.oa(0, -super.anInt4234 << 2, 0);
				}
				if (super.anInt4222 != 0) {
					local398.M(super.anInt4222 * 2048);
				}
				if (local356) {
					if (super.anInt4246 != 0) {
						local398.MA(super.anInt4246);
					}
					if (super.anInt4211 != 0) {
						local398.W(super.anInt4211);
					}
					if (super.anInt4267 != 0) {
						local398.oa(0, super.anInt4267, 0);
					}
				}
			}
		}
		if (this.aBoolean300 || super.anInt4224 == -1 || super.anInt4270 == -1) {
			super.aClass65Array3[2] = null;
		} else {
			local338 = Static342.aClass132_2.method2958(super.anInt4224);
			local356 = local338.aByte14 == 3 && (local50 != 0 || local53 != 0);
			local358 = local7;
			if (local356) {
				local358 = local7 | 0x7;
			} else {
				if (super.anInt4249 != 0) {
					local358 = local7 | 0x5;
				}
				if (super.anInt4223 != 0) {
					local358 |= 0x2;
				}
			}
			local398 = super.aClass65Array3[2] = local338.method1285(super.anInt4270, super.anInt4245, super.anInt4206, Static17.aClass254_1, local358, arg0);
			if (local398 != null) {
				if (super.anInt4223 != 0) {
					local398.oa(0, -super.anInt4223 << 2, 0);
				}
				if (super.anInt4249 != 0) {
					local398.M(super.anInt4249 * 2048);
				}
				if (local356) {
					if (super.anInt4246 != 0) {
						local398.MA(super.anInt4246);
					}
					if (super.anInt4211 != 0) {
						local398.W(super.anInt4211);
					}
					if (super.anInt4267 != 0) {
						local398.oa(0, super.anInt4267, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILclient!r;BLclient!da;ILclient!q;II)V")
	private void method3354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg6 * arg6 + arg1 * arg1;
		if (local11 < 262144 || arg7 < local11) {
			return;
		}
		@Pc(43) int local43 = (int) (Math.atan2((double) arg1, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(57) Class65 local57 = Static1.method3889(super.anInt4211, super.anInt4267, super.anInt4246, local43, arg0, arg2);
		if (local57 != null) {
			arg2.ZA(false);
			local57.method7686(arg5, null, arg4, 0);
			arg2.ZA(true);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBBI)V")
	public void method3355(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4277 < 9) {
			super.anInt4277++;
		}
		for (@Pc(28) int local28 = super.anInt4277; local28 > 0; local28--) {
			super.anIntArray206[local28] = super.anIntArray206[local28 - 1];
			super.anIntArray207[local28] = super.anIntArray207[local28 - 1];
			super.aByteArray34[local28] = super.aByteArray34[local28 - 1];
		}
		super.anIntArray206[0] = arg0;
		super.anIntArray207[0] = arg2;
		super.aByteArray34[0] = arg1;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BLclient!ek;)V")
	public void method3356(@OriginalArg(1) Class4_Sub13 arg0) {
		arg0.anInt9170 = 0;
		@Pc(12) int local12 = arg0.method7004();
		this.aByte67 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean301;
		this.aBoolean301 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(47) int local47 = super.method3339();
		this.method3334((local12 >> 3 & 0x7) + 1);
		this.aByte68 = (byte) (local12 >> 6 & 0x3);
		super.anInt10551 += this.method3339() - local47 << 8;
		super.anInt10550 += this.method3339() - local47 << 8;
		this.aByte66 = arg0.method7011();
		this.anInt4306 = arg0.method7011();
		this.anInt4316 = arg0.method7011();
		this.aBoolean299 = arg0.method7011() == 1;
		if (Static342.aClass326_6 == Static383.aClass326_7 && Static100.anInt2432 >= 2) {
			this.aBoolean299 = false;
		}
		this.anInt4292 = 0;
		@Pc(134) int local134 = -1;
		@Pc(137) int[] local137 = new int[12];
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(205) int local205;
		for (@Pc(139) int local139 = 0; local139 < 12; local139++) {
			@Pc(145) int local145 = arg0.method7004();
			if (local145 == 0) {
				local137[local139] = 0;
			} else {
				local157 = arg0.method7004();
				local163 = local157 + (local145 << 8);
				if (local139 == 0 && local163 == 65535) {
					local134 = arg0.method7054();
					this.anInt4292 = arg0.method7004();
					break;
				}
				if (local163 >= 32768) {
					local163 = Static337.anIntArray359[local163 - 32768];
					local137[local139] = local163 | 0x40000000;
					local205 = Static338.aClass29_1.method977(local163).anInt6804;
					if (local205 != 0) {
						this.anInt4292 = local205;
					}
				} else {
					local137[local139] = local163 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(232) int[] local232 = new int[5];
		for (local157 = 0; local157 < 5; local157++) {
			local163 = arg0.method7004();
			if (Static360.aShortArrayArrayArray3.length < 1 || local163 < 0 || Static360.aShortArrayArrayArray3[0][local157].length <= local163) {
				local163 = 0;
			}
			local232[local157] = local163;
		}
		this.anInt4313 = arg0.method7054();
		this.aString88 = arg0.method7016();
		this.aString87 = this.aString88;
		this.anInt4287 = arg0.method7004();
		if (local41) {
			this.anInt4319 = arg0.method7054();
			this.anInt4293 = -1;
			if (this.anInt4319 == 65535) {
				this.anInt4319 = -1;
			}
			this.anInt4317 = this.anInt4287;
		} else {
			this.anInt4319 = 0;
			this.anInt4317 = arg0.method7004();
			this.anInt4293 = arg0.method7004();
			if (this.anInt4293 == 255) {
				this.anInt4293 = -1;
			}
		}
		local163 = this.anInt4308;
		this.anInt4308 = arg0.method7004();
		@Pc(368) int local368;
		if (this.anInt4308 == 0) {
			Static65.method1452(this);
		} else {
			local205 = this.anInt4311;
			@Pc(365) int local365 = this.anInt4322;
			local368 = this.anInt4298;
			@Pc(371) int local371 = this.anInt4303;
			@Pc(374) int local374 = this.anInt4297;
			this.anInt4311 = arg0.method7054();
			this.anInt4322 = arg0.method7054();
			this.anInt4298 = arg0.method7054();
			this.anInt4303 = arg0.method7054();
			this.anInt4297 = arg0.method7004();
			if (this.aBoolean301 != local21 || local163 != this.anInt4308 || local205 != this.anInt4311 || local365 != this.anInt4322 || this.anInt4298 != local368 || this.anInt4303 != local371 || local374 != this.anInt4297) {
				Static422.method6327(this);
			}
		}
		if (this.aClass206_1 == null) {
			this.aClass206_1 = new Class206();
		}
		local205 = this.aClass206_1.anInt6217;
		@Pc(470) int[] local470 = this.aClass206_1.anIntArray343;
		this.aClass206_1.method4897(local232, this.aByte67 == 1, this.method3333(), local137, local134);
		if (local205 != local134) {
			super.anInt10551 = (super.anIntArray206[0] << 9) + (this.method3339() << 8);
			super.anInt10550 = (super.anIntArray207[0] << 9) + (this.method3339() << 8);
		}
		if (Static1.anInt5011 == super.anInt4256 && local470 != null) {
			for (local368 = 0; local368 < local232.length; local368++) {
				if (local232[local368] != local470[local368]) {
					Static338.aClass29_1.method989();
					break;
				}
			}
		}
		if (super.aClass21_Sub5_4 != null) {
			super.aClass21_Sub5_4.method3050();
		}
		if (super.anInt4254 == -1 || !super.aBoolean294) {
			return;
		}
		@Pc(571) Class252 local571 = this.method3322();
		if (!local571.method5904(super.anInt4254)) {
			super.anInt4254 = -1;
			super.aBoolean294 = false;
			return;
		}
	}
}
