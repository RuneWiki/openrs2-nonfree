import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class12_Sub1_Sub2_Sub2 extends Class12_Sub1_Sub2 {

	@OriginalMember(owner = "client!qr", name = "Fc", descriptor = "I")
	public int anInt5396;

	@OriginalMember(owner = "client!qr", name = "Jc", descriptor = "Lclient!wh;")
	public Class247 aClass247_1;

	@OriginalMember(owner = "client!qr", name = "Qc", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!qr", name = "Wc", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!qr", name = "ed", descriptor = "I")
	private int anInt5416;

	@OriginalMember(owner = "client!qr", name = "id", descriptor = "I")
	public int anInt5420;

	@OriginalMember(owner = "client!qr", name = "rc", descriptor = "I")
	public int anInt5384 = -1;

	@OriginalMember(owner = "client!qr", name = "Hc", descriptor = "I")
	public int anInt5397 = -1;

	@OriginalMember(owner = "client!qr", name = "Bc", descriptor = "I")
	public int anInt5393 = 0;

	@OriginalMember(owner = "client!qr", name = "Ec", descriptor = "B")
	private byte aByte58 = 0;

	@OriginalMember(owner = "client!qr", name = "oc", descriptor = "B")
	private byte aByte57 = 0;

	@OriginalMember(owner = "client!qr", name = "Ac", descriptor = "Z")
	public boolean aBoolean424 = false;

	@OriginalMember(owner = "client!qr", name = "xc", descriptor = "I")
	public int anInt5390 = -1;

	@OriginalMember(owner = "client!qr", name = "sc", descriptor = "I")
	public int anInt5385 = 0;

	@OriginalMember(owner = "client!qr", name = "bd", descriptor = "I")
	public int anInt5413 = -1;

	@OriginalMember(owner = "client!qr", name = "wc", descriptor = "I")
	public int anInt5389 = -1;

	@OriginalMember(owner = "client!qr", name = "vc", descriptor = "I")
	public int anInt5388 = -1;

	@OriginalMember(owner = "client!qr", name = "dd", descriptor = "I")
	public int anInt5415 = -1;

	@OriginalMember(owner = "client!qr", name = "Ic", descriptor = "I")
	public int anInt5398 = -1;

	@OriginalMember(owner = "client!qr", name = "fd", descriptor = "I")
	public int anInt5417 = 0;

	@OriginalMember(owner = "client!qr", name = "Sc", descriptor = "B")
	private byte aByte59 = 0;

	@OriginalMember(owner = "client!qr", name = "Zc", descriptor = "I")
	public int anInt5411 = 0;

	@OriginalMember(owner = "client!qr", name = "gd", descriptor = "I")
	public int anInt5418 = 0;

	@OriginalMember(owner = "client!qr", name = "cd", descriptor = "I")
	public int anInt5414 = 255;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)I")
	@Override
	protected int method4707() {
		return this.anInt5416;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method4713() {
		return this.aString51;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLclient!lk;)V")
	public void method4714(@OriginalArg(1) Class2_Sub13 arg0) {
		arg0.anInt4788 = 0;
		@Pc(12) int local12 = arg0.method4240();
		this.aByte57 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method4706();
		this.method4698((local12 >> 3 & 0x7) + 1);
		this.aByte59 = (byte) (local12 >> 6 & 0x3);
		super.anInt6328 += (this.method4706() - local44) * 64;
		super.anInt6317 += (this.method4706() - local44) * 64;
		this.aByte58 = arg0.method4217();
		this.anInt5389 = arg0.method4217();
		this.anInt5398 = arg0.method4217();
		this.anInt5385 = 0;
		@Pc(107) int local107 = -1;
		@Pc(110) int[] local110 = new int[12];
		@Pc(137) int local137;
		@Pc(143) int local143;
		@Pc(185) int local185;
		for (@Pc(112) int local112 = 0; local112 < 12; local112++) {
			@Pc(122) int local122 = arg0.method4240();
			if (local122 == 0) {
				local110[local112] = 0;
			} else {
				local137 = arg0.method4240();
				local143 = local137 + (local122 << 8);
				if (local112 == 0 && local143 == 65535) {
					local107 = arg0.method4245();
					this.anInt5385 = arg0.method4240();
					break;
				}
				if (local143 >= 32768) {
					local143 = Static372.anIntArray784[local143 - 32768];
					local110[local112] = local143 | 0x40000000;
					local185 = Static106.aClass250_1.method5735(local143).anInt2876;
					if (local185 != 0) {
						this.anInt5385 = local185;
					}
				} else {
					local110[local112] = Integer.MIN_VALUE | local143 - 256;
				}
			}
		}
		@Pc(212) int[] local212 = new int[5];
		for (local137 = 0; local137 < 5; local137++) {
			local143 = arg0.method4240();
			if (local143 < 0 || local143 >= Static250.aShortArrayArray34[local137].length) {
				local143 = 0;
			}
			local212[local137] = local143;
		}
		this.anInt5416 = arg0.method4245();
		this.aString52 = arg0.method4201();
		if (local29) {
			this.aString51 = arg0.method4201();
		} else {
			this.aString51 = this.aString52;
		}
		this.anInt5393 = arg0.method4240();
		if (local40) {
			this.anInt5417 = arg0.method4245();
			this.anInt5413 = -1;
			this.anInt5411 = this.anInt5393;
		} else {
			this.anInt5417 = 0;
			this.anInt5411 = arg0.method4240();
			this.anInt5413 = arg0.method4240();
			if (this.anInt5413 == 255) {
				this.anInt5413 = -1;
			}
		}
		local143 = this.anInt5418;
		this.anInt5418 = arg0.method4240();
		@Pc(348) int local348;
		if (this.anInt5418 == 0) {
			Static287.method4407(this);
		} else {
			local185 = this.anInt5397;
			@Pc(345) int local345 = this.anInt5415;
			local348 = this.anInt5388;
			@Pc(351) int local351 = this.anInt5384;
			@Pc(354) int local354 = this.anInt5414;
			this.anInt5397 = arg0.method4245();
			this.anInt5415 = arg0.method4245();
			this.anInt5388 = arg0.method4245();
			this.anInt5384 = arg0.method4245();
			this.anInt5414 = arg0.method4240();
			if (this.anInt5418 != local143 || this.anInt5397 != local185 || local345 != this.anInt5415 || this.anInt5388 != local348 || this.anInt5384 != local351 || local354 != this.anInt5414) {
				Static176.method2853(this);
			}
		}
		if (this.aClass247_1 == null) {
			this.aClass247_1 = new Class247();
		}
		local185 = this.aClass247_1.anInt6655;
		@Pc(443) int[] local443 = this.aClass247_1.anIntArray803;
		this.aClass247_1.method5691(local107, this.method4707(), local110, local212, this.aByte57 == 1);
		if (local185 != local107) {
			super.anInt6328 = super.anIntArray659[0] * 128 + this.method4706() * 64;
			super.anInt6317 = super.anIntArray658[0] * 128 + this.method4706() * 64;
		}
		if (Static194.anInt3441 == super.anInt5365 && local443 != null) {
			for (local348 = 0; local348 < local212.length; local348++) {
				if (local443[local348] != local212[local348]) {
					Static106.aClass250_1.method5730();
					break;
				}
			}
		}
		if (super.aClass22_Sub6_6 != null) {
			super.aClass22_Sub6_6.method3565();
		}
		if (super.anInt5339 == -1 || !super.aBoolean422) {
			return;
		}
		@Pc(550) Class170 local550 = this.method4711();
		if (!local550.method4016(super.anInt5339)) {
			super.aBoolean422 = false;
			super.anInt5339 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "(I)Z")
	public boolean method4716() {
		return this.aClass247_1 != null;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIILclient!ab;Lclient!dr;Lclient!km;I)V")
	private void method4717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3 arg3, @OriginalArg(5) Class54 arg4, @OriginalArg(6) Class82 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg1 * arg1;
		if (local11 < 16 || local11 > arg2) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg1, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(62) Class3 local62 = Static108.method2082(local35, super.anInt6328, arg5, super.anInt6322, super.anInt6317, arg6, super.anInt5334, super.anInt5343, super.anInt5351, arg3);
		if (local62 != null) {
			arg5.method4555(false);
			local62.method3443(arg4, null, 0);
			arg5.method4555(true);
		}
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		if (this.aClass247_1 == null || !this.method4723(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class54 local19 = arg0.method4556();
		@Pc(24) int local24 = super.aClass32_7.method773();
		local19.method4782(local24);
		local19.method4783(super.anInt6328, super.anInt6322, super.anInt6317);
		@Pc(38) float local38 = arg0.method4479();
		@Pc(41) float local41 = arg0.method4546();
		if (Static80.aBoolean128) {
			@Pc(47) Class170 local47 = this.method4711();
			if (local47.aBoolean339 && (this.aClass247_1.anInt6655 == -1 || Static274.aClass151_4.method3705(this.aClass247_1.anInt6655).aBoolean485)) {
				@Pc(79) Class189 local79 = super.anInt5371 != -1 && super.anInt5357 == 0 ? Static351.aClass175_3.method4107(super.anInt5371) : null;
				@Pc(99) Class189 local99 = super.anInt5339 == -1 || this.aBoolean424 || super.aBoolean422 && local79 != null ? null : Static351.aClass175_3.method4107(super.anInt5339);
				@Pc(133) Class3 local133 = Static106.method1855(arg0, 160, 240, super.anInt5351, super.anInt5334, super.aBoolean419, 1, 0, local99 == null ? local79 : local99, local99 == null ? super.anInt5318 : super.anInt5316, super.aClass3Array3[0], super.anInt5343, local24, 0);
				if (local133 != null) {
					arg0.method4516(local38, local41 - 128.0F);
					arg0.method4555(false);
					local133.method3443(local19, null, 0);
					arg0.method4555(true);
				}
			}
		}
		if (Static267.aClass12_Sub1_Sub2_Sub2_1 == this) {
			arg0.method4516(local38, local41 - 144.0F);
			local19.method4789(super.anInt6328, super.anInt6322, super.anInt6317);
			for (@Pc(174) int local174 = Static239.aClass97Array1.length - 1; local174 >= 0; local174--) {
				@Pc(180) Class97 local180 = Static239.aClass97Array1[local174];
				if (local180 != null && local180.anInt2449 != -1) {
					@Pc(231) int local231;
					@Pc(221) int local221;
					if (local180.anInt2442 == 1 && local180.anInt2444 >= 0 && Static107.aClass12_Sub1_Sub2_Sub1Array1.length > local180.anInt2444) {
						@Pc(208) Class12_Sub1_Sub2_Sub1 local208 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local180.anInt2444];
						if (local208 != null) {
							local221 = local208.anInt6328 / 32 - Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 / 32;
							local231 = local208.anInt6317 / 32 - Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 / 32;
							this.method4717(local231, local221, 360000, super.aClass3Array3[0], local19, arg0, local180.anInt2449);
						}
					}
					if (local180.anInt2442 == 2) {
						@Pc(267) int local267 = (local180.anInt2445 - Static376.anInt6607) * 4 + 2 - Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 / 32;
						local221 = (local180.anInt2443 - Static133.anInt2474) * 4 + 2 - Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 / 32;
						local231 = local180.anInt2454 * 4;
						local231 *= local231;
						this.method4717(local221, local267, local231, super.aClass3Array3[0], local19, arg0, local180.anInt2449);
					}
					if (local180.anInt2442 == 10 && local180.anInt2444 >= 0 && Static90.aClass12_Sub1_Sub2_Sub2Array1.length > local180.anInt2444) {
						@Pc(324) Class12_Sub1_Sub2_Sub2 local324 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local180.anInt2444];
						if (local324 != null) {
							local221 = local324.anInt6328 / 32 - Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 / 32;
							local231 = local324.anInt6317 / 32 - Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 / 32;
							this.method4717(local231, local221, 360000, super.aClass3Array3[0], local19, arg0, local180.anInt2449);
						}
					}
				}
			}
			local19.method4782(local24);
			local19.method4783(super.anInt6328, super.anInt6322, super.anInt6317);
		}
		arg0.method4516(local38, local41);
		@Pc(392) Class22_Sub8 local392 = Static128.method2279(super.aClass3Array3.length);
		if (super.aClass22_Sub6_6 == null) {
			arg0.method4535(super.aClass3Array3, local19, local392.aClass22_Sub1Array1, Static267.aClass12_Sub1_Sub2_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(414) Class157 local414 = super.aClass22_Sub6_6.method3555();
			arg0.method4545(super.aClass3Array3, local414, local19, local392.aClass22_Sub1Array1, Static267.aClass12_Sub1_Sub2_Sub2_1 == this ? 1 : 0);
		}
		this.method4700(arg0, false, super.aClass3Array3);
		if (super.aClass3Array3[2] != null) {
			if (local24 != 0) {
				super.aClass3Array3[2].method3451(local24);
			}
			super.aClass3Array3[2].method3442(-super.aClass2_Sub3_3.anInt145 + super.anInt6328, -super.aClass2_Sub3_3.anInt148 + super.anInt6322, -super.aClass2_Sub3_3.anInt146 + super.anInt6317);
		}
		return local392;
	}

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIBB)V")
	public void method4720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5371 != -1 && Static351.aClass175_3.method4107(super.anInt5371).anInt5167 == 1) {
			super.anInt5371 = -1;
		}
		if (super.anInt5330 != -1) {
			@Pc(36) Class220 local36 = Static168.aClass74_1.method1772(super.anInt5330);
			if (local36.aBoolean455 && local36.anInt6020 != -1 && Static351.aClass175_3.method4107(local36.anInt6020).anInt5167 == 1) {
				super.anInt5330 = -1;
			}
		}
		this.anInt5390 = -1;
		if (arg1 < 0 || arg1 >= Static392.anInt6751 || arg0 < 0 || Static307.anInt5484 <= arg0) {
			this.method4722(arg1, arg0);
		} else if (super.anIntArray659[0] >= 0 && super.anIntArray659[0] < Static392.anInt6751 && super.anIntArray658[0] >= 0 && super.anIntArray658[0] < Static307.anInt5484) {
			if (arg2 == 2) {
				Static78.method1405(arg0, arg1, this);
			}
			this.method4721(arg0, arg1, arg2);
		} else {
			this.method4722(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
		if (this.aClass247_1 != null && (super.aBoolean423 || this.method4723(arg0, 0))) {
			this.method4700(arg0, super.aBoolean423, super.aClass3Array3);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass247_1 == null || !this.method4723(arg0, 65536)) {
			return true;
		}
		@Pc(19) Class54 local19 = arg0.method4556();
		@Pc(24) int local24 = super.aClass32_7.method773();
		local19.method4782(local24);
		local19.method4783(super.anInt6328, super.anInt6322, super.anInt6317);
		for (@Pc(42) int local42 = 0; local42 < super.aClass3Array3.length; local42++) {
			if (super.aClass3Array3[local42] != null && super.aClass3Array3[local42].method3444(arg2, arg1, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIBI)V")
	public void method4721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt5380 < 9) {
			super.anInt5380++;
		}
		for (@Pc(22) int local22 = super.anInt5380; local22 > 0; local22--) {
			super.anIntArray659[local22] = super.anIntArray659[local22 - 1];
			super.anIntArray658[local22] = super.anIntArray658[local22 - 1];
			super.aByteArray84[local22] = super.aByteArray84[local22 - 1];
		}
		super.anIntArray659[0] = arg1;
		super.anIntArray658[0] = arg0;
		super.aByteArray84[0] = arg2;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BII)V")
	public void method4722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray659[0] = arg0;
		super.anInt5378 = 0;
		super.anInt5380 = 0;
		super.anInt5377 = 0;
		super.anIntArray658[0] = arg1;
		@Pc(30) int local30 = this.method4706();
		super.anInt6328 = local30 * 64 + super.anIntArray659[0] * 128;
		super.anInt6317 = local30 * 64 + super.anIntArray658[0] * 128;
		if (Static267.aClass12_Sub1_Sub2_Sub2_1 == this) {
			Static150.method2531();
		}
		if (super.aClass22_Sub6_6 != null) {
			super.aClass22_Sub6_6.method3565();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!km;BI)Z")
	private boolean method4723(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class170 local11 = this.method4711();
		@Pc(27) Class189 local27 = super.anInt5371 != -1 && super.anInt5357 == 0 ? Static351.aClass175_3.method4107(super.anInt5371) : null;
		@Pc(47) Class189 local47 = super.anInt5339 == -1 || this.aBoolean424 || super.aBoolean422 && local27 != null ? null : Static351.aClass175_3.method4107(super.anInt5339);
		@Pc(50) int local50 = local11.anInt4531;
		@Pc(53) int local53 = local11.anInt4545;
		if (local50 != 0 || local53 != 0 || local11.anInt4559 != 0 || local11.anInt4570 != 0) {
			arg1 |= 0x7;
		}
		super.aClass3Array3[0] = this.aClass247_1.method5695(super.anInt5316, arg1, Static8.aClass40_1, Static274.aClass151_4, Static106.aClass250_1, Static351.aClass175_3, super.anInt5368, super.anInt5331, super.aClass95Array3, local27, super.anInt5338, local47, Static248.aClass125_1, Static225.aClass47_1, super.anInt5318, arg0, super.anInt5370);
		@Pc(114) int local114 = Static246.method3929();
		if (Static314.anInt5576 < 96 && local114 > 50) {
			Static10.method377();
		}
		@Pc(135) int local135;
		if (Static337.aClass143_27 != Static91.aClass143_12 && local114 < 50) {
			local135 = 50 - local114;
			while (Static374.anInt6550 < local135) {
				Static109.aByteArrayArray8[Static374.anInt6550] = new byte[102400];
				Static374.anInt6550++;
			}
			while (local135 < Static374.anInt6550) {
				Static374.anInt6550--;
				Static109.aByteArrayArray8[Static374.anInt6550] = null;
			}
		} else if (Static91.aClass143_12 != Static337.aClass143_27) {
			Static109.aByteArrayArray8 = new byte[50][];
			Static374.anInt6550 = 0;
		}
		if (super.aClass3Array3[0] == null) {
			return false;
		}
		super.anInt5332 = super.aClass3Array3[0].method3459();
		this.method4704(super.aClass3Array3[0]);
		local135 = super.aClass32_7.method773();
		super.anInt5351 = 0;
		super.anInt5343 = 0;
		super.anInt5334 = 0;
		if (local50 == 0 && local53 == 0) {
			this.method4705(this.method4706() << 7, this.method4706() << 7, local135);
		} else {
			this.method4705(local50, local53, local135);
			if (super.anInt5334 != 0) {
				super.aClass3Array3[0].method3460(super.anInt5334);
			}
			if (super.anInt5351 != 0) {
				super.aClass3Array3[0].method3463(super.anInt5351);
			}
			if (super.anInt5343 != 0) {
				super.aClass3Array3[0].method3442(0, super.anInt5343, 0);
			}
		}
		super.aClass3Array3[1] = null;
		if (!this.aBoolean424 && super.anInt5330 != -1 && super.anInt5341 != -1) {
			@Pc(303) Class220 local303 = Static168.aClass74_1.method1772(super.anInt5330);
			@Pc(323) Class3 local323 = local303.method5219(Static351.aClass175_3, arg0, (local303.aBoolean453 ? 7 : 2) | local7, super.anInt5341, super.anInt5327, super.anInt5369);
			if (local323 != null) {
				local323.method3442(0, -super.anInt5375, 0);
				if (local303.aBoolean453 && (local50 != 0 || local53 != 0)) {
					if (super.anInt5334 != 0) {
						local323.method3460(super.anInt5334);
					}
					if (super.anInt5351 != 0) {
						local323.method3463(super.anInt5351);
					}
					if (super.anInt5343 != 0) {
						local323.method3442(0, super.anInt5343, 0);
					}
				}
				super.aClass3Array3[1] = local323;
			}
		}
		super.aClass3Array3[2] = null;
		if (!this.aBoolean424 && super.aClass2_Sub3_3 != null) {
			if (Static295.anInt5281 >= super.aClass2_Sub3_3.anInt153) {
				super.aClass2_Sub3_3 = null;
			} else if (Static295.anInt5281 >= super.aClass2_Sub3_3.anInt155) {
				@Pc(403) Class3 local403 = super.aClass2_Sub3_3.method187(local7 | 0x7, arg0);
				if (local403 != null) {
					local403.method3442(-super.anInt6328 + super.aClass2_Sub3_3.anInt145, super.aClass2_Sub3_3.anInt148 - super.anInt6322, super.aClass2_Sub3_3.anInt146 - super.anInt6317);
					if (local135 != 0) {
						local403.method3451(-local135 & 0x3FFF);
					}
					super.aClass3Array3[2] = local403;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "(B)I")
	@Override
	public int method4701() {
		return -1;
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(B)I")
	@Override
	public int method5459() {
		return super.anInt5332;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)I")
	@Override
	public int method4706() {
		return this.aClass247_1 == null || this.aClass247_1.anInt6655 == -1 ? super.method4706() : Static274.aClass151_4.method3705(this.aClass247_1.anInt6655).anInt6483;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method4724() {
		@Pc(7) String local7 = "";
		if (Static363.aStringArray37 != null) {
			local7 = local7 + Static363.aStringArray37[this.aByte59];
		}
		@Pc(31) int[] local31;
		if (this.aByte57 == 1 && Static191.anIntArray379 != null) {
			local31 = Static191.anIntArray379;
		} else {
			local31 = Static252.anIntArray561;
		}
		if (local31 != null && local31[this.aByte59] != -1) {
			@Pc(57) Class69 local57 = Static290.aClass105_1.method2446(local31[this.aByte59]);
			if (local57.aChar3 == 's') {
				local7 = local7 + local57.method1535(this.aByte58 & 0xFF);
			} else {
				Static235.method3843("gdn1", new Throwable());
				local31[this.aByte59] = -1;
			}
		}
		local7 = local7 + this.aString52;
		if (Static144.aStringArray14 != null) {
			local7 = local7 + Static144.aStringArray14[this.aByte59];
		}
		return local7;
	}
}
