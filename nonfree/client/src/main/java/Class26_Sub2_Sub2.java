import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class26_Sub2_Sub2 extends Class26_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!fw", name = "Y", descriptor = "Lclient!ej;")
	public final Class66 aClass66_2;

	@OriginalMember(owner = "client!fw", name = "G", descriptor = "Z")
	private final boolean aBoolean139;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIIZIIIIIII)V")
	public Class26_Sub2_Sub2(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5054 == 1, Static86.method1475(arg13, arg12));
		this.aClass66_2 = new Class66(arg0, arg1, arg12, arg13, super.aByte102, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean139 = arg1.anInt5106 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
		this.aClass66_2.method1627(arg0);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
		this.aClass66_2.method1621(arg0);
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aClass66_2.anInt1878;
	}

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)I")
	@Override
	public int method5695() {
		return this.aClass66_2.method1625();
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
		@Pc(22) Class163 local22 = this.aClass66_2.method1629(super.anInt7383, 262144, true, arg0, true, super.anInt7388);
		if (local22 != null) {
			this.aClass66_2.method1626(arg0, super.aShort102, super.aShort103, super.aShort104, local22, false, super.aShort105);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return this.aClass66_2.method1620();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return this.aClass66_2.method1629(0, arg0, false, arg1, false, 0);
	}

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return this.aClass66_2.anInt1879;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class163 local16 = this.aClass66_2.method1629(super.anInt7383, 131072, false, arg1, false, super.anInt7388);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class33 local23 = arg1.method5285();
			local23.j(super.anInt7388, super.anInt7390, super.anInt7383);
			return local16.method4653(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		@Pc(16) Class163 local16 = this.aClass66_2.method1629(super.anInt7383, 2048, true, arg0, false, super.anInt7388);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class33 local23 = arg0.method5285();
		local23.j(super.anInt7388, super.anInt7390, super.anInt7383);
		@Pc(33) Class28_Sub4 local33 = null;
		if (this.aBoolean139) {
			local33 = Static329.method4328(1);
		}
		if (this.aClass66_2.aClass28_Sub3_2 == null) {
			local16.method4667(local23, local33 == null ? null : local33.aClass28_Sub6Array1[0], 0);
		} else {
			@Pc(57) Class201 local57 = this.aClass66_2.aClass28_Sub3_2.method3164();
			arg0.method5291(local16, local57, local23, local33 == null ? null : local33.aClass28_Sub6Array1[0]);
		}
		this.aClass66_2.method1626(arg0, super.aShort102, super.aShort103, super.aShort104, local16, true, super.aShort105);
		return local33;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return this.aClass66_2.anInt1885;
	}
}
