import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class20_Sub2_Sub2_Sub1_Sub1 extends Class20_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!bs", name = "fd", descriptor = "Lclient!ah;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!bs", name = "xd", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!bs", name = "zd", descriptor = "I")
	public int anInt1204;

	@OriginalMember(owner = "client!bs", name = "Dd", descriptor = "I")
	public int anInt1207;

	@OriginalMember(owner = "client!bs", name = "Gd", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!bs", name = "Nd", descriptor = "I")
	private int anInt1214;

	@OriginalMember(owner = "client!bs", name = "md", descriptor = "I")
	public int anInt1194 = 0;

	@OriginalMember(owner = "client!bs", name = "qd", descriptor = "I")
	public int anInt1197 = 255;

	@OriginalMember(owner = "client!bs", name = "hd", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!bs", name = "dd", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!bs", name = "Ed", descriptor = "B")
	private byte aByte34 = 0;

	@OriginalMember(owner = "client!bs", name = "td", descriptor = "I")
	public int anInt1200 = 0;

	@OriginalMember(owner = "client!bs", name = "Hd", descriptor = "I")
	public int anInt1209 = -1;

	@OriginalMember(owner = "client!bs", name = "Cd", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!bs", name = "vd", descriptor = "I")
	public int anInt1202 = -1;

	@OriginalMember(owner = "client!bs", name = "Id", descriptor = "I")
	public int anInt1210 = 0;

	@OriginalMember(owner = "client!bs", name = "Qd", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!bs", name = "pd", descriptor = "B")
	private byte aByte33 = 0;

	@OriginalMember(owner = "client!bs", name = "Td", descriptor = "I")
	public int anInt1219 = -1;

	@OriginalMember(owner = "client!bs", name = "bd", descriptor = "B")
	private byte aByte32 = 0;

	@OriginalMember(owner = "client!bs", name = "Ud", descriptor = "I")
	public int anInt1220 = -1;

	@OriginalMember(owner = "client!bs", name = "Rd", descriptor = "I")
	public int anInt1217 = -1;

	@OriginalMember(owner = "client!bs", name = "Md", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!bs", name = "Sd", descriptor = "I")
	public int anInt1218 = 0;

	@OriginalMember(owner = "client!bs", name = "ld", descriptor = "I")
	public int anInt1193 = -1;

	@OriginalMember(owner = "client!bs", name = "Vd", descriptor = "I")
	public int anInt1221 = -1;

	@OriginalMember(owner = "client!bs", name = "Xd", descriptor = "I")
	public int anInt1223 = -1;

	@OriginalMember(owner = "client!bs", name = "Ld", descriptor = "I")
	public int anInt1213 = 0;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
		if (this.aClass12_1 == null || !super.aBoolean379 && !this.method1027(arg0, 0)) {
			return;
		}
		@Pc(24) Class154 local24 = arg0.method8785();
		local24.method6571(super.aClass278_7.method7147());
		local24.method6570(super.anInt10725, super.anInt10724 - 5, super.anInt10729);
		this.method4916(super.aClass24Array3, arg0, local24, super.aBoolean379);
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BIII)V")
	public void method1021(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt5549 != -1 && Static294.aClass373_2.method8738(super.anInt5549).anInt361 == 1) {
			super.anInt5549 = -1;
			super.anIntArray327 = null;
		}
		@Pc(34) Class93 local34;
		if (super.anInt5519 != -1) {
			local34 = Static436.aClass292_2.method7401(super.anInt5519);
			if (local34.aBoolean189 && local34.anInt2750 != -1 && Static294.aClass373_2.method8738(local34.anInt2750).anInt361 == 1) {
				super.anInt5519 = -1;
			}
		}
		if (super.anInt5558 != -1) {
			local34 = Static436.aClass292_2.method7401(super.anInt5558);
			if (local34.aBoolean189 && local34.anInt2750 != -1 && Static294.aClass373_2.method8738(local34.anInt2750).anInt361 == 1) {
				super.anInt5558 = -1;
			}
		}
		this.anInt1219 = -1;
		if (arg1 < 0 || arg1 >= Static442.anInt7975 || arg2 < 0 || Static284.anInt7916 <= arg2) {
			this.method1024(arg2, arg1);
		} else if (super.anIntArray335[0] >= 0 && super.anIntArray335[0] < Static442.anInt7975 && super.anIntArray336[0] >= 0 && super.anIntArray336[0] < Static284.anInt7916) {
			if (arg0 == 2) {
				Static439.method5792(arg1, arg2, this);
			}
			this.method1031(arg0, arg1, arg2);
		} else {
			this.method1024(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!ka;IIIILclient!ha;Lclient!ql;)V")
	private void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) Class154 arg6) {
		@Pc(11) int local11 = arg2 * arg2 + arg4 * arg4;
		if (local11 < 262144 || arg0 < local11) {
			return;
		}
		@Pc(45) int local45 = (int) (Math.atan2((double) arg2, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(57) Class24 local57 = Static238.method4144(super.anInt5535, local45, super.anInt5492, super.anInt5517, arg5, arg3);
		if (local57 != null) {
			arg5.C(false);
			local57.method6862(arg6, (Class20_Sub4) null, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIILclient!ql;ILclient!ha;IILclient!ka;)V")
	private void method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class154 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class100 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class24 arg7) {
		@Pc(11) int local11 = arg1 * arg1 + arg0 * arg0;
		if (local11 < 262144 || arg6 < local11) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(47) Class24 local47 = Static238.method4144(super.anInt5535, local35, super.anInt5492, super.anInt5517, arg5, arg4);
		if (local47 != null) {
			arg5.C(false);
			local47.method6845(arg3, (Class20_Sub4) null, arg2, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIB)V")
	public void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt5575 = 0;
		super.anIntArray335[0] = arg1;
		super.anInt5576 = 0;
		super.anInt5574 = 0;
		super.anIntArray336[0] = arg0;
		@Pc(33) int local33 = this.method4913();
		super.anInt10729 = local33 * 256 + super.anIntArray336[0] * 512;
		super.anInt10725 = super.anIntArray335[0] * 512 + local33 * 256;
		if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == this) {
			Static245.method5548();
		}
		if (super.aClass20_Sub8_4 != null) {
			super.aClass20_Sub8_4.method6630();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass12_1 == null || !this.method1027(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class154 local19 = arg1.method8785();
		@Pc(24) int local24 = super.aClass278_7.method7147();
		local19.method6571(local24);
		local19.method6570(super.anInt10725, super.anInt10724, super.anInt10729);
		@Pc(37) boolean local37 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass24Array3.length; local45++) {
			if (super.aClass24Array3[local45] != null && (Static591.aBoolean675 ? super.aClass24Array3[local45].method6867(arg0, arg2, local19, true, 0, Static419.anInt7660) : super.aClass24Array3[local45].method6855(arg0, arg2, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method1025() {
		return this.aString12;
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(BZ)Ljava/lang/String;")
	public String method1026() {
		@Pc(13) String local13 = "";
		if (Static563.aStringArray69 != null) {
			local13 = local13 + Static563.aStringArray69[this.aByte32];
		}
		@Pc(35) int[] local35;
		if (this.aByte33 == 1 && Static282.anIntArray339 != null) {
			local35 = Static282.anIntArray339;
		} else {
			local35 = Static17.anIntArray9;
		}
		if (local35 != null && local35[this.aByte32] != -1) {
			@Pc(56) Class281 local56 = Static443.aClass59_1.method1520(local35[this.aByte32]);
			if (local56.aChar5 == 's') {
				local13 = local13 + local56.method7164(this.aByte34 & 0xFF);
			} else {
				Static619.method8645(new Throwable(), "gdn1");
				local35[this.aByte32] = -1;
			}
		}
		local13 = local13 + this.aString13;
		if (Static442.aStringArray55 != null) {
			local13 = local13 + Static442.aStringArray55[this.aByte32];
		}
		return local13;
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZLclient!ha;I)Z")
	private boolean method1027(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class201 local11 = this.method4911();
		@Pc(29) Class21 local29 = super.anInt5549 != -1 && super.anInt5516 == 0 ? Static294.aClass373_2.method8738(super.anInt5549) : null;
		@Pc(49) Class21 local49 = super.anInt5571 == -1 || this.aBoolean75 || super.aBoolean375 && local29 != null ? null : Static294.aClass373_2.method8738(super.anInt5571);
		@Pc(52) int local52 = local11.anInt6348;
		@Pc(55) int local55 = local11.anInt6341;
		if (local52 != 0 || local55 != 0 || local11.anInt6309 != 0 || local11.anInt6343 != 0) {
			arg1 |= 0x7;
		}
		@Pc(77) int local77 = super.aClass278_7.method7147();
		@Pc(96) boolean local96 = super.aByte67 != 0 && Static113.anInt2243 >= super.anInt5536 && super.anInt5528 > Static113.anInt2243;
		if (local96) {
			arg1 |= 0x80000;
		}
		@Pc(140) Class24 local140 = super.aClass24Array3[0] = this.aClass12_1.method273(local49, super.aClass113Array3, arg0, Static195.aClass58_1, super.anInt5533, super.anInt5503, Static294.aClass373_2, super.anInt5502, Static511.aClass34_1, super.anInt5499, super.anInt5532, local77, Static266.aClass138_1, local29, super.anIntArray328, Static563.aClass346_2, arg1, super.anInt5546, Static279.aClass294_1);
		@Pc(143) int local143 = Static591.method8329();
		if (Static396.anInt7427 < 96 && local143 > 50) {
			Static298.method5520();
		}
		if (Static212.aClass35_2 != Static418.aClass35_3 && local143 < 50) {
			@Pc(164) int local164 = 50 - local143;
			while (local164 > Static629.anInt10322) {
				Static619.aByteArrayArray169[Static629.anInt10322] = new byte[102400];
				Static629.anInt10322++;
			}
			while (Static629.anInt10322 > local164) {
				Static629.anInt10322--;
				Static619.aByteArrayArray169[Static629.anInt10322] = null;
			}
		} else if (Static418.aClass35_3 != Static212.aClass35_2) {
			Static629.anInt10322 = 0;
			Static619.aByteArrayArray169 = new byte[50][];
		}
		if (local140 == null) {
			return false;
		}
		super.anInt5523 = local140.fa();
		super.anInt5573 = local140.ma();
		this.method4903(local140);
		if (local52 == 0 && local55 == 0) {
			this.method4915(0, this.method4913() << 9, 0, local77, this.method4913() << 9);
		} else {
			this.method4915(local11.anInt6310, local55, local11.anInt6326, local77, local52);
			if (super.anInt5517 != 0) {
				local140.FA(super.anInt5517);
			}
			if (super.anInt5535 != 0) {
				local140.VA(super.anInt5535);
			}
			if (super.anInt5492 != 0) {
				local140.H(0, super.anInt5492, 0);
			}
		}
		if (local96) {
			local140.method6849(super.aByte64, super.aByte65, super.aByte66, super.aByte67 & 0xFF);
		}
		@Pc(339) boolean local339;
		@Pc(341) int local341;
		@Pc(394) Class24 local394;
		@Pc(424) int local424;
		@Pc(426) int local426;
		@Pc(428) int local428;
		@Pc(518) int local518;
		@Pc(546) int local546;
		@Pc(558) int local558;
		@Pc(562) int local562;
		@Pc(573) int local573;
		@Pc(325) Class93 local325;
		if (this.aBoolean75 || super.anInt5519 == -1 || super.lb == -1) {
			super.aClass24Array3[1] = null;
		} else {
			local325 = Static436.aClass292_2.method7401(super.anInt5519);
			local339 = local325.aByte51 == 3 && (local52 != 0 || local55 != 0);
			local341 = local7;
			if (local339) {
				local341 = local7 | 0x7;
			} else {
				if (super.anInt5491 != 0) {
					local341 = local7 | 0x5;
				}
				if (super.anInt5527 != 0) {
					local341 |= 0x2;
				}
				if (super.anInt5505 >= 0) {
					local341 |= 0x7;
				}
			}
			local394 = super.aClass24Array3[1] = local325.method2366(super.anInt5509, super.anInt5515, arg0, local341, Static294.aClass373_2, super.lb);
			if (local394 != null) {
				if (super.anInt5505 >= 0 && local11.anIntArrayArray25 != null && local11.anIntArrayArray25[super.anInt5505] != null) {
					local424 = 0;
					local426 = 0;
					local428 = 0;
					if (local11.anIntArrayArray25 != null && local11.anIntArrayArray25[super.anInt5505] != null) {
						local426 = local11.anIntArrayArray25[super.anInt5505][1];
						local428 = local11.anIntArrayArray25[super.anInt5505][2];
						local424 = local11.anIntArrayArray25[super.anInt5505][0];
					}
					if (local11.anIntArrayArray26 != null && local11.anIntArrayArray26[super.anInt5505] != null) {
						local426 += local11.anIntArrayArray26[super.anInt5505][1];
						local428 += local11.anIntArrayArray26[super.anInt5505][2];
						local424 += local11.anIntArrayArray26[super.anInt5505][0];
					}
					if (local428 != 0 || local424 != 0) {
						local518 = local77;
						if (super.anIntArray328 != null && super.anIntArray328[super.anInt5505] != -1) {
							local518 = super.anIntArray328[super.anInt5505];
						}
						local546 = local518 + super.anInt5491 * 2048 - local77 & 0x3FFF;
						if (local546 != 0) {
							local394.a(local546);
						}
						local558 = Class100_Sub1.anIntArray428[local546];
						local562 = Class100_Sub1.anIntArray429[local546];
						local573 = local428 * local558 + local424 * local562 >> 14;
						local428 = local428 * local562 - local424 * local558 >> 14;
						local424 = local573;
					}
					local394.H(local424, local426, local428);
				} else if (super.anInt5491 != 0) {
					local394.a(super.anInt5491 * 2048);
				}
				if (super.anInt5527 != 0) {
					local394.H(0, -super.anInt5527 << 2, 0);
				}
				if (local339) {
					if (super.anInt5517 != 0) {
						local394.FA(super.anInt5517);
					}
					if (super.anInt5535 != 0) {
						local394.VA(super.anInt5535);
					}
					if (super.anInt5492 != 0) {
						local394.H(0, super.anInt5492, 0);
					}
				}
			}
		}
		if (this.aBoolean75 || super.anInt5558 == -1 || super.anInt5543 == -1) {
			super.aClass24Array3[2] = null;
		} else {
			local325 = Static436.aClass292_2.method7401(super.anInt5558);
			local339 = local325.aByte51 == 3 && (local52 != 0 || local55 != 0);
			local341 = local7;
			if (local339) {
				local341 = local7 | 0x7;
			} else {
				if (super.anInt5570 != 0) {
					local341 = local7 | 0x5;
				}
				if (super.anInt5568 != 0) {
					local341 |= 0x2;
				}
				if (super.anInt5495 >= 0) {
					local341 |= 0x7;
				}
			}
			local394 = super.aClass24Array3[2] = local325.method2365(arg0, Static294.aClass373_2, super.anInt5540, super.anInt5494, super.anInt5543, local341);
			if (local394 != null) {
				if (super.anInt5495 >= 0 && local11.anIntArrayArray25 != null && local11.anIntArrayArray25[super.anInt5495] != null) {
					local424 = 0;
					local426 = 0;
					local428 = 0;
					if (local11.anIntArrayArray25 != null && local11.anIntArrayArray25[super.anInt5495] != null) {
						local426 = local11.anIntArrayArray25[super.anInt5495][1];
						local424 = local11.anIntArrayArray25[super.anInt5495][0];
						local428 = local11.anIntArrayArray25[super.anInt5495][2];
					}
					if (local11.anIntArrayArray26 != null && local11.anIntArrayArray26[super.anInt5495] != null) {
						local426 += local11.anIntArrayArray26[super.anInt5495][1];
						local428 += local11.anIntArrayArray26[super.anInt5495][2];
						local424 += local11.anIntArrayArray26[super.anInt5495][0];
					}
					if (local428 != 0 || local424 != 0) {
						local518 = local77;
						if (super.anIntArray328 != null && super.anIntArray328[super.anInt5495] != -1) {
							local518 = super.anIntArray328[super.anInt5495];
						}
						local546 = local518 + super.anInt5570 * 2048 - local77 & 0x3FFF;
						if (local546 != 0) {
							local394.a(local546);
						}
						local558 = Class100_Sub1.anIntArray428[local546];
						local562 = Class100_Sub1.anIntArray429[local546];
						local573 = local558 * local428 + local562 * local424 >> 14;
						local428 = local428 * local562 - local558 * local424 >> 14;
						local424 = local573;
					}
					local394.H(local424, local426, local428);
				} else if (super.anInt5570 != 0) {
					local394.a(super.anInt5570 * 2048);
				}
				if (super.anInt5568 != 0) {
					local394.H(0, -super.anInt5568 << 2, 0);
				}
				if (local339) {
					if (super.anInt5517 != 0) {
						local394.FA(super.anInt5517);
					}
					if (super.anInt5535 != 0) {
						local394.VA(super.anInt5535);
					}
					if (super.anInt5492 != 0) {
						local394.H(0, super.anInt5492, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)I")
	@Override
	protected int method4910() {
		return this.anInt1214;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!rg;)V")
	public void method1028(@OriginalArg(1) Class6_Sub40 arg0) {
		arg0.anInt10169 = 0;
		@Pc(12) int local12 = arg0.method8604();
		this.aByte33 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean73;
		this.aBoolean73 = (local12 & 0x2) != 0;
		@Pc(45) boolean local45 = (local12 & 0x4) != 0;
		@Pc(49) int local49 = super.method4913();
		this.method4908((local12 >> 3 & 0x7) + 1);
		this.aByte32 = (byte) (local12 >> 6 & 0x3);
		super.anInt10725 += this.method4913() - local49 << 8;
		super.anInt10729 += this.method4913() - local49 << 8;
		this.aByte34 = arg0.method8602();
		this.anInt1221 = arg0.method8602();
		this.anInt1223 = arg0.method8602();
		this.aBoolean77 = arg0.method8602() == 1;
		if (Static212.aClass35_2 == Static418.aClass35_3 && Static578.anInt6641 >= 2) {
			this.aBoolean77 = false;
		}
		this.anInt1218 = 0;
		@Pc(134) int local134 = -1;
		@Pc(137) int[] local137 = new int[12];
		@Pc(157) int local157;
		@Pc(164) int local164;
		@Pc(208) int local208;
		for (@Pc(139) int local139 = 0; local139 < 12; local139++) {
			@Pc(145) int local145 = arg0.method8604();
			if (local145 == 0) {
				local137[local139] = 0;
			} else {
				local157 = arg0.method8604();
				local164 = (local145 << 8) + local157;
				if (local139 == 0 && local164 == 65535) {
					local134 = arg0.method8571();
					this.anInt1218 = arg0.method8604();
					break;
				}
				if (local164 >= 32768) {
					local164 = Static583.anIntArray596[local164 - 32768];
					local137[local139] = local164 | 0x40000000;
					local208 = Static266.aClass138_1.method3730(local164).anInt9765;
					if (local208 != 0) {
						this.anInt1218 = local208;
					}
				} else {
					local137[local139] = Integer.MIN_VALUE | local164 - 256;
				}
			}
		}
		@Pc(233) int[] local233 = new int[5];
		for (local157 = 0; local157 < 5; local157++) {
			local164 = arg0.method8604();
			if (Static47.aShortArrayArrayArray1.length < 1 || local164 < 0 || Static47.aShortArrayArrayArray1[0][local157].length <= local164) {
				local164 = 0;
			}
			local233[local157] = local164;
		}
		this.anInt1214 = arg0.method8571();
		this.aString13 = arg0.method8611();
		this.aString12 = this.aString13;
		if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == this) {
			Static142.aString29 = this.aString13;
		}
		this.anInt1210 = arg0.method8604();
		if (local45) {
			this.anInt1200 = arg0.method8571();
			if (this.anInt1200 == 65535) {
				this.anInt1200 = -1;
			}
			this.anInt1194 = this.anInt1210;
			this.anInt1220 = -1;
		} else {
			this.anInt1200 = 0;
			this.anInt1194 = arg0.method8604();
			this.anInt1220 = arg0.method8604();
			if (this.anInt1220 == 255) {
				this.anInt1220 = -1;
			}
		}
		local164 = this.anInt1213;
		this.anInt1213 = arg0.method8604();
		@Pc(365) int local365;
		if (this.anInt1213 == 0) {
			Static539.method7915(this);
		} else {
			local208 = this.anInt1217;
			@Pc(362) int local362 = this.anInt1209;
			local365 = this.anInt1202;
			@Pc(368) int local368 = this.anInt1193;
			@Pc(371) int local371 = this.anInt1197;
			this.anInt1217 = arg0.method8571();
			this.anInt1209 = arg0.method8571();
			this.anInt1202 = arg0.method8571();
			this.anInt1193 = arg0.method8571();
			this.anInt1197 = arg0.method8604();
			if (local21 != this.aBoolean73 || local164 != this.anInt1213 || local208 != this.anInt1217 || local362 != this.anInt1209 || this.anInt1202 != local365 || local368 != this.anInt1193 || local371 != this.anInt1197) {
				Static6.method107(this);
			}
		}
		if (this.aClass12_1 == null) {
			this.aClass12_1 = new Class12();
		}
		local208 = this.aClass12_1.anInt259;
		@Pc(456) int[] local456 = this.aClass12_1.anIntArray7;
		this.aClass12_1.method276(this.method4910(), local134, local137, this.aByte33 == 1, local233);
		if (local134 != local208) {
			super.anInt10725 = (super.anIntArray335[0] << 9) + (this.method4913() << 8);
			super.anInt10729 = (super.anIntArray336[0] << 9) + (this.method4913() << 8);
		}
		if (Static229.anInt4561 == super.anInt5567 && local456 != null) {
			for (local365 = 0; local365 < local233.length; local365++) {
				if (local233[local365] != local456[local365]) {
					Static266.aClass138_1.method3731();
					break;
				}
			}
		}
		if (super.aClass20_Sub8_4 != null) {
			super.aClass20_Sub8_4.method6630();
		}
		if (super.anInt5571 == -1 || !super.aBoolean375) {
			return;
		}
		@Pc(553) Class201 local553 = this.method4911();
		if (!local553.method5478(super.anInt5571)) {
			super.aBoolean375 = false;
			super.anInt5571 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)Z")
	public boolean method1029() {
		return this.aClass12_1 != null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BIIB)V")
	public void method1031(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt5574 < 9) {
			super.anInt5574++;
		}
		for (@Pc(18) int local18 = super.anInt5574; local18 > 0; local18--) {
			super.anIntArray335[local18] = super.anIntArray335[local18 - 1];
			super.anIntArray336[local18] = super.anIntArray336[local18 - 1];
			super.aByteArray60[local18] = super.aByteArray60[local18 - 1];
		}
		super.anIntArray335[0] = arg1;
		super.aByteArray60[0] = arg0;
		super.anIntArray336[0] = arg2;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)I")
	@Override
	public int method4913() {
		return this.aClass12_1 == null || this.aClass12_1.anInt259 == -1 ? super.method4913() : Static563.aClass346_2.method8199(this.aClass12_1.anInt259).anInt7681;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		if (this.aClass12_1 == null || !this.method1027(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class154 local19 = arg0.method8785();
		@Pc(24) int local24 = super.aClass278_7.method7147();
		local19.method6571(local24);
		@Pc(42) Class97 local42 = Static272.aClass97ArrayArrayArray3[super.aByte131][super.anInt10725 >> Static643.anInt10682][super.anInt10729 >> Static643.anInt10682];
		if (local42 == null || local42.aClass20_Sub2_Sub5_1 == null) {
			super.anInt5508 = (int) ((float) super.anInt5508 - (float) super.anInt5508 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt5508 - local42.aClass20_Sub2_Sub5_1.aShort94;
			super.anInt5508 = (int) ((float) super.anInt5508 - (float) local55 / 10.0F);
		}
		local19.method6570(super.anInt10725, -super.anInt5508 + super.anInt10724 - 20, super.anInt10729);
		super.aBoolean378 = false;
		@Pc(99) Class20_Sub3 local99 = null;
		if (Static348.aClass6_Sub22_19.aClass15_Sub8_1.method2004() == 1) {
			@Pc(111) Class201 local111 = this.method4911();
			if (local111.aBoolean417 && (this.aClass12_1.anInt259 == -1 || Static563.aClass346_2.method8199(this.aClass12_1.anInt259).aBoolean515)) {
				@Pc(146) Class21 local146 = super.anInt5549 != -1 && super.anInt5516 == 0 ? Static294.aClass373_2.method8738(super.anInt5549) : null;
				@Pc(167) Class21 local167 = super.anInt5571 == -1 || this.aBoolean75 || super.aBoolean375 && local146 != null ? null : Static294.aClass373_2.method8738(super.anInt5571);
				@Pc(199) Class24 local199 = Static190.method3385(super.anInt5535, local24, 0, 1, super.anInt5492, super.aClass24Array3[0], arg0, 0, super.anInt5517, local167 == null ? local146 : local167, local167 == null ? super.anInt5503 : super.anInt5533, 240, 160);
				if (local199 != null) {
					local99 = Static307.method5201(true, super.aClass24Array3.length + 1);
					super.aBoolean378 = true;
					arg0.C(false);
					if (Static591.aBoolean675) {
						local199.method6845(local19, local99.aClass20_Sub4Array1[super.aClass24Array3.length], Static419.anInt7660, 0);
					} else {
						local199.method6862(local19, local99.aClass20_Sub4Array1[super.aClass24Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == this) {
			local19.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			for (@Pc(260) int local260 = Static325.aClass19Array1.length - 1; local260 >= 0; local260--) {
				@Pc(266) Class19 local266 = Static325.aClass19Array1[local260];
				if (local266 != null && local266.anInt337 != -1) {
					@Pc(299) int local299;
					if (local266.anInt332 == 1) {
						@Pc(287) Class6_Sub46 local287 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local266.anInt331);
						if (local287 != null) {
							@Pc(292) Class20_Sub2_Sub2_Sub1_Sub2 local292 = local287.aClass20_Sub2_Sub2_Sub1_Sub2_1;
							local299 = local292.anInt10725 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725;
							@Pc(306) int local306 = local292.anInt10729 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729;
							if (Static591.aBoolean675) {
								this.method1023(local299, local306, Static419.anInt7660, local19, local266.anInt337, arg0, 92160000, super.aClass24Array3[0]);
							} else {
								this.method1022(92160000, super.aClass24Array3[0], local299, local266.anInt337, local306, arg0, local19);
							}
						}
					}
					@Pc(360) int local360;
					if (local266.anInt332 == 2) {
						@Pc(352) int local352 = local266.anInt333 + 256 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725;
						local360 = local266.anInt339 + 256 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729;
						local299 = local266.anInt340 << 9;
						local299 *= local299;
						if (Static591.aBoolean675) {
							this.method1023(local352, local360, Static419.anInt7660, local19, local266.anInt337, arg0, local299, super.aClass24Array3[0]);
						} else {
							this.method1022(local299, super.aClass24Array3[0], local352, local266.anInt337, local360, arg0, local19);
						}
					}
					if (local266.anInt332 == 10 && local266.anInt331 >= 0 && Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1.length > local266.anInt331) {
						@Pc(424) Class20_Sub2_Sub2_Sub1_Sub1 local424 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local266.anInt331];
						if (local424 != null) {
							local360 = local424.anInt10725 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725;
							local299 = local424.anInt10729 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729;
							if (Static591.aBoolean675) {
								this.method1023(local360, local299, Static419.anInt7660, local19, local266.anInt337, arg0, 92160000, super.aClass24Array3[0]);
							} else {
								this.method1022(92160000, super.aClass24Array3[0], local360, local266.anInt337, local299, arg0, local19);
							}
						}
					}
				}
			}
			local19.method6571(local24);
			local19.method6570(super.anInt10725, super.anInt10724, super.anInt10729);
		}
		local19.method6571(local24);
		local19.method6570(super.anInt10725, super.anInt10724 - super.anInt5508 - 5, super.anInt10729);
		if (local99 == null) {
			local99 = Static307.method5201(true, super.aClass24Array3.length);
		}
		this.method4916(super.aClass24Array3, arg0, local19, false);
		@Pc(536) int local536;
		if (Static591.aBoolean675) {
			for (local536 = 0; local536 < super.aClass24Array3.length; local536++) {
				if (super.aClass24Array3[local536] != null) {
					super.aClass24Array3[local536].method6845(local19, local99.aClass20_Sub4Array1[local536], Static419.anInt7660, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local536 = 0; super.aClass24Array3.length > local536; local536++) {
				if (super.aClass24Array3[local536] != null) {
					super.aClass24Array3[local536].method6862(local19, local99.aClass20_Sub4Array1[local536], Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass20_Sub8_4 != null) {
			@Pc(606) Class236 local606 = super.aClass20_Sub8_4.method6631();
			if (Static591.aBoolean675) {
				arg0.method8831(local606, Static419.anInt7660);
			} else {
				arg0.method8844(local606);
			}
		}
		for (local536 = 0; super.aClass24Array3.length > local536; local536++) {
			if (super.aClass24Array3[local536] != null) {
				super.aBoolean378 |= super.aClass24Array3[local536].F();
			}
		}
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = null;
		super.anInt5496 = Static167.anInt3480;
		return local99;
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)I")
	@Override
	public int method4917() {
		return -1;
	}
}
