import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class73 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
	private int anInt2711;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Lclient!tw;")
	public Class333 aClass333_1;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	public int anInt2715;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	private int anInt2709 = 0;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	private int anInt2714 = 128;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	public int anInt2718 = -1;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
	private int anInt2716 = 0;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	private int anInt2719 = -1;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	private int anInt2708 = 0;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	private int anInt2712 = 128;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "B")
	public byte aByte29 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!ig;I)V")
	private void method2301(@OriginalArg(1) Class8_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2711 = arg0.method8578();
		} else if (arg1 == 2) {
			this.anInt2718 = arg0.method8578();
		} else if (arg1 == 4) {
			this.anInt2714 = arg0.method8578();
		} else if (arg1 == 5) {
			this.anInt2712 = arg0.method8578();
		} else if (arg1 == 6) {
			this.anInt2716 = arg0.method8578();
		} else if (arg1 == 7) {
			this.anInt2708 = arg0.method8525();
		} else if (arg1 == 8) {
			this.anInt2709 = arg0.method8525();
		} else if (arg1 == 9) {
			this.anInt2719 = 8224;
			this.aByte29 = 3;
		} else if (arg1 == 10) {
			this.aBoolean202 = true;
		} else if (arg1 == 11) {
			this.aByte29 = 1;
		} else if (arg1 == 12) {
			this.aByte29 = 4;
		} else if (arg1 == 13) {
			this.aByte29 = 5;
		} else if (arg1 == 14) {
			this.aByte29 = 2;
			this.anInt2719 = arg0.method8525() * 256;
		} else if (arg1 == 15) {
			this.aByte29 = 3;
			this.anInt2719 = arg0.method8578();
		} else if (arg1 == 16) {
			this.aByte29 = 3;
			this.anInt2719 = arg0.method8540();
		} else {
			@Pc(127) int local127;
			@Pc(137) int local137;
			if (arg1 == 40) {
				local127 = arg0.method8525();
				this.aShortArray8 = new short[local127];
				this.aShortArray6 = new short[local127];
				for (local137 = 0; local137 < local127; local137++) {
					this.aShortArray8[local137] = (short) arg0.method8578();
					this.aShortArray6[local137] = (short) arg0.method8578();
				}
				return;
			}
			if (arg1 == 41) {
				local127 = arg0.method8525();
				this.aShortArray7 = new short[local127];
				this.aShortArray5 = new short[local127];
				for (local137 = 0; local137 < local127; local137++) {
					this.aShortArray7[local137] = (short) arg0.method8578();
					this.aShortArray5[local137] = (short) arg0.method8578();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIILclient!s;ZLclient!s;IBLclient!ha;ILclient!ne;III)Lclient!ka;")
	private Class83 method2302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class86 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class16 arg8, @OriginalArg(10) Class220 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg0;
		@Pc(23) Class97 local23 = this.anInt2718 == -1 || arg10 == -1 ? null : arg9.method5670(this.anInt2718);
		@Pc(35) boolean local35 = arg4 & this.aByte29 != 0;
		if (local23 != null) {
			local7 = arg0 | local23.method2971(false, arg10, arg2);
		}
		if (local35) {
			local7 |= this.aByte29 == 3 ? 7 : 2;
		}
		if (this.anInt2712 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2714 != 128 || this.anInt2716 != 0) {
			local7 |= 0x5;
		}
		@Pc(87) Class236 local87 = this.aClass333_1.aClass236_93;
		@Pc(107) Class83 local107;
		synchronized (this.aClass333_1.aClass236_93) {
			local107 = (Class83) this.aClass333_1.aClass236_93.method6242((long) (this.anInt2715 |= arg8.anInt7420 << 29));
		}
		if (local107 == null || arg8.method6121(local107.ua(), local7) != 0) {
			if (local107 != null) {
				local7 = arg8.method6109(local7, local107.ua());
			}
			@Pc(131) int local131 = local7;
			if (this.aShortArray8 != null) {
				local131 = local7 | 0x4000;
			}
			if (this.aShortArray7 != null) {
				local131 |= 0x8000;
			}
			@Pc(154) Class344 local154 = Static600.method8252(this.aClass333_1.aClass237_133, this.anInt2711);
			if (local154 == null) {
				return null;
			}
			if (local154.anInt9915 < 13) {
				local154.method8065();
			}
			local107 = arg8.method6094(local154, local131, this.aClass333_1.anInt9683, this.anInt2708 + 64, this.anInt2709 + 850);
			@Pc(187) int local187;
			if (this.aShortArray8 != null) {
				for (local187 = 0; local187 < this.aShortArray8.length; local187++) {
					local107.ia(this.aShortArray8[local187], this.aShortArray6[local187]);
				}
			}
			if (this.aShortArray7 != null) {
				for (local187 = 0; local187 < this.aShortArray7.length; local187++) {
					local107.aa(this.aShortArray7[local187], this.aShortArray5[local187]);
				}
			}
			local107.s(local7);
			@Pc(239) Class236 local239 = this.aClass333_1.aClass236_93;
			synchronized (this.aClass333_1.aClass236_93) {
				this.aClass333_1.aClass236_93.method6241((long) (this.anInt2715 |= arg8.anInt7420 << 29), local107);
			}
		}
		@Pc(283) Class83 local283 = local23 == null ? local107.method7993(arg7, local7, true) : local23.method2969(arg12, arg7, local7, 0, local107, arg2, arg10);
		if (this.anInt2714 != 128 || this.anInt2712 != 128) {
			local283.O(this.anInt2714, this.anInt2712, this.anInt2714);
		}
		if (this.anInt2716 != 0) {
			if (this.anInt2716 == 90) {
				local283.a(4096);
			}
			if (this.anInt2716 == 180) {
				local283.a(8192);
			}
			if (this.anInt2716 == 270) {
				local283.a(12288);
			}
		}
		if (local35) {
			local283.p(this.aByte29, this.anInt2719, arg3, arg5, arg11, arg6, arg1);
		}
		local283.s(arg0);
		return local283;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!ha;IILclient!ne;IB)Lclient!ka;")
	public Class83 method2303(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class220 arg4, @OriginalArg(5) int arg5) {
		return this.method2302(arg0, 0, arg2, null, false, null, 0, (byte) 5, arg1, arg4, arg3, 0, arg5);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ig;B)V")
	public void method2304(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8525();
			if (local9 == 0) {
				return;
			}
			this.method2301(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!s;Lclient!s;IIIIZLclient!ha;IIILclient!ne;I)Lclient!ka;")
	public Class83 method2306(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class220 arg10) {
		return this.method2302(arg2, arg5, arg4, arg0, true, arg1, arg3, (byte) 2, arg6, arg10, arg9, arg8, arg7);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!ha;Lclient!ne;IIB)Lclient!ka;")
	public Class83 method2308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class220 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method2302(arg1, 0, arg4, null, false, null, 0, (byte) 2, arg2, arg3, arg5, 0, arg0);
	}
}
