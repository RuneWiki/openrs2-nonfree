import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class26_Sub4_Sub3 extends Class26_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!wl", name = "M", descriptor = "Lclient!ej;")
	public final Class66 aClass66_4;

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "Z")
	private final boolean aBoolean502;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIIZII)V")
	public Class26_Sub4_Sub3(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt5107, arg1.aBoolean318, arg1.aBoolean324);
		this.aClass66_4 = new Class66(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean502 = arg1.anInt5106 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class163 local16 = this.aClass66_4.method1629(super.anInt7415, 131072, false, arg1, false, super.anInt7423);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class33 local28 = arg1.method5285();
			local28.j(super.anInt7423, super.anInt7422, super.anInt7415);
			return local16.method4653(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return this.aClass66_4.anInt1885;
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aClass66_4.anInt1878;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return this.aClass66_4.anInt1879;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return this.aClass66_4.method1620();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
		this.aClass66_4.method1627(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return this.aClass66_4.method1629(0, arg0, false, arg1, false, 0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
		this.aClass66_4.method1621(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		@Pc(16) Class163 local16 = this.aClass66_4.method1629(super.anInt7415, 2048, true, arg0, false, super.anInt7423);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class33 local23 = arg0.method5285();
		local23.j(super.anInt7423, super.anInt7422, super.anInt7415);
		@Pc(33) Class28_Sub4 local33 = null;
		if (this.aBoolean502) {
			local33 = Static329.method4328(1);
		}
		if (this.aClass66_4.aClass28_Sub3_2 == null) {
			local16.method4667(local23, local33 == null ? null : local33.aClass28_Sub6Array1[0], 0);
		} else {
			@Pc(68) Class201 local68 = this.aClass66_4.aClass28_Sub3_2.method3164();
			arg0.method5291(local16, local68, local23, local33 == null ? null : local33.aClass28_Sub6Array1[0]);
		}
		@Pc(87) int local87 = super.anInt7423 >> 7;
		@Pc(92) int local92 = super.anInt7415 >> 7;
		this.aClass66_4.method1626(arg0, local92, local92, local87, local16, true, local87);
		return local33;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
		@Pc(16) Class163 local16 = this.aClass66_4.method1629(super.anInt7415, 262144, true, arg0, true, super.anInt7423);
		if (local16 != null) {
			@Pc(27) int local27 = super.anInt7423 >> 7;
			@Pc(32) int local32 = super.anInt7415 >> 7;
			this.aClass66_4.method1626(arg0, local32, local32, local27, local16, false, local27);
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
	}
}
