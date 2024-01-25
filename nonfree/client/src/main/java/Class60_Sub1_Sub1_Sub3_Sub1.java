import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class60_Sub1_Sub1_Sub3_Sub1 extends Class60_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!em", name = "dd", descriptor = "I")
	public int anInt2839;

	@OriginalMember(owner = "client!em", name = "Uc", descriptor = "Lclient!dea;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!em", name = "zd", descriptor = "I")
	public int anInt2840;

	@OriginalMember(owner = "client!em", name = "Qc", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!em", name = "id", descriptor = "I")
	private int anInt2855;

	@OriginalMember(owner = "client!em", name = "Ad", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!em", name = "Pc", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!em", name = "wd", descriptor = "I")
	public int anInt2846 = -1;

	@OriginalMember(owner = "client!em", name = "pd", descriptor = "I")
	public int anInt2841 = -1;

	@OriginalMember(owner = "client!em", name = "nd", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!em", name = "ld", descriptor = "B")
	private byte aByte41 = 0;

	@OriginalMember(owner = "client!em", name = "fd", descriptor = "B")
	private byte aByte42 = 0;

	@OriginalMember(owner = "client!em", name = "ad", descriptor = "I")
	public int anInt2844 = 255;

	@OriginalMember(owner = "client!em", name = "Hc", descriptor = "I")
	public int anInt2838 = -1;

	@OriginalMember(owner = "client!em", name = "Ic", descriptor = "I")
	public int anInt2856 = -1;

	@OriginalMember(owner = "client!em", name = "Jc", descriptor = "I")
	public int anInt2853 = -1;

	@OriginalMember(owner = "client!em", name = "md", descriptor = "I")
	public int anInt2859 = -1;

	@OriginalMember(owner = "client!em", name = "Lc", descriptor = "I")
	public int anInt2862 = 0;

	@OriginalMember(owner = "client!em", name = "Wc", descriptor = "I")
	public int anInt2867 = 0;

	@OriginalMember(owner = "client!em", name = "Dd", descriptor = "I")
	public int anInt2866 = 0;

	@OriginalMember(owner = "client!em", name = "Rc", descriptor = "Z")
	public boolean aBoolean226 = false;

	@OriginalMember(owner = "client!em", name = "Oc", descriptor = "Z")
	public boolean aBoolean229 = false;

	@OriginalMember(owner = "client!em", name = "ed", descriptor = "Z")
	public boolean aBoolean230 = false;

	@OriginalMember(owner = "client!em", name = "Tc", descriptor = "I")
	public int anInt2869 = 0;

	@OriginalMember(owner = "client!em", name = "Xc", descriptor = "I")
	public int anInt2852 = -1;

	@OriginalMember(owner = "client!em", name = "bd", descriptor = "I")
	public int anInt2870 = 0;

	@OriginalMember(owner = "client!em", name = "Zc", descriptor = "I")
	public int anInt2872 = -1;

	@OriginalMember(owner = "client!em", name = "Ed", descriptor = "B")
	private byte aByte43 = 0;

	@OriginalMember(owner = "client!em", name = "Kc", descriptor = "Z")
	public boolean aBoolean231 = false;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2701() {
		@Pc(7) String local7 = "";
		if (Static339.aStringArray25 != null) {
			local7 = local7 + Static339.aStringArray25[this.aByte43];
		}
		@Pc(40) int[] local40;
		if (this.aByte41 == 1 && Static639.anIntArray651 != null) {
			local40 = Static639.anIntArray651;
		} else {
			local40 = Static32.anIntArray27;
		}
		if (local40 != null && local40[this.aByte43] != -1) {
			@Pc(62) Class311 local62 = Static146.aClass32_1.method445(local40[this.aByte43]);
			if (local62.aChar5 == 's') {
				local7 = local7 + local62.method7471(this.aByte42 & 0xFF);
			} else {
				Static550.method7785(new Throwable(), "gdn1");
				local40[this.aByte43] = -1;
			}
		}
		local7 = local7 + this.aString24;
		if (Static188.aStringArray16 != null) {
			local7 = local7 + Static188.aStringArray16[this.aByte43];
		}
		return local7;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass73_1 == null || !this.method2702((byte) -115, 131072, arg0)) {
			return false;
		}
		@Pc(22) Class109 local22 = arg0.method6643();
		@Pc(27) int local27 = super.aClass258_7.method6285(16383);
		local22.method4605(local27);
		local22.method4604(super.anInt9048, super.anInt9051, super.anInt9057);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; local42 < super.aClass54Array3.length; local42++) {
			if (super.aClass54Array3[local42] != null && (Static490.aBoolean634 ? super.aClass54Array3[local42].method7399(arg2, arg1, local22, true, 0, Static377.anInt6468) : super.aClass54Array3[local42].method7417(arg2, arg1, local22, true, 0))) {
				local40 = true;
				break;
			}
		}
		if (-1 != -1) {
			this.method2702((byte) -101, 31, (Class75) null);
		}
		super.aClass54Array3[0] = super.aClass54Array3[1] = super.aClass54Array3[2] = null;
		return local40;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BILclient!ha;)Z")
	private boolean method2702(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2) {
		@Pc(7) int local7 = arg1;
		@Pc(13) Class396 local13 = this.method4417(arg0 + 27865);
		@Pc(31) Class104 local31 = super.aClass104_8.method9030() && !super.aClass104_8.method9021() ? super.aClass104_8 : null;
		@Pc(56) Class104 local56 = !super.aClass104_7.method9030() || this.aBoolean230 || super.aBoolean369 && local31 != null ? null : super.aClass104_7;
		@Pc(59) int local59 = local13.anInt10424;
		if (arg0 != -115) {
			this.method7909((Class75) null, -122);
		}
		@Pc(71) int local71 = local13.anInt10392;
		if (local59 != 0 || local71 != 0 || local13.anInt10425 != 0 || local13.anInt10393 != 0) {
			arg1 |= 0x7;
		}
		@Pc(108) int local108 = super.aClass258_7.method6285(16383);
		@Pc(131) boolean local131 = super.aByte75 != 0 && super.anInt4877 <= Static141.anInt8737 && Static141.anInt8737 < super.anInt4874;
		if (local131) {
			arg1 |= 0x80000;
		}
		@Pc(164) Class54 local164 = super.aClass54Array3[0] = this.aClass73_1.method1364(Static664.aClass319_2, Static557.aClass262_1, local56, Static551.aClass392_1, (byte) 113, local108, local31, Static303.aClass55_2, Static221.aClass164_1, Static149.aClass244_1, Static444.aClass68_3, super.aClass104_Sub2_Sub1Array3, arg2, arg1, super.anIntArray262);
		@Pc(167) int local167 = Static583.method8123();
		if (Static532.anInt8714 < 96 && local167 > 50) {
			Static434.method6604();
		}
		if (Static41.aClass352_2 != Static520.aClass352_8 && local167 < 50) {
			@Pc(208) int local208 = 50 - local167;
			while (local208 > Static598.anInt9466) {
				Static188.aByteArrayArray63[Static598.anInt9466] = new byte[102400];
				Static598.anInt9466++;
			}
			while (Static598.anInt9466 > local208) {
				Static598.anInt9466--;
				Static188.aByteArrayArray63[Static598.anInt9466] = null;
			}
		} else if (Static520.aClass352_8 != Static41.aClass352_2) {
			Static598.anInt9466 = 0;
			Static188.aByteArrayArray63 = new byte[50][];
		}
		if (local164 == null) {
			return false;
		}
		super.anInt4842 = local164.fa();
		super.anInt4840 = local164.ma();
		this.method4428(local164);
		if (local59 == 0 && local71 == 0) {
			this.method4415(local108, 0, 0, this.method4424((byte) -28) << 9, this.method4424((byte) -28) << 9);
		} else {
			this.method4415(local108, local13.anInt10433, local13.anInt10411, local59, local71);
			if (super.anInt4824 != 0) {
				local164.FA(super.anInt4824);
			}
			if (super.lb != 0) {
				local164.VA(super.lb);
			}
			if (super.anInt4855 != 0) {
				local164.H(0, super.anInt4855, 0);
			}
		}
		if (local131) {
			local164.method7425(super.aByte74, super.aByte77, super.aByte76, super.aByte75 & 0xFF);
		}
		if (!this.aBoolean230) {
			this.method4421(local7, local108, arg0 ^ 0xC, arg2, local13, local71, local59);
		}
		return true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method2703() {
		return this.aString23;
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		if (this.aClass73_1 == null || !this.method2702((byte) -115, 2048, arg0)) {
			return null;
		}
		@Pc(22) Class109 local22 = arg0.method6643();
		@Pc(27) int local27 = super.aClass258_7.method6285(16383);
		local22.method4605(local27);
		@Pc(45) Class243 local45 = Static334.aClass243ArrayArrayArray2[super.aByte135][super.anInt9048 >> Static594.anInt9440][super.anInt9057 >> Static594.anInt9440];
		if (local45 == null || local45.aClass60_Sub1_Sub2_1 == null) {
			super.anInt4821 = (int) ((float) super.anInt4821 - (float) super.anInt4821 / 10.0F);
		} else {
			@Pc(76) int local76 = super.anInt4821 - local45.aClass60_Sub1_Sub2_1.aShort45;
			super.anInt4821 = (int) ((float) super.anInt4821 - (float) local76 / 10.0F);
		}
		local22.method4604(super.anInt9048, super.anInt9051 - super.anInt4821 - 20, super.anInt9057);
		@Pc(103) Class60_Sub9 local103 = null;
		super.aBoolean373 = false;
		if (Static687.aClass6_Sub44_33.aClass7_Sub14_1.method4756() == 1) {
			@Pc(116) Class396 local116 = this.method4417(27750);
			if (local116.aBoolean767 && (this.aClass73_1.anInt1402 == -1 || Static221.aClass164_1.method4157(this.aClass73_1.anInt1402).aBoolean620)) {
				@Pc(156) Class104 local156 = super.aClass104_8.method9030() && super.aClass104_8.method9021() ? super.aClass104_8 : null;
				@Pc(176) Class104 local176 = super.aClass104_7.method9030() && (!super.aBoolean369 || local156 == null) ? super.aClass104_7 : null;
				@Pc(202) Class54 local202 = Static17.method224(1, super.lb, super.anInt4824, 240, local27, 160, super.aClass54Array3[0], local176 == null ? local156 : local176, 0, arg0, super.anInt4855, 0);
				if (local202 != null) {
					local103 = Static511.method7383(true, super.aClass54Array3.length + 1);
					super.aBoolean373 = true;
					arg0.C(false);
					if (Static490.aBoolean634) {
						local202.method7407(local22, local103.aClass60_Sub10Array1[super.aClass54Array3.length], Static377.anInt6468, 0);
					} else {
						local202.method7401(local22, local103.aClass60_Sub10Array1[super.aClass54Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(259) int local259;
		if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == this) {
			for (local259 = Static236.aClass232Array1.length - 1; local259 >= 0; local259--) {
				@Pc(265) Class232 local265 = Static236.aClass232Array1[local259];
				if (local265 != null && local265.anInt6170 != -1) {
					@Pc(299) int local299;
					if (local265.anInt6164 == 1) {
						@Pc(287) Class6_Sub11 local287 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local265.anInt6165);
						if (local287 != null) {
							@Pc(292) Class60_Sub1_Sub1_Sub3_Sub2 local292 = local287.aClass60_Sub1_Sub1_Sub3_Sub2_1;
							local299 = local292.anInt9048 - Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048;
							@Pc(306) int local306 = local292.anInt9057 - Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057;
							if (Static490.aBoolean634) {
								this.method2709(local265.anInt6170, super.aClass54Array3[0], Static377.anInt6468, local306, local22, 92160000, arg0, local299);
							} else {
								this.method2711(super.aClass54Array3[0], local265.anInt6170, arg0, 92160000, local299, local22, local306);
							}
						}
					}
					@Pc(361) int local361;
					if (local265.anInt6164 == 2) {
						@Pc(354) int local354 = local265.anInt6167 - Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048;
						local361 = local265.anInt6174 - Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057;
						local299 = local265.anInt6166 << 9;
						local299 *= local299;
						if (Static490.aBoolean634) {
							this.method2709(local265.anInt6170, super.aClass54Array3[0], Static377.anInt6468, local361, local22, local299, arg0, local354);
						} else {
							this.method2711(super.aClass54Array3[0], local265.anInt6170, arg0, local299, local354, local22, local361);
						}
					}
					if (local265.anInt6164 == 10 && local265.anInt6165 >= 0 && Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1.length > local265.anInt6165) {
						@Pc(437) Class60_Sub1_Sub1_Sub3_Sub1 local437 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local265.anInt6165];
						if (local437 != null) {
							local361 = local437.anInt9048 - Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048;
							local299 = local437.anInt9057 - Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057;
							if (Static490.aBoolean634) {
								this.method2709(local265.anInt6170, super.aClass54Array3[0], Static377.anInt6468, local299, local22, 92160000, arg0, local361);
							} else {
								this.method2711(super.aClass54Array3[0], local265.anInt6170, arg0, 92160000, local361, local22, local299);
							}
						}
					}
				}
			}
			local22.method4605(local27);
			local22.method4604(super.anInt9048, super.anInt9051, super.anInt9057);
		}
		local22.method4605(local27);
		local22.method4604(super.anInt9048, -super.anInt4821 + super.anInt9051 - 5, super.anInt9057);
		if (local103 == null) {
			local103 = Static511.method7383(true, super.aClass54Array3.length);
		}
		this.method4416(super.aClass54Array3, local22, arg0, false);
		if (Static490.aBoolean634) {
			for (local259 = 0; local259 < super.aClass54Array3.length; local259++) {
				if (super.aClass54Array3[local259] != null) {
					super.aClass54Array3[local259].method7407(local22, local103.aClass60_Sub10Array1[local259], Static377.anInt6468, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local259 = 0; super.aClass54Array3.length > local259; local259++) {
				if (super.aClass54Array3[local259] != null) {
					super.aClass54Array3[local259].method7401(local22, local103.aClass60_Sub10Array1[local259], Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass60_Sub4_4 != null) {
			@Pc(639) Class209 local639 = super.aClass60_Sub4_4.method4544();
			if (Static490.aBoolean634) {
				arg0.method6685(local639, Static377.anInt6468);
			} else {
				arg0.method6634(local639);
			}
		}
		for (local259 = 0; local259 < super.aClass54Array3.length; local259++) {
			if (super.aClass54Array3[local259] != null) {
				super.aBoolean373 |= super.aClass54Array3[local259].F();
			}
			super.aClass54Array3[local259] = null;
		}
		super.anInt4834 = Static227.anInt4418;
		return local103;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIBI)V")
	public void method2704(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4879 < super.anIntArray263.length - 1) {
			super.anInt4879++;
		}
		for (@Pc(28) int local28 = super.anInt4879; local28 > 0; local28--) {
			super.anIntArray263[local28] = super.anIntArray263[local28 - 1];
			super.anIntArray264[local28] = super.anIntArray264[local28 - 1];
			super.aByteArray36[local28] = super.aByteArray36[local28 - 1];
		}
		super.anIntArray263[0] = arg2;
		if (false) {
			this.aBoolean231 = false;
		}
		super.anIntArray264[0] = arg0;
		super.aByteArray36[0] = arg1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIB)V")
	public void method2705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.aClass104_8.method9030() && super.aClass104_8.method9041().anInt5524 == 1) {
			super.anIntArray256 = null;
			super.aClass104_8.method9035(-1);
		}
		for (@Pc(38) int local38 = 0; super.aClass40Array3.length > local38; local38++) {
			if (super.aClass40Array3[local38].anInt571 != -1) {
				@Pc(58) Class17 local58 = Static655.aClass172_2.method4449(super.aClass40Array3[local38].anInt571);
				if (local58.aBoolean21 && local58.anInt251 != -1 && Static444.aClass68_3.method1286(local58.anInt251).anInt5524 == 1) {
					super.aClass40Array3[local38].aClass104_1.method9035(-1);
					super.aClass40Array3[local38].anInt571 = -1;
				}
			}
		}
		this.anInt2853 = -1;
		if (arg1 < 0 || arg1 >= Static29.anInt380 || arg0 < 0 || arg0 >= Static327.anInt5650) {
			this.method2707(arg1, arg0);
		} else if (super.anIntArray263[0] >= 0 && Static29.anInt380 > super.anIntArray263[0] && super.anIntArray264[0] >= 0 && Static327.anInt5650 > super.anIntArray264[0]) {
			if (arg2 == 2) {
				Static538.method7684(arg0, this, arg1);
			}
			this.method2704(arg0, arg2, arg1);
		} else {
			this.method2707(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method2706(@OriginalArg(0) Class6_Sub15 arg0) {
		arg0.anInt3174 = 0;
		@Pc(12) int local12 = arg0.method3030();
		this.aByte41 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean231;
		this.aBoolean231 = (local12 & 0x2) != 0;
		@Pc(43) boolean local43 = (local12 & 0x4) != 0;
		@Pc(47) int local47 = super.method4424((byte) -28);
		this.method4432((local12 >> 3 & 0x7) + 1);
		this.aByte43 = (byte) (local12 >> 6 & 0x3);
		super.anInt9048 += this.method4424((byte) -28) - local47 << 8;
		super.anInt9057 += this.method4424((byte) -28) - local47 << 8;
		this.aByte42 = arg0.method3027();
		this.anInt2872 = arg0.method3027();
		this.anInt2852 = arg0.method3027();
		this.aBoolean229 = arg0.method3027() == 1;
		if (Static41.aClass352_2 == Static520.aClass352_8 && Static679.anInt6104 >= 2) {
			this.aBoolean229 = false;
		}
		this.anInt2867 = 0;
		@Pc(135) int local135 = -1;
		@Pc(140) int[] local140 = new int[Static557.aClass262_1.anIntArray463.length];
		@Pc(145) Class383[] local145 = new Class383[Static557.aClass262_1.anIntArray463.length];
		@Pc(159) Class282[] local159 = new Class282[Static557.aClass262_1.anIntArray463.length];
		@Pc(177) int local177;
		@Pc(194) int local194;
		@Pc(201) int local201;
		@Pc(257) int local257;
		for (@Pc(161) int local161 = 0; local161 < Static557.aClass262_1.anIntArray463.length; local161++) {
			if (Static557.aClass262_1.anIntArray463[local161] != 1) {
				local177 = arg0.method3030();
				if (local177 == 0) {
					local140[local161] = 0;
				} else {
					local194 = arg0.method3030();
					local201 = (local177 << 8) + local194;
					if (local161 == 0 && local201 == 65535) {
						local135 = arg0.method3018();
						this.anInt2867 = arg0.method3030();
						break;
					}
					if (local201 >= 32768) {
						local201 = Static118.anIntArray124[local201 - 32768];
						local140[local161] = local201 | 0x40000000;
						local159[local161] = Static149.aClass244_1.method5958(local201);
						local257 = local159[local161].anInt7906;
						if (local257 != 0) {
							this.anInt2867 = local257;
						}
					} else {
						local140[local161] = Integer.MIN_VALUE | local201 - 256;
					}
				}
			}
		}
		if (local135 == -1) {
			local177 = arg0.method3018();
			local194 = 0;
			for (local201 = 0; local201 < Static557.aClass262_1.anIntArray463.length; local201++) {
				if (Static557.aClass262_1.anIntArray463[local201] == 0) {
					if ((0x1 << local194 & local177) != 0) {
						local145[local201] = Static21.method245(arg0, local159[local201]);
					}
					local194++;
				}
			}
		}
		@Pc(342) int[] local342 = new int[5];
		for (local194 = 0; local194 < 5; local194++) {
			local201 = arg0.method3030();
			if (Static299.aShortArrayArrayArray2.length < 1 || local201 < 0 || local201 >= Static299.aShortArrayArrayArray2[0][local194].length) {
				local201 = 0;
			}
			local342[local194] = local201;
		}
		this.anInt2855 = arg0.method3018();
		this.aString24 = arg0.method3046();
		if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == this) {
			Static405.aString111 = this.aString24;
		}
		this.aString23 = this.aString24;
		this.anInt2869 = arg0.method3030();
		if (local43) {
			this.anInt2866 = arg0.method3018();
			if (this.anInt2866 == 65535) {
				this.anInt2866 = -1;
			}
			this.anInt2846 = -1;
			this.anInt2870 = this.anInt2869;
		} else {
			this.anInt2866 = 0;
			this.anInt2870 = arg0.method3030();
			this.anInt2846 = arg0.method3030();
			if (this.anInt2846 == 255) {
				this.anInt2846 = -1;
			}
		}
		local201 = this.anInt2862;
		this.anInt2862 = arg0.method3030();
		@Pc(486) int local486;
		if (this.anInt2862 == 0) {
			Static369.method5575(this);
		} else {
			local257 = this.anInt2838;
			@Pc(483) int local483 = this.anInt2841;
			local486 = this.anInt2856;
			@Pc(489) int local489 = this.anInt2859;
			@Pc(492) int local492 = this.anInt2844;
			this.anInt2838 = arg0.method3018();
			this.anInt2841 = arg0.method3018();
			this.anInt2856 = arg0.method3018();
			this.anInt2859 = arg0.method3018();
			this.anInt2844 = arg0.method3030();
			if (local21 != this.aBoolean231 || local201 != this.anInt2862 || this.anInt2838 != local257 || this.anInt2841 != local483 || this.anInt2856 != local486 || this.anInt2859 != local489 || local492 != this.anInt2844) {
				Static578.method8054(this);
			}
		}
		if (this.aClass73_1 == null) {
			this.aClass73_1 = new Class73();
		}
		local257 = this.aClass73_1.anInt1402;
		@Pc(602) int[] local602 = this.aClass73_1.anIntArray88;
		this.aClass73_1.method1369(local145, local342, this.aByte41 == 1, this.method4433(), local135, local140);
		if (local257 != local135) {
			super.anInt9048 = (super.anIntArray263[0] << 9) + (this.method4424((byte) -28) << 8);
			super.anInt9057 = (super.anIntArray264[0] << 9) + (this.method4424((byte) -28) << 8);
		}
		if (super.anInt4845 == Static503.anInt8407 && local602 != null) {
			for (local486 = 0; local486 < local342.length; local486++) {
				if (local602[local486] != local342[local486]) {
					Static149.aClass244_1.method5968();
					break;
				}
			}
		}
		if (super.aClass60_Sub4_4 != null) {
			super.aClass60_Sub4_4.method4550();
		}
		if (!super.aClass104_7.method9030() || !super.aBoolean369) {
			return;
		}
		@Pc(725) Class396 local725 = this.method4417(27750);
		if (!local725.method8964(super.aClass104_7.method9032())) {
			super.aClass104_7.method9035(-1);
			super.aBoolean369 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I")
	@Override
	public int method4430() {
		return -1;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(III)V")
	public void method2707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt4880 = 0;
		super.anIntArray263[0] = arg0;
		super.anInt4881 = 0;
		super.anInt4879 = 0;
		super.anIntArray264[0] = arg1;
		@Pc(26) int local26 = this.method4424((byte) -28);
		super.anInt9048 = super.anIntArray263[0] * 512 + local26 * 256;
		super.anInt9057 = local26 * 256 + super.anIntArray264[0] * 512;
		if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == this) {
			Static433.method6599();
		}
		if (super.aClass60_Sub4_4 != null) {
			super.aClass60_Sub4_4.method4550();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass73_1 == null || !super.aBoolean372 && !this.method2702((byte) -115, 0, arg0)) {
			return;
		}
		@Pc(26) Class109 local26 = arg0.method6643();
		local26.method4605(super.aClass258_7.method6285(arg1 + 16383));
		local26.method4604(super.anInt9048, super.anInt9051 - 5, super.anInt9057);
		this.method4416(super.aClass54Array3, local26, arg0, super.aBoolean372);
		for (@Pc(55) int local55 = arg1; local55 < super.aClass54Array3.length; local55++) {
			super.aClass54Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!em", name = "j", descriptor = "(B)I")
	@Override
	protected int method4433() {
		return this.anInt2855;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!ka;IIILclient!qa;ILclient!ha;I)V")
	private void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class75 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg7 * arg7 + arg3 * arg3;
		if (local11 < 262144 || local11 > arg5) {
			return;
		}
		@Pc(44) int local44 = (int) (Math.atan2((double) arg7, (double) arg3) * 2607.5945876176133D - (double) super.aClass258_7.method6285(16383)) & 0x3FFF;
		@Pc(56) Class54 local56 = Static624.method8545(arg0, local44, super.anInt4855, arg6, super.anInt4824, super.lb);
		if (local56 != null) {
			arg6.C(false);
			local56.method7407(arg4, (Class60_Sub10) null, arg2, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z")
	public boolean method2710() {
		return this.aClass73_1 != null;
	}

	@OriginalMember(owner = "client!em", name = "h", descriptor = "(B)I")
	@Override
	public int method4424(@OriginalArg(0) byte arg0) {
		if (arg0 == -28) {
			return this.aClass73_1 == null || this.aClass73_1.anInt1402 == -1 ? super.method4424((byte) -28) : Static221.aClass164_1.method4157(this.aClass73_1.anInt1402).anInt8169;
		} else {
			return -112;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ka;IILclient!ha;IILclient!qa;I)V")
	private void method2711(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class109 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg6 * arg6 + arg4 * arg4;
		if (local11 < 262144 || local11 > arg3) {
			return;
		}
		@Pc(44) int local44 = (int) (Math.atan2((double) arg4, (double) arg6) * 2607.5945876176133D - (double) super.aClass258_7.method6285(16383)) & 0x3FFF;
		@Pc(56) Class54 local56 = Static624.method8545(arg1, local44, super.anInt4855, arg2, super.anInt4824, super.lb);
		if (local56 != null) {
			arg2.C(false);
			local56.method7401(arg5, (Class60_Sub10) null, 0);
			arg2.C(true);
		}
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		return null;
	}
}
