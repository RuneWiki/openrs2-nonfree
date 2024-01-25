import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class139 {

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	public int anInt3453;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
	private int anInt3455;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "Lclient!gs;")
	public Class100 aClass100_1;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	private int anInt3450 = 0;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	private int anInt3454 = 128;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	private int anInt3449 = 0;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
	private int anInt3461 = 128;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "B")
	public byte aByte58 = 0;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	private int anInt3460 = 0;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
	private int anInt3459 = -1;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
	public int anInt3448 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!ya;Lclient!fk;ILclient!ya;IIBLclient!za;ZIIII)Lclient!e;")
	private Class63 method2829(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class80 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class75 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(10) int local10 = arg11;
		@Pc(26) Class109 local26 = this.anInt3448 == -1 || arg10 == -1 ? null : arg2.method1879(this.anInt3448);
		@Pc(35) boolean local35 = arg9 & this.aByte58 != 0;
		if (local26 != null) {
			local10 = arg11 | local26.method2299(arg0, arg10, false);
		}
		if (local35) {
			local10 |= this.aByte58 == 3 ? 7 : 2;
		}
		if (this.anInt3461 != 128) {
			local10 |= 0x2;
		}
		if (this.anInt3454 != 128 || this.anInt3460 != 0) {
			local10 |= 0x5;
		}
		@Pc(87) Class188 local87 = this.aClass100_1.aClass188_28;
		@Pc(107) Class63 local107;
		synchronized (this.aClass100_1.aClass188_28) {
			local107 = (Class63) this.aClass100_1.aClass188_28.method4158((long) (this.anInt3453 |= arg8.anInt7407 << 29));
		}
		if (local107 == null || arg8.method6023(local107.RA(), local10) != 0) {
			if (local107 != null) {
				local10 = arg8.method5987(local10, local107.RA());
			}
			@Pc(134) int local134 = local10;
			if (this.aShortArray57 != null) {
				local134 = local10 | 0x4000;
			}
			if (this.aShortArray59 != null) {
				local134 |= 0x8000;
			}
			@Pc(157) Class76 local157 = Static378.method5924(this.aClass100_1.aClass171_34, this.anInt3455);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt1809 < 13) {
				local157.method1775();
			}
			local107 = arg8.method6016(local157, local134, this.aClass100_1.anInt2606, this.anInt3450 + 64, this.anInt3449 + 850);
			@Pc(192) int local192;
			if (this.aShortArray57 != null) {
				for (local192 = 0; local192 < this.aShortArray57.length; local192++) {
					local107.q(this.aShortArray57[local192], this.aShortArray58[local192]);
				}
			}
			if (this.aShortArray59 != null) {
				for (local192 = 0; local192 < this.aShortArray59.length; local192++) {
					local107.u(this.aShortArray59[local192], this.aShortArray60[local192]);
				}
			}
			local107.D(local10);
			@Pc(246) Class188 local246 = this.aClass100_1.aClass188_28;
			synchronized (this.aClass100_1.aClass188_28) {
				this.aClass100_1.aClass188_28.method4155((long) (this.anInt3453 |= arg8.anInt7407 << 29), local107);
			}
		}
		@Pc(290) Class63 local290 = local26 == null ? local107.method6296(arg7, local10, true) : local26.method2298(0, arg7, arg10, local107, arg0, arg3, local10);
		if (this.anInt3454 != 128 || this.anInt3461 != 128) {
			local290.n(this.anInt3454, this.anInt3461, this.anInt3454);
		}
		if (this.anInt3460 != 0) {
			if (this.anInt3460 == 90) {
				local290.ma(4096);
			}
			if (this.anInt3460 == 180) {
				local290.ma(8192);
			}
			if (this.anInt3460 == 270) {
				local290.ma(12288);
			}
		}
		if (local35) {
			local290.da(this.aByte58, this.anInt3459, arg1, arg4, arg12, arg6, arg5);
		}
		local290.D(arg11);
		return local290;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!za;ILclient!ya;Lclient!fk;IIIIILclient!ya;IZ)Lclient!e;")
	public Class63 method2830(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) Class80 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22 arg10) {
		return this.method2829(arg5, arg3, arg4, arg9, arg10, arg8, arg0, (byte) 2, arg1, true, arg7, arg2, arg6);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!hw;)V")
	private void method2835(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt3455 = arg1.method6148();
		} else if (arg0 == 2) {
			this.anInt3448 = arg1.method6148();
		} else if (arg0 == 4) {
			this.anInt3454 = arg1.method6148();
		} else if (arg0 == 5) {
			this.anInt3461 = arg1.method6148();
		} else if (arg0 == 6) {
			this.anInt3460 = arg1.method6148();
		} else if (arg0 == 7) {
			this.anInt3450 = arg1.method6138();
		} else if (arg0 == 8) {
			this.anInt3449 = arg1.method6138();
		} else if (arg0 == 9) {
			this.anInt3459 = 8224;
			this.aByte58 = 3;
		} else if (arg0 == 10) {
			this.aBoolean228 = true;
		} else if (arg0 == 11) {
			this.aByte58 = 1;
		} else if (arg0 == 12) {
			this.aByte58 = 4;
		} else if (arg0 == 13) {
			this.aByte58 = 5;
		} else if (arg0 == 14) {
			this.aByte58 = 2;
			this.anInt3459 = arg1.method6138() * 256;
		} else if (arg0 == 15) {
			this.aByte58 = 3;
			this.anInt3459 = arg1.method6148();
			return;
		} else if (arg0 == 16) {
			this.aByte58 = 3;
			this.anInt3459 = arg1.method6129();
			return;
		} else {
			@Pc(125) int local125;
			@Pc(135) int local135;
			if (arg0 == 40) {
				local125 = arg1.method6138();
				this.aShortArray58 = new short[local125];
				this.aShortArray57 = new short[local125];
				for (local135 = 0; local135 < local125; local135++) {
					this.aShortArray57[local135] = (short) arg1.method6148();
					this.aShortArray58[local135] = (short) arg1.method6148();
				}
				return;
			}
			if (arg0 == 41) {
				local125 = arg1.method6138();
				this.aShortArray59 = new short[local125];
				this.aShortArray60 = new short[local125];
				for (local135 = 0; local135 < local125; local135++) {
					this.aShortArray59[local135] = (short) arg1.method6148();
					this.aShortArray60[local135] = (short) arg1.method6148();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!za;IIIBLclient!fk;I)Lclient!e;")
	public Class63 method2836(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class80 arg4, @OriginalArg(6) int arg5) {
		return this.method2829(arg3, null, arg4, arg1, null, 0, 0, (byte) 2, arg0, false, arg5, arg2, 0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLclient!hw;)V")
	public void method2837(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6138();
			if (local7 == 0) {
				return;
			}
			this.method2835(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLclient!fk;IIILclient!za;I)Lclient!e;")
	public Class63 method2838(@OriginalArg(1) Class80 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		return this.method2829(arg2, null, arg0, arg1, null, 0, 0, (byte) 5, arg4, false, arg5, arg3, 0);
	}
}
