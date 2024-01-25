import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class161 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "[S")
	private short[] aShortArray165;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "[S")
	private short[] aShortArray166;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Lclient!qj;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "[S")
	private short[] aShortArray167;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	private int anInt4996;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "[S")
	private short[] aShortArray168;

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
	public int anInt5005;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "B")
	public byte aByte47 = 0;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	private int anInt4990 = 128;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	private int anInt4989 = 128;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
	private int anInt4997 = 0;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
	private int anInt5000 = 0;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
	public int anInt5002 = -1;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
	private int anInt5003 = 0;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
	private int anInt5004 = -1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILclient!du;BIILclient!ya;)Lclient!t;")
	public Class110 method3830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class19 arg5) {
		return this.method3836(arg0, arg4, arg2, 0, null, false, arg5, arg3, (byte) 2, arg1, 0, 0, null);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLclient!iv;)V")
	public void method3831(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(28) int local28 = arg0.method2490();
			if (local28 == 0) {
				return;
			}
			this.method3835(arg0, local28);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ta;ZIILclient!ya;IILclient!ta;IZLclient!du;II)Lclient!t;")
	public Class110 method3833(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class65 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class55 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method3836(arg5, arg9, arg8, arg1, arg6, true, arg3, arg7, (byte) 2, arg10, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLclient!iv;I)V")
	private void method3835(@OriginalArg(1) Class4_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4996 = arg0.method2536();
		} else if (arg1 == 2) {
			this.anInt5002 = arg0.method2536();
		} else if (arg1 == 4) {
			this.anInt4990 = arg0.method2536();
		} else if (arg1 == 5) {
			this.anInt4989 = arg0.method2536();
		} else if (arg1 == 6) {
			this.anInt4997 = arg0.method2536();
		} else if (arg1 == 7) {
			this.anInt5000 = arg0.method2490();
		} else if (arg1 == 8) {
			this.anInt5003 = arg0.method2490();
		} else if (arg1 == 9) {
			this.aByte47 = 3;
			this.anInt5004 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean459 = true;
		} else if (arg1 == 11) {
			this.aByte47 = 1;
		} else if (arg1 == 12) {
			this.aByte47 = 4;
		} else if (arg1 == 13) {
			this.aByte47 = 5;
		} else if (arg1 == 14) {
			this.aByte47 = 2;
			this.anInt5004 = arg0.method2490() * 256;
		} else if (arg1 == 15) {
			this.aByte47 = 3;
			this.anInt5004 = arg0.method2536();
		} else if (arg1 == 16) {
			this.aByte47 = 3;
			this.anInt5004 = arg0.method2529();
			return;
		} else {
			@Pc(131) int local131;
			@Pc(141) int local141;
			if (arg1 == 40) {
				local131 = arg0.method2490();
				this.aShortArray166 = new short[local131];
				this.aShortArray167 = new short[local131];
				for (local141 = 0; local141 < local131; local141++) {
					this.aShortArray167[local141] = (short) arg0.method2536();
					this.aShortArray166[local141] = (short) arg0.method2536();
				}
				return;
			}
			if (arg1 == 41) {
				local131 = arg0.method2490();
				this.aShortArray165 = new short[local131];
				this.aShortArray168 = new short[local131];
				for (local141 = 0; local141 < local131; local141++) {
					this.aShortArray165[local141] = (short) arg0.method2536();
					this.aShortArray168[local141] = (short) arg0.method2536();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILclient!du;ILclient!ta;ZLclient!ya;IBZIIILclient!ta;)Lclient!t;")
	private Class110 method3836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class65 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class65 arg12) {
		@Pc(7) int local7 = arg1;
		@Pc(22) Class138 local22 = this.anInt5002 == -1 || arg0 == -1 ? null : arg2.method1397(this.anInt5002);
		@Pc(31) boolean local31 = arg5 & this.aByte47 != 0;
		if (local22 != null) {
			local7 = arg1 | local22.method3457(arg0, arg7, false);
		}
		if (local31) {
			local7 |= this.aByte47 == 3 ? 7 : 2;
		}
		if (this.anInt4989 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4990 != 128 || this.anInt4997 != 0) {
			local7 |= 0x5;
		}
		@Pc(87) Class68 local87 = this.aClass194_1.aClass68_37;
		@Pc(107) Class110 local107;
		synchronized (this.aClass194_1.aClass68_37) {
			local107 = (Class110) this.aClass194_1.aClass68_37.method1787((long) (this.anInt5005 |= arg6.anInt5532 << 29));
		}
		if (local107 == null || arg6.method4269(local107.P(), local7) != 0) {
			if (local107 != null) {
				local7 = arg6.method4282(local7, local107.P());
			}
			@Pc(134) int local134 = local7;
			if (this.aShortArray167 != null) {
				local134 = local7 | 0x4000;
			}
			if (this.aShortArray165 != null) {
				local134 |= 0x8000;
			}
			@Pc(157) Class122 local157 = Static370.method4948(this.aClass194_1.aClass76_71, this.anInt4996);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt3681 < 13) {
				local157.method3039();
			}
			local107 = arg6.method4254(local157, local134, this.aClass194_1.anInt5674, this.anInt5000 + 64, this.anInt5003 + 850);
			@Pc(190) int local190;
			if (this.aShortArray167 != null) {
				for (local190 = 0; local190 < this.aShortArray167.length; local190++) {
					local107.BA(this.aShortArray167[local190], this.aShortArray166[local190]);
				}
			}
			if (this.aShortArray165 != null) {
				for (local190 = 0; local190 < this.aShortArray165.length; local190++) {
					local107.I(this.aShortArray165[local190], this.aShortArray168[local190]);
				}
			}
			local107.UA(local7);
			@Pc(242) Class68 local242 = this.aClass194_1.aClass68_37;
			synchronized (this.aClass194_1.aClass68_37) {
				this.aClass194_1.aClass68_37.method1779((long) (this.anInt5005 |= arg6.anInt5532 << 29), local107);
			}
		}
		@Pc(286) Class110 local286 = local22 == null ? local107.method4887(arg8, local7, true) : local22.method3459(arg0, arg8, local107, arg9, arg7, 0, local7);
		if (this.anInt4990 != 128 || this.anInt4989 != 128) {
			local286.H(this.anInt4990, this.anInt4989, this.anInt4990);
		}
		if (this.anInt4997 != 0) {
			if (this.anInt4997 == 90) {
				local286.Q(4096);
			}
			if (this.anInt4997 == 180) {
				local286.Q(8192);
			}
			if (this.anInt4997 == 270) {
				local286.Q(12288);
			}
		}
		if (local31) {
			local286.h(this.aByte47, this.anInt5004, arg4, arg12, arg10, arg3, arg11);
		}
		local286.UA(arg1);
		return local286;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ya;BILclient!du;III)Lclient!t;")
	public Class110 method3837(@OriginalArg(0) Class19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method3836(arg3, arg4, arg2, 0, null, false, arg0, arg5, (byte) 5, arg1, 0, 0, null);
	}
}
