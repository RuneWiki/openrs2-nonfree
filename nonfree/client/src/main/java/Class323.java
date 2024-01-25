import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class323 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public int anInt8311;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	private int anInt8317;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "Lclient!tg;")
	public Class349 aClass349_2;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Z")
	public boolean aBoolean644 = false;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	private int anInt8312 = -1;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	private int anInt8310 = 0;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	private int anInt8318 = 128;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	private int anInt8320 = 0;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	private int anInt8319 = 128;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	private int anInt8313 = 0;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
	public int anInt8322 = -1;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "B")
	public byte aByte115 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!aaa;IIZILclient!ha;ZBLclient!s;IIILclient!s;I)Lclient!ka;")
	private Class62 method7201(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) Class42 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class42 arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg3;
		@Pc(23) Class124 local23 = this.anInt8322 == -1 || arg10 == -1 ? null : arg0.method22(this.anInt8322);
		@Pc(32) boolean local32 = arg5 & this.aByte115 != 0;
		if (local23 != null) {
			local7 = arg3 | local23.method2834(arg2, false, arg10);
		}
		if (local32) {
			local7 |= this.aByte115 == 3 ? 7 : 2;
		}
		if (this.anInt8319 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt8318 != 128 || this.anInt8310 != 0) {
			local7 |= 0x5;
		}
		@Pc(87) Class352 local87 = this.aClass349_2.aClass352_63;
		@Pc(107) Class62 local107;
		synchronized (this.aClass349_2.aClass352_63) {
			local107 = (Class62) this.aClass349_2.aClass352_63.method7653((long) (this.anInt8311 |= arg4.anInt9458 << 29));
		}
		if (local107 == null || arg4.method8124(local107.ua(), local7) != 0) {
			if (local107 != null) {
				local7 = arg4.method8140(local7, local107.ua());
			}
			@Pc(134) int local134 = local7;
			if (this.aShortArray102 != null) {
				local134 = local7 | 0x4000;
			}
			if (this.aShortArray104 != null) {
				local134 |= 0x8000;
			}
			@Pc(157) Class334 local157 = Static111.method2111(this.anInt8317, this.aClass349_2.aClass34_113);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt8565 < 13) {
				local157.method7395();
			}
			local107 = arg4.method8072(local157, local134, this.aClass349_2.anInt8898, this.anInt8320 + 64, this.anInt8313 + 850);
			@Pc(190) int local190;
			if (this.aShortArray102 != null) {
				for (local190 = 0; local190 < this.aShortArray102.length; local190++) {
					local107.ia(this.aShortArray102[local190], this.aShortArray103[local190]);
				}
			}
			if (this.aShortArray104 != null) {
				for (local190 = 0; local190 < this.aShortArray104.length; local190++) {
					local107.aa(this.aShortArray104[local190], this.aShortArray101[local190]);
				}
			}
			local107.s(local7);
			@Pc(238) Class352 local238 = this.aClass349_2.aClass352_63;
			synchronized (this.aClass349_2.aClass352_63) {
				this.aClass349_2.aClass352_63.method7655((long) (this.anInt8311 |= arg4.anInt9458 << 29), local107);
			}
		}
		@Pc(282) Class62 local282 = local23 == null ? local107.method7329(arg6, local7, true) : local23.method2835(arg2, local7, arg10, arg6, 0, arg8, local107);
		if (this.anInt8318 != 128 || this.anInt8319 != 128) {
			local282.O(this.anInt8318, this.anInt8319, this.anInt8318);
		}
		if (this.anInt8310 != 0) {
			if (this.anInt8310 == 90) {
				local282.a(4096);
			}
			if (this.anInt8310 == 180) {
				local282.a(8192);
			}
			if (this.anInt8310 == 270) {
				local282.a(12288);
			}
		}
		if (local32) {
			local282.p(this.aByte115, this.anInt8312, arg7, arg11, arg9, arg12, arg1);
		}
		local282.s(arg3);
		return local282;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!aaa;ZBIILclient!ha;Lclient!s;ILclient!s;II)Lclient!ka;")
	public Class62 method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class33 arg5, @OriginalArg(8) Class42 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class42 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method7201(arg2, arg3, arg7, arg1, arg5, true, (byte) 2, arg6, arg4, arg10, arg0, arg8, arg9);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!es;)V")
	public void method7203(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8865();
			if (local11 == 0) {
				return;
			}
			this.method7204(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILclient!es;)V")
	private void method7204(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt8317 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt8322 = arg1.method8859();
		} else if (arg0 == 4) {
			this.anInt8318 = arg1.method8859();
		} else if (arg0 == 5) {
			this.anInt8319 = arg1.method8859();
		} else if (arg0 == 6) {
			this.anInt8310 = arg1.method8859();
		} else if (arg0 == 7) {
			this.anInt8320 = arg1.method8865();
		} else if (arg0 == 8) {
			this.anInt8313 = arg1.method8865();
		} else if (arg0 == 9) {
			this.aByte115 = 3;
			this.anInt8312 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean644 = true;
		} else if (arg0 == 11) {
			this.aByte115 = 1;
		} else if (arg0 == 12) {
			this.aByte115 = 4;
		} else if (arg0 == 13) {
			this.aByte115 = 5;
		} else if (arg0 == 14) {
			this.aByte115 = 2;
			this.anInt8312 = arg1.method8865() * 256;
		} else if (arg0 == 15) {
			this.aByte115 = 3;
			this.anInt8312 = arg1.method8859();
		} else if (arg0 == 16) {
			this.aByte115 = 3;
			this.anInt8312 = arg1.method8850();
			return;
		} else {
			@Pc(132) int local132;
			@Pc(142) int local142;
			if (arg0 == 40) {
				local132 = arg1.method8865();
				this.aShortArray102 = new short[local132];
				this.aShortArray103 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray102[local142] = (short) arg1.method8859();
					this.aShortArray103[local142] = (short) arg1.method8859();
				}
				return;
			}
			if (arg0 == 41) {
				local132 = arg1.method8865();
				this.aShortArray101 = new short[local132];
				this.aShortArray104 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray104[local142] = (short) arg1.method8859();
					this.aShortArray101[local142] = (short) arg1.method8859();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ha;BBLclient!aaa;III)Lclient!ka;")
	public Class62 method7205(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		return this.method7201(arg3, 0, arg6, arg0, arg1, false, arg2, (Class42) null, arg4, 0, arg5, (Class42) null, 0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ha;Lclient!aaa;IIIB)Lclient!ka;")
	public Class62 method7206(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method7201(arg2, 0, arg5, arg4, arg1, false, (byte) 2, (Class42) null, arg0, 0, arg3, (Class42) null, 0);
	}
}
