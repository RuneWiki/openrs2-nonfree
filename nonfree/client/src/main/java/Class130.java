import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class130 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!es;")
	public Class69 aClass69_2;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	private int anInt3577;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
	public int anInt3587;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt3573 = 128;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt3576 = -1;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Z")
	public boolean aBoolean410 = false;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	private int anInt3578 = 0;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	private int anInt3580 = 128;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "B")
	public byte aByte50 = 0;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
	private int anInt3581 = 0;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	private int anInt3583 = -1;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	private int anInt3586 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!ya;ILclient!za;IZIILclient!vm;Lclient!ya;III)Lclient!e;")
	public Class57 method2908(@OriginalArg(1) Class157 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class254 arg6, @OriginalArg(9) Class157 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method2910(arg8, arg0, arg1, arg3, arg7, arg9, true, arg6, (byte) 2, arg2, arg5, arg10, arg4);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!vm;IILclient!za;I)Lclient!e;")
	public Class57 method2909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class34 arg5) {
		return this.method2910(0, null, arg3, 0, null, 0, false, arg2, (byte) 5, arg5, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ya;IILclient!ya;IZLclient!vm;BLclient!za;IIII)Lclient!e;")
	private Class57 method2910(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class157 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) Class254 arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) Class34 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(7) int local7 = arg10;
		@Pc(23) Class177 local23 = this.anInt3576 == -1 || arg11 == -1 ? null : arg7.method5670(this.anInt3576);
		@Pc(35) boolean local35 = arg6 & this.aByte50 != 0;
		if (local23 != null) {
			local7 = arg10 | local23.method3959(arg11, false, arg2);
		}
		if (local35) {
			local7 |= this.aByte50 == 3 ? 7 : 2;
		}
		if (this.anInt3580 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3573 != 128 || this.anInt3581 != 0) {
			local7 |= 0x5;
		}
		@Pc(85) Class102 local85 = this.aClass69_2.aClass102_13;
		@Pc(105) Class57 local105;
		synchronized (this.aClass69_2.aClass102_13) {
			local105 = (Class57) this.aClass69_2.aClass102_13.method2258((long) (this.anInt3587 |= arg9.anInt7333 << 29));
		}
		if (local105 == null || arg9.method5783(local105.RA(), local7) != 0) {
			if (local105 != null) {
				local7 = arg9.method5787(local7, local105.RA());
			}
			@Pc(129) int local129 = local7;
			if (this.aShortArray56 != null) {
				local129 = local7 | 0x4000;
			}
			if (this.aShortArray55 != null) {
				local129 |= 0x8000;
			}
			@Pc(152) Class193 local152 = Static149.method2219(this.anInt3577, this.aClass69_2.aClass82_22);
			if (local152 == null) {
				return null;
			}
			if (local152.anInt5431 < 13) {
				local152.method4254();
			}
			local105 = arg9.method5792(local152, local129, this.aClass69_2.anInt1838, this.anInt3578 + 64, this.anInt3586 + 850);
			@Pc(187) int local187;
			if (this.aShortArray56 != null) {
				for (local187 = 0; local187 < this.aShortArray56.length; local187++) {
					local105.q(this.aShortArray56[local187], this.aShortArray54[local187]);
				}
			}
			if (this.aShortArray55 != null) {
				for (local187 = 0; local187 < this.aShortArray55.length; local187++) {
					local105.u(this.aShortArray55[local187], this.aShortArray53[local187]);
				}
			}
			local105.D(local7);
			@Pc(239) Class102 local239 = this.aClass69_2.aClass102_13;
			synchronized (this.aClass69_2.aClass102_13) {
				this.aClass69_2.aClass102_13.method2272((long) (this.anInt3587 |= arg9.anInt7333 << 29), local105);
			}
		}
		@Pc(288) Class57 local288 = local23 == null ? local105.method5966(arg8, local7, true) : local23.method3953(local7, local105, arg12, arg2, arg11, 0, arg8);
		if (this.anInt3573 != 128 || this.anInt3580 != 128) {
			local288.n(this.anInt3573, this.anInt3580, this.anInt3573);
		}
		if (this.anInt3581 != 0) {
			if (this.anInt3581 == 90) {
				local288.ma(4096);
			}
			if (this.anInt3581 == 180) {
				local288.ma(8192);
			}
			if (this.anInt3581 == 270) {
				local288.ma(12288);
			}
		}
		if (local35) {
			local288.da(this.aByte50, this.anInt3583, arg1, arg4, arg0, arg3, arg5);
		}
		local288.D(arg10);
		return local288;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!ug;)V")
	private void method2913(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt3577 = arg1.method5335();
		} else if (arg0 == 2) {
			this.anInt3576 = arg1.method5335();
		} else if (arg0 == 4) {
			this.anInt3573 = arg1.method5335();
		} else if (arg0 == 5) {
			this.anInt3580 = arg1.method5335();
		} else if (arg0 == 6) {
			this.anInt3581 = arg1.method5335();
		} else if (arg0 == 7) {
			this.anInt3578 = arg1.method5337();
		} else if (arg0 == 8) {
			this.anInt3586 = arg1.method5337();
		} else if (arg0 == 9) {
			this.anInt3583 = 8224;
			this.aByte50 = 3;
		} else if (arg0 == 10) {
			this.aBoolean410 = true;
		} else if (arg0 == 11) {
			this.aByte50 = 1;
		} else if (arg0 == 12) {
			this.aByte50 = 4;
		} else if (arg0 == 13) {
			this.aByte50 = 5;
		} else if (arg0 == 14) {
			this.aByte50 = 2;
			this.anInt3583 = arg1.method5337() * 256;
		} else if (arg0 == 15) {
			this.aByte50 = 3;
			this.anInt3583 = arg1.method5335();
		} else if (arg0 == 16) {
			this.aByte50 = 3;
			this.anInt3583 = arg1.method5355();
		} else {
			@Pc(131) int local131;
			@Pc(141) int local141;
			if (arg0 == 40) {
				local131 = arg1.method5337();
				this.aShortArray54 = new short[local131];
				this.aShortArray56 = new short[local131];
				for (local141 = 0; local141 < local131; local141++) {
					this.aShortArray56[local141] = (short) arg1.method5335();
					this.aShortArray54[local141] = (short) arg1.method5335();
				}
			} else if (arg0 == 41) {
				local131 = arg1.method5337();
				this.aShortArray55 = new short[local131];
				this.aShortArray53 = new short[local131];
				for (local141 = 0; local141 < local131; local141++) {
					this.aShortArray55[local141] = (short) arg1.method5335();
					this.aShortArray53[local141] = (short) arg1.method5335();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!vm;IIILclient!za;II)Lclient!e;")
	public Class57 method2914(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class34 arg4, @OriginalArg(6) int arg5) {
		return this.method2910(0, null, arg3, 0, null, 0, false, arg0, (byte) 2, arg4, arg1, arg5, arg2);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ug;)V")
	public void method2915(@OriginalArg(1) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method2913(local5, arg0);
		}
	}
}
