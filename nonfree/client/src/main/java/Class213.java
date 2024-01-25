import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class213 {

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
	private int anInt6002;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Lclient!qa;")
	public Class279 aClass279_3;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
	public int anInt6018;

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	private int anInt6005 = 0;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
	private int anInt6011 = 128;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
	public int anInt6006 = -1;

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "B")
	public byte aByte100 = 0;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
	private int anInt6012 = 0;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
	private int anInt6017 = 0;

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
	private int anInt6016 = 128;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
	private int anInt6010 = -1;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!pd;IBIIILclient!ha;I)Lclient!ka;")
	public Class184 method5112(@OriginalArg(0) Class268 arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class132 arg5, @OriginalArg(7) int arg6) {
		return this.method5115(arg4, arg2, 0, arg5, 0, arg1, arg3, 0, arg0, (Class12) null, (Class12) null, arg6, false);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!s;IZILclient!pd;IILclient!s;IILclient!ha;)Lclient!ka;")
	public Class184 method5114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class268 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class12 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class132 arg10) {
		return this.method5115(arg8, arg6, arg1, arg10, arg0, (byte) 2, arg9, arg3, arg5, arg7, arg2, arg4, true);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIILclient!ha;IBIILclient!pd;Lclient!s;Lclient!s;IZB)Lclient!ka;")
	private Class184 method5115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class268 arg8, @OriginalArg(9) Class12 arg9, @OriginalArg(10) Class12 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		@Pc(7) int local7 = arg1;
		@Pc(23) Class119 local23 = this.anInt6006 == -1 || arg6 == -1 ? null : arg8.method6469(this.anInt6006);
		@Pc(32) boolean local32 = arg12 & this.aByte100 != 0;
		if (local23 != null) {
			local7 = arg1 | local23.method2502(arg11, false, arg6);
		}
		if (local32) {
			local7 |= this.aByte100 == 3 ? 7 : 2;
		}
		if (this.anInt6016 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6011 != 128 || this.anInt6005 != 0) {
			local7 |= 0x5;
		}
		@Pc(78) Class10 local78 = this.aClass279_3.aClass10_49;
		@Pc(103) Class184 local103;
		synchronized (this.aClass279_3.aClass10_49) {
			local103 = (Class184) this.aClass279_3.aClass10_49.method373((long) (this.anInt6018 |= arg3.anInt8773 << 29));
		}
		if (local103 == null || arg3.method7509(local103.ua(), local7) != 0) {
			if (local103 != null) {
				local7 = arg3.method7448(local7, local103.ua());
			}
			@Pc(127) int local127 = local7;
			if (this.aShortArray76 != null) {
				local127 = local7 | 0x4000;
			}
			if (this.aShortArray74 != null) {
				local127 |= 0x8000;
			}
			@Pc(150) Class22 local150 = Static308.method4413(this.anInt6002, this.aClass279_3.aClass8_115);
			if (local150 == null) {
				return null;
			}
			if (local150.anInt512 < 13) {
				local150.method534();
			}
			local103 = arg3.method7475(local150, local127, this.aClass279_3.anInt8076, this.anInt6012 + 64, this.anInt6017 + 850);
			@Pc(185) int local185;
			if (this.aShortArray76 != null) {
				for (local185 = 0; local185 < this.aShortArray76.length; local185++) {
					local103.ia(this.aShortArray76[local185], this.aShortArray73[local185]);
				}
			}
			if (this.aShortArray74 != null) {
				for (local185 = 0; local185 < this.aShortArray74.length; local185++) {
					local103.aa(this.aShortArray74[local185], this.aShortArray75[local185]);
				}
			}
			local103.s(local7);
			@Pc(237) Class10 local237 = this.aClass279_3.aClass10_49;
			synchronized (this.aClass279_3.aClass10_49) {
				this.aClass279_3.aClass10_49.method366(local103, (long) (this.anInt6018 |= arg3.anInt8773 << 29));
			}
		}
		@Pc(281) Class184 local281 = local23 == null ? local103.method8660(arg5, local7, true) : local23.method2501(0, arg5, arg6, arg11, local103, local7, arg0);
		if (this.anInt6011 != 128 || this.anInt6016 != 128) {
			local281.O(this.anInt6011, this.anInt6016, this.anInt6011);
		}
		if (this.anInt6005 != 0) {
			if (this.anInt6005 == 90) {
				local281.a(4096);
			}
			if (this.anInt6005 == 180) {
				local281.a(8192);
			}
			if (this.anInt6005 == 270) {
				local281.a(12288);
			}
		}
		if (local32) {
			local281.p(this.aByte100, this.anInt6010, arg9, arg10, arg4, arg7, arg2);
		}
		local281.s(arg1);
		return local281;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ha;ZIIIILclient!pd;)Lclient!ka;")
	public Class184 method5117(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class268 arg5) {
		return this.method5115(arg2, arg3, 0, arg0, 0, (byte) 2, arg4, 0, arg5, (Class12) null, (Class12) null, arg1, false);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!gga;I)V")
	private void method5118(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt6002 = arg1.method8363();
		} else if (arg0 == 2) {
			this.anInt6006 = arg1.method8363();
		} else if (arg0 == 4) {
			this.anInt6011 = arg1.method8363();
		} else if (arg0 == 5) {
			this.anInt6016 = arg1.method8363();
		} else if (arg0 == 6) {
			this.anInt6005 = arg1.method8363();
		} else if (arg0 == 7) {
			this.anInt6012 = arg1.method8374();
		} else if (arg0 == 8) {
			this.anInt6017 = arg1.method8374();
		} else if (arg0 == 9) {
			this.anInt6010 = 8224;
			this.aByte100 = 3;
		} else if (arg0 == 10) {
			this.aBoolean398 = true;
		} else if (arg0 == 11) {
			this.aByte100 = 1;
		} else if (arg0 == 12) {
			this.aByte100 = 4;
		} else if (arg0 == 13) {
			this.aByte100 = 5;
		} else if (arg0 == 14) {
			this.aByte100 = 2;
			this.anInt6010 = arg1.method8374() * 256;
		} else if (arg0 == 15) {
			this.aByte100 = 3;
			this.anInt6010 = arg1.method8363();
		} else if (arg0 == 16) {
			this.aByte100 = 3;
			this.anInt6010 = arg1.method8369();
		} else {
			@Pc(124) int local124;
			@Pc(134) int local134;
			if (arg0 == 40) {
				local124 = arg1.method8374();
				this.aShortArray73 = new short[local124];
				this.aShortArray76 = new short[local124];
				for (local134 = 0; local134 < local124; local134++) {
					this.aShortArray76[local134] = (short) arg1.method8363();
					this.aShortArray73[local134] = (short) arg1.method8363();
				}
			} else if (arg0 == 41) {
				local124 = arg1.method8374();
				this.aShortArray75 = new short[local124];
				this.aShortArray74 = new short[local124];
				for (local134 = 0; local134 < local124; local134++) {
					this.aShortArray74[local134] = (short) arg1.method8363();
					this.aShortArray75[local134] = (short) arg1.method8363();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!gga;)V")
	public void method5119(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8374();
			if (local5 == 0) {
				return;
			}
			this.method5118(local5, arg0);
		}
	}
}
