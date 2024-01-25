import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class28_Sub1_Sub3_Sub2 extends Class28_Sub1_Sub3 implements Interface11 {

	@OriginalMember(owner = "client!rv", name = "ib", descriptor = "Lclient!el;")
	private Class92 aClass92_5;

	@OriginalMember(owner = "client!rv", name = "wb", descriptor = "Z")
	private boolean aBoolean693;

	@OriginalMember(owner = "client!rv", name = "vb", descriptor = "Z")
	private final boolean aBoolean692;

	@OriginalMember(owner = "client!rv", name = "qb", descriptor = "B")
	private final byte aByte131;

	@OriginalMember(owner = "client!rv", name = "Q", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!rv", name = "R", descriptor = "Z")
	private final boolean aBoolean690;

	@OriginalMember(owner = "client!rv", name = "sb", descriptor = "Z")
	private final boolean aBoolean691;

	@OriginalMember(owner = "client!rv", name = "jb", descriptor = "Lclient!r;")
	private Class3_Sub11_Sub3 aClass3_Sub11_Sub3_5;

	@OriginalMember(owner = "client!rv", name = "gb", descriptor = "Lclient!ka;")
	private Class95 aClass95_5;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIIIZIZ)V")
	public Class28_Sub1_Sub3_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt7720);
		this.aBoolean693 = arg9;
		super.anInt10729 = arg4;
		super.anInt10731 = arg6;
		this.aBoolean692 = arg1.anInt7757 != 0 && !arg7;
		this.aByte131 = (byte) arg8;
		this.aShort93 = (short) arg1.anInt7714;
		this.aBoolean690 = arg7;
		this.aBoolean691 = arg0.method8470() && arg1.aBoolean590 && !this.aBoolean690 && Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean693) {
			local66 |= 0x10000;
		}
		@Pc(81) Class136 local81 = this.method7732(local66, this.aBoolean691, arg0);
		if (local81 != null) {
			this.aClass3_Sub11_Sub3_5 = local81.aClass3_Sub11_Sub3_4;
			this.aClass95_5 = local81.aClass95_4;
			if (this.aBoolean693) {
				this.aClass95_5 = this.aClass95_5.method5664((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZLclient!ha;I)Lclient!hi;")
	private Class136 method7732(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class13 arg2) {
		@Pc(13) Class277 local13 = Static652.aClass267_4.method6682(this.aShort93 & 0xFFFF);
		@Pc(30) Class21 local30;
		@Pc(25) Class21 local25;
		if (this.aBoolean690) {
			local25 = Static582.aClass21Array3[0];
			local30 = Static108.aClass21Array1[super.aByte173];
		} else {
			if (super.aByte173 < 3) {
				local25 = Static582.aClass21Array3[super.aByte173 + 1];
			} else {
				local25 = null;
			}
			local30 = Static582.aClass21Array3[super.aByte173];
		}
		return local13.method6804(super.anInt10722, local25, this.aByte131, local30, (Class138) null, 22, arg0, arg1, super.anInt10729, super.anInt10731, arg2);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9222(@OriginalArg(0) Class13 arg0) {
		@Pc(33) Class3_Sub11_Sub3 local33;
		if (this.aClass3_Sub11_Sub3_5 == null && this.aBoolean691) {
			@Pc(26) Class136 local26 = this.method7732(262144, true, arg0);
			local33 = local26 == null ? null : local26.aClass3_Sub11_Sub3_4;
		} else {
			local33 = this.aClass3_Sub11_Sub3_5;
			this.aClass3_Sub11_Sub3_5 = null;
		}
		if (local33 != null) {
			Static658.method9292(local33, super.aByte173, super.anInt10729, super.anInt10731, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aClass95_5 == null ? false : this.aClass95_5.F();
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9220() {
		return this.aBoolean691;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		if (this.aClass92_5 == null) {
			this.aClass92_5 = Static648.method8990(this.method7735(arg0, 0), super.anInt10731, super.anInt10729, super.anInt10722);
		}
		return this.aClass92_5;
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 != -13878) {
			this.aShort93 = -86;
		}
		return this.aClass95_5 == null ? 0 : this.aClass95_5.ma();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class28_Sub1_Sub3_Sub2) {
			@Pc(11) Class28_Sub1_Sub3_Sub2 local11 = (Class28_Sub1_Sub3_Sub2) arg1;
			if (this.aClass95_5 != null && local11.aClass95_5 != null) {
				this.aClass95_5.method5673(local11.aClass95_5, arg3, arg4, arg5, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
	@Override
	public int method9216() {
		return 22;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		if (this.aClass95_5 == null) {
			return null;
		}
		@Pc(11) Class239 local11 = arg0.method8447();
		local11.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		@Pc(25) Class28_Sub3 local25 = Static4.method120(this.aBoolean692, 1);
		if (Static443.aBoolean515) {
			this.aClass95_5.method5659(local11, local25.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			this.aClass95_5.method5653(local11, local25.aClass28_Sub8Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)I")
	@Override
	public int method9221() {
		return this.aShort93 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		if (this.aClass95_5 == null) {
			return true;
		} else {
			return !this.aClass95_5.r();
		}
	}

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(14) Class95 local14 = this.method7735(arg2, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class239 local19 = arg2.method8447();
			local19.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			return Static443.aBoolean515 ? local14.method5650(arg1, arg0, local19, false, 0, Static675.anInt10880) : local14.method5658(arg1, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		this.aBoolean693 = false;
		if (this.aClass95_5 != null) {
			this.aClass95_5.s(this.aClass95_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9218(@OriginalArg(0) Class13 arg0) {
		@Pc(14) Class3_Sub11_Sub3 local14;
		if (this.aClass3_Sub11_Sub3_5 == null && this.aBoolean691) {
			@Pc(25) Class136 local25 = this.method7732(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass3_Sub11_Sub3_4;
		} else {
			local14 = this.aClass3_Sub11_Sub3_5;
			this.aClass3_Sub11_Sub3_5 = null;
		}
		if (local14 != null) {
			Static351.method5213(local14, super.aByte173, super.anInt10729, super.anInt10731, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.aClass95_5 == null ? 0 : this.aClass95_5.fa();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class95 method7735(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass95_5 != null && arg0.method8495(this.aClass95_5.ua(), arg1) == 0) {
			return this.aClass95_5;
		} else {
			@Pc(23) Class136 local23 = this.method7732(arg1, false, arg0);
			return local23 == null ? null : local23.aClass95_4;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
	@Override
	public void method9219() {
		if (this.aClass95_5 != null) {
			this.aClass95_5.method5665();
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.aByte131;
	}
}
