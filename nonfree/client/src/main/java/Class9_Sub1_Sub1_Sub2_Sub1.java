import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class9_Sub1_Sub1_Sub2_Sub1 extends Class9_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!afa", name = "sd", descriptor = "Lclient!bfa;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!afa", name = "hd", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!afa", name = "cd", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!afa", name = "td", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!afa", name = "Tc", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!afa", name = "Kc", descriptor = "I")
	public int anInt553;

	@OriginalMember(owner = "client!afa", name = "fd", descriptor = "B")
	private byte aByte27 = 0;

	@OriginalMember(owner = "client!afa", name = "Qc", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!afa", name = "xd", descriptor = "I")
	public int anInt520 = -1;

	@OriginalMember(owner = "client!afa", name = "Yc", descriptor = "I")
	public int anInt538 = -1;

	@OriginalMember(owner = "client!afa", name = "vd", descriptor = "I")
	public int anInt531 = -1;

	@OriginalMember(owner = "client!afa", name = "ld", descriptor = "I")
	public int anInt526 = -1;

	@OriginalMember(owner = "client!afa", name = "od", descriptor = "I")
	public int anInt528 = -1;

	@OriginalMember(owner = "client!afa", name = "bd", descriptor = "I")
	public int anInt519 = 255;

	@OriginalMember(owner = "client!afa", name = "ud", descriptor = "I")
	public int anInt546 = 0;

	@OriginalMember(owner = "client!afa", name = "Uc", descriptor = "I")
	public int anInt542 = -1;

	@OriginalMember(owner = "client!afa", name = "md", descriptor = "B")
	private byte aByte28 = 0;

	@OriginalMember(owner = "client!afa", name = "Zc", descriptor = "I")
	public int anInt523 = -1;

	@OriginalMember(owner = "client!afa", name = "nd", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!afa", name = "Ic", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!afa", name = "rd", descriptor = "I")
	public int anInt549 = 0;

	@OriginalMember(owner = "client!afa", name = "Ad", descriptor = "I")
	public int anInt554 = -1;

	@OriginalMember(owner = "client!afa", name = "Fd", descriptor = "B")
	private byte aByte29 = 0;

	@OriginalMember(owner = "client!afa", name = "Jd", descriptor = "I")
	public int anInt548 = 0;

	@OriginalMember(owner = "client!afa", name = "Dd", descriptor = "I")
	public int anInt552 = 0;

	@OriginalMember(owner = "client!afa", name = "Nc", descriptor = "I")
	public int anInt530 = 0;

	@OriginalMember(owner = "client!afa", name = "Bd", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!afa", name = "Wc", descriptor = "Z")
	public boolean aBoolean36 = false;

	@OriginalMember(owner = "client!afa", name = "pd", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "()V")
	public Class9_Sub1_Sub1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(I)V")
	public Class9_Sub1_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method472() {
		return this.aString4;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method473(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt2178 = 0;
		@Pc(12) int local12 = arg0.method2048(255);
		this.aByte28 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean35;
		this.aBoolean35 = (local12 & 0x2) != 0;
		@Pc(43) boolean local43 = (local12 & 0x4) != 0;
		@Pc(47) int local47 = super.method7485();
		this.method7481((local12 >> 3 & 0x7) + 1);
		this.aByte27 = (byte) (local12 >> 6 & 0x3);
		super.anInt10694 += this.method7485() - local47 << 8;
		super.anInt10695 += this.method7485() - local47 << 8;
		this.aByte29 = arg0.method2022();
		this.anInt538 = arg0.method2022();
		this.anInt523 = arg0.method2022();
		this.aBoolean34 = arg0.method2022() == 1;
		if (Static286.aClass379_8 == Static416.aClass379_6 && Static432.anInt6579 >= 2) {
			this.aBoolean34 = false;
		}
		@Pc(134) int local134 = -1;
		this.anInt548 = 0;
		@Pc(142) int[] local142 = new int[Static257.aClass124_2.anIntArray213.length];
		@Pc(147) Class99[] local147 = new Class99[Static257.aClass124_2.anIntArray213.length];
		@Pc(152) Class275[] local152 = new Class275[Static257.aClass124_2.anIntArray213.length];
		@Pc(168) int local168;
		@Pc(182) int local182;
		@Pc(189) int local189;
		@Pc(241) int local241;
		for (@Pc(154) int local154 = 0; local154 < Static257.aClass124_2.anIntArray213.length; local154++) {
			if (Static257.aClass124_2.anIntArray213[local154] != 1) {
				local168 = arg0.method2048(255);
				if (local168 == 0) {
					local142[local154] = 0;
				} else {
					local182 = arg0.method2048(255);
					local189 = (local168 << 8) + local182;
					if (local154 == 0 && local189 == 65535) {
						local134 = arg0.method2028(-14795);
						this.anInt548 = arg0.method2048(255);
						break;
					}
					if (local189 >= 32768) {
						local189 = Static492.anIntArray567[local189 - 32768];
						local142[local154] = local189 | 0x40000000;
						local152[local154] = Static606.aClass62_2.method1887(local189);
						local241 = local152[local154].anInt7265;
						if (local241 != 0) {
							this.anInt548 = local241;
						}
					} else {
						local142[local154] = Integer.MIN_VALUE | local189 - 256;
					}
				}
			}
		}
		if (local134 == -1) {
			local168 = arg0.method2028(-14795);
			local182 = 0;
			for (local189 = 0; local189 < Static257.aClass124_2.anIntArray213.length; local189++) {
				if (Static257.aClass124_2.anIntArray213[local189] == 0) {
					if ((0x1 << local182 & local168) != 0) {
						local147[local189] = Static22.method651(local152[local189], arg0);
					}
					local182++;
				}
			}
		}
		@Pc(330) int[] local330 = new int[10];
		for (local182 = 0; local182 < 10; local182++) {
			local189 = arg0.method2048(255);
			if (Static596.aShortArrayArrayArray1.length <= local182 || local189 < 0 || Static596.aShortArrayArrayArray1[local182][0].length <= local189) {
				local189 = 0;
			}
			local330[local182] = local189;
		}
		this.anInt527 = arg0.method2028(-14795);
		this.aString3 = arg0.method2014();
		this.aString4 = this.aString3;
		if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == this) {
			Static293.aString60 = this.aString3;
		}
		if (arg1 < 46) {
			return;
		}
		this.anInt552 = arg0.method2048(255);
		if (local43) {
			this.anInt530 = arg0.method2028(-14795);
			if (this.anInt530 == 65535) {
				this.anInt530 = -1;
			}
			this.anInt526 = -1;
			this.anInt546 = this.anInt552;
		} else {
			this.anInt530 = 0;
			this.anInt546 = arg0.method2048(255);
			this.anInt526 = arg0.method2048(255);
			if (this.anInt526 == 255) {
				this.anInt526 = -1;
			}
		}
		local189 = this.anInt549;
		this.anInt549 = arg0.method2048(255);
		@Pc(488) int local488;
		if (this.anInt549 == 0) {
			Static250.method3519(this);
		} else {
			local241 = this.anInt520;
			@Pc(485) int local485 = this.anInt528;
			local488 = this.anInt542;
			@Pc(491) int local491 = this.anInt531;
			@Pc(494) int local494 = this.anInt519;
			this.anInt520 = arg0.method2028(-14795);
			this.anInt528 = arg0.method2028(-14795);
			this.anInt542 = arg0.method2028(-14795);
			this.anInt531 = arg0.method2028(-14795);
			this.anInt519 = arg0.method2048(255);
			if (this.aBoolean35 != local21 || local189 != this.anInt549 || this.anInt520 != local241 || local485 != this.anInt528 || this.anInt542 != local488 || this.anInt531 != local491 || local494 != this.anInt519) {
				Static165.method2682(this);
			}
		}
		if (this.aClass34_1 == null) {
			this.aClass34_1 = new Class34();
		}
		local241 = this.aClass34_1.anInt1234;
		@Pc(587) int[] local587 = this.aClass34_1.anIntArray77;
		this.aClass34_1.method1160(local147, local330, local134, this.aByte28 == 1, local142, this.method7490());
		if (local241 != local134) {
			super.anInt10694 = (super.anIntArray644[0] << 9) + (this.method7485() << 8);
			super.anInt10695 = (super.anIntArray643[0] << 9) + (this.method7485() << 8);
		}
		if (Static574.anInt8718 == super.anInt8783 && local587 != null) {
			for (local488 = 0; local488 < local330.length; local488++) {
				if (local330[local488] != local587[local488]) {
					Static606.aClass62_2.method1884();
					break;
				}
			}
		}
		if (super.aClass9_Sub5_8 != null) {
			super.aClass9_Sub5_8.method5584();
		}
		if (!super.aClass45_9.method6572() || !super.aBoolean593) {
			return;
		}
		@Pc(706) Class226 local706 = this.method7489();
		if (!local706.method5090(super.aClass45_9.method6577())) {
			super.aClass45_9.method6576(-1);
			super.aBoolean593 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "(B)I")
	@Override
	public int method7485() {
		return this.aClass34_1 == null || this.aClass34_1.anInt1234 == -1 ? super.method7485() : Static255.aClass14_1.method619(this.aClass34_1.anInt1234).anInt5693;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method475() {
		@Pc(7) String local7 = "";
		if (Static586.aStringArray39 != null) {
			local7 = local7 + Static586.aStringArray39[this.aByte27];
		}
		@Pc(33) int[] local33;
		if (this.aByte28 == 1 && Static519.anIntArray590 != null) {
			local33 = Static519.anIntArray590;
		} else {
			local33 = Static455.anIntArray522;
		}
		if (local33 != null && local33[this.aByte27] != -1) {
			@Pc(55) Class241 local55 = Static298.aClass322_1.method7220(local33[this.aByte27]);
			if (local55.aChar4 == 's') {
				local7 = local7 + local55.method5331(this.aByte29 & 0xFF);
			} else {
				Static275.method4893("gdn1", new Throwable());
				local33[this.aByte27] = -1;
			}
		}
		local7 = local7 + this.aString3;
		if (Static231.aStringArray19 != null) {
			local7 = local7 + Static231.aStringArray19[this.aByte27];
		}
		return local7;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass34_1 == null || !this.method477(131072, arg0)) {
			return false;
		}
		@Pc(22) Class58 local22 = arg0.method9354();
		@Pc(27) int local27 = super.aClass365_7.method8385();
		local22.method9525(local27);
		local22.method9509(super.anInt10694, super.anInt10690, super.anInt10695);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; super.aClass170Array3.length > local42; local42++) {
			if (super.aClass170Array3[local42] != null && (Static444.aBoolean451 ? super.aClass170Array3[local42].method8351(arg1, arg2, local22, true, 0, Static668.anInt10260) : super.aClass170Array3[local42].method8349(arg1, arg2, local22, true, 0))) {
				local40 = true;
				break;
			}
		}
		for (@Pc(95) int local95 = 0; local95 < super.aClass170Array3.length; local95++) {
			super.aClass170Array3[local95] = null;
		}
		return local40;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
		if (this.aClass34_1 == null || !super.aBoolean594 && !this.method477(0, arg0)) {
			return;
		}
		@Pc(28) Class58 local28 = arg0.method9354();
		local28.method9525(super.aClass365_7.method8385());
		local28.method9509(super.anInt10694, super.anInt10690 - 5, super.anInt10695);
		this.method7494(local28, super.aBoolean594, arg0, super.aClass170Array3);
		for (@Pc(64) int local64 = 0; local64 < super.aClass170Array3.length; local64++) {
			super.aClass170Array3[local64] = null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "k", descriptor = "(B)Z")
	public boolean method476() {
		return this.aClass34_1 != null;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		if (this.aClass34_1 == null || !this.method477(2048, arg0)) {
			return null;
		}
		@Pc(22) Class58 local22 = arg0.method9354();
		@Pc(27) int local27 = super.aClass365_7.method8385();
		local22.method9525(local27);
		@Pc(45) Class364 local45 = Static448.aClass364ArrayArrayArray2[super.aByte139][super.anInt10694 >> Static626.anInt9669][super.anInt10695 >> Static626.anInt9669];
		if (local45 == null || local45.aClass9_Sub1_Sub4_1 == null) {
			super.anInt8785 = (int) ((float) super.anInt8785 - (float) super.anInt8785 / 10.0F);
		} else {
			@Pc(60) int local60 = super.anInt8785 - local45.aClass9_Sub1_Sub4_1.aShort97;
			super.anInt8785 = (int) ((float) super.anInt8785 - (float) local60 / 10.0F);
		}
		local22.method9509(super.anInt10694, super.anInt10690 - super.anInt8785 - 20, super.anInt10695);
		@Pc(102) Class9_Sub6 local102 = null;
		super.aBoolean595 = false;
		if (Static580.aClass3_Sub22_24.aClass21_Sub7_1.method3410() == 1) {
			@Pc(117) Class226 local117 = this.method7489();
			if (local117.aBoolean375 && (this.aClass34_1.anInt1234 == -1 || Static255.aClass14_1.method619(this.aClass34_1.anInt1234).aBoolean366)) {
				@Pc(157) Class45 local157 = super.aClass45_10.method6572() && super.aClass45_10.method6589() ? super.aClass45_10 : null;
				@Pc(177) Class45 local177 = super.aClass45_9.method6572() && (!super.aBoolean593 || local157 == null) ? super.aClass45_9 : null;
				@Pc(203) Class170 local203 = Static76.method1622(1, 0, 0, local177 == null ? local157 : local177, super.aClass170Array3[0], super.anInt8800, local27, arg0, 160, super.anInt8758, super.anInt8763, 240);
				if (local203 != null) {
					local102 = Static135.method9083(super.aClass170Array3.length + 1, true);
					super.aBoolean595 = true;
					arg0.C(false);
					if (Static444.aBoolean451) {
						local203.method8350(local22, local102.aClass9_Sub9Array1[super.aClass170Array3.length], Static668.anInt10260, 0);
					} else {
						local203.method8360(local22, local102.aClass9_Sub9Array1[super.aClass170Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(260) int local260;
		if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == this) {
			for (local260 = Static110.aClass197Array1.length - 1; local260 >= 0; local260--) {
				@Pc(266) Class197 local266 = Static110.aClass197Array1[local260];
				if (local266 != null && local266.anInt5080 != -1) {
					@Pc(301) int local301;
					if (local266.anInt5073 == 1) {
						@Pc(289) Class3_Sub52 local289 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local266.anInt5082);
						if (local289 != null) {
							@Pc(294) Class9_Sub1_Sub1_Sub2_Sub2 local294 = local289.aClass9_Sub1_Sub1_Sub2_Sub2_2;
							local301 = local294.anInt10694 - Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694;
							@Pc(308) int local308 = local294.anInt10695 - Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695;
							if (Static444.aBoolean451) {
								this.method481(super.aClass170Array3[0], local22, local308, arg0, local301, local266.anInt5080, 92160000, Static668.anInt10260);
							} else {
								this.method482(92160000, local266.anInt5080, super.aClass170Array3[0], local22, local308, arg0, local301);
							}
						}
					}
					@Pc(364) int local364;
					if (local266.anInt5073 == 2) {
						@Pc(357) int local357 = local266.anInt5081 - Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694;
						local364 = local266.anInt5074 - Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695;
						local301 = local266.anInt5079 << 9;
						local301 *= local301;
						if (Static444.aBoolean451) {
							this.method481(super.aClass170Array3[0], local22, local364, arg0, local357, local266.anInt5080, local301, Static668.anInt10260);
						} else {
							this.method482(local301, local266.anInt5080, super.aClass170Array3[0], local22, local364, arg0, local357);
						}
					}
					if (local266.anInt5073 == 10 && local266.anInt5082 >= 0 && Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1.length > local266.anInt5082) {
						@Pc(434) Class9_Sub1_Sub1_Sub2_Sub1 local434 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local266.anInt5082];
						if (local434 != null) {
							local364 = local434.anInt10694 - Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694;
							local301 = local434.anInt10695 - Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695;
							if (Static444.aBoolean451) {
								this.method481(super.aClass170Array3[0], local22, local301, arg0, local364, local266.anInt5080, 92160000, Static668.anInt10260);
							} else {
								this.method482(92160000, local266.anInt5080, super.aClass170Array3[0], local22, local301, arg0, local364);
							}
						}
					}
				}
			}
			local22.method9525(local27);
			local22.method9509(super.anInt10694, super.anInt10690, super.anInt10695);
		}
		local22.method9525(local27);
		local22.method9509(super.anInt10694, super.anInt10690 - super.anInt8785 - 5, super.anInt10695);
		if (local102 == null) {
			local102 = Static135.method9083(super.aClass170Array3.length, true);
		}
		this.method7494(local22, false, arg0, super.aClass170Array3);
		if (Static444.aBoolean451) {
			for (local260 = 0; super.aClass170Array3.length > local260; local260++) {
				if (super.aClass170Array3[local260] != null) {
					super.aClass170Array3[local260].method8350(local22, local102.aClass9_Sub9Array1[local260], Static668.anInt10260, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local260 = 0; super.aClass170Array3.length > local260; local260++) {
				if (super.aClass170Array3[local260] != null) {
					super.aClass170Array3[local260].method8360(local22, local102.aClass9_Sub9Array1[local260], Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass9_Sub5_8 != null) {
			@Pc(635) Class346 local635 = super.aClass9_Sub5_8.method5580();
			if (Static444.aBoolean451) {
				arg0.method9360(local635, Static668.anInt10260);
			} else {
				arg0.method9384(local635);
			}
		}
		for (local260 = 0; local260 < super.aClass170Array3.length; local260++) {
			if (super.aClass170Array3[local260] != null) {
				super.aBoolean595 |= super.aClass170Array3[local260].F();
			}
			super.aClass170Array3[local260] = null;
		}
		super.anInt8778 = Static247.anInt3877;
		return local102;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method477(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class226 local11 = this.method7489();
		@Pc(29) Class45 local29 = super.aClass45_10.method6572() && !super.aClass45_10.method6589() ? super.aClass45_10 : null;
		@Pc(54) Class45 local54 = super.aClass45_9.method6572() && !this.aBoolean39 && (!super.aBoolean593 || local29 == null) ? super.aClass45_9 : null;
		@Pc(57) int local57 = local11.anInt5813;
		@Pc(60) int local60 = local11.anInt5791;
		if (local57 != 0 || local60 != 0 || local11.anInt5775 != 0 || local11.anInt5805 != 0) {
			arg0 |= 0x7;
		}
		@Pc(85) int local85 = super.aClass365_7.method8385();
		@Pc(109) boolean local109 = super.aByte130 != 0 && super.anInt8804 <= Static716.anInt11157 && super.anInt8802 > Static716.anInt11157;
		if (local109) {
			arg0 |= 0x80000;
		}
		@Pc(142) Class170 local142 = super.aClass170Array3[0] = this.aClass34_1.method1154(Static288.aClass97_1, Static255.aClass14_1, Static592.aClass155_2, Static606.aClass62_2, local29, super.anIntArray642, local54, Static661.aClass73_1, super.aClass45_Sub2_Sub1Array3, arg1, local85, arg0, Static257.aClass124_2, Static380.aClass127_1);
		@Pc(145) int local145 = Static258.method3589();
		if (Static7.anInt229 < 96 && local145 > 50) {
			Static393.method5323();
		}
		if (Static416.aClass379_6 != Static286.aClass379_8 && local145 < 50) {
			@Pc(190) int local190 = 50 - local145;
			while (Static531.anInt8272 < local190) {
				Static644.aByteArrayArray19[Static531.anInt8272] = new byte[102400];
				Static531.anInt8272++;
			}
			while (Static531.anInt8272 > local190) {
				Static531.anInt8272--;
				Static644.aByteArrayArray19[Static531.anInt8272] = null;
			}
		} else if (Static286.aClass379_8 != Static416.aClass379_6) {
			Static531.anInt8272 = 0;
			Static644.aByteArrayArray19 = new byte[50][];
		}
		if (local142 == null) {
			return false;
		}
		super.anInt8796 = local142.fa();
		super.anInt8794 = local142.ma();
		this.method7477(local142);
		if (local57 == 0 && local60 == 0) {
			this.method7476(this.method7485() << 9, local85, this.method7485() << 9, 0, 0);
		} else {
			this.method7476(local57, local85, local60, local11.anInt5804, local11.anInt5809);
			if (super.anInt8758 != 0) {
				local142.FA(super.anInt8758);
			}
			if (super.anInt8763 != 0) {
				local142.VA(super.anInt8763);
			}
			if (super.anInt8800 != 0) {
				local142.H(0, super.anInt8800, 0);
			}
		}
		if (local109) {
			local142.method8358(super.aByte128, super.aByte127, super.aByte129, super.aByte130 & 0xFF);
		}
		if (!this.aBoolean39) {
			this.method7484(local57, local85, arg1, local11, local60, local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZLjava/lang/String;)V")
	public void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		this.method7487(Static163.method2669() * Static29.aClass378_1.anInt10092, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BIII)V")
	public void method479(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anIntArray644.length - 1 > super.anInt8817) {
			super.anInt8817++;
		}
		for (@Pc(24) int local24 = super.anInt8817; local24 > 0; local24--) {
			super.anIntArray644[local24] = super.anIntArray644[local24 - 1];
			super.anIntArray643[local24] = super.anIntArray643[local24 - 1];
			super.aByteArray86[local24] = super.aByteArray86[local24 - 1];
		}
		if (16548 != 16548) {
			this.method473((Class3_Sub2) null, -43);
		}
		super.anIntArray644[0] = arg1;
		super.anIntArray643[0] = arg2;
		super.aByteArray86[0] = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "(I)I")
	@Override
	protected int method7490() {
		return this.anInt527;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIBB)V")
	public void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.aClass45_10.method6572() && super.aClass45_10.method6579().anInt3750 == 1) {
			super.anIntArray641 = null;
			super.aClass45_10.method6576(-1);
		}
		for (@Pc(33) int local33 = 0; local33 < super.aClass407Array3.length; local33++) {
			if (super.aClass407Array3[local33].anInt11162 != -1) {
				@Pc(54) Class139 local54 = Static381.aClass106_2.method2618(super.aClass407Array3[local33].anInt11162);
				if (local54.aBoolean218 && local54.anInt3453 != -1 && Static592.aClass155_2.method3422(local54.anInt3453).anInt3750 == 1) {
					super.aClass407Array3[local33].aClass45_11.method6576(-1);
					super.aClass407Array3[local33].anInt11162 = -1;
				}
			}
		}
		this.anInt554 = -1;
		if (arg1 < 0 || Static497.anInt7926 <= arg1 || arg0 < 0 || Static646.anInt9979 <= arg0) {
			this.method483(arg1, arg0);
		} else if (super.anIntArray644[0] >= 0 && super.anIntArray644[0] < Static497.anInt7926 && super.anIntArray643[0] >= 0 && super.anIntArray643[0] < Static646.anInt9979) {
			if (arg2 == 2) {
				Static496.method6775(arg1, arg0, this);
			}
			this.method479(arg2, arg1, arg0);
		} else {
			this.method483(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ka;Lclient!cl;ILclient!ha;IIIBI)V")
	private void method481(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(20) int local20 = arg4 * arg4 + arg2 * arg2;
		if (local20 < 262144 || arg6 < local20) {
			return;
		}
		@Pc(51) int local51 = (int) (Math.atan2((double) arg4, (double) arg2) * 2607.5945876176133D - (double) super.aClass365_7.method8385()) & 0x3FFF;
		@Pc(63) Class170 local63 = Static194.method3002(super.anInt8763, local51, arg3, super.anInt8758, arg5, super.anInt8800);
		if (local63 != null) {
			arg3.C(false);
			local63.method8350(arg1, (Class9_Sub9) null, arg7, 0);
			arg3.C(true);
		}
	}

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)Lclient!oka;")
	@Override
	public Class279 method7491() {
		if (super.aClass279_3 != null) {
			if (super.aClass279_3.aString95 == null) {
				return null;
			}
			if (Static485.anInt7642 == 0 || Static485.anInt7642 == 3 || Static485.anInt7642 == 1 && Static193.method2998(this.aString4)) {
				return super.aClass279_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "(I)I")
	@Override
	public int method7475() {
		return -1;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IILclient!ka;Lclient!cl;BILclient!ha;I)V")
	private void method482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class170 arg2, @OriginalArg(3) Class58 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class22 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg4 * arg4 + arg6 * arg6;
		if (local11 < 262144 || local11 > arg0) {
			return;
		}
		@Pc(43) int local43 = (int) (Math.atan2((double) arg6, (double) arg4) * 2607.5945876176133D - (double) super.aClass365_7.method8385()) & 0x3FFF;
		@Pc(55) Class170 local55 = Static194.method3002(super.anInt8763, local43, arg5, super.anInt8758, arg1, super.anInt8800);
		if (local55 != null) {
			arg5.C(false);
			local55.method8360(arg3, (Class9_Sub9) null, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7478() {
		return Static29.aClass378_1.aBoolean675;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(III)V")
	public void method483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt8814 = 0;
		super.anInt8817 = 0;
		super.anIntArray644[0] = arg0;
		super.anInt8816 = 0;
		super.anIntArray643[0] = arg1;
		@Pc(26) int local26 = this.method7485();
		super.anInt10694 = super.anIntArray644[0] * 512 + local26 * 256;
		super.anInt10695 = local26 * 256 + super.anIntArray643[0] * 512;
		if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == this) {
			Static509.method6646();
		}
		if (super.aClass9_Sub5_8 != null) {
			super.aClass9_Sub5_8.method5584();
		}
	}
}
