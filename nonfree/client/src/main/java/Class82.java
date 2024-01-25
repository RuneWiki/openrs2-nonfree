import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class82 {

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	public int anInt2047;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "Lclient!ag;")
	public Class10 aClass10_2;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	private int anInt2058;

	@OriginalMember(owner = "client!du", name = "v", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!du", name = "y", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "B")
	public byte aByte50 = 0;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	private int anInt2045 = 128;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	public int anInt2052 = -1;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "I")
	private int anInt2051 = 128;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	private int anInt2057 = 0;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	private int anInt2054 = -1;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	private int anInt2056 = 0;

	@OriginalMember(owner = "client!du", name = "x", descriptor = "I")
	private int anInt2060 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!ha;IIILclient!rca;I)Lclient!ka;")
	public Class187 method1684(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class298 arg4, @OriginalArg(6) int arg5) {
		return this.method1685((byte) 2, false, null, arg4, arg5, 0, null, arg2, arg3, 0, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BZLclient!s;Lclient!rca;IIILclient!s;IIIIILclient!ha;)Lclient!ka;")
	private Class187 method1685(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class298 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class61 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class133 arg12) {
		@Pc(7) int local7 = arg11;
		@Pc(23) Class362 local23 = this.anInt2052 == -1 || arg8 == -1 ? null : arg3.method7034(this.anInt2052);
		@Pc(32) boolean local32 = arg1 & this.aByte50 != 0;
		if (local23 != null) {
			local7 = arg11 | local23.method8561(false, arg8, arg7);
		}
		if (local32) {
			local7 |= this.aByte50 == 3 ? 7 : 2;
		}
		if (this.anInt2045 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2051 != 128 || this.anInt2056 != 0) {
			local7 |= 0x5;
		}
		@Pc(87) Class87 local87 = this.aClass10_2.aClass87_11;
		@Pc(107) Class187 local107;
		synchronized (this.aClass10_2.aClass87_11) {
			local107 = (Class187) this.aClass10_2.aClass87_11.method1805((long) (this.anInt2047 |= arg12.anInt8326 << 29));
		}
		if (local107 == null || arg12.method7296(local107.ua(), local7) != 0) {
			if (local107 != null) {
				local7 = arg12.method7292(local7, local107.ua());
			}
			@Pc(134) int local134 = local7;
			if (this.aShortArray42 != null) {
				local134 = local7 | 0x4000;
			}
			if (this.aShortArray43 != null) {
				local134 |= 0x8000;
			}
			@Pc(157) Class26 local157 = Static623.method8839(this.aClass10_2.aClass207_3, this.anInt2058);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt393 < 13) {
				local157.method335();
			}
			local107 = arg12.method7256(local157, local134, this.aClass10_2.anInt231, this.anInt2057 + 64, this.anInt2060 + 850);
			@Pc(190) int local190;
			if (this.aShortArray42 != null) {
				for (local190 = 0; local190 < this.aShortArray42.length; local190++) {
					local107.ia(this.aShortArray42[local190], this.aShortArray44[local190]);
				}
			}
			if (this.aShortArray43 != null) {
				for (local190 = 0; local190 < this.aShortArray43.length; local190++) {
					local107.aa(this.aShortArray43[local190], this.aShortArray41[local190]);
				}
			}
			local107.s(local7);
			@Pc(238) Class87 local238 = this.aClass10_2.aClass87_11;
			synchronized (this.aClass10_2.aClass87_11) {
				this.aClass10_2.aClass87_11.method1792((long) (this.anInt2047 |= arg12.anInt8326 << 29), local107);
			}
		}
		@Pc(282) Class187 local282 = local23 == null ? local107.method8656(arg0, local7, true) : local23.method8564(arg0, 0, arg4, arg8, local7, local107, arg7);
		if (this.anInt2051 != 128 || this.anInt2045 != 128) {
			local282.O(this.anInt2051, this.anInt2045, this.anInt2051);
		}
		if (this.anInt2056 != 0) {
			if (this.anInt2056 == 90) {
				local282.a(4096);
			}
			if (this.anInt2056 == 180) {
				local282.a(8192);
			}
			if (this.anInt2056 == 270) {
				local282.a(12288);
			}
		}
		if (local32) {
			local282.p(this.aByte50, this.anInt2054, arg2, arg6, arg9, arg5, arg10);
		}
		local282.s(arg11);
		return local282;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!ofa;I)V")
	private void method1686(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2058 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt2052 = arg0.method5968();
		} else if (arg1 == 4) {
			this.anInt2051 = arg0.method5968();
		} else if (arg1 == 5) {
			this.anInt2045 = arg0.method5968();
		} else if (arg1 == 6) {
			this.anInt2056 = arg0.method5968();
		} else if (arg1 == 7) {
			this.anInt2057 = arg0.method5966();
		} else if (arg1 == 8) {
			this.anInt2060 = arg0.method5966();
		} else if (arg1 == 9) {
			this.anInt2054 = 8224;
			this.aByte50 = 3;
		} else if (arg1 == 10) {
			this.aBoolean157 = true;
		} else if (arg1 == 11) {
			this.aByte50 = 1;
		} else if (arg1 == 12) {
			this.aByte50 = 4;
		} else if (arg1 == 13) {
			this.aByte50 = 5;
		} else if (arg1 == 14) {
			this.aByte50 = 2;
			this.anInt2054 = arg0.method5966() * 256;
		} else if (arg1 == 15) {
			this.aByte50 = 3;
			this.anInt2054 = arg0.method5968();
		} else if (arg1 == 16) {
			this.aByte50 = 3;
			this.anInt2054 = arg0.method5913();
		} else {
			@Pc(135) int local135;
			@Pc(145) int local145;
			if (arg1 == 40) {
				local135 = arg0.method5966();
				this.aShortArray42 = new short[local135];
				this.aShortArray44 = new short[local135];
				for (local145 = 0; local145 < local135; local145++) {
					this.aShortArray42[local145] = (short) arg0.method5968();
					this.aShortArray44[local145] = (short) arg0.method5968();
				}
			} else if (arg1 == 41) {
				local135 = arg0.method5966();
				this.aShortArray41 = new short[local135];
				this.aShortArray43 = new short[local135];
				for (local145 = 0; local145 < local135; local145++) {
					this.aShortArray43[local145] = (short) arg0.method5968();
					this.aShortArray41[local145] = (short) arg0.method5968();
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!rca;IILclient!ha;III)Lclient!ka;")
	public Class187 method1687(@OriginalArg(0) Class298 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method1685((byte) 5, false, null, arg0, arg2, 0, null, arg1, arg4, 0, 0, arg5, arg3);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!ofa;)V")
	public void method1688(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(27) int local27 = arg0.method5966();
			if (local27 == 0) {
				return;
			}
			this.method1686(arg0, local27);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IILclient!s;Lclient!rca;Lclient!ha;IZIIILclient!s;IB)Lclient!ka;")
	public Class187 method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class298 arg3, @OriginalArg(4) Class133 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class61 arg9, @OriginalArg(11) int arg10) {
		return this.method1685((byte) 2, true, arg9, arg3, arg7, arg10, arg2, arg0, arg5, arg1, arg6, arg8, arg4);
	}
}
