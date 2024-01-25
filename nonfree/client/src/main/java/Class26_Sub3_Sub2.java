import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class26_Sub3_Sub2 extends Class26_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "Lclient!ej;")
	public final Class66 aClass66_3;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "Z")
	private final boolean aBoolean287;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIIZIII)V")
	public Class26_Sub3_Sub2(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static257.method3427(arg9, arg8));
		this.aClass66_3 = new Class66(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt5727, super.anInt5726, arg7, arg10);
		this.aBoolean287 = arg1.anInt5106 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return this.aClass66_3.anInt1879;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
		this.aClass66_3.method1621(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class163 local16 = this.aClass66_3.method1629(super.anInt5726, 131072, false, arg1, false, super.anInt5727);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class33 local23 = arg1.method5285();
			local23.j(super.anInt5727, super.anInt5725, super.anInt5726);
			return local16.method4653(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
		this.aClass66_3.method1627(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		@Pc(21) Class163 local21 = this.aClass66_3.method1629(super.anInt5726, 2048, true, arg0, false, super.anInt5727);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class33 local28 = arg0.method5285();
		local28.j(super.anInt5727, super.anInt5725, super.anInt5726);
		@Pc(38) Class28_Sub4 local38 = null;
		if (this.aBoolean287) {
			local38 = Static329.method4328(1);
		}
		if (this.aClass66_3.aClass28_Sub3_2 == null) {
			local21.method4667(local28, local38 == null ? null : local38.aClass28_Sub6Array1[0], 0);
		} else {
			@Pc(56) Class201 local56 = this.aClass66_3.aClass28_Sub3_2.method3164();
			arg0.method5291(local21, local56, local28, local38 == null ? null : local38.aClass28_Sub6Array1[0]);
		}
		@Pc(89) int local89 = super.anInt5727 >> 7;
		@Pc(94) int local94 = super.anInt5726 >> 7;
		this.aClass66_3.method1626(arg0, local94, local94, local89, local21, true, local89);
		return local38;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return this.aClass66_3.method1620();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return this.aClass66_3.anInt1885;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return this.aClass66_3.method1629(0, arg0, false, arg1, false, 0);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aClass66_3.anInt1878;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
		@Pc(16) Class163 local16 = this.aClass66_3.method1629(super.anInt5726, 262144, true, arg0, true, super.anInt5727);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt5727 >> 7;
			@Pc(28) int local28 = super.anInt5726 >> 7;
			this.aClass66_3.method1626(arg0, local28, local28, local23, local16, false, local23);
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}
}
