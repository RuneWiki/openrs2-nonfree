import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class4_Sub2_Sub4_Sub2 extends Class4_Sub2_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!nq", name = "G", descriptor = "Lclient!kn;")
	private Class200 aClass200_6;

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "Z")
	private boolean aBoolean452 = false;

	@OriginalMember(owner = "client!nq", name = "P", descriptor = "Lclient!pw;")
	public final Class280 aClass280_4;

	@OriginalMember(owner = "client!nq", name = "W", descriptor = "Z")
	private final boolean aBoolean453;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIIIZIII)V")
	public Class4_Sub2_Sub4_Sub2(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static224.method3816(arg9, arg8));
		this.aClass280_4 = new Class280(arg0, arg1, arg8, arg9, super.aByte132, arg3, this, arg7, arg10);
		this.aBoolean453 = arg1.anInt4779 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
	@Override
	public int method8493() {
		return this.aClass280_4.anInt7559;
	}

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aBoolean452;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I")
	@Override
	public int method8490() {
		return this.aClass280_4.anInt7546;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8491() {
		return this.aClass280_4.method6677();
	}

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.aClass280_4.method6678(true);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8494(@OriginalArg(0) Class133 arg0) {
		this.aClass280_4.method6680(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return this.aClass200_6;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(12) Class187 local12 = this.aClass280_4.method6679(false, false, arg2, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class113 local19 = arg2.method7262();
			local19.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			return Static57.aBoolean65 ? local12.method8641(arg0, arg1, local19, false, 0, Static469.anInt7885) : local12.method8642(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		return false;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8489(@OriginalArg(1) Class133 arg0) {
		this.aClass280_4.method6686(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
		@Pc(12) Class187 local12 = this.aClass280_4.method6679(true, true, arg0, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10231 >> 9;
		@Pc(24) int local24 = super.anInt10229 >> 9;
		@Pc(27) Class113 local27 = arg0.method7262();
		local27.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		this.aClass280_4.method6675(local24, arg0, local24, local27, local12, false, local19, local19);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	@Override
	public int method8488() {
		return this.aClass280_4.anInt7560;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	@Override
	public void method8492() {
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.aClass280_4.method6683();
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		@Pc(14) Class187 local14 = this.aClass280_4.method6679(false, true, arg0, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class113 local21 = arg0.method7262();
		local21.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		@Pc(35) Class4_Sub6 local35 = Static242.method4012(1, this.aBoolean453);
		@Pc(44) int local44 = super.anInt10231 >> 9;
		@Pc(49) int local49 = super.anInt10229 >> 9;
		this.aClass280_4.method6675(local49, arg0, local49, local21, local14, true, local44, local44);
		if (Static57.aBoolean65) {
			local14.method8654(local21, local35.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			local14.method8645(local21, local35.aClass4_Sub9Array1[0], 0);
		}
		if (this.aClass280_4.aClass4_Sub4_5 != null) {
			@Pc(91) Class235 local91 = this.aClass280_4.aClass4_Sub4_5.method1961();
			if (Static57.aBoolean65) {
				arg0.method7302(local91, Static469.anInt7885);
			} else {
				arg0.method7308(local91);
			}
		}
		this.aBoolean452 = local14.F() || this.aClass280_4.aClass4_Sub4_5 != null;
		if (this.aClass200_6 == null) {
			this.aClass200_6 = Static446.method6733(local14, super.anInt10228, super.anInt10229, super.anInt10231);
		} else {
			Static308.method6298(local14, super.anInt10229, this.aClass200_6, super.anInt10231, super.anInt10228);
		}
		return local35;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
