import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class34_Sub1_Sub1_Sub2_Sub1 extends Class34_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!cm", name = "Uc", descriptor = "I")
	public int anInt1788;

	@OriginalMember(owner = "client!cm", name = "Wc", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!cm", name = "Xc", descriptor = "Lclient!vp;")
	public Class376 aClass376_1;

	@OriginalMember(owner = "client!cm", name = "dd", descriptor = "I")
	private int anInt1793;

	@OriginalMember(owner = "client!cm", name = "jd", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!cm", name = "sd", descriptor = "I")
	public int anInt1804;

	@OriginalMember(owner = "client!cm", name = "bd", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!cm", name = "qd", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!cm", name = "kd", descriptor = "I")
	public int anInt1799 = -1;

	@OriginalMember(owner = "client!cm", name = "Vc", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!cm", name = "ad", descriptor = "I")
	public int anInt1791 = 0;

	@OriginalMember(owner = "client!cm", name = "od", descriptor = "I")
	public int anInt1802 = 255;

	@OriginalMember(owner = "client!cm", name = "ud", descriptor = "B")
	private byte aByte36 = 0;

	@OriginalMember(owner = "client!cm", name = "gd", descriptor = "I")
	public int anInt1796 = -1;

	@OriginalMember(owner = "client!cm", name = "cd", descriptor = "I")
	public int anInt1792 = -1;

	@OriginalMember(owner = "client!cm", name = "Tc", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!cm", name = "zd", descriptor = "I")
	public int anInt1810 = 0;

	@OriginalMember(owner = "client!cm", name = "Sc", descriptor = "I")
	public int anInt1787 = 0;

	@OriginalMember(owner = "client!cm", name = "md", descriptor = "B")
	private byte aByte35 = 0;

	@OriginalMember(owner = "client!cm", name = "Rc", descriptor = "I")
	public int anInt1786 = -1;

	@OriginalMember(owner = "client!cm", name = "Ad", descriptor = "I")
	public int anInt1811 = 0;

	@OriginalMember(owner = "client!cm", name = "Yc", descriptor = "I")
	public int anInt1789 = 0;

	@OriginalMember(owner = "client!cm", name = "td", descriptor = "I")
	public int anInt1805 = -1;

	@OriginalMember(owner = "client!cm", name = "vd", descriptor = "I")
	public int anInt1806 = -1;

	@OriginalMember(owner = "client!cm", name = "Hd", descriptor = "I")
	public int anInt1818 = -1;

	@OriginalMember(owner = "client!cm", name = "pd", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!cm", name = "Md", descriptor = "B")
	private byte aByte37 = 0;

	@OriginalMember(owner = "client!cm", name = "Nd", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!cm", name = "Id", descriptor = "I")
	public int anInt1819 = -1;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIII)V")
	public void method1480(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt9703 < 9) {
			super.anInt9703++;
		}
		for (@Pc(18) int local18 = super.anInt9703; local18 > 0; local18--) {
			super.anIntArray529[local18] = super.anIntArray529[local18 - 1];
			super.anIntArray528[local18] = super.anIntArray528[local18 - 1];
			super.aByteArray89[local18] = super.aByteArray89[local18 - 1];
		}
		super.anIntArray529[0] = arg1;
		super.anIntArray528[0] = arg2;
		super.aByteArray89[0] = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "(I)I")
	@Override
	protected int method7874() {
		return this.anInt1793;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZLclient!dt;)V")
	public void method1481(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.anInt9739 = 0;
		@Pc(12) int local12 = arg0.method7954();
		this.aByte36 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean141;
		this.aBoolean141 = (local12 & 0x2) != 0;
		@Pc(38) boolean local38 = (local12 & 0x4) != 0;
		@Pc(42) int local42 = super.method7866();
		this.method7862((local12 >> 3 & 0x7) + 1);
		this.aByte35 = (byte) (local12 >> 6 & 0x3);
		super.anInt9614 += this.method7866() - local42 << 8;
		super.anInt9619 += this.method7866() - local42 << 8;
		this.aByte37 = arg0.method7960();
		this.anInt1796 = arg0.method7960();
		this.anInt1786 = arg0.method7960();
		this.aBoolean145 = arg0.method7960() == 1;
		if (Static256.aClass135_4 == Static228.aClass135_3 && Static512.anInt8070 >= 2) {
			this.aBoolean145 = false;
		}
		@Pc(128) int local128 = -1;
		this.anInt1810 = 0;
		@Pc(136) int[] local136 = new int[Static111.aClass279_1.anIntArray398.length];
		@Pc(141) Class99[] local141 = new Class99[Static111.aClass279_1.anIntArray398.length];
		@Pc(146) Class15[] local146 = new Class15[Static111.aClass279_1.anIntArray398.length];
		@Pc(162) int local162;
		@Pc(174) int local174;
		@Pc(180) int local180;
		@Pc(225) int local225;
		for (@Pc(148) int local148 = 0; local148 < Static111.aClass279_1.anIntArray398.length; local148++) {
			if (Static111.aClass279_1.anIntArray398[local148] != 1) {
				local162 = arg0.method7954();
				if (local162 == 0) {
					local136[local148] = 0;
				} else {
					local174 = arg0.method7954();
					local180 = (local162 << 8) + local174;
					if (local148 == 0 && local180 == 65535) {
						local128 = arg0.method7951();
						this.anInt1810 = arg0.method7954();
						break;
					}
					if (local180 >= 32768) {
						local180 = Static138.anIntArray145[local180 - 32768];
						local136[local148] = local180 | 0x40000000;
						local146[local148] = Static117.aClass197_2.method4518(local180);
						local225 = local146[local148].anInt427;
						if (local225 != 0) {
							this.anInt1810 = local225;
						}
					} else {
						local136[local148] = Integer.MIN_VALUE | local180 - 256;
					}
				}
			}
		}
		if (local128 == -1) {
			local162 = arg0.method7951();
			local174 = 0;
			for (local180 = 0; local180 < Static111.aClass279_1.anIntArray398.length; local180++) {
				if (Static111.aClass279_1.anIntArray398[local180] == 0) {
					if ((local162 & 0x1 << local174) != 0) {
						local141[local180] = Static237.method3583(arg0, local146[local180]);
					}
					local174++;
				}
			}
		}
		@Pc(289) int[] local289 = new int[5];
		for (local174 = 0; local174 < 5; local174++) {
			local180 = arg0.method7954();
			if (Static332.aShortArrayArrayArray2.length < 1 || local180 < 0 || Static332.aShortArrayArrayArray2[0][local174].length <= local180) {
				local180 = 0;
			}
			local289[local174] = local180;
		}
		this.anInt1793 = arg0.method7951();
		this.aString24 = arg0.method7922();
		this.aString25 = this.aString24;
		if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 == this) {
			Static168.aString44 = this.aString24;
		}
		this.anInt1791 = arg0.method7954();
		if (local38) {
			this.anInt1789 = arg0.method7951();
			this.anInt1805 = -1;
			this.anInt1811 = this.anInt1791;
			if (this.anInt1789 == 65535) {
				this.anInt1789 = -1;
			}
		} else {
			this.anInt1789 = 0;
			this.anInt1811 = arg0.method7954();
			this.anInt1805 = arg0.method7954();
			if (this.anInt1805 == 255) {
				this.anInt1805 = -1;
			}
		}
		local180 = this.anInt1787;
		this.anInt1787 = arg0.method7954();
		@Pc(423) int local423;
		if (this.anInt1787 == 0) {
			Static78.method1308(this);
		} else {
			local225 = this.anInt1819;
			@Pc(420) int local420 = this.anInt1792;
			local423 = this.anInt1818;
			@Pc(426) int local426 = this.anInt1806;
			@Pc(429) int local429 = this.anInt1802;
			this.anInt1819 = arg0.method7951();
			this.anInt1792 = arg0.method7951();
			this.anInt1818 = arg0.method7951();
			this.anInt1806 = arg0.method7951();
			this.anInt1802 = arg0.method7954();
			if (local21 != this.aBoolean141 || local180 != this.anInt1787 || local225 != this.anInt1819 || local420 != this.anInt1792 || this.anInt1818 != local423 || local426 != this.anInt1806 || this.anInt1802 != local429) {
				Static547.method7016(this);
			}
		}
		if (this.aClass376_1 == null) {
			this.aClass376_1 = new Class376();
		}
		local225 = this.aClass376_1.anInt10600;
		@Pc(530) int[] local530 = this.aClass376_1.anIntArray573;
		this.aClass376_1.method8680(this.aByte36 == 1, local128, local136, local289, local141, this.method7874());
		if (local128 != local225) {
			super.anInt9614 = (super.anIntArray529[0] << 9) + (this.method7866() << 8);
			super.anInt9619 = (super.anIntArray528[0] << 9) + (this.method7866() << 8);
		}
		if (Static291.anInt4955 == super.anInt9671 && local530 != null) {
			for (local423 = 0; local423 < local289.length; local423++) {
				if (local530[local423] != local289[local423]) {
					Static117.aClass197_2.method4528();
					break;
				}
			}
		}
		if (super.aClass34_Sub7_8 != null) {
			super.aClass34_Sub7_8.method5089();
		}
		if (super.anInt9647 == -1 || !super.aBoolean673) {
			return;
		}
		@Pc(643) Class286 local643 = this.method7878();
		if (!local643.method6292(super.anInt9647)) {
			super.aBoolean673 = false;
			super.anInt9647 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method1482() {
		@Pc(12) String local12 = "";
		if (Static439.aStringArray53 != null) {
			local12 = local12 + Static439.aStringArray53[this.aByte35];
		}
		@Pc(36) int[] local36;
		if (this.aByte36 == 1 && Static464.anIntArray402 != null) {
			local36 = Static464.anIntArray402;
		} else {
			local36 = Static398.anIntArray346;
		}
		if (local36 != null && local36[this.aByte35] != -1) {
			@Pc(58) Class25 local58 = Static597.aClass311_1.method6836(local36[this.aByte35]);
			if (local58.aChar1 == 's') {
				local12 = local12 + local58.method728(this.aByte37 & 0xFF);
			} else {
				Static456.method6140("gdn1", new Throwable());
				local36[this.aByte35] = -1;
			}
		}
		local12 = local12 + this.aString24;
		if (Static381.aStringArray44 != null) {
			local12 = local12 + Static381.aStringArray44[this.aByte35];
		}
		return local12;
	}

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLclient!ha;I)Z")
	private boolean method1484(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1;
		@Pc(19) Class286 local19 = this.method7878();
		@Pc(34) Class239 local34 = super.anInt9664 != -1 && super.anInt9698 == 0 ? Static13.aClass213_1.method5008(super.anInt9664) : null;
		@Pc(55) Class239 local55 = super.anInt9647 == -1 || this.aBoolean142 || super.aBoolean673 && local34 != null ? null : Static13.aClass213_1.method5008(super.anInt9647);
		@Pc(58) int local58 = local19.anInt7532;
		@Pc(61) int local61 = local19.anInt7534;
		if (local58 != 0 || local61 != 0 || local19.anInt7540 != 0 || local19.anInt7548 != 0) {
			arg1 |= 0x7;
		}
		@Pc(86) int local86 = super.aClass292_7.method6390();
		@Pc(101) boolean local101 = super.aByte138 != 0 && Static122.anInt2190 >= super.anInt9700 && Static122.anInt2190 < super.anInt9657;
		if (local101) {
			arg1 |= 0x80000;
		}
		@Pc(145) Class149 local145 = super.aClass149Array3[0] = this.aClass376_1.method8678(super.anInt9653, Static461.aClass223_42, local34, local55, local86, super.anInt9697, super.anInt9648, Static117.aClass197_2, Static267.aClass196_1, super.anInt9678, super.anInt9680, super.anInt9674, Static210.aClass262_1, Static13.aClass213_1, super.aClass158Array3, super.anIntArray522, Static538.aClass114_2, arg1, arg0);
		@Pc(148) int local148 = Static406.method5601();
		if (Static525.anInt8303 < 96 && local148 > 50) {
			Static242.method5989();
		}
		if (Static228.aClass135_3 != Static256.aClass135_4 && local148 < 50) {
			@Pc(169) int local169 = 50 - local148;
			while (Static528.anInt8312 < local169) {
				Static545.aByteArrayArray24[Static528.anInt8312] = new byte[102400];
				Static528.anInt8312++;
			}
			while (Static528.anInt8312 > local169) {
				Static528.anInt8312--;
				Static545.aByteArrayArray24[Static528.anInt8312] = null;
			}
		} else if (Static256.aClass135_4 != Static228.aClass135_3) {
			Static528.anInt8312 = 0;
			Static545.aByteArrayArray24 = new byte[50][];
		}
		if (local145 == null) {
			return false;
		}
		super.anInt9655 = local145.fa();
		super.anInt9693 = local145.ma();
		this.method7865(local145);
		if (local58 == 0 && local61 == 0) {
			this.method7858(0, this.method7866() << 9, local86, 0, this.method7866() << 9);
		} else {
			this.method7858(local19.anInt7528, local61, local86, local19.anInt7537, local58);
			if (super.anInt9699 != 0) {
				local145.FA(super.anInt9699);
			}
			if (super.anInt9660 != 0) {
				local145.VA(super.anInt9660);
			}
			if (super.anInt9665 != 0) {
				local145.H(0, super.anInt9665, 0);
			}
		}
		if (local101) {
			local145.method8851(super.aByte137, super.aByte135, super.aByte136, super.aByte138 & 0xFF);
		}
		if (!this.aBoolean142) {
			this.method7863(local15, local86, local19, local61, local58, arg0);
		}
		return true;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass376_1 == null || !this.method1484(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class17 local19 = arg1.method8013();
		@Pc(24) int local24 = super.aClass292_7.method6390();
		local19.method6227(local24);
		local19.method6235(super.anInt9614, super.anInt9622, super.anInt9619);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass149Array3.length; local44++) {
			if (super.aClass149Array3[local44] != null && (Static375.aBoolean532 ? super.aClass149Array3[local44].method8862(arg0, arg2, local19, true, 0, Static501.anInt7929) : super.aClass149Array3[local44].method8866(arg0, arg2, local19, true, 0))) {
				local42 = true;
				break;
			}
		}
		super.aClass149Array3[0] = super.aClass149Array3[1] = super.aClass149Array3[2] = null;
		return local42;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		if (this.aClass376_1 == null || !this.method1484(arg0, 2048)) {
			return null;
		}
		@Pc(27) Class17 local27 = arg0.method8013();
		@Pc(32) int local32 = super.aClass292_7.method6390();
		local27.method6227(local32);
		@Pc(50) Class368 local50 = Static254.aClass368ArrayArrayArray2[super.aByte132][super.anInt9614 >> Static571.anInt9216][super.anInt9619 >> Static571.anInt9216];
		if (local50 == null || local50.aClass34_Sub1_Sub2_1 == null) {
			super.anInt9669 = (int) ((float) super.anInt9669 - (float) super.anInt9669 / 10.0F);
		} else {
			@Pc(63) int local63 = super.anInt9669 - local50.aClass34_Sub1_Sub2_1.aShort49;
			super.anInt9669 = (int) ((float) super.anInt9669 - (float) local63 / 10.0F);
		}
		local27.method6235(super.anInt9614, -super.anInt9669 + super.anInt9622 - 20, super.anInt9619);
		@Pc(104) Class34_Sub8 local104 = null;
		super.aBoolean677 = false;
		if (Static336.aClass3_Sub41_18.aClass14_Sub20_1.method6068() == 1) {
			@Pc(119) Class286 local119 = this.method7878();
			if (local119.aBoolean533 && (this.aClass376_1.anInt10600 == -1 || Static267.aClass196_1.method4478(this.aClass376_1.anInt10600).aBoolean484)) {
				@Pc(156) Class239 local156 = super.anInt9664 != -1 && super.anInt9698 == 0 ? Static13.aClass213_1.method5008(super.anInt9664) : null;
				@Pc(176) Class239 local176 = super.anInt9647 == -1 || this.aBoolean142 || super.aBoolean673 && local156 != null ? null : Static13.aClass213_1.method5008(super.anInt9647);
				@Pc(210) Class149 local210 = Static116.method1793(local32, arg0, local176 == null ? local156 : local176, 1, 240, 160, super.anInt9660, super.anInt9665, super.aClass149Array3[0], 0, super.anInt9699, local176 == null ? super.anInt9674 : super.anInt9648, 0);
				if (local210 != null) {
					local104 = Static327.method4658(super.aClass149Array3.length + 1, true);
					super.aBoolean677 = true;
					arg0.C(false);
					if (Static375.aBoolean532) {
						local210.method8869(local27, local104.aClass34_Sub6Array1[super.aClass149Array3.length], Static501.anInt7929, 0);
					} else {
						local210.method8857(local27, local104.aClass34_Sub6Array1[super.aClass149Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(263) int local263;
		if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 == this) {
			for (local263 = Static171.aClass252Array1.length - 1; local263 >= 0; local263--) {
				@Pc(269) Class252 local269 = Static171.aClass252Array1[local263];
				if (local269 != null && local269.anInt6680 != -1) {
					@Pc(304) int local304;
					if (local269.anInt6681 == 1) {
						@Pc(292) Class3_Sub52 local292 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local269.anInt6678);
						if (local292 != null) {
							@Pc(297) Class34_Sub1_Sub1_Sub2_Sub2 local297 = local292.aClass34_Sub1_Sub1_Sub2_Sub2_2;
							local304 = local297.anInt9614 - Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614;
							@Pc(311) int local311 = local297.anInt9619 - Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619;
							if (Static375.aBoolean532) {
								this.method1488(92160000, Static501.anInt7929, super.aClass149Array3[0], local27, arg0, local269.anInt6680, local311, local304);
							} else {
								this.method1487(local27, local304, 92160000, local311, local269.anInt6680, arg0, super.aClass149Array3[0]);
							}
						}
					}
					@Pc(363) int local363;
					if (local269.anInt6681 == 2) {
						@Pc(356) int local356 = local269.anInt6674 - Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614;
						local363 = local269.anInt6676 - Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619;
						local304 = local269.anInt6677 << 9;
						local304 *= local304;
						if (Static375.aBoolean532) {
							this.method1488(local304, Static501.anInt7929, super.aClass149Array3[0], local27, arg0, local269.anInt6680, local363, local356);
						} else {
							this.method1487(local27, local356, local304, local363, local269.anInt6680, arg0, super.aClass149Array3[0]);
						}
					}
					if (local269.anInt6681 == 10 && local269.anInt6678 >= 0 && local269.anInt6678 < Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1.length) {
						@Pc(426) Class34_Sub1_Sub1_Sub2_Sub1 local426 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local269.anInt6678];
						if (local426 != null) {
							local363 = local426.anInt9614 - Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614;
							local304 = local426.anInt9619 - Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619;
							if (Static375.aBoolean532) {
								this.method1488(92160000, Static501.anInt7929, super.aClass149Array3[0], local27, arg0, local269.anInt6680, local304, local363);
							} else {
								this.method1487(local27, local363, 92160000, local304, local269.anInt6680, arg0, super.aClass149Array3[0]);
							}
						}
					}
				}
			}
			local27.method6227(local32);
			local27.method6235(super.anInt9614, super.anInt9622, super.anInt9619);
		}
		local27.method6227(local32);
		local27.method6235(super.anInt9614, -super.anInt9669 + super.anInt9622 - 5, super.anInt9619);
		if (local104 == null) {
			local104 = Static327.method4658(super.aClass149Array3.length, true);
		}
		this.method7870(local27, false, super.aClass149Array3, arg0);
		if (Static375.aBoolean532) {
			for (local263 = 0; local263 < super.aClass149Array3.length; local263++) {
				if (super.aClass149Array3[local263] != null) {
					super.aClass149Array3[local263].method8869(local27, local104.aClass34_Sub6Array1[local263], Static501.anInt7929, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local263 = 0; super.aClass149Array3.length > local263; local263++) {
				if (super.aClass149Array3[local263] != null) {
					super.aClass149Array3[local263].method8857(local27, local104.aClass34_Sub6Array1[local263], Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass34_Sub7_8 != null) {
			@Pc(601) Class347 local601 = super.aClass34_Sub7_8.method5100();
			if (Static375.aBoolean532) {
				arg0.method8051(local601, Static501.anInt7929);
			} else {
				arg0.method8057(local601);
			}
		}
		for (local263 = 0; super.aClass149Array3.length > local263; local263++) {
			if (super.aClass149Array3[local263] != null) {
				super.aBoolean677 |= super.aClass149Array3[local263].F();
			}
			super.aClass149Array3[local263] = null;
		}
		super.anInt9644 = Static494.anInt7829;
		return local104;
	}

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
		if (this.aClass376_1 == null || !super.aBoolean678 && !this.method1484(arg0, 0)) {
			return;
		}
		@Pc(29) Class17 local29 = arg0.method8013();
		local29.method6227(super.aClass292_7.method6390());
		local29.method6235(super.anInt9614, super.anInt9622 - 5, super.anInt9619);
		this.method7870(local29, super.aBoolean678, super.aClass149Array3, arg0);
		for (@Pc(56) int local56 = 0; local56 < super.aClass149Array3.length; local56++) {
			super.aClass149Array3[local56] = null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method1485() {
		return this.aString25;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I")
	@Override
	public int method7871() {
		return -1;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return false;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!al;IIIIILclient!ha;Lclient!ka;)V")
	private void method1487(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class95 arg5, @OriginalArg(7) Class149 arg6) {
		@Pc(12) int local12 = arg1 * arg1 + arg3 * arg3;
		if (local12 < 262144 || local12 > arg2) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg1, (double) arg3) * 2607.5945876176133D - (double) super.aClass292_7.method6390()) & 0x3FFF;
		@Pc(54) Class149 local54 = Static460.method6183(arg4, arg5, super.anInt9699, local42, super.anInt9665, super.anInt9660);
		if (local54 != null) {
			arg5.C(false);
			local54.method8857(arg0, (Class34_Sub6) null, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILclient!ka;Lclient!al;Lclient!ha;IIII)V")
	private void method1488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) Class95 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg7 * arg7 + arg6 * arg6;
		if (local16 < 262144 || local16 > arg0) {
			return;
		}
		@Pc(44) int local44 = (int) (Math.atan2((double) arg7, (double) arg6) * 2607.5945876176133D - (double) super.aClass292_7.method6390()) & 0x3FFF;
		@Pc(56) Class149 local56 = Static460.method6183(arg5, arg4, super.anInt9699, local44, super.anInt9665, super.anInt9660);
		if (local56 != null) {
			arg4.C(false);
			local56.method8869(arg3, (Class34_Sub6) null, arg1, 0);
			arg4.C(true);
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	@Override
	public int method7866() {
		return this.aClass376_1 == null || this.aClass376_1.anInt10600 == -1 ? super.method7866() : Static267.aClass196_1.method4478(this.aClass376_1.anInt10600).anInt6807;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IBI)V")
	public void method1489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt9704 = 0;
		super.anInt9705 = 0;
		super.anInt9703 = 0;
		super.anIntArray529[0] = arg1;
		super.anIntArray528[0] = arg0;
		@Pc(26) int local26 = this.method7866();
		super.anInt9619 = local26 * 256 + super.anIntArray528[0] * 512;
		super.anInt9614 = local26 * 256 + super.anIntArray529[0] * 512;
		if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 == this) {
			Static451.method6102();
		}
		if (super.aClass34_Sub7_8 != null) {
			super.aClass34_Sub7_8.method5089();
		}
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(B)Z")
	public boolean method1491() {
		return this.aClass376_1 != null;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIB)V")
	public void method1492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt9664 != -1 && Static13.aClass213_1.method5008(super.anInt9664).anInt6418 == 1) {
			super.anInt9664 = -1;
			super.anIntArray527 = null;
		}
		for (@Pc(31) int local31 = 0; local31 < super.aClass190Array3.length; local31++) {
			if (super.aClass190Array3[local31].anInt5051 != -1) {
				@Pc(49) Class106 local49 = Static366.aClass182_2.method4107(super.aClass190Array3[local31].anInt5051);
				if (local49.aBoolean203 && local49.anInt2680 != -1 && Static13.aClass213_1.method5008(local49.anInt2680).anInt6418 == 1) {
					super.aClass190Array3[local31].anInt5051 = -1;
				}
			}
		}
		this.anInt1799 = -1;
		if (arg0 < 0 || Static98.anInt361 <= arg0 || arg1 < 0 || arg1 >= Static438.anInt7120) {
			this.method1489(arg1, arg0);
		} else if (super.anIntArray529[0] >= 0 && Static98.anInt361 > super.anIntArray529[0] && super.anIntArray528[0] >= 0 && super.anIntArray528[0] < Static438.anInt7120) {
			if (arg2 == 2) {
				Static342.method4989(arg1, this, arg0);
			}
			this.method1480(arg2, arg0, arg1);
		} else {
			this.method1489(arg1, arg0);
		}
	}
}
