import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class29_Sub5_Sub1 extends Class29_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!ou", name = "A", descriptor = "Lclient!vg;")
	private Class330 aClass330_4;

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "Lclient!kd;")
	public final Class169 aClass169_2;

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "Z")
	private final boolean aBoolean442;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIIZIII)V")
	public Class29_Sub5_Sub1(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static493.method6802(arg8, arg9));
		this.aClass169_2 = new Class169(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt7423, super.anInt7421, arg7, arg10);
		this.aBoolean442 = arg1.lb != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
		@Pc(24) Class22 local24 = this.aClass169_2.method3581(true, 262144, super.anInt7423, super.anInt7421, arg0, true);
		if (local24 == null) {
			return;
		}
		@Pc(31) int local31 = super.anInt7423 >> 9;
		@Pc(36) int local36 = super.anInt7421 >> 9;
		@Pc(39) Class34 local39 = arg0.method7096();
		local39.GA(super.anInt7423, super.anInt7422, super.anInt7421);
		this.aClass169_2.method3582(arg0, local39, local31, local36, local24, local31, local36, false);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return this.aClass169_2.anInt4168;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		@Pc(18) Class22 local18 = this.aClass169_2.method3581(true, 2048, super.anInt7423, super.anInt7421, arg0, false);
		if (local18 == null) {
			return null;
		}
		@Pc(37) Class34 local37 = arg0.method7096();
		local37.GA(super.anInt7423, super.anInt7422, super.anInt7421);
		@Pc(47) Class102_Sub2 local47 = null;
		if (this.aBoolean442) {
			local47 = Static228.method3369(1);
		}
		@Pc(59) int local59 = super.anInt7423 >> 9;
		@Pc(64) int local64 = super.anInt7421 >> 9;
		this.aClass169_2.method3582(arg0, local37, local59, local64, local18, local59, local64, true);
		if (this.aClass169_2.aClass102_Sub6_4 == null) {
			local18.method4689(local37, local47 == null ? null : local47.aClass102_Sub5Array1[0], 0);
		} else {
			@Pc(99) Class222 local99 = this.aClass169_2.aClass102_Sub6_4.method6847();
			arg0.method7118(local18, local99, local37, local47 == null ? null : local47.aClass102_Sub5Array1[0], 0);
		}
		if (this.aClass330_4 == null) {
			this.aClass330_4 = Static9.method170(local18, super.anInt7423, super.anInt7422, super.anInt7421);
		} else {
			Static113.method1763(super.anInt7422, super.anInt7423, local18, this.aClass330_4, super.anInt7421);
		}
		return local47;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return this.aClass169_2.anInt4161;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class22 local16 = this.aClass169_2.method3581(false, 131072, super.anInt7423, super.anInt7421, arg2, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class34 local23 = arg2.method7096();
			local23.GA(super.anInt7423, super.anInt7422, super.anInt7421);
			return local16.method4698(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return this.aClass330_4;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
		this.aClass169_2.method3583(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return this.aClass169_2.method3584();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
		this.aClass169_2.method3579(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return this.aClass169_2.anInt4169;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.aClass169_2.method3581(false, arg0, 0, 0, arg1, false);
	}
}
