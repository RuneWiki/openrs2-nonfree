import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class144 {

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
	public int anInt4326;

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
	private int anInt4327;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "Lclient!nfa;")
	public Class236 aClass236_1;

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "B")
	public byte aByte62 = 0;

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
	private int anInt4317 = 0;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
	private int anInt4321 = 128;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
	public int anInt4332 = -1;

	@OriginalMember(owner = "client!ht", name = "A", descriptor = "Z")
	public boolean aBoolean324 = false;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
	private int anInt4328 = -1;

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
	private int anInt4333 = 128;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	private int anInt4320 = 0;

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
	private int anInt4325 = 0;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!jp;BI)V")
	private void method3922(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4327 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt4332 = arg0.method8593();
		} else if (arg1 == 4) {
			this.anInt4333 = arg0.method8593();
		} else if (arg1 == 5) {
			this.anInt4321 = arg0.method8593();
		} else if (arg1 == 6) {
			this.anInt4325 = arg0.method8593();
		} else if (arg1 == 7) {
			this.anInt4317 = arg0.method8632();
		} else if (arg1 == 8) {
			this.anInt4320 = arg0.method8632();
		} else if (arg1 == 9) {
			this.aByte62 = 3;
			this.anInt4328 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean324 = true;
		} else if (arg1 == 11) {
			this.aByte62 = 1;
		} else if (arg1 == 12) {
			this.aByte62 = 4;
		} else if (arg1 == 13) {
			this.aByte62 = 5;
		} else if (arg1 == 14) {
			this.aByte62 = 2;
			this.anInt4328 = arg0.method8632() * 256;
		} else if (arg1 == 15) {
			this.aByte62 = 3;
			this.anInt4328 = arg0.method8593();
		} else if (arg1 == 16) {
			this.aByte62 = 3;
			this.anInt4328 = arg0.method8618();
		} else {
			@Pc(118) int local118;
			@Pc(128) int local128;
			if (arg1 == 40) {
				local118 = arg0.method8632();
				this.aShortArray68 = new short[local118];
				this.aShortArray67 = new short[local118];
				for (local128 = 0; local128 < local118; local128++) {
					this.aShortArray68[local128] = (short) arg0.method8593();
					this.aShortArray67[local128] = (short) arg0.method8593();
				}
			} else if (arg1 == 41) {
				local118 = arg0.method8632();
				this.aShortArray66 = new short[local118];
				this.aShortArray65 = new short[local118];
				for (local128 = 0; local128 < local118; local128++) {
					this.aShortArray65[local128] = (short) arg0.method8593();
					this.aShortArray66[local128] = (short) arg0.method8593();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BZIIIIIILclient!uaa;Lclient!s;ILclient!s;Lclient!ha;)Lclient!ka;")
	public Class95 method3923(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class343 arg6, @OriginalArg(9) Class21 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class21 arg9, @OriginalArg(12) Class13 arg10) {
		return this.method3924(arg6, arg9, arg3, arg4, arg10, arg5, arg0, true, arg2, arg1, (byte) 2, arg7, arg8);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!uaa;Lclient!s;IILclient!ha;IIZIIBLclient!s;I)Lclient!ka;")
	private Class95 method3924(@OriginalArg(1) Class343 arg0, @OriginalArg(2) Class21 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class13 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte arg10, @OriginalArg(12) Class21 arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg9;
		@Pc(24) Class372 local24 = this.anInt4332 == -1 || arg5 == -1 ? null : arg0.method8356(this.anInt4332);
		@Pc(33) boolean local33 = arg7 & this.aByte62 != 0;
		if (local24 != null) {
			local7 = arg9 | local24.method8975(false, arg3, arg5);
		}
		if (local33) {
			local7 |= this.aByte62 == 3 ? 7 : 2;
		}
		if (this.anInt4321 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4333 != 128 || this.anInt4325 != 0) {
			local7 |= 0x5;
		}
		@Pc(93) Class165 local93 = this.aClass236_1.aClass165_44;
		@Pc(115) Class95 local115;
		synchronized (this.aClass236_1.aClass165_44) {
			local115 = (Class95) this.aClass236_1.aClass165_44.method4389((long) (this.anInt4326 |= arg4.anInt9671 << 29));
		}
		if (local115 == null || arg4.method8495(local115.ua(), local7) != 0) {
			if (local115 != null) {
				local7 = arg4.method8478(local7, local115.ua());
			}
			@Pc(142) int local142 = local7;
			if (this.aShortArray68 != null) {
				local142 = local7 | 0x4000;
			}
			if (this.aShortArray65 != null) {
				local142 |= 0x8000;
			}
			@Pc(167) Class117 local167 = Static98.method1747(this.aClass236_1.aClass15_104, this.anInt4327);
			if (local167 == null) {
				return null;
			}
			if (local167.anInt3824 < 13) {
				local167.method3478();
			}
			local115 = arg4.method8489(local167, local142, this.aClass236_1.anInt6251, this.anInt4317 + 64, this.anInt4320 + 850);
			@Pc(202) int local202;
			if (this.aShortArray68 != null) {
				for (local202 = 0; local202 < this.aShortArray68.length; local202++) {
					local115.ia(this.aShortArray68[local202], this.aShortArray67[local202]);
				}
			}
			if (this.aShortArray65 != null) {
				for (local202 = 0; local202 < this.aShortArray65.length; local202++) {
					local115.aa(this.aShortArray65[local202], this.aShortArray66[local202]);
				}
			}
			local115.s(local7);
			@Pc(258) Class165 local258 = this.aClass236_1.aClass165_44;
			synchronized (this.aClass236_1.aClass165_44) {
				this.aClass236_1.aClass165_44.method4392(local115, (long) (this.anInt4326 |= arg4.anInt9671 << 29));
			}
		}
		@Pc(302) Class95 local302 = local24 == null ? local115.method5664(arg10, local7, true) : local24.method8974(local7, arg3, arg8, arg10, local115, 0, arg5);
		if (this.anInt4333 != 128 || this.anInt4321 != 128) {
			local302.O(this.anInt4333, this.anInt4321, this.anInt4333);
		}
		if (this.anInt4325 != 0) {
			if (this.anInt4325 == 90) {
				local302.a(4096);
			}
			if (this.anInt4325 == 180) {
				local302.a(8192);
			}
			if (this.anInt4325 == 270) {
				local302.a(12288);
			}
		}
		if (local33) {
			local302.p(this.aByte62, this.anInt4328, arg11, arg1, arg2, arg6, arg12);
		}
		local302.s(arg9);
		return local302;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!jp;Z)V")
	public void method3926(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8632();
			if (local5 == 0) {
				return;
			}
			this.method3922(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBLclient!ha;IILclient!uaa;II)Lclient!ka;")
	public Class95 method3929(@OriginalArg(1) byte arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class343 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		return this.method3924(arg4, (Class21) null, 0, arg3, arg1, arg2, 0, false, arg6, arg5, arg0, (Class21) null, 0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!ha;ILclient!uaa;III)Lclient!ka;")
	public Class95 method3932(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class343 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		return this.method3924(arg3, (Class21) null, 0, arg5, arg1, arg2, 0, false, arg4, arg0, (byte) 2, (Class21) null, 0);
	}
}
