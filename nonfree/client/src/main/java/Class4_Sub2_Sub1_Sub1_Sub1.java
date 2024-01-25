import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class4_Sub2_Sub1_Sub1_Sub1 extends Class4_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!bfa", name = "md", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!bfa", name = "vd", descriptor = "I")
	public int anInt904;

	@OriginalMember(owner = "client!bfa", name = "Bd", descriptor = "I")
	public int anInt909;

	@OriginalMember(owner = "client!bfa", name = "Md", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!bfa", name = "Nd", descriptor = "Lclient!nk;")
	public Class248 aClass248_1;

	@OriginalMember(owner = "client!bfa", name = "Vd", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!bfa", name = "qd", descriptor = "I")
	public int anInt899 = -1;

	@OriginalMember(owner = "client!bfa", name = "td", descriptor = "I")
	public int anInt902 = -1;

	@OriginalMember(owner = "client!bfa", name = "wd", descriptor = "I")
	public int anInt905 = 0;

	@OriginalMember(owner = "client!bfa", name = "rd", descriptor = "I")
	public int anInt900 = 0;

	@OriginalMember(owner = "client!bfa", name = "ud", descriptor = "I")
	public int anInt903 = 0;

	@OriginalMember(owner = "client!bfa", name = "sd", descriptor = "I")
	public int anInt901 = -1;

	@OriginalMember(owner = "client!bfa", name = "fd", descriptor = "I")
	public int anInt889 = 0;

	@OriginalMember(owner = "client!bfa", name = "ld", descriptor = "I")
	public int anInt894 = -1;

	@OriginalMember(owner = "client!bfa", name = "Gd", descriptor = "I")
	public int anInt913 = -1;

	@OriginalMember(owner = "client!bfa", name = "Rd", descriptor = "B")
	private byte aByte28 = 0;

	@OriginalMember(owner = "client!bfa", name = "Od", descriptor = "I")
	public int anInt917 = -1;

	@OriginalMember(owner = "client!bfa", name = "gd", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!bfa", name = "Sd", descriptor = "Z")
	public boolean aBoolean49 = false;

	@OriginalMember(owner = "client!bfa", name = "xd", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!bfa", name = "Ud", descriptor = "B")
	private byte aByte29 = 0;

	@OriginalMember(owner = "client!bfa", name = "Td", descriptor = "I")
	public int anInt920 = -1;

	@OriginalMember(owner = "client!bfa", name = "Cd", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!bfa", name = "Id", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!bfa", name = "Zd", descriptor = "B")
	private byte aByte30 = 0;

	@OriginalMember(owner = "client!bfa", name = "ae", descriptor = "I")
	public int anInt924 = -1;

	@OriginalMember(owner = "client!bfa", name = "Qd", descriptor = "I")
	public int anInt919 = 255;

	@OriginalMember(owner = "client!bfa", name = "ce", descriptor = "I")
	public int anInt926 = 0;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIB)V")
	public void method737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt1277 != -1 && Static435.aClass298_1.method7034(super.anInt1277).anInt10011 == 1) {
			super.anInt1277 = -1;
			super.anIntArray85 = null;
		}
		@Pc(33) Class82 local33;
		if (super.anInt1197 != -1) {
			local33 = Static52.aClass10_1.method211(super.anInt1197);
			if (local33.aBoolean157 && local33.anInt2052 != -1 && Static435.aClass298_1.method7034(local33.anInt2052).anInt10011 == 1) {
				super.anInt1197 = -1;
			}
		}
		if (super.anInt1276 != -1) {
			local33 = Static52.aClass10_1.method211(super.anInt1276);
			if (local33.aBoolean157 && local33.anInt2052 != -1 && Static435.aClass298_1.method7034(local33.anInt2052).anInt10011 == 1) {
				super.anInt1276 = -1;
			}
		}
		this.anInt917 = -1;
		if (arg1 < 0 || arg1 >= Static326.anInt5541 || arg0 < 0 || arg0 >= Static448.anInt7637) {
			this.method742(arg1, arg0);
		} else if (super.anIntArray94[0] >= 0 && Static326.anInt5541 > super.anIntArray94[0] && super.anIntArray95[0] >= 0 && super.anIntArray95[0] < Static448.anInt7637) {
			if (arg2 == 2) {
				Static33.method521(arg0, arg1, this);
			}
			this.method741(arg2, arg1, arg0);
		} else {
			this.method742(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)I")
	@Override
	public int method1019() {
		return -1;
	}

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "(I)Z")
	public boolean method738() {
		return this.aClass248_1 != null;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)I")
	@Override
	public int method1018() {
		return this.aClass248_1 == null || this.aClass248_1.anInt6248 == -1 ? super.method1018() : Static439.aClass92_2.method1914(this.aClass248_1.anInt6248).anInt5618;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!tc;ILclient!ha;BILclient!ka;II)V")
	private void method740(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class187 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg5 * arg5 + arg1 * arg1;
		if (local11 < 262144 || local11 > arg6) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg1, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(49) Class187 local49 = Static546.method7978(arg3, super.anInt1239, local37, super.anInt1195, arg2, super.anInt1250);
		if (local49 != null) {
			arg2.C(false);
			local49.method8645(arg0, null, 0);
			arg2.C(true);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
		if (this.aClass248_1 == null || !super.aBoolean74 && !this.method747(0, arg0)) {
			return;
		}
		@Pc(26) Class113 local26 = arg0.method7262();
		local26.method8459(super.aClass107_7.method2219());
		local26.method8454(super.anInt10231, super.anInt10228 - 5, super.anInt10229);
		this.method1026(super.aClass187Array3, arg0, super.aBoolean74, local26);
		super.aClass187Array3[0] = super.aClass187Array3[1] = super.aClass187Array3[2] = null;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BIII)V")
	public void method741(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt1280 < 9) {
			super.anInt1280++;
		}
		for (@Pc(24) int local24 = super.anInt1280; local24 > 0; local24--) {
			super.anIntArray94[local24] = super.anIntArray94[local24 - 1];
			super.anIntArray95[local24] = super.anIntArray95[local24 - 1];
			super.aByteArray17[local24] = super.aByteArray17[local24 - 1];
		}
		super.anIntArray94[0] = arg1;
		super.aByteArray17[0] = arg0;
		super.anIntArray95[0] = arg2;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(III)V")
	public void method742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt1280 = 0;
		super.anIntArray94[0] = arg0;
		super.anInt1281 = 0;
		super.anInt1279 = 0;
		super.anIntArray95[0] = arg1;
		@Pc(34) int local34 = this.method1018();
		super.anInt10231 = local34 * 256 + super.anIntArray94[0] * 512;
		super.anInt10229 = super.anIntArray95[0] * 512 + local34 * 256;
		if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == this) {
			Static507.method7588();
		}
		if (super.aClass4_Sub4_3 != null) {
			super.aClass4_Sub4_3.method1953();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method743() {
		@Pc(7) String local7 = "";
		if (Static604.aStringArray78 != null) {
			local7 = local7 + Static604.aStringArray78[this.aByte28];
		}
		@Pc(29) int[] local29;
		if (this.aByte30 == 1 && Static112.anIntArray128 != null) {
			local29 = Static112.anIntArray128;
		} else {
			local29 = Static177.anIntArray174;
		}
		if (local29 != null && local29[this.aByte28] != -1) {
			@Pc(50) Class318 local50 = Static577.aClass105_1.method2218(local29[this.aByte28]);
			if (local50.aChar4 == 's') {
				local7 = local7 + local50.method7634(this.aByte29 & 0xFF);
			} else {
				Static524.method7740(new Throwable(), "gdn1");
				local29[this.aByte28] = -1;
			}
		}
		local7 = local7 + this.aString16;
		if (Static336.aStringArray38 != null) {
			local7 = local7 + Static336.aStringArray38[this.aByte28];
		}
		return local7;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Lclient!ofa;I)V")
	public void method744(@OriginalArg(0) Class5_Sub22 arg0) {
		arg0.anInt6629 = 0;
		@Pc(14) int local14 = arg0.method5966();
		this.aByte30 = (byte) (local14 & 0x1);
		@Pc(23) boolean local23 = this.aBoolean45;
		this.aBoolean45 = (local14 & 0x2) != 0;
		@Pc(43) boolean local43 = (local14 & 0x4) != 0;
		@Pc(49) int local49 = super.method1018();
		this.method1030((local14 >> 3 & 0x7) + 1);
		this.aByte28 = (byte) (local14 >> 6 & 0x3);
		super.anInt10231 += this.method1018() - local49 << 8;
		super.anInt10229 += this.method1018() - local49 << 8;
		this.aByte29 = arg0.method5963();
		this.anInt913 = arg0.method5963();
		this.anInt894 = arg0.method5963();
		this.aBoolean49 = arg0.method5963() == 1;
		if (Static211.aClass15_2 == Static517.aClass15_8 && Static210.anInt4035 >= 2) {
			this.aBoolean49 = false;
		}
		this.anInt889 = 0;
		@Pc(140) int local140 = -1;
		@Pc(143) int[] local143 = new int[12];
		@Pc(163) int local163;
		@Pc(170) int local170;
		@Pc(216) int local216;
		for (@Pc(145) int local145 = 0; local145 < 12; local145++) {
			@Pc(151) int local151 = arg0.method5966();
			if (local151 == 0) {
				local143[local145] = 0;
			} else {
				local163 = arg0.method5966();
				local170 = (local151 << 8) + local163;
				if (local145 == 0 && local170 == 65535) {
					local140 = arg0.method5968();
					this.anInt889 = arg0.method5966();
					break;
				}
				if (local170 >= 32768) {
					local170 = Static123.anIntArray225[local170 - 32768];
					local143[local145] = local170 | 0x40000000;
					local216 = Static643.aClass275_2.method6641(local170).anInt6573;
					if (local216 != 0) {
						this.anInt889 = local216;
					}
				} else {
					local143[local145] = Integer.MIN_VALUE | local170 - 256;
				}
			}
		}
		@Pc(240) int[] local240 = new int[5];
		for (local163 = 0; local163 < 5; local163++) {
			local170 = arg0.method5966();
			if (Static597.aShortArrayArrayArray9.length < 1 || local170 < 0 || Static597.aShortArrayArrayArray9[0][local163].length <= local170) {
				local170 = 0;
			}
			local240[local163] = local170;
		}
		this.anInt895 = arg0.method5968();
		this.aString16 = arg0.method5937();
		this.aString17 = this.aString16;
		if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == this) {
			Static170.aString37 = this.aString16;
		}
		this.anInt905 = arg0.method5966();
		if (local43) {
			this.anInt903 = arg0.method5968();
			this.anInt924 = -1;
			this.anInt900 = this.anInt905;
			if (this.anInt903 == 65535) {
				this.anInt903 = -1;
			}
		} else {
			this.anInt903 = 0;
			this.anInt900 = arg0.method5966();
			this.anInt924 = arg0.method5966();
			if (this.anInt924 == 255) {
				this.anInt924 = -1;
			}
		}
		local170 = this.anInt926;
		this.anInt926 = arg0.method5966();
		@Pc(385) int local385;
		if (this.anInt926 == 0) {
			Static295.method4599(this);
		} else {
			local216 = this.anInt901;
			@Pc(382) int local382 = this.anInt899;
			local385 = this.anInt902;
			@Pc(388) int local388 = this.anInt920;
			@Pc(391) int local391 = this.anInt919;
			this.anInt901 = arg0.method5968();
			this.anInt899 = arg0.method5968();
			this.anInt902 = arg0.method5968();
			this.anInt920 = arg0.method5968();
			this.anInt919 = arg0.method5966();
			if (this.aBoolean45 != local23 || this.anInt926 != local170 || local216 != this.anInt901 || this.anInt899 != local382 || local385 != this.anInt902 || local388 != this.anInt920 || local391 != this.anInt919) {
				Static42.method752(this);
			}
		}
		if (this.aClass248_1 == null) {
			this.aClass248_1 = new Class248();
		}
		local216 = this.aClass248_1.anInt6248;
		@Pc(483) int[] local483 = this.aClass248_1.anIntArray344;
		this.aClass248_1.method5535(this.method1034(), local240, local140, local143, this.aByte30 == 1);
		if (local140 != local216) {
			super.anInt10231 = (super.anIntArray94[0] << 9) + (this.method1018() << 8);
			super.anInt10229 = (super.anIntArray95[0] << 9) + (this.method1018() << 8);
		}
		if (super.anInt1225 == Static337.anInt5722 && local483 != null) {
			for (local385 = 0; local385 < local240.length; local385++) {
				if (local483[local385] != local240[local385]) {
					Static643.aClass275_2.method6639();
					break;
				}
			}
		}
		if (super.aClass4_Sub4_3 != null) {
			super.aClass4_Sub4_3.method1953();
		}
		if (super.anInt1264 == -1 || !super.aBoolean70) {
			return;
		}
		@Pc(589) Class269 local589 = this.method1025();
		if (!local589.method6404(super.anInt1264)) {
			super.anInt1264 = -1;
			super.aBoolean70 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		if (this.aClass248_1 == null || !this.method747(131072, arg2)) {
			return false;
		}
		@Pc(27) Class113 local27 = arg2.method7262();
		@Pc(32) int local32 = super.aClass107_7.method2219();
		local27.method8459(local32);
		local27.method8454(super.anInt10231, super.anInt10228, super.anInt10229);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; super.aClass187Array3.length > local47; local47++) {
			if (super.aClass187Array3[local47] != null && (Static57.aBoolean65 ? super.aClass187Array3[local47].method8641(arg0, arg1, local27, true, 0, Static469.anInt7885) : super.aClass187Array3[local47].method8642(arg0, arg1, local27, true, 0))) {
				local45 = true;
				break;
			}
		}
		super.aClass187Array3[0] = super.aClass187Array3[1] = super.aClass187Array3[2] = null;
		return local45;
	}

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "(I)I")
	@Override
	protected int method1034() {
		return this.anInt895;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		if (this.aClass248_1 == null || !this.method747(2048, arg0)) {
			return null;
		}
		@Pc(19) Class113 local19 = arg0.method7262();
		@Pc(24) int local24 = super.aClass107_7.method2219();
		local19.method8459(local24);
		@Pc(42) Class217 local42 = Static421.aClass217ArrayArrayArray5[super.aByte132][super.anInt10231 >> Static115.anInt2156][super.anInt10229 >> Static115.anInt2156];
		if (local42 == null || local42.aClass4_Sub2_Sub2_1 == null) {
			super.anInt1198 = (int) ((float) super.anInt1198 - (float) super.anInt1198 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt1198 - local42.aClass4_Sub2_Sub2_1.aShort64;
			super.anInt1198 = (int) ((float) super.anInt1198 - (float) local69 / 10.0F);
		}
		local19.method8454(super.anInt10231, -super.anInt1198 + super.anInt10228 - 20, super.anInt10229);
		super.aBoolean73 = false;
		@Pc(99) Class4_Sub6 local99 = null;
		if (Static97.aClass5_Sub25_8.aClass6_Sub26_1.method7930() == 1) {
			@Pc(109) Class269 local109 = this.method1025();
			if (local109.aBoolean518 && (this.aClass248_1.anInt6248 == -1 || Static439.aClass92_2.method1914(this.aClass248_1.anInt6248).aBoolean408)) {
				@Pc(141) Class362 local141 = super.anInt1277 != -1 && super.anInt1271 == 0 ? Static435.aClass298_1.method7034(super.anInt1277) : null;
				@Pc(161) Class362 local161 = super.anInt1264 == -1 || this.aBoolean47 || super.aBoolean70 && local141 != null ? null : Static435.aClass298_1.method7034(super.anInt1264);
				@Pc(193) Class187 local193 = Static609.method8685(super.anInt1239, super.anInt1250, local24, local161 == null ? local141 : local161, 160, local161 == null ? super.anInt1223 : super.anInt1208, super.aClass187Array3[0], 1, arg0, 0, super.anInt1195, 240, 0);
				if (local193 != null) {
					local99 = Static242.method4012(super.aClass187Array3.length + 1, true);
					super.aBoolean73 = true;
					arg0.C(false);
					if (Static57.aBoolean65) {
						local193.method8654(local19, local99.aClass4_Sub9Array1[super.aClass187Array3.length], Static469.anInt7885, 0);
					} else {
						local193.method8645(local19, local99.aClass4_Sub9Array1[super.aClass187Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(254) int local254;
		if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == this) {
			local19.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			for (local254 = Static82.aClass154Array1.length - 1; local254 >= 0; local254--) {
				@Pc(260) Class154 local260 = Static82.aClass154Array1[local254];
				if (local260 != null && local260.anInt4137 != -1) {
					@Pc(293) int local293;
					if (local260.anInt4132 == 1) {
						@Pc(281) Class5_Sub3 local281 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local260.anInt4129);
						if (local281 != null) {
							@Pc(286) Class4_Sub2_Sub1_Sub1_Sub2 local286 = local281.aClass4_Sub2_Sub1_Sub1_Sub2_1;
							local293 = local286.anInt10231 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231;
							@Pc(300) int local300 = local286.anInt10229 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229;
							if (Static57.aBoolean65) {
								this.method749(local260.anInt4137, 92160000, local300, local293, local19, super.aClass187Array3[0], Static469.anInt7885, arg0);
							} else {
								this.method740(local19, local293, arg0, local260.anInt4137, super.aClass187Array3[0], local300, 92160000);
							}
						}
					}
					@Pc(356) int local356;
					if (local260.anInt4132 == 2) {
						@Pc(347) int local347 = local260.anInt4139 + 256 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231;
						local356 = local260.anInt4135 + 256 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229;
						local293 = local260.anInt4138 << 9;
						local293 *= local293;
						if (Static57.aBoolean65) {
							this.method749(local260.anInt4137, local293, local356, local347, local19, super.aClass187Array3[0], Static469.anInt7885, arg0);
						} else {
							this.method740(local19, local347, arg0, local260.anInt4137, super.aClass187Array3[0], local356, local293);
						}
					}
					if (local260.anInt4132 == 10 && local260.anInt4129 >= 0 && local260.anInt4129 < Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12.length) {
						@Pc(422) Class4_Sub2_Sub1_Sub1_Sub1 local422 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local260.anInt4129];
						if (local422 != null) {
							local356 = local422.anInt10231 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231;
							local293 = local422.anInt10229 - Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229;
							if (Static57.aBoolean65) {
								this.method749(local260.anInt4137, 92160000, local293, local356, local19, super.aClass187Array3[0], Static469.anInt7885, arg0);
							} else {
								this.method740(local19, local356, arg0, local260.anInt4137, super.aClass187Array3[0], local293, 92160000);
							}
						}
					}
				}
			}
			local19.method8459(local24);
			local19.method8454(super.anInt10231, super.anInt10228, super.anInt10229);
		}
		local19.method8459(local24);
		local19.method8454(super.anInt10231, super.anInt10228 - super.anInt1198 - 5, super.anInt10229);
		if (local99 == null) {
			local99 = Static242.method4012(super.aClass187Array3.length, true);
		}
		this.method1026(super.aClass187Array3, arg0, false, local19);
		if (Static57.aBoolean65) {
			for (local254 = 0; local254 < super.aClass187Array3.length; local254++) {
				if (super.aClass187Array3[local254] != null) {
					super.aClass187Array3[local254].method8654(local19, local99.aClass4_Sub9Array1[local254], Static469.anInt7885, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local254 = 0; super.aClass187Array3.length > local254; local254++) {
				if (super.aClass187Array3[local254] != null) {
					super.aClass187Array3[local254].method8645(local19, local99.aClass4_Sub9Array1[local254], Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass4_Sub4_3 != null) {
			@Pc(601) Class235 local601 = super.aClass4_Sub4_3.method1961();
			if (Static57.aBoolean65) {
				arg0.method7302(local601, Static469.anInt7885);
			} else {
				arg0.method7308(local601);
			}
		}
		for (local254 = 0; local254 < super.aClass187Array3.length; local254++) {
			if (super.aClass187Array3[local254] != null) {
				super.aBoolean73 |= super.aClass187Array3[local254].F();
			}
		}
		super.aClass187Array3[0] = super.aClass187Array3[1] = super.aClass187Array3[2] = null;
		super.anInt1227 = Static96.anInt1932;
		return local99;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method746() {
		return this.aString17;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method747(@OriginalArg(0) int arg0, @OriginalArg(2) Class133 arg1) {
		@Pc(12) int local12 = arg0;
		@Pc(16) Class269 local16 = this.method1025();
		@Pc(34) Class362 local34 = super.anInt1277 != -1 && super.anInt1271 == 0 ? Static435.aClass298_1.method7034(super.anInt1277) : null;
		@Pc(55) Class362 local55 = super.anInt1264 == -1 || this.aBoolean47 || super.aBoolean70 && local34 != null ? null : Static435.aClass298_1.method7034(super.anInt1264);
		@Pc(58) int local58 = local16.anInt7267;
		@Pc(61) int local61 = local16.anInt7272;
		if (local58 != 0 || local61 != 0 || local16.anInt7270 != 0 || local16.anInt7245 != 0) {
			arg0 |= 0x7;
		}
		@Pc(88) int local88 = super.aClass107_7.method2219();
		@Pc(111) boolean local111 = super.aByte41 != 0 && Static631.anInt10493 >= super.anInt1236 && Static631.anInt10493 < super.anInt1234;
		if (local111) {
			arg0 |= 0x80000;
		}
		@Pc(155) Class187 local155 = super.aClass187Array3[0] = this.aClass248_1.method5538(local55, arg1, Static387.aClass252_2, local88, Static301.aClass59_1, arg0, super.anInt1274, Static439.aClass92_2, super.anInt1211, super.aClass228Array3, super.anInt1226, Static435.aClass298_1, Static643.aClass275_2, super.anInt1208, super.anIntArray89, local34, super.anInt1201, super.anInt1223, Static147.aClass238_1);
		@Pc(160) int local160 = Static360.method5377();
		if (Static110.anInt2065 < 96 && local160 > 50) {
			Static209.method3593();
		}
		if (Static211.aClass15_2 != Static517.aClass15_8 && local160 < 50) {
			@Pc(184) int local184 = 50 - local160;
			while (local184 > Static550.anInt9295) {
				Static44.aByteArrayArray1[Static550.anInt9295] = new byte[102400];
				Static550.anInt9295++;
			}
			while (local184 < Static550.anInt9295) {
				Static550.anInt9295--;
				Static44.aByteArrayArray1[Static550.anInt9295] = null;
			}
		} else if (Static517.aClass15_8 != Static211.aClass15_2) {
			Static44.aByteArrayArray1 = new byte[50][];
			Static550.anInt9295 = 0;
		}
		if (local155 == null) {
			return false;
		}
		super.anInt1206 = local155.fa();
		super.anInt1257 = local155.ma();
		this.method1028(local155);
		if (local58 == 0 && local61 == 0) {
			this.method1029(0, this.method1018() << 9, this.method1018() << 9, local88, 0);
		} else {
			this.method1029(local16.anInt7281, local61, local58, local88, local16.anInt7286);
			if (super.anInt1195 != 0) {
				local155.FA(super.anInt1195);
			}
			if (super.anInt1250 != 0) {
				local155.VA(super.anInt1250);
			}
			if (super.anInt1239 != 0) {
				local155.H(0, super.anInt1239, 0);
			}
		}
		if (local111) {
			local155.method8646(super.aByte37, super.aByte39, super.aByte40, super.aByte41 & 0xFF);
		}
		@Pc(361) boolean local361;
		@Pc(363) int local363;
		@Pc(413) Class187 local413;
		@Pc(440) int local440;
		@Pc(442) int local442;
		@Pc(444) int local444;
		@Pc(531) int local531;
		@Pc(560) int local560;
		@Pc(572) int local572;
		@Pc(576) int local576;
		@Pc(586) int local586;
		@Pc(346) Class82 local346;
		if (this.aBoolean47 || super.anInt1197 == -1 || super.anInt1251 == -1) {
			super.aClass187Array3[1] = null;
		} else {
			local346 = Static52.aClass10_1.method211(super.anInt1197);
			local361 = local346.aByte50 == 3 && (local58 != 0 || local61 != 0);
			local363 = local12;
			if (local361) {
				local363 = local12 | 0x7;
			} else {
				if (super.anInt1233 != 0) {
					local363 = local12 | 0x5;
				}
				if (super.anInt1267 != 0) {
					local363 |= 0x2;
				}
				if (super.anInt1200 >= 0) {
					local363 |= 0x7;
				}
			}
			local413 = super.aClass187Array3[1] = local346.method1684(local363, arg1, super.anInt1202, super.anInt1251, Static435.aClass298_1, super.anInt1269);
			if (local413 != null) {
				if (super.anInt1200 >= 0 && local16.anIntArrayArray50 != null && local16.anIntArrayArray50[super.anInt1200] != null) {
					local440 = 0;
					local442 = 0;
					local444 = 0;
					if (local16.anIntArrayArray50 != null && local16.anIntArrayArray50[super.anInt1200] != null) {
						local444 = local16.anIntArrayArray50[super.anInt1200][2];
						local442 = local16.anIntArrayArray50[super.anInt1200][1];
						local440 = local16.anIntArrayArray50[super.anInt1200][0];
					}
					if (local16.anIntArrayArray51 != null && local16.anIntArrayArray51[super.anInt1200] != null) {
						local444 += local16.anIntArrayArray51[super.anInt1200][2];
						local442 += local16.anIntArrayArray51[super.anInt1200][1];
						local440 += local16.anIntArrayArray51[super.anInt1200][0];
					}
					if (local444 != 0 || local440 != 0) {
						local531 = local88;
						if (super.anIntArray89 != null && super.anIntArray89[super.anInt1200] != -1) {
							local531 = super.anIntArray89[super.anInt1200];
						}
						local560 = super.anInt1233 * 2048 + local531 - local88 & 0x3FFF;
						if (local560 != 0) {
							local413.a(local560);
						}
						local572 = Class377.anIntArray600[local560];
						local576 = Class377.anIntArray601[local560];
						local586 = local444 * local572 + local576 * local440 >> 14;
						local444 = local444 * local576 - local572 * local440 >> 14;
						local440 = local586;
					}
					local413.H(local440, local442, local444);
				} else if (super.anInt1233 != 0) {
					local413.a(super.anInt1233 * 2048);
				}
				if (super.anInt1267 != 0) {
					local413.H(0, -super.anInt1267 << 2, 0);
				}
				if (local361) {
					if (super.anInt1195 != 0) {
						local413.FA(super.anInt1195);
					}
					if (super.anInt1250 != 0) {
						local413.VA(super.anInt1250);
					}
					if (super.anInt1239 != 0) {
						local413.H(0, super.anInt1239, 0);
					}
				}
			}
		}
		if (this.aBoolean47 || super.anInt1276 == -1 || super.anInt1228 == -1) {
			super.aClass187Array3[2] = null;
		} else {
			local346 = Static52.aClass10_1.method211(super.anInt1276);
			local361 = local346.aByte50 == 3 && (local58 != 0 || local61 != 0);
			local363 = local12;
			if (local361) {
				local363 = local12 | 0x7;
			} else {
				if (super.anInt1262 != 0) {
					local363 = local12 | 0x5;
				}
				if (super.anInt1224 != 0) {
					local363 |= 0x2;
				}
				if (super.anInt1247 >= 0) {
					local363 |= 0x7;
				}
			}
			local413 = super.aClass187Array3[2] = local346.method1687(Static435.aClass298_1, super.anInt1222, super.anInt1259, arg1, super.anInt1228, local363);
			if (local413 != null) {
				if (super.anInt1247 >= 0 && local16.anIntArrayArray50 != null && local16.anIntArrayArray50[super.anInt1247] != null) {
					local440 = 0;
					local442 = 0;
					local444 = 0;
					if (local16.anIntArrayArray50 != null && local16.anIntArrayArray50[super.anInt1247] != null) {
						local440 = local16.anIntArrayArray50[super.anInt1247][0];
						local444 = local16.anIntArrayArray50[super.anInt1247][2];
						local442 = local16.anIntArrayArray50[super.anInt1247][1];
					}
					if (local16.anIntArrayArray51 != null && local16.anIntArrayArray51[super.anInt1247] != null) {
						local440 += local16.anIntArrayArray51[super.anInt1247][0];
						local442 += local16.anIntArrayArray51[super.anInt1247][1];
						local444 += local16.anIntArrayArray51[super.anInt1247][2];
					}
					if (local444 != 0 || local440 != 0) {
						local531 = local88;
						if (super.anIntArray89 != null && super.anIntArray89[super.anInt1247] != -1) {
							local531 = super.anIntArray89[super.anInt1247];
						}
						local560 = local531 + super.anInt1262 * 2048 - local88 & 0x3FFF;
						if (local560 != 0) {
							local413.a(local560);
						}
						local572 = Class377.anIntArray600[local560];
						local576 = Class377.anIntArray601[local560];
						local586 = local576 * local440 + local444 * local572 >> 14;
						local444 = local576 * local444 - local572 * local440 >> 14;
						local440 = local586;
					}
					local413.H(local440, local442, local444);
				} else if (super.anInt1262 != 0) {
					local413.a(super.anInt1262 * 2048);
				}
				if (super.anInt1224 != 0) {
					local413.H(0, -super.anInt1224 << 2, 0);
				}
				if (local361) {
					if (super.anInt1195 != 0) {
						local413.FA(super.anInt1195);
					}
					if (super.anInt1250 != 0) {
						local413.VA(super.anInt1250);
					}
					if (super.anInt1239 != 0) {
						local413.H(0, super.anInt1239, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIILclient!tc;Lclient!ka;ILclient!ha;I)V")
	private void method749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class113 arg4, @OriginalArg(5) Class187 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class133 arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg3 * arg3;
		if (local11 < 262144 || local11 > arg1) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class187 local45 = Static546.method7978(arg0, super.anInt1239, local33, super.anInt1195, arg7, super.anInt1250);
		if (local45 != null) {
			arg7.C(false);
			local45.method8654(arg4, null, arg6, 0);
			arg7.C(true);
		}
	}
}
