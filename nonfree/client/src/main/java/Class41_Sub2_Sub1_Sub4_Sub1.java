import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class41_Sub2_Sub1_Sub4_Sub1 extends Class41_Sub2_Sub1_Sub4 {

	@OriginalMember(owner = "client!oh", name = "od", descriptor = "Lclient!pw;")
	public Class264 aClass264_1;

	@OriginalMember(owner = "client!oh", name = "Wc", descriptor = "I")
	public int anInt6736 = -1;

	@OriginalMember(owner = "client!oh", name = "nd", descriptor = "I")
	public int anInt6751 = -1;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
		if (this.aClass264_1 == null || !super.aBoolean741 && !this.method5650(arg0, 0)) {
			return;
		}
		@Pc(24) Class11 local24 = arg0.method7397();
		local24.o(super.aClass259_7.method5914());
		local24.U(super.anInt9444, super.anInt9443 - 20, super.anInt9442);
		this.method7866(arg0, super.aClass60Array3, local24, super.aBoolean741);
		super.aClass60Array3[0] = super.aClass60Array3[1] = super.aClass60Array3[2] = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!r;IZ)Z")
	private boolean method5650(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(16) Class365 local16 = this.method7861();
		@Pc(35) Class185 local35 = super.anInt9489 != -1 && super.anInt9509 == 0 ? Static545.aClass240_2.method5680(super.anInt9489) : null;
		@Pc(52) Class185 local52 = super.anInt9512 == -1 || super.aBoolean739 && local35 != null ? null : Static545.aClass240_2.method5680(super.anInt9512);
		@Pc(55) int local55 = local16.anInt9753;
		@Pc(58) int local58 = local16.anInt9743;
		if (local55 != 0 || local58 != 0 || local16.anInt9754 != 0 || local16.anInt9721 != 0) {
			arg1 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte120 != 0 && super.anInt9493 <= Static506.anInt8251 && super.anInt9511 > Static506.anInt8251;
		if (local97) {
			arg1 |= 0x80000;
		}
		@Pc(134) Class60 local134 = super.aClass60Array3[0] = this.aClass264_1.method5997(super.anInt9526, local52, arg1, Static491.aClass318_1, Static401.aClass33_1, arg0, super.anInt9473, super.anInt9460, super.anInt9478, super.aClass152Array3, super.anInt9462, Static545.aClass240_2, super.anInt9527, local35);
		if (local134 == null) {
			return false;
		}
		super.anInt9514 = local134.J();
		super.anInt9464 = local134.RA();
		this.method7856(local134);
		@Pc(155) int local155 = super.aClass259_7.method5914();
		if (local55 == 0 && local58 == 0) {
			this.method7869(0, 0, this.method7858() << 9, this.method7858() << 9, local155);
		} else {
			this.method7869(local16.anInt9731, local16.anInt9751, local58, local55, local155);
			if (super.anInt9461 != 0) {
				super.aClass60Array3[0].MA(super.anInt9461);
			}
			if (super.anInt9481 != 0) {
				super.aClass60Array3[0].W(super.anInt9481);
			}
			if (super.lb != 0) {
				super.aClass60Array3[0].oa(0, super.lb, 0);
			}
		}
		if (local97) {
			local134.method7232(super.aByte122, super.aByte121, super.aByte123, super.aByte120 & 0xFF);
		}
		@Pc(268) Class284 local268;
		@Pc(283) boolean local283;
		@Pc(285) int local285;
		@Pc(328) Class60 local328;
		if (super.anInt9528 == -1 || super.anInt9525 == -1) {
			super.aClass60Array3[1] = null;
		} else {
			local268 = Static368.aClass278_1.method6127(super.anInt9528);
			local283 = local268.aByte96 == 3 && (local55 != 0 || local58 != 0);
			local285 = local7;
			if (local283) {
				local285 = local7 | 0x7;
			} else {
				if (super.anInt9515 != 0) {
					local285 = local7 | 0x5;
				}
				if (super.anInt9454 != 0) {
					local285 |= 0x2;
				}
			}
			local328 = super.aClass60Array3[1] = local268.method6244(local285, Static545.aClass240_2, arg0, super.anInt9498, super.anInt9525, super.anInt9470);
			if (local328 != null) {
				if (super.anInt9454 != 0) {
					local328.oa(0, -super.anInt9454 << 2, 0);
				}
				if (super.anInt9515 != 0) {
					local328.M(super.anInt9515 * 2048);
				}
				if (local283) {
					if (super.anInt9461 != 0) {
						local328.MA(super.anInt9461);
					}
					if (super.anInt9481 != 0) {
						local328.W(super.anInt9481);
					}
					if (super.lb != 0) {
						local328.oa(0, super.lb, 0);
					}
				}
			}
		}
		if (super.anInt9482 == -1 || super.anInt9455 == -1) {
			super.aClass60Array3[2] = null;
		} else {
			local268 = Static368.aClass278_1.method6127(super.anInt9482);
			local283 = local268.aByte96 == 3 && (local55 != 0 || local58 != 0);
			local285 = local7;
			if (local283) {
				local285 = local7 | 0x7;
			} else {
				if (super.anInt9467 != 0) {
					local285 = local7 | 0x5;
				}
				if (super.anInt9497 != 0) {
					local285 |= 0x2;
				}
			}
			local328 = super.aClass60Array3[2] = local268.method6242(arg0, local285, Static545.aClass240_2, super.anInt9523, super.anInt9477, super.anInt9455);
			if (local328 != null) {
				if (super.anInt9497 != 0) {
					local328.oa(0, -super.anInt9497 << 2, 0);
				}
				if (super.anInt9467 != 0) {
					local328.M(super.anInt9467 * 2048);
				}
				if (local283) {
					if (super.anInt9461 != 0) {
						local328.MA(super.anInt9461);
					}
					if (super.anInt9481 != 0) {
						local328.W(super.anInt9481);
					}
					if (super.lb != 0) {
						local328.oa(0, super.lb, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIIIIB)V")
	public void method5652(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte117 = super.aByte118 = (byte) arg1;
		if (Static511.method6886(arg3, arg2)) {
			super.aByte118++;
		}
		if (super.anInt9489 != -1 && Static545.aClass240_2.method5680(super.anInt9489).anInt4985 == 1) {
			super.anInt9489 = -1;
			super.anIntArray627 = null;
		}
		if (super.anInt9528 != -1) {
			@Pc(53) Class284 local53 = Static368.aClass278_1.method6127(super.anInt9528);
			if (local53.aBoolean565 && local53.anInt7490 != -1 && Static545.aClass240_2.method5680(local53.anInt7490).anInt4985 == 1) {
				super.anInt9528 = -1;
			}
		}
		if (super.anInt9482 != -1) {
			@Pc(92) Class284 local92 = Static368.aClass278_1.method6127(super.anInt9482);
			if (local92.aBoolean565 && local92.anInt7490 != -1 && Static545.aClass240_2.method5680(local92.anInt7490).anInt4985 == 1) {
				super.anInt9482 = -1;
			}
		}
		if (!arg0) {
			@Pc(123) int local123 = arg2 - super.anIntArray629[0];
			@Pc(131) int local131 = arg3 - super.anIntArray628[0];
			if (local123 >= -8 && local123 <= 8 && local131 >= -8 && local131 <= 8) {
				if (super.anInt9535 < 9) {
					super.anInt9535++;
				}
				for (@Pc(162) int local162 = super.anInt9535; local162 > 0; local162--) {
					super.anIntArray629[local162] = super.anIntArray629[local162 - 1];
					super.anIntArray628[local162] = super.anIntArray628[local162 - 1];
					super.aByteArray102[local162] = super.aByteArray102[local162 - 1];
				}
				super.anIntArray629[0] = arg2;
				super.anIntArray628[0] = arg3;
				super.aByteArray102[0] = 1;
				return;
			}
		}
		super.anInt9534 = 0;
		super.anInt9535 = 0;
		super.anIntArray629[0] = arg2;
		super.anInt9533 = 0;
		super.anIntArray628[0] = arg3;
		super.anInt9444 = (super.anIntArray629[0] << 9) + (arg4 << 8);
		super.anInt9442 = (super.anIntArray628[0] << 9) + (arg4 << 8);
		if (super.aClass41_Sub9_6 != null) {
			super.aClass41_Sub9_6.method7730();
		}
	}

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "(I)Z")
	public boolean method5653() {
		return this.aClass264_1 != null;
	}

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "(I)I")
	@Override
	protected int method7868() {
		if (this.aClass264_1.anIntArray443 != null) {
			@Pc(23) Class264 local23 = this.aClass264_1.method5994(Static491.aClass318_1);
			if (local23 != null && local23.anInt7169 != -1) {
				return local23.anInt7169;
			}
		}
		return this.aClass264_1.anInt7169;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		if (this.aClass264_1 == null || !this.method5650(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class11 local19 = arg0.method7397();
		@Pc(24) int local24 = super.aClass259_7.method5914();
		local19.o(local24);
		@Pc(42) Class299 local42 = Static309.aClass299ArrayArrayArray3[super.aByte117][super.anInt9444 >> Static315.anInt5369][super.anInt9442 >> Static315.anInt5369];
		if (local42 == null || local42.aClass41_Sub2_Sub5_1 == null) {
			super.anInt9508 = (int) ((float) super.anInt9508 - (float) super.anInt9508 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt9508 - local42.aClass41_Sub2_Sub5_1.aShort64;
			super.anInt9508 = (int) ((float) super.anInt9508 - (float) local55 / 10.0F);
		}
		local19.U(super.anInt9444, super.anInt9443 - super.anInt9508 - 20, super.anInt9442);
		@Pc(98) Class365 local98 = this.method7861();
		@Pc(111) Class264 local111 = this.aClass264_1.anIntArray443 == null ? this.aClass264_1 : this.aClass264_1.method5994(Static491.aClass318_1);
		super.aBoolean742 = false;
		if (Static405.aClass3_Sub3_Sub1_1.aBoolean576 && local111.aBoolean534 && local98.aBoolean767) {
			@Pc(141) Class185 local141 = super.anInt9489 != -1 && super.anInt9509 == 0 ? Static545.aClass240_2.method5680(super.anInt9489) : null;
			@Pc(160) Class185 local160 = super.anInt9512 == -1 || super.aBoolean739 && local141 != null ? null : Static545.aClass240_2.method5680(super.anInt9512);
			@Pc(210) Class60 local210 = Static596.method7950(this.aClass264_1.aShort117 & 0xFFFF, this.aClass264_1.aByte85 & 0xFF, local24, super.lb, super.anInt9481, local160 == null ? local141 : local160, this.aClass264_1.anInt7163, local160 == null ? super.anInt9473 : super.anInt9526, super.anInt9461, this.aClass264_1.aShort118 & 0xFFFF, super.aClass60Array3[0], this.aClass264_1.aByte89 & 0xFF, arg0);
			if (local210 != null) {
				super.aBoolean742 = true;
				arg0.ZA(false);
				if (Static453.aBoolean599) {
					local210.method7224(local19, null, Static340.anInt5962, 0);
				} else {
					local210.method7230(local19, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local19.o(local24);
		local19.U(super.anInt9444, super.anInt9443 - super.anInt9508 - 5, super.anInt9442);
		@Pc(255) Class41_Sub10 local255 = null;
		if (this.method5656()) {
			local255 = Static458.method6411(super.aClass60Array3.length);
		}
		this.method7866(arg0, super.aClass60Array3, local19, false);
		@Pc(277) int local277;
		if (Static453.aBoolean599) {
			for (local277 = 0; super.aClass60Array3.length > local277; local277++) {
				if (super.aClass60Array3[local277] != null) {
					super.aClass60Array3[local277].method7224(local19, local255 == null ? null : local255.aClass41_Sub8Array1[local277], Static340.anInt5962, 0);
				}
			}
		} else {
			for (local277 = 0; super.aClass60Array3.length > local277; local277++) {
				if (super.aClass60Array3[local277] != null) {
					super.aClass60Array3[local277].method7230(local19, local255 == null ? null : local255.aClass41_Sub8Array1[local277], 0);
				}
			}
		}
		if (super.aClass41_Sub9_6 != null) {
			@Pc(349) Class283 local349 = super.aClass41_Sub9_6.method7724();
			if (Static453.aBoolean599) {
				arg0.method7358(local349, Static340.anInt5962);
			} else {
				arg0.method7396(local349);
			}
		}
		for (local277 = 0; super.aClass60Array3.length > local277; local277++) {
			if (super.aClass60Array3[local277] != null) {
				super.aBoolean742 |= super.aClass60Array3[local277].LA();
			}
		}
		super.anInt9500 = Static81.anInt1761;
		super.aClass60Array3[0] = super.aClass60Array3[1] = super.aClass60Array3[2] = null;
		return local255;
	}

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
	public void method5655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray629[0];
		@Pc(15) int local15 = super.anIntArray628[0];
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
			local15--;
			local10++;
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
		if (super.anInt9489 != -1 && Static545.aClass240_2.method5680(super.anInt9489).anInt4985 == 1) {
			super.anIntArray627 = null;
			super.anInt9489 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(99) Class284 local99;
		if (super.anInt9528 != -1) {
			local99 = Static368.aClass278_1.method6127(super.anInt9528);
			if (local99.aBoolean565 && local99.anInt7490 != -1 && Static545.aClass240_2.method5680(local99.anInt7490).anInt4985 == 1) {
				super.anInt9528 = -1;
			}
		}
		if (super.anInt9482 != -1) {
			local99 = Static368.aClass278_1.method6127(super.anInt9482);
			if (local99.aBoolean565 && local99.anInt7490 != -1 && Static545.aClass240_2.method5680(local99.anInt7490).anInt4985 == 1) {
				super.anInt9482 = -1;
			}
		}
		if (super.anInt9535 < 9) {
			super.anInt9535++;
		}
		for (@Pc(164) int local164 = super.anInt9535; local164 > 0; local164--) {
			super.anIntArray629[local164] = super.anIntArray629[local164 - 1];
			super.anIntArray628[local164] = super.anIntArray628[local164 - 1];
			super.aByteArray102[local164] = super.aByteArray102[local164 - 1];
		}
		super.anIntArray629[0] = local10;
		super.anIntArray628[0] = local15;
		super.aByteArray102[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass264_1 == null || !this.method5650(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class11 local19 = arg0.method7397();
		@Pc(24) int local24 = super.aClass259_7.method5914();
		local19.o(local24);
		local19.U(super.anInt9444, super.anInt9443, super.anInt9442);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass60Array3.length > local39; local39++) {
			if (super.aClass60Array3[local39] != null) {
				@Pc(71) boolean local71 = this.aClass264_1.anInt7164 == -1 ? this.aClass264_1.anInt7163 == 1 : this.aClass264_1.anInt7164 == 1;
				@Pc(83) boolean local83;
				if (Static453.aBoolean599) {
					local83 = super.aClass60Array3[local39].method7237(arg1, arg2, local19, local71, Static340.anInt5962);
				} else {
					local83 = super.aClass60Array3[local39].method7246(arg1, arg2, local19, local71);
				}
				if (local83) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass60Array3[0] = super.aClass60Array3[1] = super.aClass60Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "(I)Z")
	private boolean method5656() {
		return this.aClass264_1.aBoolean536;
	}

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "(I)I")
	@Override
	public int method7864() {
		if (this.aClass264_1.anIntArray443 != null) {
			@Pc(21) Class264 local21 = this.aClass264_1.method5994(Static491.aClass318_1);
			if (local21 != null && local21.anInt7155 != -1) {
				return local21.anInt7155;
			}
		}
		return this.aClass264_1.anInt7155;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
	@Override
	public int method7860() {
		if (this.aClass264_1.anIntArray443 != null) {
			@Pc(20) Class264 local20 = this.aClass264_1.method5994(Static491.aClass318_1);
			if (local20 != null && local20.anInt7167 != -1) {
				return local20.anInt7167;
			}
		}
		return this.aClass264_1.anInt7167 == -1 ? super.method7860() : this.aClass264_1.anInt7167;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLclient!pw;)V")
	public void method5661(@OriginalArg(1) Class264 arg0) {
		this.aClass264_1 = arg0;
		if (super.aClass41_Sub9_6 != null) {
			super.aClass41_Sub9_6.method7730();
		}
	}
}
