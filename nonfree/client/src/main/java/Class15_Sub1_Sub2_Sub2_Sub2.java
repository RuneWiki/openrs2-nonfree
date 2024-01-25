import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class15_Sub1_Sub2_Sub2_Sub2 extends Class15_Sub1_Sub2_Sub2 {

	@OriginalMember(owner = "client!pk", name = "td", descriptor = "Lclient!saa;")
	public Class300 aClass300_1;

	@OriginalMember(owner = "client!pk", name = "zd", descriptor = "I")
	public int anInt8155 = -1;

	@OriginalMember(owner = "client!pk", name = "xd", descriptor = "I")
	public int anInt8153 = -1;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!ha;I)Z")
	private boolean method6701(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class102 local11 = this.method6686();
		@Pc(30) Class97 local30 = super.anInt8105 != -1 && super.anInt8094 == 0 ? Static28.aClass220_1.method5670(super.anInt8105) : null;
		@Pc(47) Class97 local47 = super.anInt8107 == -1 || super.aBoolean585 && local30 != null ? null : Static28.aClass220_1.method5670(super.anInt8107);
		@Pc(50) int local50 = local11.anInt3743;
		@Pc(53) int local53 = local11.anInt3723;
		if (local50 != 0 || local53 != 0 || local11.anInt3745 != 0 || local11.anInt3746 != 0) {
			arg1 |= 0x7;
		}
		@Pc(92) boolean local92 = super.aByte86 != 0 && Static435.anInt8192 >= super.anInt8087 && super.anInt8062 > Static435.anInt8192;
		if (local92) {
			arg1 |= 0x80000;
		}
		@Pc(103) int local103 = super.aClass371_7.method8432();
		@Pc(137) Class83 local137 = super.aClass83Array3[0] = this.aClass300_1.method7315(local30, Static28.aClass220_1, Static420.aClass77_1, local103, Static472.aClass202_4, super.anIntArray433, super.anInt8131, super.anInt8070, super.anInt8063, super.anInt8110, arg1, arg0, local47, super.aClass96Array3, super.anInt8049, super.anInt8080);
		if (local137 == null) {
			return false;
		}
		super.anInt8115 = local137.fa();
		super.anInt8126 = local137.ma();
		this.method6687(local137);
		if (local50 == 0 && local53 == 0) {
			this.method6696(this.method6692() << 9, local103, 0, this.method6692() << 9, 0);
		} else {
			this.method6696(local50, local103, local11.anInt3730, local53, local11.anInt3733);
			if (super.anInt8102 != 0) {
				super.aClass83Array3[0].FA(super.anInt8102);
			}
			if (super.anInt8082 != 0) {
				super.aClass83Array3[0].VA(super.anInt8082);
			}
			if (super.anInt8096 != 0) {
				super.aClass83Array3[0].H(0, super.anInt8096, 0);
			}
		}
		if (local92) {
			local137.method7992(super.aByte85, super.aByte83, super.aByte84, super.aByte86 & 0xFF);
		}
		@Pc(261) Class73 local261;
		@Pc(276) boolean local276;
		@Pc(278) int local278;
		@Pc(325) Class83 local325;
		@Pc(332) int local332;
		@Pc(334) int local334;
		@Pc(336) int local336;
		@Pc(420) int local420;
		@Pc(447) int local447;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(470) int local470;
		if (super.anInt8058 == -1 || super.anInt8056 == -1) {
			super.aClass83Array3[1] = null;
		} else {
			local261 = Static202.aClass333_2.method7823(super.anInt8058);
			local276 = local261.aByte29 == 3 && (local50 != 0 || local53 != 0);
			local278 = local7;
			if (local276) {
				local278 = local7 | 0x7;
			} else {
				if (super.anInt8071 != 0) {
					local278 = local7 | 0x5;
				}
				if (super.anInt8072 != 0) {
					local278 |= 0x2;
				}
				if (super.anInt8091 != 0) {
					local278 |= 0x7;
				}
			}
			local325 = super.aClass83Array3[1] = local261.method2308(super.anInt8122, local278, arg0, Static28.aClass220_1, super.anInt8098, super.anInt8056);
			if (local325 != null) {
				if (super.anInt8091 >= 0) {
					local332 = 0;
					local334 = 0;
					local336 = 0;
					if (local11.anIntArrayArray16 != null && local11.anIntArrayArray16[super.anInt8091] != null) {
						local334 = local11.anIntArrayArray16[super.anInt8091][1];
						local336 = local11.anIntArrayArray16[super.anInt8091][2];
						local332 = local11.anIntArrayArray16[super.anInt8091][0];
					}
					if (local11.anIntArrayArray17 != null && local11.anIntArrayArray17[super.anInt8091] != null) {
						local334 += local11.anIntArrayArray17[super.anInt8091][1];
						local336 += local11.anIntArrayArray17[super.anInt8091][2];
						local332 += local11.anIntArrayArray17[super.anInt8091][0];
					}
					if (local336 != 0 || local332 != 0) {
						local420 = local103;
						if (super.anIntArray433 != null && super.anIntArray433[super.anInt8091] != -1) {
							local420 = super.anIntArray433[super.anInt8091];
						}
						local447 = super.anInt8071 * 2048 + local420 - local103 & 0x3FFF;
						if (local447 != 0) {
							local325.a(local447);
						}
						local456 = Class344.anIntArray579[local447];
						local460 = Class344.anIntArray578[local447];
						local470 = local460 * local332 + local336 * local456 >> 14;
						local336 = local336 * local460 - local332 * local456 >> 14;
						local332 = local470;
					}
					local325.H(local332, local334, local336);
				} else if (super.anInt8071 != 0) {
					local325.a(super.anInt8071 * 2048);
				}
				if (super.anInt8072 != 0) {
					local325.H(0, -super.anInt8072 << 2, 0);
				}
				if (local276) {
					if (super.anInt8102 != 0) {
						local325.FA(super.anInt8102);
					}
					if (super.anInt8082 != 0) {
						local325.VA(super.anInt8082);
					}
					if (super.anInt8096 != 0) {
						local325.H(0, super.anInt8096, 0);
					}
				}
			}
		}
		if (super.anInt8074 == -1 || super.anInt8095 == -1) {
			super.aClass83Array3[2] = null;
		} else {
			local261 = Static202.aClass333_2.method7823(super.anInt8074);
			local276 = local261.aByte29 == 3 && (local50 != 0 || local53 != 0);
			local278 = local7;
			if (local276) {
				local278 = local7 | 0x7;
			} else {
				if (super.anInt8065 != 0) {
					local278 = local7 | 0x5;
				}
				if (super.anInt8076 != 0) {
					local278 |= 0x2;
				}
				if (super.anInt8069 != 0) {
					local278 |= 0x7;
				}
			}
			local325 = super.aClass83Array3[2] = local261.method2303(local278, arg0, super.anInt8116, super.anInt8095, Static28.aClass220_1, super.anInt8134);
			if (local325 != null) {
				if (super.anInt8069 >= 0 && local11.anIntArrayArray16 != null && local11.anIntArrayArray16[super.anInt8069] != null) {
					local332 = 0;
					local334 = 0;
					local336 = 0;
					if (local11.anIntArrayArray16 != null && local11.anIntArrayArray16[super.anInt8069] != null) {
						local334 = local11.anIntArrayArray16[super.anInt8069][1];
						local332 = local11.anIntArrayArray16[super.anInt8069][0];
						local336 = local11.anIntArrayArray16[super.anInt8069][2];
					}
					if (local11.anIntArrayArray17 != null && local11.anIntArrayArray17[super.anInt8069] != null) {
						local332 += local11.anIntArrayArray17[super.anInt8069][0];
						local336 += local11.anIntArrayArray17[super.anInt8069][2];
						local334 += local11.anIntArrayArray17[super.anInt8069][1];
					}
					if (local336 != 0 || local332 != 0) {
						local420 = local103;
						if (super.anIntArray433 != null && super.anIntArray433[super.anInt8069] != -1) {
							local420 = super.anIntArray433[super.anInt8069];
						}
						local447 = local420 + super.anInt8065 * 2048 - local103 & 0x3FFF;
						if (local447 != 0) {
							local325.a(local447);
						}
						local456 = Class344.anIntArray579[local447];
						local460 = Class344.anIntArray578[local447];
						local470 = local332 * local460 + local456 * local336 >> 14;
						local336 = local460 * local336 - local456 * local332 >> 14;
						local332 = local470;
					}
					local325.H(local332, local334, local336);
				} else if (super.anInt8065 != 0) {
					local325.a(super.anInt8065 * 2048);
				}
				if (super.anInt8076 != 0) {
					local325.H(0, -super.anInt8076 << 2, 0);
				}
				if (local276) {
					if (super.anInt8102 != 0) {
						local325.FA(super.anInt8102);
					}
					if (super.anInt8082 != 0) {
						local325.VA(super.anInt8082);
					}
					if (super.anInt8096 != 0) {
						local325.H(0, super.anInt8096, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!saa;)V")
	public void method6702(@OriginalArg(1) Class300 arg0) {
		this.aClass300_1 = arg0;
		if (super.aClass15_Sub8_6 != null) {
			super.aClass15_Sub8_6.method6543();
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(Z)I")
	@Override
	public int method8321() {
		return this.aClass300_1 == null ? 0 : this.aClass300_1.anInt8899;
	}

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "(I)I")
	@Override
	public int method6685() {
		if (this.aClass300_1.anIntArray498 != null) {
			@Pc(22) Class300 local22 = this.aClass300_1.method7306(Static420.aClass77_1);
			if (local22 != null && local22.anInt8891 != -1) {
				return local22.anInt8891;
			}
		}
		return this.aClass300_1.anInt8891;
	}

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "(I)Z")
	public boolean method6703() {
		return this.aClass300_1 != null;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIZI)V")
	public void method6704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte124 = super.aByte125 = (byte) arg1;
		if (Static61.method1675(arg4, arg2)) {
			super.aByte125++;
		}
		if (super.anInt8105 != -1 && Static28.aClass220_1.method5670(super.anInt8105).anInt3607 == 1) {
			super.anInt8105 = -1;
			super.anIntArray434 = null;
		}
		@Pc(54) Class73 local54;
		if (super.anInt8058 != -1) {
			local54 = Static202.aClass333_2.method7823(super.anInt8058);
			if (local54.aBoolean202 && local54.anInt2718 != -1 && Static28.aClass220_1.method5670(local54.anInt2718).anInt3607 == 1) {
				super.anInt8058 = -1;
			}
		}
		if (super.anInt8074 != -1) {
			local54 = Static202.aClass333_2.method7823(super.anInt8074);
			if (local54.aBoolean202 && local54.anInt2718 != -1 && Static28.aClass220_1.method5670(local54.anInt2718).anInt3607 == 1) {
				super.anInt8074 = -1;
			}
		}
		if (!arg3) {
			@Pc(112) int local112 = arg2 - super.anIntArray435[0];
			@Pc(120) int local120 = arg4 - super.anIntArray436[0];
			if (local112 >= -8 && local112 <= 8 && local120 >= -8 && local120 <= 8) {
				if (super.anInt8137 < 9) {
					super.anInt8137++;
				}
				for (@Pc(149) int local149 = super.anInt8137; local149 > 0; local149--) {
					super.anIntArray435[local149] = super.anIntArray435[local149 - 1];
					super.anIntArray436[local149] = super.anIntArray436[local149 - 1];
					super.aByteArray69[local149] = super.aByteArray69[local149 - 1];
				}
				super.anIntArray435[0] = arg2;
				super.aByteArray69[0] = 1;
				super.anIntArray436[0] = arg4;
				return;
			}
		}
		super.anInt8137 = 0;
		super.anIntArray435[0] = arg2;
		super.anInt8140 = 0;
		super.anInt8138 = 0;
		super.anIntArray436[0] = arg4;
		super.anInt10301 = (arg0 << 8) + (super.anIntArray435[0] << 9);
		super.anInt10298 = (super.anIntArray436[0] << 9) + (arg0 << 8);
		if (super.aClass15_Sub8_6 != null) {
			super.aClass15_Sub8_6.method6543();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		if (this.aClass300_1 == null || !this.method6701(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class54 local19 = arg2.method6124();
		@Pc(31) int local31 = super.aClass371_7.method8432();
		local19.method5144(local31);
		local19.method5142(super.anInt10301, super.anInt10297, super.anInt10298);
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; super.aClass83Array3.length > local46; local46++) {
			if (super.aClass83Array3[local46] != null) {
				@Pc(69) boolean var10000;
				label41: {
					if (this.aClass300_1.anInt8899 <= 0) {
						label39: {
							if (this.aClass300_1.anInt8881 == -1) {
								if (this.aClass300_1.anInt8912 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass300_1.anInt8881 == 1) {
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
				@Pc(82) boolean local82 = var10000;
				@Pc(97) boolean local97;
				if (Static183.aBoolean308) {
					local97 = super.aClass83Array3[local46].method7994(arg0, arg1, local19, local82, this.aClass300_1.anInt8899, Static115.anInt3009);
				} else {
					local97 = super.aClass83Array3[local46].method8007(arg0, arg1, local19, local82, this.aClass300_1.anInt8899);
				}
				if (local97) {
					local44 = true;
					break;
				}
			}
		}
		super.aClass83Array3[0] = super.aClass83Array3[1] = super.aClass83Array3[2] = null;
		return local44;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)I")
	@Override
	public int method6695() {
		if (this.aClass300_1.anIntArray498 != null) {
			@Pc(21) Class300 local21 = this.aClass300_1.method7306(Static420.aClass77_1);
			if (local21 != null && local21.anInt8896 != -1) {
				return local21.anInt8896;
			}
		}
		return this.aClass300_1.anInt8896 == -1 ? super.method6695() : this.aClass300_1.anInt8896;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "(I)I")
	@Override
	protected int method6688() {
		if (this.aClass300_1.anIntArray498 != null) {
			@Pc(19) Class300 local19 = this.aClass300_1.method7306(Static420.aClass77_1);
			if (local19 != null && local19.anInt8914 != -1) {
				return local19.anInt8914;
			}
		}
		return this.aClass300_1.anInt8914;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		if (this.aClass300_1 == null || !this.method6701(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class54 local19 = arg0.method6124();
		@Pc(24) int local24 = super.aClass371_7.method8432();
		local19.method5144(local24);
		@Pc(42) Class56 local42 = Static405.aClass56ArrayArrayArray2[super.aByte124][super.anInt10301 >> Static172.anInt4156][super.anInt10298 >> Static172.anInt4156];
		if (local42 == null || local42.aClass15_Sub1_Sub3_1 == null) {
			super.anInt8068 = (int) ((float) super.anInt8068 - (float) super.anInt8068 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt8068 - local42.aClass15_Sub1_Sub3_1.aShort107;
			super.anInt8068 = (int) ((float) super.anInt8068 - (float) local55 / 10.0F);
		}
		local19.method5142(super.anInt10301, -super.anInt8068 + super.anInt10297 - 20, super.anInt10298);
		@Pc(105) Class102 local105 = this.method6686();
		@Pc(118) Class300 local118 = this.aClass300_1.anIntArray498 == null ? this.aClass300_1 : this.aClass300_1.method7306(Static420.aClass77_1);
		super.aBoolean586 = false;
		@Pc(123) Class15_Sub7 local123 = null;
		if (Static155.aClass8_Sub25_6.aClass36_Sub4_1.method3042() == 1 && local118.aBoolean629 && local105.aBoolean276) {
			@Pc(157) Class97 local157 = super.anInt8105 != -1 && super.anInt8094 == 0 ? Static28.aClass220_1.method5670(super.anInt8105) : null;
			@Pc(175) Class97 local175 = super.anInt8107 == -1 || super.aBoolean585 && local157 != null ? null : Static28.aClass220_1.method5670(super.anInt8107);
			@Pc(225) Class83 local225 = Static441.method6806(super.anInt8102, this.aClass300_1.aShort96 & 0xFFFF, this.aClass300_1.anInt8912, super.aClass83Array3[0], arg0, local175 == null ? super.anInt8063 : super.anInt8110, this.aClass300_1.aByte95 & 0xFF, super.anInt8082, local24, local175 == null ? local157 : local175, super.anInt8096, this.aClass300_1.aByte99 & 0xFF, this.aClass300_1.aShort97 & 0xFFFF);
			if (local225 != null) {
				local123 = Static342.method5465(this.method6708(), super.aClass83Array3.length + 1);
				super.aBoolean586 = true;
				arg0.C(false);
				if (Static183.aBoolean308) {
					local225.method8009(local19, local123.aClass15_Sub6Array1[super.aClass83Array3.length], Static115.anInt3009, 0);
				} else {
					local225.method8003(local19, local123.aClass15_Sub6Array1[super.aClass83Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method5144(local24);
		local19.method5142(super.anInt10301, super.anInt10297 - super.anInt8068 - 5, super.anInt10298);
		if (local123 == null) {
			local123 = Static342.method5465(this.method6708(), super.aClass83Array3.length);
		}
		this.method6697(local19, arg0, false, super.aClass83Array3);
		@Pc(313) int local313;
		if (Static183.aBoolean308) {
			for (local313 = 0; super.aClass83Array3.length > local313; local313++) {
				if (super.aClass83Array3[local313] != null) {
					super.aClass83Array3[local313].method8009(local19, local123.aClass15_Sub6Array1[local313], Static115.anInt3009, 0);
				}
			}
		} else {
			for (local313 = 0; super.aClass83Array3.length > local313; local313++) {
				if (super.aClass83Array3[local313] != null) {
					super.aClass83Array3[local313].method8003(local19, local123.aClass15_Sub6Array1[local313], 0);
				}
			}
		}
		if (super.aClass15_Sub8_6 != null) {
			@Pc(377) Class250 local377 = super.aClass15_Sub8_6.method6540();
			if (Static183.aBoolean308) {
				arg0.method6108(local377, Static115.anInt3009);
			} else {
				arg0.method6100(local377);
			}
		}
		for (local313 = 0; super.aClass83Array3.length > local313; local313++) {
			if (super.aClass83Array3[local313] != null) {
				super.aBoolean586 |= super.aClass83Array3[local313].F();
			}
		}
		super.anInt8051 = Static609.anInt9845;
		super.aClass83Array3[0] = super.aClass83Array3[1] = super.aClass83Array3[2] = null;
		return local123;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(III)V")
	public void method6707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray435[0];
		@Pc(15) int local15 = super.anIntArray436[0];
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
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt8105 != -1 && Static28.aClass220_1.method5670(super.anInt8105).anInt3607 == 1) {
			super.anInt8105 = -1;
			super.anIntArray434 = null;
		}
		@Pc(90) Class73 local90;
		if (super.anInt8058 != -1) {
			local90 = Static202.aClass333_2.method7823(super.anInt8058);
			if (local90.aBoolean202 && local90.anInt2718 != -1 && Static28.aClass220_1.method5670(local90.anInt2718).anInt3607 == 1) {
				super.anInt8058 = -1;
			}
		}
		if (super.anInt8074 != -1) {
			local90 = Static202.aClass333_2.method7823(super.anInt8074);
			if (local90.aBoolean202 && local90.anInt2718 != -1 && Static28.aClass220_1.method5670(local90.anInt2718).anInt3607 == 1) {
				super.anInt8074 = -1;
			}
		}
		if (super.anInt8137 < 9) {
			super.anInt8137++;
		}
		for (@Pc(156) int local156 = super.anInt8137; local156 > 0; local156--) {
			super.anIntArray435[local156] = super.anIntArray435[local156 - 1];
			super.anIntArray436[local156] = super.anIntArray436[local156 - 1];
			super.aByteArray69[local156] = super.aByteArray69[local156 - 1];
		}
		super.anIntArray435[0] = local10;
		super.aByteArray69[0] = (byte) arg1;
		super.anIntArray436[0] = local15;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
		if (this.aClass300_1 == null || !super.aBoolean587 && !this.method6701(arg0, 0)) {
			return;
		}
		@Pc(20) Class54 local20 = arg0.method6124();
		local20.method5144(super.aClass371_7.method8432());
		local20.method5142(super.anInt10301, super.anInt10297 - 20, super.anInt10298);
		this.method6697(local20, arg0, super.aBoolean587, super.aClass83Array3);
		super.aClass83Array3[0] = super.aClass83Array3[1] = super.aClass83Array3[2] = null;
	}

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "(I)Z")
	private boolean method6708() {
		return this.aClass300_1.aBoolean627;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		return null;
	}
}
