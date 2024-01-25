import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class106 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	private int anInt2669;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public int anInt2670;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Lclient!jj;")
	public Class182 aClass182_1;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Z")
	public boolean aBoolean203 = false;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	private int anInt2672 = 128;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "B")
	public byte aByte43 = 0;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "I")
	private int anInt2675 = 0;

	@OriginalMember(owner = "client!el", name = "w", descriptor = "I")
	public int anInt2680 = -1;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	private int anInt2676 = 0;

	@OriginalMember(owner = "client!el", name = "y", descriptor = "I")
	private int anInt2682 = 128;

	@OriginalMember(owner = "client!el", name = "z", descriptor = "I")
	private int anInt2683 = -1;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	private int anInt2674 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!dt;Z)V")
	public void method2340(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method2346(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!ll;ILclient!ha;Lclient!s;Lclient!s;IIBIIZII)Lclient!ka;")
	private Class149 method2341(@OriginalArg(0) byte arg0, @OriginalArg(1) Class213 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) Class35 arg4, @OriginalArg(5) Class35 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg12;
		@Pc(23) Class239 local23 = this.anInt2680 == -1 || arg6 == -1 ? null : arg1.method5008(this.anInt2680);
		@Pc(35) boolean local35 = arg10 & this.aByte43 != 0;
		if (local23 != null) {
			local7 = arg12 | local23.method5383(false, arg2, arg6);
		}
		if (local35) {
			local7 |= this.aByte43 == 3 ? 7 : 2;
		}
		if (this.anInt2682 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2672 != 128 || this.anInt2675 != 0) {
			local7 |= 0x5;
		}
		@Pc(86) Class295 local86 = this.aClass182_1.aClass295_21;
		@Pc(106) Class149 local106;
		synchronized (this.aClass182_1.aClass295_21) {
			local106 = (Class149) this.aClass182_1.aClass295_21.method6470((long) (this.anInt2670 |= arg3.anInt9840 << 29));
		}
		if (local106 == null || arg3.method8047(local106.ua(), local7) != 0) {
			if (local106 != null) {
				local7 = arg3.method8012(local7, local106.ua());
			}
			@Pc(133) int local133 = local7;
			if (this.aShortArray34 != null) {
				local133 = local7 | 0x4000;
			}
			if (this.aShortArray32 != null) {
				local133 |= 0x8000;
			}
			@Pc(156) Class134 local156 = Static74.method1278(this.anInt2669, this.aClass182_1.aClass362_58);
			if (local156 == null) {
				return null;
			}
			if (local156.anInt3581 < 13) {
				local156.method3065();
			}
			local106 = arg3.method8021(local156, local133, this.aClass182_1.anInt4782, this.anInt2674 + 64, this.anInt2676 + 850);
			@Pc(191) int local191;
			if (this.aShortArray34 != null) {
				for (local191 = 0; local191 < this.aShortArray34.length; local191++) {
					local106.ia(this.aShortArray34[local191], this.aShortArray31[local191]);
				}
			}
			if (this.aShortArray32 != null) {
				for (local191 = 0; local191 < this.aShortArray32.length; local191++) {
					local106.aa(this.aShortArray32[local191], this.aShortArray33[local191]);
				}
			}
			local106.s(local7);
			@Pc(239) Class295 local239 = this.aClass182_1.aClass295_21;
			synchronized (this.aClass182_1.aClass295_21) {
				this.aClass182_1.aClass295_21.method6469((long) (this.anInt2670 |= arg3.anInt9840 << 29), local106);
			}
		}
		@Pc(283) Class149 local283 = local23 == null ? local106.method8858(arg0, local7, true) : local23.method5380(arg6, local106, arg9, local7, arg0, arg2, 0);
		if (this.anInt2672 != 128 || this.anInt2682 != 128) {
			local283.O(this.anInt2672, this.anInt2682, this.anInt2672);
		}
		if (this.anInt2675 != 0) {
			if (this.anInt2675 == 90) {
				local283.a(4096);
			}
			if (this.anInt2675 == 180) {
				local283.a(8192);
			}
			if (this.anInt2675 == 270) {
				local283.a(12288);
			}
		}
		if (local35) {
			local283.p(this.aByte43, this.anInt2683, arg4, arg5, arg8, arg11, arg7);
		}
		local283.s(arg12);
		return local283;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BIIIBILclient!ll;Lclient!ha;)Lclient!ka;")
	public Class149 method2342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class213 arg5, @OriginalArg(7) Class95 arg6) {
		return this.method2341(arg3, arg5, arg1, arg6, (Class35) null, (Class35) null, arg0, 0, 0, arg2, false, 0, arg4);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ha;IILclient!ll;IIIIZILclient!s;Lclient!s;I)Lclient!ka;")
	public Class149 method2344(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class213 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class35 arg8, @OriginalArg(11) Class35 arg9, @OriginalArg(12) int arg10) {
		return this.method2341((byte) 2, arg2, arg10, arg0, arg8, arg9, arg7, arg6, arg3, arg5, true, arg1, arg4);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BIILclient!ll;IILclient!ha;)Lclient!ka;")
	public Class149 method2345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class213 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class95 arg5) {
		return this.method2341((byte) 2, arg2, arg0, arg5, (Class35) null, (Class35) null, arg4, 0, 0, arg3, false, 0, arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!dt;ZI)V")
	private void method2346(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2669 = arg0.method7951();
		} else if (arg1 == 2) {
			this.anInt2680 = arg0.method7951();
		} else if (arg1 == 4) {
			this.anInt2672 = arg0.method7951();
		} else if (arg1 == 5) {
			this.anInt2682 = arg0.method7951();
		} else if (arg1 == 6) {
			this.anInt2675 = arg0.method7951();
		} else if (arg1 == 7) {
			this.anInt2674 = arg0.method7954();
		} else if (arg1 == 8) {
			this.anInt2676 = arg0.method7954();
		} else if (arg1 == 9) {
			this.anInt2683 = 8224;
			this.aByte43 = 3;
		} else if (arg1 == 10) {
			this.aBoolean203 = true;
		} else if (arg1 == 11) {
			this.aByte43 = 1;
		} else if (arg1 == 12) {
			this.aByte43 = 4;
		} else if (arg1 == 13) {
			this.aByte43 = 5;
		} else if (arg1 == 14) {
			this.aByte43 = 2;
			this.anInt2683 = arg0.method7954() * 256;
		} else if (arg1 == 15) {
			this.aByte43 = 3;
			this.anInt2683 = arg0.method7951();
		} else if (arg1 == 16) {
			this.aByte43 = 3;
			this.anInt2683 = arg0.method7895();
		} else {
			@Pc(113) int local113;
			@Pc(123) int local123;
			if (arg1 == 40) {
				local113 = arg0.method7954();
				this.aShortArray34 = new short[local113];
				this.aShortArray31 = new short[local113];
				for (local123 = 0; local123 < local113; local123++) {
					this.aShortArray34[local123] = (short) arg0.method7951();
					this.aShortArray31[local123] = (short) arg0.method7951();
				}
			} else if (arg1 == 41) {
				local113 = arg0.method7954();
				this.aShortArray33 = new short[local113];
				this.aShortArray32 = new short[local113];
				for (local123 = 0; local123 < local113; local123++) {
					this.aShortArray32[local123] = (short) arg0.method7951();
					this.aShortArray33[local123] = (short) arg0.method7951();
				}
			}
		}
	}
}
