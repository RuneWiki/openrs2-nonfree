import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wja")
public final class Class28_Sub1_Sub1_Sub5 extends Class28_Sub1_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!wja", name = "lb", descriptor = "Lclient!el;")
	private Class92 lb;

	@OriginalMember(owner = "client!wja", name = "qb", descriptor = "Z")
	private boolean aBoolean811 = false;

	@OriginalMember(owner = "client!wja", name = "fb", descriptor = "Lclient!ek;")
	public final Class90 aClass90_4;

	@OriginalMember(owner = "client!wja", name = "db", descriptor = "Z")
	private final boolean aBoolean810;

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIIIZIIIIIII)V")
	public Class28_Sub1_Sub1_Sub5(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7738 == 1, Static43.method1104(arg13, arg12));
		this.aClass90_4 = new Class90(arg0, arg1, arg12, arg13, super.aByte174, arg3, this, arg7, arg14);
		this.aBoolean810 = arg1.anInt7757 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wja", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)I")
	@Override
	public int method9216() {
		return this.aClass90_4.anInt2766;
	}

	@OriginalMember(owner = "client!wja", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aBoolean811;
	}

	@OriginalMember(owner = "client!wja", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		return arg0 == -13878 ? this.aClass90_4.method2524((byte) 110) : -33;
	}

	@OriginalMember(owner = "client!wja", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9220() {
		return this.aClass90_4.method2532();
	}

	@OriginalMember(owner = "client!wja", name = "e", descriptor = "(I)I")
	@Override
	public int method9221() {
		return this.aClass90_4.anInt2761;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return this.lb;
	}

	@OriginalMember(owner = "client!wja", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		@Pc(14) Class95 local14 = this.aClass90_4.method2521(arg0, true, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(27) Class239 local27 = arg0.method8447();
		local27.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		@Pc(43) Class28_Sub3 local43 = Static4.method120(this.aBoolean810, 1);
		this.aClass90_4.method2528(arg0, true, super.aShort124, super.aShort122, super.aShort123, super.aShort125, local27, local14);
		if (Static443.aBoolean515) {
			local14.method5659(local27, local43.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			local14.method5653(local27, local43.aClass28_Sub8Array1[0], 0);
		}
		if (this.aClass90_4.aClass28_Sub7_2 != null) {
			@Pc(89) Class84 local89 = this.aClass90_4.aClass28_Sub7_2.method7917();
			if (Static443.aBoolean515) {
				arg0.method8506(local89, Static675.anInt10880);
			} else {
				arg0.method8499(local89);
			}
		}
		this.aBoolean811 = local14.F() || this.aClass90_4.aClass28_Sub7_2 != null;
		if (this.lb == null) {
			this.lb = Static648.method8990(local14, super.anInt10731, super.anInt10729, super.anInt10722);
		} else {
			Static385.method5500(local14, this.lb, super.anInt10722, super.anInt10731, super.anInt10729);
		}
		return local43;
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9222(@OriginalArg(0) Class13 arg0) {
		this.aClass90_4.method2533(arg0);
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9218(@OriginalArg(0) Class13 arg0) {
		this.aClass90_4.method2530(arg0);
	}

	@OriginalMember(owner = "client!wja", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		return false;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
		@Pc(17) Class95 local17 = this.aClass90_4.method2521(arg0, true, 262144, true);
		if (local17 != null) {
			@Pc(22) Class239 local22 = arg0.method8447();
			local22.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			this.aClass90_4.method2528(arg0, false, super.aShort124, super.aShort122, super.aShort123, super.aShort125, local22, local17);
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lclient!hj;I)V")
	public void method9223(@OriginalArg(0) Class138 arg0) {
		this.aClass90_4.method2527(arg0);
	}

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)V")
	@Override
	public void method9219() {
	}

	@OriginalMember(owner = "client!wja", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.aClass90_4.method2523();
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(12) Class95 local12 = this.aClass90_4.method2521(arg2, false, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class239 local19 = arg2.method8447();
			local19.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			return Static443.aBoolean515 ? local12.method5650(arg1, arg0, local19, false, 0, Static675.anInt10880) : local12.method5658(arg1, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.aClass90_4.anInt2771;
	}
}
