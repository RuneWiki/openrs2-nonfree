import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class9_Sub1_Sub1_Sub2_Sub1 extends Class9_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!an", name = "rd", descriptor = "Lclient!rr;")
	public Class294 aClass294_1;

	@OriginalMember(owner = "client!an", name = "dd", descriptor = "I")
	public int anInt515 = -1;

	@OriginalMember(owner = "client!an", name = "Xc", descriptor = "I")
	public int anInt509 = -1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass294_1 == null || !this.method423(131072, arg0)) {
			return false;
		}
		@Pc(19) Class109 local19 = arg0.method7142();
		@Pc(24) int local24 = super.aClass147_7.method3814();
		local19.o(local24);
		local19.U(super.anInt8975, super.anInt8977, super.anInt8980);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass57Array3.length > local39; local39++) {
			if (super.aClass57Array3[local39] != null) {
				@Pc(69) boolean local69 = this.aClass294_1.anInt7592 == -1 ? this.aClass294_1.anInt7615 == 1 : this.aClass294_1.anInt7592 == 1;
				@Pc(81) boolean local81;
				if (Static225.aBoolean335) {
					local81 = super.aClass57Array3[local39].method7509(arg1, arg2, local19, local69, Static354.anInt6136);
				} else {
					local81 = super.aClass57Array3[local39].method7507(arg1, arg2, local19, local69);
				}
				if (local81) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIZII)V")
	public void method417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte126 = super.aByte125 = (byte) arg1;
		if (Static425.method6053(arg4, arg0)) {
			super.aByte125++;
		}
		if (super.anInt6453 != -1 && Static330.aClass279_2.method6216(super.anInt6453).anInt560 == 1) {
			super.anIntArray515 = null;
			super.anInt6453 = -1;
		}
		@Pc(53) Class175 local53;
		if (super.anInt6424 != -1) {
			local53 = Static547.aClass248_2.method5708(super.anInt6424);
			if (local53.aBoolean386 && local53.anInt4956 != -1 && Static330.aClass279_2.method6216(local53.anInt4956).anInt560 == 1) {
				super.anInt6424 = -1;
			}
		}
		if (super.anInt6384 != -1) {
			local53 = Static547.aClass248_2.method5708(super.anInt6384);
			if (local53.aBoolean386 && local53.anInt4956 != -1 && Static330.aClass279_2.method6216(local53.anInt4956).anInt560 == 1) {
				super.anInt6384 = -1;
			}
		}
		if (!arg2) {
			@Pc(113) int local113 = arg4 - super.anIntArray518[0];
			@Pc(121) int local121 = arg0 - super.anIntArray517[0];
			if (local113 >= -8 && local113 <= 8 && local121 >= -8 && local121 <= 8) {
				if (super.anInt6468 < 9) {
					super.anInt6468++;
				}
				for (@Pc(150) int local150 = super.anInt6468; local150 > 0; local150--) {
					super.anIntArray518[local150] = super.anIntArray518[local150 - 1];
					super.anIntArray517[local150] = super.anIntArray517[local150 - 1];
					super.aByteArray84[local150] = super.aByteArray84[local150 - 1];
				}
				super.anIntArray518[0] = arg4;
				super.anIntArray517[0] = arg0;
				super.aByteArray84[0] = 1;
				return;
			}
		}
		super.anIntArray518[0] = arg4;
		super.anInt6468 = 0;
		super.anInt6469 = 0;
		super.anInt6467 = 0;
		super.anIntArray517[0] = arg0;
		super.anInt8980 = (super.anIntArray517[0] << 9) + (arg3 << 8);
		super.anInt8975 = (arg3 << 8) + (super.anIntArray518[0] << 9);
		if (super.aClass9_Sub6_7 != null) {
			super.aClass9_Sub6_7.method3048();
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Z")
	public boolean method418() {
		return this.aClass294_1 != null;
	}

	@OriginalMember(owner = "client!an", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7483() {
		return false;
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V")
	@Override
	public void method7477() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		if (this.aClass294_1 == null || !this.method423(2048, arg0)) {
			return null;
		}
		@Pc(26) Class109 local26 = arg0.method7142();
		@Pc(31) int local31 = super.aClass147_7.method3814();
		local26.o(local31);
		@Pc(49) Class63 local49 = Static554.aClass63ArrayArrayArray4[super.aByte126][super.anInt8975 >> Static458.anInt7508][super.anInt8980 >> Static458.anInt7508];
		if (local49 == null || local49.aClass9_Sub1_Sub3_1 == null) {
			super.anInt6447 = (int) ((float) super.anInt6447 - (float) super.anInt6447 / 10.0F);
		} else {
			@Pc(76) int local76 = super.anInt6447 - local49.aClass9_Sub1_Sub3_1.aShort42;
			super.anInt6447 = (int) ((float) super.anInt6447 - (float) local76 / 10.0F);
		}
		local26.U(super.anInt8975, super.anInt8977 - super.anInt6447 - 20, super.anInt8980);
		@Pc(105) Class267 local105 = this.method5573();
		@Pc(118) Class294 local118 = this.aClass294_1.anIntArray588 == null ? this.aClass294_1 : this.aClass294_1.method6429(Static427.aClass56_1);
		super.aBoolean529 = false;
		if (Static278.aClass3_Sub13_Sub1_1.aBoolean400 && local118.aBoolean601 && local105.aBoolean559) {
			@Pc(145) Class17 local145 = super.anInt6453 != -1 && super.anInt6438 == 0 ? Static330.aClass279_2.method6216(super.anInt6453) : null;
			@Pc(162) Class17 local162 = super.anInt6461 == -1 || super.aBoolean528 && local145 != null ? null : Static330.aClass279_2.method6216(super.anInt6461);
			@Pc(212) Class57 local212 = Static98.method2144(local162 == null ? local145 : local162, arg0, local31, this.aClass294_1.aByte109 & 0xFF, this.aClass294_1.aShort106 & 0xFFFF, this.aClass294_1.aShort105 & 0xFFFF, this.aClass294_1.aByte111 & 0xFF, this.aClass294_1.anInt7615, super.anInt6396, super.anInt6434, local162 == null ? super.anInt6385 : super.anInt6437, super.aClass57Array3[0], super.anInt6422);
			if (local212 != null) {
				super.aBoolean529 = true;
				arg0.ZA(false);
				if (Static225.aBoolean335) {
					local212.method7521(local26, null, Static354.anInt6136, 0);
				} else {
					local212.method7501(local26, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local26.o(local31);
		local26.U(super.anInt8975, -super.anInt6447 + super.anInt8977 - 5, super.anInt8980);
		@Pc(257) Class9_Sub2 local257 = null;
		if (this.method422()) {
			local257 = Static88.method1977(super.aClass57Array3.length);
		}
		this.method5570(local26, arg0, false, super.aClass57Array3);
		@Pc(279) int local279;
		if (Static225.aBoolean335) {
			for (local279 = 0; super.aClass57Array3.length > local279; local279++) {
				if (super.aClass57Array3[local279] != null) {
					super.aClass57Array3[local279].method7521(local26, local257 == null ? null : local257.aClass9_Sub9Array1[local279], Static354.anInt6136, 0);
				}
			}
		} else {
			for (local279 = 0; super.aClass57Array3.length > local279; local279++) {
				if (super.aClass57Array3[local279] != null) {
					super.aClass57Array3[local279].method7501(local26, local257 == null ? null : local257.aClass9_Sub9Array1[local279], 0);
				}
			}
		}
		if (super.aClass9_Sub6_7 != null) {
			@Pc(355) Class96 local355 = super.aClass9_Sub6_7.method3053();
			if (Static225.aBoolean335) {
				arg0.method7176(local355, Static354.anInt6136);
			} else {
				arg0.method7189(local355);
			}
		}
		for (local279 = 0; super.aClass57Array3.length > local279; local279++) {
			if (super.aClass57Array3[local279] != null) {
				super.aBoolean529 |= super.aClass57Array3[local279].LA();
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
		super.anInt6404 = Static337.anInt5983;
		return local257;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V")
	public void method420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray518[0];
		@Pc(15) int local15 = super.anIntArray517[0];
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
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt6453 != -1 && Static330.aClass279_2.method6216(super.anInt6453).anInt560 == 1) {
			super.anIntArray515 = null;
			super.anInt6453 = -1;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		@Pc(89) Class175 local89;
		if (super.anInt6424 != -1) {
			local89 = Static547.aClass248_2.method5708(super.anInt6424);
			if (local89.aBoolean386 && local89.anInt4956 != -1 && Static330.aClass279_2.method6216(local89.anInt4956).anInt560 == 1) {
				super.anInt6424 = -1;
			}
		}
		if (super.anInt6384 != -1) {
			local89 = Static547.aClass248_2.method5708(super.anInt6384);
			if (local89.aBoolean386 && local89.anInt4956 != -1 && Static330.aClass279_2.method6216(local89.anInt4956).anInt560 == 1) {
				super.anInt6384 = -1;
			}
		}
		if (super.anInt6468 < 9) {
			super.anInt6468++;
		}
		for (@Pc(157) int local157 = super.anInt6468; local157 > 0; local157--) {
			super.anIntArray518[local157] = super.anIntArray518[local157 - 1];
			super.anIntArray517[local157] = super.anIntArray517[local157 - 1];
			super.aByteArray84[local157] = super.aByteArray84[local157 - 1];
		}
		super.anIntArray518[0] = local10;
		super.anIntArray517[0] = local15;
		super.aByteArray84[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(Z)Z")
	private boolean method422() {
		return this.aClass294_1.aBoolean599;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!an", name = "o", descriptor = "(I)I")
	@Override
	public int method5574() {
		if (this.aClass294_1.anIntArray588 != null) {
			@Pc(22) Class294 local22 = this.aClass294_1.method6429(Static427.aClass56_1);
			if (local22 != null && local22.anInt7591 != -1) {
				return local22.anInt7591;
			}
		}
		return this.aClass294_1.anInt7591;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I")
	@Override
	protected int method5571() {
		if (this.aClass294_1.anIntArray588 != null) {
			@Pc(13) Class294 local13 = this.aClass294_1.method6429(Static427.aClass56_1);
			if (local13 != null && local13.anInt7607 != -1) {
				return local13.anInt7607;
			}
		}
		return this.aClass294_1.anInt7607;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
	@Override
	public int method5564() {
		if (this.aClass294_1.anIntArray588 != null) {
			@Pc(18) Class294 local18 = this.aClass294_1.method6429(Static427.aClass56_1);
			if (local18 != null && local18.anInt7601 != -1) {
				return local18.anInt7601;
			}
		}
		return this.aClass294_1.anInt7601 == -1 ? super.method5564() : this.aClass294_1.anInt7601;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!r;)Z")
	private boolean method423(@OriginalArg(0) int arg0, @OriginalArg(2) Class43 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class267 local11 = this.method5573();
		@Pc(29) Class17 local29 = super.anInt6453 != -1 && super.anInt6438 == 0 ? Static330.aClass279_2.method6216(super.anInt6453) : null;
		@Pc(47) Class17 local47 = super.anInt6461 == -1 || super.aBoolean528 && local29 != null ? null : Static330.aClass279_2.method6216(super.anInt6461);
		@Pc(50) int local50 = local11.anInt7031;
		@Pc(53) int local53 = local11.anInt7050;
		if (local50 != 0 || local53 != 0 || local11.anInt7019 != 0 || local11.anInt7032 != 0) {
			arg0 |= 0x7;
		}
		@Pc(91) boolean local91 = super.aByte89 != 0 && Static305.anInt5560 >= super.anInt6456 && super.anInt6388 > Static305.anInt5560;
		if (local91) {
			arg0 |= 0x80000;
		}
		@Pc(128) Class57 local128 = super.aClass57Array3[0] = this.aClass294_1.method6438(Static363.aClass135_1, arg0, local29, super.anInt6403, super.anInt6441, super.anInt6437, super.anInt6440, Static427.aClass56_1, super.aClass52Array3, super.anInt6393, super.anInt6385, local47, arg1, Static330.aClass279_2);
		if (local128 == null) {
			return false;
		}
		super.anInt6457 = local128.J();
		super.anInt6410 = local128.RA();
		this.method5576(local128);
		@Pc(151) int local151 = super.aClass147_7.method3814();
		if (local50 == 0 && local53 == 0) {
			this.method5561(0, 0, local151, this.method5569() << 9, this.method5569() << 9);
		} else {
			this.method5561(local11.anInt7043, local11.anInt7015, local151, local53, local50);
			if (super.anInt6422 != 0) {
				super.aClass57Array3[0].MA(super.anInt6422);
			}
			if (super.anInt6434 != 0) {
				super.aClass57Array3[0].W(super.anInt6434);
			}
			if (super.anInt6396 != 0) {
				super.aClass57Array3[0].oa(0, super.anInt6396, 0);
			}
		}
		if (local91) {
			local128.method7523(super.aByte91, super.aByte90, super.aByte92, super.aByte89 & 0xFF);
		}
		@Pc(253) Class175 local253;
		@Pc(271) boolean local271;
		@Pc(273) int local273;
		@Pc(316) Class57 local316;
		if (super.anInt6424 == -1 || super.lb == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local253 = Static547.aClass248_2.method5708(super.anInt6424);
			local271 = local253.aByte60 == 3 && (local50 != 0 || local53 != 0);
			local273 = local7;
			if (local271) {
				local273 = local7 | 0x7;
			} else {
				if (super.anInt6390 != 0) {
					local273 = local7 | 0x5;
				}
				if (super.anInt6443 != 0) {
					local273 |= 0x2;
				}
			}
			local316 = super.aClass57Array3[1] = local253.method4324(Static330.aClass279_2, super.anInt6412, super.anInt6386, super.lb, local273, arg1);
			if (local316 != null) {
				if (super.anInt6443 != 0) {
					local316.oa(0, -super.anInt6443 << 2, 0);
				}
				if (super.anInt6390 != 0) {
					local316.M(super.anInt6390 * 2048);
				}
				if (local271) {
					if (super.anInt6422 != 0) {
						local316.MA(super.anInt6422);
					}
					if (super.anInt6434 != 0) {
						local316.W(super.anInt6434);
					}
					if (super.anInt6396 != 0) {
						local316.oa(0, super.anInt6396, 0);
					}
				}
			}
		}
		if (super.anInt6384 == -1 || super.anInt6444 == -1) {
			super.aClass57Array3[2] = null;
		} else {
			local253 = Static547.aClass248_2.method5708(super.anInt6384);
			local271 = local253.aByte60 == 3 && (local50 != 0 || local53 != 0);
			local273 = local7;
			if (local271) {
				local273 = local7 | 0x7;
			} else {
				if (super.anInt6409 != 0) {
					local273 = local7 | 0x5;
				}
				if (super.anInt6418 != 0) {
					local273 |= 0x2;
				}
			}
			local316 = super.aClass57Array3[2] = local253.method4327(Static330.aClass279_2, arg1, super.anInt6400, local273, super.anInt6420, super.anInt6444);
			if (local316 != null) {
				if (super.anInt6418 != 0) {
					local316.oa(0, -super.anInt6418 << 2, 0);
				}
				if (super.anInt6409 != 0) {
					local316.M(super.anInt6409 * 2048);
				}
				if (local271) {
					if (super.anInt6422 != 0) {
						local316.MA(super.anInt6422);
					}
					if (super.anInt6434 != 0) {
						local316.W(super.anInt6434);
					}
					if (super.anInt6396 != 0) {
						local316.oa(0, super.anInt6396, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!rr;)V")
	public void method425(@OriginalArg(1) Class294 arg0) {
		this.aClass294_1 = arg0;
		if (super.aClass9_Sub6_7 != null) {
			super.aClass9_Sub6_7.method3048();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
		if (this.aClass294_1 == null || !super.aBoolean530 && !this.method423(0, arg0)) {
			return;
		}
		@Pc(20) Class109 local20 = arg0.method7142();
		local20.o(super.aClass147_7.method3814());
		local20.U(super.anInt8975, super.anInt8977 - 20, super.anInt8980);
		this.method5570(local20, arg0, super.aBoolean530, super.aClass57Array3);
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
	}
}
