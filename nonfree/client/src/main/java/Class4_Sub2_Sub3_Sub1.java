import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class4_Sub2_Sub3_Sub1 extends Class4_Sub2_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "Lclient!kn;")
	private Class200 aClass200_5;

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "Z")
	private boolean aBoolean438 = false;

	@OriginalMember(owner = "client!nb", name = "fb", descriptor = "Lclient!pw;")
	public final Class280 aClass280_3;

	@OriginalMember(owner = "client!nb", name = "kb", descriptor = "Z")
	private final boolean aBoolean439;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIIIZIIIII)V")
	public Class4_Sub2_Sub3_Sub1(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass280_3 = new Class280(arg0, arg1, arg10, arg11, super.aByte132, arg3, this, arg7, arg12);
		this.aBoolean439 = arg1.anInt4779 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.aClass280_3.method6683();
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aBoolean438;
	}

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.aClass280_3.method6678(true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8489(@OriginalArg(1) Class133 arg0) {
		this.aClass280_3.method6686(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
	@Override
	public int method8488() {
		return this.aClass280_3.anInt7560;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8491() {
		return this.aClass280_3.method6677();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
		@Pc(12) Class187 local12 = this.aClass280_3.method6679(false, true, arg0, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10231 >> 9;
		@Pc(24) int local24 = super.anInt10229 >> 9;
		@Pc(27) Class113 local27 = arg0.method7262();
		local27.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		this.aClass280_3.method6675(local24, arg0, local24, local27, local12, false, local19, local19);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	@Override
	public void method8492() {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(20) Class187 local20 = this.aClass280_3.method6679(false, false, arg2, 131072);
		if (local20 == null) {
			return false;
		} else {
			@Pc(27) Class113 local27 = arg2.method7262();
			local27.method8458(super.aShort113 + super.anInt10231, super.anInt10228, super.anInt10229 + super.aShort114);
			return Static57.aBoolean65 ? local20.method8641(arg0, arg1, local27, false, 0, Static469.anInt7885) : local20.method8642(arg0, arg1, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)I")
	@Override
	public int method8493() {
		return this.aClass280_3.anInt7559;
	}

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)I")
	@Override
	public int method8490() {
		return this.aClass280_3.anInt7546;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return this.aClass200_5;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		@Pc(19) Class187 local19 = this.aClass280_3.method6679(false, true, arg0, 2048);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class113 local26 = arg0.method7262();
		local26.method8458(super.anInt10231 + super.aShort113, super.anInt10228, super.anInt10229 + super.aShort114);
		@Pc(46) Class4_Sub6 local46 = Static242.method4012(1, this.aBoolean439);
		@Pc(51) int local51 = super.anInt10231 >> 9;
		@Pc(56) int local56 = super.anInt10229 >> 9;
		this.aClass280_3.method6675(local56, arg0, local56, local26, local19, true, local51, local51);
		if (Static57.aBoolean65) {
			local19.method8654(local26, local46.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			local19.method8645(local26, local46.aClass4_Sub9Array1[0], 0);
		}
		if (this.aClass280_3.aClass4_Sub4_5 != null) {
			@Pc(100) Class235 local100 = this.aClass280_3.aClass4_Sub4_5.method1961();
			if (Static57.aBoolean65) {
				arg0.method7302(local100, Static469.anInt7885);
			} else {
				arg0.method7308(local100);
			}
		}
		this.aBoolean438 = local19.F() || this.aClass280_3.aClass4_Sub4_5 != null;
		if (this.aClass200_5 == null) {
			this.aClass200_5 = Static446.method6733(local19, super.anInt10228, super.anInt10229, super.anInt10231);
		} else {
			Static308.method6298(local19, super.anInt10229, this.aClass200_5, super.anInt10231, super.anInt10228);
		}
		return local46;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8494(@OriginalArg(0) Class133 arg0) {
		this.aClass280_3.method6680(arg0);
	}
}
