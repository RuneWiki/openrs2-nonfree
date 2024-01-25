import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class175 {

	@OriginalMember(owner = "client!k", name = "d", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	private int anInt4944;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Lclient!op;")
	public Class248 aClass248_1;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "I")
	public int anInt4953;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	private int anInt4942 = -1;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "B")
	public byte aByte60 = 0;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	private int anInt4943 = 0;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "I")
	private int anInt4954 = 128;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	private int anInt4945 = 128;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public int anInt4956 = -1;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Z")
	public boolean aBoolean386 = false;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "I")
	private int anInt4952 = 0;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	private int anInt4946 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!rb;BIIIILclient!r;)Lclient!da;")
	public Class57 method4324(@OriginalArg(0) Class279 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class43 arg5) {
		return this.method4326(arg4, arg1, 0, 0, arg5, 0, null, arg3, arg2, null, arg0, false, (byte) 2);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!i;IZLclient!r;IILclient!i;Lclient!rb;IIBI)Lclient!da;")
	public Class57 method4325(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class43 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class139 arg6, @OriginalArg(8) Class279 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) int arg10) {
		return this.method4326(arg4, arg8, arg10, arg5, arg3, arg9, arg1, arg2, arg0, arg6, arg7, true, (byte) 2);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIILclient!r;IILclient!i;IILclient!i;Lclient!rb;ZB)Lclient!da;")
	private Class57 method4326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class43 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class139 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class139 arg9, @OriginalArg(11) Class279 arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) byte arg12) {
		@Pc(7) int local7 = arg0;
		@Pc(24) Class17 local24 = this.anInt4956 == -1 || arg7 == -1 ? null : arg10.method6216(this.anInt4956);
		@Pc(36) boolean local36 = arg11 & this.aByte60 != 0;
		if (local24 != null) {
			local7 = arg0 | local24.method451(arg1, arg7, false);
		}
		if (local36) {
			local7 |= this.aByte60 == 3 ? 7 : 2;
		}
		if (this.anInt4954 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4945 != 128 || this.anInt4952 != 0) {
			local7 |= 0x5;
		}
		@Pc(91) Class10 local91 = this.aClass248_1.aClass10_40;
		@Pc(111) Class57 local111;
		synchronized (this.aClass248_1.aClass10_40) {
			local111 = (Class57) this.aClass248_1.aClass10_40.method250((long) (this.anInt4953 |= arg4.anInt8539 << 29));
		}
		if (local111 == null || arg4.method7169(local111.PA(), local7) != 0) {
			if (local111 != null) {
				local7 = arg4.method7203(local7, local111.PA());
			}
			@Pc(138) int local138 = local7;
			if (this.aShortArray111 != null) {
				local138 = local7 | 0x4000;
			}
			if (this.aShortArray112 != null) {
				local138 |= 0x8000;
			}
			@Pc(163) Class226 local163 = Static519.method6916(this.anInt4944, this.aClass248_1.aClass246_186);
			if (local163 == null) {
				return null;
			}
			if (local163.anInt6103 < 13) {
				local163.method5296();
			}
			local111 = arg4.method7178(local163, local138, this.aClass248_1.anInt6668, this.anInt4943 + 64, this.anInt4946 + 850);
			@Pc(198) int local198;
			if (this.aShortArray111 != null) {
				for (local198 = 0; local198 < this.aShortArray111.length; local198++) {
					local111.d(this.aShortArray111[local198], this.aShortArray114[local198]);
				}
			}
			if (this.aShortArray112 != null) {
				for (local198 = 0; local198 < this.aShortArray112.length; local198++) {
					local111.DA(this.aShortArray112[local198], this.aShortArray113[local198]);
				}
			}
			local111.SA(local7);
			@Pc(246) Class10 local246 = this.aClass248_1.aClass10_40;
			synchronized (this.aClass248_1.aClass10_40) {
				this.aClass248_1.aClass10_40.method254(local111, (long) (this.anInt4953 |= arg4.anInt8539 << 29));
			}
		}
		@Pc(290) Class57 local290 = local24 == null ? local111.method7522(arg12, local7, true) : local24.method452(arg12, arg8, local7, arg1, arg7, 0, local111);
		if (this.anInt4945 != 128 || this.anInt4954 != 128) {
			local290.R(this.anInt4945, this.anInt4954, this.anInt4945);
		}
		if (this.anInt4952 != 0) {
			if (this.anInt4952 == 90) {
				local290.M(4096);
			}
			if (this.anInt4952 == 180) {
				local290.M(8192);
			}
			if (this.anInt4952 == 270) {
				local290.M(12288);
			}
		}
		if (local36) {
			local290.ba(this.aByte60, this.anInt4942, arg6, arg9, arg3, arg5, arg2);
		}
		local290.SA(arg0);
		return local290;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!rb;Lclient!r;IIII)Lclient!da;")
	public Class57 method4327(@OriginalArg(1) Class279 arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method4326(arg3, arg4, 0, 0, arg1, 0, null, arg5, arg2, null, arg0, false, (byte) 5);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLclient!qh;)V")
	public void method4328(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(24) int local24 = arg0.method3118();
			if (local24 == 0) {
				return;
			}
			this.method4329(local24, arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLclient!qh;)V")
	private void method4329(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt4944 = arg1.method3109();
		} else if (arg0 == 2) {
			this.anInt4956 = arg1.method3109();
		} else if (arg0 == 4) {
			this.anInt4945 = arg1.method3109();
		} else if (arg0 == 5) {
			this.anInt4954 = arg1.method3109();
		} else if (arg0 == 6) {
			this.anInt4952 = arg1.method3109();
		} else if (arg0 == 7) {
			this.anInt4943 = arg1.method3118();
		} else if (arg0 == 8) {
			this.anInt4946 = arg1.method3118();
		} else if (arg0 == 9) {
			this.aByte60 = 3;
			this.anInt4942 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean386 = true;
		} else if (arg0 == 11) {
			this.aByte60 = 1;
		} else if (arg0 == 12) {
			this.aByte60 = 4;
		} else if (arg0 == 13) {
			this.aByte60 = 5;
		} else if (arg0 == 14) {
			this.aByte60 = 2;
			this.anInt4942 = arg1.method3118() * 256;
		} else if (arg0 == 15) {
			this.aByte60 = 3;
			this.anInt4942 = arg1.method3109();
		} else if (arg0 == 16) {
			this.aByte60 = 3;
			this.anInt4942 = arg1.method3116();
		} else {
			@Pc(132) int local132;
			@Pc(142) int local142;
			if (arg0 == 40) {
				local132 = arg1.method3118();
				this.aShortArray114 = new short[local132];
				this.aShortArray111 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray111[local142] = (short) arg1.method3109();
					this.aShortArray114[local142] = (short) arg1.method3109();
				}
			} else if (arg0 == 41) {
				local132 = arg1.method3118();
				this.aShortArray112 = new short[local132];
				this.aShortArray113 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray112[local142] = (short) arg1.method3109();
					this.aShortArray113[local142] = (short) arg1.method3109();
				}
			}
		}
	}
}
