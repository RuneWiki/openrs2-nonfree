import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class229 {

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
	public int anInt6239;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
	private int anInt6244;

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "Lclient!cg;")
	public Class36 aClass36_1;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	private int anInt6230 = 0;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "Z")
	public boolean aBoolean449 = false;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	private int anInt6233 = 0;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	public int anInt6240 = -1;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	private int anInt6231 = 128;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
	private int anInt6236 = 0;

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "B")
	public byte aByte78 = 0;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
	private int anInt6243 = 128;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
	private int anInt6238 = -1;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ec;Lclient!za;IIIBI)Lclient!e;")
	public Class59 method4856(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		return this.method4860(arg0, arg2, arg5, 0, 0, 0, false, null, arg3, (byte) 5, null, arg1, arg4);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!sv;Z)V")
	public void method4857(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method3580();
			if (local18 == 0) {
				return;
			}
			this.method4863(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ya;IIIIILclient!ya;Lclient!za;ILclient!ec;IIZ)Lclient!e;")
	public Class59 method4859(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class162 arg5, @OriginalArg(7) Class163 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class62 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return this.method4860(arg8, arg1, arg4, arg2, arg9, arg10, true, arg5, arg3, (byte) 2, arg0, arg6, arg7);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ec;IIBIIIZLclient!ya;IBLclient!ya;Lclient!za;I)Lclient!e;")
	private Class59 method4860(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class162 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte arg9, @OriginalArg(11) Class162 arg10, @OriginalArg(12) Class163 arg11, @OriginalArg(13) int arg12) {
		@Pc(12) int local12 = arg2;
		@Pc(27) Class128 local27 = this.anInt6240 == -1 || arg12 == -1 ? null : arg0.method1418(this.anInt6240);
		@Pc(39) boolean local39 = arg6 & this.aByte78 != 0;
		if (local27 != null) {
			local12 = arg2 | local27.method2648(arg8, false, arg12);
		}
		if (local39) {
			local12 |= this.aByte78 == 3 ? 7 : 2;
		}
		if (this.anInt6231 != 128) {
			local12 |= 0x2;
		}
		if (this.anInt6243 != 128 || this.anInt6230 != 0) {
			local12 |= 0x5;
		}
		@Pc(87) Class132 local87 = this.aClass36_1.aClass132_6;
		@Pc(107) Class59 local107;
		synchronized (this.aClass36_1.aClass132_6) {
			local107 = (Class59) this.aClass36_1.aClass132_6.method2701((long) (this.anInt6239 |= arg11.anInt7061 << 29));
		}
		if (local107 == null || arg11.method5502(local107.RA(), local12) != 0) {
			if (local107 != null) {
				local12 = arg11.method5514(local12, local107.RA());
			}
			@Pc(134) int local134 = local12;
			if (this.aShortArray87 != null) {
				local134 = local12 | 0x4000;
			}
			if (this.aShortArray85 != null) {
				local134 |= 0x8000;
			}
			@Pc(157) Class205 local157 = Static278.method3725(this.aClass36_1.aClass54_16, this.anInt6244);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt5616 < 13) {
				local157.method4443();
			}
			local107 = arg11.method5530(local157, local134, this.aClass36_1.anInt865, this.anInt6236 + 64, this.anInt6233 + 850);
			@Pc(190) int local190;
			if (this.aShortArray87 != null) {
				for (local190 = 0; local190 < this.aShortArray87.length; local190++) {
					local107.q(this.aShortArray87[local190], this.aShortArray84[local190]);
				}
			}
			if (this.aShortArray85 != null) {
				for (local190 = 0; local190 < this.aShortArray85.length; local190++) {
					local107.u(this.aShortArray85[local190], this.aShortArray86[local190]);
				}
			}
			local107.D(local12);
			@Pc(242) Class132 local242 = this.aClass36_1.aClass132_6;
			synchronized (this.aClass36_1.aClass132_6) {
				this.aClass36_1.aClass132_6.method2711(local107, (long) (this.anInt6239 |= arg11.anInt7061 << 29));
			}
		}
		@Pc(286) Class59 local286 = local27 == null ? local107.method5737(arg9, local12, true) : local27.method2642(arg8, local107, arg12, arg1, local12, 0, arg9);
		if (this.anInt6243 != 128 || this.anInt6231 != 128) {
			local286.n(this.anInt6243, this.anInt6231, this.anInt6243);
		}
		if (this.anInt6230 != 0) {
			if (this.anInt6230 == 90) {
				local286.ma(4096);
			}
			if (this.anInt6230 == 180) {
				local286.ma(8192);
			}
			if (this.anInt6230 == 270) {
				local286.ma(12288);
			}
		}
		if (local39) {
			local286.da(this.aByte78, this.anInt6238, arg10, arg7, arg5, arg3, arg4);
		}
		local286.D(arg2);
		return local286;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILclient!za;Lclient!ec;II)Lclient!e;")
	public Class59 method4862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) Class62 arg4, @OriginalArg(6) int arg5) {
		return this.method4860(arg4, arg0, arg2, 0, 0, 0, false, null, arg5, (byte) 2, null, arg3, arg1);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBLclient!sv;)V")
	private void method4863(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt6244 = arg1.method3555();
		} else if (arg0 == 2) {
			this.anInt6240 = arg1.method3555();
		} else if (arg0 == 4) {
			this.anInt6243 = arg1.method3555();
		} else if (arg0 == 5) {
			this.anInt6231 = arg1.method3555();
		} else if (arg0 == 6) {
			this.anInt6230 = arg1.method3555();
		} else if (arg0 == 7) {
			this.anInt6236 = arg1.method3580();
		} else if (arg0 == 8) {
			this.anInt6233 = arg1.method3580();
		} else if (arg0 == 9) {
			this.aByte78 = 3;
			this.anInt6238 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean449 = true;
		} else if (arg0 == 11) {
			this.aByte78 = 1;
		} else if (arg0 == 12) {
			this.aByte78 = 4;
		} else if (arg0 == 13) {
			this.aByte78 = 5;
		} else if (arg0 == 14) {
			this.aByte78 = 2;
			this.anInt6238 = arg1.method3580() * 256;
		} else if (arg0 == 15) {
			this.aByte78 = 3;
			this.anInt6238 = arg1.method3555();
		} else if (arg0 == 16) {
			this.aByte78 = 3;
			this.anInt6238 = arg1.method3574();
		} else {
			@Pc(127) int local127;
			@Pc(137) int local137;
			if (arg0 == 40) {
				local127 = arg1.method3580();
				this.aShortArray84 = new short[local127];
				this.aShortArray87 = new short[local127];
				for (local137 = 0; local137 < local127; local137++) {
					this.aShortArray87[local137] = (short) arg1.method3555();
					this.aShortArray84[local137] = (short) arg1.method3555();
				}
			} else if (arg0 == 41) {
				local127 = arg1.method3580();
				this.aShortArray85 = new short[local127];
				this.aShortArray86 = new short[local127];
				for (local137 = 0; local137 < local127; local137++) {
					this.aShortArray85[local137] = (short) arg1.method3555();
					this.aShortArray86[local137] = (short) arg1.method3555();
				}
			}
		}
	}
}
