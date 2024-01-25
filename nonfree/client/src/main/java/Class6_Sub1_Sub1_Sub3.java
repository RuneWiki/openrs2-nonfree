import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class6_Sub1_Sub1_Sub3 extends Class6_Sub1_Sub1 implements Interface24 {

	@OriginalMember(owner = "client!lq", name = "M", descriptor = "Lclient!sd;")
	private Class297 aClass297_4;

	@OriginalMember(owner = "client!lq", name = "jb", descriptor = "Z")
	private boolean aBoolean476 = false;

	@OriginalMember(owner = "client!lq", name = "X", descriptor = "Lclient!rea;")
	public final Class283 aClass283_2;

	@OriginalMember(owner = "client!lq", name = "Z", descriptor = "Z")
	private final boolean aBoolean474;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!r;Lclient!bda;IIIIIZIIIIIII)V")
	public Class6_Sub1_Sub1_Sub3(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt775 == 1, Static320.method4951(arg13, arg12));
		this.aClass283_2 = new Class283(arg0, arg1, arg12, arg13, super.aByte112, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean474 = arg1.anInt807 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7339() {
		return this.aClass283_2.method6485();
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)I")
	@Override
	public int method7337() {
		return this.aClass283_2.anInt7908;
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class66 local22 = this.aClass283_2.method6489(super.anInt8761, arg0, true, true, super.anInt8764, 262144);
		if (local22 != null) {
			@Pc(27) Class68 local27 = arg0.method6222();
			local27.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			this.aClass283_2.method6488(local22, super.aShort85, arg0, super.aShort84, false, super.aShort86, super.aShort83, local27);
		}
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7335(@OriginalArg(1) Class100 arg0) {
		this.aClass283_2.method6479(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.aClass283_2.method6490();
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		return arg0 == -22496 ? this.aClass283_2.method6487(28110) : 115;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		@Pc(18) Class66 local18 = this.aClass283_2.method6489(super.anInt8761, arg0, true, false, super.anInt8764, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class68 local25 = arg0.method6222();
		local25.NA(super.anInt8761, super.anInt8759, super.anInt8764);
		@Pc(35) Class6_Sub5 local35 = null;
		if (this.aBoolean474) {
			local35 = Static305.method4561(1);
		}
		this.aClass283_2.method6488(local18, super.aShort85, arg0, super.aShort84, true, super.aShort86, super.aShort83, local25);
		if (Static338.aBoolean493) {
			local18.method7556(local25, local35 == null ? null : local35.aClass6_Sub6Array1[0], Static401.anInt6991, 0);
		} else {
			local18.method7558(local25, local35 == null ? null : local35.aClass6_Sub6Array1[0], 0);
		}
		if (this.aClass283_2.aClass6_Sub8_8 != null) {
			@Pc(96) Class164 local96 = this.aClass283_2.aClass6_Sub8_8.method7161();
			if (Static338.aBoolean493) {
				arg0.method6257(local96, Static401.anInt6991);
			} else {
				arg0.method6193(local96);
			}
		}
		this.aBoolean476 = local18.LA() || this.aClass283_2.aClass6_Sub8_8 != null;
		if (this.aClass297_4 == null) {
			this.aClass297_4 = Static510.method7075(super.anInt8759, local18, super.anInt8764, super.anInt8761);
		} else {
			Static262.method4042(local18, super.anInt8761, this.aClass297_4, super.anInt8759, super.anInt8764);
		}
		return local35;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I")
	@Override
	public int method7336() {
		return this.aClass283_2.anInt7907;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(16) Class66 local16 = this.aClass283_2.method6489(super.anInt8761, arg2, false, false, super.anInt8764, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class68 local23 = arg2.method6222();
			local23.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			return Static338.aBoolean493 ? local16.method7547(arg0, arg1, local23, false, Static401.anInt6991) : local16.method7541(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)I")
	@Override
	public int method7340() {
		return this.aClass283_2.anInt7918;
	}

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(BLclient!r;)V")
	@Override
	public void method7338(@OriginalArg(1) Class100 arg0) {
		this.aClass283_2.method6482(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7334() {
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		return this.aClass297_4;
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aBoolean476;
	}
}
