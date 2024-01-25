import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class28_Sub1_Sub1_Sub2 extends Class28_Sub1_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!eh", name = "yb", descriptor = "Lclient!el;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!eh", name = "wb", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!eh", name = "Jb", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!eh", name = "bb", descriptor = "S")
	private final short aShort26;

	@OriginalMember(owner = "client!eh", name = "ub", descriptor = "Z")
	private final boolean aBoolean212;

	@OriginalMember(owner = "client!eh", name = "kb", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!eh", name = "mb", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "Z")
	private final boolean aBoolean210;

	@OriginalMember(owner = "client!eh", name = "jb", descriptor = "Lclient!ka;")
	public Class95 aClass95_1;

	@OriginalMember(owner = "client!eh", name = "xb", descriptor = "Lclient!r;")
	private Class3_Sub11_Sub3 aClass3_Sub11_Sub3_1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIIIZIIIIIIZ)V")
	public Class28_Sub1_Sub1_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7738 == 1, Static93.method9375(arg12, arg13));
		this.aByte39 = (byte) arg13;
		this.aBoolean213 = arg14;
		super.aByte173 = (byte) arg3;
		this.aShort26 = (short) arg1.anInt7714;
		this.aBoolean212 = arg1.anInt7757 != 0 && !arg7;
		this.aBoolean211 = arg7;
		this.aByte38 = (byte) arg12;
		this.aBoolean210 = arg0.method8470() && arg1.aBoolean590 && !this.aBoolean211 && Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374() != 0;
		@Pc(81) int local81 = 2048;
		if (this.aBoolean213) {
			local81 |= 0x10000;
		}
		@Pc(96) Class136 local96 = this.method2492(local81, arg0, this.aBoolean210);
		if (local96 != null) {
			this.aClass95_1 = local96.aClass95_4;
			this.aClass3_Sub11_Sub3_1 = local96.aClass3_Sub11_Sub3_4;
			if (this.aBoolean213) {
				this.aClass95_1 = this.aClass95_1.method5664((byte) 0, local81, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
	@Override
	public void method9219() {
		if (this.aClass95_1 != null) {
			this.aClass95_1.method5665();
		}
	}

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.aClass95_1 == null ? 0 : this.aClass95_1.fa();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(9) Class95 local9 = this.method2496(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class239 local14 = arg2.method8447();
			local14.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			return Static443.aBoolean515 ? local9.method5650(arg1, arg0, local14, false, 0, Static675.anInt10880) : local9.method5658(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
	}

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 != -13878) {
			Static131.method2497(126);
		}
		return this.aClass95_1 == null ? 0 : this.aClass95_1.ma();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
	@Override
	public int method9216() {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!ha;Z)Lclient!hi;")
	private Class136 method2492(@OriginalArg(0) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class277 local13 = Static652.aClass267_4.method6682(this.aShort26 & 0xFFFF);
		@Pc(36) Class21 local36;
		@Pc(22) Class21 local22;
		if (this.aBoolean211) {
			local36 = Static108.aClass21Array1[super.aByte173];
			local22 = Static582.aClass21Array3[0];
		} else {
			if (super.aByte173 >= 3) {
				local22 = null;
			} else {
				local22 = Static582.aClass21Array3[super.aByte173 + 1];
			}
			local36 = Static582.aClass21Array3[super.aByte173];
		}
		return local13.method6804(super.anInt10722, local22, this.aByte38 == 11 ? this.aByte39 + 4 : this.aByte39, local36, (Class138) null, this.aByte38 == 11 ? 10 : this.aByte38, arg0, arg2, super.anInt10729, super.anInt10731, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		if (this.aClass95_1 == null) {
			return null;
		}
		@Pc(11) Class239 local11 = arg0.method8447();
		local11.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		@Pc(30) Class28_Sub3 local30 = Static4.method120(this.aBoolean212, 1);
		if (Static443.aBoolean515) {
			this.aClass95_1.method5659(local11, local30.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			this.aClass95_1.method5653(local11, local30.aClass28_Sub8Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9218(@OriginalArg(0) Class13 arg0) {
		@Pc(20) Class3_Sub11_Sub3 local20;
		if (this.aClass3_Sub11_Sub3_1 == null && this.aBoolean210) {
			@Pc(31) Class136 local31 = this.method2492(262144, arg0, true);
			local20 = local31 == null ? null : local31.aClass3_Sub11_Sub3_4;
		} else {
			local20 = this.aClass3_Sub11_Sub3_1;
			this.aClass3_Sub11_Sub3_1 = null;
		}
		if (local20 != null) {
			Static351.method5213(local20, super.aByte173, super.anInt10729, super.anInt10731, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		this.aBoolean213 = false;
		if (this.aClass95_1 != null) {
			this.aClass95_1.s(this.aClass95_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aClass95_1 == null ? false : this.aClass95_1.F();
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9222(@OriginalArg(0) Class13 arg0) {
		@Pc(25) Class3_Sub11_Sub3 local25;
		if (this.aClass3_Sub11_Sub3_1 == null && this.aBoolean210) {
			@Pc(18) Class136 local18 = this.method2492(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass3_Sub11_Sub3_4;
		} else {
			local25 = this.aClass3_Sub11_Sub3_1;
			this.aClass3_Sub11_Sub3_1 = null;
		}
		if (local25 != null) {
			Static658.method9292(local25, super.aByte173, super.anInt10729, super.anInt10731, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9220() {
		return this.aBoolean210;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		if (this.aClass92_1 == null) {
			this.aClass92_1 = Static648.method8990(this.method2496(arg0, 0), super.anInt10731, super.anInt10729, super.anInt10722);
		}
		return this.aClass92_1;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)I")
	public int method2495() {
		return this.aClass95_1 == null ? 15 : this.aClass95_1.na() / 4;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class95 method2496(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass95_1 != null && arg0.method8495(this.aClass95_1.ua(), arg1) == 0) {
			return this.aClass95_1;
		} else {
			@Pc(31) Class136 local31 = this.method2492(arg1, arg0, false);
			return local31 == null ? null : local31.aClass95_4;
		}
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)I")
	@Override
	public int method9221() {
		return this.aShort26 & 0xFFFF;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class28_Sub1_Sub4_Sub2) {
			@Pc(13) Class28_Sub1_Sub4_Sub2 local13 = (Class28_Sub1_Sub4_Sub2) arg1;
			if (this.aClass95_1 != null && local13.aClass95_6 != null) {
				this.aClass95_1.method5673(local13.aClass95_6, arg3, arg4, arg5, arg2);
			}
		} else if (arg1 instanceof Class28_Sub1_Sub1_Sub2) {
			@Pc(35) Class28_Sub1_Sub1_Sub2 local35 = (Class28_Sub1_Sub1_Sub2) arg1;
			if (this.aClass95_1 != null && local35.aClass95_1 != null) {
				this.aClass95_1.method5673(local35.aClass95_1, arg3, arg4, arg5, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		if (this.aClass95_1 == null) {
			return true;
		} else {
			return !this.aClass95_1.r();
		}
	}
}
