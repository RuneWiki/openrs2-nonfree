import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!sj", name = "Ic", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!sj", name = "Lc", descriptor = "I")
	public int anInt6206;

	@OriginalMember(owner = "client!sj", name = "Wc", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!sj", name = "ed", descriptor = "I")
	public int anInt6220;

	@OriginalMember(owner = "client!sj", name = "fd", descriptor = "Lclient!wq;")
	public Class270 aClass270_1;

	@OriginalMember(owner = "client!sj", name = "zd", descriptor = "I")
	private int anInt6236;

	@OriginalMember(owner = "client!sj", name = "Hc", descriptor = "I")
	public int anInt6204 = 0;

	@OriginalMember(owner = "client!sj", name = "Oc", descriptor = "I")
	public int anInt6208 = -1;

	@OriginalMember(owner = "client!sj", name = "Tc", descriptor = "Z")
	public boolean aBoolean412 = false;

	@OriginalMember(owner = "client!sj", name = "Ec", descriptor = "I")
	public int anInt6201 = 255;

	@OriginalMember(owner = "client!sj", name = "ad", descriptor = "Z")
	public boolean aBoolean413 = false;

	@OriginalMember(owner = "client!sj", name = "id", descriptor = "B")
	private byte aByte91 = 0;

	@OriginalMember(owner = "client!sj", name = "dd", descriptor = "I")
	public int anInt6219 = 0;

	@OriginalMember(owner = "client!sj", name = "Nc", descriptor = "B")
	private byte aByte90 = 0;

	@OriginalMember(owner = "client!sj", name = "rd", descriptor = "I")
	public int anInt6231 = -1;

	@OriginalMember(owner = "client!sj", name = "Yc", descriptor = "I")
	public int anInt6215 = -1;

	@OriginalMember(owner = "client!sj", name = "bd", descriptor = "I")
	public int anInt6217 = -1;

	@OriginalMember(owner = "client!sj", name = "hd", descriptor = "I")
	public int anInt6222 = -1;

	@OriginalMember(owner = "client!sj", name = "sd", descriptor = "I")
	public int anInt6232 = -1;

	@OriginalMember(owner = "client!sj", name = "ud", descriptor = "B")
	private byte aByte92 = 0;

	@OriginalMember(owner = "client!sj", name = "pd", descriptor = "I")
	public int anInt6229 = -1;

	@OriginalMember(owner = "client!sj", name = "od", descriptor = "I")
	public int anInt6228 = 0;

	@OriginalMember(owner = "client!sj", name = "Zc", descriptor = "I")
	public int anInt6216 = -1;

	@OriginalMember(owner = "client!sj", name = "Dc", descriptor = "I")
	public int anInt6200 = 0;

	@OriginalMember(owner = "client!sj", name = "Uc", descriptor = "I")
	public int anInt6212 = 0;

	@OriginalMember(owner = "client!sj", name = "yd", descriptor = "Z")
	public boolean aBoolean414 = false;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
	@Override
	protected int method4903() {
		return this.anInt6236;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
		if (this.aClass270_1 != null && (super.aBoolean411 || this.method4921(arg0, 0))) {
			this.method4911(super.aBoolean411, arg0, super.aClass57Array3);
			super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)I")
	@Override
	public int method4914() {
		return -1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!za;IZ)Z")
	private boolean method4921(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class133 local11 = this.method4910();
		@Pc(27) Class143 local27 = super.anInt6193 != -1 && super.anInt6147 == 0 ? Static271.aClass219_4.method4752(super.anInt6193) : null;
		@Pc(48) Class143 local48 = super.lb == -1 || this.aBoolean413 || super.aBoolean410 && local27 != null ? null : Static271.aClass219_4.method4752(super.lb);
		@Pc(51) int local51 = local11.anInt3538;
		@Pc(54) int local54 = local11.anInt3530;
		if (local51 != 0 || local54 != 0 || local11.anInt3534 != 0 || local11.anInt3508 != 0) {
			arg1 |= 0x7;
		}
		@Pc(92) boolean local92 = super.aByte88 != 0 && Static85.anInt1536 >= super.anInt6121 && Static85.anInt1536 < super.anInt6168;
		if (local92) {
			arg1 |= 0x80000;
		}
		@Pc(133) Class57 local133 = super.aClass57Array3[0] = this.aClass270_1.method5997(Static306.aClass67_3, super.aClass185Array3, Static271.aClass219_4, super.anInt6143, Static27.aClass149_1, super.anInt6117, Static391.aClass120_2, arg0, super.anInt6183, local27, arg1, local48, super.anInt6145, super.anInt6160, Static196.aClass180_1, super.anInt6164, Static408.aClass39_1);
		@Pc(136) int local136 = Static223.method2946();
		if (Static102.anInt1724 < 96 && local136 > 50) {
			Static439.method5798();
		}
		@Pc(169) int local169;
		if (Static289.aClass170_8 != Static350.aClass170_10 && local136 < 50) {
			local169 = 50 - local136;
			while (local169 > Static63.anInt1197) {
				Static165.aByteArrayArray8[Static63.anInt1197] = new byte[102400];
				Static63.anInt1197++;
			}
			while (Static63.anInt1197 > local169) {
				Static63.anInt1197--;
				Static165.aByteArrayArray8[Static63.anInt1197] = null;
			}
		} else if (Static350.aClass170_10 != Static289.aClass170_8) {
			Static165.aByteArrayArray8 = new byte[50][];
			Static63.anInt1197 = 0;
		}
		if (local133 == null) {
			return false;
		}
		super.anInt6182 = local133.B();
		this.method4918(local133);
		local169 = super.aClass110_7.method2353();
		if (local51 == 0 && local54 == 0) {
			this.method4917(this.method4913() << 7, local169, 0, this.method4913() << 7, 0);
		} else {
			this.method4917(local54, local169, local11.anInt3523, local51, local11.anInt3540);
			if (super.anInt6161 != 0) {
				local133.W(super.anInt6161);
			}
			if (super.anInt6139 != 0) {
				local133.K(super.anInt6139);
			}
			if (super.anInt6166 != 0) {
				local133.a(0, super.anInt6166, 0);
			}
		}
		if (local92) {
			local133.method6057(super.aByte87, super.aByte86, super.aByte89, super.aByte88 & 0xFF);
		}
		@Pc(305) Class63 local305;
		@Pc(323) boolean local323;
		@Pc(325) int local325;
		@Pc(368) Class57 local368;
		if (this.aBoolean413 || super.anInt6125 == -1 || super.anInt6149 == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local305 = Static3.aClass203_1.method4360(super.anInt6125);
			local323 = local305.aByte14 == 3 && (local51 != 0 || local54 != 0);
			local325 = local7;
			if (local323) {
				local325 = local7 | 0x7;
			} else {
				if (super.anInt6170 != 0) {
					local325 = local7 | 0x5;
				}
				if (super.anInt6155 != 0) {
					local325 |= 0x2;
				}
			}
			local368 = super.aClass57Array3[1] = local305.method1392(local325, Static271.aClass219_4, super.anInt6187, super.anInt6151, super.anInt6149, arg0);
			if (local368 != null) {
				if (super.anInt6155 != 0) {
					local368.a(0, -super.anInt6155 << 0, 0);
				}
				if (super.anInt6170 != 0) {
					local368.ma(super.anInt6170 * 2048);
				}
				if (local323) {
					if (super.anInt6161 != 0) {
						local368.W(super.anInt6161);
					}
					if (super.anInt6139 != 0) {
						local368.K(super.anInt6139);
					}
					if (super.anInt6166 != 0) {
						local368.a(0, super.anInt6166, 0);
					}
				}
			}
		}
		if (this.aBoolean413 || super.anInt6173 == -1 || super.anInt6124 == -1) {
			super.aClass57Array3[3] = null;
		} else {
			local305 = Static3.aClass203_1.method4360(super.anInt6173);
			local323 = local305.aByte14 == 3 && (local51 != 0 || local54 != 0);
			local325 = local7;
			if (local323) {
				local325 = local7 | 0x7;
			} else {
				if (super.anInt6119 != 0) {
					local325 = local7 | 0x5;
				}
				if (super.anInt6191 != 0) {
					local325 |= 0x2;
				}
			}
			local368 = super.aClass57Array3[3] = local305.method1400(super.anInt6185, super.anInt6124, local325, Static271.aClass219_4, super.anInt6194, arg0);
			if (local368 != null) {
				if (super.anInt6191 != 0) {
					local368.a(0, -super.anInt6191 << 0, 0);
				}
				if (super.anInt6119 != 0) {
					local368.ma(super.anInt6119 * 2048);
				}
				if (local323) {
					if (super.anInt6161 != 0) {
						local368.W(super.anInt6161);
					}
					if (super.anInt6139 != 0) {
						local368.K(super.anInt6139);
					}
					if (super.anInt6166 != 0) {
						local368.a(0, super.anInt6166, 0);
					}
				}
			}
		}
		super.aClass57Array3[2] = null;
		if (!this.aBoolean413 && super.aClass5_Sub11_3 != null) {
			if (Static85.anInt1536 >= super.aClass5_Sub11_3.anInt1512) {
				super.aClass5_Sub11_3 = null;
			} else if (Static85.anInt1536 >= super.aClass5_Sub11_3.anInt1522) {
				@Pc(607) Class57 local607 = super.aClass5_Sub11_3.method1240(local7 | 0x7, arg0);
				if (local607 != null) {
					local607.a(super.aClass5_Sub11_3.anInt1527 - super.anInt7500, super.aClass5_Sub11_3.anInt1528 + -super.anInt7501, super.aClass5_Sub11_3.anInt1514 - super.anInt7502);
					if (local169 != 0) {
						local607.ma(-local169 & 0x3FFF);
					}
					super.aClass57Array3[2] = local607;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method4922() {
		return this.aString65;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!fh;Z)V")
	public void method4923(@OriginalArg(0) Class5_Sub15 arg0) {
		arg0.anInt7013 = 0;
		@Pc(12) int local12 = arg0.method5539();
		this.aByte92 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method4913();
		this.method4904((local12 >> 3 & 0x7) + 1);
		this.aByte91 = (byte) (local12 >> 6 & 0x3);
		super.anInt7500 += this.method4913() - local41 << 6;
		super.anInt7502 += this.method4913() - local41 << 6;
		this.aByte90 = arg0.method5600();
		this.anInt6229 = arg0.method5600();
		this.anInt6232 = arg0.method5600();
		this.anInt6219 = 0;
		@Pc(111) int local111 = -1;
		@Pc(114) int[] local114 = new int[12];
		@Pc(137) int local137;
		@Pc(143) int local143;
		@Pc(182) int local182;
		for (@Pc(116) int local116 = 0; local116 < 12; local116++) {
			@Pc(122) int local122 = arg0.method5539();
			if (local122 == 0) {
				local114[local116] = 0;
			} else {
				local137 = arg0.method5539();
				local143 = local137 + (local122 << 8);
				if (local116 == 0 && local143 == 65535) {
					local111 = arg0.method5598();
					this.anInt6219 = arg0.method5539();
					break;
				}
				if (local143 >= 32768) {
					local143 = Static97.anIntArray77[local143 - 32768];
					local114[local116] = local143 | 0x40000000;
					local182 = Static306.aClass67_3.method1452(local143).anInt1143;
					if (local182 != 0) {
						this.anInt6219 = local182;
					}
				} else {
					local114[local116] = local143 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(209) int[] local209 = new int[5];
		for (local137 = 0; local137 < 5; local137++) {
			local143 = arg0.method5539();
			if (local143 < 0 || local143 >= Static227.aShortArrayArray9[local137].length) {
				local143 = 0;
			}
			local209[local137] = local143;
		}
		this.anInt6236 = arg0.method5598();
		this.aString66 = arg0.method5549();
		if (local29) {
			this.aString65 = arg0.method5549();
		} else {
			this.aString65 = this.aString66;
		}
		this.anInt6228 = arg0.method5539();
		if (local37) {
			this.anInt6212 = arg0.method5598();
			this.anInt6200 = this.anInt6228;
			this.anInt6222 = -1;
		} else {
			this.anInt6212 = 0;
			this.anInt6200 = arg0.method5539();
			this.anInt6222 = arg0.method5539();
			if (this.anInt6222 == 255) {
				this.anInt6222 = -1;
			}
		}
		local143 = this.anInt6204;
		this.anInt6204 = arg0.method5539();
		@Pc(325) int local325;
		if (this.anInt6204 == 0) {
			Static425.method5641(this);
		} else {
			local182 = this.anInt6231;
			@Pc(322) int local322 = this.anInt6216;
			local325 = this.anInt6217;
			@Pc(328) int local328 = this.anInt6208;
			@Pc(331) int local331 = this.anInt6201;
			this.anInt6231 = arg0.method5598();
			this.anInt6216 = arg0.method5598();
			this.anInt6217 = arg0.method5598();
			this.anInt6208 = arg0.method5598();
			this.anInt6201 = arg0.method5539();
			if (local143 != this.anInt6204 || this.anInt6231 != local182 || local322 != this.anInt6216 || local325 != this.anInt6217 || local328 != this.anInt6208 || this.anInt6201 != local331) {
				Static359.method4641(this);
			}
		}
		if (this.aClass270_1 == null) {
			this.aClass270_1 = new Class270();
		}
		local182 = this.aClass270_1.anInt7458;
		@Pc(420) int[] local420 = this.aClass270_1.anIntArray510;
		this.aClass270_1.method5998(local209, this.method4903(), local111, local114, this.aByte92 == 1);
		if (local182 != local111) {
			super.anInt7500 = (super.anIntArray434[0] << 7) + (this.method4913() << 6);
			super.anInt7502 = (super.anIntArray433[0] << 7) + (this.method4913() << 6);
		}
		if (super.anInt6126 == Static43.anInt5302 && local420 != null) {
			for (local325 = 0; local325 < local209.length; local325++) {
				if (local209[local325] != local420[local325]) {
					Static306.aClass67_3.method1448();
					break;
				}
			}
		}
		if (super.aClass88_Sub6_7 != null) {
			super.aClass88_Sub6_7.method5047();
		}
		if (super.lb == -1 || !super.aBoolean410) {
			return;
		}
		@Pc(528) Class133 local528 = this.method4910();
		if (!local528.method2808(super.lb)) {
			super.lb = -1;
			super.aBoolean410 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!e;ILclient!za;BILclient!c;II)V")
	private void method4924(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class29 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg5 * arg5 + arg3 * arg3;
		if (local12 < 16384 || local12 > arg1) {
			return;
		}
		@Pc(30) int local30 = (int) (Math.atan2((double) arg5, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(42) Class57 local42 = Static135.method1949(arg6, arg2, super.anInt6161, super.anInt6139, local30, super.anInt6166);
		if (local42 != null) {
			arg2.method5859(false);
			local42.method6060(arg4, null, 0);
			arg2.method5859(true);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBI)V")
	public void method4925(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6199 < 9) {
			super.anInt6199++;
		}
		for (@Pc(24) int local24 = super.anInt6199; local24 > 0; local24--) {
			super.anIntArray434[local24] = super.anIntArray434[local24 - 1];
			super.anIntArray433[local24] = super.anIntArray433[local24 - 1];
			super.aByteArray78[local24] = super.aByteArray78[local24 - 1];
		}
		super.anIntArray434[0] = arg0;
		super.anIntArray433[0] = arg2;
		super.aByteArray78[0] = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		if (this.aClass270_1 == null || !this.method4921(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class29 local19 = arg0.method5866();
		@Pc(24) int local24 = super.aClass110_7.method2353();
		local19.ca(local24);
		local19.W(super.anInt7500, super.anInt7501, super.anInt7502);
		@Pc(38) float local38 = arg0.T();
		@Pc(41) float local41 = arg0.aa();
		@Pc(111) int local111;
		if (Static216.aClass1_Sub1_1.aBoolean303) {
			@Pc(48) Class133 local48 = this.method4910();
			if (local48.aBoolean229 && (this.aClass270_1.anInt7458 == -1 || Static196.aClass180_1.method3713(this.aClass270_1.anInt7458).aBoolean225)) {
				@Pc(86) Class143 local86 = super.anInt6193 != -1 && super.anInt6147 == 0 ? Static271.aClass219_4.method4752(super.anInt6193) : null;
				@Pc(109) Class143 local109 = super.lb == -1 || this.aBoolean413 || super.aBoolean410 && local86 != null ? null : Static271.aClass219_4.method4752(super.lb);
				local111 = 0;
				if (super.anInt6177 != 0) {
					local111 = this.method4916();
				}
				@Pc(151) Class57 local151 = Static42.method669(super.anInt6166, 0, arg0, local111, super.aClass57Array3[0], local24, super.anInt6139, local109 == null ? local86 : local109, 0, 240, local109 == null ? super.anInt6117 : super.anInt6145, 1, super.anInt6161, 160);
				if (local151 != null) {
					arg0.da(local38, local41 - 128.0F);
					arg0.method5859(false);
					local151.method6060(local19, null, 0);
					arg0.method5859(true);
				}
			}
		}
		if (Static220.aClass2_Sub1_Sub3_Sub2_1 == this) {
			arg0.da(local38, local41 - 144.0F);
			local19.U(super.anInt7500, super.anInt7501, super.anInt7502);
			for (@Pc(192) int local192 = Static186.aClass266Array1.length - 1; local192 >= 0; local192--) {
				@Pc(198) Class266 local198 = Static186.aClass266Array1[local192];
				if (local198 != null && local198.anInt7411 != -1) {
					@Pc(230) int local230;
					if (local198.anInt7406 == 1) {
						@Pc(219) Class5_Sub7 local219 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local198.anInt7405);
						if (local219 != null) {
							@Pc(224) Class2_Sub1_Sub3_Sub1 local224 = local219.aClass2_Sub1_Sub3_Sub1_1;
							local230 = local224.anInt7500 - Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500;
							@Pc(237) int local237 = local224.anInt7502 - Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502;
							this.method4924(super.aClass57Array3[0], 5760000, arg0, local237, local19, local230, local198.anInt7411);
						}
					}
					if (local198.anInt7406 == 2) {
						@Pc(266) int local266 = local198.anInt7410 + 64 - Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500;
						local111 = local198.anInt7413 + 64 - Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502;
						local230 = local198.anInt7407 << 7;
						local230 *= local230;
						this.method4924(super.aClass57Array3[0], local230, arg0, local111, local19, local266, local198.anInt7411);
					}
					if (local198.anInt7406 == 10 && local198.anInt7405 >= 0 && local198.anInt7405 < Static359.aClass2_Sub1_Sub3_Sub2Array1.length) {
						@Pc(324) Class2_Sub1_Sub3_Sub2 local324 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local198.anInt7405];
						if (local324 != null) {
							local111 = local324.anInt7500 - Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500;
							local230 = local324.anInt7502 - Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502;
							this.method4924(super.aClass57Array3[0], 5760000, arg0, local230, local19, local111, local198.anInt7411);
						}
					}
				}
			}
			local19.ca(local24);
			local19.W(super.anInt7500, super.anInt7501, super.anInt7502);
		}
		arg0.da(local38, local41);
		@Pc(377) Class88_Sub2 local377 = Static232.method3033(super.aClass57Array3.length);
		if (super.aClass88_Sub6_7 == null) {
			arg0.method5843(super.aClass57Array3, local19, local377.aClass88_Sub8Array1, Static220.aClass2_Sub1_Sub3_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(384) Class255 local384 = super.aClass88_Sub6_7.method5045();
			arg0.method5874(super.aClass57Array3, local384, local19, local377.aClass88_Sub8Array1, Static220.aClass2_Sub1_Sub3_Sub2_1 == this ? 1 : 0);
		}
		this.method4911(false, arg0, super.aClass57Array3);
		if (super.aClass57Array3[2] != null) {
			if (local24 != 0) {
				super.aClass57Array3[2].ma(local24);
			}
			super.aClass57Array3[2].a(super.anInt7500 - super.aClass5_Sub11_3.anInt1527, super.anInt7501 + -super.aClass5_Sub11_3.anInt1528, -super.aClass5_Sub11_3.anInt1514 + super.anInt7502);
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		super.anInt6141 = Static409.anInt6832;
		return local377;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass270_1 == null || !this.method4921(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class29 local19 = arg0.method5866();
		@Pc(24) int local24 = super.aClass110_7.method2353();
		local19.ca(local24);
		local19.W(super.anInt7500, super.anInt7501, super.anInt7502);
		@Pc(37) boolean local37 = false;
		for (@Pc(44) int local44 = 0; super.aClass57Array3.length > local44; local44++) {
			if (super.aClass57Array3[local44] != null && super.aClass57Array3[local44].method6071(arg1, arg2, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)I")
	@Override
	public int method6031() {
		return super.anInt6182;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIB)V")
	public void method4926(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt6193 != -1 && Static271.aClass219_4.method4752(super.anInt6193).anInt3770 == 1) {
			super.anInt6193 = -1;
		}
		@Pc(39) Class63 local39;
		if (super.anInt6125 != -1) {
			local39 = Static3.aClass203_1.method4360(super.anInt6125);
			if (local39.aBoolean114 && local39.anInt1705 != -1 && Static271.aClass219_4.method4752(local39.anInt1705).anInt3770 == 1) {
				super.anInt6125 = -1;
			}
		}
		if (super.anInt6173 != -1) {
			local39 = Static3.aClass203_1.method4360(super.anInt6173);
			if (local39.aBoolean114 && local39.anInt1705 != -1 && Static271.aClass219_4.method4752(local39.anInt1705).anInt3770 == 1) {
				super.anInt6173 = -1;
			}
		}
		this.anInt6215 = -1;
		if (arg2 < 0 || Static433.anInt7210 <= arg2 || arg0 < 0 || Static418.anInt6969 <= arg0) {
			this.method4930(arg2, arg0);
		} else if (super.anIntArray434[0] >= 0 && super.anIntArray434[0] < Static433.anInt7210 && super.anIntArray433[0] >= 0 && super.anIntArray433[0] < Static418.anInt6969) {
			if (arg1 == 2) {
				Static47.method779(arg0, arg2, this);
			}
			this.method4925(arg2, arg1, arg0);
		} else {
			this.method4930(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4927() {
		@Pc(7) String local7 = "";
		if (Static341.aStringArray39 != null) {
			local7 = local7 + Static341.aStringArray39[this.aByte91];
		}
		@Pc(39) int[] local39;
		if (this.aByte92 == 1 && Static368.anIntArray426 != null) {
			local39 = Static368.anIntArray426;
		} else {
			local39 = Static415.anIntArray471;
		}
		if (local39 != null && local39[this.aByte91] != -1) {
			@Pc(59) Class218 local59 = Static418.aClass189_1.method3856(local39[this.aByte91]);
			if (local59.aChar4 == 's') {
				local7 = local7 + local59.method4721(this.aByte90 & 0xFF);
			} else {
				Static206.method2769("gdn1", new Throwable());
				local39[this.aByte91] = -1;
			}
		}
		local7 = local7 + this.aString66;
		if (Static190.aStringArray22 != null) {
			local7 = local7 + Static190.aStringArray22[this.aByte91];
		}
		return local7;
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)I")
	@Override
	public int method4913() {
		return this.aClass270_1 == null || this.aClass270_1.anInt7458 == -1 ? super.method4913() : Static196.aClass180_1.method3713(this.aClass270_1.anInt7458).anInt3463;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(Z)Z")
	public boolean method4929() {
		return this.aClass270_1 != null;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIZ)V")
	public void method4930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray434[0] = arg0;
		super.anInt6196 = 0;
		super.anInt6199 = 0;
		super.anInt6197 = 0;
		super.anIntArray433[0] = arg1;
		@Pc(26) int local26 = this.method4913();
		super.anInt7500 = local26 * 64 + super.anIntArray434[0] * 128;
		super.anInt7502 = local26 * 64 + super.anIntArray433[0] * 128;
		if (Static220.aClass2_Sub1_Sub3_Sub2_1 == this) {
			Static454.method5952();
		}
		if (super.aClass88_Sub6_7 != null) {
			super.aClass88_Sub6_7.method5047();
		}
	}
}
