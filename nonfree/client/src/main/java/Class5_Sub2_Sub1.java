import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ca", name = "Hb", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!ca", name = "Jb", descriptor = "Lclient!dj;")
	public Class24 aClass24_173;

	@OriginalMember(owner = "client!ca", name = "Kb", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!ca", name = "Mb", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!ca", name = "Nb", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!ca", name = "Qb", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!ca", name = "Sb", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!ca", name = "Vb", descriptor = "Lclient!db;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!ca", name = "cc", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!ca", name = "dc", descriptor = "Lclient!lg;")
	public Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!ca", name = "Ob", descriptor = "S")
	private short aShort10 = 0;

	@OriginalMember(owner = "client!ca", name = "Eb", descriptor = "S")
	private short aShort9 = 0;

	@OriginalMember(owner = "client!ca", name = "Ub", descriptor = "I")
	public int anInt620 = 0;

	@OriginalMember(owner = "client!ca", name = "ec", descriptor = "I")
	public int anInt626 = -1;

	@OriginalMember(owner = "client!ca", name = "ac", descriptor = "I")
	public int anInt623 = 0;

	@OriginalMember(owner = "client!ca", name = "Yb", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ca", name = "Wb", descriptor = "I")
	public int anInt621 = 0;

	@OriginalMember(owner = "client!ca", name = "gc", descriptor = "I")
	public int anInt628 = 0;

	@OriginalMember(owner = "client!ca", name = "Rb", descriptor = "I")
	public int anInt617 = 0;

	@OriginalMember(owner = "client!ca", name = "ic", descriptor = "I")
	public int anInt630 = -1;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1894() {
		return this.aClass21_1 != null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!fj;)V")
	public void method476(@OriginalArg(1) Class1_Sub7 arg0) {
		arg0.anInt3592 = 0;
		@Pc(12) int local12 = arg0.method2771();
		@Pc(23) boolean local23 = (local12 & 0x4) != 0;
		@Pc(27) int local27 = local12 & 0x1;
		@Pc(29) int local29 = -1;
		if ((local12 & 0x2) == 2) {
			this.aShort9 = (short) (arg0.method2771() << 2);
			this.aShort10 = (short) (arg0.method2771() << 2);
		} else {
			this.aShort10 = 0;
			this.aShort9 = 0;
		}
		super.anInt2480 = (local12 >> 3) + 1;
		this.anInt626 = arg0.method2770();
		this.anInt630 = arg0.method2770();
		this.anInt617 = 0;
		@Pc(81) int[] local81 = new int[12];
		@Pc(112) int local112;
		@Pc(118) int local118;
		for (@Pc(91) int local91 = 0; local91 < 12; local91++) {
			@Pc(97) int local97 = arg0.method2771();
			if (local97 == 0) {
				local81[local91] = 0;
			} else {
				local112 = arg0.method2771();
				local118 = local112 + (local97 << 8);
				if (local91 == 0 && local118 == 65535) {
					local29 = arg0.method2765();
					break;
				}
				if (local118 >= 32768) {
					local118 = Static210.anIntArray411[local118 - 32768];
					local81[local91] = local118 | 0x40000000;
					@Pc(154) int local154 = Static168.method2886(local118).anInt4200;
					if (local154 != 0) {
						this.anInt617 = local154;
					}
				} else {
					local81[local91] = Integer.MIN_VALUE | local118 - 256;
				}
			}
		}
		@Pc(176) int[] local176 = new int[5];
		for (local112 = 0; local112 < 5; local112++) {
			local118 = arg0.method2771();
			if (local118 < 0 || local118 >= Static142.aShortArrayArray28[local112].length) {
				local118 = 0;
			}
			local176[local112] = local118;
		}
		super.anInt2449 = arg0.method2765();
		if (super.anInt2449 == 65535) {
			super.anInt2449 = -1;
		}
		super.anInt2499 = arg0.method2765();
		if (super.anInt2499 == 65535) {
			super.anInt2499 = -1;
		}
		super.anInt2497 = super.anInt2499;
		super.anInt2450 = arg0.method2765();
		if (super.anInt2450 == 65535) {
			super.anInt2450 = -1;
		}
		super.anInt2484 = arg0.method2765();
		if (super.anInt2484 == 65535) {
			super.anInt2484 = -1;
		}
		super.anInt2494 = arg0.method2765();
		if (super.anInt2494 == 65535) {
			super.anInt2494 = -1;
		}
		super.anInt2492 = arg0.method2765();
		if (super.anInt2492 == 65535) {
			super.anInt2492 = -1;
		}
		super.anInt2498 = arg0.method2765();
		if (super.anInt2498 == 65535) {
			super.anInt2498 = -1;
		}
		this.aClass24_173 = Static35.method3219(arg0.method2756()).method761();
		this.anInt620 = arg0.method2771();
		if (local23) {
			this.anInt623 = arg0.method2765();
		} else {
			this.anInt623 = 0;
		}
		if (this.aClass21_1 == null) {
			this.aClass21_1 = new Class21();
		}
		this.aClass21_1.method631(local81, local176, local27 == 1, local29);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass21_1 == null) {
			return;
		}
		@Pc(26) Class1_Sub2_Sub22 local26 = super.anInt2485 != -1 && super.anInt2472 == 0 ? Static85.method2622(super.anInt2485) : null;
		@Pc(47) Class1_Sub2_Sub22 local47 = super.anInt2504 == -1 || this.aBoolean25 || super.anInt2504 == super.anInt2449 && local26 != null ? null : Static85.method2622(super.anInt2504);
		@Pc(58) Class5_Sub1 local58 = this.aClass21_1.method633(super.anInt2493, local47, super.anInt2490, local26);
		if (local58 == null) {
			return;
		}
		super.anInt2503 = local58.method3163();
		@Pc(73) int local73;
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(170) int local170;
		if (Static87.aClass5_Sub2_Sub1_1 == this) {
			for (local73 = Static56.aClass48Array1.length - 1; local73 >= 0; local73--) {
				@Pc(79) Class48 local79 = Static56.aClass48Array1[local73];
				if (local79 != null && local79.anInt2064 != -1) {
					if (local79.anInt2070 == 1 && local79.anInt2072 >= 0 && local79.anInt2072 < Static148.aClass5_Sub2_Sub2Array1.length) {
						@Pc(108) Class5_Sub2_Sub2 local108 = Static148.aClass5_Sub2_Sub2Array1[local79.anInt2072];
						if (local108 != null) {
							local121 = local108.anInt2501 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
							local132 = local108.anInt2448 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
							this.method481(arg1, local58, local121, arg3, arg5, arg6, arg7, arg2, local79.anInt2064, arg0, local132, arg4);
						}
					}
					if (local79.anInt2070 == 2) {
						local170 = (local79.anInt2073 + -Static196.anInt4343) * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
						local121 = (-Static127.anInt2789 + local79.anInt2065) * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
						this.method481(arg1, local58, local170, arg3, arg5, arg6, arg7, arg2, local79.anInt2064, arg0, local121, arg4);
					}
					if (local79.anInt2070 == 10 && local79.anInt2072 >= 0 && local79.anInt2072 < Static110.aClass5_Sub2_Sub1Array1.length) {
						@Pc(228) Class5_Sub2_Sub1 local228 = Static110.aClass5_Sub2_Sub1Array1[local79.anInt2072];
						if (local228 != null) {
							local121 = local228.anInt2501 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
							local132 = local228.anInt2448 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
							this.method481(arg1, local58, local121, arg3, arg5, arg6, arg7, arg2, local79.anInt2064, arg0, local132, arg4);
						}
					}
				}
			}
		}
		local73 = 0;
		@Pc(275) int local275 = 0;
		local170 = 0;
		if (this.aShort9 != 0 && this.aShort10 != 0) {
			local121 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg0];
			local132 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg0];
			@Pc(297) short local297 = this.aShort10;
			@Pc(300) short local300 = this.aShort9;
			@Pc(305) int local305 = -local300 / 2;
			@Pc(310) int local310 = -local297 / 2;
			@Pc(321) int local321 = local121 * local310 + local305 * local132 >> 16;
			@Pc(332) int local332 = local310 * local132 - local305 * local121 >> 16;
			@Pc(345) int local345 = Static37.method699(super.anInt2448 + local332, Static170.anInt3799, local321 + super.anInt2501);
			@Pc(349) int local349 = local300 / 2;
			@Pc(354) int local354 = -local297 / 2;
			@Pc(364) int local364 = local354 * local121 + local132 * local349 >> 16;
			@Pc(375) int local375 = local132 * local354 - local349 * local121 >> 16;
			@Pc(387) int local387 = Static37.method699(local375 + super.anInt2448, Static170.anInt3799, super.anInt2501 + local364);
			@Pc(392) int local392 = -local300 / 2;
			@Pc(396) int local396 = local297 / 2;
			@Pc(406) int local406 = local132 * local392 + local121 * local396 >> 16;
			@Pc(410) int local410 = local300 / 2;
			@Pc(414) int local414 = local297 / 2;
			@Pc(425) int local425 = local132 * local396 - local121 * local392 >> 16;
			@Pc(436) int local436 = local132 * local414 - local121 * local410 >> 16;
			@Pc(449) int local449 = Static37.method699(super.anInt2448 + local425, Static170.anInt3799, super.anInt2501 + local406);
			@Pc(459) int local459 = local132 * local410 + local121 * local414 >> 16;
			@Pc(472) int local472 = Static37.method699(super.anInt2448 + local436, Static170.anInt3799, super.anInt2501 + local459);
			local170 = local345 + local472;
			if (local387 + local449 < local170) {
				local170 = local449 + local387;
			}
			@Pc(498) int local498 = local387 <= local345 ? local387 : local345;
			@Pc(509) int local509 = local449 < local472 ? local449 : local472;
			local73 = (int) (Math.atan2((double) (local498 - local509), (double) local297) * 325.95D) & 0x7FF;
			if (local73 != 0) {
				local58.method156(local73);
			}
			@Pc(538) int local538 = local472 > local387 ? local387 : local472;
			@Pc(545) int local545 = local449 <= local345 ? local449 : local345;
			local275 = (int) (Math.atan2((double) (local545 - local538), (double) local300) * 325.95D) & 0x7FF;
			if (local275 != 0) {
				local58.method165(local275);
			}
			local170 = (local170 >> 1) - super.anInt2459;
			if (local170 != 0) {
				local58.method160(0, local170, 0);
			}
		}
		@Pc(581) Class5_Sub1 local581 = null;
		if (!this.aBoolean25 && super.anInt2458 != -1 && super.anInt2471 != -1) {
			@Pc(598) Class1_Sub2_Sub3 local598 = Static72.method1365(super.anInt2458);
			local581 = local598.method299(super.anInt2471);
			if (local581 != null) {
				local581.method160(0, -super.anInt2461, 0);
				if (local598.aBoolean13) {
					if (local73 != 0) {
						local581.method156(local73);
					}
					if (local275 != 0) {
						local581.method165(local275);
					}
					if (local170 != 0) {
						local581.method160(0, local170, 0);
					}
				}
			}
		}
		@Pc(638) Class5_Sub1 local638 = null;
		if (!this.aBoolean25 && this.aClass5_Sub1_1 != null) {
			if (Static42.anInt1100 >= this.anInt628) {
				this.aClass5_Sub1_1 = null;
			}
			if (this.anInt621 <= Static42.anInt1100 && Static42.anInt1100 < this.anInt628) {
				local638 = this.aClass5_Sub1_1;
				local638.method160(this.anInt614 - super.anInt2501, -super.anInt2459 + this.anInt609, this.anInt611 - super.anInt2448);
				if (super.anInt2463 == 512) {
					local638.method159();
				} else if (super.anInt2463 == 1024) {
					local638.method157();
				} else if (super.anInt2463 == 1536) {
					local638.method168();
				}
			}
		}
		if (local581 != null) {
			local58 = ((Class5_Sub1_Sub1) local58).method178(local581);
		}
		if (local638 != null) {
			local58 = ((Class5_Sub1_Sub1) local58).method178(local638);
		}
		local58.aBoolean6 = true;
		local58.method3164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local638 == null) {
			return;
		}
		if (super.anInt2463 == 512) {
			local638.method168();
		} else if (super.anInt2463 == 1024) {
			local638.method157();
		} else if (super.anInt2463 == 1536) {
			local638.method159();
		}
		local638.method160(super.anInt2501 - this.anInt614, -this.anInt609 + super.anInt2459, super.anInt2448 - this.anInt611);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
	@Override
	public int method3163() {
		return super.anInt2503;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!lg;IIIIIIIIBII)V")
	private void method481(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg10 * arg10 + arg2 * arg2 > 360000) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg2, (double) arg10) * 325.949D) & 0x7FF;
		@Pc(50) Class5_Sub1 local50 = Static133.method2284(arg1, super.anInt2459, super.anInt2448, super.anInt2501, arg8, local38);
		if (local50 != null) {
			local50.method3164(0, arg0, arg7, arg3, arg11, arg4, arg5, arg6, -1L);
		}
	}
}
