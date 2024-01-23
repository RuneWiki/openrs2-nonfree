import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class20_Sub3_Sub1 extends Class20_Sub3 {

	@OriginalMember(owner = "client!gj", name = "Eb", descriptor = "I")
	public int anInt1495;

	@OriginalMember(owner = "client!gj", name = "Fb", descriptor = "Lclient!hh;")
	public Class50 aClass50_493;

	@OriginalMember(owner = "client!gj", name = "Hb", descriptor = "I")
	public int anInt1497;

	@OriginalMember(owner = "client!gj", name = "Rb", descriptor = "Lclient!ra;")
	public Class20_Sub5 aClass20_Sub5_1;

	@OriginalMember(owner = "client!gj", name = "Yb", descriptor = "I")
	public int anInt1510;

	@OriginalMember(owner = "client!gj", name = "Zb", descriptor = "Lclient!ec;")
	public Class25 aClass25_2;

	@OriginalMember(owner = "client!gj", name = "ac", descriptor = "I")
	public int anInt1511;

	@OriginalMember(owner = "client!gj", name = "lc", descriptor = "I")
	public int anInt1518;

	@OriginalMember(owner = "client!gj", name = "nc", descriptor = "I")
	public int anInt1520;

	@OriginalMember(owner = "client!gj", name = "qc", descriptor = "I")
	public int anInt1522;

	@OriginalMember(owner = "client!gj", name = "Ib", descriptor = "I")
	public int anInt1498 = 0;

	@OriginalMember(owner = "client!gj", name = "Ub", descriptor = "I")
	public int anInt1506 = -1;

	@OriginalMember(owner = "client!gj", name = "Ob", descriptor = "I")
	public int anInt1502 = -1;

	@OriginalMember(owner = "client!gj", name = "Jb", descriptor = "I")
	public int anInt1499 = 0;

	@OriginalMember(owner = "client!gj", name = "hc", descriptor = "I")
	public int anInt1514 = -1;

	@OriginalMember(owner = "client!gj", name = "Sb", descriptor = "I")
	public int anInt1505 = 0;

	@OriginalMember(owner = "client!gj", name = "kc", descriptor = "I")
	public int anInt1517 = -1;

	@OriginalMember(owner = "client!gj", name = "Kb", descriptor = "S")
	private short aShort6 = 0;

	@OriginalMember(owner = "client!gj", name = "Gb", descriptor = "I")
	public int anInt1496 = 0;

	@OriginalMember(owner = "client!gj", name = "jc", descriptor = "I")
	public int anInt1516 = 0;

	@OriginalMember(owner = "client!gj", name = "bc", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!gj", name = "Vb", descriptor = "I")
	public int anInt1507 = 0;

	@OriginalMember(owner = "client!gj", name = "pc", descriptor = "S")
	private short aShort8 = 0;

	@OriginalMember(owner = "client!gj", name = "Pb", descriptor = "I")
	public int anInt1503 = -1;

	@OriginalMember(owner = "client!gj", name = "rc", descriptor = "I")
	private int anInt1523 = 0;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)Lclient!hh;")
	public Class50 method1089() {
		@Pc(6) Class50 local6 = this.aClass50_493;
		if (Static73.aClass50Array62 != null) {
			local6 = Static17.method257(new Class50[] { Static73.aClass50Array62[this.anInt1523], local6 });
		}
		if (Static185.aClass50Array72 != null) {
			local6 = Static17.method257(new Class50[] { local6, Static185.aClass50Array72[this.anInt1523] });
		}
		return local6;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()I")
	@Override
	public int method3494() {
		return super.anInt3053;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2467() {
		return this.aClass25_2 != null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIILclient!ra;IIIIIII)V")
	private void method1091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) int local7 = arg8 * arg8 + arg7 * arg7;
		if (local7 < 16 || local7 > 360000) {
			return;
		}
		@Pc(29) int local29 = (int) (Math.atan2((double) arg7, (double) arg8) * 325.949D) & 0x7FF;
		@Pc(41) Class20_Sub5 local41 = Static159.method3338(super.anInt3022, arg3, super.anInt3011, local29, arg5, super.anInt3008);
		if (local41 != null) {
			local41.method3495(0, arg10, arg11, arg2, arg9, arg6, arg4, arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!pg;Z)V")
	public void method1092(@OriginalArg(0) Class1_Sub17 arg0) {
		arg0.anInt2656 = 0;
		@Pc(10) int local10 = -1;
		@Pc(14) int local14 = arg0.method2142();
		@Pc(18) int local18 = local14 & 0x1;
		if ((local14 & 0x2) == 2) {
			this.aShort6 = (short) (arg0.method2142() << 2);
			this.aShort8 = (short) (arg0.method2142() << 2);
		} else {
			this.aShort6 = 0;
			this.aShort8 = 0;
		}
		super.anInt3034 = (local14 >> 3 & 0x7) + 1;
		@Pc(64) boolean local64 = (local14 & 0x4) != 0;
		this.anInt1523 = local14 >> 6 & 0x3;
		@Pc(74) int[] local74 = new int[12];
		this.anInt1517 = arg0.method2155();
		this.anInt1502 = arg0.method2155();
		this.anInt1496 = 0;
		@Pc(107) int local107;
		@Pc(114) int local114;
		@Pc(147) int local147;
		for (@Pc(89) int local89 = 0; local89 < 12; local89++) {
			@Pc(95) int local95 = arg0.method2142();
			if (local95 == 0) {
				local74[local89] = 0;
			} else {
				local107 = arg0.method2142();
				local114 = (local95 << 8) + local107;
				if (local89 == 0 && local114 == 65535) {
					local10 = arg0.method2178();
					break;
				}
				if (local114 >= 32768) {
					local114 = Static187.anIntArray434[local114 - 32768];
					local74[local89] = local114 | 0x40000000;
					local147 = Static16.method227(local114).anInt2450;
					if (local147 != 0) {
						this.anInt1496 = local147;
					}
				} else {
					local74[local89] = local114 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(171) int[] local171 = new int[5];
		for (local107 = 0; local107 < 5; local107++) {
			local114 = arg0.method2142();
			if (local114 < 0 || Static31.aShortArrayArray2[local107].length <= local114) {
				local114 = 0;
			}
			local171[local107] = local114;
		}
		super.anInt3057 = arg0.method2178();
		if (super.anInt3057 == 65535) {
			super.anInt3057 = -1;
		}
		super.anInt3024 = arg0.method2178();
		if (super.anInt3024 == 65535) {
			super.anInt3024 = -1;
		}
		super.anInt3064 = super.anInt3024;
		super.anInt3040 = arg0.method2178();
		if (super.anInt3040 == 65535) {
			super.anInt3040 = -1;
		}
		super.anInt3039 = arg0.method2178();
		if (super.anInt3039 == 65535) {
			super.anInt3039 = -1;
		}
		super.anInt3044 = arg0.method2178();
		if (super.anInt3044 == 65535) {
			super.anInt3044 = -1;
		}
		super.anInt3050 = arg0.method2178();
		if (super.anInt3050 == 65535) {
			super.anInt3050 = -1;
		}
		super.anInt3027 = arg0.method2178();
		if (super.anInt3027 == 65535) {
			super.anInt3027 = -1;
		}
		this.aClass50_493 = Static130.method2183(arg0.method2172()).method1218();
		this.anInt1505 = arg0.method2142();
		if (local64) {
			this.anInt1498 = arg0.method2178();
		} else {
			this.anInt1498 = 0;
		}
		local114 = this.anInt1507;
		this.anInt1507 = arg0.method2142();
		if (this.anInt1507 == 0) {
			Static214.method3348(this);
		} else {
			local147 = this.anInt1503;
			@Pc(341) int local341 = this.anInt1506;
			@Pc(344) int local344 = this.anInt1514;
			this.anInt1503 = arg0.method2178();
			this.anInt1506 = arg0.method2178();
			this.anInt1514 = arg0.method2178();
			if (this.anInt1507 != local114 || local147 != this.anInt1503 || this.anInt1506 != local341 || local344 != this.anInt1514) {
				Static52.method2679(this);
			}
		}
		if (this.aClass25_2 == null) {
			this.aClass25_2 = new Class25();
		}
		this.aClass25_2.method769(local18 == 1, local171, local74, local10);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass25_2 == null) {
			return;
		}
		@Pc(23) Class110 local23 = super.anInt3060 != -1 && super.anInt3014 == 0 ? Static200.method3204(super.anInt3060) : null;
		@Pc(45) Class110 local45 = super.anInt3051 == -1 || this.aBoolean70 || super.anInt3051 == super.anInt3057 && local23 != null ? null : Static200.method3204(super.anInt3051);
		@Pc(56) Class20_Sub5 local56 = this.aClass25_2.method764(super.anInt3038, super.anInt3046, local23, local45);
		if (local56 == null) {
			return;
		}
		super.anInt3053 = local56.method3494();
		if (Static35.aBoolean27 && (this.aClass25_2.anInt1037 == -1 || Static162.method2710(this.aClass25_2.anInt1037).aBoolean180)) {
			@Pc(108) Class20_Sub5 local108 = Static173.method2874(local45 == null ? super.anInt3046 : super.anInt3038, super.anInt3022, super.anInt3011, super.anInt3008, local56, local45 == null ? local23 : local45, 160, 0, arg0, super.aBoolean128, 0, 240, 1);
			local108.method3495(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
		}
		@Pc(176) int local176;
		@Pc(187) int local187;
		@Pc(127) int local127;
		@Pc(241) int local241;
		if (Static230.aClass20_Sub3_Sub1_3 == this) {
			for (local127 = Static229.aClass64Array1.length - 1; local127 >= 0; local127--) {
				@Pc(133) Class64 local133 = Static229.aClass64Array1[local127];
				if (local133 != null && local133.anInt2216 != -1) {
					if (local133.anInt2222 == 1 && local133.anInt2223 >= 0 && Static78.aClass20_Sub3_Sub2Array1.length > local133.anInt2223) {
						@Pc(164) Class20_Sub3_Sub2 local164 = Static78.aClass20_Sub3_Sub2Array1[local133.anInt2223];
						if (local164 != null) {
							local176 = local164.anInt3022 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
							local187 = local164.anInt3008 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
							this.method1091(arg7, arg0, arg3, local133.anInt2216, arg6, local56, arg5, local176, local187, arg4, arg1, arg2);
						}
					}
					if (local133.anInt2222 == 2) {
						local176 = (-Static101.anInt2041 + local133.anInt2214) * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
						local241 = (local133.anInt2224 - Static91.anInt4078) * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
						this.method1091(arg7, arg0, arg3, local133.anInt2216, arg6, local56, arg5, local241, local176, arg4, arg1, arg2);
					}
					if (local133.anInt2222 == 10 && local133.anInt2223 >= 0 && Static232.aClass20_Sub3_Sub1Array1.length > local133.anInt2223) {
						@Pc(277) Class20_Sub3_Sub1 local277 = Static232.aClass20_Sub3_Sub1Array1[local133.anInt2223];
						if (local277 != null) {
							local176 = local277.anInt3022 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
							local187 = local277.anInt3008 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
							this.method1091(arg7, arg0, arg3, local133.anInt2216, arg6, local56, arg5, local176, local187, arg4, arg1, arg2);
						}
					}
				}
			}
		}
		local127 = 0;
		@Pc(324) int local324 = 0;
		local241 = 0;
		if (this.aShort6 != 0 && this.aShort8 != 0) {
			local176 = Class120.anIntArray491[arg0];
			@Pc(342) short local342 = this.aShort6;
			local187 = Class120.anIntArray492[arg0];
			@Pc(349) short local349 = this.aShort8;
			@Pc(354) int local354 = -local349 / 2;
			@Pc(358) int local358 = local342 / 2;
			@Pc(363) int local363 = -local342 / 2;
			@Pc(368) int local368 = -local349 / 2;
			@Pc(378) int local378 = local187 * local363 + local354 * local176 >> 16;
			@Pc(389) int local389 = local354 * local187 - local363 * local176 >> 16;
			@Pc(401) int local401 = Static131.method2213(local389 + super.anInt3008, local378 + super.anInt3022, Static212.anInt4195);
			@Pc(412) int local412 = local368 * local187 - local358 * local176 >> 16;
			@Pc(416) int local416 = local349 / 2;
			@Pc(426) int local426 = local187 * local358 + local368 * local176 >> 16;
			@Pc(431) int local431 = -local342 / 2;
			@Pc(445) int local445 = Static131.method2213(super.anInt3008 + local412, super.anInt3022 - -local426, Static212.anInt4195);
			@Pc(455) int local455 = local176 * local416 + local431 * local187 >> 16;
			@Pc(465) int local465 = local187 * local416 - local176 * local431 >> 16;
			@Pc(478) int local478 = Static131.method2213(super.anInt3008 + local465, local455 + super.anInt3022, Static212.anInt4195);
			@Pc(482) int local482 = local342 / 2;
			@Pc(486) int local486 = local349 / 2;
			@Pc(496) int local496 = local187 * local482 + local176 * local486 >> 16;
			@Pc(507) int local507 = local401 >= local445 ? local445 : local401;
			@Pc(518) int local518 = local187 * local486 - local482 * local176 >> 16;
			@Pc(530) int local530 = Static131.method2213(super.anInt3008 + local518, local496 + super.anInt3022, Static212.anInt4195);
			@Pc(537) int local537 = local401 >= local478 ? local478 : local401;
			local241 = local530 + local401;
			@Pc(552) int local552 = local530 <= local445 ? local530 : local445;
			@Pc(563) int local563 = local530 <= local478 ? local530 : local478;
			if (local445 + local478 < local241) {
				local241 = local445 + local478;
			}
			local127 = (int) (Math.atan2((double) (local507 - local563), (double) local349) * 325.95D) & 0x7FF;
			if (local127 != 0) {
				local56.method1696(local127);
			}
			local324 = (int) (Math.atan2((double) (local537 - local552), (double) local342) * 325.95D) & 0x7FF;
			if (local324 != 0) {
				local56.method1693(local324);
			}
			local241 = (local241 >> 1) - super.anInt3011;
			if (local241 != 0) {
				local56.method1698(0, local241, 0);
			}
		}
		@Pc(629) Class20_Sub5 local629 = null;
		if (!this.aBoolean70 && super.anInt3058 != -1 && super.anInt3019 != -1) {
			@Pc(646) Class46 local646 = Static216.method3377(super.anInt3058);
			local629 = local646.method1128(super.anInt3019);
			if (local629 != null) {
				local629.method1698(0, -super.anInt3037, 0);
				if (local646.aBoolean73) {
					if (local127 != 0) {
						local629.method1696(local127);
					}
					if (local324 != 0) {
						local629.method1693(local324);
					}
					if (local241 != 0) {
						local629.method1698(0, local241, 0);
					}
				}
			}
		}
		@Pc(683) Class20_Sub5 local683 = null;
		if (!this.aBoolean70 && this.aClass20_Sub5_1 != null) {
			if (this.anInt1499 <= Static107.anInt2132) {
				this.aClass20_Sub5_1 = null;
			}
			if (this.anInt1516 <= Static107.anInt2132 && Static107.anInt2132 < this.anInt1499) {
				local683 = this.aClass20_Sub5_1;
				local683.method1698(this.anInt1522 - super.anInt3022, -super.anInt3011 + this.anInt1510, this.anInt1497 - super.anInt3008);
				if (super.anInt3042 == 512) {
					local683.method1706();
				} else if (super.anInt3042 == 1024) {
					local683.method1692();
				} else if (super.anInt3042 == 1536) {
					local683.method1709();
				}
			}
		}
		if (local629 != null) {
			local56 = ((Class20_Sub5_Sub1) local56).method1717(local629);
		}
		if (local683 != null) {
			local56 = ((Class20_Sub5_Sub1) local56).method1717(local683);
		}
		local56.aBoolean95 = true;
		local56.method3495(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local683 == null) {
			return;
		}
		if (super.anInt3042 == 512) {
			local683.method1709();
		} else if (super.anInt3042 == 1024) {
			local683.method1692();
		} else if (super.anInt3042 == 1536) {
			local683.method1706();
		}
		local683.method1698(super.anInt3022 - this.anInt1522, super.anInt3011 + -this.anInt1510, super.anInt3008 - this.anInt1497);
	}
}
