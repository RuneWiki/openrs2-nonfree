import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class4_Sub2_Sub1_Sub1_Sub2 extends Class4_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!cca", name = "nd", descriptor = "Lclient!maa;")
	public Class225 aClass225_1;

	@OriginalMember(owner = "client!cca", name = "pd", descriptor = "I")
	public int anInt1291 = -1;

	@OriginalMember(owner = "client!cca", name = "rd", descriptor = "I")
	public int anInt1293 = -1;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)I")
	@Override
	public int method1019() {
		if (this.aClass225_1.anIntArray304 != null) {
			@Pc(13) Class225 local13 = this.aClass225_1.method4990(Static301.aClass59_1);
			if (local13 != null && local13.anInt5641 != -1) {
				return local13.anInt5641;
			}
		}
		return this.aClass225_1.anInt5641;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)Z")
	private boolean method1039() {
		return this.aClass225_1.aBoolean409;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(III)V")
	public void method1040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray94[0];
		@Pc(15) int local15 = super.anIntArray95[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt1277 != -1 && Static435.aClass298_1.method7034(super.anInt1277).anInt10011 == 1) {
			super.anInt1277 = -1;
			super.anIntArray85 = null;
		}
		@Pc(91) Class82 local91;
		if (super.anInt1197 != -1) {
			local91 = Static52.aClass10_1.method211(super.anInt1197);
			if (local91.aBoolean157 && local91.anInt2052 != -1 && Static435.aClass298_1.method7034(local91.anInt2052).anInt10011 == 1) {
				super.anInt1197 = -1;
			}
		}
		if (super.anInt1276 != -1) {
			local91 = Static52.aClass10_1.method211(super.anInt1276);
			if (local91.aBoolean157 && local91.anInt2052 != -1 && Static435.aClass298_1.method7034(local91.anInt2052).anInt10011 == 1) {
				super.anInt1276 = -1;
			}
		}
		if (super.anInt1280 < 9) {
			super.anInt1280++;
		}
		for (@Pc(155) int local155 = super.anInt1280; local155 > 0; local155--) {
			super.anIntArray94[local155] = super.anIntArray94[local155 - 1];
			super.anIntArray95[local155] = super.anIntArray95[local155 - 1];
			super.aByteArray17[local155] = super.aByteArray17[local155 - 1];
		}
		super.anIntArray94[0] = local10;
		super.aByteArray17[0] = (byte) arg0;
		super.anIntArray95[0] = local15;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZIBII)V")
	public void method1041(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte132 = super.aByte131 = (byte) arg0;
		if (Static23.method285(arg3, arg2)) {
			super.aByte131++;
		}
		if (super.anInt1277 != -1 && Static435.aClass298_1.method7034(super.anInt1277).anInt10011 == 1) {
			super.anIntArray85 = null;
			super.anInt1277 = -1;
		}
		@Pc(57) Class82 local57;
		if (super.anInt1197 != -1) {
			local57 = Static52.aClass10_1.method211(super.anInt1197);
			if (local57.aBoolean157 && local57.anInt2052 != -1 && Static435.aClass298_1.method7034(local57.anInt2052).anInt10011 == 1) {
				super.anInt1197 = -1;
			}
		}
		if (super.anInt1276 != -1) {
			local57 = Static52.aClass10_1.method211(super.anInt1276);
			if (local57.aBoolean157 && local57.anInt2052 != -1 && Static435.aClass298_1.method7034(local57.anInt2052).anInt10011 == 1) {
				super.anInt1276 = -1;
			}
		}
		if (!arg1) {
			@Pc(116) int local116 = arg3 - super.anIntArray94[0];
			@Pc(124) int local124 = arg2 - super.anIntArray95[0];
			if (local116 >= -8 && local116 <= 8 && local124 >= -8 && local124 <= 8) {
				if (super.anInt1280 < 9) {
					super.anInt1280++;
				}
				for (@Pc(153) int local153 = super.anInt1280; local153 > 0; local153--) {
					super.anIntArray94[local153] = super.anIntArray94[local153 - 1];
					super.anIntArray95[local153] = super.anIntArray95[local153 - 1];
					super.aByteArray17[local153] = super.aByteArray17[local153 - 1];
				}
				super.anIntArray94[0] = arg3;
				super.anIntArray95[0] = arg2;
				super.aByteArray17[0] = 1;
				return;
			}
		}
		super.anInt1279 = 0;
		super.anInt1281 = 0;
		super.anInt1280 = 0;
		super.anIntArray94[0] = arg3;
		super.anIntArray95[0] = arg2;
		super.anInt10231 = (arg4 << 8) + (super.anIntArray94[0] << 9);
		super.anInt10229 = (arg4 << 8) + (super.anIntArray95[0] << 9);
		if (super.aClass4_Sub4_3 != null) {
			super.aClass4_Sub4_3.method1953();
		}
	}

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		if (this.aClass225_1 == null || !this.method1044(arg0, 2048)) {
			return null;
		}
		@Pc(21) Class113 local21 = arg0.method7262();
		@Pc(26) int local26 = super.aClass107_7.method2219();
		local21.method8459(local26);
		@Pc(44) Class217 local44 = Static421.aClass217ArrayArrayArray5[super.aByte132][super.anInt10231 >> Static115.anInt2156][super.anInt10229 >> Static115.anInt2156];
		if (local44 == null || local44.aClass4_Sub2_Sub2_1 == null) {
			super.anInt1198 = (int) ((float) super.anInt1198 - (float) super.anInt1198 / 10.0F);
		} else {
			@Pc(57) int local57 = super.anInt1198 - local44.aClass4_Sub2_Sub2_1.aShort64;
			super.anInt1198 = (int) ((float) super.anInt1198 - (float) local57 / 10.0F);
		}
		local21.method8454(super.anInt10231, -super.anInt1198 + super.anInt10228 - 20, super.anInt10229);
		@Pc(100) Class269 local100 = this.method1025();
		@Pc(113) Class225 local113 = this.aClass225_1.anIntArray304 == null ? this.aClass225_1 : this.aClass225_1.method4990(Static301.aClass59_1);
		super.aBoolean73 = false;
		@Pc(118) Class4_Sub6 local118 = null;
		if (Static97.aClass5_Sub25_8.aClass6_Sub26_1.method7930() == 1 && local113.aBoolean408 && local100.aBoolean518) {
			@Pc(151) Class362 local151 = super.anInt1277 != -1 && super.anInt1271 == 0 ? Static435.aClass298_1.method7034(super.anInt1277) : null;
			@Pc(169) Class362 local169 = super.anInt1264 == -1 || super.aBoolean70 && local151 != null ? null : Static435.aClass298_1.method7034(super.anInt1264);
			@Pc(221) Class187 local221 = Static609.method8685(super.anInt1239, super.anInt1250, local26, local169 == null ? local151 : local169, this.aClass225_1.aByte87 & 0xFF, local169 == null ? super.anInt1223 : super.anInt1208, super.aClass187Array3[0], this.aClass225_1.anInt5618, arg0, this.aClass225_1.aShort84 & 0xFFFF, super.anInt1195, this.aClass225_1.aByte89 & 0xFF, this.aClass225_1.aShort85 & 0xFFFF);
			if (local221 != null) {
				local118 = Static242.method4012(super.aClass187Array3.length + 1, this.method1039());
				super.aBoolean73 = true;
				arg0.C(false);
				if (Static57.aBoolean65) {
					local221.method8654(local21, local118.aClass4_Sub9Array1[super.aClass187Array3.length], Static469.anInt7885, 0);
				} else {
					local221.method8645(local21, local118.aClass4_Sub9Array1[super.aClass187Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local21.method8459(local26);
		local21.method8454(super.anInt10231, -super.anInt1198 + super.anInt10228 - 5, super.anInt10229);
		if (local118 == null) {
			local118 = Static242.method4012(super.aClass187Array3.length, this.method1039());
		}
		this.method1026(super.aClass187Array3, arg0, false, local21);
		@Pc(308) int local308;
		if (Static57.aBoolean65) {
			for (local308 = 0; local308 < super.aClass187Array3.length; local308++) {
				if (super.aClass187Array3[local308] != null) {
					super.aClass187Array3[local308].method8654(local21, local118.aClass4_Sub9Array1[local308], Static469.anInt7885, 0);
				}
			}
		} else {
			for (local308 = 0; local308 < super.aClass187Array3.length; local308++) {
				if (super.aClass187Array3[local308] != null) {
					super.aClass187Array3[local308].method8645(local21, local118.aClass4_Sub9Array1[local308], 0);
				}
			}
		}
		if (super.aClass4_Sub4_3 != null) {
			@Pc(376) Class235 local376 = super.aClass4_Sub4_3.method1961();
			if (Static57.aBoolean65) {
				arg0.method7302(local376, Static469.anInt7885);
			} else {
				arg0.method7308(local376);
			}
		}
		for (local308 = 0; super.aClass187Array3.length > local308; local308++) {
			if (super.aClass187Array3[local308] != null) {
				super.aBoolean73 |= super.aClass187Array3[local308].F();
			}
		}
		super.anInt1227 = Static96.anInt1932;
		super.aClass187Array3[0] = super.aClass187Array3[1] = super.aClass187Array3[2] = null;
		return local118;
	}

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "(I)I")
	@Override
	protected int method1034() {
		if (this.aClass225_1.anIntArray304 != null) {
			@Pc(15) Class225 local15 = this.aClass225_1.method4990(Static301.aClass59_1);
			if (local15 != null && local15.anInt5630 != -1) {
				return local15.anInt5630;
			}
		}
		return this.aClass225_1.anInt5630;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		if (this.aClass225_1 == null || !this.method1044(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class113 local19 = arg2.method7262();
		@Pc(24) int local24 = super.aClass107_7.method2219();
		local19.method8459(local24);
		local19.method8454(super.anInt10231, super.anInt10228, super.anInt10229);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; local47 < super.aClass187Array3.length; local47++) {
			if (super.aClass187Array3[local47] != null) {
				@Pc(72) boolean var10000;
				label41: {
					if (this.aClass225_1.anInt5628 <= 0) {
						label39: {
							if (this.aClass225_1.anInt5633 == -1) {
								if (this.aClass225_1.anInt5618 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass225_1.anInt5633 == 1) {
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
				@Pc(85) boolean local85 = var10000;
				@Pc(100) boolean local100;
				if (Static57.aBoolean65) {
					local100 = super.aClass187Array3[local47].method8641(arg0, arg1, local19, local85, this.aClass225_1.anInt5628, Static469.anInt7885);
				} else {
					local100 = super.aClass187Array3[local47].method8642(arg0, arg1, local19, local85, this.aClass225_1.anInt5628);
				}
				if (local100) {
					local45 = true;
					break;
				}
			}
		}
		super.aClass187Array3[0] = super.aClass187Array3[1] = super.aClass187Array3[2] = null;
		return local45;
	}

	@OriginalMember(owner = "client!cca", name = "r", descriptor = "(I)Z")
	public boolean method1042() {
		return this.aClass225_1 != null;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)I")
	@Override
	public int method1023() {
		if (this.aClass225_1.anIntArray304 != null) {
			@Pc(21) Class225 local21 = this.aClass225_1.method4990(Static301.aClass59_1);
			if (local21 != null && local21.anInt5645 != -1) {
				return local21.anInt5645;
			}
		}
		return this.aClass225_1.anInt5645 == -1 ? super.method1023() : this.aClass225_1.anInt5645;
	}

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method1044(@OriginalArg(0) Class133 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1;
		@Pc(16) Class269 local16 = this.method1025();
		@Pc(35) Class362 local35 = super.anInt1277 != -1 && super.anInt1271 == 0 ? Static435.aClass298_1.method7034(super.anInt1277) : null;
		@Pc(53) Class362 local53 = super.anInt1264 == -1 || super.aBoolean70 && local35 != null ? null : Static435.aClass298_1.method7034(super.anInt1264);
		@Pc(56) int local56 = local16.anInt7267;
		@Pc(59) int local59 = local16.anInt7272;
		if (local56 != 0 || local59 != 0 || local16.anInt7270 != 0 || local16.anInt7245 != 0) {
			arg1 |= 0x7;
		}
		@Pc(101) boolean local101 = super.aByte41 != 0 && super.anInt1236 <= Static631.anInt10493 && super.anInt1234 > Static631.anInt10493;
		if (local101) {
			arg1 |= 0x80000;
		}
		@Pc(112) int local112 = super.aClass107_7.method2219();
		@Pc(146) Class187 local146 = super.aClass187Array3[0] = this.aClass225_1.method4992(Static301.aClass59_1, Static147.aClass238_1, super.anIntArray89, local112, arg1, super.anInt1201, super.anInt1223, local35, Static435.aClass298_1, local53, super.anInt1274, super.anInt1211, super.aClass228Array3, super.anInt1208, arg0, super.anInt1226);
		if (local146 == null) {
			return false;
		}
		super.anInt1206 = local146.fa();
		super.anInt1257 = local146.ma();
		this.method1028(local146);
		if (local56 == 0 && local59 == 0) {
			this.method1029(0, this.method1018() << 9, this.method1018() << 9, local112, 0);
		} else {
			this.method1029(local16.anInt7281, local59, local56, local112, local16.anInt7286);
			if (super.anInt1195 != 0) {
				super.aClass187Array3[0].FA(super.anInt1195);
			}
			if (super.anInt1250 != 0) {
				super.aClass187Array3[0].VA(super.anInt1250);
			}
			if (super.anInt1239 != 0) {
				super.aClass187Array3[0].H(0, super.anInt1239, 0);
			}
		}
		if (local101) {
			local146.method8646(super.aByte37, super.aByte39, super.aByte40, super.aByte41 & 0xFF);
		}
		@Pc(265) Class82 local265;
		@Pc(282) boolean local282;
		@Pc(284) int local284;
		@Pc(337) Class187 local337;
		@Pc(355) int local355;
		@Pc(357) int local357;
		@Pc(359) int local359;
		@Pc(446) int local446;
		@Pc(474) int local474;
		@Pc(486) int local486;
		@Pc(490) int local490;
		@Pc(500) int local500;
		if (super.anInt1197 == -1 || super.anInt1251 == -1) {
			super.aClass187Array3[1] = null;
		} else {
			local265 = Static52.aClass10_1.method211(super.anInt1197);
			local282 = local265.aByte50 == 3 && (local56 != 0 || local59 != 0);
			local284 = local12;
			if (local282) {
				local284 = local12 | 0x7;
			} else {
				if (super.anInt1233 != 0) {
					local284 = local12 | 0x5;
				}
				if (super.anInt1267 != 0) {
					local284 |= 0x2;
				}
				if (super.anInt1200 >= 0) {
					local284 |= 0x7;
				}
			}
			local337 = super.aClass187Array3[1] = local265.method1684(local284, arg0, super.anInt1202, super.anInt1251, Static435.aClass298_1, super.anInt1269);
			if (local337 != null) {
				if (super.anInt1200 >= 0) {
					local355 = 0;
					local357 = 0;
					local359 = 0;
					if (local16.anIntArrayArray50 != null && local16.anIntArrayArray50[super.anInt1200] != null) {
						local355 = local16.anIntArrayArray50[super.anInt1200][0];
						local357 = local16.anIntArrayArray50[super.anInt1200][1];
						local359 = local16.anIntArrayArray50[super.anInt1200][2];
					}
					if (local16.anIntArrayArray51 != null && local16.anIntArrayArray51[super.anInt1200] != null) {
						local359 += local16.anIntArrayArray51[super.anInt1200][2];
						local357 += local16.anIntArrayArray51[super.anInt1200][1];
						local355 += local16.anIntArrayArray51[super.anInt1200][0];
					}
					if (local359 != 0 || local355 != 0) {
						local446 = local112;
						if (super.anIntArray89 != null && super.anIntArray89[super.anInt1200] != -1) {
							local446 = super.anIntArray89[super.anInt1200];
						}
						local474 = local446 + super.anInt1233 * 2048 - local112 & 0x3FFF;
						if (local474 != 0) {
							local337.a(local474);
						}
						local486 = Class377.anIntArray600[local474];
						local490 = Class377.anIntArray601[local474];
						local500 = local355 * local490 + local486 * local359 >> 14;
						local359 = local490 * local359 - local355 * local486 >> 14;
						local355 = local500;
					}
					local337.H(local355, local357, local359);
				} else if (super.anInt1233 != 0) {
					local337.a(super.anInt1233 * 2048);
				}
				if (super.anInt1267 != 0) {
					local337.H(0, -super.anInt1267 << 2, 0);
				}
				if (local282) {
					if (super.anInt1195 != 0) {
						local337.FA(super.anInt1195);
					}
					if (super.anInt1250 != 0) {
						local337.VA(super.anInt1250);
					}
					if (super.anInt1239 != 0) {
						local337.H(0, super.anInt1239, 0);
					}
				}
			}
		}
		if (super.anInt1276 == -1 || super.anInt1228 == -1) {
			super.aClass187Array3[2] = null;
		} else {
			local265 = Static52.aClass10_1.method211(super.anInt1276);
			local282 = local265.aByte50 == 3 && (local56 != 0 || local59 != 0);
			local284 = local12;
			if (local282) {
				local284 = local12 | 0x7;
			} else {
				if (super.anInt1262 != 0) {
					local284 = local12 | 0x5;
				}
				if (super.anInt1224 != 0) {
					local284 |= 0x2;
				}
				if (super.anInt1247 >= 0) {
					local284 |= 0x7;
				}
			}
			local337 = super.aClass187Array3[2] = local265.method1687(Static435.aClass298_1, super.anInt1222, super.anInt1259, arg0, super.anInt1228, local284);
			if (local337 != null) {
				if (super.anInt1247 >= 0 && local16.anIntArrayArray50 != null && local16.anIntArrayArray50[super.anInt1247] != null) {
					local355 = 0;
					local357 = 0;
					local359 = 0;
					if (local16.anIntArrayArray50 != null && local16.anIntArrayArray50[super.anInt1247] != null) {
						local355 = local16.anIntArrayArray50[super.anInt1247][0];
						local359 = local16.anIntArrayArray50[super.anInt1247][2];
						local357 = local16.anIntArrayArray50[super.anInt1247][1];
					}
					if (local16.anIntArrayArray51 != null && local16.anIntArrayArray51[super.anInt1247] != null) {
						local357 += local16.anIntArrayArray51[super.anInt1247][1];
						local359 += local16.anIntArrayArray51[super.anInt1247][2];
						local355 += local16.anIntArrayArray51[super.anInt1247][0];
					}
					if (local359 != 0 || local355 != 0) {
						local446 = local112;
						if (super.anIntArray89 != null && super.anIntArray89[super.anInt1247] != -1) {
							local446 = super.anIntArray89[super.anInt1247];
						}
						local474 = local446 + super.anInt1262 * 2048 - local112 & 0x3FFF;
						if (local474 != 0) {
							local337.a(local474);
						}
						local486 = Class377.anIntArray600[local474];
						local490 = Class377.anIntArray601[local474];
						local500 = local359 * local486 + local355 * local490 >> 14;
						local359 = local490 * local359 - local486 * local355 >> 14;
						local355 = local500;
					}
					local337.H(local355, local357, local359);
				} else if (super.anInt1262 != 0) {
					local337.a(super.anInt1262 * 2048);
				}
				if (super.anInt1224 != 0) {
					local337.H(0, -super.anInt1224 << 2, 0);
				}
				if (local282) {
					if (super.anInt1195 != 0) {
						local337.FA(super.anInt1195);
					}
					if (super.anInt1250 != 0) {
						local337.VA(super.anInt1250);
					}
					if (super.anInt1239 != 0) {
						local337.H(0, super.anInt1239, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!maa;)V")
	public void method1045(@OriginalArg(1) Class225 arg0) {
		this.aClass225_1 = arg0;
		if (super.aClass4_Sub4_3 != null) {
			super.aClass4_Sub4_3.method1953();
		}
	}

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "(I)I")
	@Override
	public int method8716() {
		return this.aClass225_1 == null ? 0 : this.aClass225_1.anInt5628;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
		if (this.aClass225_1 == null || !super.aBoolean74 && !this.method1044(arg0, 0)) {
			return;
		}
		@Pc(24) Class113 local24 = arg0.method7262();
		local24.method8459(super.aClass107_7.method2219());
		local24.method8454(super.anInt10231, super.anInt10228 - 20, super.anInt10229);
		this.method1026(super.aClass187Array3, arg0, super.aBoolean74, local24);
		super.aClass187Array3[0] = super.aClass187Array3[1] = super.aClass187Array3[2] = null;
	}
}
