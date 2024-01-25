import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class24_Sub3_Sub2_Sub1 extends Class24_Sub3_Sub2 {

	@OriginalMember(owner = "client!ig", name = "Lc", descriptor = "Lclient!sh;")
	public Class222 aClass222_1;

	@OriginalMember(owner = "client!ig", name = "Cc", descriptor = "I")
	public int anInt3575 = -1;

	@OriginalMember(owner = "client!ig", name = "Nc", descriptor = "I")
	public int anInt3585 = -1;

	static {
		new Class182("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		if (this.aClass222_1 == null || !this.method2893(2048, arg0)) {
			return null;
		}
		@Pc(17) Class34 local17 = arg0.method5819();
		@Pc(22) int local22 = super.aClass145_7.method3304();
		local17.ca(local22);
		local17.W(super.anInt7092, super.anInt7096, super.anInt7094);
		@Pc(37) Class6 local37 = this.method4923();
		@Pc(52) Class222 local52 = this.aClass222_1.anIntArray613 == null ? this.aClass222_1 : this.aClass222_1.method4938(Static329.aClass201_9);
		if (Static361.aClass85_Sub1_1.aBoolean171 && local52.aBoolean411 && local37.aBoolean3) {
			@Pc(80) Class137 local80 = super.anInt6211 != -1 && super.anInt6250 == 0 ? Static281.aClass98_3.method2405(super.anInt6211) : null;
			@Pc(97) Class137 local97 = super.anInt6238 == -1 || super.aBoolean403 && local80 != null ? null : Static281.aClass98_3.method2405(super.anInt6238);
			@Pc(99) int local99 = 0;
			if (super.anInt6256 != 0) {
				local99 = this.method4918();
			}
			@Pc(160) Class63 local160 = Static38.method527(this.aClass222_1.aByte80 & 0xFF, this.aClass222_1.aByte83 & 0xFF, local97 == null ? local80 : local97, this.aClass222_1.anInt6351, super.anInt6224, local22, arg0, super.aClass63Array3[0], super.anInt6286, this.aClass222_1.aShort90 & 0xFFFF, local99, local97 == null ? super.anInt6231 : super.anInt6260, this.aClass222_1.aShort89 & 0xFFFF, super.anInt6280);
			if (local160 != null) {
				@Pc(165) float local165 = arg0.T();
				@Pc(168) float local168 = arg0.aa();
				arg0.method5837(false);
				arg0.da(local165, local168 - 150.0F);
				local160.method6090(local17, null, 0);
				arg0.da(local165, local168);
				arg0.method5837(true);
			}
		}
		@Pc(191) Class40_Sub5 local191 = null;
		if (this.method2895()) {
			local191 = Static171.method2916(super.aClass63Array3.length);
		}
		if (super.aClass40_Sub6_6 == null) {
			arg0.method5858(super.aClass63Array3, local17, local191 == null ? null : local191.aClass40_Sub8Array1, 0);
		} else {
			@Pc(208) Class121 local208 = super.aClass40_Sub6_6.method4088();
			arg0.method5873(super.aClass63Array3, local208, local17, local191 == null ? null : local191.aClass40_Sub8Array1, 0);
		}
		this.method4916(false, super.aClass63Array3, arg0);
		if (super.aClass63Array3[2] != null) {
			if (local22 != 0) {
				super.aClass63Array3[2].ma(local22);
			}
			super.aClass63Array3[2].a(-super.aClass10_Sub34_3.anInt5331 + super.anInt7092, -super.aClass10_Sub34_3.anInt5322 + super.anInt7096, -super.aClass10_Sub34_3.anInt5318 + super.anInt7094);
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		super.anInt6217 = Static186.anInt3747;
		return local191;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZBIIII)V")
	public void method2889(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte98 = (byte) arg4;
		if (super.anInt6211 != -1 && Static281.aClass98_3.method2405(super.anInt6211).anInt4038 == 1) {
			super.anInt6211 = -1;
		}
		@Pc(38) Class156 local38;
		if (super.anInt6274 != -1) {
			local38 = Static147.aClass107_1.method2639(super.anInt6274);
			if (local38.aBoolean289 && local38.anInt4316 != -1 && Static281.aClass98_3.method2405(local38.anInt4316).anInt4038 == 1) {
				super.anInt6274 = -1;
			}
		}
		if (super.anInt6270 != -1) {
			local38 = Static147.aClass107_1.method2639(super.anInt6270);
			if (local38.aBoolean289 && local38.anInt4316 != -1 && Static281.aClass98_3.method2405(local38.anInt4316).anInt4038 == 1) {
				super.anInt6270 = -1;
			}
		}
		if (!arg0) {
			@Pc(98) int local98 = arg1 - super.anIntArray610[0];
			@Pc(106) int local106 = arg3 - super.anIntArray611[0];
			if (local98 >= -8 && local98 <= 8 && local106 >= -8 && local106 <= 8) {
				if (super.anInt6288 < 9) {
					super.anInt6288++;
				}
				for (@Pc(137) int local137 = super.anInt6288; local137 > 0; local137--) {
					super.anIntArray610[local137] = super.anIntArray610[local137 - 1];
					super.anIntArray611[local137] = super.anIntArray611[local137 - 1];
					super.aByteArray80[local137] = super.aByteArray80[local137 - 1];
				}
				super.anIntArray610[0] = arg1;
				super.anIntArray611[0] = arg3;
				super.aByteArray80[0] = 1;
				return;
			}
		}
		super.anInt6290 = 0;
		super.anIntArray610[0] = arg1;
		super.anInt6288 = 0;
		super.anInt6291 = 0;
		super.anIntArray611[0] = arg3;
		super.anInt7094 = (arg2 << 6) + (super.anIntArray611[0] << 7);
		super.anInt7092 = (super.anIntArray610[0] << 7) + (arg2 << 6);
		if (super.aClass40_Sub6_6 != null) {
			super.aClass40_Sub6_6.method4093();
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I")
	@Override
	protected int method4910() {
		if (this.aClass222_1.anIntArray613 != null) {
			@Pc(13) Class222 local13 = this.aClass222_1.method4938(Static329.aClass201_9);
			if (local13 != null && local13.anInt6366 != -1) {
				return local13.anInt6366;
			}
		}
		return this.aClass222_1.anInt6366;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I")
	@Override
	public int method4908() {
		if (this.aClass222_1.anIntArray613 != null) {
			@Pc(13) Class222 local13 = this.aClass222_1.method4938(Static329.aClass201_9);
			if (local13 != null && local13.anInt6368 != -1) {
				return local13.anInt6368;
			}
		}
		return this.aClass222_1.anInt6368;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)I")
	@Override
	public int method4905() {
		if (this.aClass222_1.anIntArray613 != null) {
			@Pc(20) Class222 local20 = this.aClass222_1.method4938(Static329.aClass201_9);
			if (local20 != null && local20.anInt6359 != -1) {
				return local20.anInt6359;
			}
		}
		return this.aClass222_1.anInt6359 == -1 ? super.method4905() : this.aClass222_1.anInt6359;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass222_1 == null || !this.method2893(131072, arg0)) {
			return false;
		}
		@Pc(19) Class34 local19 = arg0.method5819();
		@Pc(24) int local24 = super.aClass145_7.method3304();
		local19.ca(local24);
		local19.W(super.anInt7092, super.anInt7096, super.anInt7094);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass63Array3.length; local39++) {
			if (super.aClass63Array3[local39] != null && super.aClass63Array3[local39].method6101(arg2, arg1, local19, this.aClass222_1.anInt6351 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "(I)Z")
	public boolean method2890() {
		return this.aClass222_1 != null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)I")
	@Override
	public int method5579() {
		return super.anInt6248;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!sh;)V")
	public void method2892(@OriginalArg(1) Class222 arg0) {
		this.aClass222_1 = arg0;
		if (super.aClass40_Sub6_6 != null) {
			super.aClass40_Sub6_6.method4093();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BILclient!za;)Z")
	private boolean method2893(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class6 local11 = this.method4923();
		@Pc(29) Class137 local29 = super.anInt6211 != -1 && super.anInt6250 == 0 ? Static281.aClass98_3.method2405(super.anInt6211) : null;
		@Pc(46) Class137 local46 = super.anInt6238 == -1 || super.aBoolean403 && local29 != null ? null : Static281.aClass98_3.method2405(super.anInt6238);
		@Pc(58) int local58 = local11.anInt66;
		@Pc(61) int local61 = local11.anInt39;
		if (local58 != 0 || local61 != 0 || local11.anInt56 != 0 || local11.anInt72 != 0) {
			arg0 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte73 != 0 && super.anInt6218 <= Static400.anInt6752 && Static400.anInt6752 < super.anInt6262;
		if (local97) {
			arg0 |= 0x80000;
		}
		@Pc(134) Class63 local134 = super.aClass63Array3[0] = this.aClass222_1.method4936(arg0, super.anInt6231, local29, Static329.aClass201_9, super.anInt6214, local46, Static133.aClass223_1, Static281.aClass98_3, super.anInt6222, arg1, super.aClass91Array3, super.anInt6271, super.anInt6212, super.anInt6260);
		if (local134 == null) {
			return false;
		}
		super.anInt6248 = local134.B();
		this.method4922(local134);
		@Pc(151) int local151 = super.aClass145_7.method3304();
		if (local58 == 0 && local61 == 0) {
			this.method4912(local151, this.method4919() << 7, 0, 0, this.method4919() << 7);
		} else {
			this.method4912(local151, local61, local11.anInt64, local11.anInt52, local58);
			if (super.anInt6286 != 0) {
				super.aClass63Array3[0].W(super.anInt6286);
			}
			if (super.anInt6224 != 0) {
				super.aClass63Array3[0].K(super.anInt6224);
			}
			if (super.anInt6280 != 0) {
				super.aClass63Array3[0].a(0, super.anInt6280, 0);
			}
		}
		if (local97) {
			local134.method6087(super.aByte72, super.aByte71, super.aByte70, super.aByte73 & 0xFF);
		}
		@Pc(250) Class156 local250;
		@Pc(264) boolean local264;
		@Pc(266) int local266;
		@Pc(309) Class63 local309;
		if (super.anInt6274 == -1 || super.anInt6210 == -1) {
			super.aClass63Array3[1] = null;
		} else {
			local250 = Static147.aClass107_1.method2639(super.anInt6274);
			local264 = local250.aByte55 == 3 && (local58 != 0 || local61 != 0);
			local266 = local7;
			if (local264) {
				local266 = local7 | 0x7;
			} else {
				if (super.anInt6235 != 0) {
					local266 = local7 | 0x5;
				}
				if (super.anInt6229 != 0) {
					local266 |= 0x2;
				}
			}
			local309 = super.aClass63Array3[1] = local250.method3463(super.anInt6223, Static281.aClass98_3, local266, super.anInt6233, super.anInt6210, arg1);
			if (local309 != null) {
				if (super.anInt6229 != 0) {
					local309.a(0, -super.anInt6229 << 0, 0);
				}
				if (super.anInt6235 != 0) {
					local309.ma(super.anInt6235 * 2048);
				}
				if (local264) {
					if (super.anInt6286 != 0) {
						local309.W(super.anInt6286);
					}
					if (super.anInt6224 != 0) {
						local309.K(super.anInt6224);
					}
					if (super.anInt6280 != 0) {
						local309.a(0, super.anInt6280, 0);
					}
				}
			}
		}
		if (super.anInt6270 == -1 || super.anInt6237 == -1) {
			super.aClass63Array3[3] = null;
		} else {
			local250 = Static147.aClass107_1.method2639(super.anInt6270);
			local264 = local250.aByte55 == 3 && (local58 != 0 || local61 != 0);
			local266 = local7;
			if (local264) {
				local266 = local7 | 0x7;
			} else {
				if (super.anInt6279 != 0) {
					local266 = local7 | 0x5;
				}
				if (super.anInt6245 != 0) {
					local266 |= 0x2;
				}
			}
			local309 = super.aClass63Array3[3] = local250.method3468(local266, arg1, super.anInt6216, super.anInt6237, super.anInt6273, Static281.aClass98_3);
			if (local309 != null) {
				if (super.anInt6245 != 0) {
					local309.a(0, -super.anInt6245 << 0, 0);
				}
				if (super.anInt6279 != 0) {
					local309.ma(super.anInt6279 * 2048);
				}
				if (local264) {
					if (super.anInt6286 != 0) {
						local309.W(super.anInt6286);
					}
					if (super.anInt6224 != 0) {
						local309.K(super.anInt6224);
					}
					if (super.anInt6280 != 0) {
						local309.a(0, super.anInt6280, 0);
					}
				}
			}
		}
		super.aClass63Array3[2] = null;
		if (super.aClass10_Sub34_3 != null) {
			if (super.aClass10_Sub34_3.anInt5326 <= Static400.anInt6752) {
				super.aClass10_Sub34_3 = null;
			} else if (super.aClass10_Sub34_3.anInt5319 <= Static400.anInt6752) {
				@Pc(550) Class63 local550 = super.aClass10_Sub34_3.method4260(local7 | 0x7, arg1);
				if (local550 != null) {
					local550.a(super.aClass10_Sub34_3.anInt5331 - super.anInt7092, super.aClass10_Sub34_3.anInt5322 + -super.anInt7096, super.aClass10_Sub34_3.anInt5318 - super.anInt7094);
					if (local151 != 0) {
						local550.ma(local151);
					}
					super.aClass63Array3[2] = local550;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Z")
	private boolean method2895() {
		return this.aClass222_1.aBoolean415;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
		if (this.aClass222_1 != null && (super.aBoolean405 || this.method2893(0, arg0))) {
			this.method4916(super.aBoolean405, super.aClass63Array3, arg0);
			super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(ZII)V")
	public void method2896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray610[0];
		@Pc(15) int local15 = super.anIntArray611[0];
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
		if (super.anInt6211 != -1 && Static281.aClass98_3.method2405(super.anInt6211).anInt4038 == 1) {
			super.anInt6211 = -1;
		}
		@Pc(89) Class156 local89;
		if (super.anInt6274 != -1) {
			local89 = Static147.aClass107_1.method2639(super.anInt6274);
			if (local89.aBoolean289 && local89.anInt4316 != -1 && Static281.aClass98_3.method2405(local89.anInt4316).anInt4038 == 1) {
				super.anInt6274 = -1;
			}
		}
		if (super.anInt6270 != -1) {
			local89 = Static147.aClass107_1.method2639(super.anInt6270);
			if (local89.aBoolean289 && local89.anInt4316 != -1 && Static281.aClass98_3.method2405(local89.anInt4316).anInt4038 == 1) {
				super.anInt6270 = -1;
			}
		}
		if (super.anInt6288 < 9) {
			super.anInt6288++;
		}
		for (@Pc(151) int local151 = super.anInt6288; local151 > 0; local151--) {
			super.anIntArray610[local151] = super.anIntArray610[local151 - 1];
			super.anIntArray611[local151] = super.anIntArray611[local151 - 1];
			super.aByteArray80[local151] = super.aByteArray80[local151 - 1];
		}
		super.anIntArray610[0] = local10;
		super.anIntArray611[0] = local15;
		super.aByteArray80[0] = (byte) arg1;
	}
}
