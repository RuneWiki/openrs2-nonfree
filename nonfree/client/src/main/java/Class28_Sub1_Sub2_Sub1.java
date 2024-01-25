import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class28_Sub1_Sub2_Sub1 extends Class28_Sub1_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!ft", name = "nb", descriptor = "Lclient!el;")
	private Class92 aClass92_2;

	@OriginalMember(owner = "client!ft", name = "hb", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!ft", name = "fb", descriptor = "Lclient!ek;")
	public final Class90 aClass90_1;

	@OriginalMember(owner = "client!ft", name = "W", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIIIZIIIII)V")
	public Class28_Sub1_Sub2_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass90_1 = new Class90(arg0, arg1, arg10, arg11, super.aByte174, arg3, this, arg7, arg12);
		this.aBoolean266 = arg1.anInt7757 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.aClass90_1.anInt2771;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I")
	@Override
	public int method9216() {
		return this.aClass90_1.anInt2766;
	}

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9222(@OriginalArg(0) Class13 arg0) {
		this.aClass90_1.method2533(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aBoolean267;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		@Pc(14) Class95 local14 = this.aClass90_1.method2521(arg0, true, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class239 local21 = arg0.method8447();
		local21.method9234(super.anInt10729 + super.aShort37, super.anInt10722, super.aShort38 + super.anInt10731);
		@Pc(50) Class28_Sub3 local50 = Static4.method120(this.aBoolean266, 1);
		@Pc(55) int local55 = super.anInt10729 >> 9;
		@Pc(60) int local60 = super.anInt10731 >> 9;
		this.aClass90_1.method2528(arg0, true, local55, local60, local60, local55, local21, local14);
		if (Static443.aBoolean515) {
			local14.method5659(local21, local50.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			local14.method5653(local21, local50.aClass28_Sub8Array1[0], 0);
		}
		if (this.aClass90_1.aClass28_Sub7_2 != null) {
			@Pc(102) Class84 local102 = this.aClass90_1.aClass28_Sub7_2.method7917();
			if (Static443.aBoolean515) {
				arg0.method8506(local102, Static675.anInt10880);
			} else {
				arg0.method8499(local102);
			}
		}
		this.aBoolean267 = local14.F() || this.aClass90_1.aClass28_Sub7_2 != null;
		if (this.aClass92_2 == null) {
			this.aClass92_2 = Static648.method8990(local14, super.anInt10731, super.anInt10729, super.anInt10722);
		} else {
			Static385.method5500(local14, this.aClass92_2, super.anInt10722, super.anInt10731, super.anInt10729);
		}
		return local50;
	}

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.aClass90_1.method2523();
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
	@Override
	public void method9219() {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!hj;)V")
	public void method3200(@OriginalArg(1) Class138 arg0) {
		this.aClass90_1.method2527(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return this.aClass92_2;
	}

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 != -13878) {
			this.method9291((Class13) null);
		}
		return this.aClass90_1.method2524((byte) 111);
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9220() {
		return this.aClass90_1.method2532();
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)I")
	@Override
	public int method9221() {
		return this.aClass90_1.anInt2761;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
		@Pc(12) Class95 local12 = this.aClass90_1.method2521(arg0, true, 262144, false);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10729 >> 9;
		@Pc(24) int local24 = super.anInt10731 >> 9;
		@Pc(27) Class239 local27 = arg0.method8447();
		local27.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		this.aClass90_1.method2528(arg0, false, local19, local24, local24, local19, local27, local12);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(18) Class95 local18 = this.aClass90_1.method2521(arg2, false, 131072, false);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class239 local25 = arg2.method8447();
			local25.method9234(super.aShort37 + super.anInt10729, super.anInt10722, super.aShort38 + super.anInt10731);
			return Static443.aBoolean515 ? local18.method5650(arg1, arg0, local25, false, 0, Static675.anInt10880) : local18.method5658(arg1, arg0, local25, false, 0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9218(@OriginalArg(0) Class13 arg0) {
		this.aClass90_1.method2530(arg0);
	}
}
