import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class93 {

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "Lclient!rk;")
	public Class292 aClass292_1;

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
	public int anInt2757;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!fda", name = "s", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!fda", name = "v", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!fda", name = "w", descriptor = "I")
	private int anInt2765;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "B")
	public byte aByte51 = 0;

	@OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
	private int anInt2760 = 0;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
	public int anInt2750 = -1;

	@OriginalMember(owner = "client!fda", name = "t", descriptor = "I")
	private int anInt2763 = 0;

	@OriginalMember(owner = "client!fda", name = "q", descriptor = "Z")
	public boolean aBoolean189 = false;

	@OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
	private int anInt2759 = 128;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
	private int anInt2761 = -1;

	@OriginalMember(owner = "client!fda", name = "u", descriptor = "I")
	private int anInt2764 = 0;

	@OriginalMember(owner = "client!fda", name = "x", descriptor = "I")
	private int anInt2766 = 128;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZIIIILclient!s;IIILclient!ha;Lclient!s;Lclient!wg;I)Lclient!ka;")
	public Class24 method2362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class199 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class100 arg7, @OriginalArg(10) Class199 arg8, @OriginalArg(11) Class373 arg9, @OriginalArg(12) int arg10) {
		return this.method2369(arg1, arg0, arg8, (byte) 2, arg3, arg10, arg5, arg7, arg4, arg6, arg9, arg2, true);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILclient!rg;)V")
	public void method2363(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8604();
			if (local17 == 0) {
				return;
			}
			this.method2368(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!ha;Lclient!wg;IIIII)Lclient!ka;")
	public Class24 method2365(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class373 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method2369(arg2, 0, (Class199) null, (byte) 5, arg3, arg5, 0, arg0, (Class199) null, arg4, arg1, 0, false);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIILclient!ha;ILclient!wg;I)Lclient!ka;")
	public Class24 method2366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class373 arg4, @OriginalArg(6) int arg5) {
		return this.method2369(arg0, 0, (Class199) null, (byte) 2, arg1, arg3, 0, arg2, (Class199) null, arg5, arg4, 0, false);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!rg;IB)V")
	private void method2368(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2765 = arg0.method8571();
		} else if (arg1 == 2) {
			this.anInt2750 = arg0.method8571();
		} else if (arg1 == 4) {
			this.anInt2766 = arg0.method8571();
		} else if (arg1 == 5) {
			this.anInt2759 = arg0.method8571();
		} else if (arg1 == 6) {
			this.anInt2760 = arg0.method8571();
		} else if (arg1 == 7) {
			this.anInt2764 = arg0.method8604();
		} else if (arg1 == 8) {
			this.anInt2763 = arg0.method8604();
		} else if (arg1 == 9) {
			this.aByte51 = 3;
			this.anInt2761 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean189 = true;
		} else if (arg1 == 11) {
			this.aByte51 = 1;
		} else if (arg1 == 12) {
			this.aByte51 = 4;
		} else if (arg1 == 13) {
			this.aByte51 = 5;
		} else if (arg1 == 14) {
			this.aByte51 = 2;
			this.anInt2761 = arg0.method8604() * 256;
		} else if (arg1 == 15) {
			this.aByte51 = 3;
			this.anInt2761 = arg0.method8571();
		} else if (arg1 == 16) {
			this.aByte51 = 3;
			this.anInt2761 = arg0.method8579();
		} else {
			@Pc(114) int local114;
			@Pc(124) int local124;
			if (arg1 == 40) {
				local114 = arg0.method8604();
				this.aShortArray55 = new short[local114];
				this.aShortArray54 = new short[local114];
				for (local124 = 0; local124 < local114; local124++) {
					this.aShortArray55[local124] = (short) arg0.method8571();
					this.aShortArray54[local124] = (short) arg0.method8571();
				}
			} else if (arg1 == 41) {
				local114 = arg0.method8604();
				this.aShortArray52 = new short[local114];
				this.aShortArray53 = new short[local114];
				for (local124 = 0; local124 < local114; local124++) {
					this.aShortArray52[local124] = (short) arg0.method8571();
					this.aShortArray53[local124] = (short) arg0.method8571();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZIILclient!s;BIIILclient!ha;Lclient!s;ILclient!wg;IZ)Lclient!ka;")
	private Class24 method2369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class199 arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100 arg7, @OriginalArg(9) Class199 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class373 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12) {
		@Pc(7) int local7 = arg5;
		@Pc(36) Class21 local36 = this.anInt2750 == -1 || arg9 == -1 ? null : arg10.method8738(this.anInt2750);
		@Pc(45) boolean local45 = arg12 & this.aByte51 != 0;
		if (local36 != null) {
			local7 = arg5 | local36.method352(arg9, false, arg0);
		}
		if (local45) {
			local7 |= this.aByte51 == 3 ? 7 : 2;
		}
		if (this.anInt2759 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2766 != 128 || this.anInt2760 != 0) {
			local7 |= 0x5;
		}
		@Pc(98) Class166 local98 = this.aClass292_1.aClass166_47;
		@Pc(118) Class24 local118;
		synchronized (this.aClass292_1.aClass166_47) {
			local118 = (Class24) this.aClass292_1.aClass166_47.method4805((long) (this.anInt2757 |= arg7.anInt10378 << 29));
		}
		if (local118 == null || arg7.method8821(local118.ua(), local7) != 0) {
			if (local118 != null) {
				local7 = arg7.method8820(local7, local118.ua());
			}
			@Pc(142) int local142 = local7;
			if (this.aShortArray55 != null) {
				local142 = local7 | 0x4000;
			}
			if (this.aShortArray52 != null) {
				local142 |= 0x8000;
			}
			@Pc(165) Class64 local165 = Static84.method1447(this.aClass292_1.aClass353_97, this.anInt2765);
			if (local165 == null) {
				return null;
			}
			if (local165.anInt1991 < 13) {
				local165.method1647();
			}
			local118 = arg7.method8770(local165, local142, this.aClass292_1.anInt8590, this.anInt2764 + 64, this.anInt2763 - -850);
			@Pc(200) int local200;
			if (this.aShortArray55 != null) {
				for (local200 = 0; local200 < this.aShortArray55.length; local200++) {
					local118.ia(this.aShortArray55[local200], this.aShortArray54[local200]);
				}
			}
			if (this.aShortArray52 != null) {
				for (local200 = 0; local200 < this.aShortArray52.length; local200++) {
					local118.aa(this.aShortArray52[local200], this.aShortArray53[local200]);
				}
			}
			local118.s(local7);
			@Pc(248) Class166 local248 = this.aClass292_1.aClass166_47;
			synchronized (this.aClass292_1.aClass166_47) {
				this.aClass292_1.aClass166_47.method4803(local118, (long) (this.anInt2757 |= arg7.anInt10378 << 29));
			}
		}
		@Pc(292) Class24 local292 = local36 == null ? local118.method6850(arg3, local7, true) : local36.method350(arg0, arg3, arg4, local7, local118, arg9, 0);
		if (this.anInt2766 != 128 || this.anInt2759 != 128) {
			local292.O(this.anInt2766, this.anInt2759, this.anInt2766);
		}
		if (this.anInt2760 != 0) {
			if (this.anInt2760 == 90) {
				local292.a(4096);
			}
			if (this.anInt2760 == 180) {
				local292.a(8192);
			}
			if (this.anInt2760 == 270) {
				local292.a(12288);
			}
		}
		if (local45) {
			local292.p(this.aByte51, this.anInt2761, arg2, arg8, arg11, arg1, arg6);
		}
		local292.s(arg5);
		return local292;
	}
}
