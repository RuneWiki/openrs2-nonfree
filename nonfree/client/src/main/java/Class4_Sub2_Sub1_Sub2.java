import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class4_Sub2_Sub1_Sub2 extends Class4_Sub2_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!lq", name = "fb", descriptor = "Lclient!kn;")
	private Class200 aClass200_4;

	@OriginalMember(owner = "client!lq", name = "kb", descriptor = "Z")
	private boolean aBoolean393 = false;

	@OriginalMember(owner = "client!lq", name = "cb", descriptor = "Lclient!pw;")
	public final Class280 aClass280_2;

	@OriginalMember(owner = "client!lq", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIIIZIIIIIII)V")
	public Class4_Sub2_Sub1_Sub2(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4733 == 1, Static575.method8332(arg12, arg13));
		this.aClass280_2 = new Class280(arg0, arg1, arg12, arg13, super.aByte132, arg3, this, arg7, arg14);
		this.lb = arg1.anInt4779 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
		@Pc(12) Class187 local12 = this.aClass280_2.method6679(true, true, arg0, 262144);
		if (local12 != null) {
			@Pc(17) Class113 local17 = arg0.method7262();
			local17.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			this.aClass280_2.method6675(super.aShort108, arg0, super.aShort110, local17, local12, false, super.aShort109, super.aShort107);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8491() {
		return this.aClass280_2.method6677();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8489(@OriginalArg(1) Class133 arg0) {
		this.aClass280_2.method6686(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I")
	@Override
	public int method8490() {
		return this.aClass280_2.anInt7546;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V")
	@Override
	public void method8492() {
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return this.aClass200_4;
	}

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8494(@OriginalArg(0) Class133 arg0) {
		this.aClass280_2.method6680(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.aClass280_2.method6683();
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)I")
	@Override
	public int method8493() {
		return this.aClass280_2.anInt7559;
	}

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.aClass280_2.method6678(true);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aBoolean393;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(20) Class187 local20 = this.aClass280_2.method6679(false, false, arg2, 131072);
		if (local20 == null) {
			return false;
		} else {
			@Pc(27) Class113 local27 = arg2.method7262();
			local27.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			return Static57.aBoolean65 ? local20.method8641(arg0, arg1, local27, false, 0, Static469.anInt7885) : local20.method8642(arg0, arg1, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	@Override
	public int method8488() {
		return this.aClass280_2.anInt7560;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		@Pc(14) Class187 local14 = this.aClass280_2.method6679(false, true, arg0, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(26) Class113 local26 = arg0.method7262();
		local26.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		@Pc(40) Class4_Sub6 local40 = Static242.method4012(1, this.lb);
		this.aClass280_2.method6675(super.aShort108, arg0, super.aShort110, local26, local14, true, super.aShort109, super.aShort107);
		if (Static57.aBoolean65) {
			local14.method8654(local26, local40.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			local14.method8645(local26, local40.aClass4_Sub9Array1[0], 0);
		}
		if (this.aClass280_2.aClass4_Sub4_5 != null) {
			@Pc(86) Class235 local86 = this.aClass280_2.aClass4_Sub4_5.method1961();
			if (Static57.aBoolean65) {
				arg0.method7302(local86, Static469.anInt7885);
			} else {
				arg0.method7308(local86);
			}
		}
		this.aBoolean393 = local14.F() || this.aClass280_2.aClass4_Sub4_5 != null;
		if (this.aClass200_4 == null) {
			this.aClass200_4 = Static446.method6733(local14, super.anInt10228, super.anInt10229, super.anInt10231);
		} else {
			Static308.method6298(local14, super.anInt10229, this.aClass200_4, super.anInt10231, super.anInt10228);
		}
		return local40;
	}
}
