import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class28_Sub1_Sub1_Sub1_Sub1 extends Class28_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!wc", name = "ad", descriptor = "Ljava/lang/String;")
	public String aString123;

	@OriginalMember(owner = "client!wc", name = "qd", descriptor = "I")
	public int anInt10505;

	@OriginalMember(owner = "client!wc", name = "sd", descriptor = "Ljava/lang/String;")
	public String aString124;

	@OriginalMember(owner = "client!wc", name = "vd", descriptor = "I")
	public int anInt10507;

	@OriginalMember(owner = "client!wc", name = "Ed", descriptor = "Lclient!bca;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!wc", name = "Jd", descriptor = "I")
	private int anInt10516;

	@OriginalMember(owner = "client!wc", name = "fd", descriptor = "I")
	public int anInt10496 = -1;

	@OriginalMember(owner = "client!wc", name = "gd", descriptor = "B")
	private byte aByte163 = 0;

	@OriginalMember(owner = "client!wc", name = "jd", descriptor = "I")
	public int anInt10499 = -1;

	@OriginalMember(owner = "client!wc", name = "td", descriptor = "Z")
	public boolean aBoolean791 = false;

	@OriginalMember(owner = "client!wc", name = "kd", descriptor = "I")
	public int anInt10500 = 0;

	@OriginalMember(owner = "client!wc", name = "Ad", descriptor = "Z")
	public boolean aBoolean792 = false;

	@OriginalMember(owner = "client!wc", name = "nd", descriptor = "I")
	public int anInt10502 = -1;

	@OriginalMember(owner = "client!wc", name = "od", descriptor = "I")
	public int anInt10503 = 0;

	@OriginalMember(owner = "client!wc", name = "Od", descriptor = "I")
	public int anInt10520 = -1;

	@OriginalMember(owner = "client!wc", name = "rd", descriptor = "Z")
	public boolean aBoolean790 = false;

	@OriginalMember(owner = "client!wc", name = "Fd", descriptor = "I")
	public int anInt10514 = 0;

	@OriginalMember(owner = "client!wc", name = "Gd", descriptor = "Z")
	public boolean aBoolean793 = false;

	@OriginalMember(owner = "client!wc", name = "Md", descriptor = "I")
	public int anInt10518 = 0;

	@OriginalMember(owner = "client!wc", name = "Xd", descriptor = "B")
	private byte aByte164 = 0;

	@OriginalMember(owner = "client!wc", name = "Qd", descriptor = "I")
	public int anInt10522 = 0;

	@OriginalMember(owner = "client!wc", name = "yd", descriptor = "I")
	public int anInt10510 = -1;

	@OriginalMember(owner = "client!wc", name = "bd", descriptor = "I")
	public int anInt10492 = -1;

	@OriginalMember(owner = "client!wc", name = "zd", descriptor = "I")
	public int anInt10511 = -1;

	@OriginalMember(owner = "client!wc", name = "ae", descriptor = "B")
	private byte aByte165 = 0;

	@OriginalMember(owner = "client!wc", name = "Hd", descriptor = "Z")
	public boolean aBoolean794 = false;

	@OriginalMember(owner = "client!wc", name = "Ud", descriptor = "Z")
	public boolean aBoolean795 = false;

	@OriginalMember(owner = "client!wc", name = "fe", descriptor = "I")
	public int anInt10531 = 255;

	@OriginalMember(owner = "client!wc", name = "ee", descriptor = "I")
	public int anInt10530 = -1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBII)V")
	public void method9101(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt10812 < 9) {
			super.anInt10812++;
		}
		for (@Pc(20) int local20 = super.anInt10812; local20 > 0; local20--) {
			super.anIntArray956[local20] = super.anIntArray956[local20 - 1];
			super.anIntArray955[local20] = super.anIntArray955[local20 - 1];
			super.aByteArray111[local20] = super.aByteArray111[local20 - 1];
		}
		super.anIntArray956[0] = arg0;
		super.aByteArray111[0] = arg1;
		super.anIntArray955[0] = arg2;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method9102(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class359 local11 = this.method9315();
		@Pc(30) Class372 local30 = super.anInt10773 != -1 && super.anInt10775 == 0 ? Static243.aClass343_3.method8356(super.anInt10773) : null;
		@Pc(51) Class372 local51 = super.anInt10749 == -1 || this.aBoolean790 || super.aBoolean820 && local30 != null ? null : Static243.aClass343_3.method8356(super.anInt10749);
		@Pc(54) int local54 = local11.anInt10005;
		@Pc(57) int local57 = local11.anInt10002;
		if (local54 != 0 || local57 != 0 || local11.anInt10006 != 0 || local11.anInt9979 != 0) {
			arg1 |= 0x7;
		}
		@Pc(85) int local85 = super.aClass282_7.method7022();
		@Pc(108) boolean local108 = super.aByte180 != 0 && Static588.anInt9467 >= super.anInt10805 && super.anInt10757 > Static588.anInt9467;
		if (local108) {
			arg1 |= 0x80000;
		}
		@Pc(152) Class95 local152 = super.aClass95Array3[0] = this.aClass30_1.method913(Static243.aClass343_3, Static282.aClass52_1, Static131.aClass66_1, super.anInt10750, Static635.aClass386_2, Static580.aClass36_2, Static170.aClass370_1, super.anInt10804, super.anInt10783, super.anInt10760, super.aClass107Array3, arg1, local30, local85, local51, arg0, super.anInt10779, super.anInt10758, super.anIntArray954);
		@Pc(157) int local157 = Static644.method8956();
		if (Static387.anInt6096 < 96 && local157 > 50) {
			Static554.method7893();
		}
		if (Static202.aClass147_5 != Static487.aClass147_8 && local157 < 50) {
			@Pc(182) int local182 = 50 - local157;
			while (local182 > Static449.anInt7431) {
				Static292.aByteArrayArray20[Static449.anInt7431] = new byte[102400];
				Static449.anInt7431++;
			}
			while (Static449.anInt7431 > local182) {
				Static449.anInt7431--;
				Static292.aByteArrayArray20[Static449.anInt7431] = null;
			}
		} else if (Static487.aClass147_8 != Static202.aClass147_5) {
			Static292.aByteArrayArray20 = new byte[50][];
			Static449.anInt7431 = 0;
		}
		if (local152 == null) {
			return false;
		}
		super.anInt10748 = local152.fa();
		super.anInt10807 = local152.ma();
		this.method9320(local152);
		if (local54 == 0 && local57 == 0) {
			this.method9305(0, this.method9314() << 9, local85, 0, this.method9314() << 9);
		} else {
			this.method9305(local11.anInt10011, local57, local85, local11.anInt9975, local54);
			if (super.anInt10782 != 0) {
				local152.FA(super.anInt10782);
			}
			if (super.anInt10759 != 0) {
				local152.VA(super.anInt10759);
			}
			if (super.anInt10778 != 0) {
				local152.H(0, super.anInt10778, 0);
			}
		}
		if (local108) {
			local152.method5662(super.aByte176, super.aByte179, super.aByte178, super.aByte180 & 0xFF);
		}
		if (!this.aBoolean790) {
			this.method9309(arg0, local11, local85, local54, local57, local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method9103() {
		@Pc(7) String local7 = "";
		if (Static239.aStringArray13 != null) {
			local7 = local7 + Static239.aStringArray13[this.aByte165];
		}
		@Pc(36) int[] local36;
		if (this.aByte164 == 1 && Static424.anIntArray609 != null) {
			local36 = Static424.anIntArray609;
		} else {
			local36 = Static277.anIntArray584;
		}
		if (local36 != null && local36[this.aByte165] != -1) {
			@Pc(57) Class330 local57 = Static249.aClass231_1.method5518(local36[this.aByte165]);
			if (local57.aChar5 == 's') {
				local7 = local7 + local57.method8024(this.aByte163 & 0xFF);
			} else {
				Static503.method7153("gdn1", new Throwable());
				local36[this.aByte165] = -1;
			}
		}
		local7 = local7 + this.aString124;
		if (Static191.aStringArray10 != null) {
			local7 = local7 + Static191.aStringArray10[this.aByte165];
		}
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		if (this.aClass30_1 == null || !this.method9102(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class239 local19 = arg0.method8447();
		@Pc(24) int local24 = super.aClass282_7.method7022();
		local19.method9233(local24);
		@Pc(42) Class164 local42 = Static15.aClass164ArrayArrayArray5[super.aByte174][super.anInt10729 >> Static391.anInt10262][super.anInt10731 >> Static391.anInt10262];
		if (local42 == null || local42.aClass28_Sub1_Sub3_1 == null) {
			super.anInt10771 = (int) ((float) super.anInt10771 - (float) super.anInt10771 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt10771 - local42.aClass28_Sub1_Sub3_1.aShort92;
			super.anInt10771 = (int) ((float) super.anInt10771 - (float) local69 / 10.0F);
		}
		local19.method9244(super.anInt10729, -super.anInt10771 + super.anInt10722 - 20, super.anInt10731);
		@Pc(96) Class28_Sub3 local96 = null;
		super.aBoolean823 = false;
		if (Static24.aClass3_Sub22_4.aClass6_Sub19_1.method6779() == 1) {
			@Pc(111) Class359 local111 = this.method9315();
			if (local111.aBoolean760 && (this.aClass30_1.anInt817 == -1 || Static580.aClass36_2.method1057(this.aClass30_1.anInt817).aBoolean634)) {
				@Pc(146) Class372 local146 = super.anInt10773 != -1 && super.anInt10775 == 0 ? Static243.aClass343_3.method8356(super.anInt10773) : null;
				@Pc(167) Class372 local167 = super.anInt10749 == -1 || this.aBoolean790 || super.aBoolean820 && local146 != null ? null : Static243.aClass343_3.method8356(super.anInt10749);
				@Pc(199) Class95 local199 = Static292.method4565(local24, super.anInt10782, super.aClass95Array3[0], super.anInt10778, local167 == null ? local146 : local167, 0, local167 == null ? super.anInt10750 : super.anInt10760, arg0, 160, super.anInt10759, 0, 240, 1);
				if (local199 != null) {
					local96 = Static4.method120(true, super.aClass95Array3.length + 1);
					super.aBoolean823 = true;
					arg0.C(false);
					if (Static443.aBoolean515) {
						local199.method5659(local19, local96.aClass28_Sub8Array1[super.aClass95Array3.length], Static675.anInt10880, 0);
					} else {
						local199.method5653(local19, local96.aClass28_Sub8Array1[super.aClass95Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(252) int local252;
		if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == this) {
			for (local252 = Static292.aClass142Array1.length - 1; local252 >= 0; local252--) {
				@Pc(258) Class142 local258 = Static292.aClass142Array1[local252];
				if (local258 != null && local258.anInt4298 != -1) {
					@Pc(292) int local292;
					if (local258.anInt4300 == 1) {
						@Pc(280) Class3_Sub3 local280 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local258.anInt4302);
						if (local280 != null) {
							@Pc(285) Class28_Sub1_Sub1_Sub1_Sub2 local285 = local280.aClass28_Sub1_Sub1_Sub1_Sub2_1;
							local292 = local285.anInt10729 - Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729;
							@Pc(299) int local299 = local285.anInt10731 - Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731;
							if (Static443.aBoolean515) {
								this.method9111(local299, arg0, local19, 92160000, local258.anInt4298, Static675.anInt10880, super.aClass95Array3[0], local292);
							} else {
								this.method9106(super.aClass95Array3[0], arg0, local19, local299, local258.anInt4298, local292, 92160000);
							}
						}
					}
					@Pc(350) int local350;
					if (local258.anInt4300 == 2) {
						@Pc(343) int local343 = local258.anInt4304 - Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729;
						local350 = local258.anInt4299 - Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731;
						local292 = local258.anInt4296 << 9;
						local292 *= local292;
						if (Static443.aBoolean515) {
							this.method9111(local350, arg0, local19, local292, local258.anInt4298, Static675.anInt10880, super.aClass95Array3[0], local343);
						} else {
							this.method9106(super.aClass95Array3[0], arg0, local19, local350, local258.anInt4298, local343, local292);
						}
					}
					if (local258.anInt4300 == 10 && local258.anInt4302 >= 0 && Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1.length > local258.anInt4302) {
						@Pc(415) Class28_Sub1_Sub1_Sub1_Sub1 local415 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local258.anInt4302];
						if (local415 != null) {
							local350 = local415.anInt10729 - Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729;
							local292 = local415.anInt10731 - Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731;
							if (Static443.aBoolean515) {
								this.method9111(local292, arg0, local19, 92160000, local258.anInt4298, Static675.anInt10880, super.aClass95Array3[0], local350);
							} else {
								this.method9106(super.aClass95Array3[0], arg0, local19, local292, local258.anInt4298, local350, 92160000);
							}
						}
					}
				}
			}
			local19.method9233(local24);
			local19.method9244(super.anInt10729, super.anInt10722, super.anInt10731);
		}
		local19.method9233(local24);
		local19.method9244(super.anInt10729, super.anInt10722 - super.anInt10771 - 5, super.anInt10731);
		if (local96 == null) {
			local96 = Static4.method120(true, super.aClass95Array3.length);
		}
		this.method9317(super.aClass95Array3, arg0, local19, false);
		if (Static443.aBoolean515) {
			for (local252 = 0; super.aClass95Array3.length > local252; local252++) {
				if (super.aClass95Array3[local252] != null) {
					super.aClass95Array3[local252].method5659(local19, local96.aClass28_Sub8Array1[local252], Static675.anInt10880, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local252 = 0; local252 < super.aClass95Array3.length; local252++) {
				if (super.aClass95Array3[local252] != null) {
					super.aClass95Array3[local252].method5653(local19, local96.aClass28_Sub8Array1[local252], Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass28_Sub7_8 != null) {
			@Pc(588) Class84 local588 = super.aClass28_Sub7_8.method7917();
			if (Static443.aBoolean515) {
				arg0.method8506(local588, Static675.anInt10880);
			} else {
				arg0.method8499(local588);
			}
		}
		for (local252 = 0; local252 < super.aClass95Array3.length; local252++) {
			if (super.aClass95Array3[local252] != null) {
				super.aBoolean823 |= super.aClass95Array3[local252].F();
			}
			super.aClass95Array3[local252] = null;
		}
		super.anInt10777 = Static58.anInt1217;
		return local96;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!jp;Z)V")
	public void method9104(@OriginalArg(0) Class3_Sub25 arg0) {
		arg0.anInt9765 = 0;
		@Pc(12) int local12 = arg0.method8632();
		this.aByte164 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean794;
		this.aBoolean794 = (local12 & 0x2) != 0;
		@Pc(38) boolean local38 = (local12 & 0x4) != 0;
		@Pc(42) int local42 = super.method9314();
		this.method9322((local12 >> 3 & 0x7) + 1);
		this.aByte165 = (byte) (local12 >> 6 & 0x3);
		super.anInt10729 += this.method9314() - local42 << 8;
		super.anInt10731 += this.method9314() - local42 << 8;
		this.aByte163 = arg0.method8621();
		this.anInt10502 = arg0.method8621();
		this.anInt10499 = arg0.method8621();
		this.aBoolean791 = arg0.method8621() == 1;
		if (Static487.aClass147_8 == Static202.aClass147_5 && Static24.anInt545 >= 2) {
			this.aBoolean791 = false;
		}
		this.anInt10518 = 0;
		@Pc(123) int local123 = -1;
		@Pc(128) int[] local128 = new int[Static449.aClass72_2.anIntArray150.length];
		@Pc(133) Class7[] local133 = new Class7[Static449.aClass72_2.anIntArray150.length];
		@Pc(138) Class374[] local138 = new Class374[Static449.aClass72_2.anIntArray150.length];
		@Pc(152) int local152;
		@Pc(164) int local164;
		@Pc(170) int local170;
		@Pc(216) int local216;
		for (@Pc(140) int local140 = 0; local140 < Static449.aClass72_2.anIntArray150.length; local140++) {
			if (Static449.aClass72_2.anIntArray150[local140] != 1) {
				local152 = arg0.method8632();
				if (local152 == 0) {
					local128[local140] = 0;
				} else {
					local164 = arg0.method8632();
					local170 = local164 + (local152 << 8);
					if (local140 == 0 && local170 == 65535) {
						local123 = arg0.method8593();
						this.anInt10518 = arg0.method8632();
						break;
					}
					if (local170 >= 32768) {
						local170 = Static32.anIntArray50[local170 - 32768];
						local128[local140] = local170 | 0x40000000;
						local138[local140] = Static170.aClass370_1.method8900(local170);
						local216 = local138[local140].anInt10331;
						if (local216 != 0) {
							this.anInt10518 = local216;
						}
					} else {
						local128[local140] = Integer.MIN_VALUE | local170 - 256;
					}
				}
			}
		}
		if (local123 == -1) {
			local152 = arg0.method8593();
			local164 = 0;
			for (local170 = 0; local170 < Static449.aClass72_2.anIntArray150.length; local170++) {
				if (Static449.aClass72_2.anIntArray150[local170] == 0) {
					if ((0x1 << local164 & local152) != 0) {
						local133[local170] = Static494.method7102(local138[local170], arg0);
					}
					local164++;
				}
			}
		}
		@Pc(284) int[] local284 = new int[5];
		for (local164 = 0; local164 < 5; local164++) {
			local170 = arg0.method8632();
			if (Static58.aShortArrayArrayArray1.length < 1 || local170 < 0 || local170 >= Static58.aShortArrayArrayArray1[0][local164].length) {
				local170 = 0;
			}
			local284[local164] = local170;
		}
		this.anInt10516 = arg0.method8593();
		this.aString124 = arg0.method8613();
		if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == this) {
			Static636.aString120 = this.aString124;
		}
		this.aString123 = this.aString124;
		this.anInt10514 = arg0.method8632();
		if (local38) {
			this.anInt10503 = arg0.method8593();
			this.anInt10500 = this.anInt10514;
			if (this.anInt10503 == 65535) {
				this.anInt10503 = -1;
			}
			this.anInt10510 = -1;
		} else {
			this.anInt10503 = 0;
			this.anInt10500 = arg0.method8632();
			this.anInt10510 = arg0.method8632();
			if (this.anInt10510 == 255) {
				this.anInt10510 = -1;
			}
		}
		local170 = this.anInt10522;
		this.anInt10522 = arg0.method8632();
		@Pc(420) int local420;
		if (this.anInt10522 == 0) {
			Static189.method5097(this);
		} else {
			local216 = this.anInt10492;
			@Pc(417) int local417 = this.anInt10530;
			local420 = this.anInt10496;
			@Pc(423) int local423 = this.anInt10511;
			@Pc(426) int local426 = this.anInt10531;
			this.anInt10492 = arg0.method8593();
			this.anInt10530 = arg0.method8593();
			this.anInt10496 = arg0.method8593();
			this.anInt10511 = arg0.method8593();
			this.anInt10531 = arg0.method8632();
			if (local21 != this.aBoolean794 || local170 != this.anInt10522 || this.anInt10492 != local216 || this.anInt10530 != local417 || this.anInt10496 != local420 || this.anInt10511 != local423 || this.anInt10531 != local426) {
				Static363.method5314(this);
			}
		}
		if (this.aClass30_1 == null) {
			this.aClass30_1 = new Class30();
		}
		local216 = this.aClass30_1.anInt817;
		@Pc(510) int[] local510 = this.aClass30_1.anIntArray69;
		this.aClass30_1.method906(this.aByte164 == 1, local123, this.method9323(), local128, local284, local133);
		if (local123 != local216) {
			super.anInt10729 = (super.anIntArray956[0] << 9) + (this.method9314() << 8);
			super.anInt10731 = (super.anIntArray955[0] << 9) + (this.method9314() << 8);
		}
		if (Static106.anInt2205 == super.anInt10762 && local510 != null) {
			for (local420 = 0; local420 < local284.length; local420++) {
				if (local510[local420] != local284[local420]) {
					Static170.aClass370_1.method8902();
					break;
				}
			}
		}
		if (super.aClass28_Sub7_8 != null) {
			super.aClass28_Sub7_8.method7908();
		}
		if (super.anInt10749 == -1 || !super.aBoolean820) {
			return;
		}
		@Pc(618) Class359 local618 = this.method9315();
		if (!local618.method8762(super.anInt10749)) {
			super.aBoolean820 = false;
			super.anInt10749 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)I")
	@Override
	protected int method9323() {
		return this.anInt10516;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
		if (this.aClass30_1 == null || !super.aBoolean822 && !this.method9102(arg0, 0)) {
			return;
		}
		@Pc(22) Class239 local22 = arg0.method8447();
		local22.method9233(super.aClass282_7.method7022());
		local22.method9244(super.anInt10729, super.anInt10722 - 5, super.anInt10731);
		this.method9317(super.aClass95Array3, arg0, local22, super.aBoolean822);
		for (@Pc(55) int local55 = 0; local55 < super.aClass95Array3.length; local55++) {
			super.aClass95Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ka;Lclient!ha;Lclient!uu;BIIII)V")
	private void method9106(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg5 * arg5 + arg3 * arg3;
		if (local12 < 262144 || local12 > arg6) {
			return;
		}
		@Pc(46) int local46 = (int) (Math.atan2((double) arg5, (double) arg3) * 2607.5945876176133D - (double) super.aClass282_7.method7022()) & 0x3FFF;
		@Pc(58) Class95 local58 = Static143.method2627(super.anInt10778, super.anInt10782, super.anInt10759, arg4, local46, arg1);
		if (local58 != null) {
			arg1.C(false);
			local58.method5653(arg2, (Class28_Sub8) null, 0);
			arg1.C(true);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIB)V")
	public void method9107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt10773 != -1 && Static243.aClass343_3.method8356(super.anInt10773).anInt10260 == 1) {
			super.anInt10773 = -1;
			super.lb = null;
		}
		for (@Pc(30) int local30 = 0; local30 < super.aClass280Array3.length; local30++) {
			if (super.aClass280Array3[local30].anInt7952 != -1) {
				@Pc(49) Class144 local49 = Static354.aClass236_2.method5615(super.aClass280Array3[local30].anInt7952);
				if (local49.aBoolean324 && local49.anInt4332 != -1 && Static243.aClass343_3.method8356(local49.anInt4332).anInt10260 == 1) {
					super.aClass280Array3[local30].anInt7952 = -1;
				}
			}
		}
		this.anInt10520 = -1;
		if (arg0 < 0 || arg0 >= Static158.anInt927 || arg1 < 0 || Static515.anInt8292 <= arg1) {
			this.method9113(arg0, arg1);
		} else if (super.anIntArray956[0] >= 0 && Static158.anInt927 > super.anIntArray956[0] && super.anIntArray955[0] >= 0 && Static515.anInt8292 > super.anIntArray955[0]) {
			if (arg2 == 2) {
				Static364.method5316(this, arg1, arg0);
			}
			this.method9101(arg0, arg2, arg1);
		} else {
			this.method9113(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Z")
	public boolean method9108() {
		return this.aClass30_1 != null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method9110() {
		return this.aString123;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!ha;Lclient!uu;IIILclient!ka;I)V")
	private void method9111(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class239 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class95 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg7 * arg7;
		if (local11 < 262144 || arg3 < local11) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg7, (double) arg0) * 2607.5945876176133D - (double) super.aClass282_7.method7022()) & 0x3FFF;
		@Pc(51) Class95 local51 = Static143.method2627(super.anInt10778, super.anInt10782, super.anInt10759, arg4, local39, arg1);
		if (local51 != null) {
			arg1.C(false);
			local51.method5659(arg2, (Class28_Sub8) null, arg5, 0);
			arg1.C(true);
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)I")
	@Override
	public int method9318() {
		return -1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZ)V")
	public void method9113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt10814 = 0;
		super.anIntArray956[0] = arg0;
		super.anInt10812 = 0;
		super.anInt10811 = 0;
		super.anIntArray955[0] = arg1;
		@Pc(30) int local30 = this.method9314();
		super.anInt10731 = local30 * 256 + super.anIntArray955[0] * 512;
		super.anInt10729 = local30 * 256 + super.anIntArray956[0] * 512;
		if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == this) {
			Static225.method3837();
		}
		if (super.aClass28_Sub7_8 != null) {
			super.aClass28_Sub7_8.method7908();
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	@Override
	public int method9314() {
		return this.aClass30_1 == null || this.aClass30_1.anInt817 == -1 ? super.method9314() : Static580.aClass36_2.method1057(this.aClass30_1.anInt817).anInt8313;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		if (this.aClass30_1 == null || !this.method9102(arg2, 131072)) {
			return false;
		}
		@Pc(26) Class239 local26 = arg2.method8447();
		@Pc(31) int local31 = super.aClass282_7.method7022();
		local26.method9233(local31);
		local26.method9244(super.anInt10729, super.anInt10722, super.anInt10731);
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; super.aClass95Array3.length > local46; local46++) {
			if (super.aClass95Array3[local46] != null && (Static443.aBoolean515 ? super.aClass95Array3[local46].method5650(arg1, arg0, local26, true, 0, Static675.anInt10880) : super.aClass95Array3[local46].method5658(arg1, arg0, local26, true, 0))) {
				local44 = true;
				break;
			}
		}
		super.aClass95Array3[0] = super.aClass95Array3[1] = super.aClass95Array3[2] = null;
		return local44;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		throw new IllegalStateException();
	}
}
