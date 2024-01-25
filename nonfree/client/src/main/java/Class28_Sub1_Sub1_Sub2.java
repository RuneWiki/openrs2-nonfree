import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class28_Sub1_Sub1_Sub2 extends Class28_Sub1_Sub1 {

	@OriginalMember(owner = "client!oa", name = "rc", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!oa", name = "Ac", descriptor = "I")
	public int anInt4390;

	@OriginalMember(owner = "client!oa", name = "Lc", descriptor = "I")
	public int anInt4397;

	@OriginalMember(owner = "client!oa", name = "Mc", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!oa", name = "fd", descriptor = "Lclient!cu;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!oa", name = "gd", descriptor = "I")
	private int anInt4415;

	@OriginalMember(owner = "client!oa", name = "qc", descriptor = "I")
	public int anInt4383 = -1;

	@OriginalMember(owner = "client!oa", name = "Cc", descriptor = "B")
	private byte aByte58 = 0;

	@OriginalMember(owner = "client!oa", name = "Ec", descriptor = "B")
	private byte aByte59 = 0;

	@OriginalMember(owner = "client!oa", name = "Hc", descriptor = "Z")
	public boolean aBoolean343 = false;

	@OriginalMember(owner = "client!oa", name = "wc", descriptor = "I")
	public int anInt4388 = 255;

	@OriginalMember(owner = "client!oa", name = "yc", descriptor = "Z")
	public boolean aBoolean342 = false;

	@OriginalMember(owner = "client!oa", name = "oc", descriptor = "I")
	public int anInt4381 = 0;

	@OriginalMember(owner = "client!oa", name = "Ic", descriptor = "I")
	public int anInt4394 = -1;

	@OriginalMember(owner = "client!oa", name = "Qc", descriptor = "I")
	public int anInt4401 = 0;

	@OriginalMember(owner = "client!oa", name = "Fc", descriptor = "B")
	private byte aByte60 = 0;

	@OriginalMember(owner = "client!oa", name = "nc", descriptor = "I")
	public int anInt4380 = -1;

	@OriginalMember(owner = "client!oa", name = "sc", descriptor = "I")
	public int anInt4384 = -1;

	@OriginalMember(owner = "client!oa", name = "Sc", descriptor = "I")
	public int anInt4403 = 0;

	@OriginalMember(owner = "client!oa", name = "Jc", descriptor = "I")
	public int anInt4395 = -1;

	@OriginalMember(owner = "client!oa", name = "Nc", descriptor = "I")
	public int anInt4398 = 0;

	@OriginalMember(owner = "client!oa", name = "cd", descriptor = "I")
	public int anInt4412 = 0;

	@OriginalMember(owner = "client!oa", name = "Yc", descriptor = "I")
	public int anInt4408 = -1;

	@OriginalMember(owner = "client!oa", name = "nd", descriptor = "I")
	public int anInt4419 = -1;

	@OriginalMember(owner = "client!oa", name = "dd", descriptor = "I")
	public int anInt4413 = -1;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method4020() {
		return this.aString51;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLclient!np;)Z")
	private boolean method4022(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class36 local11 = this.method4014();
		@Pc(27) Class177 local27 = super.anInt4314 != -1 && super.anInt4327 == 0 ? Static176.aClass43_2.method930(super.anInt4314) : null;
		@Pc(48) Class177 local48 = super.anInt4333 == -1 || this.aBoolean342 || super.aBoolean340 && local27 != null ? null : Static176.aClass43_2.method930(super.anInt4333);
		@Pc(51) int local51 = local11.anInt678;
		@Pc(54) int local54 = local11.anInt673;
		if (local51 != 0 || local54 != 0 || local11.anInt669 != 0 || local11.anInt671 != 0) {
			arg0 |= 0x7;
		}
		super.aClass75Array3[0] = this.aClass49_1.method998(super.anInt4363, super.anInt4338, Static79.aClass124_1, super.anInt4317, local48, Static331.aClass115_1, super.anInt4316, Static102.aClass223_1, super.aClass81Array3, Static176.aClass78_3, Static90.aClass83_2, local27, arg0, super.anInt4352, arg1, super.anInt4356, Static176.aClass43_2);
		@Pc(113) int local113 = Static52.method944();
		if (Static368.anInt6173 < 96 && local113 > 50) {
			Static19.method219();
		}
		@Pc(146) int local146;
		if (Static238.aClass171_4 != Static291.aClass171_5 && local113 < 50) {
			local146 = 50 - local113;
			while (local146 > Static183.anInt3241) {
				Static140.aByteArrayArray7[Static183.anInt3241] = new byte[102400];
				Static183.anInt3241++;
			}
			while (Static183.anInt3241 > local146) {
				Static183.anInt3241--;
				Static140.aByteArrayArray7[Static183.anInt3241] = null;
			}
		} else if (Static291.aClass171_5 != Static238.aClass171_4) {
			Static140.aByteArrayArray7 = new byte[50][];
			Static183.anInt3241 = 0;
		}
		if (super.aClass75Array3[0] == null) {
			return false;
		}
		super.anInt4344 = super.aClass75Array3[0].method5476();
		this.method4018(super.aClass75Array3[0]);
		local146 = super.aClass251_7.method5710();
		super.anInt4355 = 0;
		super.anInt4372 = 0;
		super.anInt4364 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method4016(this.method4009() << 7, this.method4009() << 7, local146);
		} else {
			this.method4016(local51, local54, local146);
			if (super.anInt4364 != 0) {
				super.aClass75Array3[0].method5466(super.anInt4364);
			}
			if (super.anInt4372 != 0) {
				super.aClass75Array3[0].method5474(super.anInt4372);
			}
			if (super.anInt4355 != 0) {
				super.aClass75Array3[0].method5482(0, super.anInt4355, 0);
			}
		}
		super.aClass75Array3[1] = null;
		if (!this.aBoolean342 && super.anInt4367 != -1 && super.anInt4351 != -1) {
			@Pc(318) Class125 local318 = Static224.aClass203_2.method4559(super.anInt4367);
			@Pc(338) Class75 local338 = local318.method2695(Static176.aClass43_2, super.anInt4361, arg1, super.anInt4341, super.anInt4351, (local318.aBoolean235 ? 7 : 2) | local7);
			if (local338 != null) {
				local338.method5482(0, -super.anInt4331, 0);
				if (local318.aBoolean235 && (local51 != 0 || local54 != 0)) {
					if (super.anInt4364 != 0) {
						local338.method5466(super.anInt4364);
					}
					if (super.anInt4372 != 0) {
						local338.method5474(super.anInt4372);
					}
					if (super.anInt4355 != 0) {
						local338.method5482(0, super.anInt4355, 0);
					}
				}
				super.aClass75Array3[1] = local338;
			}
		}
		super.aClass75Array3[2] = null;
		if (!this.aBoolean342 && super.aClass3_Sub32_3 != null) {
			if (Static76.anInt1617 >= super.aClass3_Sub32_3.anInt4604) {
				super.aClass3_Sub32_3 = null;
			} else if (Static76.anInt1617 >= super.aClass3_Sub32_3.anInt4602) {
				@Pc(426) Class75 local426 = super.aClass3_Sub32_3.method4152(arg1, local7 | 0x7);
				if (local426 != null) {
					local426.method5482(-super.anInt5774 + super.aClass3_Sub32_3.anInt4606, -super.anInt5769 + super.aClass3_Sub32_3.anInt4614, -super.anInt5766 + super.aClass3_Sub32_3.anInt4601);
					if (local146 != 0) {
						local426.method5475(-local146 & 0x3FFF);
					}
					super.aClass75Array3[2] = local426;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)V")
	public void method4023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt4376 = 0;
		super.anIntArray491[0] = arg1;
		super.anInt4375 = 0;
		super.anInt4378 = 0;
		super.anIntArray490[0] = arg0;
		@Pc(26) int local26 = this.method4009();
		super.anInt5774 = super.anIntArray491[0] * 128 + local26 * 64;
		super.anInt5766 = super.anIntArray490[0] * 128 + local26 * 64;
		if (Static226.aClass28_Sub1_Sub1_Sub2_2 == this) {
			Static347.method5256();
		}
		if (super.aClass12_Sub4_4 != null) {
			super.aClass12_Sub4_4.method1801();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
		if (this.aClass49_1 != null && (super.aBoolean341 || this.method4022(0, arg0))) {
			this.method4006(super.aBoolean341, super.aClass75Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		if (this.aClass49_1 == null || !this.method4022(65536, arg2)) {
			return true;
		}
		@Pc(27) Class118 local27 = arg2.method4908();
		@Pc(32) int local32 = super.aClass251_7.method5710();
		local27.method2656(local32);
		local27.method2658(super.anInt5774, super.anInt5769, super.anInt5766);
		for (@Pc(45) int local45 = 0; local45 < super.aClass75Array3.length; local45++) {
			if (super.aClass75Array3[local45] != null && super.aClass75Array3[local45].method5460(arg0, arg1, local27, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)I")
	@Override
	public int method4013() {
		return -1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I")
	@Override
	protected int method4007() {
		return this.anInt4415;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBI)V")
	public void method4025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt4314 != -1 && Static176.aClass43_2.method930(super.anInt4314).anInt4510 == 1) {
			super.anInt4314 = -1;
		}
		if (super.anInt4367 != -1) {
			@Pc(31) Class125 local31 = Static224.aClass203_2.method4559(super.anInt4367);
			if (local31.aBoolean236 && local31.anInt3050 != -1 && Static176.aClass43_2.method930(local31.anInt3050).anInt4510 == 1) {
				super.anInt4367 = -1;
			}
		}
		this.anInt4380 = -1;
		if (arg0 < 0 || arg0 >= Static12.anInt161 || arg1 < 0 || arg1 >= Static44.anInt787) {
			this.method4023(arg1, arg0);
		} else if (super.anIntArray491[0] >= 0 && super.anIntArray491[0] < Static12.anInt161 && super.anIntArray490[0] >= 0 && super.anIntArray490[0] < Static44.anInt787) {
			if (arg2 == 2) {
				Static170.method2632(arg1, this, arg0);
			}
			this.method4027(arg1, arg2, arg0);
		} else {
			this.method4023(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIBI)V")
	public void method4027(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4378 < 9) {
			super.anInt4378++;
		}
		for (@Pc(20) int local20 = super.anInt4378; local20 > 0; local20--) {
			super.anIntArray491[local20] = super.anIntArray491[local20 - 1];
			super.anIntArray490[local20] = super.anIntArray490[local20 - 1];
			super.aByteArray56[local20] = super.aByteArray56[local20 - 1];
		}
		super.anIntArray491[0] = arg2;
		super.anIntArray490[0] = arg0;
		super.aByteArray56[0] = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)Z")
	public boolean method4028() {
		return this.aClass49_1 != null;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		if (this.aClass49_1 == null || !this.method4022(1024, arg0)) {
			return null;
		}
		@Pc(19) Class118 local19 = arg0.method4908();
		@Pc(28) int local28 = super.aClass251_7.method5710();
		local19.method2656(local28);
		local19.method2658(super.anInt5774, super.anInt5769, super.anInt5766);
		@Pc(42) float local42 = arg0.method4912();
		@Pc(45) float local45 = arg0.method4913();
		if (Static164.aClass154_Sub1_1.aBoolean474) {
			@Pc(52) Class36 local52 = this.method4014();
			if (local52.aBoolean35 && (this.aClass49_1.anInt1124 == -1 || Static90.aClass83_2.method1716(this.aClass49_1.anInt1124).aBoolean98)) {
				@Pc(86) Class177 local86 = super.anInt4314 != -1 && super.anInt4327 == 0 ? Static176.aClass43_2.method930(super.anInt4314) : null;
				@Pc(106) Class177 local106 = super.anInt4333 == -1 || this.aBoolean342 || super.aBoolean340 && local86 != null ? null : Static176.aClass43_2.method930(super.anInt4333);
				@Pc(140) Class75 local140 = Static392.method5712(super.aClass75Array3[0], 160, 1, 0, super.anInt4364, arg0, 0, super.anInt4372, 240, local106 == null ? super.anInt4356 : super.anInt4316, super.aBoolean337, local28, local106 == null ? local86 : local106, super.anInt4355);
				if (local140 != null) {
					arg0.method4856(local42, local45 - 128.0F);
					arg0.method4923(false);
					local140.method5469(local19, null, 0);
					arg0.method4923(true);
				}
			}
		}
		if (Static226.aClass28_Sub1_Sub1_Sub2_2 == this) {
			arg0.method4856(local42, local45 - 144.0F);
			local19.method2659(super.anInt5774, super.anInt5769, super.anInt5766);
			for (@Pc(181) int local181 = Static323.aClass229Array1.length - 1; local181 >= 0; local181--) {
				@Pc(187) Class229 local187 = Static323.aClass229Array1[local181];
				if (local187 != null && local187.anInt5864 != -1) {
					@Pc(244) int local244;
					@Pc(233) int local233;
					if (local187.anInt5877 == 1 && local187.anInt5873 >= 0 && local187.anInt5873 < Static166.aClass28_Sub1_Sub1_Sub1Array41.length) {
						@Pc(220) Class28_Sub1_Sub1_Sub1 local220 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local187.anInt5873];
						if (local220 != null) {
							local233 = local220.anInt5774 / 32 - Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 / 32;
							local244 = local220.anInt5766 / 32 - Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 / 32;
							this.method4032(local244, local233, super.aClass75Array3[0], local19, 360000, arg0, local187.anInt5864);
						}
					}
					if (local187.anInt5877 == 2) {
						@Pc(278) int local278 = (local187.anInt5872 - Static21.anInt265) * 4 + 2 - Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 / 32;
						local233 = (-Static103.anInt2044 + local187.anInt5868) * 4 + 2 - Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 / 32;
						local244 = local187.anInt5874 * 4;
						local244 *= local244;
						this.method4032(local233, local278, super.aClass75Array3[0], local19, local244, arg0, local187.anInt5864);
					}
					if (local187.anInt5877 == 10 && local187.anInt5873 >= 0 && Static308.aClass28_Sub1_Sub1_Sub2Array1.length > local187.anInt5873) {
						@Pc(336) Class28_Sub1_Sub1_Sub2 local336 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local187.anInt5873];
						if (local336 != null) {
							local233 = local336.anInt5774 / 32 - Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 / 32;
							local244 = local336.anInt5766 / 32 - Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 / 32;
							this.method4032(local244, local233, super.aClass75Array3[0], local19, 360000, arg0, local187.anInt5864);
						}
					}
				}
			}
			local19.method2656(local28);
			local19.method2658(super.anInt5774, super.anInt5769, super.anInt5766);
		}
		arg0.method4856(local42, local45);
		@Pc(403) Class12_Sub7 local403 = Static146.method2294(super.aClass75Array3.length);
		if (super.aClass12_Sub4_4 == null) {
			arg0.method4937(super.aClass75Array3, local19, local403.aClass12_Sub5Array1, Static226.aClass28_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(410) Class47 local410 = super.aClass12_Sub4_4.method1797();
			arg0.method4886(super.aClass75Array3, local410, local19, local403.aClass12_Sub5Array1, Static226.aClass28_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
		}
		this.method4006(false, super.aClass75Array3, arg0);
		if (super.aClass75Array3[2] != null) {
			if (local28 != 0) {
				super.aClass75Array3[2].method5475(local28);
			}
			super.aClass75Array3[2].method5482(super.anInt5774 - super.aClass3_Sub32_3.anInt4606, super.anInt5769 + -super.aClass3_Sub32_3.anInt4614, super.anInt5766 - super.aClass3_Sub32_3.anInt4601);
		}
		super.anInt4332 = Static226.anInt3990;
		return local403;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)I")
	@Override
	public int method4009() {
		return this.aClass49_1 == null || this.aClass49_1.anInt1124 == -1 ? super.method4009() : Static90.aClass83_2.method1716(this.aClass49_1.anInt1124).anInt1467;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!rp;)V")
	public void method4030(@OriginalArg(1) Class3_Sub5 arg0) {
		arg0.anInt3121 = 0;
		@Pc(12) int local12 = arg0.method2739();
		this.aByte58 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method4009();
		this.method4011((local12 >> 3 & 0x7) + 1);
		this.aByte60 = (byte) (local12 >> 6 & 0x3);
		super.anInt5774 += (this.method4009() - local41) * 64;
		super.anInt5766 += (this.method4009() - local41) * 64;
		this.aByte59 = arg0.method2753();
		this.anInt4413 = arg0.method2753();
		this.anInt4394 = arg0.method2753();
		@Pc(102) int local102 = -1;
		this.anInt4401 = 0;
		@Pc(108) int[] local108 = new int[12];
		@Pc(135) int local135;
		@Pc(141) int local141;
		@Pc(180) int local180;
		for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
			@Pc(123) int local123 = arg0.method2739();
			if (local123 == 0) {
				local108[local117] = 0;
			} else {
				local135 = arg0.method2739();
				local141 = local135 + (local123 << 8);
				if (local117 == 0 && local141 == 65535) {
					local102 = arg0.method2767();
					this.anInt4401 = arg0.method2739();
					break;
				}
				if (local141 >= 32768) {
					local141 = Static4.anIntArray12[local141 - 32768];
					local108[local117] = local141 | 0x40000000;
					local180 = Static176.aClass78_3.method1641(local141).anInt1180;
					if (local180 != 0) {
						this.anInt4401 = local180;
					}
				} else {
					local108[local117] = local141 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(204) int[] local204 = new int[5];
		for (local135 = 0; local135 < 5; local135++) {
			local141 = arg0.method2739();
			if (local141 < 0 || Static38.aShortArrayArray2[local135].length <= local141) {
				local141 = 0;
			}
			local204[local135] = local141;
		}
		this.anInt4415 = arg0.method2767();
		this.aString50 = arg0.method2788();
		if (local29) {
			this.aString51 = arg0.method2788();
		} else {
			this.aString51 = this.aString50;
		}
		this.anInt4381 = arg0.method2739();
		if (local37) {
			this.anInt4412 = arg0.method2767();
			this.anInt4398 = this.anInt4381;
			this.anInt4419 = -1;
		} else {
			this.anInt4412 = 0;
			this.anInt4398 = arg0.method2739();
			this.anInt4419 = arg0.method2739();
			if (this.anInt4419 == 255) {
				this.anInt4419 = -1;
			}
		}
		local141 = this.anInt4403;
		this.anInt4403 = arg0.method2739();
		@Pc(328) int local328;
		if (this.anInt4403 == 0) {
			Static281.method4463(this);
		} else {
			local180 = this.anInt4383;
			@Pc(325) int local325 = this.anInt4395;
			local328 = this.anInt4408;
			@Pc(331) int local331 = this.anInt4384;
			@Pc(334) int local334 = this.anInt4388;
			this.anInt4383 = arg0.method2767();
			this.anInt4395 = arg0.method2767();
			this.anInt4408 = arg0.method2767();
			this.anInt4384 = arg0.method2767();
			this.anInt4388 = arg0.method2739();
			if (this.anInt4403 != local141 || this.anInt4383 != local180 || this.anInt4395 != local325 || this.anInt4408 != local328 || this.anInt4384 != local331 || this.anInt4388 != local334) {
				Static156.method2409(this);
			}
		}
		if (this.aClass49_1 == null) {
			this.aClass49_1 = new Class49();
		}
		local180 = this.aClass49_1.anInt1124;
		@Pc(406) int[] local406 = this.aClass49_1.anIntArray99;
		this.aClass49_1.method997(this.aByte58 == 1, local102, local108, this.method4007(), local204);
		if (local102 != local180) {
			super.anInt5774 = super.anIntArray491[0] * 128 + this.method4009() * 64;
			super.anInt5766 = super.anIntArray490[0] * 128 + this.method4009() * 64;
		}
		if (Static376.anInt6265 == super.anInt4373 && local406 != null) {
			for (local328 = 0; local328 < local204.length; local328++) {
				if (local406[local328] != local204[local328]) {
					Static176.aClass78_3.method1645();
					break;
				}
			}
		}
		if (super.aClass12_Sub4_4 != null) {
			super.aClass12_Sub4_4.method1801();
		}
		if (super.anInt4333 == -1 || !super.aBoolean340) {
			return;
		}
		@Pc(503) Class36 local503 = this.method4014();
		if (!local503.method617(super.anInt4333)) {
			super.anInt4333 = -1;
			super.aBoolean340 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4031() {
		@Pc(7) String local7 = "";
		if (Static359.aStringArray41 != null) {
			local7 = local7 + Static359.aStringArray41[this.aByte60];
		}
		@Pc(31) int[] local31;
		if (this.aByte58 == 1 && Static8.anIntArray703 != null) {
			local31 = Static8.anIntArray703;
		} else {
			local31 = Static341.anIntArray622;
		}
		if (local31 != null && local31[this.aByte60] != -1) {
			@Pc(51) Class146 local51 = Static194.aClass103_1.method2198(local31[this.aByte60]);
			if (local51.aChar3 == 's') {
				local7 = local7 + local51.method3155(this.aByte59 & 0xFF);
			} else {
				Static355.method5328("gdn1", new Throwable());
				local31[this.aByte60] = -1;
			}
		}
		local7 = local7 + this.aString50;
		if (Static71.aStringArray9 != null) {
			local7 = local7 + Static71.aStringArray9[this.aByte60];
		}
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!f;Lclient!os;ILclient!np;II)V")
	private void method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class118 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class155 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg0 * arg0 + arg1 * arg1;
		if (local15 < 16 || arg4 < local15) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg1, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(56) Class75 local56 = Static373.method5562(super.anInt4364, arg6, super.anInt5774, local37, arg5, super.anInt5769, arg2, super.anInt5766, super.anInt4355, super.anInt4372);
		if (local56 != null) {
			arg5.method4923(false);
			local56.method5469(arg3, null, 0);
			arg5.method4923(true);
		}
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)I")
	@Override
	public int method5191() {
		return super.anInt4344;
	}
}
