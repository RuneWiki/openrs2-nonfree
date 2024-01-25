import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class31_Sub1_Sub3 extends Class31_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "[I")
	public static final int[] anIntArray300 = new int[256];

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "Lclient!gp;")
	public final Class92 aClass92_3;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "Z")
	private final boolean aBoolean206;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray300[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIIZII)V")
	public Class31_Sub1_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean220, arg1.aBoolean212);
		this.aClass92_3 = new Class92(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean206 = arg1.anInt3504 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return this.aClass92_3.anInt2672;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
		this.aClass92_3.method2321(arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
		@Pc(23) Class105 local23 = this.aClass92_3.method2319(super.anInt3389, super.anInt3390, 262144, true, arg0, true);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt3389 >> 7;
			@Pc(35) int local35 = super.anInt3390 >> 7;
			this.aClass92_3.method2313(arg0, local30, local35, local23, false, local30, local35);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return this.aClass92_3.method2319(0, 0, arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class105 local16 = this.aClass92_3.method2319(super.anInt3389, super.anInt3390, 131072, false, arg0, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(30) Class33 local30 = arg0.method4516();
			local30.j(super.anInt3389, super.anInt3388, super.anInt3390);
			return local16.method3526(arg2, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return this.aClass92_3.anInt2686;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return this.aClass92_3.method2310();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
		this.aClass92_3.method2315(arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return this.aClass92_3.anInt2679;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		@Pc(16) Class105 local16 = this.aClass92_3.method2319(super.anInt3389, super.anInt3390, 2048, true, arg0, false);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class33 local28 = arg0.method4516();
		local28.j(super.anInt3389, super.anInt3388, super.anInt3390);
		@Pc(38) Class4_Sub1 local38 = null;
		if (this.aBoolean206) {
			local38 = Static241.method3635(1);
		}
		if (this.aClass92_3.aClass4_Sub7_4 == null) {
			local16.method3534(local28, local38 == null ? null : local38.aClass4_Sub5Array1[0], 0);
		} else {
			@Pc(68) Class140 local68 = this.aClass92_3.aClass4_Sub7_4.method3777();
			arg0.method4526(local16, local68, local28, local38 == null ? null : local38.aClass4_Sub5Array1[0]);
		}
		@Pc(87) int local87 = super.anInt3389 >> 7;
		@Pc(92) int local92 = super.anInt3390 >> 7;
		this.aClass92_3.method2313(arg0, local87, local92, local16, true, local87, local92);
		return local38;
	}
}
