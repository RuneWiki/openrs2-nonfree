import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class29_Sub3_Sub2 extends Class29_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!et", name = "u", descriptor = "Lclient!vg;")
	private Class330 aClass330_2;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "Lclient!kd;")
	public final Class169 aClass169_1;

	@OriginalMember(owner = "client!et", name = "z", descriptor = "Z")
	private final boolean aBoolean144;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIIZII)V")
	public Class29_Sub3_Sub2(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt8495, arg1.aBoolean587, arg1.aBoolean595);
		this.aClass169_1 = new Class169(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean144 = arg1.lb != 0 && !arg7;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return this.aClass169_1.method3584();
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
		@Pc(16) Class22 local16 = this.aClass169_1.method3581(true, 262144, super.anInt3348, super.anInt3347, arg0, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt3348 >> 9;
		@Pc(28) int local28 = super.anInt3347 >> 9;
		@Pc(31) Class34 local31 = arg0.method7096();
		local31.GA(super.anInt3348, super.anInt3346, super.anInt3347);
		this.aClass169_1.method3582(arg0, local31, local23, local28, local16, local23, local28, false);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.aClass169_1.method3581(false, arg0, 0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return this.aClass169_1.anInt4169;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return this.aClass169_1.anInt4161;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
		this.aClass169_1.method3583(arg0);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return this.aClass169_1.anInt4168;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
		this.aClass169_1.method3579(arg0);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return this.aClass330_2;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		@Pc(18) Class22 local18 = this.aClass169_1.method3581(true, 2048, super.anInt3348, super.anInt3347, arg0, false);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class34 local30 = arg0.method7096();
		local30.GA(super.anInt3348, super.anInt3346, super.anInt3347);
		@Pc(40) Class102_Sub2 local40 = null;
		if (this.aBoolean144) {
			local40 = Static228.method3369(1);
		}
		@Pc(52) int local52 = super.anInt3348 >> 9;
		@Pc(57) int local57 = super.anInt3347 >> 9;
		this.aClass169_1.method3582(arg0, local30, local52, local57, local18, local52, local57, true);
		if (this.aClass169_1.aClass102_Sub6_4 == null) {
			local18.method4689(local30, local40 == null ? null : local40.aClass102_Sub5Array1[0], 0);
		} else {
			@Pc(78) Class222 local78 = this.aClass169_1.aClass102_Sub6_4.method6847();
			arg0.method7118(local18, local78, local30, local40 == null ? null : local40.aClass102_Sub5Array1[0], 0);
		}
		if (this.aClass330_2 == null) {
			this.aClass330_2 = Static9.method170(local18, super.anInt3348, super.anInt3346, super.anInt3347);
		} else {
			Static113.method1763(super.anInt3346, super.anInt3348, local18, this.aClass330_2, super.anInt3347);
		}
		return local40;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class22 local16 = this.aClass169_1.method3581(false, 131072, super.anInt3348, super.anInt3347, arg2, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class34 local23 = arg2.method7096();
			local23.GA(super.anInt3348, super.anInt3346, super.anInt3347);
			return local16.method4698(arg0, arg1, local23, false);
		}
	}
}
