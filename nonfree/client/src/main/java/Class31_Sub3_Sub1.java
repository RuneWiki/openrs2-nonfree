import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class31_Sub3_Sub1 extends Class31_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "Lclient!gp;")
	public final Class92 aClass92_1;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Z")
	private final boolean aBoolean118;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIIZIII)V")
	public Class31_Sub3_Sub1(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static372.method5078(arg9, arg8));
		this.aClass92_1 = new Class92(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt2832, super.anInt2833, arg7, arg10);
		this.aBoolean118 = arg1.anInt3504 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		@Pc(16) Class105 local16 = this.aClass92_1.method2319(super.anInt2832, super.anInt2833, 2048, true, arg0, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class33 local23 = arg0.method4516();
		local23.j(super.anInt2832, super.anInt2835, super.anInt2833);
		@Pc(38) Class4_Sub1 local38 = null;
		if (this.aBoolean118) {
			local38 = Static241.method3635(1);
		}
		if (this.aClass92_1.aClass4_Sub7_4 == null) {
			local16.method3534(local23, local38 == null ? null : local38.aClass4_Sub5Array1[0], 0);
		} else {
			@Pc(54) Class140 local54 = this.aClass92_1.aClass4_Sub7_4.method3777();
			arg0.method4526(local16, local54, local23, local38 == null ? null : local38.aClass4_Sub5Array1[0]);
		}
		@Pc(87) int local87 = super.anInt2832 >> 7;
		@Pc(92) int local92 = super.anInt2833 >> 7;
		this.aClass92_1.method2313(arg0, local87, local92, local16, true, local87, local92);
		return local38;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return this.aClass92_1.method2310();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return this.aClass92_1.method2319(0, 0, arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
		@Pc(25) Class105 local25 = this.aClass92_1.method2319(super.anInt2832, super.anInt2833, 262144, true, arg0, true);
		if (local25 != null) {
			@Pc(32) int local32 = super.anInt2832 >> 7;
			@Pc(37) int local37 = super.anInt2833 >> 7;
			this.aClass92_1.method2313(arg0, local32, local37, local25, false, local32, local37);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class105 local21 = this.aClass92_1.method2319(super.anInt2832, super.anInt2833, 131072, false, arg0, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class33 local28 = arg0.method4516();
			local28.j(super.anInt2832, super.anInt2835, super.anInt2833);
			return local21.method3526(arg2, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
		this.aClass92_1.method2315(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aClass92_1.anInt2679;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
		this.aClass92_1.method2321(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return this.aClass92_1.anInt2672;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return this.aClass92_1.anInt2686;
	}
}
