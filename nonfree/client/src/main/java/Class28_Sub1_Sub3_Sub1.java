import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class28_Sub1_Sub3_Sub1 extends Class28_Sub1_Sub3 implements Interface11 {

	@OriginalMember(owner = "client!np", name = "eb", descriptor = "Lclient!el;")
	private Class92 aClass92_4;

	@OriginalMember(owner = "client!np", name = "ob", descriptor = "Z")
	private boolean aBoolean465 = false;

	@OriginalMember(owner = "client!np", name = "jb", descriptor = "Lclient!ek;")
	public final Class90 aClass90_2;

	@OriginalMember(owner = "client!np", name = "Y", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIIIZII)V")
	public Class28_Sub1_Sub3_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt7720);
		this.aClass90_2 = new Class90(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean464 = arg1.anInt7757 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.aClass90_2.anInt2771;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return this.aClass92_4;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9222(@OriginalArg(0) Class13 arg0) {
		this.aClass90_2.method2533(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	@Override
	public int method9216() {
		return this.aClass90_2.anInt2766;
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)I")
	@Override
	public int method9221() {
		return this.aClass90_2.anInt2761;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(12) Class95 local12 = this.aClass90_2.method2521(arg2, false, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class239 local24 = arg2.method8447();
			local24.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			return Static443.aBoolean515 ? local12.method5650(arg1, arg0, local24, false, 0, Static675.anInt10880) : local12.method5658(arg1, arg0, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9220() {
		return this.aClass90_2.method2532();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		@Pc(14) Class95 local14 = this.aClass90_2.method2521(arg0, true, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class239 local21 = arg0.method8447();
		local21.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		@Pc(35) Class28_Sub3 local35 = Static4.method120(this.aBoolean464, 1);
		@Pc(45) int local45 = super.anInt10729 >> 9;
		@Pc(50) int local50 = super.anInt10731 >> 9;
		this.aClass90_2.method2528(arg0, true, local45, local50, local50, local45, local21, local14);
		if (Static443.aBoolean515) {
			local14.method5659(local21, local35.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			local14.method5653(local21, local35.aClass28_Sub8Array1[0], 0);
		}
		if (this.aClass90_2.aClass28_Sub7_2 != null) {
			@Pc(92) Class84 local92 = this.aClass90_2.aClass28_Sub7_2.method7917();
			if (Static443.aBoolean515) {
				arg0.method8506(local92, Static675.anInt10880);
			} else {
				arg0.method8499(local92);
			}
		}
		this.aBoolean465 = local14.F() || this.aClass90_2.aClass28_Sub7_2 != null;
		if (this.aClass92_4 == null) {
			this.aClass92_4 = Static648.method8990(local14, super.anInt10731, super.anInt10729, super.anInt10722);
		} else {
			Static385.method5500(local14, this.aClass92_4, super.anInt10722, super.anInt10731, super.anInt10729);
		}
		return local35;
	}

	@OriginalMember(owner = "client!np", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aBoolean465;
	}

	@OriginalMember(owner = "client!np", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
		@Pc(18) Class95 local18 = this.aClass90_2.method2521(arg0, true, 262144, true);
		if (local18 == null) {
			return;
		}
		@Pc(25) int local25 = super.anInt10729 >> 9;
		@Pc(30) int local30 = super.anInt10731 >> 9;
		@Pc(33) Class239 local33 = arg0.method8447();
		local33.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		this.aClass90_2.method2528(arg0, false, local25, local30, local30, local25, local33, local18);
	}

	@OriginalMember(owner = "client!np", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.aClass90_2.method2523();
	}

	@OriginalMember(owner = "client!np", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9218(@OriginalArg(0) Class13 arg0) {
		this.aClass90_2.method2530(arg0);
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	@Override
	public void method9219() {
	}

	@OriginalMember(owner = "client!np", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		return false;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!hj;Z)V")
	public void method5857(@OriginalArg(0) Class138 arg0) {
		this.aClass90_2.method2527(arg0);
	}

	@OriginalMember(owner = "client!np", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 != -13878) {
			this.aBoolean464 = false;
		}
		return this.aClass90_2.method2524((byte) 117);
	}
}
