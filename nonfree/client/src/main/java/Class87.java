import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class87 {

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	public int anInt2309;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "Lclient!nba;")
	public Class195 aClass195_1;

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
	private int anInt2319;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
	private int anInt2311 = 0;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
	private int anInt2313 = 128;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
	private int anInt2312 = 128;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
	private int anInt2318 = 0;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
	private int anInt2320 = -1;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
	public int anInt2314 = -1;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Z")
	public boolean aBoolean193 = false;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "B")
	public byte aByte37 = 0;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
	private int anInt2315 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!os;I)V")
	private void method2229(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt2319 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt2314 = arg1.method4494();
		} else if (arg0 == 4) {
			this.anInt2312 = arg1.method4494();
		} else if (arg0 == 5) {
			this.anInt2313 = arg1.method4494();
		} else if (arg0 == 6) {
			this.anInt2318 = arg1.method4494();
		} else if (arg0 == 7) {
			this.anInt2311 = arg1.method4487();
		} else if (arg0 == 8) {
			this.anInt2315 = arg1.method4487();
		} else if (arg0 == 9) {
			this.anInt2320 = 8224;
			this.aByte37 = 3;
		} else if (arg0 == 10) {
			this.aBoolean193 = true;
		} else if (arg0 == 11) {
			this.aByte37 = 1;
		} else if (arg0 == 12) {
			this.aByte37 = 4;
		} else if (arg0 == 13) {
			this.aByte37 = 5;
		} else if (arg0 == 14) {
			this.aByte37 = 2;
			this.anInt2320 = arg1.method4487() * 256;
		} else if (arg0 == 15) {
			this.aByte37 = 3;
			this.anInt2320 = arg1.method4494();
		} else if (arg0 == 16) {
			this.aByte37 = 3;
			this.anInt2320 = arg1.method4481();
		} else {
			@Pc(120) int local120;
			@Pc(130) int local130;
			if (arg0 == 40) {
				local120 = arg1.method4487();
				this.aShortArray51 = new short[local120];
				this.aShortArray49 = new short[local120];
				for (local130 = 0; local130 < local120; local130++) {
					this.aShortArray49[local130] = (short) arg1.method4494();
					this.aShortArray51[local130] = (short) arg1.method4494();
				}
			} else if (arg0 == 41) {
				local120 = arg1.method4487();
				this.aShortArray50 = new short[local120];
				this.aShortArray52 = new short[local120];
				for (local130 = 0; local130 < local120; local130++) {
					this.aShortArray50[local130] = (short) arg1.method4494();
					this.aShortArray52[local130] = (short) arg1.method4494();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!jh;IBLclient!qa;ILclient!sa;IIIIBZLclient!sa;)Lclient!r;")
	private Class97 method2231(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) Class4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class7 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) Class7 arg12) {
		@Pc(7) int local7 = arg0;
		@Pc(22) Class176 local22 = this.anInt2314 == -1 || arg9 == -1 ? null : arg1.method4045(this.anInt2314);
		@Pc(34) boolean local34 = arg11 & this.aByte37 != 0;
		if (local22 != null) {
			local7 = arg0 | local22.method4868(false, arg5, arg9);
		}
		if (local34) {
			local7 |= this.aByte37 == 3 ? 7 : 2;
		}
		if (this.anInt2313 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2312 != 128 || this.anInt2318 != 0) {
			local7 |= 0x5;
		}
		@Pc(82) Class277 local82 = this.aClass195_1.aClass277_45;
		@Pc(102) Class97 local102;
		synchronized (this.aClass195_1.aClass277_45) {
			local102 = (Class97) this.aClass195_1.aClass277_45.method7014((long) (this.anInt2309 |= arg4.anInt8106 << 29));
		}
		if (local102 == null || arg4.method7167(local102.ba(), local7) != 0) {
			if (local102 != null) {
				local7 = arg4.method7184(local7, local102.ba());
			}
			@Pc(126) int local126 = local7;
			if (this.aShortArray49 != null) {
				local126 = local7 | 0x4000;
			}
			if (this.aShortArray50 != null) {
				local126 |= 0x8000;
			}
			@Pc(149) Class81 local149 = Static274.method4851(this.anInt2319, this.aClass195_1.aClass69_64);
			if (local149 == null) {
				return null;
			}
			if (local149.anInt2236 < 13) {
				local149.method2155();
			}
			local102 = arg4.method7192(local149, local126, this.aClass195_1.anInt6007, this.anInt2311 + 64, this.anInt2315 - -850);
			@Pc(184) int local184;
			if (this.aShortArray49 != null) {
				for (local184 = 0; local184 < this.aShortArray49.length; local184++) {
					local102.pa(this.aShortArray49[local184], this.aShortArray51[local184]);
				}
			}
			if (this.aShortArray50 != null) {
				for (local184 = 0; local184 < this.aShortArray50.length; local184++) {
					local102.L(this.aShortArray50[local184], this.aShortArray52[local184]);
				}
			}
			local102.m(local7);
			@Pc(236) Class277 local236 = this.aClass195_1.aClass277_45;
			synchronized (this.aClass195_1.aClass277_45) {
				this.aClass195_1.aClass277_45.method7016(local102, (long) (this.anInt2309 |= arg4.anInt8106 << 29));
			}
		}
		@Pc(280) Class97 local280 = local22 == null ? local102.method6770(arg3, local7, true) : local22.method4872(arg3, arg5, local7, local102, 0, arg9, arg2);
		if (this.anInt2312 != 128 || this.anInt2313 != 128) {
			local280.V(this.anInt2312, this.anInt2313, this.anInt2312);
		}
		if (this.anInt2318 != 0) {
			if (this.anInt2318 == 90) {
				local280.OA(4096);
			}
			if (this.anInt2318 == 180) {
				local280.OA(8192);
			}
			if (this.anInt2318 == 270) {
				local280.OA(12288);
			}
		}
		if (local34) {
			local280.RA(this.aByte37, this.anInt2320, arg12, arg6, arg10, arg7, arg8);
		}
		local280.m(arg0);
		return local280;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIILclient!qa;Lclient!jh;I)Lclient!r;")
	public Class97 method2233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) Class152 arg4, @OriginalArg(6) int arg5) {
		return this.method2231(arg2, arg4, arg0, (byte) 2, arg3, arg1, null, 0, 0, arg5, 0, false, null);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!jh;ILclient!qa;II)Lclient!r;")
	public Class97 method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method2231(arg1, arg2, arg0, (byte) 5, arg3, arg4, null, 0, 0, arg5, 0, false, null);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!qa;ILclient!jh;IIILclient!sa;IZLclient!sa;I)Lclient!r;")
	public Class97 method2237(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class152 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class7 arg7, @OriginalArg(9) int arg8, @OriginalArg(11) Class7 arg9, @OriginalArg(12) int arg10) {
		return this.method2231(arg4, arg3, arg0, (byte) 2, arg1, arg6, arg9, arg2, arg8, arg10, arg5, true, arg7);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!os;I)V")
	public void method2238(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4487();
			if (local7 == 0) {
				return;
			}
			this.method2229(local7, arg0);
		}
	}
}
