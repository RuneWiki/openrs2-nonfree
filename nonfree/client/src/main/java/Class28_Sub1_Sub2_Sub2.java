import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class28_Sub1_Sub2_Sub2 extends Class28_Sub1_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!gba", name = "vb", descriptor = "Lclient!el;")
	private Class92 aClass92_3;

	@OriginalMember(owner = "client!gba", name = "jb", descriptor = "Z")
	private final boolean aBoolean282;

	@OriginalMember(owner = "client!gba", name = "xb", descriptor = "S")
	private final short aShort39;

	@OriginalMember(owner = "client!gba", name = "T", descriptor = "Z")
	private final boolean aBoolean280;

	@OriginalMember(owner = "client!gba", name = "hb", descriptor = "B")
	private final byte aByte50;

	@OriginalMember(owner = "client!gba", name = "Z", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!gba", name = "ab", descriptor = "Z")
	private final boolean aBoolean281;

	@OriginalMember(owner = "client!gba", name = "fb", descriptor = "Lclient!r;")
	private Class3_Sub11_Sub3 aClass3_Sub11_Sub3_3;

	@OriginalMember(owner = "client!gba", name = "ub", descriptor = "Lclient!ka;")
	private Class95 aClass95_3;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIIIZIIII)V")
	public Class28_Sub1_Sub2_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10729 = arg4;
		this.aBoolean282 = arg1.anInt7757 != 0 && !arg7;
		this.aShort39 = (short) arg1.anInt7714;
		this.aBoolean280 = arg7;
		super.anInt10731 = arg6;
		this.aByte50 = (byte) arg10;
		this.aByte49 = (byte) arg11;
		this.aBoolean281 = arg0.method8470() && arg1.aBoolean590 && !this.aBoolean280 && Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374() != 0;
		@Pc(67) Class136 local67 = this.method3445(arg0, this.aBoolean281, 2048);
		if (local67 != null) {
			this.aClass3_Sub11_Sub3_3 = local67.aClass3_Sub11_Sub3_4;
			this.aClass95_3 = local67.aClass95_4;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
	}

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9220() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		if (this.aClass92_3 == null) {
			this.aClass92_3 = Static648.method8990(this.method3446(arg0, 0), super.anInt10731, super.anInt10729, super.anInt10722);
		}
		return this.aClass92_3;
	}

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aClass95_3 == null ? false : this.aClass95_3.F();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!ha;ZBI)Lclient!hi;")
	private Class136 method3445(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class277 local18 = Static652.aClass267_4.method6682(this.aShort39 & 0xFFFF);
		@Pc(26) Class21 local26;
		@Pc(39) Class21 local39;
		if (this.aBoolean280) {
			local39 = Static582.aClass21Array3[0];
			local26 = Static108.aClass21Array1[super.aByte173];
		} else {
			local26 = Static582.aClass21Array3[super.aByte173];
			if (super.aByte173 < 3) {
				local39 = Static582.aClass21Array3[super.aByte173 + 1];
			} else {
				local39 = null;
			}
		}
		return local18.method6804(super.anInt10722, local39, this.aByte49, local26, (Class138) null, this.aByte50, arg2, arg1, super.anInt10729, super.anInt10731, arg0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class95 method3446(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass95_3 != null && arg0.method8495(this.aClass95_3.ua(), arg1) == 0) {
			return this.aClass95_3;
		} else {
			@Pc(31) Class136 local31 = this.method3445(arg0, false, arg1);
			return local31 == null ? null : local31.aClass95_4;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(14) Class95 local14 = this.method3446(arg2, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class239 local19 = arg2.method8447();
			local19.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			return Static443.aBoolean515 ? local14.method5650(arg1, arg0, local19, false, 0, Static675.anInt10880) : local14.method5658(arg1, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!gba", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.aClass95_3 == null ? 0 : this.aClass95_3.fa();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		if (this.aClass95_3 == null) {
			return null;
		}
		@Pc(18) Class239 local18 = arg0.method8447();
		local18.method9234(super.anInt10729 + super.aShort37, super.anInt10722, super.aShort38 + super.anInt10731);
		@Pc(40) Class28_Sub3 local40 = Static4.method120(this.aBoolean282, 1);
		if (Static443.aBoolean515) {
			this.aClass95_3.method5659(local18, local40.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			this.aClass95_3.method5653(local18, local40.aClass28_Sub8Array1[0], 0);
		}
		return local40;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9218(@OriginalArg(0) Class13 arg0) {
		@Pc(34) Class3_Sub11_Sub3 local34;
		if (this.aClass3_Sub11_Sub3_3 == null && this.aBoolean281) {
			@Pc(27) Class136 local27 = this.method3445(arg0, true, 262144);
			local34 = local27 == null ? null : local27.aClass3_Sub11_Sub3_4;
		} else {
			local34 = this.aClass3_Sub11_Sub3_3;
			this.aClass3_Sub11_Sub3_3 = null;
		}
		if (local34 != null) {
			Static351.method5213(local34, super.aByte173, super.anInt10729, super.anInt10731, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
	@Override
	public void method9219() {
		if (this.aClass95_3 != null) {
			this.aClass95_3.method5665();
		}
	}

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "(I)I")
	@Override
	public int method9221() {
		return this.aShort39 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9222(@OriginalArg(0) Class13 arg0) {
		@Pc(25) Class3_Sub11_Sub3 local25;
		if (this.aClass3_Sub11_Sub3_3 == null && this.aBoolean281) {
			@Pc(18) Class136 local18 = this.method3445(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass3_Sub11_Sub3_4;
		} else {
			local25 = this.aClass3_Sub11_Sub3_3;
			this.aClass3_Sub11_Sub3_3 = null;
		}
		if (local25 != null) {
			Static658.method9292(local25, super.aByte173, super.anInt10729, super.anInt10731, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!gba", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		if (this.aClass95_3 == null) {
			return true;
		} else {
			return !this.aClass95_3.r();
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.aByte49;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)I")
	@Override
	public int method9216() {
		return this.aByte50;
	}

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 == -13878) {
			return this.aClass95_3 == null ? 0 : this.aClass95_3.ma();
		} else {
			return 39;
		}
	}
}
