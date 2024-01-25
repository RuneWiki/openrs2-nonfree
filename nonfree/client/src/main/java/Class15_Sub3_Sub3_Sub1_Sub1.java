import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class15_Sub3_Sub3_Sub1_Sub1 extends Class15_Sub3_Sub3_Sub1 {

	@OriginalMember(owner = "client!ea", name = "bd", descriptor = "Lclient!ae;")
	public Class9 aClass9_1;

	@OriginalMember(owner = "client!ea", name = "ed", descriptor = "I")
	public int anInt2375;

	@OriginalMember(owner = "client!ea", name = "gd", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!ea", name = "sd", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!ea", name = "zd", descriptor = "I")
	private int anInt2388;

	@OriginalMember(owner = "client!ea", name = "Pd", descriptor = "I")
	public int anInt2401;

	@OriginalMember(owner = "client!ea", name = "Yc", descriptor = "I")
	public int anInt2371 = 0;

	@OriginalMember(owner = "client!ea", name = "dd", descriptor = "I")
	public int anInt2374 = -1;

	@OriginalMember(owner = "client!ea", name = "id", descriptor = "B")
	private byte aByte35 = 0;

	@OriginalMember(owner = "client!ea", name = "md", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ea", name = "nd", descriptor = "B")
	private byte aByte36 = 0;

	@OriginalMember(owner = "client!ea", name = "pd", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!ea", name = "ud", descriptor = "I")
	public int anInt2384 = -1;

	@OriginalMember(owner = "client!ea", name = "hd", descriptor = "I")
	public int anInt2377 = -1;

	@OriginalMember(owner = "client!ea", name = "od", descriptor = "I")
	public int anInt2380 = 255;

	@OriginalMember(owner = "client!ea", name = "fd", descriptor = "I")
	public int anInt2376 = -1;

	@OriginalMember(owner = "client!ea", name = "jd", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ea", name = "vd", descriptor = "I")
	public int anInt2385 = 0;

	@OriginalMember(owner = "client!ea", name = "Cd", descriptor = "I")
	public int anInt2391 = -1;

	@OriginalMember(owner = "client!ea", name = "td", descriptor = "I")
	public int anInt2383 = -1;

	@OriginalMember(owner = "client!ea", name = "Bd", descriptor = "I")
	public int anInt2390 = 0;

	@OriginalMember(owner = "client!ea", name = "Fd", descriptor = "B")
	private byte aByte37 = 0;

	@OriginalMember(owner = "client!ea", name = "kd", descriptor = "I")
	public int anInt2378 = -1;

	@OriginalMember(owner = "client!ea", name = "ad", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!ea", name = "yd", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!ea", name = "Ld", descriptor = "I")
	public int anInt2398 = -1;

	@OriginalMember(owner = "client!ea", name = "Rd", descriptor = "I")
	public int anInt2403 = 0;

	@OriginalMember(owner = "client!ea", name = "Nd", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!ea", name = "Td", descriptor = "I")
	public int anInt2405 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBIB)V")
	public void method2220(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt3985 != -1 && Static354.aClass40_2.method1123(super.anInt3985).anInt5134 == 1) {
			super.anIntArray184 = null;
			super.anInt3985 = -1;
		}
		for (@Pc(25) int local25 = 0; super.aClass358Array3.length > local25; local25++) {
			if (super.aClass358Array3[local25].anInt10525 != -1) {
				@Pc(43) Class336 local43 = Static391.aClass319_1.method8041(super.aClass358Array3[local25].anInt10525);
				if (local43.aBoolean711 && local43.anInt9651 != -1 && Static354.aClass40_2.method1123(local43.anInt9651).anInt5134 == 1) {
					super.aClass358Array3[local25].anInt10525 = -1;
				}
			}
		}
		this.anInt2376 = -1;
		if (arg2 < 0 || arg2 >= Static222.anInt4533 || arg0 < 0 || arg0 >= Static668.anInt11370) {
			this.method2221(arg2, arg0);
		} else if (super.anIntArray189[0] >= 0 && super.anIntArray189[0] < Static222.anInt4533 && super.anIntArray188[0] >= 0 && super.anIntArray188[0] < Static668.anInt11370) {
			if (arg1 == 2) {
				Static81.method1408(this, arg2, arg0);
			}
			this.method2228(arg2, arg1, arg0);
		} else {
			this.method2221(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	public void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt4040 = 0;
		super.anIntArray189[0] = arg0;
		super.anInt4039 = 0;
		super.anInt4038 = 0;
		super.anIntArray188[0] = arg1;
		@Pc(26) int local26 = this.method3690();
		super.anInt11024 = local26 * 256 + super.anIntArray188[0] * 512;
		super.anInt11022 = super.anIntArray189[0] * 512 + local26 * 256;
		if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 == this) {
			Static593.method7276();
		}
		if (super.aClass15_Sub5_3 != null) {
			super.aClass15_Sub5_3.method2306();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2222() {
		@Pc(13) String local13 = "";
		if (Static596.aStringArray76 != null) {
			local13 = local13 + Static596.aStringArray76[this.aByte36];
		}
		@Pc(35) int[] local35;
		if (this.aByte35 == 1 && Static578.anIntArray331 != null) {
			local35 = Static578.anIntArray331;
		} else {
			local35 = Static502.anIntArray455;
		}
		if (local35 != null && local35[this.aByte36] != -1) {
			@Pc(55) Class289 local55 = Static203.aClass164_1.method4433(local35[this.aByte36]);
			if (local55.aChar5 == 's') {
				local13 = local13 + local55.method7508(this.aByte37 & 0xFF);
			} else {
				Static165.method3319(new Throwable(), "gdn1");
				local35[this.aByte36] = -1;
			}
		}
		local13 = local13 + this.aString30;
		if (Static581.aStringArray68 != null) {
			local13 = local13 + Static581.aStringArray68[this.aByte36];
		}
		return local13;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
		if (this.aClass9_1 == null || !super.aBoolean317 && !this.method2230(arg0, 0)) {
			return;
		}
		@Pc(22) Class76 local22 = arg0.method8085();
		local22.method9633(super.aClass106_7.method3290());
		local22.method9640(super.anInt11022, super.anInt11029 - 5, super.anInt11024);
		this.method3676(super.aBoolean317, local22, super.aClass14Array3, arg0);
		for (@Pc(55) int local55 = 0; super.aClass14Array3.length > local55; local55++) {
			super.aClass14Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!ol;)V")
	public void method2225(@OriginalArg(1) Class2_Sub8 arg0) {
		arg0.anInt5725 = 0;
		@Pc(14) int local14 = arg0.method5203();
		this.aByte35 = (byte) (local14 & 0x1);
		@Pc(23) boolean local23 = this.aBoolean177;
		this.aBoolean177 = (local14 & 0x2) != 0;
		@Pc(43) boolean local43 = (local14 & 0x4) != 0;
		@Pc(47) int local47 = super.method3690();
		this.method3689((local14 >> 3 & 0x7) + 1);
		this.aByte36 = (byte) (local14 >> 6 & 0x3);
		super.anInt11022 += this.method3690() - local47 << 8;
		super.anInt11024 += this.method3690() - local47 << 8;
		this.aByte37 = arg0.method5175();
		this.anInt2377 = arg0.method5175();
		this.anInt2398 = arg0.method5175();
		this.aBoolean175 = arg0.method5175() == 1;
		if (Static314.aClass37_6 == Static235.aClass37_5 && Static31.anInt530 >= 2) {
			this.aBoolean175 = false;
		}
		@Pc(132) int local132 = -1;
		this.anInt2371 = 0;
		@Pc(140) int[] local140 = new int[Static207.aClass265_1.anIntArray398.length];
		@Pc(145) Class80[] local145 = new Class80[Static207.aClass265_1.anIntArray398.length];
		@Pc(150) Class351[] local150 = new Class351[Static207.aClass265_1.anIntArray398.length];
		@Pc(164) int local164;
		@Pc(176) int local176;
		@Pc(182) int local182;
		@Pc(232) int local232;
		for (@Pc(152) int local152 = 0; local152 < Static207.aClass265_1.anIntArray398.length; local152++) {
			if (Static207.aClass265_1.anIntArray398[local152] != 1) {
				local164 = arg0.method5203();
				if (local164 == 0) {
					local140[local152] = 0;
				} else {
					local176 = arg0.method5203();
					local182 = (local164 << 8) + local176;
					if (local152 == 0 && local182 == 65535) {
						local132 = arg0.method5211();
						this.anInt2371 = arg0.method5203();
						break;
					}
					if (local182 >= 32768) {
						local182 = Static296.anIntArray273[local182 - 32768];
						local140[local152] = local182 | 0x40000000;
						local150[local152] = Static372.aClass343_1.method8549(local182);
						local232 = local150[local152].anInt10149;
						if (local232 != 0) {
							this.anInt2371 = local232;
						}
					} else {
						local140[local152] = Integer.MIN_VALUE | local182 - 256;
					}
				}
			}
		}
		if (local132 == -1) {
			local164 = arg0.method5211();
			local176 = 0;
			for (local182 = 0; local182 < Static207.aClass265_1.anIntArray398.length; local182++) {
				if (Static207.aClass265_1.anIntArray398[local182] == 0) {
					if ((local164 & 0x1 << local176) != 0) {
						local145[local182] = Static576.method8734(arg0, local150[local182]);
					}
					local176++;
				}
			}
		}
		@Pc(307) int[] local307 = new int[5];
		for (local176 = 0; local176 < 5; local176++) {
			local182 = arg0.method5203();
			if (Static109.aShortArrayArrayArray1.length < 1 || local182 < 0 || Static109.aShortArrayArrayArray1[0][local176].length <= local182) {
				local182 = 0;
			}
			local307[local176] = local182;
		}
		this.anInt2388 = arg0.method5211();
		this.aString30 = arg0.method5178();
		this.aString29 = this.aString30;
		if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 == this) {
			Static541.aString111 = this.aString30;
		}
		this.anInt2403 = arg0.method5203();
		if (local43) {
			this.anInt2405 = arg0.method5211();
			if (this.anInt2405 == 65535) {
				this.anInt2405 = -1;
			}
			this.anInt2384 = -1;
			this.anInt2385 = this.anInt2403;
		} else {
			this.anInt2405 = 0;
			this.anInt2385 = arg0.method5203();
			this.anInt2384 = arg0.method5203();
			if (this.anInt2384 == 255) {
				this.anInt2384 = -1;
			}
		}
		local182 = this.anInt2390;
		this.anInt2390 = arg0.method5203();
		@Pc(447) int local447;
		if (this.anInt2390 == 0) {
			Static179.method3533(this);
		} else {
			local232 = this.anInt2378;
			@Pc(444) int local444 = this.anInt2391;
			local447 = this.anInt2374;
			@Pc(450) int local450 = this.anInt2383;
			@Pc(453) int local453 = this.anInt2380;
			this.anInt2378 = arg0.method5211();
			this.anInt2391 = arg0.method5211();
			this.anInt2374 = arg0.method5211();
			this.anInt2383 = arg0.method5211();
			this.anInt2380 = arg0.method5203();
			if (this.aBoolean177 != local23 || this.anInt2390 != local182 || local232 != this.anInt2378 || this.anInt2391 != local444 || local447 != this.anInt2374 || this.anInt2383 != local450 || local453 != this.anInt2380) {
				Static401.method6607(this);
			}
		}
		if (this.aClass9_1 == null) {
			this.aClass9_1 = new Class9();
		}
		local232 = this.aClass9_1.anInt156;
		@Pc(549) int[] local549 = this.aClass9_1.anIntArray2;
		this.aClass9_1.method148(local307, local132, this.method3691(), local140, local145, this.aByte35 == 1);
		if (local232 != local132) {
			super.anInt11022 = (super.anIntArray189[0] << 9) + (this.method3690() << 8);
			super.anInt11024 = (super.anIntArray188[0] << 9) + (this.method3690() << 8);
		}
		if (super.anInt3977 == Static659.anInt11273 && local549 != null) {
			for (local447 = 0; local447 < local307.length; local447++) {
				if (local307[local447] != local549[local447]) {
					Static372.aClass343_1.method8546();
					break;
				}
			}
		}
		if (super.aClass15_Sub5_3 != null) {
			super.aClass15_Sub5_3.method2306();
		}
		if (super.anInt3968 == -1 || !super.aBoolean314) {
			return;
		}
		@Pc(654) Class248 local654 = this.method3673();
		if (!local654.method6618(super.anInt3968)) {
			super.anInt3968 = -1;
			super.aBoolean314 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		if (this.aClass9_1 == null || !this.method2230(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class76 local19 = arg2.method8085();
		@Pc(24) int local24 = super.aClass106_7.method3290();
		local19.method9633(local24);
		local19.method9640(super.anInt11022, super.anInt11029, super.anInt11024);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass14Array3.length; local39++) {
			if (super.aClass14Array3[local39] != null && (Static110.aBoolean800 ? super.aClass14Array3[local39].method8625(arg0, arg1, local19, true, 0, Static165.anInt3552) : super.aClass14Array3[local39].method8624(arg0, arg1, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass14Array3[0] = super.aClass14Array3[1] = super.aClass14Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILclient!dm;Lclient!ha;IBLclient!ka;I)V")
	private void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class101 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg4 * arg4 + arg0 * arg0;
		if (local11 < 262144 || arg1 < local11) {
			return;
		}
		@Pc(48) int local48 = (int) (Math.atan2((double) arg0, (double) arg4) * 2607.5945876176133D - (double) super.aClass106_7.method3290()) & 0x3FFF;
		@Pc(60) Class14 local60 = Static110.method9636(super.anInt4033, arg6, local48, super.anInt4029, super.anInt4016, arg3);
		if (local60 != null) {
			arg3.C(false);
			local60.method8641(arg2, (Class15_Sub6) null, 0);
			arg3.C(true);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I")
	@Override
	public int method3685() {
		return -1;
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(I)I")
	@Override
	protected int method3691() {
		return this.anInt2388;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILclient!dm;ILclient!ha;ILclient!ka;I)V")
	private void method2227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(5) Class101 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class14 arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg2 * arg2 + arg5 * arg5;
		if (local12 < 262144 || arg7 < local12) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg2, (double) arg5) * 2607.5945876176133D - (double) super.aClass106_7.method3290()) & 0x3FFF;
		@Pc(54) Class14 local54 = Static110.method9636(super.anInt4033, arg1, local42, super.anInt4029, super.anInt4016, arg4);
		if (local54 != null) {
			arg4.C(false);
			local54.method8623(arg3, (Class15_Sub6) null, arg0, 0);
			arg4.C(true);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBII)V")
	public void method2228(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt4039 < 9) {
			super.anInt4039++;
		}
		for (@Pc(26) int local26 = super.anInt4039; local26 > 0; local26--) {
			super.anIntArray189[local26] = super.anIntArray189[local26 - 1];
			super.anIntArray188[local26] = super.anIntArray188[local26 - 1];
			super.aByteArray33[local26] = super.aByteArray33[local26 - 1];
		}
		super.anIntArray189[0] = arg0;
		super.aByteArray33[0] = arg1;
		super.anIntArray188[0] = arg2;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		if (this.aClass9_1 == null || !this.method2230(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class76 local19 = arg0.method8085();
		@Pc(24) int local24 = super.aClass106_7.method3290();
		local19.method9633(local24);
		@Pc(42) Class291 local42 = Static193.aClass291ArrayArrayArray2[super.aByte142][super.anInt11022 >> Static170.anInt3602][super.anInt11024 >> Static170.anInt3602];
		if (local42 == null || local42.aClass15_Sub3_Sub5_1 == null) {
			super.anInt4007 = (int) ((float) super.anInt4007 - (float) super.anInt4007 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt4007 - local42.aClass15_Sub3_Sub5_1.aShort74;
			super.anInt4007 = (int) ((float) super.anInt4007 - (float) local55 / 10.0F);
		}
		local19.method9640(super.anInt11022, -super.anInt4007 + super.anInt11029 - 20, super.anInt11024);
		@Pc(96) Class15_Sub9 local96 = null;
		super.aBoolean316 = false;
		if (Static230.aClass2_Sub54_15.aClass4_Sub10_1.method2604() == 1) {
			@Pc(111) Class248 local111 = this.method3673();
			if (local111.aBoolean558 && (this.aClass9_1.anInt156 == -1 || Static522.aClass272_2.method7200(this.aClass9_1.anInt156).aBoolean657)) {
				@Pc(146) Class178 local146 = super.anInt3985 != -1 && super.anInt4030 == 0 ? Static354.aClass40_2.method1123(super.anInt3985) : null;
				@Pc(167) Class178 local167 = super.anInt3968 == -1 || this.aBoolean176 || super.aBoolean314 && local146 != null ? null : Static354.aClass40_2.method1123(super.anInt3968);
				@Pc(199) Class14 local199 = Static235.method4259(super.anInt4033, super.anInt4016, 0, local167 == null ? local146 : local167, local167 == null ? super.anInt4021 : super.anInt4028, 1, local24, super.anInt4029, 240, 0, arg0, 160, super.aClass14Array3[0]);
				if (local199 != null) {
					local96 = Static401.method6614(super.aClass14Array3.length + 1, true);
					super.aBoolean316 = true;
					arg0.C(false);
					if (Static110.aBoolean800) {
						local199.method8623(local19, local96.aClass15_Sub6Array1[super.aClass14Array3.length], Static165.anInt3552, 0);
					} else {
						local199.method8641(local19, local96.aClass15_Sub6Array1[super.aClass14Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(252) int local252;
		if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 == this) {
			for (local252 = Static382.aClass326Array3.length - 1; local252 >= 0; local252--) {
				@Pc(258) Class326 local258 = Static382.aClass326Array3[local252];
				if (local258 != null && local258.anInt9320 != -1) {
					@Pc(288) int local288;
					if (local258.anInt9321 == 1) {
						@Pc(277) Class2_Sub6 local277 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local258.anInt9316);
						if (local277 != null) {
							@Pc(282) Class15_Sub3_Sub3_Sub1_Sub2 local282 = local277.aClass15_Sub3_Sub3_Sub1_Sub2_1;
							local288 = local282.anInt11022 - Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022;
							@Pc(295) int local295 = local282.anInt11024 - Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024;
							if (Static110.aBoolean800) {
								this.method2227(Static165.anInt3552, local258.anInt9320, local288, local19, arg0, local295, super.aClass14Array3[0], 92160000);
							} else {
								this.method2226(local288, 92160000, local19, arg0, local295, super.aClass14Array3[0], local258.anInt9320);
							}
						}
					}
					@Pc(350) int local350;
					if (local258.anInt9321 == 2) {
						@Pc(343) int local343 = local258.anInt9318 - Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022;
						local350 = local258.anInt9317 - Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024;
						local288 = local258.anInt9322 << 9;
						local288 *= local288;
						if (Static110.aBoolean800) {
							this.method2227(Static165.anInt3552, local258.anInt9320, local343, local19, arg0, local350, super.aClass14Array3[0], local288);
						} else {
							this.method2226(local343, local288, local19, arg0, local350, super.aClass14Array3[0], local258.anInt9320);
						}
					}
					if (local258.anInt9321 == 10 && local258.anInt9316 >= 0 && local258.anInt9316 < Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1.length) {
						@Pc(409) Class15_Sub3_Sub3_Sub1_Sub1 local409 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local258.anInt9316];
						if (local409 != null) {
							local350 = local409.anInt11022 - Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022;
							local288 = local409.anInt11024 - Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024;
							if (Static110.aBoolean800) {
								this.method2227(Static165.anInt3552, local258.anInt9320, local350, local19, arg0, local288, super.aClass14Array3[0], 92160000);
							} else {
								this.method2226(local350, 92160000, local19, arg0, local288, super.aClass14Array3[0], local258.anInt9320);
							}
						}
					}
				}
			}
			local19.method9633(local24);
			local19.method9640(super.anInt11022, super.anInt11029, super.anInt11024);
		}
		local19.method9633(local24);
		local19.method9640(super.anInt11022, super.anInt11029 - super.anInt4007 - 5, super.anInt11024);
		if (local96 == null) {
			local96 = Static401.method6614(super.aClass14Array3.length, true);
		}
		this.method3676(false, local19, super.aClass14Array3, arg0);
		if (Static110.aBoolean800) {
			for (local252 = 0; super.aClass14Array3.length > local252; local252++) {
				if (super.aClass14Array3[local252] != null) {
					super.aClass14Array3[local252].method8623(local19, local96.aClass15_Sub6Array1[local252], Static165.anInt3552, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local252 = 0; local252 < super.aClass14Array3.length; local252++) {
				if (super.aClass14Array3[local252] != null) {
					super.aClass14Array3[local252].method8641(local19, local96.aClass15_Sub6Array1[local252], Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass15_Sub5_3 != null) {
			@Pc(600) Class127 local600 = super.aClass15_Sub5_3.method2300();
			if (Static110.aBoolean800) {
				arg0.method8115(local600, Static165.anInt3552);
			} else {
				arg0.method8065(local600);
			}
		}
		for (local252 = 0; super.aClass14Array3.length > local252; local252++) {
			if (super.aClass14Array3[local252] != null) {
				super.aBoolean316 |= super.aClass14Array3[local252].F();
			}
			super.aClass14Array3[local252] = null;
		}
		super.anInt4022 = Static125.anInt2441;
		return local96;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "(I)Z")
	public boolean method2229() {
		return this.aClass9_1 != null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method2230(@OriginalArg(0) Class101 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class248 local11 = this.method3673();
		@Pc(26) Class178 local26 = super.anInt3985 != -1 && super.anInt4030 == 0 ? Static354.aClass40_2.method1123(super.anInt3985) : null;
		@Pc(46) Class178 local46 = super.anInt3968 == -1 || this.aBoolean176 || super.aBoolean314 && local26 != null ? null : Static354.aClass40_2.method1123(super.anInt3968);
		@Pc(49) int local49 = local11.anInt7448;
		@Pc(52) int local52 = local11.anInt7468;
		if (local49 != 0 || local52 != 0 || local11.anInt7462 != 0 || local11.anInt7456 != 0) {
			arg1 |= 0x7;
		}
		@Pc(80) int local80 = super.aClass106_7.method3290();
		@Pc(102) boolean local102 = super.aByte54 != 0 && super.anInt4003 <= Static62.anInt1184 && super.anInt4027 > Static62.anInt1184;
		if (local102) {
			arg1 |= 0x80000;
		}
		@Pc(146) Class14 local146 = super.aClass14Array3[0] = this.aClass9_1.method145(arg1, Static113.aClass282_1, super.anInt4021, local26, super.anIntArray186, super.anInt3995, Static42.aClass96_2, Static354.aClass40_2, super.anInt4028, super.anInt3974, Static522.aClass272_2, local46, super.anInt4036, arg0, super.anInt4018, Static372.aClass343_1, local80, Static665.aClass267_2, super.aClass171Array3);
		@Pc(149) int local149 = Static90.method1570();
		if (Static65.anInt1229 < 96 && local149 > 50) {
			Static437.method7115();
		}
		if (Static314.aClass37_6 != Static235.aClass37_5 && local149 < 50) {
			@Pc(169) int local169 = 50 - local149;
			while (local169 > Static271.anInt5093) {
				Static663.aByteArrayArray26[Static271.anInt5093] = new byte[102400];
				Static271.anInt5093++;
			}
			while (Static271.anInt5093 > local169) {
				Static271.anInt5093--;
				Static663.aByteArrayArray26[Static271.anInt5093] = null;
			}
		} else if (Static314.aClass37_6 != Static235.aClass37_5) {
			Static271.anInt5093 = 0;
			Static663.aByteArrayArray26 = new byte[50][];
		}
		if (local146 == null) {
			return false;
		}
		super.anInt3971 = local146.fa();
		super.anInt3988 = local146.ma();
		this.method3682(local146);
		if (local49 == 0 && local52 == 0) {
			this.method3678(this.method3690() << 9, 0, this.method3690() << 9, 0, local80);
		} else {
			this.method3678(local52, local11.anInt7452, local49, local11.anInt7465, local80);
			if (super.anInt4033 != 0) {
				local146.FA(super.anInt4033);
			}
			if (super.anInt4016 != 0) {
				local146.VA(super.anInt4016);
			}
			if (super.anInt4029 != 0) {
				local146.H(0, super.anInt4029, 0);
			}
		}
		if (local102) {
			local146.method8638(super.aByte55, super.aByte57, super.aByte56, super.aByte54 & 0xFF);
		}
		if (!this.aBoolean176) {
			this.method3677(local7, local80, local52, arg0, local49, local11);
		}
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method2231() {
		return this.aString29;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(Z)I")
	@Override
	public int method3690() {
		return this.aClass9_1 == null || this.aClass9_1.anInt156 == -1 ? super.method3690() : Static522.aClass272_2.method7200(this.aClass9_1.anInt156).anInt9095;
	}
}
