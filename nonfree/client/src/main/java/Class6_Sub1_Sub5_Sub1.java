import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class6_Sub1_Sub5_Sub1 extends Class6_Sub1_Sub5 implements Interface24 {

	@OriginalMember(owner = "client!jfa", name = "bb", descriptor = "Lclient!sd;")
	private Class297 aClass297_2;

	@OriginalMember(owner = "client!jfa", name = "L", descriptor = "Z")
	private boolean aBoolean377 = false;

	@OriginalMember(owner = "client!jfa", name = "P", descriptor = "Lclient!rea;")
	public final Class283 aClass283_1;

	@OriginalMember(owner = "client!jfa", name = "Y", descriptor = "Z")
	private final boolean aBoolean378;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!r;Lclient!bda;IIIIIZIIIII)V")
	public Class6_Sub1_Sub5_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass283_1 = new Class283(arg0, arg1, arg10, arg11, super.aByte112, arg3, arg4, arg6, arg7, arg12);
		this.aBoolean378 = arg1.anInt807 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7339() {
		return this.aClass283_1.method6485();
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		return this.aClass297_2;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)I")
	@Override
	public int method7336() {
		return this.aClass283_1.anInt7907;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7334() {
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class66 local22 = this.aClass283_1.method6489(super.anInt8761, arg0, true, false, super.anInt8764, 2048);
		if (local22 == null) {
			return null;
		}
		@Pc(29) Class68 local29 = arg0.method6222();
		local29.NA(super.aShort58 + super.anInt8761, super.anInt8759, super.anInt8764 + super.aShort57);
		@Pc(46) Class6_Sub5 local46 = null;
		if (this.aBoolean378) {
			local46 = Static305.method4561(1);
		}
		@Pc(62) int local62 = super.anInt8761 >> 9;
		@Pc(67) int local67 = super.anInt8764 >> 9;
		this.aClass283_1.method6488(local22, local62, arg0, local67, true, local62, local67, local29);
		if (Static338.aBoolean493) {
			local22.method7556(local29, local46 == null ? null : local46.aClass6_Sub6Array1[0], Static401.anInt6991, 0);
		} else {
			local22.method7558(local29, local46 == null ? null : local46.aClass6_Sub6Array1[0], 0);
		}
		if (this.aClass283_1.aClass6_Sub8_8 != null) {
			@Pc(117) Class164 local117 = this.aClass283_1.aClass6_Sub8_8.method7161();
			if (Static338.aBoolean493) {
				arg0.method6257(local117, Static401.anInt6991);
			} else {
				arg0.method6193(local117);
			}
		}
		this.aBoolean377 = local22.LA() || this.aClass283_1.aClass6_Sub8_8 != null;
		if (this.aClass297_2 == null) {
			this.aClass297_2 = Static510.method7075(super.anInt8759, local22, super.anInt8764, super.anInt8761);
		} else {
			Static262.method4042(local22, super.anInt8761, this.aClass297_2, super.anInt8759, super.anInt8764);
		}
		return local46;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
		@Pc(20) Class66 local20 = this.aClass283_1.method6489(super.anInt8761, arg0, true, false, super.anInt8764, 262144);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt8761 >> 9;
		@Pc(32) int local32 = super.anInt8764 >> 9;
		@Pc(35) Class68 local35 = arg0.method6222();
		local35.NA(super.anInt8761, super.anInt8759, super.anInt8764);
		this.aClass283_1.method6488(local20, local27, arg0, local32, false, local27, local32, local35);
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			this.aClass297_2 = null;
		}
		return this.aClass283_1.method6487(arg0 + 50606);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)I")
	@Override
	public int method7337() {
		return this.aClass283_1.anInt7908;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(22) Class66 local22 = this.aClass283_1.method6489(super.anInt8761, arg2, false, false, super.anInt8764, 131072);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class68 local29 = arg2.method6222();
			local29.NA(super.aShort58 + super.anInt8761, super.anInt8759, super.anInt8764 + super.aShort57);
			return Static338.aBoolean493 ? local22.method7547(arg0, arg1, local29, false, Static401.anInt6991) : local22.method7541(arg0, arg1, local29, false);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return false;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7335(@OriginalArg(1) Class100 arg0) {
		this.aClass283_1.method6479(arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aBoolean377;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(BLclient!r;)V")
	@Override
	public void method7338(@OriginalArg(1) Class100 arg0) {
		this.aClass283_1.method6482(arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)I")
	@Override
	public int method7340() {
		return this.aClass283_1.anInt7918;
	}

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.aClass283_1.method6490();
	}
}
