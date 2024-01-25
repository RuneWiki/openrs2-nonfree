import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class121 {

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
	public int anInt3209;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
	private int anInt3221;

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "Lclient!iu;")
	public Class123 aClass123_4;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
	private int anInt3210 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
	public int anInt3204 = -1;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
	private int anInt3211 = 128;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	private int anInt3217 = -1;

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "B")
	public byte aByte51 = 0;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
	private int anInt3207 = 0;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
	private int anInt3214 = 128;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
	private int anInt3212 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!wm;I)V")
	private void method2593(@OriginalArg(1) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3221 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt3204 = arg0.method2896();
		} else if (arg1 == 4) {
			this.anInt3214 = arg0.method2896();
		} else if (arg1 == 5) {
			this.anInt3211 = arg0.method2896();
		} else if (arg1 == 6) {
			this.anInt3207 = arg0.method2896();
		} else if (arg1 == 7) {
			this.anInt3212 = arg0.method2915();
		} else if (arg1 == 8) {
			this.anInt3210 = arg0.method2915();
		} else if (arg1 == 9) {
			this.aByte51 = 3;
			this.anInt3217 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean319 = true;
		} else if (arg1 == 11) {
			this.aByte51 = 1;
		} else if (arg1 == 12) {
			this.aByte51 = 4;
		} else if (arg1 == 13) {
			this.aByte51 = 5;
		} else if (arg1 == 14) {
			this.aByte51 = 2;
			this.anInt3217 = arg0.method2915() * 256;
		} else if (arg1 == 15) {
			this.aByte51 = 3;
			this.anInt3217 = arg0.method2896();
		} else if (arg1 == 16) {
			this.aByte51 = 3;
			this.anInt3217 = arg0.method2877();
		} else {
			@Pc(138) int local138;
			@Pc(148) int local148;
			if (arg1 == 40) {
				local138 = arg0.method2915();
				this.aShortArray40 = new short[local138];
				this.aShortArray39 = new short[local138];
				for (local148 = 0; local148 < local138; local148++) {
					this.aShortArray39[local148] = (short) arg0.method2896();
					this.aShortArray40[local148] = (short) arg0.method2896();
				}
			} else if (arg1 == 41) {
				local138 = arg0.method2915();
				this.aShortArray38 = new short[local138];
				this.aShortArray41 = new short[local138];
				for (local148 = 0; local148 < local138; local148++) {
					this.aShortArray38[local148] = (short) arg0.method2896();
					this.aShortArray41[local148] = (short) arg0.method2896();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!cf;Lclient!ya;Lclient!ya;ZIIILclient!za;IIII)Lclient!e;")
	public Class8 method2595(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class117 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method2597(true, arg6, arg10, arg3, arg4, arg0, arg7, (byte) 2, arg8, arg2, arg1, arg5, arg9);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZLclient!za;ILclient!ya;IIIBILclient!ya;Lclient!cf;III)Lclient!e;")
	private Class8 method2597(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class139 arg9, @OriginalArg(10) Class37 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(7) int local7 = arg5;
		@Pc(24) Class64 local24 = this.anInt3204 == -1 || arg4 == -1 ? null : arg10.method665(this.anInt3204);
		@Pc(33) boolean local33 = arg0 & this.aByte51 != 0;
		if (local24 != null) {
			local7 = arg5 | local24.method1059(arg12, false, arg4);
		}
		if (local33) {
			local7 |= this.aByte51 == 3 ? 7 : 2;
		}
		if (this.anInt3211 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3214 != 128 || this.anInt3207 != 0) {
			local7 |= 0x5;
		}
		@Pc(86) Class77 local86 = this.aClass123_4.aClass77_24;
		@Pc(112) Class8 local112;
		synchronized (this.aClass123_4.aClass77_24) {
			local112 = (Class8) this.aClass123_4.aClass77_24.method1387((long) (this.anInt3209 |= arg1.anInt7048 << 29));
		}
		if (local112 == null || arg1.method5732(local112.RA(), local7) != 0) {
			if (local112 != null) {
				local7 = arg1.method5696(local7, local112.RA());
			}
			@Pc(136) int local136 = local7;
			if (this.aShortArray39 != null) {
				local136 = local7 | 0x4000;
			}
			if (this.aShortArray38 != null) {
				local136 |= 0x8000;
			}
			@Pc(159) Class147 local159 = Static135.method1728(this.aClass123_4.aClass185_51, this.anInt3221);
			if (local159 == null) {
				return null;
			}
			if (local159.anInt4181 < 13) {
				local159.method3306();
			}
			local112 = arg1.method5678(local159, local136, this.aClass123_4.anInt3417, this.anInt3212 + 64, this.anInt3210 + 850);
			@Pc(194) int local194;
			if (this.aShortArray39 != null) {
				for (local194 = 0; local194 < this.aShortArray39.length; local194++) {
					local112.q(this.aShortArray39[local194], this.aShortArray40[local194]);
				}
			}
			if (this.aShortArray38 != null) {
				for (local194 = 0; local194 < this.aShortArray38.length; local194++) {
					local112.u(this.aShortArray38[local194], this.aShortArray41[local194]);
				}
			}
			local112.D(local7);
			@Pc(250) Class77 local250 = this.aClass123_4.aClass77_24;
			synchronized (this.aClass123_4.aClass77_24) {
				this.aClass123_4.aClass77_24.method1396(local112, (long) (this.anInt3209 |= arg1.anInt7048 << 29));
			}
		}
		@Pc(294) Class8 local294 = local24 == null ? local112.method5983(arg7, local7, true) : local24.method1052(arg12, local7, local112, arg8, arg4, 0, arg7);
		if (this.anInt3214 != 128 || this.anInt3211 != 128) {
			local294.n(this.anInt3214, this.anInt3211, this.anInt3214);
		}
		if (this.anInt3207 != 0) {
			if (this.anInt3207 == 90) {
				local294.ma(4096);
			}
			if (this.anInt3207 == 180) {
				local294.ma(8192);
			}
			if (this.anInt3207 == 270) {
				local294.ma(12288);
			}
		}
		if (local33) {
			local294.da(this.aByte51, this.anInt3217, arg9, arg3, arg11, arg6, arg2);
		}
		local294.D(arg5);
		return local294;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBLclient!za;IIILclient!cf;)Lclient!e;")
	public Class8 method2598(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		return this.method2597(false, arg1, 0, null, arg2, arg3, 0, (byte) 2, arg0, null, arg5, 0, arg4);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!wm;)V")
	public void method2600(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2915();
			if (local15 == 0) {
				return;
			}
			this.method2593(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIILclient!za;Lclient!cf;I)Lclient!e;")
	public Class8 method2601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class117 arg3, @OriginalArg(5) Class37 arg4, @OriginalArg(6) int arg5) {
		return this.method2597(false, arg3, 0, null, arg2, arg5, 0, (byte) 5, arg0, null, arg4, 0, arg1);
	}
}
