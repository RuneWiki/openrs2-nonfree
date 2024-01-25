import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class112 {

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
	private int anInt3707;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "I")
	public int anInt3710;

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "Lclient!fn;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "Z")
	public boolean aBoolean233 = false;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
	public int anInt3703 = -1;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	private int anInt3699 = 0;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	private int anInt3700 = 0;

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
	private int anInt3711 = 128;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
	private int anInt3708 = 0;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	private int anInt3702 = 128;

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "B")
	public byte aByte29 = 0;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
	private int anInt3709 = -1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!gw;B)V")
	public void method3305(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method3311(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILclient!sa;Lclient!ht;IIZLclient!sa;ILclient!qa;BZI)Lclient!r;")
	private Class19 method3307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) Class126 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class10 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class9 arg9, @OriginalArg(11) byte arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg12;
		@Pc(21) Class280 local21 = this.anInt3703 == -1 || arg5 == -1 ? null : arg4.method3574(this.anInt3703);
		@Pc(33) boolean local33 = arg11 & this.aByte29 != 0;
		if (local21 != null) {
			local5 = arg12 | local21.method6876(arg8, arg5, false);
		}
		if (local33) {
			local5 |= this.aByte29 == 3 ? 7 : 2;
		}
		if (this.anInt3711 != 128) {
			local5 |= 0x2;
		}
		if (this.anInt3702 != 128 || this.anInt3699 != 0) {
			local5 |= 0x5;
		}
		@Pc(90) Class316 local90 = this.aClass90_1.aClass316_17;
		@Pc(110) Class19 local110;
		synchronized (this.aClass90_1.aClass316_17) {
			local110 = (Class19) this.aClass90_1.aClass316_17.method7799((long) (this.anInt3710 |= arg9.anInt9019 << 29));
		}
		if (local110 == null || arg9.method7607(local110.ba(), local5) != 0) {
			if (local110 != null) {
				local5 = arg9.method7606(local5, local110.ba());
			}
			@Pc(134) int local134 = local5;
			if (this.aShortArray62 != null) {
				local134 = local5 | 0x4000;
			}
			if (this.aShortArray61 != null) {
				local134 |= 0x8000;
			}
			@Pc(157) Class86 local157 = Static469.method6840(this.anInt3707, this.aClass90_1.aClass160_30);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt3071 < 13) {
				local157.method2795();
			}
			local110 = arg9.method7635(local157, local134, this.aClass90_1.anInt3289, this.anInt3700 + 64, this.anInt3708 + 850);
			@Pc(190) int local190;
			if (this.aShortArray62 != null) {
				for (local190 = 0; local190 < this.aShortArray62.length; local190++) {
					local110.pa(this.aShortArray62[local190], this.aShortArray59[local190]);
				}
			}
			if (this.aShortArray61 != null) {
				for (local190 = 0; local190 < this.aShortArray61.length; local190++) {
					local110.L(this.aShortArray61[local190], this.aShortArray60[local190]);
				}
			}
			local110.m(local5);
			@Pc(240) Class316 local240 = this.aClass90_1.aClass316_17;
			synchronized (this.aClass90_1.aClass316_17) {
				this.aClass90_1.aClass316_17.method7792((long) (this.anInt3710 |= arg9.anInt9019 << 29), local110);
			}
		}
		@Pc(284) Class19 local284 = local21 == null ? local110.method7260(arg10, local5, true) : local21.method6875(local5, arg8, arg5, local110, arg10, arg2, 0);
		if (this.anInt3702 != 128 || this.anInt3711 != 128) {
			local284.V(this.anInt3702, this.anInt3711, this.anInt3702);
		}
		if (this.anInt3699 != 0) {
			if (this.anInt3699 == 90) {
				local284.OA(4096);
			}
			if (this.anInt3699 == 180) {
				local284.OA(8192);
			}
			if (this.anInt3699 == 270) {
				local284.OA(12288);
			}
		}
		if (local33) {
			local284.RA(this.aByte29, this.anInt3709, arg7, arg3, arg1, arg6, arg0);
		}
		local284.m(arg12);
		return local284;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ht;IIIBLclient!qa;)Lclient!r;")
	public Class19 method3309(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class9 arg5) {
		return this.method3307(0, 0, arg0, null, arg1, arg2, 0, null, arg3, arg5, (byte) 2, false, arg4);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!gw;II)V")
	private void method3311(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3707 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt3703 = arg0.method3056();
		} else if (arg1 == 4) {
			this.anInt3702 = arg0.method3056();
		} else if (arg1 == 5) {
			this.anInt3711 = arg0.method3056();
		} else if (arg1 == 6) {
			this.anInt3699 = arg0.method3056();
		} else if (arg1 == 7) {
			this.anInt3700 = arg0.method3043();
		} else if (arg1 == 8) {
			this.anInt3708 = arg0.method3043();
		} else if (arg1 == 9) {
			this.aByte29 = 3;
			this.anInt3709 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean233 = true;
		} else if (arg1 == 11) {
			this.aByte29 = 1;
		} else if (arg1 == 12) {
			this.aByte29 = 4;
		} else if (arg1 == 13) {
			this.aByte29 = 5;
		} else if (arg1 == 14) {
			this.aByte29 = 2;
			this.anInt3709 = arg0.method3043() * 256;
		} else if (arg1 == 15) {
			this.aByte29 = 3;
			this.anInt3709 = arg0.method3056();
		} else if (arg1 == 16) {
			this.aByte29 = 3;
			this.anInt3709 = arg0.method3037();
		} else {
			@Pc(106) int local106;
			@Pc(116) int local116;
			if (arg1 == 40) {
				local106 = arg0.method3043();
				this.aShortArray62 = new short[local106];
				this.aShortArray59 = new short[local106];
				for (local116 = 0; local116 < local106; local116++) {
					this.aShortArray62[local116] = (short) arg0.method3056();
					this.aShortArray59[local116] = (short) arg0.method3056();
				}
			} else if (arg1 == 41) {
				local106 = arg0.method3043();
				this.aShortArray60 = new short[local106];
				this.aShortArray61 = new short[local106];
				for (local116 = 0; local116 < local106; local116++) {
					this.aShortArray61[local116] = (short) arg0.method3056();
					this.aShortArray60[local116] = (short) arg0.method3056();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILclient!qa;ILclient!sa;IILclient!ht;IILclient!sa;II)Lclient!r;")
	public Class19 method3313(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class10 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class126 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class10 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method3307(arg7, arg2, arg5, arg8, arg6, arg0, arg9, arg3, arg4, arg1, (byte) 2, true, arg10);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!ht;Lclient!qa;IIIII)Lclient!r;")
	public Class19 method3314(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method3307(0, 0, arg4, null, arg0, arg2, 0, null, arg3, arg1, (byte) 5, false, arg5);
	}
}
