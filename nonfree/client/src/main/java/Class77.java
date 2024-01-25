import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class77 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public int anInt2227;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	private int anInt2230;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Lclient!as;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	private int anInt2232 = 0;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	private int anInt2233 = 128;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
	private int anInt2226 = -1;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "Z")
	public boolean aBoolean191 = false;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
	private int anInt2237 = 128;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
	private int anInt2239 = 0;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
	private int anInt2240 = 0;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	public int anInt2238 = -1;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "B")
	public byte aByte17 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!qa;IIIILclient!pp;I)Lclient!c;")
	public Class32 method1663(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class194 arg4, @OriginalArg(6) int arg5) {
		return this.method1665(0, (byte) 5, arg4, arg3, null, arg0, false, 0, arg1, arg2, null, arg5, 0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!md;B)V")
	public void method1664(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3737();
			if (local5 == 0) {
				return;
			}
			this.method1669(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBLclient!pp;IILclient!na;Lclient!qa;ZIIILclient!na;II)Lclient!c;")
	private Class32 method1665(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class194 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class106 arg4, @OriginalArg(6) Class26 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class106 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg8;
		@Pc(22) Class46 local22 = this.anInt2238 == -1 || arg9 == -1 ? null : arg2.method4371(this.anInt2238);
		@Pc(34) boolean local34 = arg6 & this.aByte17 != 0;
		if (local22 != null) {
			local7 = arg8 | local22.method1267(arg9, false, arg3);
		}
		if (local34) {
			local7 |= this.aByte17 == 3 ? 7 : 2;
		}
		if (this.anInt2237 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2233 != 128 || this.anInt2232 != 0) {
			local7 |= 0x5;
		}
		@Pc(90) Class129 local90 = this.aClass16_1.aClass129_2;
		@Pc(112) Class32 local112;
		synchronized (this.aClass16_1.aClass129_2) {
			local112 = (Class32) this.aClass16_1.aClass129_2.method3023((long) (this.anInt2227 |= arg5.anInt2873 << 29));
		}
		if (local112 == null || arg5.method2259(local112.n(), local7) != 0) {
			if (local112 != null) {
				local7 = arg5.method2285(local7, local112.n());
			}
			@Pc(139) int local139 = local7;
			if (this.aShortArray20 != null) {
				local139 = local7 | 0x4000;
			}
			if (this.aShortArray19 != null) {
				local139 |= 0x8000;
			}
			@Pc(162) Class266 local162 = Static92.method1558(this.aClass16_1.aClass188_8, this.anInt2230);
			if (local162 == null) {
				return null;
			}
			if (local162.anInt7819 < 13) {
				local162.method6061();
			}
			local112 = arg5.method2227(local162, local139, this.aClass16_1.anInt408, this.anInt2239 + 64, this.anInt2240 + 850);
			@Pc(197) int local197;
			if (this.aShortArray20 != null) {
				for (local197 = 0; local197 < this.aShortArray20.length; local197++) {
					local112.N(this.aShortArray20[local197], this.aShortArray22[local197]);
				}
			}
			if (this.aShortArray19 != null) {
				for (local197 = 0; local197 < this.aShortArray19.length; local197++) {
					local112.YA(this.aShortArray19[local197], this.aShortArray21[local197]);
				}
			}
			local112.u(local7);
			@Pc(253) Class129 local253 = this.aClass16_1.aClass129_2;
			synchronized (this.aClass16_1.aClass129_2) {
				this.aClass16_1.aClass129_2.method3029(local112, (long) (this.anInt2227 |= arg5.anInt2873 << 29));
			}
		}
		@Pc(297) Class32 local297 = local22 == null ? local112.method5678(arg1, local7, true) : local22.method1265(arg1, local112, local7, arg9, arg11, arg3, 0);
		if (this.anInt2233 != 128 || this.anInt2237 != 128) {
			local297.XA(this.anInt2233, this.anInt2237, this.anInt2233);
		}
		if (this.anInt2232 != 0) {
			if (this.anInt2232 == 90) {
				local297.k(4096);
			}
			if (this.anInt2232 == 180) {
				local297.k(8192);
			}
			if (this.anInt2232 == 270) {
				local297.k(12288);
			}
		}
		if (local34) {
			local297.ea(this.aByte17, this.anInt2226, arg4, arg10, arg12, arg7, arg0);
		}
		local297.u(arg8);
		return local297;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZILclient!na;IILclient!qa;IILclient!pp;Lclient!na;II)Lclient!c;")
	public Class32 method1666(@OriginalArg(0) int arg0, @OriginalArg(3) Class106 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class26 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class194 arg7, @OriginalArg(10) Class106 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method1665(arg5, (byte) 2, arg7, arg9, arg8, arg4, true, arg2, arg6, arg3, arg1, arg0, arg10);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!md;II)V")
	private void method1669(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2230 = arg0.method3711();
		} else if (arg1 == 2) {
			this.anInt2238 = arg0.method3711();
		} else if (arg1 == 4) {
			this.anInt2233 = arg0.method3711();
		} else if (arg1 == 5) {
			this.anInt2237 = arg0.method3711();
		} else if (arg1 == 6) {
			this.anInt2232 = arg0.method3711();
		} else if (arg1 == 7) {
			this.anInt2239 = arg0.method3737();
		} else if (arg1 == 8) {
			this.anInt2240 = arg0.method3737();
		} else if (arg1 == 9) {
			this.anInt2226 = 8224;
			this.aByte17 = 3;
		} else if (arg1 == 10) {
			this.aBoolean191 = true;
		} else if (arg1 == 11) {
			this.aByte17 = 1;
		} else if (arg1 == 12) {
			this.aByte17 = 4;
		} else if (arg1 == 13) {
			this.aByte17 = 5;
		} else if (arg1 == 14) {
			this.aByte17 = 2;
			this.anInt2226 = arg0.method3737() * 256;
		} else if (arg1 == 15) {
			this.aByte17 = 3;
			this.anInt2226 = arg0.method3711();
		} else if (arg1 == 16) {
			this.aByte17 = 3;
			this.anInt2226 = arg0.method3731();
		} else {
			@Pc(129) int local129;
			@Pc(139) int local139;
			if (arg1 == 40) {
				local129 = arg0.method3737();
				this.aShortArray20 = new short[local129];
				this.aShortArray22 = new short[local129];
				for (local139 = 0; local139 < local129; local139++) {
					this.aShortArray20[local139] = (short) arg0.method3711();
					this.aShortArray22[local139] = (short) arg0.method3711();
				}
			} else if (arg1 == 41) {
				local129 = arg0.method3737();
				this.aShortArray19 = new short[local129];
				this.aShortArray21 = new short[local129];
				for (local139 = 0; local139 < local129; local139++) {
					this.aShortArray19[local139] = (short) arg0.method3711();
					this.aShortArray21[local139] = (short) arg0.method3711();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lclient!qa;IIIILclient!pp;I)Lclient!c;")
	public Class32 method1670(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class194 arg4, @OriginalArg(6) int arg5) {
		return this.method1665(0, (byte) 2, arg4, arg1, null, arg0, false, 0, arg2, arg5, null, arg3, 0);
	}
}
