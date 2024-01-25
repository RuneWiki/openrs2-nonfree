import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class31_Sub2_Sub4 extends Class31_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!on", name = "R", descriptor = "Lclient!gp;")
	public final Class92 aClass92_4;

	@OriginalMember(owner = "client!on", name = "K", descriptor = "Z")
	private final boolean aBoolean347;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIIZIIIIIII)V")
	public Class31_Sub2_Sub4(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3524 == 1, Static233.method1228(arg12, arg13));
		this.aClass92_4 = new Class92(arg0, arg1, arg12, arg13, super.aByte100, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean347 = arg1.anInt3504 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return this.aClass92_4.method2310();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aClass92_4.anInt2679;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return this.aClass92_4.anInt2672;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
		this.aClass92_4.method2315(arg0);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
		this.aClass92_4.method2321(arg0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class105 local23 = this.aClass92_4.method2319(super.anInt7300, super.anInt7298, 131072, false, arg0, false);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class33 local30 = arg0.method4516();
			local30.j(super.anInt7300, super.anInt7296, super.anInt7298);
			return local23.method3526(arg2, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)I")
	@Override
	public int method5976() {
		return this.aClass92_4.method2312();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		@Pc(28) Class105 local28 = this.aClass92_4.method2319(super.anInt7300, super.anInt7298, 2048, true, arg0, false);
		if (local28 == null) {
			return null;
		}
		@Pc(35) Class33 local35 = arg0.method4516();
		local35.j(super.anInt7300, super.anInt7296, super.anInt7298);
		@Pc(45) Class4_Sub1 local45 = null;
		if (this.aBoolean347) {
			local45 = Static241.method3635(1);
		}
		if (this.aClass92_4.aClass4_Sub7_4 == null) {
			local28.method3534(local35, local45 == null ? null : local45.aClass4_Sub5Array1[0], 0);
		} else {
			@Pc(75) Class140 local75 = this.aClass92_4.aClass4_Sub7_4.method3777();
			arg0.method4526(local28, local75, local35, local45 == null ? null : local45.aClass4_Sub5Array1[0]);
		}
		this.aClass92_4.method2313(arg0, super.aShort100, super.aShort101, local28, true, super.aShort103, super.aShort102);
		return local45;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
		@Pc(16) Class105 local16 = this.aClass92_4.method2319(super.anInt7300, super.anInt7298, 262144, true, arg0, true);
		if (local16 != null) {
			this.aClass92_4.method2313(arg0, super.aShort100, super.aShort101, local16, false, super.aShort103, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return this.aClass92_4.anInt2686;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return this.aClass92_4.method2319(0, 0, arg1, false, arg0, false);
	}
}
