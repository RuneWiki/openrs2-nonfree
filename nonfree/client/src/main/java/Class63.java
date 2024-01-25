import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class63 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	private int anInt1700;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "Lclient!qj;")
	public Class203 aClass203_2;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
	private int anInt1704 = 0;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "B")
	public byte aByte14 = 0;

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
	private int anInt1710 = 128;

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
	private int anInt1711 = 0;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
	private int anInt1712 = -1;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	public int anInt1705 = -1;

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
	private int anInt1714 = 128;

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
	private int anInt1715 = 0;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!sb;IIIILclient!za;)Lclient!e;")
	public Class57 method1392(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class200 arg5) {
		return this.method1396(false, arg4, arg3, null, 0, arg2, arg0, arg1, arg5, 0, null, 0, (byte) 2);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!sb;IIIILclient!za;ZBLclient!ya;Lclient!ya;II)Lclient!e;")
	public Class57 method1393(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class200 arg6, @OriginalArg(9) Class125 arg7, @OriginalArg(10) Class125 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method1396(true, arg2, arg0, arg8, arg3, arg5, arg9, arg1, arg6, arg4, arg7, arg10, (byte) 2);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method1394(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt1700 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt1705 = arg1.method5598();
		} else if (arg0 == 4) {
			this.anInt1714 = arg1.method5598();
		} else if (arg0 == 5) {
			this.anInt1710 = arg1.method5598();
		} else if (arg0 == 6) {
			this.anInt1711 = arg1.method5598();
		} else if (arg0 == 7) {
			this.anInt1704 = arg1.method5539();
		} else if (arg0 == 8) {
			this.anInt1715 = arg1.method5539();
		} else if (arg0 == 9) {
			this.aByte14 = 3;
			this.anInt1712 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean114 = true;
		} else if (arg0 == 11) {
			this.aByte14 = 1;
		} else if (arg0 == 12) {
			this.aByte14 = 4;
		} else if (arg0 == 13) {
			this.aByte14 = 5;
		} else if (arg0 == 14) {
			this.aByte14 = 2;
			this.anInt1712 = arg1.method5539() * 256;
		} else if (arg0 == 15) {
			this.aByte14 = 3;
			this.anInt1712 = arg1.method5598();
		} else if (arg0 == 16) {
			this.aByte14 = 3;
			this.anInt1712 = arg1.method5603();
		} else {
			@Pc(154) int local154;
			@Pc(164) int local164;
			if (arg0 == 40) {
				local154 = arg1.method5539();
				this.aShortArray11 = new short[local154];
				this.aShortArray13 = new short[local154];
				for (local164 = 0; local164 < local154; local164++) {
					this.aShortArray13[local164] = (short) arg1.method5598();
					this.aShortArray11[local164] = (short) arg1.method5598();
				}
			} else if (arg0 == 41) {
				local154 = arg1.method5539();
				this.aShortArray10 = new short[local154];
				this.aShortArray12 = new short[local154];
				for (local164 = 0; local164 < local154; local164++) {
					this.aShortArray12[local164] = (short) arg1.method5598();
					this.aShortArray10[local164] = (short) arg1.method5598();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZIILclient!ya;IIILclient!sb;Lclient!za;IILclient!ya;IB)Lclient!e;")
	private Class57 method1396(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class125 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class219 arg7, @OriginalArg(8) Class200 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class125 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte arg12) {
		@Pc(12) int local12 = arg6;
		@Pc(28) Class143 local28 = this.anInt1705 == -1 || arg1 == -1 ? null : arg7.method4752(this.anInt1705);
		@Pc(40) boolean local40 = arg0 & this.aByte14 != 0;
		if (local28 != null) {
			local12 = arg6 | local28.method2992(arg5, arg1, false);
		}
		if (local40) {
			local12 |= this.aByte14 == 3 ? 7 : 2;
		}
		if (this.anInt1710 != 128) {
			local12 |= 0x2;
		}
		if (this.anInt1714 != 128 || this.anInt1711 != 0) {
			local12 |= 0x5;
		}
		@Pc(90) Class44 local90 = this.aClass203_2.aClass44_57;
		@Pc(112) Class57 local112;
		synchronized (this.aClass203_2.aClass44_57) {
			local112 = (Class57) this.aClass203_2.aClass44_57.method1028((long) (this.anInt1713 |= arg8.anInt7330 << 29));
		}
		if (local112 == null || arg8.method5860(local112.RA(), local12) != 0) {
			if (local112 != null) {
				local12 = arg8.method5879(local12, local112.RA());
			}
			@Pc(139) int local139 = local12;
			if (this.aShortArray13 != null) {
				local139 = local12 | 0x4000;
			}
			if (this.aShortArray12 != null) {
				local139 |= 0x8000;
			}
			@Pc(162) Class74 local162 = Static285.method3518(this.anInt1700, this.aClass203_2.aClass243_189);
			if (local162 == null) {
				return null;
			}
			if (local162.anInt1960 < 13) {
				local162.method1596();
			}
			local112 = arg8.method5882(local162, local139, this.aClass203_2.anInt5464, this.anInt1704 + 64, this.anInt1715 + 850);
			@Pc(195) int local195;
			if (this.aShortArray13 != null) {
				for (local195 = 0; local195 < this.aShortArray13.length; local195++) {
					local112.q(this.aShortArray13[local195], this.aShortArray11[local195]);
				}
			}
			if (this.aShortArray12 != null) {
				for (local195 = 0; local195 < this.aShortArray12.length; local195++) {
					local112.u(this.aShortArray12[local195], this.aShortArray10[local195]);
				}
			}
			local112.D(local12);
			@Pc(247) Class44 local247 = this.aClass203_2.aClass44_57;
			synchronized (this.aClass203_2.aClass44_57) {
				this.aClass203_2.aClass44_57.method1017((long) (this.anInt1713 |= arg8.anInt7330 << 29), local112);
			}
		}
		@Pc(291) Class57 local291 = local28 == null ? local112.method6066(arg12, local12, true) : local28.method2995(arg5, arg2, arg1, arg12, 0, local112, local12);
		if (this.anInt1714 != 128 || this.anInt1710 != 128) {
			local291.n(this.anInt1714, this.anInt1710, this.anInt1714);
		}
		if (this.anInt1711 != 0) {
			if (this.anInt1711 == 90) {
				local291.ma(4096);
			}
			if (this.anInt1711 == 180) {
				local291.ma(8192);
			}
			if (this.anInt1711 == 270) {
				local291.ma(12288);
			}
		}
		if (local40) {
			local291.da(this.aByte14, this.anInt1712, arg10, arg3, arg9, arg4, arg11);
		}
		local291.D(arg6);
		return local291;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method1397(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5539();
			if (local13 == 0) {
				return;
			}
			this.method1394(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIILclient!sb;BILclient!za;)Lclient!e;")
	public Class57 method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class219 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class200 arg5) {
		return this.method1396(false, arg1, arg4, null, 0, arg0, arg2, arg3, arg5, 0, null, 0, (byte) 5);
	}
}
