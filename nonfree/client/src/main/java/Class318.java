import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class318 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	private int anInt8772;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	public int anInt8779;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "Lclient!pw;")
	public Class275 aClass275_2;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "B")
	public byte aByte98 = 0;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Z")
	public boolean aBoolean610 = false;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
	private int anInt8782 = 0;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
	private int anInt8773 = -1;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	private int anInt8778 = 128;

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
	private int anInt8786 = 128;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
	public int anInt8788 = -1;

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
	private int anInt8789 = 0;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
	private int anInt8784 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLclient!oa;Lclient!d;BIILclient!d;ILclient!uc;IIII)Lclient!ba;")
	public Class9 method7215(@OriginalArg(1) Class66 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class16 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class327 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method7220(arg3, arg1, arg5, true, arg6, arg7, arg9, arg2, arg0, arg4, arg10, (byte) 2, arg8);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method7216(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6015();
			if (local13 == 0) {
				return;
			}
			this.method7219(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!uc;ILclient!oa;IIII)Lclient!ba;")
	public Class9 method7217(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method7220(0, null, arg1, false, arg0, arg4, 0, arg5, arg2, null, arg3, (byte) 5, 0);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!uc;IIIILclient!oa;)Lclient!ba;")
	public Class9 method7218(@OriginalArg(0) int arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class66 arg5) {
		return this.method7220(0, null, arg4, false, arg1, arg2, 0, arg0, arg5, null, arg3, (byte) 2, 0);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!eh;)V")
	private void method7219(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt8772 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt8788 = arg1.method5982();
		} else if (arg0 == 4) {
			this.anInt8786 = arg1.method5982();
		} else if (arg0 == 5) {
			this.anInt8778 = arg1.method5982();
		} else if (arg0 == 6) {
			this.anInt8784 = arg1.method5982();
		} else if (arg0 == 7) {
			this.anInt8789 = arg1.method6015();
		} else if (arg0 == 8) {
			this.anInt8782 = arg1.method6015();
		} else if (arg0 == 9) {
			this.anInt8773 = 8224;
			this.aByte98 = 3;
		} else if (arg0 == 10) {
			this.aBoolean610 = true;
		} else if (arg0 == 11) {
			this.aByte98 = 1;
		} else if (arg0 == 12) {
			this.aByte98 = 4;
		} else if (arg0 == 13) {
			this.aByte98 = 5;
		} else if (arg0 == 14) {
			this.aByte98 = 2;
			this.anInt8773 = arg1.method6015() * 256;
		} else if (arg0 == 15) {
			this.aByte98 = 3;
			this.anInt8773 = arg1.method5982();
		} else if (arg0 == 16) {
			this.aByte98 = 3;
			this.anInt8773 = arg1.method6026();
		} else {
			@Pc(137) int local137;
			@Pc(147) int local147;
			if (arg0 == 40) {
				local137 = arg1.method6015();
				this.aShortArray144 = new short[local137];
				this.aShortArray145 = new short[local137];
				for (local147 = 0; local147 < local137; local147++) {
					this.aShortArray144[local147] = (short) arg1.method5982();
					this.aShortArray145[local147] = (short) arg1.method5982();
				}
			} else if (arg0 == 41) {
				local137 = arg1.method6015();
				this.aShortArray142 = new short[local137];
				this.aShortArray143 = new short[local137];
				for (local147 = 0; local147 < local137; local147++) {
					this.aShortArray143[local147] = (short) arg1.method5982();
					this.aShortArray142[local147] = (short) arg1.method5982();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!d;IZLclient!uc;IIILclient!oa;Lclient!d;IBII)Lclient!ba;")
	private Class9 method7220(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class327 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class66 arg8, @OriginalArg(9) Class16 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12) {
		@Pc(7) int local7 = arg7;
		@Pc(25) Class77 local25 = this.anInt8788 == -1 || arg2 == -1 ? null : arg4.method7326(this.anInt8788);
		@Pc(37) boolean local37 = arg3 & this.aByte98 != 0;
		if (local25 != null) {
			local7 = arg7 | local25.method2295(false, arg5, arg2);
		}
		if (local37) {
			local7 |= this.aByte98 == 3 ? 7 : 2;
		}
		if (this.anInt8778 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt8786 != 128 || this.anInt8784 != 0) {
			local7 |= 0x5;
		}
		@Pc(88) Class223 local88 = this.aClass275_2.aClass223_50;
		@Pc(108) Class9 local108;
		synchronized (this.aClass275_2.aClass223_50) {
			local108 = (Class9) this.aClass275_2.aClass223_50.method4943((long) (this.anInt8779 |= arg8.anInt8223 << 29));
		}
		if (local108 == null || arg8.method6831(local108.h(), local7) != 0) {
			if (local108 != null) {
				local7 = arg8.method6818(local7, local108.h());
			}
			@Pc(140) int local140 = local7;
			if (this.aShortArray144 != null) {
				local140 = local7 | 0x4000;
			}
			if (this.aShortArray143 != null) {
				local140 |= 0x8000;
			}
			@Pc(163) Class266 local163 = Static329.method4945(this.aClass275_2.aClass31_93, this.anInt8772);
			if (local163 == null) {
				return null;
			}
			if (local163.anInt7035 < 13) {
				local163.method5852();
			}
			local108 = arg8.method6779(local163, local140, this.aClass275_2.anInt7300, this.anInt8789 + 64, this.anInt8782 - -850);
			@Pc(198) int local198;
			if (this.aShortArray144 != null) {
				for (local198 = 0; local198 < this.aShortArray144.length; local198++) {
					local108.UA(this.aShortArray144[local198], this.aShortArray145[local198]);
				}
			}
			if (this.aShortArray143 != null) {
				for (local198 = 0; local198 < this.aShortArray143.length; local198++) {
					local108.ka(this.aShortArray143[local198], this.aShortArray142[local198]);
				}
			}
			local108.ia(local7);
			@Pc(250) Class223 local250 = this.aClass275_2.aClass223_50;
			synchronized (this.aClass275_2.aClass223_50) {
				this.aClass275_2.aClass223_50.method4938((long) (this.anInt8779 |= arg8.anInt8223 << 29), local108);
			}
		}
		@Pc(294) Class9 local294 = local25 == null ? local108.method4006(arg11, local7, true) : local25.method2292(arg5, 0, local7, arg10, arg11, arg2, local108);
		if (this.anInt8786 != 128 || this.anInt8778 != 128) {
			local294.l(this.anInt8786, this.anInt8778, this.anInt8786);
		}
		if (this.anInt8784 != 0) {
			if (this.anInt8784 == 90) {
				local294.I(4096);
			}
			if (this.anInt8784 == 180) {
				local294.I(8192);
			}
			if (this.anInt8784 == 270) {
				local294.I(12288);
			}
		}
		if (local37) {
			local294.OA(this.aByte98, this.anInt8773, arg1, arg9, arg12, arg6, arg0);
		}
		local294.ia(arg7);
		return local294;
	}
}
