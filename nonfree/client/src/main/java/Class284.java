import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class284 {

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
	private int anInt7479;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
	public int anInt7481;

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!raa", name = "u", descriptor = "Lclient!qm;")
	public Class278 aClass278_2;

	@OriginalMember(owner = "client!raa", name = "x", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
	private int anInt7483 = -1;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "Z")
	public boolean aBoolean565 = false;

	@OriginalMember(owner = "client!raa", name = "t", descriptor = "B")
	public byte aByte96 = 0;

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
	private int anInt7482 = 0;

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
	private int anInt7492 = 0;

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
	private int anInt7489 = 0;

	@OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
	private int anInt7487 = 128;

	@OriginalMember(owner = "client!raa", name = "z", descriptor = "I")
	private int anInt7496 = 128;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
	public int anInt7490 = -1;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!r;ILclient!oj;IIII)Lclient!da;")
	public Class60 method6242(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class240 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6247(null, null, arg3, 0, arg0, arg2, (byte) 5, 0, arg4, false, arg5, arg1, 0);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!np;IB)V")
	private void method6243(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7479 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt7490 = arg0.method5198();
		} else if (arg1 == 4) {
			this.anInt7496 = arg0.method5198();
		} else if (arg1 == 5) {
			this.anInt7487 = arg0.method5198();
		} else if (arg1 == 6) {
			this.anInt7482 = arg0.method5198();
		} else if (arg1 == 7) {
			this.anInt7492 = arg0.method5175();
		} else if (arg1 == 8) {
			this.anInt7489 = arg0.method5175();
		} else if (arg1 == 9) {
			this.aByte96 = 3;
			this.anInt7483 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean565 = true;
		} else if (arg1 == 11) {
			this.aByte96 = 1;
		} else if (arg1 == 12) {
			this.aByte96 = 4;
		} else if (arg1 == 13) {
			this.aByte96 = 5;
		} else if (arg1 == 14) {
			this.aByte96 = 2;
			this.anInt7483 = arg0.method5175() * 256;
		} else if (arg1 == 15) {
			this.aByte96 = 3;
			this.anInt7483 = arg0.method5198();
		} else if (arg1 == 16) {
			this.aByte96 = 3;
			this.anInt7483 = arg0.method5186();
		} else {
			@Pc(122) int local122;
			@Pc(132) int local132;
			if (arg1 == 40) {
				local122 = arg0.method5175();
				this.aShortArray120 = new short[local122];
				this.aShortArray121 = new short[local122];
				for (local132 = 0; local132 < local122; local132++) {
					this.aShortArray120[local132] = (short) arg0.method5198();
					this.aShortArray121[local132] = (short) arg0.method5198();
				}
			} else if (arg1 == 41) {
				local122 = arg0.method5175();
				this.aShortArray122 = new short[local122];
				this.aShortArray119 = new short[local122];
				for (local132 = 0; local132 < local122; local132++) {
					this.aShortArray122[local132] = (short) arg0.method5198();
					this.aShortArray119[local132] = (short) arg0.method5198();
				}
			}
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!oj;Lclient!r;IIII)Lclient!da;")
	public Class60 method6244(@OriginalArg(0) int arg0, @OriginalArg(1) Class240 arg1, @OriginalArg(2) Class45 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method6247(null, null, arg5, 0, arg2, arg1, (byte) 2, 0, arg3, false, arg4, arg0, 0);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILclient!r;Lclient!oj;BIILclient!i;IILclient!i;IZ)Lclient!da;")
	public Class60 method6246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45 arg2, @OriginalArg(3) Class240 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class34 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class34 arg9, @OriginalArg(11) int arg10) {
		return this.method6247(arg9, arg6, arg4, arg8, arg2, arg3, (byte) 2, arg0, arg7, true, arg1, arg10, arg5);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!i;Lclient!i;IILclient!r;Lclient!oj;BIIZIIII)Lclient!da;")
	private Class60 method6247(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class45 arg4, @OriginalArg(5) Class240 arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg11;
		@Pc(23) Class185 local23 = this.anInt7490 == -1 || arg10 == -1 ? null : arg5.method5680(this.anInt7490);
		@Pc(32) boolean local32 = arg9 & this.aByte96 != 0;
		if (local23 != null) {
			local7 = arg11 | local23.method4379(arg10, arg8, false);
		}
		if (local32) {
			local7 |= this.aByte96 == 3 ? 7 : 2;
		}
		if (this.anInt7487 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt7496 != 128 || this.anInt7482 != 0) {
			local7 |= 0x5;
		}
		@Pc(85) Class6 local85 = this.aClass278_2.aClass6_55;
		@Pc(107) Class60 local107;
		synchronized (this.aClass278_2.aClass6_55) {
			local107 = (Class60) this.aClass278_2.aClass6_55.method92((long) (this.anInt7481 |= arg4.anInt8843 << 29));
		}
		if (local107 == null || arg4.method7393(local107.PA(), local7) != 0) {
			if (local107 != null) {
				local7 = arg4.method7392(local7, local107.PA());
			}
			@Pc(134) int local134 = local7;
			if (this.aShortArray120 != null) {
				local134 = local7 | 0x4000;
			}
			if (this.aShortArray122 != null) {
				local134 |= 0x8000;
			}
			@Pc(157) Class84 local157 = Static416.method5935(this.aClass278_2.aClass322_125, this.anInt7479);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt2725 < 13) {
				local157.method2433();
			}
			local107 = arg4.method7419(local157, local134, this.aClass278_2.anInt7310, this.anInt7492 + 64, this.anInt7489 + 850);
			@Pc(192) int local192;
			if (this.aShortArray120 != null) {
				for (local192 = 0; local192 < this.aShortArray120.length; local192++) {
					local107.d(this.aShortArray120[local192], this.aShortArray121[local192]);
				}
			}
			if (this.aShortArray122 != null) {
				for (local192 = 0; local192 < this.aShortArray122.length; local192++) {
					local107.DA(this.aShortArray122[local192], this.aShortArray119[local192]);
				}
			}
			local107.SA(local7);
			@Pc(244) Class6 local244 = this.aClass278_2.aClass6_55;
			synchronized (this.aClass278_2.aClass6_55) {
				this.aClass278_2.aClass6_55.method106((long) (this.anInt7481 |= arg4.anInt8843 << 29), local107);
			}
		}
		@Pc(288) Class60 local288 = local23 == null ? local107.method7229(arg6, local7, true) : local23.method4380(arg6, arg8, arg2, local107, arg10, 0, local7);
		if (this.anInt7496 != 128 || this.anInt7487 != 128) {
			local288.R(this.anInt7496, this.anInt7487, this.anInt7496);
		}
		if (this.anInt7482 != 0) {
			if (this.anInt7482 == 90) {
				local288.M(4096);
			}
			if (this.anInt7482 == 180) {
				local288.M(8192);
			}
			if (this.anInt7482 == 270) {
				local288.M(12288);
			}
		}
		if (local32) {
			local288.ba(this.aByte96, this.anInt7483, arg1, arg0, arg3, arg7, arg12);
		}
		local288.SA(arg11);
		return local288;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!np;I)V")
	public void method6248(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(25) int local25 = arg0.method5175();
			if (local25 == 0) {
				return;
			}
			this.method6243(arg0, local25);
		}
	}
}
