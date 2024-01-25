import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class11_Sub5_Sub2_Sub1 extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!gh", name = "xc", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!gh", name = "Kc", descriptor = "Lclient!bk;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!gh", name = "Xc", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!gh", name = "Zc", descriptor = "I")
	private int anInt2405;

	@OriginalMember(owner = "client!gh", name = "ad", descriptor = "I")
	public int anInt2406;

	@OriginalMember(owner = "client!gh", name = "dd", descriptor = "I")
	public int anInt2409;

	@OriginalMember(owner = "client!gh", name = "Pc", descriptor = "I")
	public int anInt2398 = -1;

	@OriginalMember(owner = "client!gh", name = "Uc", descriptor = "B")
	private byte aByte37 = 0;

	@OriginalMember(owner = "client!gh", name = "Gc", descriptor = "I")
	public int anInt2390 = -1;

	@OriginalMember(owner = "client!gh", name = "cd", descriptor = "I")
	public int anInt2408 = 0;

	@OriginalMember(owner = "client!gh", name = "Qc", descriptor = "I")
	public int anInt2399 = -1;

	@OriginalMember(owner = "client!gh", name = "Wc", descriptor = "I")
	public int anInt2404 = -1;

	@OriginalMember(owner = "client!gh", name = "Yc", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!gh", name = "Tc", descriptor = "I")
	public int anInt2402 = 0;

	@OriginalMember(owner = "client!gh", name = "Lc", descriptor = "I")
	public int anInt2394 = -1;

	@OriginalMember(owner = "client!gh", name = "bd", descriptor = "I")
	public int anInt2407 = -1;

	@OriginalMember(owner = "client!gh", name = "ld", descriptor = "I")
	public int anInt2414 = 0;

	@OriginalMember(owner = "client!gh", name = "jd", descriptor = "I")
	public int anInt2413 = 0;

	@OriginalMember(owner = "client!gh", name = "Fc", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!gh", name = "qd", descriptor = "B")
	private byte aByte38 = 0;

	@OriginalMember(owner = "client!gh", name = "ed", descriptor = "I")
	public int anInt2410 = 0;

	@OriginalMember(owner = "client!gh", name = "gd", descriptor = "I")
	public int anInt2412 = -1;

	@OriginalMember(owner = "client!gh", name = "id", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!gh", name = "rd", descriptor = "B")
	private byte aByte39 = 0;

	@OriginalMember(owner = "client!gh", name = "nd", descriptor = "I")
	public int anInt2416 = 255;

	@OriginalMember(owner = "client!gh", name = "pd", descriptor = "I")
	public int anInt2418 = -1;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)I")
	@Override
	public int method6213() {
		return super.anInt7668;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)I")
	@Override
	public int method6217() {
		return -1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBBI)V")
	public void method2102(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7665 != -1 && Static37.aClass80_1.method1879(super.anInt7665).anInt2790 == 1) {
			super.anInt7665 = -1;
		}
		@Pc(35) Class139 local35;
		if (super.anInt7667 != -1) {
			local35 = Static399.aClass100_2.method2197(super.anInt7667);
			if (local35.aBoolean228 && local35.anInt3448 != -1 && Static37.aClass80_1.method1879(local35.anInt3448).anInt2790 == 1) {
				super.anInt7667 = -1;
			}
		}
		if (super.anInt7633 != -1) {
			local35 = Static399.aClass100_2.method2197(super.anInt7633);
			if (local35.aBoolean228 && local35.anInt3448 != -1 && Static37.aClass80_1.method1879(local35.anInt3448).anInt2790 == 1) {
				super.anInt7633 = -1;
			}
		}
		this.anInt2418 = -1;
		if (arg2 < 0 || arg2 >= Static234.anInt3949 || arg0 < 0 || Static371.anInt6492 <= arg0) {
			this.method2111(arg2, arg0);
		} else if (super.anIntArray632[0] >= 0 && super.anIntArray632[0] < Static234.anInt3949 && super.anIntArray633[0] >= 0 && Static371.anInt6492 > super.anIntArray633[0]) {
			if (arg1 == 2) {
				Static299.method4283(arg2, arg0, this);
			}
			this.method2103(arg0, arg1, arg2);
		} else {
			this.method2111(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	@Override
	public int method6215() {
		return this.aClass26_1 == null || this.aClass26_1.anInt541 == -1 ? super.method6215() : Static227.aClass54_2.method1128(this.aClass26_1.anInt541).anInt1963;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBII)V")
	public void method2103(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt7707 < 9) {
			super.anInt7707++;
		}
		for (@Pc(16) int local16 = super.anInt7707; local16 > 0; local16--) {
			super.anIntArray632[local16] = super.anIntArray632[local16 - 1];
			super.anIntArray633[local16] = super.anIntArray633[local16 - 1];
			super.aByteArray96[local16] = super.aByteArray96[local16 - 1];
		}
		super.anIntArray632[0] = arg2;
		super.anIntArray633[0] = arg0;
		super.aByteArray96[0] = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)Z")
	public boolean method2104() {
		return this.aClass26_1 != null;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
		if (this.aClass26_1 != null && (super.aBoolean516 || this.method2109(arg0, 0))) {
			this.method6232(super.aClass63Array3, arg0, super.aBoolean516);
			super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method2105() {
		return this.aString20;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!hw;B)V")
	public void method2106(@OriginalArg(0) Class2_Sub17 arg0) {
		arg0.anInt7523 = 0;
		@Pc(12) int local12 = arg0.method6138();
		this.aByte37 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method6215();
		this.method6229((local12 >> 3 & 0x7) + 1);
		this.aByte38 = (byte) (local12 >> 6 & 0x3);
		super.anInt7626 += this.method6215() - local44 << 6;
		super.anInt7622 += this.method6215() - local44 << 6;
		this.aByte39 = arg0.method6120();
		this.anInt2394 = arg0.method6120();
		this.anInt2390 = arg0.method6120();
		this.anInt2413 = 0;
		@Pc(109) int local109 = -1;
		@Pc(112) int[] local112 = new int[12];
		@Pc(133) int local133;
		@Pc(139) int local139;
		@Pc(175) int local175;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			@Pc(119) int local119 = arg0.method6138();
			if (local119 == 0) {
				local112[local114] = 0;
			} else {
				local133 = arg0.method6138();
				local139 = local133 + (local119 << 8);
				if (local114 == 0 && local139 == 65535) {
					local109 = arg0.method6148();
					this.anInt2413 = arg0.method6138();
					break;
				}
				if (local139 >= 32768) {
					local139 = Static202.anIntArray289[local139 - 32768];
					local112[local114] = local139 | 0x40000000;
					local175 = Static413.aClass271_2.method6193(local139).anInt6294;
					if (local175 != 0) {
						this.anInt2413 = local175;
					}
				} else {
					local112[local114] = Integer.MIN_VALUE | local139 - 256;
				}
			}
		}
		@Pc(199) int[] local199 = new int[5];
		for (local133 = 0; local133 < 5; local133++) {
			local139 = arg0.method6138();
			if (local139 < 0 || Static373.aShortArrayArray6[local133].length <= local139) {
				local139 = 0;
			}
			local199[local133] = local139;
		}
		this.anInt2405 = arg0.method6148();
		this.aString19 = arg0.method6141();
		if (local29) {
			this.aString20 = arg0.method6141();
		} else {
			this.aString20 = this.aString19;
		}
		this.anInt2410 = arg0.method6138();
		if (local40) {
			this.anInt2408 = arg0.method6148();
			this.anInt2414 = this.anInt2410;
			this.anInt2404 = -1;
		} else {
			this.anInt2408 = 0;
			this.anInt2414 = arg0.method6138();
			this.anInt2404 = arg0.method6138();
			if (this.anInt2404 == 255) {
				this.anInt2404 = -1;
			}
		}
		local139 = this.anInt2402;
		this.anInt2402 = arg0.method6138();
		@Pc(318) int local318;
		if (this.anInt2402 == 0) {
			Static285.method4042(this);
		} else {
			local175 = this.anInt2407;
			@Pc(315) int local315 = this.anInt2412;
			local318 = this.anInt2398;
			@Pc(321) int local321 = this.anInt2399;
			@Pc(324) int local324 = this.anInt2416;
			this.anInt2407 = arg0.method6148();
			this.anInt2412 = arg0.method6148();
			this.anInt2398 = arg0.method6148();
			this.anInt2399 = arg0.method6148();
			this.anInt2416 = arg0.method6138();
			if (this.anInt2402 != local139 || this.anInt2407 != local175 || local315 != this.anInt2412 || this.anInt2398 != local318 || local321 != this.anInt2399 || this.anInt2416 != local324) {
				Static302.method4316(this);
			}
		}
		if (this.aClass26_1 == null) {
			this.aClass26_1 = new Class26();
		}
		local175 = this.aClass26_1.anInt541;
		@Pc(428) int[] local428 = this.aClass26_1.anIntArray52;
		this.aClass26_1.method506(this.method6230(), this.aByte37 == 1, local112, local199, local109);
		if (local175 != local109) {
			super.anInt7626 = (super.anIntArray632[0] << 7) + (this.method6215() << 6);
			super.anInt7622 = (super.anIntArray633[0] << 7) + (this.method6215() << 6);
		}
		if (super.anInt7670 == Static94.anInt5592 && local428 != null) {
			for (local318 = 0; local318 < local199.length; local318++) {
				if (local428[local318] != local199[local318]) {
					Static413.aClass271_2.method6203();
					break;
				}
			}
		}
		if (super.aClass28_Sub1_7 != null) {
			super.aClass28_Sub1_7.method528();
		}
		if (super.anInt7663 == -1 || !super.aBoolean514) {
			return;
		}
		@Pc(528) Class101 local528 = this.method6218();
		if (!local528.method2203(super.anInt7663)) {
			super.aBoolean514 = false;
			super.anInt7663 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!e;ILclient!za;Lclient!c;IIII)V")
	private void method2107(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg4 * arg4 + arg6 * arg6;
		if (local11 < 16384 || arg5 < local11) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg4, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class63 local45 = Static421.method5770(super.anInt7639, arg2, local31, arg1, super.anInt7648, super.anInt7632);
		if (local45 != null) {
			arg2.method5971(false);
			local45.method6293(arg3, null, 0);
			arg2.method5971(true);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!za;ZI)Z")
	private boolean method2109(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class101 local9 = this.method6218();
		@Pc(28) Class109 local28 = super.anInt7665 != -1 && super.anInt7662 == 0 ? Static37.aClass80_1.method1879(super.anInt7665) : null;
		@Pc(49) Class109 local49 = super.anInt7663 == -1 || this.aBoolean145 || super.aBoolean514 && local28 != null ? null : Static37.aClass80_1.method1879(super.anInt7663);
		@Pc(52) int local52 = local9.anInt2653;
		@Pc(55) int local55 = local9.anInt2609;
		if (local52 != 0 || local55 != 0 || local9.anInt2617 != 0 || local9.anInt2634 != 0) {
			arg1 |= 0x7;
		}
		@Pc(104) boolean local104 = super.aByte105 != 0 && super.anInt7652 <= Static277.anInt5022 && super.anInt7698 > Static277.anInt5022;
		if (local104) {
			arg1 |= 0x80000;
		}
		@Pc(145) Class63 local145 = super.aClass63Array3[0] = this.aClass26_1.method515(local49, Static413.aClass271_2, Static227.aClass54_2, local28, super.anInt7701, Static257.aClass262_1, arg0, super.anInt7693, arg1, super.anInt7704, super.anInt7657, Static421.aClass174_2, super.anInt7654, super.anInt7647, super.aClass92Array3, Static37.aClass80_1, Static63.aClass120_2);
		@Pc(148) int local148 = Static26.method437();
		if (Static170.anInt3068 < 96 && local148 > 50) {
			Static278.method3970();
		}
		@Pc(168) int local168;
		if (Static112.aClass129_4 != Static429.aClass129_8 && local148 < 50) {
			local168 = 50 - local148;
			while (Static234.anInt3948 < local168) {
				Static38.aByteArrayArray5[Static234.anInt3948] = new byte[102400];
				Static234.anInt3948++;
			}
			while (local168 < Static234.anInt3948) {
				Static234.anInt3948--;
				Static38.aByteArrayArray5[Static234.anInt3948] = null;
			}
		} else if (Static112.aClass129_4 != Static429.aClass129_8) {
			Static38.aByteArrayArray5 = new byte[50][];
			Static234.anInt3948 = 0;
		}
		if (local145 == null) {
			return false;
		}
		super.anInt7668 = local145.B();
		this.method6228(local145);
		local168 = super.aClass23_7.method461();
		if (local52 == 0 && local55 == 0) {
			this.method6221(local168, this.method6215() << 7, 0, this.method6215() << 7, 0);
		} else {
			this.method6221(local168, local55, local9.anInt2644, local52, local9.anInt2640);
			if (super.anInt7648 != 0) {
				local145.W(super.anInt7648);
			}
			if (super.anInt7639 != 0) {
				local145.K(super.anInt7639);
			}
			if (super.anInt7632 != 0) {
				local145.a(0, super.anInt7632, 0);
			}
		}
		if (local104) {
			local145.method6282(super.aByte103, super.aByte104, super.aByte102, super.aByte105 & 0xFF);
		}
		@Pc(316) Class139 local316;
		@Pc(333) boolean local333;
		@Pc(335) int local335;
		@Pc(380) Class63 local380;
		if (this.aBoolean145 || super.anInt7667 == -1 || super.anInt7694 == -1) {
			super.aClass63Array3[1] = null;
		} else {
			local316 = Static399.aClass100_2.method2197(super.anInt7667);
			local333 = local316.aByte58 == 3 && (local52 != 0 || local55 != 0);
			local335 = local5;
			if (local333) {
				local335 = local5 | 0x7;
			} else {
				if (super.anInt7628 != 0) {
					local335 = local5 | 0x5;
				}
				if (super.anInt7676 != 0) {
					local335 |= 0x2;
				}
			}
			local380 = super.aClass63Array3[1] = local316.method2836(arg0, super.anInt7683, local335, super.anInt7703, Static37.aClass80_1, super.anInt7694);
			if (local380 != null) {
				if (super.anInt7676 != 0) {
					local380.a(0, -super.anInt7676 << 0, 0);
				}
				if (super.anInt7628 != 0) {
					local380.ma(super.anInt7628 * 2048);
				}
				if (local333) {
					if (super.anInt7648 != 0) {
						local380.W(super.anInt7648);
					}
					if (super.anInt7639 != 0) {
						local380.K(super.anInt7639);
					}
					if (super.anInt7632 != 0) {
						local380.a(0, super.anInt7632, 0);
					}
				}
			}
		}
		if (this.aBoolean145 || super.anInt7633 == -1 || super.anInt7679 == -1) {
			super.aClass63Array3[3] = null;
		} else {
			local316 = Static399.aClass100_2.method2197(super.anInt7633);
			local333 = local316.aByte58 == 3 && (local52 != 0 || local55 != 0);
			local335 = local5;
			if (local333) {
				local335 = local5 | 0x7;
			} else {
				if (super.anInt7635 != 0) {
					local335 = local5 | 0x5;
				}
				if (super.anInt7684 != 0) {
					local335 |= 0x2;
				}
			}
			local380 = super.aClass63Array3[3] = local316.method2838(Static37.aClass80_1, super.anInt7655, super.anInt7666, local335, arg0, super.anInt7679);
			if (local380 != null) {
				if (super.anInt7684 != 0) {
					local380.a(0, -super.anInt7684 << 0, 0);
				}
				if (super.anInt7635 != 0) {
					local380.ma(super.anInt7635 * 2048);
				}
				if (local333) {
					if (super.anInt7648 != 0) {
						local380.W(super.anInt7648);
					}
					if (super.anInt7639 != 0) {
						local380.K(super.anInt7639);
					}
					if (super.anInt7632 != 0) {
						local380.a(0, super.anInt7632, 0);
					}
				}
			}
		}
		super.aClass63Array3[2] = null;
		if (!this.aBoolean145 && super.aClass2_Sub28_3 != null) {
			if (super.aClass2_Sub28_3.anInt5050 <= Static277.anInt5022) {
				super.aClass2_Sub28_3 = null;
			} else if (super.aClass2_Sub28_3.anInt5052 <= Static277.anInt5022) {
				@Pc(624) Class63 local624 = super.aClass2_Sub28_3.method3987(arg0, local5 | 0x7);
				if (local624 != null) {
					local624.a(super.aClass2_Sub28_3.anInt5056 - super.anInt7626, -super.anInt7624 + super.aClass2_Sub28_3.anInt5061, super.aClass2_Sub28_3.anInt5059 - super.anInt7622);
					if (local168 != 0) {
						local624.ma(-local168 & 0x3FFF);
					}
					super.aClass63Array3[2] = local624;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		if (this.aClass26_1 == null || !this.method2109(arg2, 131072)) {
			return false;
		}
		@Pc(23) Class6 local23 = arg2.method5990();
		@Pc(28) int local28 = super.aClass23_7.method461();
		local23.ca(local28);
		local23.W(super.anInt7626, super.anInt7624, super.anInt7622);
		@Pc(41) boolean local41 = false;
		for (@Pc(43) int local43 = 0; local43 < super.aClass63Array3.length; local43++) {
			if (super.aClass63Array3[local43] != null && super.aClass63Array3[local43].method6292(arg0, arg1, local23, true)) {
				local41 = true;
				break;
			}
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		return local41;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		if (this.aClass26_1 == null || !this.method2109(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class6 local19 = arg0.method5990();
		@Pc(24) int local24 = super.aClass23_7.method461();
		local19.ca(local24);
		local19.W(super.anInt7626, super.anInt7624, super.anInt7622);
		@Pc(38) float local38 = arg0.T();
		@Pc(41) float local41 = arg0.aa();
		@Pc(111) int local111;
		if (Static434.aClass165_Sub1_1.aBoolean293) {
			@Pc(48) Class101 local48 = this.method6218();
			if (local48.aBoolean167 && (this.aClass26_1.anInt541 == -1 || Static227.aClass54_2.method1128(this.aClass26_1.anInt541).aBoolean117)) {
				@Pc(86) Class109 local86 = super.anInt7665 != -1 && super.anInt7662 == 0 ? Static37.aClass80_1.method1879(super.anInt7665) : null;
				@Pc(109) Class109 local109 = super.anInt7663 == -1 || this.aBoolean145 || super.aBoolean514 && local86 != null ? null : Static37.aClass80_1.method1879(super.anInt7663);
				local111 = 0;
				if (super.anInt7674 != 0) {
					local111 = this.method6216();
				}
				@Pc(151) Class63 local151 = Static420.method5766(super.anInt7632, super.anInt7639, local24, 240, 1, super.anInt7648, 0, local111, super.aClass63Array3[0], local109 == null ? super.anInt7693 : super.anInt7701, 160, 0, local109 == null ? local86 : local109, arg0);
				if (local151 != null) {
					arg0.da(local38, local41 - 128.0F);
					arg0.method5971(false);
					local151.method6293(local19, null, 0);
					arg0.method5971(true);
				}
			}
		}
		if (Static127.aClass11_Sub5_Sub2_Sub1_2 == this) {
			arg0.da(local38, local41 - 144.0F);
			local19.U(super.anInt7626, super.anInt7624, super.anInt7622);
			for (@Pc(192) int local192 = Static223.aClass166Array1.length - 1; local192 >= 0; local192--) {
				@Pc(198) Class166 local198 = Static223.aClass166Array1[local192];
				if (local198 != null && local198.anInt4240 != -1) {
					@Pc(230) int local230;
					if (local198.anInt4251 == 1) {
						@Pc(218) Class2_Sub34 local218 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local198.anInt4246);
						if (local218 != null) {
							@Pc(223) Class11_Sub5_Sub2_Sub2 local223 = local218.aClass11_Sub5_Sub2_Sub2_2;
							local230 = local223.anInt7626 - Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626;
							@Pc(236) int local236 = local223.anInt7622 - Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622;
							this.method2107(super.aClass63Array3[0], local198.anInt4240, arg0, local19, local230, 5760000, local236);
						}
					}
					if (local198.anInt4251 == 2) {
						@Pc(263) int local263 = local198.anInt4243 + 64 - Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626;
						local111 = local198.anInt4239 + 64 - Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622;
						local230 = local198.anInt4248 << 7;
						local230 *= local230;
						this.method2107(super.aClass63Array3[0], local198.anInt4240, arg0, local19, local263, local230, local111);
					}
					if (local198.anInt4251 == 10 && local198.anInt4246 >= 0 && local198.anInt4246 < Static435.aClass11_Sub5_Sub2_Sub1Array1.length) {
						@Pc(317) Class11_Sub5_Sub2_Sub1 local317 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local198.anInt4246];
						if (local317 != null) {
							local111 = local317.anInt7626 - Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626;
							local230 = local317.anInt7622 - Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622;
							this.method2107(super.aClass63Array3[0], local198.anInt4240, arg0, local19, local111, 5760000, local230);
						}
					}
				}
			}
			local19.ca(local24);
			local19.W(super.anInt7626, super.anInt7624, super.anInt7622);
		}
		arg0.da(local38, local41);
		@Pc(372) Class28_Sub5 local372 = Static29.method474(super.aClass63Array3.length);
		if (super.aClass28_Sub1_7 == null) {
			arg0.method6004(super.aClass63Array3, local19, local372.aClass28_Sub4Array1, Static127.aClass11_Sub5_Sub2_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(394) Class56 local394 = super.aClass28_Sub1_7.method536();
			arg0.method5965(super.aClass63Array3, local394, local19, local372.aClass28_Sub4Array1, Static127.aClass11_Sub5_Sub2_Sub1_2 == this ? 1 : 0);
		}
		this.method6232(super.aClass63Array3, arg0, false);
		if (super.aClass63Array3[2] != null) {
			if (local24 != 0) {
				super.aClass63Array3[2].ma(local24);
			}
			super.aClass63Array3[2].a(-super.aClass2_Sub28_3.anInt5056 + super.anInt7626, -super.aClass2_Sub28_3.anInt5061 + super.anInt7624, super.anInt7622 - super.aClass2_Sub28_3.anInt5059);
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		super.anInt7695 = Static383.anInt6623;
		return local372;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	public void method2111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt7708 = 0;
		super.anInt7707 = 0;
		super.anInt7705 = 0;
		super.anIntArray632[0] = arg0;
		super.anIntArray633[0] = arg1;
		@Pc(33) int local33 = this.method6215();
		super.anInt7622 = super.anIntArray633[0] * 128 + local33 * 64;
		super.anInt7626 = local33 * 64 + super.anIntArray632[0] * 128;
		if (Static127.aClass11_Sub5_Sub2_Sub1_2 == this) {
			Static366.method5130();
		}
		if (super.aClass28_Sub1_7 != null) {
			super.aClass28_Sub1_7.method528();
		}
	}

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "(I)I")
	@Override
	protected int method6230() {
		return this.anInt2405;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2112() {
		@Pc(7) String local7 = "";
		if (Static58.aStringArray10 != null) {
			local7 = local7 + Static58.aStringArray10[this.aByte38];
		}
		@Pc(29) int[] local29;
		if (this.aByte37 == 1 && Static138.anIntArray214 != null) {
			local29 = Static138.anIntArray214;
		} else {
			local29 = Static208.anIntArray513;
		}
		if (local29 != null && local29[this.aByte38] != -1) {
			@Pc(49) Class221 local49 = Static384.aClass162_1.method3228(local29[this.aByte38]);
			if (local49.aChar5 == 's') {
				local7 = local7 + local49.method5114(this.aByte39 & 0xFF);
			} else {
				Static22.method402(new Throwable(), "gdn1");
				local29[this.aByte38] = -1;
			}
		}
		local7 = local7 + this.aString19;
		if (Static347.aStringArray56 != null) {
			local7 = local7 + Static347.aStringArray56[this.aByte38];
		}
		return local7;
	}
}
