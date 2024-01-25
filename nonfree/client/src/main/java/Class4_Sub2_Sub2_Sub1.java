import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class4_Sub2_Sub2_Sub1 extends Class4_Sub2_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!dca", name = "X", descriptor = "Lclient!kn;")
	private Class200 aClass200_1;

	@OriginalMember(owner = "client!dca", name = "S", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!dca", name = "hb", descriptor = "Lclient!pw;")
	public final Class280 aClass280_1;

	@OriginalMember(owner = "client!dca", name = "Z", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIIIZII)V")
	public Class4_Sub2_Sub2_Sub1(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4761);
		this.aClass280_1 = new Class280(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean131 = arg1.anInt4779 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
		@Pc(12) Class187 local12 = this.aClass280_1.method6679(true, true, arg0, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10231 >> 9;
		@Pc(24) int local24 = super.anInt10229 >> 9;
		@Pc(27) Class113 local27 = arg0.method7262();
		local27.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		this.aClass280_1.method6675(local24, arg0, local24, local27, local12, false, local19, local19);
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)V")
	@Override
	public void method8492() {
	}

	@OriginalMember(owner = "client!dca", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.aClass280_1.method6683();
	}

	@OriginalMember(owner = "client!dca", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.aClass280_1.method6678(true);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)I")
	@Override
	public int method8488() {
		return this.aClass280_1.anInt7560;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8494(@OriginalArg(0) Class133 arg0) {
		this.aClass280_1.method6680(arg0);
	}

	@OriginalMember(owner = "client!dca", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aBoolean130;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8491() {
		return this.aClass280_1.method6677();
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(20) Class187 local20 = this.aClass280_1.method6679(false, false, arg2, 131072);
		if (local20 == null) {
			return false;
		} else {
			@Pc(27) Class113 local27 = arg2.method7262();
			local27.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			return Static57.aBoolean65 ? local20.method8641(arg0, arg1, local27, false, 0, Static469.anInt7885) : local20.method8642(arg0, arg1, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!dca", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		return false;
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		@Pc(14) Class187 local14 = this.aClass280_1.method6679(false, true, arg0, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class113 local21 = arg0.method7262();
		local21.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		@Pc(35) Class4_Sub6 local35 = Static242.method4012(1, this.aBoolean131);
		@Pc(40) int local40 = super.anInt10231 >> 9;
		@Pc(45) int local45 = super.anInt10229 >> 9;
		this.aClass280_1.method6675(local45, arg0, local45, local21, local14, true, local40, local40);
		if (Static57.aBoolean65) {
			local14.method8654(local21, local35.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			local14.method8645(local21, local35.aClass4_Sub9Array1[0], 0);
		}
		if (this.aClass280_1.aClass4_Sub4_5 != null) {
			@Pc(96) Class235 local96 = this.aClass280_1.aClass4_Sub4_5.method1961();
			if (Static57.aBoolean65) {
				arg0.method7302(local96, Static469.anInt7885);
			} else {
				arg0.method7308(local96);
			}
		}
		this.aBoolean130 = local14.F() || this.aClass280_1.aClass4_Sub4_5 != null;
		if (this.aClass200_1 == null) {
			this.aClass200_1 = Static446.method6733(local14, super.anInt10228, super.anInt10229, super.anInt10231);
		} else {
			Static308.method6298(local14, super.anInt10229, this.aClass200_1, super.anInt10231, super.anInt10228);
		}
		return local35;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return this.aClass200_1;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8489(@OriginalArg(1) Class133 arg0) {
		this.aClass280_1.method6686(arg0);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)I")
	@Override
	public int method8493() {
		return this.aClass280_1.anInt7559;
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I")
	@Override
	public int method8490() {
		return this.aClass280_1.anInt7546;
	}
}
