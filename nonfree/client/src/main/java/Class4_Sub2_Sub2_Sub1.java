import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class4_Sub2_Sub2_Sub1 extends Class4_Sub2_Sub2 {

	@OriginalMember(owner = "client!ql", name = "Sc", descriptor = "I")
	private int anInt5732;

	@OriginalMember(owner = "client!ql", name = "Yc", descriptor = "I")
	public int anInt5736;

	@OriginalMember(owner = "client!ql", name = "id", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!ql", name = "kd", descriptor = "Lclient!ag;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!ql", name = "sd", descriptor = "I")
	public int anInt5751;

	@OriginalMember(owner = "client!ql", name = "vd", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!ql", name = "Pc", descriptor = "B")
	private byte aByte72 = 0;

	@OriginalMember(owner = "client!ql", name = "Ic", descriptor = "I")
	public int anInt5723 = 255;

	@OriginalMember(owner = "client!ql", name = "Lc", descriptor = "I")
	public int anInt5726 = 0;

	@OriginalMember(owner = "client!ql", name = "Tc", descriptor = "Z")
	public boolean aBoolean508 = false;

	@OriginalMember(owner = "client!ql", name = "Qc", descriptor = "I")
	public int anInt5730 = 0;

	@OriginalMember(owner = "client!ql", name = "Vc", descriptor = "I")
	public int anInt5734 = 0;

	@OriginalMember(owner = "client!ql", name = "Fc", descriptor = "I")
	public int anInt5720 = -1;

	@OriginalMember(owner = "client!ql", name = "bd", descriptor = "B")
	private byte aByte74 = 0;

	@OriginalMember(owner = "client!ql", name = "Uc", descriptor = "I")
	public int anInt5733 = -1;

	@OriginalMember(owner = "client!ql", name = "Xc", descriptor = "B")
	private byte aByte73 = 0;

	@OriginalMember(owner = "client!ql", name = "ld", descriptor = "I")
	public int anInt5745 = -1;

	@OriginalMember(owner = "client!ql", name = "dd", descriptor = "I")
	public int anInt5740 = -1;

	@OriginalMember(owner = "client!ql", name = "Nc", descriptor = "I")
	public int anInt5728 = -1;

	@OriginalMember(owner = "client!ql", name = "qd", descriptor = "Z")
	public boolean aBoolean509 = false;

	@OriginalMember(owner = "client!ql", name = "jd", descriptor = "I")
	public int anInt5744 = -1;

	@OriginalMember(owner = "client!ql", name = "md", descriptor = "I")
	public int anInt5746 = -1;

	@OriginalMember(owner = "client!ql", name = "hd", descriptor = "I")
	public int anInt5743 = 0;

	@OriginalMember(owner = "client!ql", name = "ad", descriptor = "I")
	public int anInt5738 = -1;

	@OriginalMember(owner = "client!ql", name = "rd", descriptor = "I")
	public int anInt5750 = 0;

	@OriginalMember(owner = "client!ql", name = "wd", descriptor = "Z")
	public boolean aBoolean510 = false;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		if (this.aClass7_1 == null || !this.method4605(2048, arg0)) {
			return null;
		}
		@Pc(25) Class102 local25 = arg0.method2223();
		@Pc(30) int local30 = super.aClass157_7.method3616();
		local25.O(local30);
		local25.ZA(super.anInt7117, super.anInt7109, super.anInt7111);
		@Pc(44) float local44 = arg0.la();
		@Pc(47) float local47 = arg0.w();
		if (Static399.aClass167_Sub1_1.aBoolean493) {
			@Pc(54) Class12 local54 = this.method5131();
			if (local54.aBoolean32 && (this.aClass7_1.anInt235 == -1 || Static417.aClass234_2.method5362(this.aClass7_1.anInt235).aBoolean532)) {
				@Pc(88) Class46 local88 = super.anInt6469 != -1 && super.anInt6517 == 0 ? Static9.aClass194_1.method4371(super.anInt6469) : null;
				@Pc(108) Class46 local108 = super.anInt6458 == -1 || this.aBoolean509 || super.aBoolean561 && local88 != null ? null : Static9.aClass194_1.method4371(super.anInt6458);
				@Pc(142) Class32 local142 = Static335.method1104(local108 == null ? super.anInt6483 : super.anInt6452, super.anInt6490, super.anInt6519, local108 == null ? local88 : local108, 0, arg0, 240, 1, super.aClass32Array3[0], 0, 160, local30, super.anInt6482, super.aBoolean560);
				if (local142 != null) {
					arg0.o(local44, local47 - 128.0F);
					arg0.method2253(false);
					local142.method5675(local25, null, 0);
					arg0.method2253(true);
				}
			}
		}
		if (Static231.aClass4_Sub2_Sub2_Sub1_2 == this) {
			arg0.o(local44, local47 - 144.0F);
			local25.R(super.anInt7117, super.anInt7109, super.anInt7111);
			for (@Pc(183) int local183 = Static2.aClass233Array1.length - 1; local183 >= 0; local183--) {
				@Pc(189) Class233 local189 = Static2.aClass233Array1[local183];
				if (local189 != null && local189.anInt6827 != -1) {
					@Pc(230) int local230;
					@Pc(224) int local224;
					if (local189.anInt6828 == 1 && local189.anInt6821 >= 0 && Static4.aClass4_Sub2_Sub2_Sub2Array1.length > local189.anInt6821) {
						@Pc(216) Class4_Sub2_Sub2_Sub2 local216 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local189.anInt6821];
						if (local216 != null) {
							local224 = local216.anInt7117 - Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117;
							local230 = local216.anInt7111 - Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111;
							this.method4599(local224, local25, 5760000, arg0, local189.anInt6827, local230, super.aClass32Array3[0]);
						}
					}
					if (local189.anInt6828 == 2) {
						@Pc(259) int local259 = local189.anInt6829 + 64 - Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117;
						local224 = local189.anInt6824 + 64 - Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111;
						local230 = local189.anInt6826 << 7;
						local230 *= local230;
						this.method4599(local259, local25, local230, arg0, local189.anInt6827, local224, super.aClass32Array3[0]);
					}
					if (local189.anInt6828 == 10 && local189.anInt6821 >= 0 && Static129.aClass4_Sub2_Sub2_Sub1Array27.length > local189.anInt6821) {
						@Pc(314) Class4_Sub2_Sub2_Sub1 local314 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local189.anInt6821];
						if (local314 != null) {
							local224 = local314.anInt7117 - Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117;
							local230 = local314.anInt7111 - Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111;
							this.method4599(local224, local25, 5760000, arg0, local189.anInt6827, local230, super.aClass32Array3[0]);
						}
					}
				}
			}
			local25.O(local30);
			local25.ZA(super.anInt7117, super.anInt7109, super.anInt7111);
		}
		arg0.o(local44, local47);
		@Pc(371) Class38_Sub3 local371 = Static313.method4433(super.aClass32Array3.length);
		if (super.aClass38_Sub6_5 == null) {
			arg0.method2291(super.aClass32Array3, local25, local371.aClass38_Sub4Array1, Static231.aClass4_Sub2_Sub2_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(378) Class192 local378 = super.aClass38_Sub6_5.method3549();
			arg0.method2241(super.aClass32Array3, local378, local25, local371.aClass38_Sub4Array1, Static231.aClass4_Sub2_Sub2_Sub1_2 == this ? 1 : 0);
		}
		this.method5127(arg0, false, super.aClass32Array3);
		if (super.aClass32Array3[2] != null) {
			if (local30 != 0) {
				super.aClass32Array3[2].k(local30);
			}
			super.aClass32Array3[2].ja(super.anInt7117 - super.aClass2_Sub24_3.anInt3886, -super.aClass2_Sub24_3.anInt3892 + super.anInt7109, -super.aClass2_Sub24_3.anInt3891 + super.anInt7111);
		}
		super.anInt6474 = Static41.anInt1082;
		return local371;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I")
	@Override
	public int method5125() {
		return -1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass7_1 == null || !this.method4605(131072, arg1)) {
			return true;
		}
		@Pc(21) Class102 local21 = arg1.method2223();
		@Pc(26) int local26 = super.aClass157_7.method3616();
		local21.O(local26);
		local21.ZA(super.anInt7117, super.anInt7109, super.anInt7111);
		for (@Pc(45) int local45 = 0; local45 < super.aClass32Array3.length; local45++) {
			if (super.aClass32Array3[local45] != null && super.aClass32Array3[local45].method5671(arg2, arg0, local21, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!md;)V")
	public void method4596(@OriginalArg(1) Class2_Sub20 arg0) {
		arg0.anInt4608 = 0;
		@Pc(12) int local12 = arg0.method3737();
		this.aByte74 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(34) boolean local34 = (local12 & 0x4) != 0;
		@Pc(38) int local38 = super.method5118();
		this.method5117((local12 >> 3 & 0x7) + 1);
		this.aByte73 = (byte) (local12 >> 6 & 0x3);
		super.anInt7117 += this.method5118() - local38 << 6;
		super.anInt7111 += this.method5118() - local38 << 6;
		this.aByte72 = arg0.method3693();
		this.anInt5720 = arg0.method3693();
		this.anInt5740 = arg0.method3693();
		@Pc(107) int local107 = -1;
		this.anInt5734 = 0;
		@Pc(113) int[] local113 = new int[12];
		@Pc(133) int local133;
		@Pc(139) int local139;
		@Pc(181) int local181;
		for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
			@Pc(121) int local121 = arg0.method3737();
			if (local121 == 0) {
				local113[local115] = 0;
			} else {
				local133 = arg0.method3737();
				local139 = (local121 << 8) + local133;
				if (local115 == 0 && local139 == 65535) {
					local107 = arg0.method3711();
					this.anInt5734 = arg0.method3737();
					break;
				}
				if (local139 >= 32768) {
					local139 = Static15.anIntArray25[local139 - 32768];
					local113[local115] = local139 | 0x40000000;
					local181 = Static350.aClass149_2.method3483(local139).anInt1016;
					if (local181 != 0) {
						this.anInt5734 = local181;
					}
				} else {
					local113[local115] = local139 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(206) int[] local206 = new int[5];
		for (local133 = 0; local133 < 5; local133++) {
			local139 = arg0.method3737();
			if (local139 < 0 || Static174.aShortArrayArray3[local133].length <= local139) {
				local139 = 0;
			}
			local206[local133] = local139;
		}
		this.anInt5732 = arg0.method3711();
		this.aString47 = arg0.method3717();
		if (local26) {
			this.aString48 = arg0.method3717();
		} else {
			this.aString48 = this.aString47;
		}
		this.anInt5730 = arg0.method3737();
		if (local34) {
			this.anInt5750 = arg0.method3711();
			this.anInt5746 = -1;
			this.anInt5743 = this.anInt5730;
		} else {
			this.anInt5750 = 0;
			this.anInt5743 = arg0.method3737();
			this.anInt5746 = arg0.method3737();
			if (this.anInt5746 == 255) {
				this.anInt5746 = -1;
			}
		}
		local139 = this.anInt5726;
		this.anInt5726 = arg0.method3737();
		@Pc(326) int local326;
		if (this.anInt5726 == 0) {
			Static255.method3890(this);
		} else {
			local181 = this.anInt5728;
			@Pc(323) int local323 = this.anInt5744;
			local326 = this.anInt5745;
			@Pc(329) int local329 = this.anInt5738;
			@Pc(332) int local332 = this.anInt5723;
			this.anInt5728 = arg0.method3711();
			this.anInt5744 = arg0.method3711();
			this.anInt5745 = arg0.method3711();
			this.anInt5738 = arg0.method3711();
			this.anInt5723 = arg0.method3737();
			if (this.anInt5726 != local139 || local181 != this.anInt5728 || this.anInt5744 != local323 || local326 != this.anInt5745 || this.anInt5738 != local329 || local332 != this.anInt5723) {
				Static332.method4734(this);
			}
		}
		if (this.aClass7_1 == null) {
			this.aClass7_1 = new Class7();
		}
		local181 = this.aClass7_1.anInt235;
		@Pc(408) int[] local408 = this.aClass7_1.anIntArray10;
		this.aClass7_1.method155(this.aByte74 == 1, this.method5120(), local113, local107, local206);
		if (local107 != local181) {
			super.anInt7117 = (super.anIntArray436[0] << 7) + (this.method5118() << 6);
			super.anInt7111 = (super.anIntArray437[0] << 7) + (this.method5118() << 6);
		}
		if (super.anInt6456 == Static393.anInt6881 && local408 != null) {
			for (local326 = 0; local326 < local206.length; local326++) {
				if (local206[local326] != local408[local326]) {
					Static350.aClass149_2.method3482();
					break;
				}
			}
		}
		if (super.aClass38_Sub6_5 != null) {
			super.aClass38_Sub6_5.method3553();
		}
		if (super.anInt6458 == -1 || !super.aBoolean561) {
			return;
		}
		@Pc(511) Class12 local511 = this.method5131();
		if (!local511.method225(super.anInt6458)) {
			super.anInt6458 = -1;
			super.aBoolean561 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BBII)V")
	public void method4598(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6469 != -1 && Static9.aClass194_1.method4371(super.anInt6469).anInt1772 == 1) {
			super.anInt6469 = -1;
		}
		@Pc(34) Class77 local34;
		if (super.anInt6449 != -1) {
			local34 = Static137.aClass16_2.method251(super.anInt6449);
			if (local34.aBoolean191 && local34.anInt2238 != -1 && Static9.aClass194_1.method4371(local34.anInt2238).anInt1772 == 1) {
				super.anInt6449 = -1;
			}
		}
		if (super.anInt6509 != -1) {
			local34 = Static137.aClass16_2.method251(super.anInt6509);
			if (local34.aBoolean191 && local34.anInt2238 != -1 && Static9.aClass194_1.method4371(local34.anInt2238).anInt1772 == 1) {
				super.anInt6509 = -1;
			}
		}
		this.anInt5733 = -1;
		if (arg1 < 0 || arg1 >= Static81.anInt1950 || arg2 < 0 || Static171.anInt3288 <= arg2) {
			this.method4603(arg2, arg1);
		} else if (super.anIntArray436[0] >= 0 && super.anIntArray436[0] < Static81.anInt1950 && super.anIntArray437[0] >= 0 && super.anIntArray437[0] < Static171.anInt3288) {
			if (arg0 == 2) {
				Static299.method4335(this, arg1, arg2);
			}
			this.method4601(arg0, arg2, arg1);
		} else {
			this.method4603(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!ia;ILclient!qa;BIILclient!c;)V")
	private void method4599(@OriginalArg(0) int arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class32 arg6) {
		@Pc(15) int local15 = arg5 * arg5 + arg0 * arg0;
		if (local15 < 16384 || arg2 < local15) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg0, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class32 local51 = Static166.method2612(super.anInt6519, local39, arg4, arg3, super.anInt6490, super.anInt6482);
		if (local51 != null) {
			arg3.method2253(false);
			local51.method5675(arg1, null, 0);
			arg3.method2253(true);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
		if (this.aClass7_1 != null && (super.aBoolean563 || this.method4605(0, arg0))) {
			this.method5127(arg0, super.aBoolean563, super.aClass32Array3);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method4600() {
		@Pc(7) String local7 = "";
		if (Static81.aStringArray9 != null) {
			local7 = local7 + Static81.aStringArray9[this.aByte73];
		}
		@Pc(29) int[] local29;
		if (this.aByte74 == 1 && Static137.anIntArray147 != null) {
			local29 = Static137.anIntArray147;
		} else {
			local29 = Static46.anIntArray50;
		}
		if (local29 != null && local29[this.aByte73] != -1) {
			@Pc(49) Class204 local49 = Static293.aClass24_6.method442(local29[this.aByte73]);
			if (local49.aChar4 == 's') {
				local7 = local7 + local49.method4683(this.aByte72 & 0xFF);
			} else {
				Static80.method1410(new Throwable(), "gdn1");
				local29[this.aByte73] = -1;
			}
		}
		local7 = local7 + this.aString47;
		if (Static184.aStringArray15 != null) {
			local7 = local7 + Static184.aStringArray15[this.aByte73];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IBII)V")
	public void method4601(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6524 < 9) {
			super.anInt6524++;
		}
		for (@Pc(24) int local24 = super.anInt6524; local24 > 0; local24--) {
			super.anIntArray436[local24] = super.anIntArray436[local24 - 1];
			super.anIntArray437[local24] = super.anIntArray437[local24 - 1];
			super.aByteArray181[local24] = super.aByteArray181[local24 - 1];
		}
		super.anIntArray436[0] = arg2;
		super.aByteArray181[0] = arg0;
		super.anIntArray437[0] = arg1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)I")
	@Override
	protected int method5120() {
		return this.anInt5732;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)V")
	public void method4603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6525 = 0;
		super.anIntArray436[0] = arg1;
		super.anInt6526 = 0;
		super.anInt6524 = 0;
		super.anIntArray437[0] = arg0;
		@Pc(26) int local26 = this.method5118();
		super.anInt7117 = super.anIntArray436[0] * 128 + local26 * 64;
		super.anInt7111 = super.anIntArray437[0] * 128 + local26 * 64;
		if (Static231.aClass4_Sub2_Sub2_Sub1_2 == this) {
			Static272.method5841();
		}
		if (super.aClass38_Sub6_5 != null) {
			super.aClass38_Sub6_5.method3553();
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)I")
	@Override
	public int method5562() {
		return super.anInt6486;
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(B)Z")
	public boolean method4604() {
		return this.aClass7_1 != null;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!qa;I)Z")
	private boolean method4605(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class12 local11 = this.method5131();
		@Pc(26) Class46 local26 = super.anInt6469 != -1 && super.anInt6517 == 0 ? Static9.aClass194_1.method4371(super.anInt6469) : null;
		@Pc(46) Class46 local46 = super.anInt6458 == -1 || this.aBoolean509 || super.aBoolean561 && local26 != null ? null : Static9.aClass194_1.method4371(super.anInt6458);
		@Pc(49) int local49 = local11.anInt332;
		@Pc(52) int local52 = local11.anInt348;
		if (local49 != 0 || local52 != 0 || local11.anInt337 != 0 || local11.anInt355 != 0) {
			arg0 |= 0x7;
		}
		@Pc(98) boolean local98 = super.aByte87 != 0 && Static164.anInt3206 >= super.anInt6495 && Static164.anInt3206 < super.anInt6468;
		if (local98) {
			arg0 |= 0x80000;
		}
		@Pc(139) Class32 local139 = super.aClass32Array3[0] = this.aClass7_1.method158(Static215.aClass225_1, super.anInt6483, local26, super.anInt6494, super.anInt6520, local46, super.anInt6452, Static350.aClass149_2, Static417.aClass234_2, arg0, super.aClass268Array3, super.anInt6501, Static4.aClass136_1, arg1, Static9.aClass194_1, Static10.aClass61_1, super.anInt6460);
		@Pc(144) int local144 = Static397.method5449();
		if (Static43.anInt1146 < 96 && local144 > 50) {
			Static252.method3872();
		}
		@Pc(169) int local169;
		if (Static343.aClass269_11 != Static293.aClass269_10 && local144 < 50) {
			local169 = 50 - local144;
			while (Static11.anInt309 < local169) {
				Static34.aByteArrayArray1[Static11.anInt309] = new byte[102400];
				Static11.anInt309++;
			}
			while (local169 < Static11.anInt309) {
				Static11.anInt309--;
				Static34.aByteArrayArray1[Static11.anInt309] = null;
			}
		} else if (Static343.aClass269_11 != Static293.aClass269_10) {
			Static34.aByteArrayArray1 = new byte[50][];
			Static11.anInt309 = 0;
		}
		if (local139 == null) {
			return false;
		}
		super.anInt6486 = local139.b();
		this.method5123(local139);
		local169 = super.aClass157_7.method3616();
		if (local49 == 0 && local52 == 0) {
			this.method5121(this.method5118() << 7, 0, this.method5118() << 7, 0, local169);
		} else {
			this.method5121(local49, local11.anInt344, local52, local11.anInt339, local169);
			if (super.anInt6519 != 0) {
				local139.WA(super.anInt6519);
			}
			if (super.anInt6482 != 0) {
				local139.o(super.anInt6482);
			}
			if (super.anInt6490 != 0) {
				local139.ja(0, super.anInt6490, 0);
			}
		}
		if (local98) {
			local139.method5684(super.aByte85, super.aByte86, super.aByte88, super.aByte87 & 0xFF);
		}
		@Pc(319) Class77 local319;
		@Pc(333) boolean local333;
		@Pc(335) int local335;
		@Pc(381) Class32 local381;
		if (this.aBoolean509 || super.anInt6449 == -1 || super.anInt6515 == -1) {
			super.aClass32Array3[1] = null;
		} else {
			local319 = Static137.aClass16_2.method251(super.anInt6449);
			local333 = local319.aByte17 == 3 && (local49 != 0 || local52 != 0);
			local335 = local7;
			if (local333) {
				local335 = local7 | 0x7;
			} else {
				if (super.anInt6493 != 0) {
					local335 = local7 | 0x5;
				}
				if (super.anInt6467 != 0) {
					local335 |= 0x2;
				}
			}
			local381 = super.aClass32Array3[1] = local319.method1670(arg1, super.anInt6521, local335, super.anInt6480, Static9.aClass194_1, super.anInt6515);
			if (local381 != null) {
				if (super.anInt6467 != 0) {
					local381.ja(0, -super.anInt6467 << 0, 0);
				}
				if (super.anInt6493 != 0) {
					local381.k(super.anInt6493 * 2048);
				}
				if (local333) {
					if (super.anInt6519 != 0) {
						local381.WA(super.anInt6519);
					}
					if (super.anInt6482 != 0) {
						local381.o(super.anInt6482);
					}
					if (super.anInt6490 != 0) {
						local381.ja(0, super.anInt6490, 0);
					}
				}
			}
		}
		if (this.aBoolean509 || super.anInt6509 == -1 || super.anInt6459 == -1) {
			super.aClass32Array3[3] = null;
		} else {
			local319 = Static137.aClass16_2.method251(super.anInt6509);
			local333 = local319.aByte17 == 3 && (local49 != 0 || local52 != 0);
			local335 = local7;
			if (local333) {
				local335 = local7 | 0x7;
			} else {
				if (super.anInt6478 != 0) {
					local335 = local7 | 0x5;
				}
				if (super.anInt6472 != 0) {
					local335 |= 0x2;
				}
			}
			local381 = super.aClass32Array3[3] = local319.method1663(arg1, local335, super.anInt6459, super.anInt6499, Static9.aClass194_1, super.anInt6477);
			if (local381 != null) {
				if (super.anInt6472 != 0) {
					local381.ja(0, -super.anInt6472 << 0, 0);
				}
				if (super.anInt6478 != 0) {
					local381.k(super.anInt6478 * 2048);
				}
				if (local333) {
					if (super.anInt6519 != 0) {
						local381.WA(super.anInt6519);
					}
					if (super.anInt6482 != 0) {
						local381.o(super.anInt6482);
					}
					if (super.anInt6490 != 0) {
						local381.ja(0, super.anInt6490, 0);
					}
				}
			}
		}
		super.aClass32Array3[2] = null;
		if (!this.aBoolean509 && super.aClass2_Sub24_3 != null) {
			if (super.aClass2_Sub24_3.anInt3898 <= Static164.anInt3206) {
				super.aClass2_Sub24_3 = null;
			} else if (super.aClass2_Sub24_3.anInt3890 <= Static164.anInt3206) {
				@Pc(620) Class32 local620 = super.aClass2_Sub24_3.method3138(arg1, local7 | 0x7);
				if (local620 != null) {
					local620.ja(-super.anInt7117 + super.aClass2_Sub24_3.anInt3886, -super.anInt7109 + super.aClass2_Sub24_3.anInt3892, -super.anInt7111 + super.aClass2_Sub24_3.anInt3891);
					if (local169 != 0) {
						local620.k(-local169 & 0x3FFF);
					}
					super.aClass32Array3[2] = local620;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
	@Override
	public int method5118() {
		return this.aClass7_1 == null || this.aClass7_1.anInt235 == -1 ? super.method5118() : Static417.aClass234_2.method5362(this.aClass7_1.anInt235).anInt5998;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method4607() {
		return this.aString48;
	}
}
