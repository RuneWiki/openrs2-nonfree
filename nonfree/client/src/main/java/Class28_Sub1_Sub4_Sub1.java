import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class28_Sub1_Sub4_Sub1 extends Class28_Sub1_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!to", name = "ab", descriptor = "Lclient!el;")
	private Class92 aClass92_6;

	@OriginalMember(owner = "client!to", name = "kb", descriptor = "Z")
	private boolean aBoolean726 = false;

	@OriginalMember(owner = "client!to", name = "bb", descriptor = "Lclient!ek;")
	public final Class90 aClass90_3;

	@OriginalMember(owner = "client!to", name = "ob", descriptor = "Z")
	private final boolean aBoolean727;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIIIZIII)V")
	public Class28_Sub1_Sub4_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static1.method5540(arg8, arg9));
		this.aClass90_3 = new Class90(arg0, arg1, arg8, arg9, super.aByte174, arg3, this, arg7, arg10);
		this.aBoolean727 = arg1.anInt7757 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!to", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!to", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aBoolean726;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(12) Class95 local12 = this.aClass90_3.method2521(arg2, false, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class239 local24 = arg2.method8447();
			local24.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			return Static443.aBoolean515 ? local12.method5650(arg1, arg0, local24, false, 0, Static675.anInt10880) : local12.method5658(arg1, arg0, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method9216() {
		return this.aClass90_3.anInt2766;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.aClass90_3.anInt2771;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return this.aClass92_6;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
		@Pc(12) Class95 local12 = this.aClass90_3.method2521(arg0, true, 262144, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10729 >> 9;
		@Pc(24) int local24 = super.anInt10731 >> 9;
		@Pc(27) Class239 local27 = arg0.method8447();
		local27.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		this.aClass90_3.method2528(arg0, false, local19, local24, local24, local19, local27, local12);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!hj;)V")
	public void method8241(@OriginalArg(1) Class138 arg0) {
		this.aClass90_3.method2527(arg0);
	}

	@OriginalMember(owner = "client!to", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.aClass90_3.method2523();
	}

	@OriginalMember(owner = "client!to", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 != -13878) {
			this.aBoolean726 = false;
		}
		return this.aClass90_3.method2524((byte) 122);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		@Pc(14) Class95 local14 = this.aClass90_3.method2521(arg0, true, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(27) Class239 local27 = arg0.method8447();
		local27.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		@Pc(43) Class28_Sub3 local43 = Static4.method120(this.aBoolean727, 1);
		@Pc(48) int local48 = super.anInt10729 >> 9;
		@Pc(53) int local53 = super.anInt10731 >> 9;
		this.aClass90_3.method2528(arg0, true, local48, local53, local53, local48, local27, local14);
		if (Static443.aBoolean515) {
			local14.method5659(local27, local43.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			local14.method5653(local27, local43.aClass28_Sub8Array1[0], 0);
		}
		if (this.aClass90_3.aClass28_Sub7_2 != null) {
			@Pc(95) Class84 local95 = this.aClass90_3.aClass28_Sub7_2.method7917();
			if (Static443.aBoolean515) {
				arg0.method8506(local95, Static675.anInt10880);
			} else {
				arg0.method8499(local95);
			}
		}
		this.aBoolean726 = local14.F() || this.aClass90_3.aClass28_Sub7_2 != null;
		if (this.aClass92_6 == null) {
			this.aClass92_6 = Static648.method8990(local14, super.anInt10731, super.anInt10729, super.anInt10722);
		} else {
			Static385.method5500(local14, this.aClass92_6, super.anInt10722, super.anInt10731, super.anInt10729);
		}
		return local43;
	}

	@OriginalMember(owner = "client!to", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9222(@OriginalArg(0) Class13 arg0) {
		this.aClass90_3.method2533(arg0);
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9220() {
		return this.aClass90_3.method2532();
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(I)I")
	@Override
	public int method9221() {
		return this.aClass90_3.anInt2761;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
	@Override
	public void method9219() {
	}

	@OriginalMember(owner = "client!to", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9218(@OriginalArg(0) Class13 arg0) {
		this.aClass90_3.method2530(arg0);
	}
}
