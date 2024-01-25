import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class52 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	public int anInt1392;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!qp;")
	public Class201 aClass201_1;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
	private int anInt1405;

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "B")
	public byte aByte12 = 0;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public int anInt1397 = -1;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	private int anInt1396 = 128;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	private int anInt1400 = 0;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	private int anInt1398 = -1;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
	private int anInt1404 = 128;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
	private int anInt1399 = 0;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	private int anInt1403 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!eg;IBILclient!qa;Lclient!o;IIZIILclient!o;I)Lclient!ka;")
	private Class108 method1405(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) Class55 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class55 arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg6;
		@Pc(24) Class261 local24 = this.anInt1397 == -1 || arg10 == -1 ? null : arg0.method1552(this.anInt1397);
		@Pc(36) boolean local36 = arg8 & this.aByte12 != 0;
		if (local24 != null) {
			local7 = arg6 | local24.method6051(arg1, false, arg10);
		}
		if (local36) {
			local7 |= this.aByte12 == 3 ? 7 : 2;
		}
		if (this.anInt1396 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1404 != 128 || this.anInt1399 != 0) {
			local7 |= 0x5;
		}
		@Pc(102) Class268 local102 = this.aClass201_1.aClass268_48;
		@Pc(122) Class108 local122;
		synchronized (this.aClass201_1.aClass268_48) {
			local122 = (Class108) this.aClass201_1.aClass268_48.method6166((long) (this.anInt1392 |= arg4.anInt7365 << 29));
		}
		if (local122 == null || arg4.method6006(local122.ma(), local7) != 0) {
			if (local122 != null) {
				local7 = arg4.method5967(local7, local122.ma());
			}
			@Pc(146) int local146 = local7;
			if (this.aShortArray18 != null) {
				local146 = local7 | 0x4000;
			}
			if (this.aShortArray19 != null) {
				local146 |= 0x8000;
			}
			@Pc(169) Class160 local169 = Static16.method320(this.aClass201_1.aClass250_85, this.anInt1405);
			if (local169 == null) {
				return null;
			}
			if (local169.anInt4540 < 13) {
				local169.method3772();
			}
			local122 = arg4.method5984(local169, local146, this.aClass201_1.anInt5753, this.anInt1400 + 64, this.anInt1403 - -850);
			@Pc(204) int local204;
			if (this.aShortArray18 != null) {
				for (local204 = 0; local204 < this.aShortArray18.length; local204++) {
					local122.i(this.aShortArray18[local204], this.aShortArray20[local204]);
				}
			}
			if (this.aShortArray19 != null) {
				for (local204 = 0; local204 < this.aShortArray19.length; local204++) {
					local122.G(this.aShortArray19[local204], this.aShortArray17[local204]);
				}
			}
			local122.B(local7);
			@Pc(260) Class268 local260 = this.aClass201_1.aClass268_48;
			synchronized (this.aClass201_1.aClass268_48) {
				this.aClass201_1.aClass268_48.method6164(local122, (long) (this.anInt1392 |= arg4.anInt7365 << 29));
			}
		}
		@Pc(304) Class108 local304 = local24 == null ? local122.method4930(arg2, local7, true) : local24.method6050(arg9, arg1, arg2, arg10, local122, 0, local7);
		if (this.anInt1404 != 128 || this.anInt1396 != 128) {
			local304.Z(this.anInt1404, this.anInt1396, this.anInt1404);
		}
		if (this.anInt1399 != 0) {
			if (this.anInt1399 == 90) {
				local304.l(4096);
			}
			if (this.anInt1399 == 180) {
				local304.l(8192);
			}
			if (this.anInt1399 == 270) {
				local304.l(12288);
			}
		}
		if (local36) {
			local304.g(this.aByte12, this.anInt1398, arg5, arg11, arg3, arg12, arg7);
		}
		local304.B(arg6);
		return local304;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZILclient!o;ILclient!eg;Lclient!qa;IILclient!o;III)Lclient!ka;")
	public Class108 method1408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class59 arg4, @OriginalArg(6) Class167 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class55 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method1405(arg4, arg3, (byte) 2, arg1, arg5, arg8, arg10, arg9, true, arg7, arg6, arg2, arg0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method1409(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4096();
			if (local13 == 0) {
				return;
			}
			this.method1412(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIILclient!qa;ILclient!eg;)Lclient!ka;")
	public Class108 method1410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class59 arg5) {
		return this.method1405(arg5, arg2, (byte) 5, 0, arg3, null, arg1, 0, false, arg4, arg0, null, 0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!qa;IIIILclient!eg;B)Lclient!ka;")
	public Class108 method1411(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class59 arg5) {
		return this.method1405(arg5, arg4, (byte) 2, 0, arg0, null, arg3, 0, false, arg2, arg1, null, 0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLclient!nj;I)V")
	private void method1412(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1405 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt1397 = arg0.method4083();
		} else if (arg1 == 4) {
			this.anInt1404 = arg0.method4083();
		} else if (arg1 == 5) {
			this.anInt1396 = arg0.method4083();
		} else if (arg1 == 6) {
			this.anInt1399 = arg0.method4083();
		} else if (arg1 == 7) {
			this.anInt1400 = arg0.method4096();
		} else if (arg1 == 8) {
			this.anInt1403 = arg0.method4096();
		} else if (arg1 == 9) {
			this.anInt1398 = 8224;
			this.aByte12 = 3;
		} else if (arg1 == 10) {
			this.aBoolean92 = true;
		} else if (arg1 == 11) {
			this.aByte12 = 1;
		} else if (arg1 == 12) {
			this.aByte12 = 4;
		} else if (arg1 == 13) {
			this.aByte12 = 5;
		} else if (arg1 == 14) {
			this.aByte12 = 2;
			this.anInt1398 = arg0.method4096() * 256;
		} else if (arg1 == 15) {
			this.aByte12 = 3;
			this.anInt1398 = arg0.method4083();
		} else if (arg1 == 16) {
			this.aByte12 = 3;
			this.anInt1398 = arg0.method4108();
		} else {
			@Pc(111) int local111;
			@Pc(121) int local121;
			if (arg1 == 40) {
				local111 = arg0.method4096();
				this.aShortArray18 = new short[local111];
				this.aShortArray20 = new short[local111];
				for (local121 = 0; local121 < local111; local121++) {
					this.aShortArray18[local121] = (short) arg0.method4083();
					this.aShortArray20[local121] = (short) arg0.method4083();
				}
			} else if (arg1 == 41) {
				local111 = arg0.method4096();
				this.aShortArray19 = new short[local111];
				this.aShortArray17 = new short[local111];
				for (local121 = 0; local121 < local111; local121++) {
					this.aShortArray19[local121] = (short) arg0.method4083();
					this.aShortArray17[local121] = (short) arg0.method4083();
				}
			}
		}
	}
}
