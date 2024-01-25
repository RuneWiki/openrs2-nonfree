import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class15_Sub1_Sub2_Sub2_Sub1 extends Class15_Sub1_Sub2_Sub2 {

	@OriginalMember(owner = "client!efa", name = "kd", descriptor = "I")
	public int anInt3279;

	@OriginalMember(owner = "client!efa", name = "rd", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!efa", name = "vd", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!efa", name = "Zd", descriptor = "I")
	private int anInt3312;

	@OriginalMember(owner = "client!efa", name = "de", descriptor = "I")
	public int anInt3314;

	@OriginalMember(owner = "client!efa", name = "je", descriptor = "Lclient!uba;")
	public Class337 aClass337_1;

	@OriginalMember(owner = "client!efa", name = "Bd", descriptor = "I")
	public int anInt3293 = 0;

	@OriginalMember(owner = "client!efa", name = "Pd", descriptor = "I")
	public int anInt3304 = -1;

	@OriginalMember(owner = "client!efa", name = "Nd", descriptor = "B")
	private byte aByte41 = 0;

	@OriginalMember(owner = "client!efa", name = "Dd", descriptor = "I")
	public int anInt3295 = -1;

	@OriginalMember(owner = "client!efa", name = "Td", descriptor = "I")
	public int anInt3307 = 0;

	@OriginalMember(owner = "client!efa", name = "Fd", descriptor = "I")
	public int anInt3297 = -1;

	@OriginalMember(owner = "client!efa", name = "Id", descriptor = "I")
	public int anInt3300 = 0;

	@OriginalMember(owner = "client!efa", name = "zd", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!efa", name = "Rd", descriptor = "I")
	public int anInt3306 = -1;

	@OriginalMember(owner = "client!efa", name = "Ud", descriptor = "B")
	private byte aByte42 = 0;

	@OriginalMember(owner = "client!efa", name = "Md", descriptor = "Z")
	public boolean aBoolean250 = false;

	@OriginalMember(owner = "client!efa", name = "Xd", descriptor = "I")
	public int anInt3310 = 0;

	@OriginalMember(owner = "client!efa", name = "Sd", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!efa", name = "md", descriptor = "I")
	public int anInt3281 = -1;

	@OriginalMember(owner = "client!efa", name = "Kd", descriptor = "Z")
	public boolean aBoolean249 = false;

	@OriginalMember(owner = "client!efa", name = "ee", descriptor = "I")
	public int anInt3315 = -1;

	@OriginalMember(owner = "client!efa", name = "Wd", descriptor = "I")
	public int anInt3309 = 0;

	@OriginalMember(owner = "client!efa", name = "fe", descriptor = "I")
	public int anInt3316 = -1;

	@OriginalMember(owner = "client!efa", name = "Jd", descriptor = "I")
	public int anInt3301 = -1;

	@OriginalMember(owner = "client!efa", name = "ae", descriptor = "B")
	private byte aByte43 = 0;

	@OriginalMember(owner = "client!efa", name = "qd", descriptor = "I")
	public int anInt3285 = 255;

	@OriginalMember(owner = "client!efa", name = "be", descriptor = "Z")
	public boolean aBoolean252 = false;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIB)V")
	public void method2758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt8137 < 9) {
			super.anInt8137++;
		}
		for (@Pc(29) int local29 = super.anInt8137; local29 > 0; local29--) {
			super.anIntArray435[local29] = super.anIntArray435[local29 - 1];
			super.anIntArray436[local29] = super.anIntArray436[local29 - 1];
			super.aByteArray69[local29] = super.aByteArray69[local29 - 1];
		}
		super.anIntArray435[0] = arg0;
		super.anIntArray436[0] = arg1;
		super.aByteArray69[0] = arg2;
	}

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "(I)I")
	@Override
	public int method6692() {
		return this.aClass337_1 == null || this.aClass337_1.anInt9703 == -1 ? super.method6692() : Static297.aClass338_1.method7851(this.aClass337_1.anInt9703).anInt8912;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2759() {
		@Pc(7) String local7 = "";
		if (Static600.aStringArray39 != null) {
			local7 = local7 + Static600.aStringArray39[this.aByte41];
		}
		@Pc(29) int[] local29;
		if (this.aByte43 == 1 && Static633.anIntArray593 != null) {
			local29 = Static633.anIntArray593;
		} else {
			local29 = Static262.anIntArray326;
		}
		if (local29 != null && local29[this.aByte41] != -1) {
			@Pc(49) Class315 local49 = Static592.aClass95_1.method2955(local29[this.aByte41]);
			if (local49.aChar4 == 's') {
				local7 = local7 + local49.method7453(this.aByte42 & 0xFF);
			} else {
				Static596.method8231("gdn1", new Throwable());
				local29[this.aByte41] = -1;
			}
		}
		local7 = local7 + this.aString36;
		if (Static434.aStringArray22 != null) {
			local7 = local7 + Static434.aStringArray22[this.aByte41];
		}
		return local7;
	}

	@OriginalMember(owner = "client!efa", name = "k", descriptor = "(I)I")
	@Override
	public int method6685() {
		return -1;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
		if (this.aClass337_1 == null || !super.aBoolean587 && !this.method2768(arg0, 0)) {
			return;
		}
		@Pc(28) Class54 local28 = arg0.method6124();
		local28.method5144(super.aClass371_7.method8432());
		local28.method5142(super.anInt10301, super.anInt10297 - 5, super.anInt10298);
		this.method6697(local28, arg0, super.aBoolean587, super.aClass83Array3);
		super.aClass83Array3[0] = super.aClass83Array3[1] = super.aClass83Array3[2] = null;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(III)V")
	public void method2761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt8138 = 0;
		super.anInt8137 = 0;
		super.anIntArray435[0] = arg0;
		super.anInt8140 = 0;
		super.anIntArray436[0] = arg1;
		@Pc(26) int local26 = this.method6692();
		super.anInt10298 = local26 * 256 + super.anIntArray436[0] * 512;
		super.anInt10301 = super.anIntArray435[0] * 512 + local26 * 256;
		if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == this) {
			Static364.method5679();
		}
		if (super.aClass15_Sub8_6 != null) {
			super.aClass15_Sub8_6.method6543();
		}
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method2762() {
		return this.aString35;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!ig;B)V")
	public void method2763(@OriginalArg(0) Class8_Sub8 arg0) {
		arg0.anInt10588 = 0;
		@Pc(12) int local12 = arg0.method8525();
		this.aByte43 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean250;
		this.aBoolean250 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(51) int local51 = super.method6692();
		this.method6691((local12 >> 3 & 0x7) + 1);
		this.aByte41 = (byte) (local12 >> 6 & 0x3);
		super.anInt10301 += this.method6692() - local51 << 8;
		super.anInt10298 += this.method6692() - local51 << 8;
		this.aByte42 = arg0.method8550();
		this.anInt3306 = arg0.method8550();
		this.anInt3304 = arg0.method8550();
		this.aBoolean251 = arg0.method8550() == 1;
		if (Static277.aClass313_9 == Static101.aClass313_5 && Static190.anInt7431 >= 2) {
			this.aBoolean251 = false;
		}
		this.anInt3293 = 0;
		@Pc(138) int local138 = -1;
		@Pc(141) int[] local141 = new int[12];
		@Pc(161) int local161;
		@Pc(168) int local168;
		@Pc(212) int local212;
		for (@Pc(143) int local143 = 0; local143 < 12; local143++) {
			@Pc(149) int local149 = arg0.method8525();
			if (local149 == 0) {
				local141[local143] = 0;
			} else {
				local161 = arg0.method8525();
				local168 = (local149 << 8) + local161;
				if (local143 == 0 && local168 == 65535) {
					local138 = arg0.method8578();
					this.anInt3293 = arg0.method8525();
					break;
				}
				if (local168 >= 32768) {
					local168 = Static432.anIntArray438[local168 - 32768];
					local141[local143] = local168 | 0x40000000;
					local212 = Static497.aClass258_21.method6652(local168).anInt8577;
					if (local212 != 0) {
						this.anInt3293 = local212;
					}
				} else {
					local141[local143] = local168 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(239) int[] local239 = new int[5];
		for (local161 = 0; local161 < 5; local161++) {
			local168 = arg0.method8525();
			if (Static450.aShortArrayArrayArray2.length < 1 || local168 < 0 || Static450.aShortArrayArrayArray2[0][local161].length <= local168) {
				local168 = 0;
			}
			local239[local161] = local168;
		}
		this.anInt3312 = arg0.method8578();
		this.aString36 = arg0.method8570();
		this.aString35 = this.aString36;
		if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == this) {
			Static634.aString96 = this.aString36;
		}
		this.anInt3300 = arg0.method8525();
		if (local41) {
			this.anInt3309 = arg0.method8578();
			this.anInt3281 = -1;
			this.anInt3310 = this.anInt3300;
			if (this.anInt3309 == 65535) {
				this.anInt3309 = -1;
			}
		} else {
			this.anInt3309 = 0;
			this.anInt3310 = arg0.method8525();
			this.anInt3281 = arg0.method8525();
			if (this.anInt3281 == 255) {
				this.anInt3281 = -1;
			}
		}
		local168 = this.anInt3307;
		this.anInt3307 = arg0.method8525();
		@Pc(365) int local365;
		if (this.anInt3307 == 0) {
			Static203.method3759(this);
		} else {
			local212 = this.anInt3315;
			@Pc(362) int local362 = this.anInt3301;
			local365 = this.anInt3295;
			@Pc(368) int local368 = this.anInt3297;
			@Pc(371) int local371 = this.anInt3285;
			this.anInt3315 = arg0.method8578();
			this.anInt3301 = arg0.method8578();
			this.anInt3295 = arg0.method8578();
			this.anInt3297 = arg0.method8578();
			this.anInt3285 = arg0.method8525();
			if (local21 != this.aBoolean250 || this.anInt3307 != local168 || local212 != this.anInt3315 || local362 != this.anInt3301 || this.anInt3295 != local365 || this.anInt3297 != local368 || this.anInt3285 != local371) {
				Static502.method5505(this);
			}
		}
		if (this.aClass337_1 == null) {
			this.aClass337_1 = new Class337();
		}
		local212 = this.aClass337_1.anInt9703;
		@Pc(460) int[] local460 = this.aClass337_1.anIntArray538;
		this.aClass337_1.method7845(local141, local239, this.aByte43 == 1, this.method6688(), local138);
		if (local212 != local138) {
			super.anInt10301 = (super.anIntArray435[0] << 9) + (this.method6692() << 8);
			super.anInt10298 = (super.anIntArray436[0] << 9) + (this.method6692() << 8);
		}
		if (Static616.anInt10362 == super.anInt8075 && local460 != null) {
			for (local365 = 0; local365 < local239.length; local365++) {
				if (local460[local365] != local239[local365]) {
					Static497.aClass258_21.method6649();
					break;
				}
			}
		}
		if (super.aClass15_Sub8_6 != null) {
			super.aClass15_Sub8_6.method6543();
		}
		if (super.anInt8107 == -1 || !super.aBoolean585) {
			return;
		}
		@Pc(557) Class102 local557 = this.method6686();
		if (!local557.method3051(super.anInt8107)) {
			super.aBoolean585 = false;
			super.anInt8107 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!efa", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return false;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIILclient!dfa;Lclient!ka;IBLclient!ha;I)V")
	private void method2764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class54 arg3, @OriginalArg(4) Class83 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg5 * arg5;
		if (local11 < 262144 || arg1 < local11) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg5, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(43) Class83 local43 = Static178.method3433(arg6, super.anInt8102, super.anInt8096, super.anInt8082, local31, arg7);
		if (local43 != null) {
			arg6.C(false);
			local43.method8009(arg3, null, arg0, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIILclient!ka;BILclient!dfa;Lclient!ha;)V")
	private void method2765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class54 arg5, @OriginalArg(7) Class16 arg6) {
		@Pc(11) int local11 = arg1 * arg1 + arg2 * arg2;
		if (local11 < 262144 || local11 > arg4) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg2, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(43) Class83 local43 = Static178.method3433(arg6, super.anInt8102, super.anInt8096, super.anInt8082, local31, arg0);
		if (local43 != null) {
			arg6.C(false);
			local43.method8003(arg5, null, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		if (this.aClass337_1 == null || !this.method2768(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class54 local19 = arg0.method6124();
		@Pc(26) int local26 = super.aClass371_7.method8432();
		local19.method5144(local26);
		@Pc(44) Class56 local44 = Static405.aClass56ArrayArrayArray2[super.aByte124][super.anInt10301 >> Static172.anInt4156][super.anInt10298 >> Static172.anInt4156];
		if (local44 == null || local44.aClass15_Sub1_Sub3_1 == null) {
			super.anInt8068 = (int) ((float) super.anInt8068 - (float) super.anInt8068 / 10.0F);
		} else {
			@Pc(57) int local57 = super.anInt8068 - local44.aClass15_Sub1_Sub3_1.aShort107;
			super.anInt8068 = (int) ((float) super.anInt8068 - (float) local57 / 10.0F);
		}
		local19.method5142(super.anInt10301, super.anInt10297 - super.anInt8068 - 20, super.anInt10298);
		super.aBoolean586 = false;
		@Pc(101) Class15_Sub7 local101 = null;
		if (Static155.aClass8_Sub25_6.aClass36_Sub4_1.method3042() == 1) {
			@Pc(115) Class102 local115 = this.method6686();
			if (local115.aBoolean276 && (this.aClass337_1.anInt9703 == -1 || Static297.aClass338_1.method7851(this.aClass337_1.anInt9703).aBoolean629)) {
				@Pc(152) Class97 local152 = super.anInt8105 != -1 && super.anInt8094 == 0 ? Static28.aClass220_1.method5670(super.anInt8105) : null;
				@Pc(175) Class97 local175 = super.anInt8107 == -1 || this.aBoolean252 || super.aBoolean585 && local152 != null ? null : Static28.aClass220_1.method5670(super.anInt8107);
				@Pc(207) Class83 local207 = Static441.method6806(super.anInt8102, 0, 1, super.aClass83Array3[0], arg0, local175 == null ? super.anInt8063 : super.anInt8110, 240, super.anInt8082, local26, local175 == null ? local152 : local175, super.anInt8096, 160, 0);
				if (local207 != null) {
					local101 = Static342.method5465(true, super.aClass83Array3.length + 1);
					super.aBoolean586 = true;
					arg0.C(false);
					if (Static183.aBoolean308) {
						local207.method8009(local19, local101.aClass15_Sub6Array1[super.aClass83Array3.length], Static115.anInt3009, 0);
					} else {
						local207.method8003(local19, local101.aClass15_Sub6Array1[super.aClass83Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(268) int local268;
		if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == this) {
			local19.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			for (local268 = Static447.aClass319Array3.length - 1; local268 >= 0; local268--) {
				@Pc(274) Class319 local274 = Static447.aClass319Array3[local268];
				if (local274 != null && local274.anInt9114 != -1) {
					@Pc(306) int local306;
					if (local274.anInt9116 == 1) {
						@Pc(295) Class8_Sub50 local295 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local274.anInt9124);
						if (local295 != null) {
							@Pc(300) Class15_Sub1_Sub2_Sub2_Sub2 local300 = local295.aClass15_Sub1_Sub2_Sub2_Sub2_2;
							local306 = local300.anInt10301 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301;
							@Pc(312) int local312 = local300.anInt10298 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298;
							if (Static183.aBoolean308) {
								this.method2764(Static115.anInt3009, 92160000, local312, local19, super.aClass83Array3[0], local306, arg0, local274.anInt9114);
							} else {
								this.method2765(local274.anInt9114, local312, local306, super.aClass83Array3[0], 92160000, local19, arg0);
							}
						}
					}
					@Pc(367) int local367;
					if (local274.anInt9116 == 2) {
						@Pc(358) int local358 = local274.anInt9115 + 256 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301;
						local367 = local274.anInt9122 + 256 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298;
						local306 = local274.anInt9117 << 9;
						local306 *= local306;
						if (Static183.aBoolean308) {
							this.method2764(Static115.anInt3009, local306, local367, local19, super.aClass83Array3[0], local358, arg0, local274.anInt9114);
						} else {
							this.method2765(local274.anInt9114, local367, local358, super.aClass83Array3[0], local306, local19, arg0);
						}
					}
					if (local274.anInt9116 == 10 && local274.anInt9124 >= 0 && Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1.length > local274.anInt9124) {
						@Pc(431) Class15_Sub1_Sub2_Sub2_Sub1 local431 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local274.anInt9124];
						if (local431 != null) {
							local367 = local431.anInt10301 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301;
							local306 = local431.anInt10298 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298;
							if (Static183.aBoolean308) {
								this.method2764(Static115.anInt3009, 92160000, local306, local19, super.aClass83Array3[0], local367, arg0, local274.anInt9114);
							} else {
								this.method2765(local274.anInt9114, local306, local367, super.aClass83Array3[0], 92160000, local19, arg0);
							}
						}
					}
				}
			}
			local19.method5144(local26);
			local19.method5142(super.anInt10301, super.anInt10297, super.anInt10298);
		}
		local19.method5144(local26);
		local19.method5142(super.anInt10301, super.anInt10297 - super.anInt8068 - 5, super.anInt10298);
		if (local101 == null) {
			local101 = Static342.method5465(true, super.aClass83Array3.length);
		}
		this.method6697(local19, arg0, false, super.aClass83Array3);
		if (Static183.aBoolean308) {
			for (local268 = 0; local268 < super.aClass83Array3.length; local268++) {
				if (super.aClass83Array3[local268] != null) {
					super.aClass83Array3[local268].method8009(local19, local101.aClass15_Sub6Array1[local268], Static115.anInt3009, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local268 = 0; super.aClass83Array3.length > local268; local268++) {
				if (super.aClass83Array3[local268] != null) {
					super.aClass83Array3[local268].method8003(local19, local101.aClass15_Sub6Array1[local268], Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass15_Sub8_6 != null) {
			@Pc(608) Class250 local608 = super.aClass15_Sub8_6.method6540();
			if (Static183.aBoolean308) {
				arg0.method6108(local608, Static115.anInt3009);
			} else {
				arg0.method6100(local608);
			}
		}
		for (local268 = 0; super.aClass83Array3.length > local268; local268++) {
			if (super.aClass83Array3[local268] != null) {
				super.aBoolean586 |= super.aClass83Array3[local268].F();
			}
		}
		super.aClass83Array3[0] = super.aClass83Array3[1] = super.aClass83Array3[2] = null;
		super.anInt8051 = Static609.anInt9845;
		return local101;
	}

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "(I)I")
	@Override
	protected int method6688() {
		return this.anInt3312;
	}

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "(I)Z")
	public boolean method2766() {
		return this.aClass337_1 != null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		if (this.aClass337_1 == null || !this.method2768(arg2, 131072)) {
			return false;
		}
		@Pc(21) Class54 local21 = arg2.method6124();
		@Pc(26) int local26 = super.aClass371_7.method8432();
		local21.method5144(local26);
		local21.method5142(super.anInt10301, super.anInt10297, super.anInt10298);
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; super.aClass83Array3.length > local48; local48++) {
			if (super.aClass83Array3[local48] != null && (Static183.aBoolean308 ? super.aClass83Array3[local48].method7994(arg0, arg1, local21, true, 0, Static115.anInt3009) : super.aClass83Array3[local48].method8007(arg0, arg1, local21, true, 0))) {
				local46 = true;
				break;
			}
		}
		super.aClass83Array3[0] = super.aClass83Array3[1] = super.aClass83Array3[2] = null;
		return local46;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!ha;I)Z")
	private boolean method2768(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1;
		@Pc(16) Class102 local16 = this.method6686();
		@Pc(32) Class97 local32 = super.anInt8105 != -1 && super.anInt8094 == 0 ? Static28.aClass220_1.method5670(super.anInt8105) : null;
		@Pc(53) Class97 local53 = super.anInt8107 == -1 || this.aBoolean252 || super.aBoolean585 && local32 != null ? null : Static28.aClass220_1.method5670(super.anInt8107);
		@Pc(56) int local56 = local16.anInt3743;
		@Pc(59) int local59 = local16.anInt3723;
		if (local56 != 0 || local59 != 0 || local16.anInt3745 != 0 || local16.anInt3746 != 0) {
			arg1 |= 0x7;
		}
		@Pc(78) int local78 = super.aClass371_7.method8432();
		@Pc(97) boolean local97 = super.aByte86 != 0 && super.anInt8087 <= Static435.anInt8192 && super.anInt8062 > Static435.anInt8192;
		if (local97) {
			arg1 |= 0x80000;
		}
		@Pc(141) Class83 local141 = super.aClass83Array3[0] = this.aClass337_1.method7843(super.anInt8131, local32, Static314.aClass79_1, arg0, super.anInt8080, Static497.aClass258_21, Static420.aClass77_1, super.anInt8110, Static28.aClass220_1, Static297.aClass338_1, super.anInt8049, local53, arg1, Static472.aClass202_4, super.anInt8070, local78, super.aClass96Array3, super.anIntArray433, super.anInt8063);
		@Pc(144) int local144 = Static378.method5981();
		if (Static153.anInt3785 < 96 && local144 > 50) {
			Static634.method7629();
		}
		if (Static277.aClass313_9 != Static101.aClass313_5 && local144 < 50) {
			@Pc(166) int local166 = 50 - local144;
			while (Static579.anInt9974 < local166) {
				Static331.aByteArrayArray176[Static579.anInt9974] = new byte[102400];
				Static579.anInt9974++;
			}
			while (Static579.anInt9974 > local166) {
				Static579.anInt9974--;
				Static331.aByteArrayArray176[Static579.anInt9974] = null;
			}
		} else if (Static277.aClass313_9 != Static101.aClass313_5) {
			Static331.aByteArrayArray176 = new byte[50][];
			Static579.anInt9974 = 0;
		}
		if (local141 == null) {
			return false;
		}
		super.anInt8115 = local141.fa();
		super.anInt8126 = local141.ma();
		this.method6687(local141);
		if (local56 == 0 && local59 == 0) {
			this.method6696(this.method6692() << 9, local78, 0, this.method6692() << 9, 0);
		} else {
			this.method6696(local56, local78, local16.anInt3730, local59, local16.anInt3733);
			if (super.anInt8102 != 0) {
				local141.FA(super.anInt8102);
			}
			if (super.anInt8082 != 0) {
				local141.VA(super.anInt8082);
			}
			if (super.anInt8096 != 0) {
				local141.H(0, super.anInt8096, 0);
			}
		}
		if (local97) {
			local141.method7992(super.aByte85, super.aByte83, super.aByte84, super.aByte86 & 0xFF);
		}
		@Pc(328) boolean local328;
		@Pc(330) int local330;
		@Pc(380) Class83 local380;
		@Pc(407) int local407;
		@Pc(409) int local409;
		@Pc(411) int local411;
		@Pc(498) int local498;
		@Pc(526) int local526;
		@Pc(535) int local535;
		@Pc(539) int local539;
		@Pc(549) int local549;
		@Pc(313) Class73 local313;
		if (this.aBoolean252 || super.anInt8058 == -1 || super.anInt8056 == -1) {
			super.aClass83Array3[1] = null;
		} else {
			local313 = Static202.aClass333_2.method7823(super.anInt8058);
			local328 = local313.aByte29 == 3 && (local56 != 0 || local59 != 0);
			local330 = local12;
			if (local328) {
				local330 = local12 | 0x7;
			} else {
				if (super.anInt8071 != 0) {
					local330 = local12 | 0x5;
				}
				if (super.anInt8072 != 0) {
					local330 |= 0x2;
				}
				if (super.anInt8091 != 0) {
					local330 |= 0x7;
				}
			}
			local380 = super.aClass83Array3[1] = local313.method2308(super.anInt8122, local330, arg0, Static28.aClass220_1, super.anInt8098, super.anInt8056);
			if (local380 != null) {
				if (super.anInt8091 >= 0 && local16.anIntArrayArray16 != null && local16.anIntArrayArray16[super.anInt8091] != null) {
					local407 = 0;
					local409 = 0;
					local411 = 0;
					if (local16.anIntArrayArray16 != null && local16.anIntArrayArray16[super.anInt8091] != null) {
						local407 = local16.anIntArrayArray16[super.anInt8091][0];
						local411 = local16.anIntArrayArray16[super.anInt8091][2];
						local409 = local16.anIntArrayArray16[super.anInt8091][1];
					}
					if (local16.anIntArrayArray17 != null && local16.anIntArrayArray17[super.anInt8091] != null) {
						local411 += local16.anIntArrayArray17[super.anInt8091][2];
						local407 += local16.anIntArrayArray17[super.anInt8091][0];
						local409 += local16.anIntArrayArray17[super.anInt8091][1];
					}
					if (local411 != 0 || local407 != 0) {
						local498 = local78;
						if (super.anIntArray433 != null && super.anIntArray433[super.anInt8091] != -1) {
							local498 = super.anIntArray433[super.anInt8091];
						}
						local526 = local498 + super.anInt8071 * 2048 - local78 & 0x3FFF;
						if (local526 != 0) {
							local380.a(local526);
						}
						local535 = Class344.anIntArray579[local526];
						local539 = Class344.anIntArray578[local526];
						local549 = local539 * local407 + local535 * local411 >> 14;
						local411 = local411 * local539 - local535 * local407 >> 14;
						local407 = local549;
					}
					local380.H(local407, local409, local411);
				} else if (super.anInt8071 != 0) {
					local380.a(super.anInt8071 * 2048);
				}
				if (super.anInt8072 != 0) {
					local380.H(0, -super.anInt8072 << 2, 0);
				}
				if (local328) {
					if (super.anInt8102 != 0) {
						local380.FA(super.anInt8102);
					}
					if (super.anInt8082 != 0) {
						local380.VA(super.anInt8082);
					}
					if (super.anInt8096 != 0) {
						local380.H(0, super.anInt8096, 0);
					}
				}
			}
		}
		if (this.aBoolean252 || super.anInt8074 == -1 || super.anInt8095 == -1) {
			super.aClass83Array3[2] = null;
		} else {
			local313 = Static202.aClass333_2.method7823(super.anInt8074);
			local328 = local313.aByte29 == 3 && (local56 != 0 || local59 != 0);
			local330 = local12;
			if (local328) {
				local330 = local12 | 0x7;
			} else {
				if (super.anInt8065 != 0) {
					local330 = local12 | 0x5;
				}
				if (super.anInt8076 != 0) {
					local330 |= 0x2;
				}
				if (super.anInt8069 != 0) {
					local330 |= 0x7;
				}
			}
			local380 = super.aClass83Array3[2] = local313.method2303(local330, arg0, super.anInt8116, super.anInt8095, Static28.aClass220_1, super.anInt8134);
			if (local380 != null) {
				if (super.anInt8069 >= 0 && local16.anIntArrayArray16 != null && local16.anIntArrayArray16[super.anInt8069] != null) {
					local407 = 0;
					local409 = 0;
					local411 = 0;
					if (local16.anIntArrayArray16 != null && local16.anIntArrayArray16[super.anInt8069] != null) {
						local407 = local16.anIntArrayArray16[super.anInt8069][0];
						local409 = local16.anIntArrayArray16[super.anInt8069][1];
						local411 = local16.anIntArrayArray16[super.anInt8069][2];
					}
					if (local16.anIntArrayArray17 != null && local16.anIntArrayArray17[super.anInt8069] != null) {
						local411 += local16.anIntArrayArray17[super.anInt8069][2];
						local409 += local16.anIntArrayArray17[super.anInt8069][1];
						local407 += local16.anIntArrayArray17[super.anInt8069][0];
					}
					if (local411 != 0 || local407 != 0) {
						local498 = local78;
						if (super.anIntArray433 != null && super.anIntArray433[super.anInt8069] != -1) {
							local498 = super.anIntArray433[super.anInt8069];
						}
						local526 = super.anInt8065 * 2048 + local498 - local78 & 0x3FFF;
						if (local526 != 0) {
							local380.a(local526);
						}
						local535 = Class344.anIntArray579[local526];
						local539 = Class344.anIntArray578[local526];
						local549 = local411 * local535 + local539 * local407 >> 14;
						local411 = local539 * local411 - local535 * local407 >> 14;
						local407 = local549;
					}
					local380.H(local407, local409, local411);
				} else if (super.anInt8065 != 0) {
					local380.a(super.anInt8065 * 2048);
				}
				if (super.anInt8076 != 0) {
					local380.H(0, -super.anInt8076 << 2, 0);
				}
				if (local328) {
					if (super.anInt8102 != 0) {
						local380.FA(super.anInt8102);
					}
					if (super.anInt8082 != 0) {
						local380.VA(super.anInt8082);
					}
					if (super.anInt8096 != 0) {
						local380.H(0, super.anInt8096, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BIBI)V")
	public void method2769(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8105 != -1 && Static28.aClass220_1.method5670(super.anInt8105).anInt3607 == 1) {
			super.anInt8105 = -1;
			super.anIntArray434 = null;
		}
		@Pc(35) Class73 local35;
		if (super.anInt8058 != -1) {
			local35 = Static202.aClass333_2.method7823(super.anInt8058);
			if (local35.aBoolean202 && local35.anInt2718 != -1 && Static28.aClass220_1.method5670(local35.anInt2718).anInt3607 == 1) {
				super.anInt8058 = -1;
			}
		}
		if (super.anInt8074 != -1) {
			local35 = Static202.aClass333_2.method7823(super.anInt8074);
			if (local35.aBoolean202 && local35.anInt2718 != -1 && Static28.aClass220_1.method5670(local35.anInt2718).anInt3607 == 1) {
				super.anInt8074 = -1;
			}
		}
		this.anInt3316 = -1;
		if (arg0 < 0 || Static372.anInt7082 <= arg0 || arg2 < 0 || arg2 >= Static218.anInt5023) {
			this.method2761(arg0, arg2);
		} else if (super.anIntArray435[0] >= 0 && super.anIntArray435[0] < Static372.anInt7082 && super.anIntArray436[0] >= 0 && Static218.anInt5023 > super.anIntArray436[0]) {
			if (arg1 == 2) {
				Static559.method7201(arg2, arg0, this);
			}
			this.method2758(arg0, arg2, arg1);
		} else {
			this.method2761(arg0, arg2);
		}
	}
}
