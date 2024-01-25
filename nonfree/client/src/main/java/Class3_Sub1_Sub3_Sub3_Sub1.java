import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class3_Sub1_Sub3_Sub3_Sub1 extends Class3_Sub1_Sub3_Sub3 {

	@OriginalMember(owner = "client!ff", name = "Bd", descriptor = "Lclient!bb;")
	public Class27 aClass27_1;

	@OriginalMember(owner = "client!ff", name = "vd", descriptor = "I")
	public int anInt3863 = -1;

	@OriginalMember(owner = "client!ff", name = "Id", descriptor = "I")
	public int anInt3875 = -1;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "(I)Z")
	private boolean method3400() {
		return this.aClass27_1.aBoolean55;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass27_1 == null || !this.method3405(131072, arg0)) {
			return false;
		}
		@Pc(19) Class30 local19 = arg0.method7308();
		@Pc(24) int local24 = super.aClass343_7.method8548();
		local19.method4650(local24);
		local19.method4646(super.anInt10303, super.anInt10306, super.anInt10310);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass166Array3.length; local39++) {
			if (super.aClass166Array3[local39] != null) {
				@Pc(63) boolean var10000;
				label41: {
					if (this.aClass27_1.anInt633 <= 0) {
						label39: {
							if (this.aClass27_1.anInt629 == -1) {
								if (this.aClass27_1.anInt666 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass27_1.anInt629 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(78) boolean local78 = var10000;
				@Pc(94) boolean local94;
				if (Static639.aBoolean753) {
					local94 = super.aClass166Array3[local39].method6693(arg2, arg1, local19, local78, this.aClass27_1.anInt633, Static380.anInt7419);
				} else {
					local94 = super.aClass166Array3[local39].method6698(arg2, arg1, local19, local78, this.aClass27_1.anInt633);
				}
				if (local94) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass166Array3[0] = super.aClass166Array3[1] = super.aClass166Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
	public void method3401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray358[0];
		@Pc(15) int local15 = super.anIntArray357[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local10++;
			local15++;
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
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt6079 != -1 && Static195.aClass193_1.method5573(super.anInt6079).anInt4703 == 1) {
			super.anInt6079 = -1;
			super.anIntArray349 = null;
		}
		@Pc(90) Class109 local90;
		if (super.anInt6065 != -1) {
			local90 = Static459.aClass62_2.method2250(super.anInt6065);
			if (local90.aBoolean296 && local90.anInt3971 != -1 && Static195.aClass193_1.method5573(local90.anInt3971).anInt4703 == 1) {
				super.anInt6065 = -1;
			}
		}
		if (super.anInt6084 != -1) {
			local90 = Static459.aClass62_2.method2250(super.anInt6084);
			if (local90.aBoolean296 && local90.anInt3971 != -1 && Static195.aClass193_1.method5573(local90.anInt3971).anInt4703 == 1) {
				super.anInt6084 = -1;
			}
		}
		if (super.anInt6102 < 9) {
			super.anInt6102++;
		}
		for (@Pc(155) int local155 = super.anInt6102; local155 > 0; local155--) {
			super.anIntArray358[local155] = super.anIntArray358[local155 - 1];
			super.anIntArray357[local155] = super.anIntArray357[local155 - 1];
			super.aByteArray82[local155] = super.aByteArray82[local155 - 1];
		}
		super.anIntArray358[0] = local10;
		super.anIntArray357[0] = local15;
		super.aByteArray82[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		if (this.aClass27_1 == null || !this.method3405(2048, arg0)) {
			return null;
		}
		@Pc(21) Class30 local21 = arg0.method7308();
		@Pc(26) int local26 = super.aClass343_7.method8548();
		local21.method4650(local26);
		@Pc(44) Class100 local44 = Static395.aClass100ArrayArrayArray3[super.aByte132][super.anInt10303 >> Static151.anInt3896][super.anInt10310 >> Static151.anInt3896];
		if (local44 == null || local44.aClass3_Sub1_Sub1_1 == null) {
			super.anInt6069 = (int) ((float) super.anInt6069 - (float) super.anInt6069 / 10.0F);
		} else {
			@Pc(57) int local57 = super.anInt6069 - local44.aClass3_Sub1_Sub1_1.aShort127;
			super.anInt6069 = (int) ((float) super.anInt6069 - (float) local57 / 10.0F);
		}
		local21.method4646(super.anInt10303, -super.anInt6069 + super.anInt10306 - 20, super.anInt10310);
		@Pc(100) Class311 local100 = this.method5200();
		@Pc(113) Class27 local113 = this.aClass27_1.anIntArray43 == null ? this.aClass27_1 : this.aClass27_1.method727(Static286.aClass263_3);
		super.aBoolean456 = false;
		@Pc(118) Class3_Sub4 local118 = null;
		if (Static74.aClass2_Sub13_5.aClass14_Sub28_1.method8965() == 1 && local113.aBoolean52 && local100.aBoolean669) {
			@Pc(145) Class130 local145 = super.anInt6079 != -1 && super.anInt6029 == 0 ? Static195.aClass193_1.method5573(super.anInt6079) : null;
			@Pc(162) Class130 local162 = super.anInt6064 == -1 || super.aBoolean450 && local145 != null ? null : Static195.aClass193_1.method5573(super.anInt6064);
			@Pc(212) Class166 local212 = Static124.method9249(super.anInt6093, local26, super.aClass166Array3[0], super.anInt6022, local162 == null ? super.anInt6063 : super.anInt6047, this.aClass27_1.aShort2 & 0xFFFF, this.aClass27_1.anInt666, super.anInt6053, arg0, this.aClass27_1.aByte13 & 0xFF, this.aClass27_1.aShort3 & 0xFFFF, this.aClass27_1.aByte12 & 0xFF, local162 == null ? local145 : local162);
			if (local212 != null) {
				local118 = Static546.method8162(super.aClass166Array3.length + 1, this.method3400());
				super.aBoolean456 = true;
				arg0.C(false);
				if (Static639.aBoolean753) {
					local212.method6678(local21, local118.aClass3_Sub3Array1[super.aClass166Array3.length], Static380.anInt7419, 0);
				} else {
					local212.method6685(local21, local118.aClass3_Sub3Array1[super.aClass166Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local21.method4650(local26);
		local21.method4646(super.anInt10303, -super.anInt6069 + super.anInt10306 - 5, super.anInt10310);
		if (local118 == null) {
			local118 = Static546.method8162(super.aClass166Array3.length, this.method3400());
		}
		this.method5210(arg0, local21, false, super.aClass166Array3);
		@Pc(299) int local299;
		if (Static639.aBoolean753) {
			for (local299 = 0; super.aClass166Array3.length > local299; local299++) {
				if (super.aClass166Array3[local299] != null) {
					super.aClass166Array3[local299].method6678(local21, local118.aClass3_Sub3Array1[local299], Static380.anInt7419, 0);
				}
			}
		} else {
			for (local299 = 0; super.aClass166Array3.length > local299; local299++) {
				if (super.aClass166Array3[local299] != null) {
					super.aClass166Array3[local299].method6685(local21, local118.aClass3_Sub3Array1[local299], 0);
				}
			}
		}
		if (super.aClass3_Sub9_5 != null) {
			@Pc(359) Class203 local359 = super.aClass3_Sub9_5.method8576();
			if (Static639.aBoolean753) {
				arg0.method7288(local359, Static380.anInt7419);
			} else {
				arg0.method7287(local359);
			}
		}
		for (local299 = 0; local299 < super.aClass166Array3.length; local299++) {
			if (super.aClass166Array3[local299] != null) {
				super.aBoolean456 |= super.aClass166Array3[local299].F();
			}
		}
		super.anInt6092 = Static438.anInt8137;
		super.aClass166Array3[0] = super.aClass166Array3[1] = super.aClass166Array3[2] = null;
		return local118;
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)I")
	@Override
	protected int method5199() {
		if (this.aClass27_1.anIntArray43 != null) {
			@Pc(13) Class27 local13 = this.aClass27_1.method727(Static286.aClass263_3);
			if (local13 != null && local13.anInt649 != -1) {
				return local13.anInt649;
			}
		}
		return this.aClass27_1.anInt649;
	}

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "(I)I")
	@Override
	public int method8617() {
		return this.aClass27_1 == null ? 0 : this.aClass27_1.anInt633;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZIIII)V")
	public void method3402(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte132 = super.aByte131 = (byte) arg4;
		if (Static30.method735(arg0, arg2)) {
			super.aByte131++;
		}
		if (super.anInt6079 != -1 && Static195.aClass193_1.method5573(super.anInt6079).anInt4703 == 1) {
			super.anIntArray349 = null;
			super.anInt6079 = -1;
		}
		@Pc(55) Class109 local55;
		if (super.anInt6065 != -1) {
			local55 = Static459.aClass62_2.method2250(super.anInt6065);
			if (local55.aBoolean296 && local55.anInt3971 != -1 && Static195.aClass193_1.method5573(local55.anInt3971).anInt4703 == 1) {
				super.anInt6065 = -1;
			}
		}
		if (super.anInt6084 != -1) {
			local55 = Static459.aClass62_2.method2250(super.anInt6084);
			if (local55.aBoolean296 && local55.anInt3971 != -1 && Static195.aClass193_1.method5573(local55.anInt3971).anInt4703 == 1) {
				super.anInt6084 = -1;
			}
		}
		if (!arg1) {
			@Pc(114) int local114 = arg2 - super.anIntArray358[0];
			@Pc(122) int local122 = arg0 - super.anIntArray357[0];
			if (local114 >= -8 && local114 <= 8 && local122 >= -8 && local122 <= 8) {
				if (super.anInt6102 < 9) {
					super.anInt6102++;
				}
				for (@Pc(151) int local151 = super.anInt6102; local151 > 0; local151--) {
					super.anIntArray358[local151] = super.anIntArray358[local151 - 1];
					super.anIntArray357[local151] = super.anIntArray357[local151 - 1];
					super.aByteArray82[local151] = super.aByteArray82[local151 - 1];
				}
				super.anIntArray358[0] = arg2;
				super.anIntArray357[0] = arg0;
				super.aByteArray82[0] = 1;
				return;
			}
		}
		super.anInt6103 = 0;
		super.anInt6102 = 0;
		super.anIntArray358[0] = arg2;
		super.anInt6105 = 0;
		super.anIntArray357[0] = arg0;
		super.anInt10303 = (super.anIntArray358[0] << 9) + (arg3 << 8);
		super.anInt10310 = (super.anIntArray357[0] << 9) + (arg3 << 8);
		if (super.aClass3_Sub9_5 != null) {
			super.aClass3_Sub9_5.method8580();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "(B)Z")
	public boolean method3403() {
		return this.aClass27_1 != null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	@Override
	public int method5203() {
		if (this.aClass27_1.anIntArray43 != null) {
			@Pc(13) Class27 local13 = this.aClass27_1.method727(Static286.aClass263_3);
			if (local13 != null && local13.anInt632 != -1) {
				return local13.anInt632;
			}
		}
		return this.aClass27_1.anInt632;
	}

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
	@Override
	public int method5204() {
		if (this.aClass27_1.anIntArray43 != null) {
			@Pc(18) Class27 local18 = this.aClass27_1.method727(Static286.aClass263_3);
			if (local18 != null && local18.anInt661 != -1) {
				return local18.anInt661;
			}
		}
		return this.aClass27_1.anInt661 == -1 ? super.method5204() : this.aClass27_1.anInt661;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
		if (this.aClass27_1 == null || !super.aBoolean455 && !this.method3405(0, arg0)) {
			return;
		}
		@Pc(30) Class30 local30 = arg0.method7308();
		local30.method4650(super.aClass343_7.method8548());
		local30.method4646(super.anInt10303, super.anInt10306 - 20, super.anInt10310);
		this.method5210(arg0, local30, super.aBoolean455, super.aClass166Array3);
		super.aClass166Array3[0] = super.aClass166Array3[1] = super.aClass166Array3[2] = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method3405(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		@Pc(13) int local13 = arg0;
		@Pc(17) Class311 local17 = this.method5200();
		@Pc(32) Class130 local32 = super.anInt6079 != -1 && super.anInt6029 == 0 ? Static195.aClass193_1.method5573(super.anInt6079) : null;
		@Pc(49) Class130 local49 = super.anInt6064 == -1 || super.aBoolean450 && local32 != null ? null : Static195.aClass193_1.method5573(super.anInt6064);
		@Pc(52) int local52 = local17.anInt9399;
		@Pc(55) int local55 = local17.anInt9407;
		if (local52 != 0 || local55 != 0 || local17.anInt9415 != 0 || local17.anInt9395 != 0) {
			arg0 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte98 != 0 && Static407.anInt7704 >= super.anInt6049 && Static407.anInt7704 < super.anInt6051;
		if (local90) {
			arg0 |= 0x80000;
		}
		@Pc(101) int local101 = super.aClass343_7.method8548();
		@Pc(135) Class166 local135 = super.aClass166Array3[0] = this.aClass27_1.method733(local101, super.aClass274Array3, Static195.aClass193_1, local49, super.anInt6019, Static415.aClass340_1, super.anInt6063, local32, Static286.aClass263_3, arg1, super.anInt6099, super.anIntArray354, super.anInt6046, super.anInt6047, arg0, super.anInt6037);
		if (local135 == null) {
			return false;
		}
		super.anInt6021 = local135.fa();
		super.anInt6035 = local135.ma();
		this.method5217(local135);
		if (local52 == 0 && local55 == 0) {
			this.method5202(local101, this.method5214() << 9, 0, this.method5214() << 9, 0);
		} else {
			this.method5202(local101, local52, local17.anInt9409, local55, local17.anInt9384);
			if (super.anInt6093 != 0) {
				super.aClass166Array3[0].FA(super.anInt6093);
			}
			if (super.anInt6022 != 0) {
				super.aClass166Array3[0].VA(super.anInt6022);
			}
			if (super.anInt6053 != 0) {
				super.aClass166Array3[0].H(0, super.anInt6053, 0);
			}
		}
		if (local90) {
			local135.method6694(super.aByte96, super.aByte94, super.aByte97, super.aByte98 & 0xFF);
		}
		@Pc(253) Class109 local253;
		@Pc(267) boolean local267;
		@Pc(269) int local269;
		@Pc(322) Class166 local322;
		@Pc(343) int local343;
		@Pc(345) int local345;
		@Pc(347) int local347;
		@Pc(434) int local434;
		@Pc(462) int local462;
		@Pc(474) int local474;
		@Pc(478) int local478;
		@Pc(489) int local489;
		if (super.anInt6065 == -1 || super.anInt6043 == -1) {
			super.aClass166Array3[1] = null;
		} else {
			local253 = Static459.aClass62_2.method2250(super.anInt6065);
			local267 = local253.aByte63 == 3 && (local52 != 0 || local55 != 0);
			local269 = local13;
			if (local267) {
				local269 = local13 | 0x7;
			} else {
				if (super.anInt6041 != 0) {
					local269 = local13 | 0x5;
				}
				if (super.lb != 0) {
					local269 |= 0x2;
				}
				if (super.anInt6073 >= 0) {
					local269 |= 0x7;
				}
			}
			local322 = super.aClass166Array3[1] = local253.method3485(super.anInt6043, arg1, super.anInt6045, local269, super.anInt6077, Static195.aClass193_1);
			if (local322 != null) {
				if (super.anInt6073 >= 0) {
					local343 = 0;
					local345 = 0;
					local347 = 0;
					if (local17.anIntArrayArray52 != null && local17.anIntArrayArray52[super.anInt6073] != null) {
						local347 = local17.anIntArrayArray52[super.anInt6073][2];
						local343 = local17.anIntArrayArray52[super.anInt6073][0];
						local345 = local17.anIntArrayArray52[super.anInt6073][1];
					}
					if (local17.anIntArrayArray51 != null && local17.anIntArrayArray51[super.anInt6073] != null) {
						local345 += local17.anIntArrayArray51[super.anInt6073][1];
						local343 += local17.anIntArrayArray51[super.anInt6073][0];
						local347 += local17.anIntArrayArray51[super.anInt6073][2];
					}
					if (local347 != 0 || local343 != 0) {
						local434 = local101;
						if (super.anIntArray354 != null && super.anIntArray354[super.anInt6073] != -1) {
							local434 = super.anIntArray354[super.anInt6073];
						}
						local462 = local434 + super.anInt6041 * 2048 - local101 & 0x3FFF;
						if (local462 != 0) {
							local322.a(local462);
						}
						local474 = Class177.anIntArray361[local462];
						local478 = Class177.anIntArray360[local462];
						local489 = local347 * local474 + local343 * local478 >> 14;
						local347 = local347 * local478 - local343 * local474 >> 14;
						local343 = local489;
					}
					local322.H(local343, local345, local347);
				} else if (super.anInt6041 != 0) {
					local322.a(super.anInt6041 * 2048);
				}
				if (super.lb != 0) {
					local322.H(0, -super.lb << 2, 0);
				}
				if (local267) {
					if (super.anInt6093 != 0) {
						local322.FA(super.anInt6093);
					}
					if (super.anInt6022 != 0) {
						local322.VA(super.anInt6022);
					}
					if (super.anInt6053 != 0) {
						local322.H(0, super.anInt6053, 0);
					}
				}
			}
		}
		if (super.anInt6084 == -1 || super.anInt6031 == -1) {
			super.aClass166Array3[2] = null;
		} else {
			local253 = Static459.aClass62_2.method2250(super.anInt6084);
			local267 = local253.aByte63 == 3 && (local52 != 0 || local55 != 0);
			local269 = local13;
			if (local267) {
				local269 = local13 | 0x7;
			} else {
				if (super.anInt6018 != 0) {
					local269 = local13 | 0x5;
				}
				if (super.anInt6057 != 0) {
					local269 |= 0x2;
				}
				if (super.anInt6082 >= 0) {
					local269 |= 0x7;
				}
			}
			local322 = super.aClass166Array3[2] = local253.method3481(super.anInt6068, super.anInt6071, arg1, local269, Static195.aClass193_1, super.anInt6031);
			if (local322 != null) {
				if (super.anInt6082 >= 0 && local17.anIntArrayArray52 != null && local17.anIntArrayArray52[super.anInt6082] != null) {
					local343 = 0;
					local345 = 0;
					local347 = 0;
					if (local17.anIntArrayArray52 != null && local17.anIntArrayArray52[super.anInt6082] != null) {
						local345 = local17.anIntArrayArray52[super.anInt6082][1];
						local343 = local17.anIntArrayArray52[super.anInt6082][0];
						local347 = local17.anIntArrayArray52[super.anInt6082][2];
					}
					if (local17.anIntArrayArray51 != null && local17.anIntArrayArray51[super.anInt6082] != null) {
						local345 += local17.anIntArrayArray51[super.anInt6082][1];
						local343 += local17.anIntArrayArray51[super.anInt6082][0];
						local347 += local17.anIntArrayArray51[super.anInt6082][2];
					}
					if (local347 != 0 || local343 != 0) {
						local434 = local101;
						if (super.anIntArray354 != null && super.anIntArray354[super.anInt6082] != -1) {
							local434 = super.anIntArray354[super.anInt6082];
						}
						local462 = local434 + super.anInt6018 * 2048 - local101 & 0x3FFF;
						if (local462 != 0) {
							local322.a(local462);
						}
						local474 = Class177.anIntArray361[local462];
						local478 = Class177.anIntArray360[local462];
						local489 = local347 * local474 + local478 * local343 >> 14;
						local347 = local478 * local347 - local474 * local343 >> 14;
						local343 = local489;
					}
					local322.H(local343, local345, local347);
				} else if (super.anInt6018 != 0) {
					local322.a(super.anInt6018 * 2048);
				}
				if (super.anInt6057 != 0) {
					local322.H(0, -super.anInt6057 << 2, 0);
				}
				if (local267) {
					if (super.anInt6093 != 0) {
						local322.FA(super.anInt6093);
					}
					if (super.anInt6022 != 0) {
						local322.VA(super.anInt6022);
					}
					if (super.anInt6053 != 0) {
						local322.H(0, super.anInt6053, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!bb;I)V")
	public void method3406(@OriginalArg(0) Class27 arg0) {
		this.aClass27_1 = arg0;
		if (super.aClass3_Sub9_5 != null) {
			super.aClass3_Sub9_5.method8580();
		}
	}
}
