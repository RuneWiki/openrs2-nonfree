import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class4_Sub1_Sub2_Sub1_Sub1 extends Class4_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!gt", name = "hd", descriptor = "Lclient!fha;")
	public Class109 aClass109_1;

	@OriginalMember(owner = "client!gt", name = "Uc", descriptor = "I")
	public int anInt3767 = -1;

	@OriginalMember(owner = "client!gt", name = "jd", descriptor = "I")
	public int anInt3779 = -1;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILclient!ha;)Z")
	private boolean method3332(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class143 local11 = this.method5058();
		@Pc(30) Class361 local30 = super.anInt5718 != -1 && super.anInt5710 == 0 ? Static115.aClass227_1.method5968(super.anInt5718) : null;
		@Pc(47) Class361 local47 = super.anInt5743 == -1 || super.aBoolean404 && local30 != null ? null : Static115.aClass227_1.method5968(super.anInt5743);
		@Pc(50) int local50 = local11.anInt4188;
		@Pc(53) int local53 = local11.anInt4191;
		if (local50 != 0 || local53 != 0 || local11.anInt4163 != 0 || local11.anInt4152 != 0) {
			arg0 |= 0x7;
		}
		@Pc(89) boolean local89 = super.aByte91 != 0 && Static101.anInt2262 >= super.anInt5749 && super.anInt5779 > Static101.anInt2262;
		if (local89) {
			arg0 |= 0x80000;
		}
		@Pc(105) int local105 = super.aClass63_7.method1994();
		@Pc(139) Class17 local139 = super.aClass17Array3[0] = this.aClass109_1.method2816(super.lb, local47, Static115.aClass227_1, local30, super.anInt5770, super.anInt5723, Static78.aClass261_1, super.anInt5791, arg0, super.anIntArray305, super.anInt5777, super.aClass256Array3, Static373.aClass150_1, arg1, local105, super.anInt5709);
		if (local139 == null) {
			return false;
		}
		super.anInt5780 = local139.fa();
		super.anInt5733 = local139.ma();
		this.method5061(local139);
		if (local50 == 0 && local53 == 0) {
			this.method5069(0, 0, this.method5059() << 9, this.method5059() << 9, local105);
		} else {
			this.method5069(local11.anInt4155, local11.anInt4167, local53, local50, local105);
			if (super.anInt5728 != 0) {
				super.aClass17Array3[0].FA(super.anInt5728);
			}
			if (super.anInt5753 != 0) {
				super.aClass17Array3[0].VA(super.anInt5753);
			}
			if (super.anInt5751 != 0) {
				super.aClass17Array3[0].H(0, super.anInt5751, 0);
			}
		}
		if (local89) {
			local139.method5431(super.aByte88, super.aByte90, super.aByte89, super.aByte91 & 0xFF);
		}
		@Pc(264) Class145 local264;
		@Pc(281) boolean local281;
		@Pc(283) int local283;
		@Pc(336) Class17 local336;
		@Pc(346) int local346;
		@Pc(348) int local348;
		@Pc(350) int local350;
		@Pc(437) int local437;
		@Pc(465) int local465;
		@Pc(477) int local477;
		@Pc(481) int local481;
		@Pc(491) int local491;
		if (super.anInt5720 == -1 || super.anInt5714 == -1) {
			super.aClass17Array3[1] = null;
		} else {
			local264 = Static275.aClass68_2.method2087(super.anInt5720);
			local281 = local264.aByte63 == 3 && (local50 != 0 || local53 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt5713 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt5736 != 0) {
					local283 |= 0x2;
				}
				if (super.anInt5719 != 0) {
					local283 |= 0x7;
				}
			}
			local336 = super.aClass17Array3[1] = local264.method3711(super.anInt5714, Static115.aClass227_1, super.anInt5752, local283, arg1, super.anInt5769);
			if (local336 != null) {
				if (super.anInt5719 >= 0) {
					local346 = 0;
					local348 = 0;
					local350 = 0;
					if (local11.anIntArrayArray32 != null && local11.anIntArrayArray32[super.anInt5719] != null) {
						local346 = local11.anIntArrayArray32[super.anInt5719][0];
						local350 = local11.anIntArrayArray32[super.anInt5719][2];
						local348 = local11.anIntArrayArray32[super.anInt5719][1];
					}
					if (local11.anIntArrayArray31 != null && local11.anIntArrayArray31[super.anInt5719] != null) {
						local348 += local11.anIntArrayArray31[super.anInt5719][1];
						local346 += local11.anIntArrayArray31[super.anInt5719][0];
						local350 += local11.anIntArrayArray31[super.anInt5719][2];
					}
					if (local350 != 0 || local346 != 0) {
						local437 = local105;
						if (super.anIntArray305 != null && super.anIntArray305[super.anInt5719] != -1) {
							local437 = super.anIntArray305[super.anInt5719];
						}
						local465 = local437 + super.anInt5713 * 2048 - local105 & 0x3FFF;
						if (local465 != 0) {
							local336.a(local465);
						}
						local477 = Class21.anIntArray656[local465];
						local481 = Class21.anIntArray655[local465];
						local491 = local477 * local350 + local481 * local346 >> 14;
						local350 = local350 * local481 - local477 * local346 >> 14;
						local346 = local491;
					}
					local336.H(local346, local348, local350);
				} else if (super.anInt5713 != 0) {
					local336.a(super.anInt5713 * 2048);
				}
				if (super.anInt5736 != 0) {
					local336.H(0, -super.anInt5736 << 2, 0);
				}
				if (local281) {
					if (super.anInt5728 != 0) {
						local336.FA(super.anInt5728);
					}
					if (super.anInt5753 != 0) {
						local336.VA(super.anInt5753);
					}
					if (super.anInt5751 != 0) {
						local336.H(0, super.anInt5751, 0);
					}
				}
			}
		}
		if (super.anInt5717 == -1 || super.anInt5765 == -1) {
			super.aClass17Array3[2] = null;
		} else {
			local264 = Static275.aClass68_2.method2087(super.anInt5717);
			local281 = local264.aByte63 == 3 && (local50 != 0 || local53 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt5756 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt5784 != 0) {
					local283 |= 0x2;
				}
				if (super.anInt5781 != 0) {
					local283 |= 0x7;
				}
			}
			local336 = super.aClass17Array3[2] = local264.method3716(super.anInt5783, local283, super.anInt5765, super.anInt5726, Static115.aClass227_1, arg1);
			if (local336 != null) {
				if (super.anInt5781 >= 0 && local11.anIntArrayArray32 != null && local11.anIntArrayArray32[super.anInt5781] != null) {
					local346 = 0;
					local348 = 0;
					local350 = 0;
					if (local11.anIntArrayArray32 != null && local11.anIntArrayArray32[super.anInt5781] != null) {
						local348 = local11.anIntArrayArray32[super.anInt5781][1];
						local346 = local11.anIntArrayArray32[super.anInt5781][0];
						local350 = local11.anIntArrayArray32[super.anInt5781][2];
					}
					if (local11.anIntArrayArray31 != null && local11.anIntArrayArray31[super.anInt5781] != null) {
						local348 += local11.anIntArrayArray31[super.anInt5781][1];
						local350 += local11.anIntArrayArray31[super.anInt5781][2];
						local346 += local11.anIntArrayArray31[super.anInt5781][0];
					}
					if (local350 != 0 || local346 != 0) {
						local437 = local105;
						if (super.anIntArray305 != null && super.anIntArray305[super.anInt5781] != -1) {
							local437 = super.anIntArray305[super.anInt5781];
						}
						local465 = super.anInt5756 * 2048 + local437 - local105 & 0x3FFF;
						if (local465 != 0) {
							local336.a(local465);
						}
						local477 = Class21.anIntArray656[local465];
						local481 = Class21.anIntArray655[local465];
						local491 = local350 * local477 + local481 * local346 >> 14;
						local350 = local481 * local350 - local346 * local477 >> 14;
						local346 = local491;
					}
					local336.H(local346, local348, local350);
				} else if (super.anInt5756 != 0) {
					local336.a(super.anInt5756 * 2048);
				}
				if (super.anInt5784 != 0) {
					local336.H(0, -super.anInt5784 << 2, 0);
				}
				if (local281) {
					if (super.anInt5728 != 0) {
						local336.FA(super.anInt5728);
					}
					if (super.anInt5753 != 0) {
						local336.VA(super.anInt5753);
					}
					if (super.anInt5751 != 0) {
						local336.H(0, super.anInt5751, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "(I)Z")
	public boolean method3333() {
		return this.aClass109_1 != null;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!fha;I)V")
	public void method3334(@OriginalArg(0) Class109 arg0) {
		this.aClass109_1 = arg0;
		if (super.aClass4_Sub10_5 != null) {
			super.aClass4_Sub10_5.method7848();
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)Z")
	private boolean method3335() {
		return this.aClass109_1.aBoolean200;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		if (this.aClass109_1 == null || !this.method3332(2048, arg0)) {
			return null;
		}
		@Pc(19) Class39 local19 = arg0.method7546();
		@Pc(24) int local24 = super.aClass63_7.method1994();
		local19.method7239(local24);
		@Pc(47) Class77 local47 = Static330.aClass77ArrayArrayArray2[super.aByte123][super.anInt8916 >> Static308.anInt5834][super.anInt8911 >> Static308.anInt5834];
		if (local47 == null || local47.aClass4_Sub1_Sub5_1 == null) {
			super.anInt5775 = (int) ((float) super.anInt5775 - (float) super.anInt5775 / 10.0F);
		} else {
			@Pc(60) int local60 = super.anInt5775 - local47.aClass4_Sub1_Sub5_1.aShort115;
			super.anInt5775 = (int) ((float) super.anInt5775 - (float) local60 / 10.0F);
		}
		local19.method7244(super.anInt8916, -super.anInt5775 + super.anInt8915 - 20, super.anInt8911);
		@Pc(103) Class143 local103 = this.method5058();
		@Pc(116) Class109 local116 = this.aClass109_1.anIntArray147 == null ? this.aClass109_1 : this.aClass109_1.method2813(Static373.aClass150_1);
		super.aBoolean406 = false;
		@Pc(121) Class4_Sub8 local121 = null;
		if (Static262.aClass3_Sub27_12.aClass21_Sub19_1.method6583() == 1 && local116.aBoolean199 && local103.aBoolean286) {
			@Pc(151) Class361 local151 = super.anInt5718 != -1 && super.anInt5710 == 0 ? Static115.aClass227_1.method5968(super.anInt5718) : null;
			@Pc(169) Class361 local169 = super.anInt5743 == -1 || super.aBoolean404 && local151 != null ? null : Static115.aClass227_1.method5968(super.anInt5743);
			@Pc(219) Class17 local219 = Static65.method1666(arg0, this.aClass109_1.aByte42 & 0xFF, this.aClass109_1.aShort42 & 0xFFFF, super.anInt5751, super.anInt5728, this.aClass109_1.aShort41 & 0xFFFF, super.anInt5753, this.aClass109_1.aByte41 & 0xFF, local169 == null ? super.anInt5770 : super.lb, super.aClass17Array3[0], local24, this.aClass109_1.anInt3032, local169 == null ? local151 : local169);
			if (local219 != null) {
				local121 = Static271.method4457(this.method3335(), super.aClass17Array3.length + 1);
				super.aBoolean406 = true;
				arg0.C(false);
				if (Static279.aBoolean329) {
					local219.method5413(local19, local121.aClass4_Sub5Array1[super.aClass17Array3.length], Static401.anInt7417, 0);
				} else {
					local219.method5411(local19, local121.aClass4_Sub5Array1[super.aClass17Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method7239(local24);
		local19.method7244(super.anInt8916, super.anInt8915 - super.anInt5775 - 5, super.anInt8911);
		if (local121 == null) {
			local121 = Static271.method4457(this.method3335(), super.aClass17Array3.length);
		}
		this.method5074(arg0, false, local19, super.aClass17Array3);
		@Pc(305) int local305;
		if (Static279.aBoolean329) {
			for (local305 = 0; local305 < super.aClass17Array3.length; local305++) {
				if (super.aClass17Array3[local305] != null) {
					super.aClass17Array3[local305].method5413(local19, local121.aClass4_Sub5Array1[local305], Static401.anInt7417, 0);
				}
			}
		} else {
			for (local305 = 0; local305 < super.aClass17Array3.length; local305++) {
				if (super.aClass17Array3[local305] != null) {
					super.aClass17Array3[local305].method5411(local19, local121.aClass4_Sub5Array1[local305], 0);
				}
			}
		}
		if (super.aClass4_Sub10_5 != null) {
			@Pc(369) Class85 local369 = super.aClass4_Sub10_5.method7850();
			if (Static279.aBoolean329) {
				arg0.method7551(local369, Static401.anInt7417);
			} else {
				arg0.method7538(local369);
			}
		}
		for (local305 = 0; local305 < super.aClass17Array3.length; local305++) {
			if (super.aClass17Array3[local305] != null) {
				super.aBoolean406 |= super.aClass17Array3[local305].F();
			}
		}
		super.anInt5732 = Static45.anInt1320;
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = null;
		return local121;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)I")
	@Override
	public int method7695() {
		return this.aClass109_1 == null ? 0 : this.aClass109_1.anInt3045;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIZB)V")
	public void method3336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super.aByte123 = super.aByte124 = (byte) arg1;
		if (Static486.method7232(arg0, arg2)) {
			super.aByte124++;
		}
		if (super.anInt5718 != -1 && Static115.aClass227_1.method5968(super.anInt5718).anInt9856 == 1) {
			super.anIntArray306 = null;
			super.anInt5718 = -1;
		}
		@Pc(58) Class145 local58;
		if (super.anInt5720 != -1) {
			local58 = Static275.aClass68_2.method2087(super.anInt5720);
			if (local58.aBoolean288 && local58.anInt4224 != -1 && Static115.aClass227_1.method5968(local58.anInt4224).anInt9856 == 1) {
				super.anInt5720 = -1;
			}
		}
		if (super.anInt5717 != -1) {
			local58 = Static275.aClass68_2.method2087(super.anInt5717);
			if (local58.aBoolean288 && local58.anInt4224 != -1 && Static115.aClass227_1.method5968(local58.anInt4224).anInt9856 == 1) {
				super.anInt5717 = -1;
			}
		}
		if (!arg4) {
			@Pc(116) int local116 = arg2 - super.anIntArray310[0];
			@Pc(124) int local124 = arg0 - super.anIntArray309[0];
			if (local116 >= -8 && local116 <= 8 && local124 >= -8 && local124 <= 8) {
				if (super.anInt5792 < 9) {
					super.anInt5792++;
				}
				for (@Pc(153) int local153 = super.anInt5792; local153 > 0; local153--) {
					super.anIntArray310[local153] = super.anIntArray310[local153 - 1];
					super.anIntArray309[local153] = super.anIntArray309[local153 - 1];
					super.aByteArray61[local153] = super.aByteArray61[local153 - 1];
				}
				super.anIntArray310[0] = arg2;
				super.anIntArray309[0] = arg0;
				super.aByteArray61[0] = 1;
				return;
			}
		}
		super.anInt5793 = 0;
		super.anInt5792 = 0;
		super.anInt5794 = 0;
		super.anIntArray310[0] = arg2;
		super.anIntArray309[0] = arg0;
		super.anInt8911 = (arg3 << 8) + (super.anIntArray309[0] << 9);
		super.anInt8916 = (super.anIntArray310[0] << 9) + (arg3 << 8);
		if (super.aClass4_Sub10_5 != null) {
			super.aClass4_Sub10_5.method7848();
		}
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "(I)I")
	@Override
	public int method5063() {
		if (this.aClass109_1.anIntArray147 != null) {
			@Pc(13) Class109 local13 = this.aClass109_1.method2813(Static373.aClass150_1);
			if (local13 != null && local13.anInt3057 != -1) {
				return local13.anInt3057;
			}
		}
		return this.aClass109_1.anInt3057 == -1 ? super.method5063() : this.aClass109_1.anInt3057;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(III)V")
	public void method3337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray310[0];
		@Pc(15) int local15 = super.anIntArray309[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local10++;
			local15--;
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
		if (super.anInt5718 != -1 && Static115.aClass227_1.method5968(super.anInt5718).anInt9856 == 1) {
			super.anInt5718 = -1;
			super.anIntArray306 = null;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		@Pc(94) Class145 local94;
		if (super.anInt5720 != -1) {
			local94 = Static275.aClass68_2.method2087(super.anInt5720);
			if (local94.aBoolean288 && local94.anInt4224 != -1 && Static115.aClass227_1.method5968(local94.anInt4224).anInt9856 == 1) {
				super.anInt5720 = -1;
			}
		}
		if (super.anInt5717 != -1) {
			local94 = Static275.aClass68_2.method2087(super.anInt5717);
			if (local94.aBoolean288 && local94.anInt4224 != -1 && Static115.aClass227_1.method5968(local94.anInt4224).anInt9856 == 1) {
				super.anInt5717 = -1;
			}
		}
		if (super.anInt5792 < 9) {
			super.anInt5792++;
		}
		for (@Pc(160) int local160 = super.anInt5792; local160 > 0; local160--) {
			super.anIntArray310[local160] = super.anIntArray310[local160 - 1];
			super.anIntArray309[local160] = super.anIntArray309[local160 - 1];
			super.aByteArray61[local160] = super.aByteArray61[local160 - 1];
		}
		super.anIntArray310[0] = local10;
		super.aByteArray61[0] = (byte) arg0;
		super.anIntArray309[0] = local15;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		if (this.aClass109_1 == null || !this.method3332(131072, arg2)) {
			return false;
		}
		@Pc(19) Class39 local19 = arg2.method7546();
		@Pc(24) int local24 = super.aClass63_7.method1994();
		local19.method7239(local24);
		local19.method7244(super.anInt8916, super.anInt8915, super.anInt8911);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass17Array3.length; local39++) {
			if (super.aClass17Array3[local39] != null) {
				@Pc(63) boolean var10000;
				label41: {
					if (this.aClass109_1.anInt3045 <= 0) {
						label39: {
							if (this.aClass109_1.anInt3050 == -1) {
								if (this.aClass109_1.anInt3032 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass109_1.anInt3050 == 1) {
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
				@Pc(93) boolean local93;
				if (Static279.aBoolean329) {
					local93 = super.aClass17Array3[local39].method5420(arg1, arg0, local19, local78, this.aClass109_1.anInt3045, Static401.anInt7417);
				} else {
					local93 = super.aClass17Array3[local39].method5433(arg1, arg0, local19, local78, this.aClass109_1.anInt3045);
				}
				if (local93) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
		if (this.aClass109_1 == null || !super.aBoolean407 && !this.method3332(0, arg0)) {
			return;
		}
		@Pc(20) Class39 local20 = arg0.method7546();
		local20.method7239(super.aClass63_7.method1994());
		local20.method7244(super.anInt8916, super.anInt8915 - 20, super.anInt8911);
		this.method5074(arg0, super.aBoolean407, local20, super.aClass17Array3);
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = null;
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(Z)I")
	@Override
	protected int method5064() {
		if (this.aClass109_1.anIntArray147 != null) {
			@Pc(18) Class109 local18 = this.aClass109_1.method2813(Static373.aClass150_1);
			if (local18 != null && local18.anInt3047 != -1) {
				return local18.anInt3047;
			}
		}
		return this.aClass109_1.anInt3047;
	}

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "(I)I")
	@Override
	public int method5070() {
		if (this.aClass109_1.anIntArray147 != null) {
			@Pc(18) Class109 local18 = this.aClass109_1.method2813(Static373.aClass150_1);
			if (local18 != null && local18.anInt3051 != -1) {
				return local18.anInt3051;
			}
		}
		return this.aClass109_1.anInt3051;
	}
}
