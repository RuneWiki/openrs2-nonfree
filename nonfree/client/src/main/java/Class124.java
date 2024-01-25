import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class124 {

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
	private int anInt4158;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "Lclient!sk;")
	public Class312 aClass312_1;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	public int anInt4169;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public int anInt4155 = -1;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Z")
	public boolean aBoolean336 = false;

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
	private int anInt4161 = 0;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	private int anInt4160 = 128;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	private int anInt4163 = -1;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
	private int anInt4168 = 0;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "B")
	public byte aByte36 = 0;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
	private int anInt4159 = 0;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	private int anInt4164 = 128;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ha;IIILclient!me;II)Lclient!ka;")
	public Class92 method3522(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class198 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method3524(arg2, arg5, 0, arg1, (Class245) null, (Class245) null, 0, (byte) 5, arg3, arg0, false, 0, arg4);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ha;Lclient!me;IIIZLclient!s;IILclient!s;IIB)Lclient!ka;")
	public Class92 method3523(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class245 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class245 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return this.method3524(arg3, arg2, arg6, arg10, arg8, arg5, arg4, (byte) 2, arg1, arg0, true, arg9, arg7);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIILclient!s;Lclient!s;IBLclient!me;ZLclient!ha;ZII)Lclient!ka;")
	private Class92 method3524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class245 arg4, @OriginalArg(5) Class245 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class198 arg8, @OriginalArg(10) Class5 arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg0;
		@Pc(23) Class113 local23 = this.anInt4155 == -1 || arg1 == -1 ? null : arg8.method5706(this.anInt4155);
		@Pc(35) boolean local35 = arg10 & this.aByte36 != 0;
		if (local23 != null) {
			local7 = arg0 | local23.method3263(false, arg1, arg3);
		}
		if (local35) {
			local7 |= this.aByte36 == 3 ? 7 : 2;
		}
		if (this.anInt4160 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4164 != 128 || this.anInt4168 != 0) {
			local7 |= 0x5;
		}
		@Pc(94) Class94 local94 = this.aClass312_1.aClass94_56;
		@Pc(114) Class92 local114;
		synchronized (this.aClass312_1.aClass94_56) {
			local114 = (Class92) this.aClass312_1.aClass94_56.method2960((long) (this.anInt4169 |= arg9.anInt7303 << 29));
		}
		if (local114 == null || arg9.method6147(local114.ua(), local7) != 0) {
			if (local114 != null) {
				local7 = arg9.method6140(local7, local114.ua());
			}
			@Pc(138) int local138 = local7;
			if (this.aShortArray51 != null) {
				local138 = local7 | 0x4000;
			}
			if (this.aShortArray49 != null) {
				local138 |= 0x8000;
			}
			@Pc(161) Class192 local161 = Static63.method1779(this.aClass312_1.aClass223_123, this.anInt4158);
			if (local161 == null) {
				return null;
			}
			if (local161.anInt6632 < 13) {
				local161.method5549();
			}
			local114 = arg9.method6153(local161, local138, this.aClass312_1.anInt9193, this.anInt4159 + 64, this.anInt4161 + 850);
			@Pc(194) int local194;
			if (this.aShortArray51 != null) {
				for (local194 = 0; local194 < this.aShortArray51.length; local194++) {
					local114.ia(this.aShortArray51[local194], this.aShortArray50[local194]);
				}
			}
			if (this.aShortArray49 != null) {
				for (local194 = 0; local194 < this.aShortArray49.length; local194++) {
					local114.aa(this.aShortArray49[local194], this.aShortArray48[local194]);
				}
			}
			local114.s(local7);
			@Pc(242) Class94 local242 = this.aClass312_1.aClass94_56;
			synchronized (this.aClass312_1.aClass94_56) {
				this.aClass312_1.aClass94_56.method2963((long) (this.anInt4169 |= arg9.anInt7303 << 29), local114);
			}
		}
		@Pc(286) Class92 local286 = local23 == null ? local114.method7069(arg7, local7, true) : local23.method3261(arg7, 0, arg1, local7, arg3, local114, arg12);
		if (this.anInt4164 != 128 || this.anInt4160 != 128) {
			local286.O(this.anInt4164, this.anInt4160, this.anInt4164);
		}
		if (this.anInt4168 != 0) {
			if (this.anInt4168 == 90) {
				local286.a(4096);
			}
			if (this.anInt4168 == 180) {
				local286.a(8192);
			}
			if (this.anInt4168 == 270) {
				local286.a(12288);
			}
		}
		if (local35) {
			local286.p(this.aByte36, this.anInt4163, arg4, arg5, arg6, arg2, arg11);
		}
		local286.s(arg0);
		return local286;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!ji;)V")
	public void method3526(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(27) int local27 = arg0.method8246();
			if (local27 == 0) {
				return;
			}
			this.method3528(arg0, local27);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method3528(@OriginalArg(1) Class6_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4158 = arg0.method8220();
		} else if (arg1 == 2) {
			this.anInt4155 = arg0.method8220();
		} else if (arg1 == 4) {
			this.anInt4164 = arg0.method8220();
		} else if (arg1 == 5) {
			this.anInt4160 = arg0.method8220();
		} else if (arg1 == 6) {
			this.anInt4168 = arg0.method8220();
		} else if (arg1 == 7) {
			this.anInt4159 = arg0.method8246();
		} else if (arg1 == 8) {
			this.anInt4161 = arg0.method8246();
		} else if (arg1 == 9) {
			this.anInt4163 = 8224;
			this.aByte36 = 3;
		} else if (arg1 == 10) {
			this.aBoolean336 = true;
		} else if (arg1 == 11) {
			this.aByte36 = 1;
		} else if (arg1 == 12) {
			this.aByte36 = 4;
		} else if (arg1 == 13) {
			this.aByte36 = 5;
		} else if (arg1 == 14) {
			this.aByte36 = 2;
			this.anInt4163 = arg0.method8246() * 256;
		} else if (arg1 == 15) {
			this.aByte36 = 3;
			this.anInt4163 = arg0.method8220();
		} else if (arg1 == 16) {
			this.aByte36 = 3;
			this.anInt4163 = arg0.method8236();
		} else {
			@Pc(160) int local160;
			@Pc(170) int local170;
			if (arg1 == 40) {
				local160 = arg0.method8246();
				this.aShortArray50 = new short[local160];
				this.aShortArray51 = new short[local160];
				for (local170 = 0; local170 < local160; local170++) {
					this.aShortArray51[local170] = (short) arg0.method8220();
					this.aShortArray50[local170] = (short) arg0.method8220();
				}
			} else if (arg1 == 41) {
				local160 = arg0.method8246();
				this.aShortArray49 = new short[local160];
				this.aShortArray48 = new short[local160];
				for (local170 = 0; local170 < local160; local170++) {
					this.aShortArray49[local170] = (short) arg0.method8220();
					this.aShortArray48[local170] = (short) arg0.method8220();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!me;IIBILclient!ha;)Lclient!ka;")
	public Class92 method3529(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		return this.method3524(arg2, arg0, 0, arg4, (Class245) null, (Class245) null, 0, (byte) 2, arg1, arg5, false, 0, arg3);
	}
}
