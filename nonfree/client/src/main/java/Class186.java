import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class186 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public int anInt5601;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "Lclient!gv;")
	public Class91 aClass91_3;

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
	private int anInt5616;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
	private int anInt5606 = 128;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
	private int anInt5607 = 0;

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
	private int anInt5610 = 0;

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
	private int anInt5609 = 128;

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	private int anInt5602 = -1;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
	public int anInt5611 = -1;

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
	private int anInt5614 = 0;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "B")
	public byte aByte73 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!bt;BI)V")
	private void method4520(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5616 = arg0.method6004();
		} else if (arg1 == 2) {
			this.anInt5611 = arg0.method6004();
		} else if (arg1 == 4) {
			this.anInt5606 = arg0.method6004();
		} else if (arg1 == 5) {
			this.anInt5609 = arg0.method6004();
		} else if (arg1 == 6) {
			this.anInt5614 = arg0.method6004();
		} else if (arg1 == 7) {
			this.anInt5610 = arg0.method6053();
		} else if (arg1 == 8) {
			this.anInt5607 = arg0.method6053();
		} else if (arg1 == 9) {
			this.anInt5602 = 8224;
			this.aByte73 = 3;
		} else if (arg1 == 10) {
			this.aBoolean406 = true;
		} else if (arg1 == 11) {
			this.aByte73 = 1;
		} else if (arg1 == 12) {
			this.aByte73 = 4;
		} else if (arg1 == 13) {
			this.aByte73 = 5;
		} else if (arg1 == 14) {
			this.aByte73 = 2;
			this.anInt5602 = arg0.method6053() * 256;
		} else if (arg1 == 15) {
			this.aByte73 = 3;
			this.anInt5602 = arg0.method6004();
		} else if (arg1 == 16) {
			this.aByte73 = 3;
			this.anInt5602 = arg0.method6014();
		} else {
			@Pc(159) int local159;
			@Pc(169) int local169;
			if (arg1 == 40) {
				local159 = arg0.method6053();
				this.aShortArray76 = new short[local159];
				this.aShortArray75 = new short[local159];
				for (local169 = 0; local169 < local159; local169++) {
					this.aShortArray76[local169] = (short) arg0.method6004();
					this.aShortArray75[local169] = (short) arg0.method6004();
				}
			} else if (arg1 == 41) {
				local159 = arg0.method6053();
				this.aShortArray77 = new short[local159];
				this.aShortArray74 = new short[local159];
				for (local169 = 0; local169 < local159; local169++) {
					this.aShortArray77[local169] = (short) arg0.method6004();
					this.aShortArray74[local169] = (short) arg0.method6004();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILclient!bw;ILclient!qa;Z)Lclient!c;")
	public Class31 method4521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class75 arg5) {
		return this.method4524(false, null, null, arg5, 0, arg3, (byte) 5, 0, arg0, arg4, arg2, 0, arg1);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!bt;)V")
	public void method4523(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method4520(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!na;ILclient!na;Lclient!qa;ILclient!bw;BIIIIII)Lclient!c;")
	private Class31 method4524(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(3) Class64 arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg9;
		@Pc(23) Class96 local23 = this.anInt5611 == -1 || arg10 == -1 ? null : arg5.method942(this.anInt5611);
		@Pc(32) boolean local32 = arg0 & this.aByte73 != 0;
		if (local23 != null) {
			local7 = arg9 | local23.method2712(arg10, false, arg12);
		}
		if (local32) {
			local7 |= this.aByte73 == 3 ? 7 : 2;
		}
		if (this.anInt5609 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt5606 != 128 || this.anInt5614 != 0) {
			local7 |= 0x5;
		}
		@Pc(84) Class5 local84 = this.aClass91_3.aClass5_28;
		@Pc(104) Class31 local104;
		synchronized (this.aClass91_3.aClass5_28) {
			local104 = (Class31) this.aClass91_3.aClass5_28.method104((long) (this.anInt5601 |= arg3.anInt3233 << 29));
		}
		if (local104 == null || arg3.method2610(local104.n(), local7) != 0) {
			if (local104 != null) {
				local7 = arg3.method2614(local7, local104.n());
			}
			@Pc(128) int local128 = local7;
			if (this.aShortArray76 != null) {
				local128 = local7 | 0x4000;
			}
			if (this.aShortArray77 != null) {
				local128 |= 0x8000;
			}
			@Pc(151) Class242 local151 = Static275.method4093(this.anInt5616, this.aClass91_3.aClass56_37);
			if (local151 == null) {
				return null;
			}
			if (local151.anInt7154 < 13) {
				local151.method5546();
			}
			local104 = arg3.method2616(local151, local128, this.aClass91_3.anInt3227, this.anInt5610 + 64, this.anInt5607 + 850);
			@Pc(186) int local186;
			if (this.aShortArray76 != null) {
				for (local186 = 0; local186 < this.aShortArray76.length; local186++) {
					local104.N(this.aShortArray76[local186], this.aShortArray75[local186]);
				}
			}
			if (this.aShortArray77 != null) {
				for (local186 = 0; local186 < this.aShortArray77.length; local186++) {
					local104.YA(this.aShortArray77[local186], this.aShortArray74[local186]);
				}
			}
			local104.u(local7);
			@Pc(234) Class5 local234 = this.aClass91_3.aClass5_28;
			synchronized (this.aClass91_3.aClass5_28) {
				this.aClass91_3.aClass5_28.method114((long) (this.anInt5601 |= arg3.anInt3233 << 29), local104);
			}
		}
		@Pc(280) Class31 local280 = local23 == null ? local104.method5710(arg6, local7, true) : local23.method2719(local104, arg12, 0, local7, arg8, arg10, arg6);
		if (this.anInt5606 != 128 || this.anInt5609 != 128) {
			local280.XA(this.anInt5606, this.anInt5609, this.anInt5606);
		}
		if (this.anInt5614 != 0) {
			if (this.anInt5614 == 90) {
				local280.k(4096);
			}
			if (this.anInt5614 == 180) {
				local280.k(8192);
			}
			if (this.anInt5614 == 270) {
				local280.k(12288);
			}
		}
		if (local32) {
			local280.ea(this.aByte73, this.anInt5602, arg2, arg1, arg4, arg11, arg7);
		}
		local280.u(arg9);
		return local280;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!na;ILclient!na;ILclient!qa;ZIIIILclient!bw;)Lclient!c;")
	public Class31 method4525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class64 arg4, @OriginalArg(6) Class75 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class30 arg10) {
		return this.method4524(true, arg4, arg2, arg5, arg9, arg10, (byte) 2, arg0, arg6, arg1, arg7, arg3, arg8);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!qa;ILclient!bw;BI)Lclient!c;")
	public Class31 method4526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class30 arg4, @OriginalArg(6) int arg5) {
		return this.method4524(false, null, null, arg2, 0, arg4, (byte) 2, 0, arg5, arg1, arg3, 0, arg0);
	}
}
