import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class149 {

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	private int anInt4580;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	public int anInt4583;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "Lclient!ol;")
	public Class186 aClass186_2;

	@OriginalMember(owner = "client!lq", name = "B", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	public int anInt4573 = -1;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
	private int anInt4579 = -1;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	private int anInt4574 = 128;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
	private int anInt4576 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	private int anInt4572 = 128;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
	private int anInt4577 = 0;

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
	private int anInt4585 = 0;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "B")
	public byte aByte46 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BILclient!wn;)V")
	private void method3919(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt4580 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt4573 = arg1.method4560();
		} else if (arg0 == 4) {
			this.anInt4574 = arg1.method4560();
		} else if (arg0 == 5) {
			this.anInt4572 = arg1.method4560();
		} else if (arg0 == 6) {
			this.anInt4576 = arg1.method4560();
		} else if (arg0 == 7) {
			this.anInt4585 = arg1.method4614();
		} else if (arg0 == 8) {
			this.anInt4577 = arg1.method4614();
		} else if (arg0 == 9) {
			this.aByte46 = 3;
			this.anInt4579 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean297 = true;
		} else if (arg0 == 11) {
			this.aByte46 = 1;
		} else if (arg0 == 12) {
			this.aByte46 = 4;
		} else if (arg0 == 13) {
			this.aByte46 = 5;
		} else if (arg0 == 14) {
			this.aByte46 = 2;
			this.anInt4579 = arg1.method4614() * 256;
		} else if (arg0 == 15) {
			this.aByte46 = 3;
			this.anInt4579 = arg1.method4560();
		} else if (arg0 == 16) {
			this.aByte46 = 3;
			this.anInt4579 = arg1.method4595();
		} else {
			@Pc(117) int local117;
			@Pc(127) int local127;
			if (arg0 == 40) {
				local117 = arg1.method4614();
				this.aShortArray71 = new short[local117];
				this.aShortArray69 = new short[local117];
				for (local127 = 0; local127 < local117; local127++) {
					this.aShortArray71[local127] = (short) arg1.method4560();
					this.aShortArray69[local127] = (short) arg1.method4560();
				}
			} else if (arg0 == 41) {
				local117 = arg1.method4614();
				this.aShortArray68 = new short[local117];
				this.aShortArray70 = new short[local117];
				for (local127 = 0; local127 < local117; local127++) {
					this.aShortArray68[local127] = (short) arg1.method4560();
					this.aShortArray70[local127] = (short) arg1.method4560();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!wn;I)V")
	public void method3920(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4614();
			if (local5 == 0) {
				return;
			}
			this.method3919(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIBZIIILclient!gj;Lclient!o;Lclient!qa;Lclient!o;I)Lclient!ka;")
	private Class57 method3921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class85 arg8, @OriginalArg(10) Class14 arg9, @OriginalArg(11) Class30 arg10, @OriginalArg(12) Class14 arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg1;
		@Pc(23) Class130 local23 = this.anInt4573 == -1 || arg3 == -1 ? null : arg8.method2406(this.anInt4573);
		@Pc(35) boolean local35 = arg5 & this.aByte46 != 0;
		if (local23 != null) {
			local7 = arg1 | local23.method3539(arg3, arg2, false);
		}
		if (local35) {
			local7 |= this.aByte46 == 3 ? 7 : 2;
		}
		if (this.anInt4572 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4574 != 128 || this.anInt4576 != 0) {
			local7 |= 0x5;
		}
		@Pc(84) Class83 local84 = this.aClass186_2.aClass83_36;
		@Pc(104) Class57 local104;
		synchronized (this.aClass186_2.aClass83_36) {
			local104 = (Class57) this.aClass186_2.aClass83_36.method2338((long) (this.anInt4583 |= arg10.anInt2271 << 29));
		}
		if (local104 == null || arg10.method2065(local104.ma(), local7) != 0) {
			if (local104 != null) {
				local7 = arg10.method2102(local7, local104.ma());
			}
			@Pc(128) int local128 = local7;
			if (this.aShortArray71 != null) {
				local128 = local7 | 0x4000;
			}
			if (this.aShortArray68 != null) {
				local128 |= 0x8000;
			}
			@Pc(151) Class37 local151 = Static39.method813(this.aClass186_2.aClass38_58, this.anInt4580);
			if (local151 == null) {
				return null;
			}
			if (local151.anInt1037 < 13) {
				local151.method999();
			}
			local104 = arg10.method2036(local151, local128, this.aClass186_2.anInt5358, this.anInt4585 + 64, this.anInt4577 - -850);
			@Pc(184) int local184;
			if (this.aShortArray71 != null) {
				for (local184 = 0; local184 < this.aShortArray71.length; local184++) {
					local104.i(this.aShortArray71[local184], this.aShortArray69[local184]);
				}
			}
			if (this.aShortArray68 != null) {
				for (local184 = 0; local184 < this.aShortArray68.length; local184++) {
					local104.G(this.aShortArray68[local184], this.aShortArray70[local184]);
				}
			}
			local104.B(local7);
			@Pc(236) Class83 local236 = this.aClass186_2.aClass83_36;
			synchronized (this.aClass186_2.aClass83_36) {
				this.aClass186_2.aClass83_36.method2337(local104, (long) (this.anInt4583 |= arg10.anInt2271 << 29));
			}
		}
		@Pc(286) Class57 local286 = local23 == null ? local104.method6075(arg4, local7, true) : local23.method3536(arg4, arg3, 0, arg12, arg2, local104, local7);
		if (this.anInt4574 != 128 || this.anInt4572 != 128) {
			local286.Z(this.anInt4574, this.anInt4572, this.anInt4574);
		}
		if (this.anInt4576 != 0) {
			if (this.anInt4576 == 90) {
				local286.l(4096);
			}
			if (this.anInt4576 == 180) {
				local286.l(8192);
			}
			if (this.anInt4576 == 270) {
				local286.l(12288);
			}
		}
		if (local35) {
			local286.g(this.aByte46, this.anInt4579, arg9, arg11, arg7, arg0, arg6);
		}
		local286.B(arg1);
		return local286;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!qa;ILclient!gj;IIII)Lclient!ka;")
	public Class57 method3923(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class85 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method3921(0, arg3, arg5, arg4, (byte) 2, false, 0, 0, arg1, null, arg0, null, arg2);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIILclient!qa;Lclient!o;Lclient!gj;Lclient!o;ZIII)Lclient!ka;")
	public Class57 method3924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) Class85 arg6, @OriginalArg(8) Class14 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method3921(arg3, arg0, arg10, arg9, (byte) 2, true, arg8, arg1, arg6, arg5, arg4, arg7, arg2);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!gj;IBLclient!qa;III)Lclient!ka;")
	public Class57 method3925(@OriginalArg(0) Class85 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method3921(0, arg1, arg4, arg5, (byte) 5, false, 0, 0, arg0, null, arg2, null, arg3);
	}
}
