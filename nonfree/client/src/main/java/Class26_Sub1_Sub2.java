import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class26_Sub1_Sub2 extends Class26_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "Lclient!ej;")
	public final Class66 aClass66_1;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIIZIIIIII)V")
	public Class26_Sub1_Sub2(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static180.method2622(arg12, arg11));
		this.aClass66_1 = new Class66(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean97 = arg1.anInt5106 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aClass66_1.anInt1878;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
		@Pc(24) Class163 local24 = this.aClass66_1.method1629(super.anInt7181, 262144, true, arg0, false, super.anInt7180);
		if (local24 != null) {
			@Pc(31) int local31 = super.anInt7180 >> 7;
			@Pc(36) int local36 = super.anInt7181 >> 7;
			this.aClass66_1.method1626(arg0, local36, local36, local31, local24, false, local31);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
		this.aClass66_1.method1627(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I")
	@Override
	public int method5551() {
		return this.aClass66_1.method1625();
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		@Pc(16) Class163 local16 = this.aClass66_1.method1629(super.anInt7181, 2048, true, arg0, false, super.anInt7180);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class33 local23 = arg0.method5285();
		local23.j(super.anInt7183 + super.anInt7180, super.anInt7176, super.anInt7186 + super.anInt7181);
		@Pc(39) Class28_Sub4 local39 = null;
		if (this.aBoolean97) {
			local39 = Static329.method4328(1);
		}
		if (this.aClass66_1.aClass28_Sub3_2 == null) {
			local16.method4667(local23, local39 == null ? null : local39.aClass28_Sub6Array1[0], 0);
		} else {
			@Pc(69) Class201 local69 = this.aClass66_1.aClass28_Sub3_2.method3164();
			arg0.method5291(local16, local69, local23, local39 == null ? null : local39.aClass28_Sub6Array1[0]);
		}
		@Pc(88) int local88 = super.anInt7180 >> 7;
		@Pc(93) int local93 = super.anInt7181 >> 7;
		this.aClass66_1.method1626(arg0, local93, local93, local88, local16, true, local88);
		return local39;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return this.aClass66_1.anInt1879;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
		this.aClass66_1.method1621(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return this.aClass66_1.anInt1885;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return this.aClass66_1.method1620();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return this.aClass66_1.method1629(0, arg0, false, arg1, false, 0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class163 local22 = this.aClass66_1.method1629(super.anInt7181, 131072, false, arg1, false, super.anInt7180);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class33 local29 = arg1.method5285();
			local29.j(super.anInt7183 + super.anInt7180, super.anInt7176, super.anInt7181 + super.anInt7186);
			return local22.method4653(arg0, arg2, local29, false);
		}
	}
}
