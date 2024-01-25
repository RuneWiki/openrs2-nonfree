import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class29_Sub1_Sub2 extends Class29_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!pfa", name = "D", descriptor = "Lclient!vg;")
	private Class330 aClass330_5;

	@OriginalMember(owner = "client!pfa", name = "y", descriptor = "Lclient!kd;")
	public final Class169 aClass169_3;

	@OriginalMember(owner = "client!pfa", name = "z", descriptor = "Z")
	private final boolean aBoolean485;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIIZIIIIII)V")
	public Class29_Sub1_Sub2(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static325.method5031(arg12, arg11));
		this.aClass169_3 = new Class169(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean485 = arg1.lb != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
		this.aClass169_3.method3583(arg0);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class22 local16 = this.aClass169_3.method3581(false, 131072, super.anInt7302, super.anInt7307, arg2, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(30) Class34 local30 = arg2.method7096();
			local30.GA(super.anInt7302 + super.anInt7304, super.anInt7311, super.anInt7307 + super.anInt7312);
			return local16.method4698(arg0, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
		@Pc(26) Class22 local26 = this.aClass169_3.method3581(true, 262144, super.anInt7302, super.anInt7307, arg0, false);
		if (local26 == null) {
			return;
		}
		@Pc(33) int local33 = super.anInt7302 >> 9;
		@Pc(38) int local38 = super.anInt7307 >> 9;
		@Pc(41) Class34 local41 = arg0.method7096();
		local41.GA(super.anInt7302, super.anInt7311, super.anInt7307);
		this.aClass169_3.method3582(arg0, local41, local33, local38, local26, local33, local38, false);
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return this.aClass169_3.anInt4168;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		@Pc(18) Class22 local18 = this.aClass169_3.method3581(true, 2048, super.anInt7302, super.anInt7307, arg0, false);
		if (local18 == null) {
			return null;
		}
		@Pc(31) Class34 local31 = arg0.method7096();
		local31.GA(super.anInt7304 + super.anInt7302, super.anInt7311, super.anInt7307 + super.anInt7312);
		@Pc(48) Class102_Sub2 local48 = null;
		if (this.aBoolean485) {
			local48 = Static228.method3369(1);
		}
		@Pc(60) int local60 = super.anInt7302 >> 9;
		@Pc(65) int local65 = super.anInt7307 >> 9;
		this.aClass169_3.method3582(arg0, local31, local60, local65, local18, local60, local65, true);
		if (this.aClass169_3.aClass102_Sub6_4 == null) {
			local18.method4689(local31, local48 == null ? null : local48.aClass102_Sub5Array1[0], 0);
		} else {
			@Pc(86) Class222 local86 = this.aClass169_3.aClass102_Sub6_4.method6847();
			arg0.method7118(local18, local86, local31, local48 == null ? null : local48.aClass102_Sub5Array1[0], 0);
		}
		if (this.aClass330_5 == null) {
			this.aClass330_5 = Static9.method170(local18, super.anInt7302, super.anInt7311, super.anInt7307);
		} else {
			Static113.method1763(super.anInt7311, super.anInt7302, local18, this.aClass330_5, super.anInt7307);
		}
		return local48;
	}

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "(I)I")
	@Override
	public int method6070() {
		return this.aClass169_3.method3580();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
		this.aClass169_3.method3579(arg0);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return this.aClass169_3.method3584();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return this.aClass169_3.anInt4169;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.aClass169_3.method3581(false, arg0, 0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return this.aClass169_3.anInt4161;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return this.aClass330_5;
	}
}
