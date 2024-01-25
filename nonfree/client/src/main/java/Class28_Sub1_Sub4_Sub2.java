import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class28_Sub1_Sub4_Sub2 extends Class28_Sub1_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!ua", name = "ub", descriptor = "Lclient!el;")
	private Class92 aClass92_7;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "Z")
	private final boolean aBoolean735;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "Z")
	private final boolean aBoolean734;

	@OriginalMember(owner = "client!ua", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "S")
	private final short aShort105;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "B")
	private final byte aByte145;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "Z")
	private boolean aBoolean737;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "Z")
	private final boolean aBoolean736;

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lclient!ka;")
	public Class95 aClass95_6;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lclient!r;")
	private Class3_Sub11_Sub3 aClass3_Sub11_Sub3_6;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIIIZIIZ)V")
	public Class28_Sub1_Sub4_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static579.method8157(arg9, arg8));
		this.aBoolean735 = arg7;
		this.aBoolean734 = arg1.anInt7757 != 0 && !arg7;
		this.lb = (byte) arg9;
		this.aShort105 = (short) arg1.anInt7714;
		super.anInt10731 = arg6;
		super.anInt10729 = arg4;
		this.aByte145 = (byte) arg8;
		this.aBoolean737 = arg10;
		this.aBoolean736 = arg0.method8470() && arg1.aBoolean590 && !this.aBoolean735 && Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean737) {
			local66 |= 0x10000;
		}
		@Pc(81) Class136 local81 = this.method8344(local66, arg0, this.aBoolean736);
		if (local81 != null) {
			this.aClass95_6 = local81.aClass95_4;
			this.aClass3_Sub11_Sub3_6 = local81.aClass3_Sub11_Sub3_4;
			if (this.aBoolean737) {
				this.aClass95_6 = this.aClass95_6.method5664((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		if (this.aClass95_6 == null) {
			return true;
		} else {
			return !this.aClass95_6.r();
		}
	}

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return this.aBoolean737;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
	@Override
	public int method9216() {
		return this.aByte145;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(14) Class95 local14 = this.method8347(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class239 local19 = arg2.method8447();
			local19.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			return Static443.aBoolean515 ? local14.method5650(arg1, arg0, local19, false, 0, Static675.anInt10880) : local14.method5658(arg1, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 == -13878) {
			return this.aClass95_6 == null ? 0 : this.aClass95_6.ma();
		} else {
			return -111;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class28_Sub1_Sub4_Sub2) {
			@Pc(39) Class28_Sub1_Sub4_Sub2 local39 = (Class28_Sub1_Sub4_Sub2) arg1;
			if (this.aClass95_6 == null || local39.aClass95_6 == null) {
				return;
			}
			this.aClass95_6.method5673(local39.aClass95_6, arg3, arg4, arg5, arg2);
		} else if (arg1 instanceof Class28_Sub1_Sub1_Sub2) {
			@Pc(20) Class28_Sub1_Sub1_Sub2 local20 = (Class28_Sub1_Sub1_Sub2) arg1;
			if (this.aClass95_6 != null && local20.aClass95_1 != null) {
				this.aClass95_6.method5673(local20.aClass95_1, arg3, arg4, arg5, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9220() {
		return this.aBoolean736;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9218(@OriginalArg(0) Class13 arg0) {
		@Pc(14) Class3_Sub11_Sub3 local14;
		if (this.aClass3_Sub11_Sub3_6 == null && this.aBoolean736) {
			@Pc(25) Class136 local25 = this.method8344(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass3_Sub11_Sub3_4;
		} else {
			local14 = this.aClass3_Sub11_Sub3_6;
			this.aClass3_Sub11_Sub3_6 = null;
		}
		if (local14 != null) {
			Static351.method5213(local14, super.aByte173, super.anInt10729, super.anInt10731, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		if (this.aClass92_7 == null) {
			this.aClass92_7 = Static648.method8990(this.method8347(0, arg0), super.anInt10731, super.anInt10729, super.anInt10722);
		}
		return this.aClass92_7;
	}

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.aClass95_6 == null ? 0 : this.aClass95_6.fa();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9222(@OriginalArg(0) Class13 arg0) {
		@Pc(14) Class3_Sub11_Sub3 local14;
		if (this.aClass3_Sub11_Sub3_6 == null && this.aBoolean736) {
			@Pc(27) Class136 local27 = this.method8344(262144, arg0, true);
			local14 = local27 == null ? null : local27.aClass3_Sub11_Sub3_4;
		} else {
			local14 = this.aClass3_Sub11_Sub3_6;
			this.aClass3_Sub11_Sub3_6 = null;
		}
		if (local14 != null) {
			Static658.method9292(local14, super.aByte173, super.anInt10729, super.anInt10731, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!ha;Z)Lclient!hi;")
	private Class136 method8344(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class277 local13 = Static652.aClass267_4.method6682(this.aShort105 & 0xFFFF);
		@Pc(27) Class21 local27;
		@Pc(35) Class21 local35;
		if (this.aBoolean735) {
			local27 = Static108.aClass21Array1[super.aByte173];
			local35 = Static582.aClass21Array3[0];
		} else {
			local27 = Static582.aClass21Array3[super.aByte173];
			if (super.aByte173 >= 3) {
				local35 = null;
			} else {
				local35 = Static582.aClass21Array3[super.aByte173 + 1];
			}
		}
		return local13.method6804(super.anInt10722, local35, this.lb, local27, (Class138) null, this.aByte145, arg0, arg2, super.anInt10729, super.anInt10731, arg1);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	@Override
	public void method9219() {
		if (this.aClass95_6 != null) {
			this.aClass95_6.method5665();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		if (this.aClass95_6 == null) {
			return null;
		}
		@Pc(18) Class239 local18 = arg0.method8447();
		local18.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		@Pc(34) Class28_Sub3 local34 = Static4.method120(this.aBoolean734, 1);
		if (Static443.aBoolean515) {
			this.aClass95_6.method5659(local18, local34.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			this.aClass95_6.method5653(local18, local34.aClass28_Sub8Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)I")
	@Override
	public int method9221() {
		return this.aShort105 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aClass95_6 == null ? false : this.aClass95_6.F();
	}

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		this.aBoolean737 = false;
		if (this.aClass95_6 != null) {
			this.aClass95_6.s(this.aClass95_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class95 method8347(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		if (this.aClass95_6 != null && arg1.method8495(this.aClass95_6.ua(), arg0) == 0) {
			return this.aClass95_6;
		} else {
			@Pc(25) Class136 local25 = this.method8344(arg0, arg1, false);
			return local25 == null ? null : local25.aClass95_4;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
	}
}
