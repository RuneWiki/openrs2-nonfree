import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class6_Sub2_Sub1_Sub2 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!rk", name = "Tc", descriptor = "Lclient!ul;")
	public Class243 aClass243_1;

	@OriginalMember(owner = "client!rk", name = "yc", descriptor = "I")
	public int anInt6150 = -1;

	@OriginalMember(owner = "client!rk", name = "Dc", descriptor = "I")
	public int anInt6155 = -1;

	static {
		new Class242("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!ul;I)V")
	public void method4770(@OriginalArg(0) Class243 arg0) {
		this.aClass243_1 = arg0;
		if (super.aClass41_Sub1_7 != null) {
			super.aClass41_Sub1_7.method3161();
		}
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		if (this.aClass243_1 == null || !this.method4776(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class116 local19 = arg2.method4678();
		@Pc(24) int local24 = super.aClass216_7.method4985();
		local19.O(local24);
		local19.ZA(super.anInt6062, super.anInt6067, super.anInt6061);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass7Array3.length; local39++) {
			if (super.aClass7Array3[local39] != null && super.aClass7Array3[local39].method4082(arg0, arg1, local19, this.aClass243_1.anInt6902 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass7Array3[0] = super.aClass7Array3[1] = super.aClass7Array3[2] = super.aClass7Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIZI)V")
	public void method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super.aByte86 = (byte) arg1;
		if (super.anInt6068 != -1 && Static269.aClass10_1.method286(super.anInt6068).anInt6744 == 1) {
			super.anInt6068 = -1;
		}
		@Pc(48) Class161 local48;
		if (super.anInt6120 != -1) {
			local48 = Static92.aClass89_1.method1918(super.anInt6120);
			if (local48.aBoolean340 && local48.anInt4699 != -1 && Static269.aClass10_1.method286(local48.anInt4699).anInt6744 == 1) {
				super.anInt6120 = -1;
			}
		}
		if (super.anInt6084 != -1) {
			local48 = Static92.aClass89_1.method1918(super.anInt6084);
			if (local48.aBoolean340 && local48.anInt4699 != -1 && Static269.aClass10_1.method286(local48.anInt4699).anInt6744 == 1) {
				super.anInt6084 = -1;
			}
		}
		if (!arg4) {
			@Pc(111) int local111 = arg3 - super.anIntArray536[0];
			@Pc(118) int local118 = arg2 - super.anIntArray537[0];
			if (local111 >= -8 && local111 <= 8 && local118 >= -8 && local118 <= 8) {
				if (super.anInt6147 < 9) {
					super.anInt6147++;
				}
				for (@Pc(151) int local151 = super.anInt6147; local151 > 0; local151--) {
					super.anIntArray536[local151] = super.anIntArray536[local151 - 1];
					super.anIntArray537[local151] = super.anIntArray537[local151 - 1];
					super.aByteArray69[local151] = super.aByteArray69[local151 - 1];
				}
				super.anIntArray536[0] = arg3;
				super.anIntArray537[0] = arg2;
				super.aByteArray69[0] = 1;
				return;
			}
		}
		super.anIntArray536[0] = arg3;
		super.anInt6146 = 0;
		super.anInt6147 = 0;
		super.anInt6145 = 0;
		super.anIntArray537[0] = arg2;
		super.anInt6061 = (arg0 << 6) + (super.anIntArray537[0] << 7);
		super.anInt6062 = (super.anIntArray536[0] << 7) + (arg0 << 6);
		if (super.aClass41_Sub1_7 != null) {
			super.aClass41_Sub1_7.method3161();
		}
	}

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "(I)Z")
	private boolean method4773() {
		return this.aClass243_1.aBoolean461;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)I")
	@Override
	public int method4752() {
		return super.anInt6099;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		if (this.aClass243_1 == null || !this.method4776(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class116 local17 = arg0.method4678();
		@Pc(22) int local22 = super.aClass216_7.method4985();
		local17.O(local22);
		local17.ZA(super.anInt6062, super.anInt6067, super.anInt6061);
		@Pc(37) Class132 local37 = this.method4762();
		@Pc(50) Class243 local50 = this.aClass243_1.anIntArray613 == null ? this.aClass243_1 : this.aClass243_1.method5337(Static155.aClass149_1);
		if (Static126.aClass67_Sub1_1.aBoolean400 && local50.aBoolean462 && local37.aBoolean287) {
			@Pc(77) Class233 local77 = super.anInt6068 != -1 && super.anInt6117 == 0 ? Static269.aClass10_1.method286(super.anInt6068) : null;
			@Pc(94) Class233 local94 = super.anInt6077 == -1 || super.aBoolean421 && local77 != null ? null : Static269.aClass10_1.method286(super.anInt6077);
			@Pc(146) Class7 local146 = Static346.method4894(local94 == null ? local77 : local94, this.aClass243_1.anInt6902, this.aClass243_1.aShort92 & 0xFFFF, super.anInt6137, super.anInt6097, this.aClass243_1.aShort93 & 0xFFFF, super.aClass7Array3[0], super.anInt6109, local22, local94 == null ? super.anInt6091 : super.anInt6072, this.aClass243_1.aByte99 & 0xFF, arg0, super.lb, this.aClass243_1.aByte102 & 0xFF);
			if (local146 != null) {
				@Pc(151) float local151 = arg0.la();
				@Pc(154) float local154 = arg0.w();
				arg0.method4663(false);
				arg0.o(local151, local154 - 150.0F);
				local146.method4091(local17, null, 0);
				arg0.o(local151, local154);
				arg0.method4663(true);
			}
		}
		@Pc(177) Class41_Sub6 local177 = null;
		if (this.method4773()) {
			local177 = Static381.method5198(super.aClass7Array3.length);
		}
		if (super.aClass41_Sub1_7 == null) {
			arg0.method4701(super.aClass7Array3, local17, local177 == null ? null : local177.aClass41_Sub4Array1, 0);
		} else {
			@Pc(208) Class256 local208 = super.aClass41_Sub1_7.method3166();
			arg0.method4659(super.aClass7Array3, local208, local17, local177 == null ? null : local177.aClass41_Sub4Array1, 0);
		}
		this.method4765(arg0, super.aClass7Array3, false);
		if (super.aClass7Array3[2] != null) {
			if (local22 != 0) {
				super.aClass7Array3[2].k(local22);
			}
			super.aClass7Array3[2].ja(super.anInt6062 - super.aClass4_Sub13_3.anInt2498, -super.aClass4_Sub13_3.anInt2505 + super.anInt6067, -super.aClass4_Sub13_3.anInt2491 + super.anInt6061);
		}
		super.aClass7Array3[0] = super.aClass7Array3[1] = super.aClass7Array3[2] = super.aClass7Array3[3] = null;
		super.anInt6076 = Static203.anInt3898;
		return local177;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	public void method4775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray536[0];
		@Pc(15) int local15 = super.anIntArray537[0];
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
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt6068 != -1 && Static269.aClass10_1.method286(super.anInt6068).anInt6744 == 1) {
			super.anInt6068 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(89) Class161 local89;
		if (super.anInt6120 != -1) {
			local89 = Static92.aClass89_1.method1918(super.anInt6120);
			if (local89.aBoolean340 && local89.anInt4699 != -1 && Static269.aClass10_1.method286(local89.anInt4699).anInt6744 == 1) {
				super.anInt6120 = -1;
			}
		}
		if (super.anInt6084 != -1) {
			local89 = Static92.aClass89_1.method1918(super.anInt6084);
			if (local89.aBoolean340 && local89.anInt4699 != -1 && Static269.aClass10_1.method286(local89.anInt4699).anInt6744 == 1) {
				super.anInt6084 = -1;
			}
		}
		if (super.anInt6147 < 9) {
			super.anInt6147++;
		}
		for (@Pc(156) int local156 = super.anInt6147; local156 > 0; local156--) {
			super.anIntArray536[local156] = super.anIntArray536[local156 - 1];
			super.anIntArray537[local156] = super.anIntArray537[local156 - 1];
			super.aByteArray69[local156] = super.aByteArray69[local156 - 1];
		}
		super.anIntArray536[0] = local10;
		super.anIntArray537[0] = local15;
		super.aByteArray69[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!qa;II)Z")
	private boolean method4776(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class132 local11 = this.method4762();
		@Pc(26) Class233 local26 = super.anInt6068 != -1 && super.anInt6117 == 0 ? Static269.aClass10_1.method286(super.anInt6068) : null;
		@Pc(44) Class233 local44 = super.anInt6077 == -1 || super.aBoolean421 && local26 != null ? null : Static269.aClass10_1.method286(super.anInt6077);
		@Pc(55) int local55 = local11.anInt3733;
		@Pc(58) int local58 = local11.anInt3734;
		if (local55 != 0 || local58 != 0 || local11.anInt3741 != 0 || local11.anInt3744 != 0) {
			arg1 |= 0x7;
		}
		@Pc(104) boolean local104 = super.aByte88 != 0 && super.anInt6075 <= Static175.anInt3261 && Static175.anInt3261 < super.anInt6114;
		if (local104) {
			arg1 |= 0x80000;
		}
		@Pc(141) Class7 local141 = super.aClass7Array3[0] = this.aClass243_1.method5335(Static8.aClass226_1, super.anInt6089, super.anInt6091, arg1, super.anInt6080, local26, super.anInt6072, super.anInt6129, Static269.aClass10_1, super.aClass109Array3, local44, Static155.aClass149_1, arg0, super.anInt6088);
		if (local141 == null) {
			return false;
		}
		super.anInt6099 = local141.b();
		this.method4758(local141);
		@Pc(158) int local158 = super.aClass216_7.method4985();
		if (local55 == 0 && local58 == 0) {
			this.method4767(this.method4763() << 7, 0, this.method4763() << 7, 0, local158);
		} else {
			this.method4767(local55, local11.anInt3753, local58, local11.anInt3765, local158);
			if (super.anInt6109 != 0) {
				super.aClass7Array3[0].WA(super.anInt6109);
			}
			if (super.anInt6137 != 0) {
				super.aClass7Array3[0].o(super.anInt6137);
			}
			if (super.anInt6097 != 0) {
				super.aClass7Array3[0].ja(0, super.anInt6097, 0);
			}
		}
		if (local104) {
			local141.method4087(super.aByte87, super.aByte89, super.aByte90, super.aByte88 & 0xFF);
		}
		@Pc(254) Class161 local254;
		@Pc(269) boolean local269;
		@Pc(271) int local271;
		@Pc(314) Class7 local314;
		if (super.anInt6120 == -1 || super.anInt6082 == -1) {
			super.aClass7Array3[1] = null;
		} else {
			local254 = Static92.aClass89_1.method1918(super.anInt6120);
			local269 = local254.aByte75 == 3 && (local55 != 0 || local58 != 0);
			local271 = local7;
			if (local269) {
				local271 = local7 | 0x7;
			} else {
				if (super.anInt6083 != 0) {
					local271 = local7 | 0x5;
				}
				if (super.anInt6085 != 0) {
					local271 |= 0x2;
				}
			}
			local314 = super.aClass7Array3[1] = local254.method3587(super.anInt6118, super.anInt6082, local271, super.anInt6135, arg0, Static269.aClass10_1);
			if (local314 != null) {
				if (super.anInt6085 != 0) {
					local314.ja(0, -super.anInt6085 << 0, 0);
				}
				if (super.anInt6083 != 0) {
					local314.k(super.anInt6083 * 2048);
				}
				if (local269) {
					if (super.anInt6109 != 0) {
						local314.WA(super.anInt6109);
					}
					if (super.anInt6137 != 0) {
						local314.o(super.anInt6137);
					}
					if (super.anInt6097 != 0) {
						local314.ja(0, super.anInt6097, 0);
					}
				}
			}
		}
		if (super.anInt6084 == -1 || super.anInt6124 == -1) {
			super.aClass7Array3[3] = null;
		} else {
			local254 = Static92.aClass89_1.method1918(super.anInt6084);
			local269 = local254.aByte75 == 3 && (local55 != 0 || local58 != 0);
			local271 = local7;
			if (local269) {
				local271 = local7 | 0x7;
			} else {
				if (super.anInt6069 != 0) {
					local271 = local7 | 0x5;
				}
				if (super.anInt6125 != 0) {
					local271 |= 0x2;
				}
			}
			local314 = super.aClass7Array3[3] = local254.method3586(arg0, super.anInt6128, super.anInt6100, local271, super.anInt6124, Static269.aClass10_1);
			if (local314 != null) {
				if (super.anInt6125 != 0) {
					local314.ja(0, -super.anInt6125 << 0, 0);
				}
				if (super.anInt6069 != 0) {
					local314.k(super.anInt6069 * 2048);
				}
				if (local269) {
					if (super.anInt6109 != 0) {
						local314.WA(super.anInt6109);
					}
					if (super.anInt6137 != 0) {
						local314.o(super.anInt6137);
					}
					if (super.anInt6097 != 0) {
						local314.ja(0, super.anInt6097, 0);
					}
				}
			}
		}
		super.aClass7Array3[2] = null;
		if (super.aClass4_Sub13_3 != null) {
			if (super.aClass4_Sub13_3.anInt2487 <= Static175.anInt3261) {
				super.aClass4_Sub13_3 = null;
			} else if (super.aClass4_Sub13_3.anInt2496 <= Static175.anInt3261) {
				@Pc(553) Class7 local553 = super.aClass4_Sub13_3.method1860(arg0, local7 | 0x7);
				if (local553 != null) {
					local553.ja(super.aClass4_Sub13_3.anInt2498 - super.anInt6062, -super.anInt6067 + super.aClass4_Sub13_3.anInt2505, super.aClass4_Sub13_3.anInt2491 - super.anInt6061);
					if (local158 != 0) {
						local553.k(local158);
					}
					super.aClass7Array3[2] = local553;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "(I)Z")
	public boolean method4777() {
		return this.aClass243_1 != null;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
		if (this.aClass243_1 != null && (super.aBoolean423 || this.method4776(arg0, 0))) {
			this.method4765(arg0, super.aClass7Array3, super.aBoolean423);
			super.aClass7Array3[0] = super.aClass7Array3[1] = super.aClass7Array3[2] = super.aClass7Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "(I)I")
	@Override
	public int method4768() {
		if (this.aClass243_1.anIntArray613 != null) {
			@Pc(13) Class243 local13 = this.aClass243_1.method5337(Static155.aClass149_1);
			if (local13 != null && local13.anInt6904 != -1) {
				return local13.anInt6904;
			}
		}
		return this.aClass243_1.anInt6904 == -1 ? super.method4768() : this.aClass243_1.anInt6904;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "(I)I")
	@Override
	protected int method4769() {
		if (this.aClass243_1.anIntArray613 != null) {
			@Pc(13) Class243 local13 = this.aClass243_1.method5337(Static155.aClass149_1);
			if (local13 != null && local13.anInt6918 != -1) {
				return local13.anInt6918;
			}
		}
		return this.aClass243_1.anInt6918;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I")
	@Override
	public int method4757() {
		if (this.aClass243_1.anIntArray613 != null) {
			@Pc(13) Class243 local13 = this.aClass243_1.method5337(Static155.aClass149_1);
			if (local13 != null && local13.anInt6898 != -1) {
				return local13.anInt6898;
			}
		}
		return this.aClass243_1.anInt6898;
	}
}
