import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class26_Sub2_Sub2_Sub1 extends Class26_Sub2_Sub2 {

	@OriginalMember(owner = "client!tf", name = "yc", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!tf", name = "zc", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!tf", name = "Sc", descriptor = "I")
	private int anInt6643;

	@OriginalMember(owner = "client!tf", name = "ad", descriptor = "I")
	public int anInt6650;

	@OriginalMember(owner = "client!tf", name = "gd", descriptor = "I")
	public int anInt6656;

	@OriginalMember(owner = "client!tf", name = "vd", descriptor = "Lclient!jh;")
	public Class127 aClass127_1;

	@OriginalMember(owner = "client!tf", name = "Bc", descriptor = "I")
	public int anInt6629 = -1;

	@OriginalMember(owner = "client!tf", name = "Oc", descriptor = "I")
	public int anInt6640 = 0;

	@OriginalMember(owner = "client!tf", name = "Qc", descriptor = "Z")
	public boolean aBoolean433 = false;

	@OriginalMember(owner = "client!tf", name = "Dc", descriptor = "I")
	public int anInt6631 = -1;

	@OriginalMember(owner = "client!tf", name = "Jc", descriptor = "I")
	public int anInt6635 = 0;

	@OriginalMember(owner = "client!tf", name = "Ec", descriptor = "I")
	public int anInt6632 = 255;

	@OriginalMember(owner = "client!tf", name = "Xc", descriptor = "B")
	private byte aByte89 = 0;

	@OriginalMember(owner = "client!tf", name = "Yc", descriptor = "I")
	public int anInt6648 = -1;

	@OriginalMember(owner = "client!tf", name = "Ac", descriptor = "I")
	public int anInt6628 = -1;

	@OriginalMember(owner = "client!tf", name = "Ic", descriptor = "Z")
	public boolean aBoolean432 = false;

	@OriginalMember(owner = "client!tf", name = "bd", descriptor = "I")
	public int anInt6651 = -1;

	@OriginalMember(owner = "client!tf", name = "ld", descriptor = "B")
	private byte aByte90 = 0;

	@OriginalMember(owner = "client!tf", name = "cd", descriptor = "I")
	public int anInt6652 = 0;

	@OriginalMember(owner = "client!tf", name = "xc", descriptor = "I")
	public int anInt6627 = 0;

	@OriginalMember(owner = "client!tf", name = "Tc", descriptor = "I")
	public int anInt6644 = -1;

	@OriginalMember(owner = "client!tf", name = "hd", descriptor = "Z")
	public boolean aBoolean434 = false;

	@OriginalMember(owner = "client!tf", name = "Mc", descriptor = "I")
	public int anInt6638 = -1;

	@OriginalMember(owner = "client!tf", name = "rd", descriptor = "I")
	public int anInt6662 = -1;

	@OriginalMember(owner = "client!tf", name = "td", descriptor = "B")
	private byte aByte91 = 0;

	@OriginalMember(owner = "client!tf", name = "ud", descriptor = "I")
	public int anInt6664 = 0;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method5252() {
		@Pc(7) String local7 = "";
		if (Static359.aStringArray48 != null) {
			local7 = local7 + Static359.aStringArray48[this.aByte90];
		}
		@Pc(29) int[] local29;
		if (this.aByte89 == 1 && Static175.anIntArray269 != null) {
			local29 = Static175.anIntArray269;
		} else {
			local29 = Static241.anIntArray346;
		}
		if (local29 != null && local29[this.aByte90] != -1) {
			@Pc(57) Class46 local57 = Static304.aClass15_1.method387(local29[this.aByte90]);
			if (local57.aChar2 == 's') {
				local7 = local7 + local57.method1132(this.aByte91 & 0xFF);
			} else {
				Static315.method4700(new Throwable(), "gdn1");
				local29[this.aByte90] = -1;
			}
		}
		local7 = local7 + this.aString50;
		if (Static253.aStringArray40 != null) {
			local7 = local7 + Static253.aStringArray40[this.aByte90];
		}
		return local7;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		if (this.aClass127_1 == null || !this.method5253(2048, arg0)) {
			return null;
		}
		@Pc(25) Class18 local25 = arg0.method4709();
		@Pc(30) int local30 = super.aClass255_7.method5749();
		local25.O(local30);
		local25.ZA(super.anInt7068, super.anInt7063, super.anInt7065);
		@Pc(44) float local44 = arg0.la();
		@Pc(47) float local47 = arg0.w();
		if (Static389.aClass128_Sub1_1.aBoolean243) {
			@Pc(54) Class164 local54 = this.method5533();
			if (local54.aBoolean321 && (this.aClass127_1.anInt3503 == -1 || Static322.aClass187_2.method4504(this.aClass127_1.anInt3503).aBoolean90)) {
				@Pc(89) Class191 local89 = super.anInt7073 != -1 && super.anInt7120 == 0 ? Static191.aClass28_1.method567(super.anInt7073) : null;
				@Pc(110) Class191 local110 = super.anInt7122 == -1 || this.aBoolean433 || super.aBoolean458 && local89 != null ? null : Static191.aClass28_1.method567(super.anInt7122);
				@Pc(144) Class37 local144 = Static251.method3701(local110 == null ? super.anInt7075 : super.anInt7082, 160, 1, super.anInt7135, super.anInt7134, super.aBoolean457, 240, super.anInt7113, local110 == null ? local89 : local110, arg0, 0, super.aClass37Array3[0], 0, local30);
				if (local144 != null) {
					arg0.o(local44, local47 - 128.0F);
					arg0.method4733(false);
					local144.method4230(local25, null, 0);
					arg0.method4733(true);
				}
			}
		}
		if (Static196.aClass26_Sub2_Sub2_Sub1_1 == this) {
			arg0.o(local44, local47 - 144.0F);
			local25.R(super.anInt7068, super.anInt7063, super.anInt7065);
			for (@Pc(185) int local185 = Static444.aClass3Array1.length - 1; local185 >= 0; local185--) {
				@Pc(191) Class3 local191 = Static444.aClass3Array1[local185];
				if (local191 != null && local191.anInt173 != -1) {
					@Pc(234) int local234;
					@Pc(227) int local227;
					if (local191.anInt171 == 1 && local191.anInt164 >= 0 && local191.anInt164 < Static410.aClass26_Sub2_Sub2_Sub2Array1.length) {
						@Pc(218) Class26_Sub2_Sub2_Sub2 local218 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local191.anInt164];
						if (local218 != null) {
							local227 = local218.anInt7068 - Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068;
							local234 = local218.anInt7065 - Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065;
							this.method5257(local227, 5760000, arg0, local234, super.aClass37Array3[0], local25, local191.anInt173);
						}
					}
					if (local191.anInt171 == 2) {
						@Pc(263) int local263 = local191.anInt168 + 64 - Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068;
						local227 = local191.anInt172 + 64 - Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065;
						local234 = local191.anInt163 << 7;
						local234 *= local234;
						this.method5257(local263, local234, arg0, local227, super.aClass37Array3[0], local25, local191.anInt173);
					}
					if (local191.anInt171 == 10 && local191.anInt164 >= 0 && Static311.aClass26_Sub2_Sub2_Sub1Array1.length > local191.anInt164) {
						@Pc(314) Class26_Sub2_Sub2_Sub1 local314 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local191.anInt164];
						if (local314 != null) {
							local227 = local314.anInt7068 - Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068;
							local234 = local314.anInt7065 - Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065;
							this.method5257(local227, 5760000, arg0, local234, super.aClass37Array3[0], local25, local191.anInt173);
						}
					}
				}
			}
			local25.O(local30);
			local25.ZA(super.anInt7068, super.anInt7063, super.anInt7065);
		}
		arg0.o(local44, local47);
		@Pc(368) Class39_Sub4 local368 = Static72.method1208(super.aClass37Array3.length);
		if (super.aClass39_Sub8_7 == null) {
			arg0.method4718(super.aClass37Array3, local25, local368.aClass39_Sub7Array1, Static196.aClass26_Sub2_Sub2_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(390) Class185 local390 = super.aClass39_Sub8_7.method5629();
			arg0.method4688(super.aClass37Array3, local390, local25, local368.aClass39_Sub7Array1, Static196.aClass26_Sub2_Sub2_Sub1_1 == this ? 1 : 0);
		}
		this.method5529(arg0, super.aClass37Array3, false);
		if (super.aClass37Array3[2] != null) {
			if (local30 != 0) {
				super.aClass37Array3[2].k(local30);
			}
			super.aClass37Array3[2].ja(-super.aClass1_Sub4_3.anInt794 + super.anInt7068, -super.aClass1_Sub4_3.anInt797 + super.anInt7063, super.anInt7065 - super.aClass1_Sub4_3.anInt790);
		}
		super.anInt7145 = Static243.anInt4342;
		return local368;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!qa;I)Z")
	private boolean method5253(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class164 local11 = this.method5533();
		@Pc(30) Class191 local30 = super.anInt7073 != -1 && super.anInt7120 == 0 ? Static191.aClass28_1.method567(super.anInt7073) : null;
		@Pc(51) Class191 local51 = super.anInt7122 == -1 || this.aBoolean433 || super.aBoolean458 && local30 != null ? null : Static191.aClass28_1.method567(super.anInt7122);
		@Pc(54) int local54 = local11.anInt4693;
		@Pc(57) int local57 = local11.anInt4665;
		if (local54 != 0 || local57 != 0 || local11.anInt4678 != 0 || local11.anInt4706 != 0) {
			arg0 |= 0x7;
		}
		@Pc(98) boolean local98 = super.aByte98 != 0 && super.anInt7117 <= Static403.anInt6978 && Static403.anInt6978 < super.anInt7083;
		if (local98) {
			arg0 |= 0x80000;
		}
		@Pc(141) Class37 local141 = super.aClass37Array3[0] = this.aClass127_1.method2938(super.anInt7072, super.anInt7075, super.anInt7133, Static46.aClass233_1, Static14.aClass193_1, super.anInt7121, super.anInt7082, arg1, super.anInt7127, arg0, Static322.aClass187_2, Static196.aClass139_1, Static51.aClass79_1, super.aClass137Array3, local30, Static191.aClass28_1, local51);
		@Pc(146) int local146 = Static450.method6019();
		if (Static113.anInt5764 < 96 && local146 > 50) {
			Static257.method3778();
		}
		@Pc(178) int local178;
		if (Static234.aClass176_7 != Static221.aClass176_5 && local146 < 50) {
			local178 = 50 - local146;
			while (Static410.anInt7174 < local178) {
				Static276.aByteArrayArray96[Static410.anInt7174] = new byte[102400];
				Static410.anInt7174++;
			}
			while (Static410.anInt7174 > local178) {
				Static410.anInt7174--;
				Static276.aByteArrayArray96[Static410.anInt7174] = null;
			}
		} else if (Static234.aClass176_7 != Static221.aClass176_5) {
			Static410.anInt7174 = 0;
			Static276.aByteArrayArray96 = new byte[50][];
		}
		if (local141 == null) {
			return false;
		}
		super.anInt7074 = local141.b();
		this.method5527(local141);
		local178 = super.aClass255_7.method5749();
		if (local54 == 0 && local57 == 0) {
			this.method5534(0, this.method5535() << 7, 0, this.method5535() << 7, local178);
		} else {
			this.method5534(local11.anInt4667, local54, local11.anInt4700, local57, local178);
			if (super.anInt7113 != 0) {
				local141.WA(super.anInt7113);
			}
			if (super.anInt7134 != 0) {
				local141.o(super.anInt7134);
			}
			if (super.anInt7135 != 0) {
				local141.ja(0, super.anInt7135, 0);
			}
		}
		if (local98) {
			local141.method4222(super.aByte97, super.aByte99, super.aByte96, super.aByte98 & 0xFF);
		}
		@Pc(337) Class45 local337;
		@Pc(352) boolean local352;
		@Pc(354) int local354;
		@Pc(402) Class37 local402;
		if (this.aBoolean433 || super.anInt7119 == -1 || super.anInt7107 == -1) {
			super.aClass37Array3[1] = null;
		} else {
			local337 = Static168.aClass115_2.method2718(super.anInt7119);
			local352 = local337.aByte7 == 3 && (local54 != 0 || local57 != 0);
			local354 = local7;
			if (local352) {
				local354 = local7 | 0x7;
			} else {
				if (super.anInt7123 != 0) {
					local354 = local7 | 0x5;
				}
				if (super.anInt7111 != 0) {
					local354 |= 0x2;
				}
			}
			local402 = super.aClass37Array3[1] = local337.method1104(super.anInt7076, super.anInt7128, Static191.aClass28_1, super.anInt7107, local354, arg1);
			if (local402 != null) {
				if (super.anInt7111 != 0) {
					local402.ja(0, -super.anInt7111 << 0, 0);
				}
				if (super.anInt7123 != 0) {
					local402.k(super.anInt7123 * 2048);
				}
				if (local352) {
					if (super.anInt7113 != 0) {
						local402.WA(super.anInt7113);
					}
					if (super.anInt7134 != 0) {
						local402.o(super.anInt7134);
					}
					if (super.anInt7135 != 0) {
						local402.ja(0, super.anInt7135, 0);
					}
				}
			}
		}
		if (this.aBoolean433 || super.anInt7102 == -1 || super.anInt7100 == -1) {
			super.aClass37Array3[3] = null;
		} else {
			local337 = Static168.aClass115_2.method2718(super.anInt7102);
			local352 = local337.aByte7 == 3 && (local54 != 0 || local57 != 0);
			local354 = local7;
			if (local352) {
				local354 = local7 | 0x7;
			} else {
				if (super.anInt7081 != 0) {
					local354 = local7 | 0x5;
				}
				if (super.anInt7092 != 0) {
					local354 |= 0x2;
				}
			}
			local402 = super.aClass37Array3[3] = local337.method1106(Static191.aClass28_1, local354, arg1, super.anInt7100, super.anInt7079, super.anInt7108);
			if (local402 != null) {
				if (super.anInt7092 != 0) {
					local402.ja(0, -super.anInt7092 << 0, 0);
				}
				if (super.anInt7081 != 0) {
					local402.k(super.anInt7081 * 2048);
				}
				if (local352) {
					if (super.anInt7113 != 0) {
						local402.WA(super.anInt7113);
					}
					if (super.anInt7134 != 0) {
						local402.o(super.anInt7134);
					}
					if (super.anInt7135 != 0) {
						local402.ja(0, super.anInt7135, 0);
					}
				}
			}
		}
		super.aClass37Array3[2] = null;
		if (!this.aBoolean433 && super.aClass1_Sub4_3 != null) {
			if (Static403.anInt6978 >= super.aClass1_Sub4_3.anInt791) {
				super.aClass1_Sub4_3 = null;
			} else if (Static403.anInt6978 >= super.aClass1_Sub4_3.anInt807) {
				@Pc(636) Class37 local636 = super.aClass1_Sub4_3.method728(local7 | 0x7, arg1);
				if (local636 != null) {
					local636.ja(super.aClass1_Sub4_3.anInt794 - super.anInt7068, -super.anInt7063 + super.aClass1_Sub4_3.anInt797, super.aClass1_Sub4_3.anInt790 - super.anInt7065);
					if (local178 != 0) {
						local636.k(-local178 & 0x3FFF);
					}
					super.aClass37Array3[2] = local636;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)Z")
	public boolean method5254() {
		return this.aClass127_1 != null;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)I")
	@Override
	public int method5522() {
		return super.anInt7074;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
	@Override
	public int method5530() {
		return -1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIB)V")
	public void method5255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt7073 != -1 && Static191.aClass28_1.method567(super.anInt7073).anInt5748 == 1) {
			super.anInt7073 = -1;
		}
		@Pc(30) Class45 local30;
		if (super.anInt7119 != -1) {
			local30 = Static168.aClass115_2.method2718(super.anInt7119);
			if (local30.aBoolean62 && local30.anInt1316 != -1 && Static191.aClass28_1.method567(local30.anInt1316).anInt5748 == 1) {
				super.anInt7119 = -1;
			}
		}
		if (super.anInt7102 != -1) {
			local30 = Static168.aClass115_2.method2718(super.anInt7102);
			if (local30.aBoolean62 && local30.anInt1316 != -1 && Static191.aClass28_1.method567(local30.anInt1316).anInt5748 == 1) {
				super.anInt7102 = -1;
			}
		}
		this.anInt6644 = -1;
		if (arg1 < 0 || arg1 >= Static135.anInt2314 || arg0 < 0 || Static352.anInt6022 <= arg0) {
			this.method5256(arg1, arg0);
		} else if (super.anIntArray590[0] >= 0 && super.anIntArray590[0] < Static135.anInt2314 && super.anIntArray589[0] >= 0 && super.anIntArray589[0] < Static352.anInt6022) {
			if (arg2 == 2) {
				Static84.method1422(arg1, arg0, this);
			}
			this.method5260(arg2, arg0, arg1);
		} else {
			this.method5256(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
	@Override
	protected int method5538() {
		return this.anInt6643;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass127_1 == null || !this.method5253(131072, arg0)) {
			return true;
		}
		@Pc(21) Class18 local21 = arg0.method4709();
		@Pc(26) int local26 = super.aClass255_7.method5749();
		local21.O(local26);
		local21.ZA(super.anInt7068, super.anInt7063, super.anInt7065);
		for (@Pc(48) int local48 = 0; super.aClass37Array3.length > local48; local48++) {
			if (super.aClass37Array3[local48] != null && super.aClass37Array3[local48].method4228(arg1, arg2, local21, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V")
	public void method5256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt7148 = 0;
		super.anIntArray590[0] = arg0;
		super.anInt7150 = 0;
		super.anInt7147 = 0;
		super.anIntArray589[0] = arg1;
		@Pc(28) int local28 = this.method5535();
		super.anInt7068 = local28 * 64 + super.anIntArray590[0] * 128;
		super.anInt7065 = super.anIntArray589[0] * 128 + local28 * 64;
		if (Static196.aClass26_Sub2_Sub2_Sub1_1 == this) {
			Static215.method3267();
		}
		if (super.aClass39_Sub8_7 != null) {
			super.aClass39_Sub8_7.method5628();
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
		if (this.aClass127_1 != null && (super.aBoolean460 || this.method5253(0, arg0))) {
			this.method5529(arg0, super.aClass37Array3, super.aBoolean460);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!qa;ILclient!c;Lclient!ia;ZI)V")
	private void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class37 arg4, @OriginalArg(5) Class18 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg0 * arg0;
		if (local11 < 16384 || arg1 < local11) {
			return;
		}
		@Pc(45) int local45 = (int) (Math.atan2((double) arg0, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(57) Class37 local57 = Static170.method2699(super.anInt7113, super.anInt7134, arg2, arg6, local45, super.anInt7135);
		if (local57 != null) {
			arg2.method4733(false);
			local57.method4230(arg5, null, 0);
			arg2.method4733(true);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(IZ)Ljava/lang/String;")
	public String method5259() {
		return this.aString51;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZBII)V")
	public void method5260(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7148 < 9) {
			super.anInt7148++;
		}
		for (@Pc(27) int local27 = super.anInt7148; local27 > 0; local27--) {
			super.anIntArray590[local27] = super.anIntArray590[local27 - 1];
			super.anIntArray589[local27] = super.anIntArray589[local27 - 1];
			super.aByteArray84[local27] = super.aByteArray84[local27 - 1];
		}
		super.anIntArray590[0] = arg2;
		super.aByteArray84[0] = arg0;
		super.anIntArray589[0] = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	@Override
	public int method5535() {
		return this.aClass127_1 == null || this.aClass127_1.anInt3503 == -1 ? super.method5535() : Static322.aClass187_2.method4504(this.aClass127_1.anInt3503).anInt1717;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!lh;)V")
	public void method5262(@OriginalArg(1) Class1_Sub1 arg0) {
		arg0.anInt5056 = 0;
		@Pc(12) int local12 = arg0.method4130();
		this.aByte89 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(43) int local43 = super.method5535();
		this.method5539((local12 >> 3 & 0x7) + 1);
		this.aByte90 = (byte) (local12 >> 6 & 0x3);
		super.anInt7068 += this.method5535() - local43 << 6;
		super.anInt7065 += this.method5535() - local43 << 6;
		this.aByte91 = arg0.method4112();
		this.anInt6631 = arg0.method4112();
		this.anInt6628 = arg0.method4112();
		@Pc(104) int local104 = -1;
		this.anInt6635 = 0;
		@Pc(110) int[] local110 = new int[12];
		@Pc(135) int local135;
		@Pc(141) int local141;
		@Pc(182) int local182;
		for (@Pc(112) int local112 = 0; local112 < 12; local112++) {
			@Pc(118) int local118 = arg0.method4130();
			if (local118 == 0) {
				local110[local112] = 0;
			} else {
				local135 = arg0.method4130();
				local141 = local135 + (local118 << 8);
				if (local112 == 0 && local141 == 65535) {
					local104 = arg0.method4093();
					this.anInt6635 = arg0.method4130();
					break;
				}
				if (local141 >= 32768) {
					local141 = Static176.anIntArray270[local141 - 32768];
					local110[local112] = local141 | 0x40000000;
					local182 = Static196.aClass139_1.method3228(local141).anInt7733;
					if (local182 != 0) {
						this.anInt6635 = local182;
					}
				} else {
					local110[local112] = local141 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(204) int[] local204 = new int[5];
		for (local135 = 0; local135 < 5; local135++) {
			local141 = arg0.method4130();
			if (local141 < 0 || local141 >= Static133.aShortArrayArray2[local135].length) {
				local141 = 0;
			}
			local204[local135] = local141;
		}
		this.anInt6643 = arg0.method4093();
		this.aString50 = arg0.method4137();
		if (local26) {
			this.aString51 = arg0.method4137();
		} else {
			this.aString51 = this.aString50;
		}
		this.anInt6652 = arg0.method4130();
		if (local37) {
			this.anInt6640 = arg0.method4093();
			this.anInt6664 = this.anInt6652;
			this.anInt6651 = -1;
		} else {
			this.anInt6640 = 0;
			this.anInt6664 = arg0.method4130();
			this.anInt6651 = arg0.method4130();
			if (this.anInt6651 == 255) {
				this.anInt6651 = -1;
			}
		}
		local141 = this.anInt6627;
		this.anInt6627 = arg0.method4130();
		@Pc(334) int local334;
		if (this.anInt6627 == 0) {
			Static378.method5173(this);
		} else {
			local182 = this.anInt6662;
			@Pc(331) int local331 = this.anInt6648;
			local334 = this.anInt6629;
			@Pc(337) int local337 = this.anInt6638;
			@Pc(340) int local340 = this.anInt6632;
			this.anInt6662 = arg0.method4093();
			this.anInt6648 = arg0.method4093();
			this.anInt6629 = arg0.method4093();
			this.anInt6638 = arg0.method4093();
			this.anInt6632 = arg0.method4130();
			if (local141 != this.anInt6627 || local182 != this.anInt6662 || local331 != this.anInt6648 || local334 != this.anInt6629 || this.anInt6638 != local337 || this.anInt6632 != local340) {
				Static371.method5096(this);
			}
		}
		if (this.aClass127_1 == null) {
			this.aClass127_1 = new Class127();
		}
		local182 = this.aClass127_1.anInt3503;
		@Pc(417) int[] local417 = this.aClass127_1.anIntArray289;
		this.aClass127_1.method2936(this.method5538(), local204, local110, this.aByte89 == 1, local104);
		if (local104 != local182) {
			super.anInt7068 = (super.anIntArray590[0] << 7) + (this.method5535() << 6);
			super.anInt7065 = (super.anIntArray589[0] << 7) + (this.method5535() << 6);
		}
		if (super.anInt7097 == Static453.anInt7845 && local417 != null) {
			for (local334 = 0; local334 < local204.length; local334++) {
				if (local204[local334] != local417[local334]) {
					Static196.aClass139_1.method3231();
					break;
				}
			}
		}
		if (super.aClass39_Sub8_7 != null) {
			super.aClass39_Sub8_7.method5628();
		}
		if (super.anInt7122 == -1 || !super.aBoolean458) {
			return;
		}
		@Pc(519) Class164 local519 = this.method5533();
		if (!local519.method3821(super.anInt7122)) {
			super.aBoolean458 = false;
			super.anInt7122 = -1;
			return;
		}
	}
}
