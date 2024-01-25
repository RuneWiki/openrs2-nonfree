import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class13 {

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "Lclient!cn;")
	public Class41 aClass41_1;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	private int anInt458 = 0;

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
	private int anInt464 = 0;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	private int anInt468 = 128;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "B")
	public byte aByte11 = 0;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	public int anInt466 = -1;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
	private int anInt467 = -1;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	private int anInt462 = 0;

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
	private int anInt474 = 128;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!cu;IB)V")
	private void method367(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt470 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt466 = arg0.method2588();
		} else if (arg1 == 4) {
			this.anInt474 = arg0.method2588();
		} else if (arg1 == 5) {
			this.anInt468 = arg0.method2588();
		} else if (arg1 == 6) {
			this.anInt458 = arg0.method2588();
		} else if (arg1 == 7) {
			this.anInt462 = arg0.method2582();
		} else if (arg1 == 8) {
			this.anInt464 = arg0.method2582();
		} else if (arg1 == 9) {
			this.anInt467 = 8224;
			this.aByte11 = 3;
		} else if (arg1 == 10) {
			this.aBoolean32 = true;
		} else if (arg1 == 11) {
			this.aByte11 = 1;
		} else if (arg1 == 12) {
			this.aByte11 = 4;
		} else if (arg1 == 13) {
			this.aByte11 = 5;
		} else if (arg1 == 14) {
			this.aByte11 = 2;
			this.anInt467 = arg0.method2582() * 256;
		} else if (arg1 == 15) {
			this.aByte11 = 3;
			this.anInt467 = arg0.method2588();
		} else if (arg1 == 16) {
			this.aByte11 = 3;
			this.anInt467 = arg0.method2589();
		} else {
			@Pc(125) int local125;
			@Pc(135) int local135;
			if (arg1 == 40) {
				local125 = arg0.method2582();
				this.aShortArray15 = new short[local125];
				this.aShortArray14 = new short[local125];
				for (local135 = 0; local135 < local125; local135++) {
					this.aShortArray15[local135] = (short) arg0.method2588();
					this.aShortArray14[local135] = (short) arg0.method2588();
				}
			} else if (arg1 == 41) {
				local125 = arg0.method2582();
				this.aShortArray12 = new short[local125];
				this.aShortArray13 = new short[local125];
				for (local135 = 0; local135 < local125; local135++) {
					this.aShortArray12[local135] = (short) arg0.method2588();
					this.aShortArray13[local135] = (short) arg0.method2588();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIILclient!na;BLclient!nt;Lclient!qa;IIZLclient!na;)Lclient!c;")
	public Class9 method372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class159 arg5, @OriginalArg(7) Class170 arg6, @OriginalArg(8) Class172 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) Class159 arg10) {
		return this.method376(arg5, arg0, arg1, (byte) 2, arg2, arg8, arg3, arg6, arg9, arg10, arg4, true, arg7);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!qa;IIIIILclient!nt;)Lclient!c;")
	public Class9 method373(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class170 arg5) {
		return this.method376(null, arg2, 0, (byte) 2, arg3, 0, arg4, arg5, arg1, null, 0, false, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!nt;IBLclient!qa;III)Lclient!c;")
	public Class9 method374(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class172 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method376(null, arg4, 0, (byte) 5, arg5, 0, arg3, arg0, arg1, null, 0, false, arg2);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!cu;)V")
	public void method375(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method367(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!na;IIBBIIILclient!nt;ILclient!na;IZLclient!qa;)Lclient!c;")
	private Class9 method376(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class170 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class159 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) Class172 arg12) {
		@Pc(7) int local7 = arg6;
		@Pc(23) Class128 local23 = this.anInt466 == -1 || arg8 == -1 ? null : arg7.method3936(this.anInt466);
		@Pc(32) boolean local32 = arg11 & this.aByte11 != 0;
		if (local23 != null) {
			local7 = arg6 | local23.method3181(false, arg8, arg1);
		}
		if (local32) {
			local7 |= this.aByte11 == 3 ? 7 : 2;
		}
		if (this.anInt468 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt474 != 128 || this.anInt458 != 0) {
			local7 |= 0x5;
		}
		@Pc(85) Class126 local85 = this.aClass41_1.aClass126_12;
		@Pc(105) Class9 local105;
		synchronized (this.aClass41_1.aClass126_12) {
			local105 = (Class9) this.aClass41_1.aClass126_12.method3141((long) (this.anInt459 |= arg12.anInt6964 << 29));
		}
		if (local105 == null || arg12.method5501(local105.n(), local7) != 0) {
			if (local105 != null) {
				local7 = arg12.method5492(local7, local105.n());
			}
			@Pc(129) int local129 = local7;
			if (this.aShortArray15 != null) {
				local129 = local7 | 0x4000;
			}
			if (this.aShortArray12 != null) {
				local129 |= 0x8000;
			}
			@Pc(152) Class161 local152 = Static302.method4236(this.aClass41_1.aClass32_24, this.anInt470);
			if (local152 == null) {
				return null;
			}
			if (local152.anInt4979 < 13) {
				local152.method3832();
			}
			local105 = arg12.method5537(local152, local129, this.aClass41_1.anInt1483, this.anInt462 + 64, this.anInt464 + 850);
			@Pc(185) int local185;
			if (this.aShortArray15 != null) {
				for (local185 = 0; local185 < this.aShortArray15.length; local185++) {
					local105.N(this.aShortArray15[local185], this.aShortArray14[local185]);
				}
			}
			if (this.aShortArray12 != null) {
				for (local185 = 0; local185 < this.aShortArray12.length; local185++) {
					local105.YA(this.aShortArray12[local185], this.aShortArray13[local185]);
				}
			}
			local105.u(local7);
			@Pc(241) Class126 local241 = this.aClass41_1.aClass126_12;
			synchronized (this.aClass41_1.aClass126_12) {
				this.aClass41_1.aClass126_12.method3132((long) (this.anInt459 |= arg12.anInt6964 << 29), local105);
			}
		}
		@Pc(285) Class9 local285 = local23 == null ? local105.method5699(arg3, local7, true) : local23.method3183(arg8, arg1, 0, local105, arg4, local7, arg3);
		if (this.anInt474 != 128 || this.anInt468 != 128) {
			local285.XA(this.anInt474, this.anInt468, this.anInt474);
		}
		if (this.anInt458 != 0) {
			if (this.anInt458 == 90) {
				local285.k(4096);
			}
			if (this.anInt458 == 180) {
				local285.k(8192);
			}
			if (this.anInt458 == 270) {
				local285.k(12288);
			}
		}
		if (local32) {
			local285.ea(this.aByte11, this.anInt467, arg9, arg0, arg2, arg10, arg5);
		}
		local285.u(arg6);
		return local285;
	}
}
