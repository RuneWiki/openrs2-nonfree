import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class20_Sub1_Sub1_Sub2 extends Class20_Sub1_Sub1 {

	@OriginalMember(owner = "client!vi", name = "dd", descriptor = "Lclient!tn;")
	public Class283 aClass283_1;

	@OriginalMember(owner = "client!vi", name = "Kc", descriptor = "I")
	public int anInt9043 = -1;

	@OriginalMember(owner = "client!vi", name = "Sc", descriptor = "I")
	public int anInt9050 = -1;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "(I)I")
	@Override
	public int method7813() {
		if (this.aClass283_1.anIntArray743 != null) {
			@Pc(13) Class283 local13 = this.aClass283_1.method7368(Static417.aClass10_1);
			if (local13 != null && local13.anInt8416 != -1) {
				return local13.anInt8416;
			}
		}
		return this.aClass283_1.anInt8416;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(ZII)V")
	public void method7824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray780[0];
		@Pc(22) int local22 = super.anIntArray781[0];
		if (arg0 == 0) {
			local22++;
		}
		if (arg0 == 1) {
			local10++;
			local22++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local10++;
			local22--;
		}
		if (arg0 == 4) {
			local22--;
		}
		if (arg0 == 5) {
			local10--;
			local22--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt9022 != -1 && Static35.aClass152_1.method4045(super.anInt9022).anInt5285 == 1) {
			super.anInt9022 = -1;
		}
		if (arg0 == 7) {
			local10--;
			local22++;
		}
		@Pc(89) Class87 local89;
		if (super.anInt8970 != -1) {
			local89 = Static530.aClass195_2.method5439(super.anInt8970);
			if (local89.aBoolean193 && local89.anInt2314 != -1 && Static35.aClass152_1.method4045(local89.anInt2314).anInt5285 == 1) {
				super.anInt8970 = -1;
			}
		}
		if (super.anInt8967 != -1) {
			local89 = Static530.aClass195_2.method5439(super.anInt8967);
			if (local89.aBoolean193 && local89.anInt2314 != -1 && Static35.aClass152_1.method4045(local89.anInt2314).anInt5285 == 1) {
				super.anInt8967 = -1;
			}
		}
		if (super.anInt9035 < 9) {
			super.anInt9035++;
		}
		for (@Pc(152) int local152 = super.anInt9035; local152 > 0; local152--) {
			super.anIntArray780[local152] = super.anIntArray780[local152 - 1];
			super.anIntArray781[local152] = super.anIntArray781[local152 - 1];
			super.aByteArray116[local152] = super.aByteArray116[local152 - 1];
		}
		super.anIntArray780[0] = local10;
		super.aByteArray116[0] = (byte) arg1;
		super.anIntArray781[0] = local22;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)Z")
	public boolean method7825() {
		return this.aClass283_1 != null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
		if (this.aClass283_1 != null && (super.aBoolean680 || this.method7829(0, arg0))) {
			this.method7817(super.aBoolean680, arg0, super.aClass97Array3);
			super.aClass97Array3[0] = super.aClass97Array3[1] = super.aClass97Array3[2] = super.aClass97Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!tn;I)V")
	public void method7826(@OriginalArg(0) Class283 arg0) {
		this.aClass283_1 = arg0;
		if (super.aClass46_Sub7_6 != null) {
			super.aClass46_Sub7_6.method7415();
		}
	}

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "(I)Z")
	private boolean method7827() {
		return this.aClass283_1.aBoolean621;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I")
	@Override
	public int method7805() {
		if (this.aClass283_1.anIntArray743 != null) {
			@Pc(13) Class283 local13 = this.aClass283_1.method7368(Static417.aClass10_1);
			if (local13 != null && local13.anInt8447 != -1) {
				return local13.anInt8447;
			}
		}
		return this.aClass283_1.anInt8447 == -1 ? super.method7805() : this.aClass283_1.anInt8447;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass283_1 == null || !this.method7829(131072, arg0)) {
			return false;
		}
		@Pc(19) Class128 local19 = arg0.method7165();
		@Pc(30) int local30 = super.aClass209_7.method5706();
		local19.ma(local30);
		local19.TA(super.anInt8954, super.anInt8947, super.anInt8949);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass97Array3.length; local45++) {
			if (super.aClass97Array3[local45] != null && super.aClass97Array3[local45].method6785(arg1, arg2, local19, this.aClass283_1.anInt8439 == 1)) {
				local43 = true;
				break;
			}
		}
		super.aClass97Array3[0] = super.aClass97Array3[1] = super.aClass97Array3[2] = super.aClass97Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		if (this.aClass283_1 == null || !this.method7829(2048, arg0)) {
			return null;
		}
		@Pc(17) Class128 local17 = arg0.method7165();
		@Pc(22) int local22 = super.aClass209_7.method5706();
		local17.ma(local22);
		local17.TA(super.anInt8954, super.anInt8947, super.anInt8949);
		@Pc(42) Class299 local42 = this.method7819();
		@Pc(55) Class283 local55 = this.aClass283_1.anIntArray743 == null ? this.aClass283_1 : this.aClass283_1.method7368(Static417.aClass10_1);
		if (Static286.aClass1_Sub15_Sub1_1.aBoolean530 && local55.aBoolean619 && local42.aBoolean667) {
			@Pc(79) Class176 local79 = super.anInt9022 != -1 && super.anInt9009 == 0 ? Static35.aClass152_1.method4045(super.anInt9022) : null;
			@Pc(96) Class176 local96 = super.anInt9030 == -1 || super.aBoolean677 && local79 != null ? null : Static35.aClass152_1.method4045(super.anInt9030);
			@Pc(98) int local98 = 0;
			if (super.anInt8997 != 0) {
				local98 = this.method7816();
			}
			@Pc(156) Class97 local156 = Static270.method4818(local96 == null ? super.anInt8961 : super.anInt8973, local98, this.aClass283_1.aShort115 & 0xFFFF, local96 == null ? local79 : local96, this.aClass283_1.aByte90 & 0xFF, super.anInt9013, super.anInt8987, this.aClass283_1.aShort114 & 0xFFFF, super.aClass97Array3[0], this.aClass283_1.anInt8439, super.anInt9012, this.aClass283_1.aByte94 & 0xFF, local22, arg0);
			if (local156 != null) {
				@Pc(161) float local161 = arg0.P();
				@Pc(164) float local164 = arg0.ra();
				arg0.method7214(false);
				arg0.la(local161, local164 - 150.0F);
				local156.method6773(local17, null, 0);
				arg0.la(local161, local164);
				arg0.method7214(true);
			}
		}
		@Pc(187) Class46_Sub6 local187 = null;
		if (this.method7827()) {
			local187 = Static490.method7528(super.aClass97Array3.length);
		}
		if (super.aClass46_Sub7_6 == null) {
			arg0.method7159(super.aClass97Array3, local17, local187 == null ? null : local187.aClass46_Sub1Array1, 0);
		} else {
			@Pc(222) Class158 local222 = super.aClass46_Sub7_6.method7408();
			arg0.method7175(super.aClass97Array3, local222, local17, local187 == null ? null : local187.aClass46_Sub1Array1, 0);
		}
		this.method7817(false, arg0, super.aClass97Array3);
		super.anInt9017 = Static389.anInt6904;
		super.aClass97Array3[0] = super.aClass97Array3[1] = super.aClass97Array3[2] = super.aClass97Array3[3] = null;
		return local187;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I")
	@Override
	protected int method7822() {
		if (this.aClass283_1.anIntArray743 != null) {
			@Pc(19) Class283 local19 = this.aClass283_1.method7368(Static417.aClass10_1);
			if (local19 != null && local19.anInt8412 != -1) {
				return local19.anInt8412;
			}
		}
		return this.aClass283_1.anInt8412;
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)I")
	@Override
	public int method7798() {
		return super.anInt8977;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILclient!qa;)Z")
	private boolean method7829(@OriginalArg(1) int arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class299 local11 = this.method7819();
		@Pc(29) Class176 local29 = super.anInt9022 != -1 && super.anInt9009 == 0 ? Static35.aClass152_1.method4045(super.anInt9022) : null;
		@Pc(49) Class176 local49 = super.anInt9030 == -1 || super.aBoolean677 && local29 != null ? null : Static35.aClass152_1.method4045(super.anInt9030);
		@Pc(52) int local52 = local11.anInt8820;
		@Pc(55) int local55 = local11.anInt8815;
		if (local52 != 0 || local55 != 0 || local11.anInt8822 != 0 || local11.anInt8838 != 0) {
			arg0 |= 0x7;
		}
		@Pc(98) boolean local98 = super.aByte109 != 0 && Static445.anInt7791 >= super.anInt8990 && Static445.anInt7791 < super.anInt9007;
		if (local98) {
			arg0 |= 0x80000;
		}
		@Pc(135) Class97 local135 = super.aClass97Array3[0] = this.aClass283_1.method7372(super.anInt8961, super.anInt8993, super.anInt8974, Static35.aClass152_1, arg0, local29, arg1, super.anInt8973, Static417.aClass10_1, super.aClass286Array3, super.anInt9033, local49, Static398.aClass167_1, super.anInt8979);
		if (local135 == null) {
			return false;
		}
		super.anInt8977 = local135.TA();
		this.method7815(local135);
		@Pc(157) int local157 = super.aClass209_7.method5706();
		if (local52 == 0 && local55 == 0) {
			this.method7818(this.method7808() << 7, 0, local157, this.method7808() << 7, 0);
		} else {
			this.method7818(local55, local11.anInt8819, local157, local52, local11.anInt8848);
			if (super.anInt9012 != 0) {
				super.aClass97Array3[0].D(super.anInt9012);
			}
			if (super.anInt9013 != 0) {
				super.aClass97Array3[0].b(super.anInt9013);
			}
			if (super.anInt8987 != 0) {
				super.aClass97Array3[0].ca(0, super.anInt8987, 0);
			}
		}
		if (local98) {
			local135.method6779(super.aByte110, super.aByte112, super.aByte111, super.aByte109 & 0xFF);
		}
		@Pc(263) Class87 local263;
		@Pc(278) boolean local278;
		@Pc(280) int local280;
		@Pc(320) Class97 local320;
		if (super.anInt8970 == -1 || super.anInt9026 == -1) {
			super.aClass97Array3[1] = null;
		} else {
			local263 = Static530.aClass195_2.method5439(super.anInt8970);
			local278 = local263.aByte37 == 3 && (local52 != 0 || local55 != 0);
			local280 = local7;
			if (local278) {
				local280 = local7 | 0x7;
			} else {
				if (super.anInt9005 != 0) {
					local280 = local7 | 0x5;
				}
				if (super.lb != 0) {
					local280 |= 0x2;
				}
			}
			local320 = super.aClass97Array3[1] = local263.method2233(super.anInt8968, super.anInt9027, local280, arg1, Static35.aClass152_1, super.anInt9026);
			if (local320 != null) {
				if (super.lb != 0) {
					local320.ca(0, -super.lb << 0, 0);
				}
				if (super.anInt9005 != 0) {
					local320.OA(super.anInt9005 * 2048);
				}
				if (local278) {
					if (super.anInt9012 != 0) {
						local320.D(super.anInt9012);
					}
					if (super.anInt9013 != 0) {
						local320.b(super.anInt9013);
					}
					if (super.anInt8987 != 0) {
						local320.ca(0, super.anInt8987, 0);
					}
				}
			}
		}
		if (super.anInt8967 == -1 || super.anInt9011 == -1) {
			super.aClass97Array3[3] = null;
		} else {
			local263 = Static530.aClass195_2.method5439(super.anInt8967);
			local278 = local263.aByte37 == 3 && (local52 != 0 || local55 != 0);
			local280 = local7;
			if (local278) {
				local280 = local7 | 0x7;
			} else {
				if (super.anInt8957 != 0) {
					local280 = local7 | 0x5;
				}
				if (super.anInt9015 != 0) {
					local280 |= 0x2;
				}
			}
			local320 = super.aClass97Array3[3] = local263.method2235(super.anInt8958, local280, Static35.aClass152_1, arg1, super.anInt8984, super.anInt9011);
			if (local320 != null) {
				if (super.anInt9015 != 0) {
					local320.ca(0, -super.anInt9015 << 0, 0);
				}
				if (super.anInt8957 != 0) {
					local320.OA(super.anInt8957 * 2048);
				}
				if (local278) {
					if (super.anInt9012 != 0) {
						local320.D(super.anInt9012);
					}
					if (super.anInt9013 != 0) {
						local320.b(super.anInt9013);
					}
					if (super.anInt8987 != 0) {
						local320.ca(0, super.anInt8987, 0);
					}
				}
			}
		}
		super.aClass97Array3[2] = null;
		if (super.aClass1_Sub27_3 != null) {
			if (super.aClass1_Sub27_3.anInt4512 <= Static445.anInt7791) {
				super.aClass1_Sub27_3 = null;
			} else if (Static445.anInt7791 >= super.aClass1_Sub27_3.anInt4507) {
				@Pc(560) Class97 local560 = super.aClass1_Sub27_3.method4188(local7 | 0x7, arg1);
				if (local560 != null) {
					local560.ca(super.aClass1_Sub27_3.anInt4508 - super.anInt8954, super.aClass1_Sub27_3.anInt4506 - super.anInt8947, super.aClass1_Sub27_3.anInt4502 - super.anInt8949);
					if (local157 != 0) {
						local560.OA(local157);
					}
					super.aClass97Array3[2] = local560;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZIIBII)V")
	public void method7830(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte108 = (byte) arg3;
		if (super.anInt9022 != -1 && Static35.aClass152_1.method4045(super.anInt9022).anInt5285 == 1) {
			super.anInt9022 = -1;
		}
		@Pc(37) Class87 local37;
		if (super.anInt8970 != -1) {
			local37 = Static530.aClass195_2.method5439(super.anInt8970);
			if (local37.aBoolean193 && local37.anInt2314 != -1 && Static35.aClass152_1.method4045(local37.anInt2314).anInt5285 == 1) {
				super.anInt8970 = -1;
			}
		}
		if (super.anInt8967 != -1) {
			local37 = Static530.aClass195_2.method5439(super.anInt8967);
			if (local37.aBoolean193 && local37.anInt2314 != -1 && Static35.aClass152_1.method4045(local37.anInt2314).anInt5285 == 1) {
				super.anInt8967 = -1;
			}
		}
		if (!arg0) {
			@Pc(96) int local96 = arg2 - super.anIntArray780[0];
			@Pc(103) int local103 = arg4 - super.anIntArray781[0];
			if (local96 >= -8 && local96 <= 8 && local103 >= -8 && local103 <= 8) {
				if (super.anInt9035 < 9) {
					super.anInt9035++;
				}
				for (@Pc(132) int local132 = super.anInt9035; local132 > 0; local132--) {
					super.anIntArray780[local132] = super.anIntArray780[local132 - 1];
					super.anIntArray781[local132] = super.anIntArray781[local132 - 1];
					super.aByteArray116[local132] = super.aByteArray116[local132 - 1];
				}
				super.anIntArray780[0] = arg2;
				super.anIntArray781[0] = arg4;
				super.aByteArray116[0] = 1;
				return;
			}
		}
		super.anInt9036 = 0;
		super.anInt9037 = 0;
		super.anInt9035 = 0;
		super.anIntArray780[0] = arg2;
		super.anIntArray781[0] = arg4;
		super.anInt8949 = (arg1 << 6) + (super.anIntArray781[0] << 7);
		super.anInt8954 = (arg1 << 6) + (super.anIntArray780[0] << 7);
		if (super.aClass46_Sub7_6 != null) {
			super.aClass46_Sub7_6.method7415();
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		throw new IllegalStateException();
	}
}
