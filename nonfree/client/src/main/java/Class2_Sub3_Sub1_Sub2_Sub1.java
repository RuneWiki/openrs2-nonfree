import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class2_Sub3_Sub1_Sub2_Sub1 extends Class2_Sub3_Sub1_Sub2 {

	@OriginalMember(owner = "client!dv", name = "qd", descriptor = "Lclient!at;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!dv", name = "id", descriptor = "I")
	public int anInt2889 = -1;

	@OriginalMember(owner = "client!dv", name = "pd", descriptor = "I")
	public int anInt2896 = -1;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "(I)I")
	@Override
	public int method8578() {
		return this.aClass22_1 == null ? 0 : this.aClass22_1.anInt388;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!at;)V")
	public void method2679(@OriginalArg(1) Class22 arg0) {
		this.aClass22_1 = arg0;
		if (super.aClass2_Sub2_6 != null) {
			super.aClass2_Sub2_6.method234();
		}
	}

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "(I)Z")
	private boolean method2680() {
		return this.aClass22_1.aBoolean38;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BILclient!ha;)Z")
	private boolean method2681(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class232 local11 = this.method5304();
		@Pc(26) Class290 local26 = super.anInt6306 != -1 && super.anInt6297 == 0 ? Static618.aClass222_2.method5867(super.anInt6306) : null;
		@Pc(44) Class290 local44 = super.anInt6273 == -1 || super.aBoolean531 && local26 != null ? null : Static618.aClass222_2.method5867(super.anInt6273);
		@Pc(47) int local47 = local11.anInt7180;
		@Pc(50) int local50 = local11.anInt7148;
		if (local47 != 0 || local50 != 0 || local11.anInt7152 != 0 || local11.anInt7168 != 0) {
			arg0 |= 0x7;
		}
		@Pc(89) boolean local89 = super.aByte80 != 0 && super.anInt6274 <= Static251.anInt5580 && super.anInt6268 > Static251.anInt5580;
		if (local89) {
			arg0 |= 0x80000;
		}
		@Pc(102) int local102 = super.aClass145_7.method4535();
		@Pc(136) Class128 local136 = super.aClass128Array3[0] = this.aClass22_1.method424(Static514.aClass166_1, super.aClass98Array3, super.anIntArray373, super.anInt6313, super.anInt6336, local44, arg0, super.anInt6337, super.anInt6315, local26, Static618.aClass222_2, Static367.aClass285_1, super.anInt6314, super.anInt6267, local102, arg1);
		if (local136 == null) {
			return false;
		}
		super.anInt6296 = local136.fa();
		super.anInt6309 = local136.ma();
		this.method5312(local136);
		if (local47 == 0 && local50 == 0) {
			this.method5307(0, local102, this.method5308() << 9, 0, this.method5308() << 9);
		} else {
			this.method5307(local11.anInt7149, local102, local50, local11.anInt7169, local47);
			if (super.anInt6293 != 0) {
				super.aClass128Array3[0].FA(super.anInt6293);
			}
			if (super.anInt6266 != 0) {
				super.aClass128Array3[0].VA(super.anInt6266);
			}
			if (super.anInt6265 != 0) {
				super.aClass128Array3[0].H(0, super.anInt6265, 0);
			}
		}
		if (local89) {
			local136.method6289(super.aByte79, super.aByte82, super.aByte78, super.aByte80 & 0xFF);
		}
		@Pc(255) Class268 local255;
		@Pc(272) boolean local272;
		@Pc(274) int local274;
		@Pc(330) Class128 local330;
		@Pc(337) int local337;
		@Pc(339) int local339;
		@Pc(341) int local341;
		@Pc(431) int local431;
		@Pc(460) int local460;
		@Pc(472) int local472;
		@Pc(476) int local476;
		@Pc(486) int local486;
		if (super.anInt6321 == -1 || super.anInt6325 == -1) {
			super.aClass128Array3[1] = null;
		} else {
			local255 = Static35.aClass343_1.method8033(super.anInt6321);
			local272 = local255.aByte97 == 3 && (local47 != 0 || local50 != 0);
			local274 = local7;
			if (local272) {
				local274 = local7 | 0x7;
			} else {
				if (super.anInt6257 != 0) {
					local274 = local7 | 0x5;
				}
				if (super.anInt6308 != 0) {
					local274 |= 0x2;
				}
				if (super.anInt6327 >= 0) {
					local274 |= 0x7;
				}
			}
			local330 = super.aClass128Array3[1] = local255.method6746(arg1, Static618.aClass222_2, local274, super.anInt6325, super.anInt6295, super.anInt6340);
			if (local330 != null) {
				if (super.anInt6327 >= 0) {
					local337 = 0;
					local339 = 0;
					local341 = 0;
					if (local11.anIntArrayArray66 != null && local11.anIntArrayArray66[super.anInt6327] != null) {
						local341 = local11.anIntArrayArray66[super.anInt6327][2];
						local339 = local11.anIntArrayArray66[super.anInt6327][1];
						local337 = local11.anIntArrayArray66[super.anInt6327][0];
					}
					if (local11.anIntArrayArray65 != null && local11.anIntArrayArray65[super.anInt6327] != null) {
						local339 += local11.anIntArrayArray65[super.anInt6327][1];
						local337 += local11.anIntArrayArray65[super.anInt6327][0];
						local341 += local11.anIntArrayArray65[super.anInt6327][2];
					}
					if (local341 != 0 || local337 != 0) {
						local431 = local102;
						if (super.anIntArray373 != null && super.anIntArray373[super.anInt6327] != -1) {
							local431 = super.anIntArray373[super.anInt6327];
						}
						local460 = super.anInt6257 * 2048 + local431 - local102 & 0x3FFF;
						if (local460 != 0) {
							local330.a(local460);
						}
						local472 = Class3_Sub1_Sub2.anIntArray84[local460];
						local476 = Class3_Sub1_Sub2.anIntArray85[local460];
						local486 = local337 * local476 + local341 * local472 >> 14;
						local341 = local341 * local476 - local337 * local472 >> 14;
						local337 = local486;
					}
					local330.H(local337, local339, local341);
				} else if (super.anInt6257 != 0) {
					local330.a(super.anInt6257 * 2048);
				}
				if (super.anInt6308 != 0) {
					local330.H(0, -super.anInt6308 << 2, 0);
				}
				if (local272) {
					if (super.anInt6293 != 0) {
						local330.FA(super.anInt6293);
					}
					if (super.anInt6266 != 0) {
						local330.VA(super.anInt6266);
					}
					if (super.anInt6265 != 0) {
						local330.H(0, super.anInt6265, 0);
					}
				}
			}
		}
		if (super.anInt6299 == -1 || super.anInt6270 == -1) {
			super.aClass128Array3[2] = null;
		} else {
			local255 = Static35.aClass343_1.method8033(super.anInt6299);
			local272 = local255.aByte97 == 3 && (local47 != 0 || local50 != 0);
			local274 = local7;
			if (local272) {
				local274 = local7 | 0x7;
			} else {
				if (super.anInt6304 != 0) {
					local274 = local7 | 0x5;
				}
				if (super.anInt6323 != 0) {
					local274 |= 0x2;
				}
				if (super.anInt6300 >= 0) {
					local274 |= 0x7;
				}
			}
			local330 = super.aClass128Array3[2] = local255.method6745(Static618.aClass222_2, super.anInt6270, arg1, super.anInt6277, super.anInt6318, local274);
			if (local330 != null) {
				if (super.anInt6300 >= 0 && local11.anIntArrayArray66 != null && local11.anIntArrayArray66[super.anInt6300] != null) {
					local337 = 0;
					local339 = 0;
					local341 = 0;
					if (local11.anIntArrayArray66 != null && local11.anIntArrayArray66[super.anInt6300] != null) {
						local341 = local11.anIntArrayArray66[super.anInt6300][2];
						local339 = local11.anIntArrayArray66[super.anInt6300][1];
						local337 = local11.anIntArrayArray66[super.anInt6300][0];
					}
					if (local11.anIntArrayArray65 != null && local11.anIntArrayArray65[super.anInt6300] != null) {
						local337 += local11.anIntArrayArray65[super.anInt6300][0];
						local339 += local11.anIntArrayArray65[super.anInt6300][1];
						local341 += local11.anIntArrayArray65[super.anInt6300][2];
					}
					if (local341 != 0 || local337 != 0) {
						local431 = local102;
						if (super.anIntArray373 != null && super.anIntArray373[super.anInt6300] != -1) {
							local431 = super.anIntArray373[super.anInt6300];
						}
						local460 = local431 + super.anInt6304 * 2048 - local102 & 0x3FFF;
						if (local460 != 0) {
							local330.a(local460);
						}
						local472 = Class3_Sub1_Sub2.anIntArray84[local460];
						local476 = Class3_Sub1_Sub2.anIntArray85[local460];
						local486 = local341 * local472 + local337 * local476 >> 14;
						local341 = local476 * local341 - local472 * local337 >> 14;
						local337 = local486;
					}
					local330.H(local337, local339, local341);
				} else if (super.anInt6304 != 0) {
					local330.a(super.anInt6304 * 2048);
				}
				if (super.anInt6323 != 0) {
					local330.H(0, -super.anInt6323 << 2, 0);
				}
				if (local272) {
					if (super.anInt6293 != 0) {
						local330.FA(super.anInt6293);
					}
					if (super.anInt6266 != 0) {
						local330.VA(super.anInt6266);
					}
					if (super.anInt6265 != 0) {
						local330.H(0, super.anInt6265, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		if (this.aClass22_1 == null || !this.method2681(131072, arg2)) {
			return false;
		}
		@Pc(24) Class47 local24 = arg2.method6225();
		@Pc(31) int local31 = super.aClass145_7.method4535();
		local24.method7873(local31);
		local24.method7876(super.anInt10428, super.anInt10429, super.anInt10424);
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; local46 < super.aClass128Array3.length; local46++) {
			if (super.aClass128Array3[local46] != null) {
				@Pc(73) boolean var10000;
				label41: {
					if (this.aClass22_1.anInt388 <= 0) {
						label39: {
							if (this.aClass22_1.anInt403 == -1) {
								if (this.aClass22_1.anInt404 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass22_1.anInt403 == 1) {
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
				@Pc(88) boolean local88 = var10000;
				@Pc(104) boolean local104;
				if (Static216.aBoolean440) {
					local104 = super.aClass128Array3[local46].method6283(arg0, arg1, local24, local88, this.aClass22_1.anInt388, Static467.anInt8440);
				} else {
					local104 = super.aClass128Array3[local46].method6296(arg0, arg1, local24, local88, this.aClass22_1.anInt388);
				}
				if (local104) {
					local44 = true;
					break;
				}
			}
		}
		super.aClass128Array3[0] = super.aClass128Array3[1] = super.aClass128Array3[2] = null;
		return local44;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
		if (this.aClass22_1 == null || !super.aBoolean536 && !this.method2681(0, arg0)) {
			return;
		}
		@Pc(26) Class47 local26 = arg0.method6225();
		local26.method7873(super.aClass145_7.method4535());
		local26.method7876(super.anInt10428, super.anInt10429 - 20, super.anInt10424);
		this.method5314(super.aBoolean536, super.aClass128Array3, local26, arg0);
		super.aClass128Array3[0] = super.aClass128Array3[1] = super.aClass128Array3[2] = null;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)I")
	@Override
	public int method5305() {
		if (this.aClass22_1.anIntArray29 != null) {
			@Pc(13) Class22 local13 = this.aClass22_1.method425(Static514.aClass166_1);
			if (local13 != null && local13.anInt421 != -1) {
				return local13.anInt421;
			}
		}
		return this.aClass22_1.anInt421;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZIIIII)V")
	public void method2683(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte128 = super.aByte129 = (byte) arg3;
		if (Static525.method7485(arg1, arg4)) {
			super.aByte129++;
		}
		if (super.anInt6306 != -1 && Static618.aClass222_2.method5867(super.anInt6306).anInt8693 == 1) {
			super.anInt6306 = -1;
			super.anIntArray376 = null;
		}
		@Pc(65) Class268 local65;
		if (super.anInt6321 != -1) {
			local65 = Static35.aClass343_1.method8033(super.anInt6321);
			if (local65.aBoolean688 && local65.anInt8068 != -1 && Static618.aClass222_2.method5867(local65.anInt8068).anInt8693 == 1) {
				super.anInt6321 = -1;
			}
		}
		if (super.anInt6299 != -1) {
			local65 = Static35.aClass343_1.method8033(super.anInt6299);
			if (local65.aBoolean688 && local65.anInt8068 != -1 && Static618.aClass222_2.method5867(local65.anInt8068).anInt8693 == 1) {
				super.anInt6299 = -1;
			}
		}
		if (!arg0) {
			@Pc(125) int local125 = arg4 - super.anIntArray378[0];
			@Pc(133) int local133 = arg1 - super.anIntArray377[0];
			if (local125 >= -8 && local125 <= 8 && local133 >= -8 && local133 <= 8) {
				if (super.anInt6343 < 9) {
					super.anInt6343++;
				}
				for (@Pc(162) int local162 = super.anInt6343; local162 > 0; local162--) {
					super.anIntArray378[local162] = super.anIntArray378[local162 - 1];
					super.anIntArray377[local162] = super.anIntArray377[local162 - 1];
					super.aByteArray69[local162] = super.aByteArray69[local162 - 1];
				}
				super.anIntArray378[0] = arg4;
				super.anIntArray377[0] = arg1;
				super.aByteArray69[0] = 1;
				return;
			}
		}
		super.anIntArray378[0] = arg4;
		super.anInt6346 = 0;
		super.anInt6345 = 0;
		super.anInt6343 = 0;
		super.anIntArray377[0] = arg1;
		super.anInt10424 = (arg2 << 8) + (super.anIntArray377[0] << 9);
		super.anInt10428 = (arg2 << 8) + (super.anIntArray378[0] << 9);
		if (super.aClass2_Sub2_6 != null) {
			super.aClass2_Sub2_6.method234();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIB)V")
	public void method2684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray378[0];
		@Pc(15) int local15 = super.anIntArray377[0];
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
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.anInt6306 != -1 && Static618.aClass222_2.method5867(super.anInt6306).anInt8693 == 1) {
			super.anInt6306 = -1;
			super.anIntArray376 = null;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		@Pc(90) Class268 local90;
		if (super.anInt6321 != -1) {
			local90 = Static35.aClass343_1.method8033(super.anInt6321);
			if (local90.aBoolean688 && local90.anInt8068 != -1 && Static618.aClass222_2.method5867(local90.anInt8068).anInt8693 == 1) {
				super.anInt6321 = -1;
			}
		}
		if (super.anInt6299 != -1) {
			local90 = Static35.aClass343_1.method8033(super.anInt6299);
			if (local90.aBoolean688 && local90.anInt8068 != -1 && Static618.aClass222_2.method5867(local90.anInt8068).anInt8693 == 1) {
				super.anInt6299 = -1;
			}
		}
		if (super.anInt6343 < 9) {
			super.anInt6343++;
		}
		for (@Pc(152) int local152 = super.anInt6343; local152 > 0; local152--) {
			super.anIntArray378[local152] = super.anIntArray378[local152 - 1];
			super.anIntArray377[local152] = super.anIntArray377[local152 - 1];
			super.aByteArray69[local152] = super.aByteArray69[local152 - 1];
		}
		super.anIntArray378[0] = local10;
		super.aByteArray69[0] = (byte) arg0;
		super.anIntArray377[0] = local15;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "(I)I")
	@Override
	protected int method5321() {
		if (this.aClass22_1.anIntArray29 != null) {
			@Pc(13) Class22 local13 = this.aClass22_1.method425(Static514.aClass166_1);
			if (local13 != null && local13.anInt425 != -1) {
				return local13.anInt425;
			}
		}
		return this.aClass22_1.anInt425;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		if (this.aClass22_1 == null || !this.method2681(2048, arg0)) {
			return null;
		}
		@Pc(27) Class47 local27 = arg0.method6225();
		@Pc(32) int local32 = super.aClass145_7.method4535();
		local27.method7873(local32);
		@Pc(50) Class106 local50 = Static170.aClass106ArrayArrayArray1[super.aByte128][super.anInt10428 >> Static276.anInt5846][super.anInt10424 >> Static276.anInt5846];
		if (local50 == null || local50.aClass2_Sub3_Sub5_1 == null) {
			super.anInt6301 = (int) ((float) super.anInt6301 - (float) super.anInt6301 / 10.0F);
		} else {
			@Pc(77) int local77 = super.anInt6301 - local50.aClass2_Sub3_Sub5_1.aShort116;
			super.anInt6301 = (int) ((float) super.anInt6301 - (float) local77 / 10.0F);
		}
		local27.method7876(super.anInt10428, -super.anInt6301 + super.anInt10429 - 20, super.anInt10424);
		@Pc(106) Class232 local106 = this.method5304();
		@Pc(119) Class22 local119 = this.aClass22_1.anIntArray29 == null ? this.aClass22_1 : this.aClass22_1.method425(Static514.aClass166_1);
		super.aBoolean535 = false;
		@Pc(124) Class2_Sub6 local124 = null;
		if (Static552.aClass3_Sub48_30.aClass23_Sub13_1.method3796() == 1 && local119.aBoolean40 && local106.aBoolean623) {
			@Pc(154) Class290 local154 = super.anInt6306 != -1 && super.anInt6297 == 0 ? Static618.aClass222_2.method5867(super.anInt6306) : null;
			@Pc(174) Class290 local174 = super.anInt6273 == -1 || super.aBoolean531 && local154 != null ? null : Static618.aClass222_2.method5867(super.anInt6273);
			@Pc(224) Class128 local224 = Static245.method4650(arg0, this.aClass22_1.aShort9 & 0xFFFF, super.anInt6266, this.aClass22_1.aByte12 & 0xFF, local32, super.anInt6293, local174 == null ? local154 : local174, super.aClass128Array3[0], super.anInt6265, local174 == null ? super.anInt6315 : super.anInt6314, this.aClass22_1.anInt404, this.aClass22_1.aByte10 & 0xFF, this.aClass22_1.aShort10 & 0xFFFF);
			if (local224 != null) {
				local124 = Static481.method2823(super.aClass128Array3.length + 1, this.method2680());
				super.aBoolean535 = true;
				arg0.C(false);
				if (Static216.aBoolean440) {
					local224.method6294(local27, local124.aClass2_Sub5Array1[super.aClass128Array3.length], Static467.anInt8440, 0);
				} else {
					local224.method6281(local27, local124.aClass2_Sub5Array1[super.aClass128Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local27.method7873(local32);
		local27.method7876(super.anInt10428, super.anInt10429 - super.anInt6301 - 5, super.anInt10424);
		if (local124 == null) {
			local124 = Static481.method2823(super.aClass128Array3.length, this.method2680());
		}
		this.method5314(false, super.aClass128Array3, local27, arg0);
		@Pc(313) int local313;
		if (Static216.aBoolean440) {
			for (local313 = 0; super.aClass128Array3.length > local313; local313++) {
				if (super.aClass128Array3[local313] != null) {
					super.aClass128Array3[local313].method6294(local27, local124.aClass2_Sub5Array1[local313], Static467.anInt8440, 0);
				}
			}
		} else {
			for (local313 = 0; local313 < super.aClass128Array3.length; local313++) {
				if (super.aClass128Array3[local313] != null) {
					super.aClass128Array3[local313].method6281(local27, local124.aClass2_Sub5Array1[local313], 0);
				}
			}
		}
		if (super.aClass2_Sub2_6 != null) {
			@Pc(381) Class40 local381 = super.aClass2_Sub2_6.method222();
			if (Static216.aBoolean440) {
				arg0.method6214(local381, Static467.anInt8440);
			} else {
				arg0.method6160(local381);
			}
		}
		for (local313 = 0; local313 < super.aClass128Array3.length; local313++) {
			if (super.aClass128Array3[local313] != null) {
				super.aBoolean535 |= super.aClass128Array3[local313].F();
			}
		}
		super.anInt6316 = Static469.anInt8476;
		super.aClass128Array3[0] = super.aClass128Array3[1] = super.aClass128Array3[2] = null;
		return local124;
	}

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "(I)Z")
	public boolean method2686() {
		return this.aClass22_1 != null;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)I")
	@Override
	public int method5306() {
		if (this.aClass22_1.anIntArray29 != null) {
			@Pc(13) Class22 local13 = this.aClass22_1.method425(Static514.aClass166_1);
			if (local13 != null && local13.anInt386 != -1) {
				return local13.anInt386;
			}
		}
		return this.aClass22_1.anInt386 == -1 ? super.method5306() : this.aClass22_1.anInt386;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
