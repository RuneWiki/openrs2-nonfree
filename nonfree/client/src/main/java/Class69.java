import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class69 {

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
	public int anInt1808;

	@OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!dfa", name = "n", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!dfa", name = "q", descriptor = "Lclient!vfa;")
	public Class356 aClass356_1;

	@OriginalMember(owner = "client!dfa", name = "u", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!dfa", name = "x", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!dfa", name = "e", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
	private int anInt1813 = 0;

	@OriginalMember(owner = "client!dfa", name = "j", descriptor = "B")
	public byte aByte45 = 0;

	@OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
	private int anInt1811 = 128;

	@OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
	private int anInt1819 = 128;

	@OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
	private int anInt1818 = 0;

	@OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
	private int anInt1821 = 0;

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "I")
	public int anInt1820 = -1;

	@OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
	private int anInt1816 = -1;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!ud;ZI)V")
	private void method1575(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1815 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt1820 = arg0.method6884();
		} else if (arg1 == 4) {
			this.anInt1811 = arg0.method6884();
		} else if (arg1 == 5) {
			this.anInt1819 = arg0.method6884();
		} else if (arg1 == 6) {
			this.anInt1818 = arg0.method6884();
		} else if (arg1 == 7) {
			this.anInt1813 = arg0.method6904();
		} else if (arg1 == 8) {
			this.anInt1821 = arg0.method6904();
		} else if (arg1 == 9) {
			this.anInt1816 = 8224;
			this.aByte45 = 3;
		} else if (arg1 == 10) {
			this.aBoolean152 = true;
		} else if (arg1 == 11) {
			this.aByte45 = 1;
		} else if (arg1 == 12) {
			this.aByte45 = 4;
		} else if (arg1 == 13) {
			this.aByte45 = 5;
		} else if (arg1 == 14) {
			this.aByte45 = 2;
			this.anInt1816 = arg0.method6904() * 256;
		} else if (arg1 == 15) {
			this.aByte45 = 3;
			this.anInt1816 = arg0.method6884();
		} else if (arg1 == 16) {
			this.aByte45 = 3;
			this.anInt1816 = arg0.method6865();
		} else {
			@Pc(132) int local132;
			@Pc(142) int local142;
			if (arg1 == 40) {
				local132 = arg0.method6904();
				this.aShortArray26 = new short[local132];
				this.aShortArray25 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray26[local142] = (short) arg0.method6884();
					this.aShortArray25[local142] = (short) arg0.method6884();
				}
			} else if (arg1 == 41) {
				local132 = arg0.method6904();
				this.aShortArray24 = new short[local132];
				this.aShortArray27 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray27[local142] = (short) arg0.method6884();
					this.aShortArray24[local142] = (short) arg0.method6884();
				}
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILclient!s;ILclient!s;Lclient!sd;IIIZIIBLclient!ha;)Lclient!ka;")
	private Class25 method1576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class112 arg4, @OriginalArg(5) Class303 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(12) byte arg11, @OriginalArg(13) Class87 arg12) {
		@Pc(5) int local5 = arg1;
		@Pc(21) Class149 local21 = this.anInt1820 == -1 || arg8 == -1 ? null : arg5.method7201(this.anInt1820);
		@Pc(33) boolean local33 = arg9 & this.aByte45 != 0;
		if (local21 != null) {
			local5 = arg1 | local21.method3741(arg6, arg8, false);
		}
		if (local33) {
			local5 |= this.aByte45 == 3 ? 7 : 2;
		}
		if (this.anInt1819 != 128) {
			local5 |= 0x2;
		}
		if (this.anInt1811 != 128 || this.anInt1818 != 0) {
			local5 |= 0x5;
		}
		@Pc(86) Class233 local86 = this.aClass356_1.aClass233_59;
		@Pc(106) Class25 local106;
		synchronized (this.aClass356_1.aClass233_59) {
			local106 = (Class25) this.aClass356_1.aClass233_59.method5669((long) (this.anInt1808 |= arg12.anInt9444 << 29));
		}
		if (local106 == null || arg12.method7950(local106.ua(), local5) != 0) {
			if (local106 != null) {
				local5 = arg12.method7952(local5, local106.ua());
			}
			@Pc(133) int local133 = local5;
			if (this.aShortArray26 != null) {
				local133 = local5 | 0x4000;
			}
			if (this.aShortArray27 != null) {
				local133 |= 0x8000;
			}
			@Pc(156) Class379 local156 = Static614.method8359(this.anInt1815, this.aClass356_1.aClass97_146);
			if (local156 == null) {
				return null;
			}
			if (local156.anInt10284 < 13) {
				local156.method8586();
			}
			local106 = arg12.method7975(local156, local133, this.aClass356_1.anInt9848, this.anInt1813 + 64, this.anInt1821 + 850);
			@Pc(189) int local189;
			if (this.aShortArray26 != null) {
				for (local189 = 0; local189 < this.aShortArray26.length; local189++) {
					local106.ia(this.aShortArray26[local189], this.aShortArray25[local189]);
				}
			}
			if (this.aShortArray27 != null) {
				for (local189 = 0; local189 < this.aShortArray27.length; local189++) {
					local106.aa(this.aShortArray27[local189], this.aShortArray24[local189]);
				}
			}
			local106.s(local5);
			@Pc(239) Class233 local239 = this.aClass356_1.aClass233_59;
			synchronized (this.aClass356_1.aClass233_59) {
				this.aClass356_1.aClass233_59.method5662(local106, (long) (this.anInt1808 |= arg12.anInt9444 << 29));
			}
		}
		@Pc(283) Class25 local283 = local21 == null ? local106.method7732(arg11, local5, true) : local21.method3737(local106, arg8, 0, arg3, arg6, local5, arg11);
		if (this.anInt1811 != 128 || this.anInt1819 != 128) {
			local283.O(this.anInt1811, this.anInt1819, this.anInt1811);
		}
		if (this.anInt1818 != 0) {
			if (this.anInt1818 == 90) {
				local283.a(4096);
			}
			if (this.anInt1818 == 180) {
				local283.a(8192);
			}
			if (this.anInt1818 == 270) {
				local283.a(12288);
			}
		}
		if (local33) {
			local283.p(this.aByte45, this.anInt1816, arg4, arg2, arg7, arg0, arg10);
		}
		local283.s(arg1);
		return local283;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLclient!ud;)V")
	public void method1577(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6904();
			if (local13 == 0) {
				return;
			}
			this.method1575(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIILclient!sd;ILclient!ha;I)Lclient!ka;")
	public Class25 method1579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class303 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class87 arg4, @OriginalArg(6) int arg5) {
		return this.method1576(0, arg0, null, arg3, null, arg2, arg5, 0, arg1, false, 0, (byte) 5, arg4);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILclient!ha;IILclient!sd;I)Lclient!ka;")
	public Class25 method1581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class87 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class303 arg5) {
		return this.method1576(0, arg4, null, arg0, null, arg5, arg3, 0, arg1, false, 0, (byte) 2, arg2);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIIIILclient!sd;Lclient!s;ZLclient!ha;Lclient!s;)Lclient!ka;")
	public Class25 method1583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class303 arg7, @OriginalArg(9) Class112 arg8, @OriginalArg(11) Class87 arg9, @OriginalArg(12) Class112 arg10) {
		return this.method1576(arg5, arg4, arg8, arg0, arg10, arg7, arg2, arg3, arg1, true, arg6, (byte) 2, arg9);
	}
}
