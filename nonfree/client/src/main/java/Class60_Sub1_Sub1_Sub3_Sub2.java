import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class60_Sub1_Sub1_Sub3_Sub2 extends Class60_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!ih", name = "Hc", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!ih", name = "Vc", descriptor = "Lclient!ija;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!ih", name = "Jc", descriptor = "I")
	public int anInt4884;

	@OriginalMember(owner = "client!ih", name = "ld", descriptor = "Lclient!qca;")
	public Class294 aClass294_1;

	@OriginalMember(owner = "client!ih", name = "kd", descriptor = "I")
	public int anInt4899 = 1;

	@OriginalMember(owner = "client!ih", name = "Mc", descriptor = "I")
	public int anInt4894 = 1;

	@OriginalMember(owner = "client!ih", name = "Qc", descriptor = "I")
	public int anInt4883 = -1;

	@OriginalMember(owner = "client!ih", name = "Lc", descriptor = "I")
	public int anInt4885 = -1;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
	public void method4434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray263[0];
		@Pc(15) int local15 = super.anIntArray264[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local15++;
			local10++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local10++;
			local15--;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		if (super.aClass104_8.method9030() && super.aClass104_8.method9041().anInt5524 == 1) {
			super.anIntArray256 = null;
			super.aClass104_8.method9035(-1);
		}
		for (@Pc(105) int local105 = 0; super.aClass40Array3.length > local105; local105++) {
			if (super.aClass40Array3[local105].anInt571 != -1) {
				@Pc(127) Class17 local127 = Static655.aClass172_2.method4449(super.aClass40Array3[local105].anInt571);
				if (local127.aBoolean21 && local127.anInt251 != -1 && Static444.aClass68_3.method1286(local127.anInt251).anInt5524 == 1) {
					super.aClass40Array3[local105].aClass104_1.method9035(-1);
					super.aClass40Array3[local105].anInt571 = -1;
				}
			}
		}
		if (super.anInt4879 < super.anIntArray263.length - 1) {
			super.anInt4879++;
		}
		for (@Pc(201) int local201 = super.anInt4879; local201 > 0; local201--) {
			super.anIntArray263[local201] = super.anIntArray263[local201 - 1];
			super.anIntArray264[local201] = super.anIntArray264[local201 - 1];
			super.aByteArray36[local201] = super.aByteArray36[local201 - 1];
		}
		super.anIntArray263[0] = local10;
		super.anIntArray264[0] = local15;
		super.aByteArray36[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "(B)I")
	@Override
	protected int method4433() {
		if (this.aClass294_1.anIntArray511 != null) {
			@Pc(13) Class294 local13 = this.aClass294_1.method7168(Static303.aClass55_2);
			if (local13 != null && local13.anInt8146 != -1) {
				return local13.anInt8146;
			}
		}
		return this.aClass294_1.anInt8146;
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(B)I")
	@Override
	public int method4426() {
		if (this.aClass294_1.anIntArray511 != null) {
			@Pc(22) Class294 local22 = this.aClass294_1.method7168(Static303.aClass55_2);
			if (local22 != null && local22.anInt8171 != -1) {
				return local22.anInt8171;
			}
		}
		return this.aClass294_1.anInt8171 == -1 ? super.method4426() : this.aClass294_1.anInt8171;
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)I")
	@Override
	public int method7916() {
		return this.aClass294_1 == null ? 0 : this.aClass294_1.anInt8174;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass294_1 == null || !super.aBoolean372 && !this.method4438(arg0, 0)) {
			return;
		}
		@Pc(26) Class109 local26 = arg0.method6643();
		local26.method4605(super.aClass258_7.method6285(16383));
		local26.method4604(super.anInt9048, super.anInt9051 - 20, super.anInt9057);
		this.method4416(super.aClass54Array3, local26, arg0, super.aBoolean372);
		for (@Pc(53) int local53 = arg1; super.aClass54Array3.length > local53; local53++) {
			super.aClass54Array3[local53] = null;
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!qca;I)V")
	public void method4435(@OriginalArg(0) Class294 arg0) {
		if (this.aClass294_1 != arg0 && Static484.aBoolean623 && Static323.method5078(super.anInt4845)) {
			Static90.method8269();
		}
		this.aClass294_1 = arg0;
		if (this.aClass294_1 != null) {
			this.anInt4884 = this.aClass294_1.anInt8142;
			this.aString51 = this.aClass294_1.aString91;
		}
		if (super.aClass60_Sub4_4 != null) {
			super.aClass60_Sub4_4.method4550();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(B)Z")
	private boolean method4437() {
		return this.aClass294_1.aBoolean615;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ha;BI)Z")
	private boolean method4438(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(11) Class396 local11 = this.method4417(27750);
		@Pc(29) Class104 local29 = super.aClass104_8.method9030() && !super.aClass104_8.method9021() ? super.aClass104_8 : null;
		@Pc(49) Class104 local49 = super.aClass104_7.method9030() && (!super.aBoolean369 || local29 == null) ? super.aClass104_7 : null;
		@Pc(52) int local52 = local11.anInt10424;
		@Pc(55) int local55 = local11.anInt10392;
		if (local52 != 0 || local55 != 0 || local11.anInt10425 != 0 || local11.anInt10393 != 0) {
			arg1 |= 0x7;
		}
		@Pc(114) boolean local114 = super.aByte75 != 0 && super.anInt4877 <= Static141.anInt8737 && Static141.anInt8737 < super.anInt4874;
		if (local114) {
			arg1 |= 0x80000;
		}
		@Pc(125) int local125 = super.aClass258_7.method6285(16383);
		@Pc(148) Class54 local148 = super.aClass54Array3[0] = this.aClass294_1.method7161(local29, Static303.aClass55_2, local125, local49, arg0, arg1, Static551.aClass392_1, this.aClass174_1, super.aClass104_Sub2_Sub1Array3, super.anIntArray262);
		if (local148 == null) {
			return false;
		}
		super.anInt4842 = local148.fa();
		super.anInt4840 = local148.ma();
		this.method4428(local148);
		if (local52 == 0 && local55 == 0) {
			this.method4415(local125, 0, 0, this.method4424((byte) -28) << 9, this.method4424((byte) -28) << 9);
		} else {
			this.method4415(local125, local11.anInt10433, local11.anInt10411, local52, local55);
			if (super.anInt4824 != 0) {
				super.aClass54Array3[0].FA(super.anInt4824);
			}
			if (super.lb != 0) {
				super.aClass54Array3[0].VA(super.lb);
			}
			if (super.anInt4855 != 0) {
				super.aClass54Array3[0].H(0, super.anInt4855, 0);
			}
		}
		if (local114) {
			local148.method7425(super.aByte74, super.aByte77, super.aByte76, super.aByte75 & 0xFF);
		}
		this.method4421(local5, local125, -128, arg0, local11, local55, local52);
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)Z")
	public boolean method4439() {
		return this.aClass294_1 != null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass294_1 == null || !this.method4438(arg0, 131072)) {
			return false;
		}
		@Pc(22) Class109 local22 = arg0.method6643();
		@Pc(27) int local27 = super.aClass258_7.method6285(16383);
		local22.method4605(local27);
		local22.method4604(super.anInt9048, super.anInt9051, super.anInt9057);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; local42 < super.aClass54Array3.length; local42++) {
			if (super.aClass54Array3[local42] != null) {
				@Pc(73) boolean var10000;
				label54: {
					if (this.aClass294_1.anInt8174 <= 0) {
						label52: {
							if (this.aClass294_1.anInt8176 == -1) {
								if (this.aClass294_1.anInt8169 == 1) {
									break label52;
								}
								var10000 = false;
							} else {
								if (this.aClass294_1.anInt8176 == 1) {
									break label52;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label54;
							}
						}
					}
					var10000 = true;
				}
				@Pc(91) boolean local91 = var10000;
				@Pc(106) boolean local106;
				if (Static490.aBoolean634) {
					local106 = super.aClass54Array3[local42].method7399(arg2, arg1, local22, local91, this.aClass294_1.anInt8174, Static377.anInt6468);
				} else {
					local106 = super.aClass54Array3[local42].method7417(arg2, arg1, local22, local91, this.aClass294_1.anInt8174);
				}
				if (local106) {
					local40 = true;
					break;
				}
			}
		}
		if (-1 != -1) {
			Static254.aFloat97 = -1.4966503F;
		}
		for (@Pc(153) int local153 = 0; super.aClass54Array3.length > local153; local153++) {
			super.aClass54Array3[local153] = null;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZIII)V")
	public void method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte135 = super.aByte134 = (byte) arg4;
		if (Static180.method3417(1, arg0, arg3)) {
			super.aByte134++;
		}
		if (super.aClass104_8.method9030() && super.aClass104_8.method9041().anInt5524 == 1) {
			super.anIntArray256 = null;
			super.aClass104_8.method9035(-1);
		}
		for (@Pc(61) int local61 = 0; local61 < super.aClass40Array3.length; local61++) {
			if (super.aClass40Array3[local61].anInt571 != -1) {
				@Pc(82) Class17 local82 = Static655.aClass172_2.method4449(super.aClass40Array3[local61].anInt571);
				if (local82.aBoolean21 && local82.anInt251 != -1 && Static444.aClass68_3.method1286(local82.anInt251).anInt5524 == 1) {
					super.aClass40Array3[local61].aClass104_1.method9035(-1);
					super.aClass40Array3[local61].anInt571 = -1;
				}
			}
		}
		if (!arg2) {
			@Pc(143) int local143 = arg0 - super.anIntArray263[0];
			@Pc(151) int local151 = arg3 - super.anIntArray264[0];
			if (local143 >= -8 && local143 <= 8 && local151 >= -8 && local151 <= 8) {
				if (super.anIntArray263.length - 1 > super.anInt4879) {
					super.anInt4879++;
				}
				for (@Pc(196) int local196 = super.anInt4879; local196 > 0; local196--) {
					super.anIntArray263[local196] = super.anIntArray263[local196 - 1];
					super.anIntArray264[local196] = super.anIntArray264[local196 - 1];
					super.aByteArray36[local196] = super.aByteArray36[local196 - 1];
				}
				super.anIntArray263[0] = arg0;
				super.anIntArray264[0] = arg3;
				super.aByteArray36[0] = 1;
				return;
			}
		}
		super.anInt4879 = 0;
		super.anInt4881 = 0;
		super.anIntArray263[0] = arg0;
		super.anInt4880 = 0;
		super.anIntArray264[0] = arg3;
		super.anInt9048 = (super.anIntArray263[0] << 9) + (arg1 << 8);
		super.anInt9057 = (arg1 << 8) + (super.anIntArray264[0] << 9);
		if (super.aClass60_Sub4_4 != null) {
			super.aClass60_Sub4_4.method4550();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		if (this.aClass294_1 == null || !this.method4438(arg0, 2048)) {
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
		local22.method4604(super.anInt9048, -super.anInt4821 + super.anInt9051 - 20, super.anInt9057);
		@Pc(105) Class396 local105 = this.method4417(27750);
		@Pc(119) Class294 local119 = this.aClass294_1.anIntArray511 == null ? this.aClass294_1 : this.aClass294_1.method7168(Static303.aClass55_2);
		super.aBoolean373 = false;
		@Pc(124) Class60_Sub9 local124 = null;
		if (Static687.aClass6_Sub44_33.aClass7_Sub14_1.method4756() == 1 && local119.aBoolean620 && local105.aBoolean767) {
			@Pc(162) Class104 local162 = super.aClass104_8.method9030() && super.aClass104_8.method9021() ? super.aClass104_8 : null;
			@Pc(182) Class104 local182 = super.aClass104_7.method9030() && (!super.aBoolean369 || local162 == null) ? super.aClass104_7 : null;
			@Pc(226) Class54 local226 = Static17.method224(this.aClass294_1.anInt8169, super.lb, super.anInt4824, this.aClass294_1.aByte115 & 0xFF, local27, this.aClass294_1.aByte116 & 0xFF, super.aClass54Array3[0], local182 == null ? local162 : local182, this.aClass294_1.aShort97 & 0xFFFF, arg0, super.anInt4855, this.aClass294_1.aShort96 & 0xFFFF);
			if (local226 != null) {
				local124 = Static511.method7383(this.method4437(), super.aClass54Array3.length + 1);
				super.aBoolean373 = true;
				arg0.C(false);
				if (Static490.aBoolean634) {
					local226.method7407(local22, local124.aClass60_Sub10Array1[super.aClass54Array3.length], Static377.anInt6468, 0);
				} else {
					local226.method7401(local22, local124.aClass60_Sub10Array1[super.aClass54Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local22.method4605(local27);
		local22.method4604(super.anInt9048, -super.anInt4821 + super.anInt9051 - 5, super.anInt9057);
		if (local124 == null) {
			local124 = Static511.method7383(this.method4437(), super.aClass54Array3.length);
		}
		this.method4416(super.aClass54Array3, local22, arg0, false);
		@Pc(317) int local317;
		if (Static490.aBoolean634) {
			for (local317 = 0; local317 < super.aClass54Array3.length; local317++) {
				if (super.aClass54Array3[local317] != null) {
					super.aClass54Array3[local317].method7407(local22, local124.aClass60_Sub10Array1[local317], Static377.anInt6468, 0);
				}
			}
		} else {
			for (local317 = 0; super.aClass54Array3.length > local317; local317++) {
				if (super.aClass54Array3[local317] != null) {
					super.aClass54Array3[local317].method7401(local22, local124.aClass60_Sub10Array1[local317], 0);
				}
			}
		}
		if (super.aClass60_Sub4_4 != null) {
			@Pc(397) Class209 local397 = super.aClass60_Sub4_4.method4544();
			if (Static490.aBoolean634) {
				arg0.method6685(local397, Static377.anInt6468);
			} else {
				arg0.method6634(local397);
			}
		}
		for (local317 = 0; local317 < super.aClass54Array3.length; local317++) {
			if (super.aClass54Array3[local317] != null) {
				super.aBoolean373 |= super.aClass54Array3[local317].F();
			}
		}
		super.anInt4834 = Static227.anInt4418;
		super.aClass54Array3[0] = super.aClass54Array3[1] = super.aClass54Array3[2] = null;
		return local124;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I")
	@Override
	public int method4430() {
		if (this.aClass294_1.anIntArray511 != null) {
			@Pc(13) Class294 local13 = this.aClass294_1.method7168(Static303.aClass55_2);
			if (local13 != null && local13.anInt8138 != -1) {
				return local13.anInt8138;
			}
		}
		return this.aClass294_1.anInt8138;
	}
}
