import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class156 {

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	public int anInt4314;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
	private int anInt4321;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "Lclient!hk;")
	public Class107 aClass107_2;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!lo", name = "D", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public int anInt4316 = -1;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "B")
	public byte aByte55 = 0;

	@OriginalMember(owner = "client!lo", name = "z", descriptor = "I")
	private int anInt4329 = 0;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
	private int anInt4319 = 128;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
	private int anInt4324 = -1;

	@OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
	private int anInt4331 = 0;

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
	private int anInt4330 = 0;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	private int anInt4323 = 128;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Z")
	public boolean aBoolean289 = false;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!gs;BIIILclient!za;)Lclient!e;")
	public Class63 method3463(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class50 arg5) {
		return this.method3467(null, null, arg0, (byte) 2, 0, arg2, arg1, 0, arg3, arg4, arg5, 0, false);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!nn;B)V")
	private void method3464(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt4321 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt4316 = arg1.method2485();
		} else if (arg0 == 4) {
			this.anInt4319 = arg1.method2485();
		} else if (arg0 == 5) {
			this.anInt4323 = arg1.method2485();
		} else if (arg0 == 6) {
			this.anInt4329 = arg1.method2485();
		} else if (arg0 == 7) {
			this.anInt4331 = arg1.method2502();
		} else if (arg0 == 8) {
			this.anInt4330 = arg1.method2502();
		} else if (arg0 == 9) {
			this.anInt4324 = 8224;
			this.aByte55 = 3;
		} else if (arg0 == 10) {
			this.aBoolean289 = true;
		} else if (arg0 == 11) {
			this.aByte55 = 1;
		} else if (arg0 == 12) {
			this.aByte55 = 4;
		} else if (arg0 == 13) {
			this.aByte55 = 5;
		} else if (arg0 == 14) {
			this.aByte55 = 2;
			this.anInt4324 = arg1.method2502() * 256;
		} else if (arg0 == 15) {
			this.aByte55 = 3;
			this.anInt4324 = arg1.method2485();
		} else if (arg0 == 16) {
			this.aByte55 = 3;
			this.anInt4324 = arg1.method2459();
		} else {
			@Pc(133) int local133;
			@Pc(143) int local143;
			if (arg0 == 40) {
				local133 = arg1.method2502();
				this.aShortArray61 = new short[local133];
				this.aShortArray60 = new short[local133];
				for (local143 = 0; local143 < local133; local143++) {
					this.aShortArray61[local143] = (short) arg1.method2485();
					this.aShortArray60[local143] = (short) arg1.method2485();
				}
				return;
			}
			if (arg0 == 41) {
				local133 = arg1.method2502();
				this.aShortArray63 = new short[local133];
				this.aShortArray62 = new short[local133];
				for (local143 = 0; local143 < local133; local143++) {
					this.aShortArray63[local143] = (short) arg1.method2485();
					this.aShortArray62[local143] = (short) arg1.method2485();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZLclient!ya;IIIILclient!za;Lclient!ya;Lclient!gs;II)Lclient!e;")
	public Class63 method3465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class154 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class50 arg6, @OriginalArg(9) Class154 arg7, @OriginalArg(10) Class98 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method3467(arg7, arg2, arg0, (byte) 2, arg9, arg1, arg8, arg10, arg5, arg4, arg6, arg3, true);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ya;Lclient!ya;IBIILclient!gs;IIZILclient!za;IZ)Lclient!e;")
	private Class63 method3467(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class154 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class50 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12) {
		@Pc(7) int local7 = arg5;
		@Pc(24) Class137 local24 = this.anInt4316 == -1 || arg9 == -1 ? null : arg6.method2405(this.anInt4316);
		@Pc(36) boolean local36 = arg12 & this.aByte55 != 0;
		if (local24 != null) {
			local7 = arg5 | local24.method3211(arg9, arg2, false);
		}
		if (local36) {
			local7 |= this.aByte55 == 3 ? 7 : 2;
		}
		if (this.anInt4323 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4319 != 128 || this.anInt4329 != 0) {
			local7 |= 0x5;
		}
		@Pc(86) Class267 local86 = this.aClass107_2.aClass267_29;
		@Pc(106) Class63 local106;
		synchronized (this.aClass107_2.aClass267_29) {
			local106 = (Class63) this.aClass107_2.aClass267_29.method6014((long) (this.anInt4314 |= arg10.anInt7375 << 29));
		}
		if (local106 == null || arg10.method5856(local106.RA(), local7) != 0) {
			if (local106 != null) {
				local7 = arg10.method5822(local7, local106.RA());
			}
			@Pc(130) int local130 = local7;
			if (this.aShortArray61 != null) {
				local130 = local7 | 0x4000;
			}
			if (this.aShortArray63 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class192 local153 = Static378.method5099(this.aClass107_2.aClass187_62, this.anInt4321);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt5443 < 13) {
				local153.method4347();
			}
			local106 = arg10.method5864(local153, local130, this.aClass107_2.anInt3166, this.anInt4331 + 64, this.anInt4330 - -850);
			@Pc(188) int local188;
			if (this.aShortArray61 != null) {
				for (local188 = 0; local188 < this.aShortArray61.length; local188++) {
					local106.q(this.aShortArray61[local188], this.aShortArray60[local188]);
				}
			}
			if (this.aShortArray63 != null) {
				for (local188 = 0; local188 < this.aShortArray63.length; local188++) {
					local106.u(this.aShortArray63[local188], this.aShortArray62[local188]);
				}
			}
			local106.D(local7);
			@Pc(240) Class267 local240 = this.aClass107_2.aClass267_29;
			synchronized (this.aClass107_2.aClass267_29) {
				this.aClass107_2.aClass267_29.method6008(local106, (long) (this.anInt4314 |= arg10.anInt7375 << 29));
			}
		}
		@Pc(284) Class63 local284 = local24 == null ? local106.method6093(arg3, local7, true) : local24.method3209(arg9, arg2, arg3, 0, arg8, local106, local7);
		if (this.anInt4319 != 128 || this.anInt4323 != 128) {
			local284.n(this.anInt4319, this.anInt4323, this.anInt4319);
		}
		if (this.anInt4329 != 0) {
			if (this.anInt4329 == 90) {
				local284.ma(4096);
			}
			if (this.anInt4329 == 180) {
				local284.ma(8192);
			}
			if (this.anInt4329 == 270) {
				local284.ma(12288);
			}
		}
		if (local36) {
			local284.da(this.aByte55, this.anInt4324, arg0, arg1, arg4, arg7, arg11);
		}
		local284.D(arg5);
		return local284;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!za;IIILclient!gs;)Lclient!e;")
	public Class63 method3468(@OriginalArg(0) int arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class98 arg5) {
		return this.method3467(null, null, arg4, (byte) 5, 0, arg0, arg5, 0, arg2, arg3, arg1, 0, false);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method3470(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2502();
			if (local7 == 0) {
				return;
			}
			this.method3464(local7, arg0);
		}
	}
}
