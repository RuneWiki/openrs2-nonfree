import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class26_Sub2_Sub2_Sub2 extends Class26_Sub2_Sub2 {

	@OriginalMember(owner = "client!uo", name = "Ec", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[16384];

	@OriginalMember(owner = "client!uo", name = "zc", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[16384];

	@OriginalMember(owner = "client!uo", name = "Tc", descriptor = "Lclient!ef;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!uo", name = "Oc", descriptor = "I")
	public int anInt7166 = -1;

	@OriginalMember(owner = "client!uo", name = "Pc", descriptor = "I")
	public int anInt7167 = -1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray37[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray36[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)I")
	@Override
	public int method5530() {
		if (this.aClass66_1.anIntArray152 != null) {
			@Pc(20) Class66 local20 = this.aClass66_1.method1454(Static51.aClass79_1);
			if (local20 != null && local20.anInt1708 != -1) {
				return local20.anInt1708;
			}
		}
		return this.aClass66_1.anInt1708;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "(I)I")
	@Override
	public int method5540() {
		if (this.aClass66_1.anIntArray152 != null) {
			@Pc(13) Class66 local13 = this.aClass66_1.method1454(Static51.aClass79_1);
			if (local13 != null && local13.anInt1714 != -1) {
				return local13.anInt1714;
			}
		}
		return this.aClass66_1.anInt1714 == -1 ? super.method5540() : this.aClass66_1.anInt1714;
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)Z")
	public boolean method5543() {
		return this.aClass66_1 != null;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I")
	@Override
	protected int method5538() {
		if (this.aClass66_1.anIntArray152 != null) {
			@Pc(18) Class66 local18 = this.aClass66_1.method1454(Static51.aClass79_1);
			if (local18 != null && local18.anInt1709 != -1) {
				return local18.anInt1709;
			}
		}
		return this.aClass66_1.anInt1709;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILclient!qa;)Z")
	private boolean method5544(@OriginalArg(0) int arg0, @OriginalArg(2) Class109 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class164 local11 = this.method5533();
		@Pc(30) Class191 local30 = super.anInt7073 != -1 && super.anInt7120 == 0 ? Static191.aClass28_1.method567(super.anInt7073) : null;
		@Pc(47) Class191 local47 = super.anInt7122 == -1 || super.aBoolean458 && local30 != null ? null : Static191.aClass28_1.method567(super.anInt7122);
		@Pc(50) int local50 = local11.anInt4693;
		@Pc(53) int local53 = local11.anInt4665;
		if (local50 != 0 || local53 != 0 || local11.anInt4678 != 0 || local11.anInt4706 != 0) {
			arg0 |= 0x7;
		}
		@Pc(89) boolean local89 = super.aByte98 != 0 && super.anInt7117 <= Static403.anInt6978 && Static403.anInt6978 < super.anInt7083;
		if (local89) {
			arg0 |= 0x80000;
		}
		@Pc(126) Class37 local126 = super.aClass37Array3[0] = this.aClass66_1.method1462(arg1, Static51.aClass79_1, super.anInt7127, super.anInt7121, super.anInt7075, local47, arg0, Static191.aClass28_1, local30, super.anInt7133, Static14.aClass193_1, super.aClass137Array3, super.anInt7082, super.anInt7072);
		if (local126 == null) {
			return false;
		}
		super.anInt7074 = local126.b();
		this.method5527(local126);
		@Pc(143) int local143 = super.aClass255_7.method5749();
		if (local50 == 0 && local53 == 0) {
			this.method5534(0, this.method5535() << 7, 0, this.method5535() << 7, local143);
		} else {
			this.method5534(local11.anInt4667, local50, local11.anInt4700, local53, local143);
			if (super.anInt7113 != 0) {
				super.aClass37Array3[0].WA(super.anInt7113);
			}
			if (super.anInt7134 != 0) {
				super.aClass37Array3[0].o(super.anInt7134);
			}
			if (super.anInt7135 != 0) {
				super.aClass37Array3[0].ja(0, super.anInt7135, 0);
			}
		}
		if (local89) {
			local126.method4222(super.aByte97, super.aByte99, super.aByte96, super.aByte98 & 0xFF);
		}
		@Pc(248) Class45 local248;
		@Pc(260) boolean local260;
		@Pc(262) int local262;
		@Pc(302) Class37 local302;
		if (super.anInt7119 == -1 || super.anInt7107 == -1) {
			super.aClass37Array3[1] = null;
		} else {
			local248 = Static168.aClass115_2.method2718(super.anInt7119);
			local260 = local248.aByte7 == 3 && (local50 != 0 || local53 != 0);
			local262 = local7;
			if (local260) {
				local262 = local7 | 0x7;
			} else {
				if (super.anInt7123 != 0) {
					local262 = local7 | 0x5;
				}
				if (super.anInt7111 != 0) {
					local262 |= 0x2;
				}
			}
			local302 = super.aClass37Array3[1] = local248.method1104(super.anInt7076, super.anInt7128, Static191.aClass28_1, super.anInt7107, local262, arg1);
			if (local302 != null) {
				if (super.anInt7111 != 0) {
					local302.ja(0, -super.anInt7111 << 0, 0);
				}
				if (super.anInt7123 != 0) {
					local302.k(super.anInt7123 * 2048);
				}
				if (local260) {
					if (super.anInt7113 != 0) {
						local302.WA(super.anInt7113);
					}
					if (super.anInt7134 != 0) {
						local302.o(super.anInt7134);
					}
					if (super.anInt7135 != 0) {
						local302.ja(0, super.anInt7135, 0);
					}
				}
			}
		}
		if (super.anInt7102 == -1 || super.anInt7100 == -1) {
			super.aClass37Array3[3] = null;
		} else {
			local248 = Static168.aClass115_2.method2718(super.anInt7102);
			local260 = local248.aByte7 == 3 && (local50 != 0 || local53 != 0);
			local262 = local7;
			if (local260) {
				local262 = local7 | 0x7;
			} else {
				if (super.anInt7081 != 0) {
					local262 = local7 | 0x5;
				}
				if (super.anInt7092 != 0) {
					local262 |= 0x2;
				}
			}
			local302 = super.aClass37Array3[3] = local248.method1106(Static191.aClass28_1, local262, arg1, super.anInt7100, super.anInt7079, super.anInt7108);
			if (local302 != null) {
				if (super.anInt7092 != 0) {
					local302.ja(0, -super.anInt7092 << 0, 0);
				}
				if (super.anInt7081 != 0) {
					local302.k(super.anInt7081 * 2048);
				}
				if (local260) {
					if (super.anInt7113 != 0) {
						local302.WA(super.anInt7113);
					}
					if (super.anInt7134 != 0) {
						local302.o(super.anInt7134);
					}
					if (super.anInt7135 != 0) {
						local302.ja(0, super.anInt7135, 0);
					}
				}
			}
		}
		super.aClass37Array3[2] = null;
		if (super.aClass1_Sub4_3 != null) {
			if (super.aClass1_Sub4_3.anInt791 <= Static403.anInt6978) {
				super.aClass1_Sub4_3 = null;
			} else if (Static403.anInt6978 >= super.aClass1_Sub4_3.anInt807) {
				@Pc(526) Class37 local526 = super.aClass1_Sub4_3.method728(local7 | 0x7, arg1);
				if (local526 != null) {
					local526.ja(super.aClass1_Sub4_3.anInt794 - super.anInt7068, super.aClass1_Sub4_3.anInt797 + -super.anInt7063, -super.anInt7065 + super.aClass1_Sub4_3.anInt790);
					if (local143 != 0) {
						local526.k(local143);
					}
					super.aClass37Array3[2] = local526;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)I")
	@Override
	public int method5522() {
		return super.anInt7074;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass66_1 == null || !this.method5544(131072, arg0)) {
			return false;
		}
		@Pc(19) Class18 local19 = arg0.method4709();
		@Pc(31) int local31 = super.aClass255_7.method5749();
		local19.O(local31);
		local19.ZA(super.anInt7068, super.anInt7063, super.anInt7065);
		for (@Pc(44) int local44 = 0; local44 < super.aClass37Array3.length; local44++) {
			if (super.aClass37Array3[local44] != null && super.aClass37Array3[local44].method4228(arg1, arg2, local19, this.aClass66_1.anInt1717 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
		if (this.aClass66_1 != null && (super.aBoolean460 || this.method5544(0, arg0))) {
			this.method5529(arg0, super.aClass37Array3, super.aBoolean460);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIZZII)V")
	public void method5545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte95 = (byte) arg0;
		if (super.anInt7073 != -1 && Static191.aClass28_1.method567(super.anInt7073).anInt5748 == 1) {
			super.anInt7073 = -1;
		}
		@Pc(35) Class45 local35;
		if (super.anInt7119 != -1) {
			local35 = Static168.aClass115_2.method2718(super.anInt7119);
			if (local35.aBoolean62 && local35.anInt1316 != -1 && Static191.aClass28_1.method567(local35.anInt1316).anInt5748 == 1) {
				super.anInt7119 = -1;
			}
		}
		if (super.anInt7102 != -1) {
			local35 = Static168.aClass115_2.method2718(super.anInt7102);
			if (local35.aBoolean62 && local35.anInt1316 != -1 && Static191.aClass28_1.method567(local35.anInt1316).anInt5748 == 1) {
				super.anInt7102 = -1;
			}
		}
		if (!arg2) {
			@Pc(96) int local96 = arg3 - super.anIntArray590[0];
			@Pc(103) int local103 = arg1 - super.anIntArray589[0];
			if (local96 >= -8 && local96 <= 8 && local103 >= -8 && local103 <= 8) {
				if (super.anInt7148 < 9) {
					super.anInt7148++;
				}
				for (@Pc(136) int local136 = super.anInt7148; local136 > 0; local136--) {
					super.anIntArray590[local136] = super.anIntArray590[local136 - 1];
					super.anIntArray589[local136] = super.anIntArray589[local136 - 1];
					super.aByteArray84[local136] = super.aByteArray84[local136 - 1];
				}
				super.anIntArray590[0] = arg3;
				super.anIntArray589[0] = arg1;
				super.aByteArray84[0] = 1;
				return;
			}
		}
		super.anInt7150 = 0;
		super.anInt7148 = 0;
		super.anInt7147 = 0;
		super.anIntArray590[0] = arg3;
		super.anIntArray589[0] = arg1;
		super.anInt7065 = (super.anIntArray589[0] << 7) + (arg4 << 6);
		super.anInt7068 = (arg4 << 6) + (super.anIntArray590[0] << 7);
		if (super.aClass39_Sub8_7 != null) {
			super.aClass39_Sub8_7.method5628();
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ef;I)V")
	public void method5546(@OriginalArg(0) Class66 arg0) {
		this.aClass66_1 = arg0;
		if (super.aClass39_Sub8_7 != null) {
			super.aClass39_Sub8_7.method5628();
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V")
	public void method5548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray590[0];
		@Pc(15) int local15 = super.anIntArray589[0];
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
		if (super.anInt7073 != -1 && Static191.aClass28_1.method567(super.anInt7073).anInt5748 == 1) {
			super.anInt7073 = -1;
		}
		@Pc(89) Class45 local89;
		if (super.anInt7119 != -1) {
			local89 = Static168.aClass115_2.method2718(super.anInt7119);
			if (local89.aBoolean62 && local89.anInt1316 != -1 && Static191.aClass28_1.method567(local89.anInt1316).anInt5748 == 1) {
				super.anInt7119 = -1;
			}
		}
		if (super.anInt7102 != -1) {
			local89 = Static168.aClass115_2.method2718(super.anInt7102);
			if (local89.aBoolean62 && local89.anInt1316 != -1 && Static191.aClass28_1.method567(local89.anInt1316).anInt5748 == 1) {
				super.anInt7102 = -1;
			}
		}
		if (super.anInt7148 < 9) {
			super.anInt7148++;
		}
		for (@Pc(155) int local155 = super.anInt7148; local155 > 0; local155--) {
			super.anIntArray590[local155] = super.anIntArray590[local155 - 1];
			super.anIntArray589[local155] = super.anIntArray589[local155 - 1];
			super.aByteArray84[local155] = super.aByteArray84[local155 - 1];
		}
		super.anIntArray590[0] = local10;
		super.aByteArray84[0] = (byte) arg1;
		super.anIntArray589[0] = local15;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		if (this.aClass66_1 == null || !this.method5544(2048, arg0)) {
			return null;
		}
		@Pc(19) Class18 local19 = arg0.method4709();
		@Pc(24) int local24 = super.aClass255_7.method5749();
		local19.O(local24);
		local19.ZA(super.anInt7068, super.anInt7063, super.anInt7065);
		@Pc(44) Class164 local44 = this.method5533();
		@Pc(57) Class66 local57 = this.aClass66_1.anIntArray152 == null ? this.aClass66_1 : this.aClass66_1.method1454(Static51.aClass79_1);
		if (Static389.aClass128_Sub1_1.aBoolean243 && local57.aBoolean90 && local44.aBoolean321) {
			@Pc(82) Class191 local82 = super.anInt7073 != -1 && super.anInt7120 == 0 ? Static191.aClass28_1.method567(super.anInt7073) : null;
			@Pc(99) Class191 local99 = super.anInt7122 == -1 || super.aBoolean458 && local82 != null ? null : Static191.aClass28_1.method567(super.anInt7122);
			@Pc(151) Class37 local151 = Static251.method3701(local99 == null ? super.anInt7075 : super.anInt7082, this.aClass66_1.aByte15 & 0xFF, this.aClass66_1.anInt1717, super.anInt7135, super.anInt7134, super.aBoolean457, this.aClass66_1.aByte14 & 0xFF, super.anInt7113, local99 == null ? local82 : local99, arg0, this.aClass66_1.aShort28 & 0xFFFF, super.aClass37Array3[0], this.aClass66_1.aShort27 & 0xFFFF, local24);
			if (local151 != null) {
				@Pc(156) float local156 = arg0.la();
				@Pc(159) float local159 = arg0.w();
				arg0.method4733(false);
				arg0.o(local156, local159 - 150.0F);
				local151.method4230(local19, null, 0);
				arg0.o(local156, local159);
				arg0.method4733(true);
			}
		}
		@Pc(182) Class39_Sub4 local182 = null;
		if (this.method5550()) {
			local182 = Static72.method1208(super.aClass37Array3.length);
		}
		if (super.aClass39_Sub8_7 == null) {
			arg0.method4718(super.aClass37Array3, local19, local182 == null ? null : local182.aClass39_Sub7Array1, 0);
		} else {
			@Pc(213) Class185 local213 = super.aClass39_Sub8_7.method5629();
			arg0.method4688(super.aClass37Array3, local213, local19, local182 == null ? null : local182.aClass39_Sub7Array1, 0);
		}
		this.method5529(arg0, super.aClass37Array3, false);
		if (super.aClass37Array3[2] != null) {
			if (local24 != 0) {
				super.aClass37Array3[2].k(local24);
			}
			super.aClass37Array3[2].ja(super.anInt7068 - super.aClass1_Sub4_3.anInt794, super.anInt7063 + -super.aClass1_Sub4_3.anInt797, super.anInt7065 - super.aClass1_Sub4_3.anInt790);
		}
		super.anInt7145 = Static243.anInt4342;
		return local182;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)Z")
	private boolean method5550() {
		return this.aClass66_1.aBoolean88;
	}
}
