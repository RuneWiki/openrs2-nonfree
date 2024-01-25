import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class6_Sub1_Sub2_Sub1 extends Class6_Sub1_Sub2 implements Interface24 {

	@OriginalMember(owner = "client!qaa", name = "M", descriptor = "Lclient!sd;")
	private Class297 aClass297_6;

	@OriginalMember(owner = "client!qaa", name = "hb", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "client!qaa", name = "H", descriptor = "Lclient!rea;")
	public final Class283 aClass283_3;

	@OriginalMember(owner = "client!qaa", name = "eb", descriptor = "Z")
	private final boolean aBoolean561;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!r;Lclient!bda;IIIIIZII)V")
	public Class6_Sub1_Sub2_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt776);
		this.aClass283_3 = new Class283(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean561 = arg1.anInt807 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		return this.aClass297_6;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7335(@OriginalArg(1) Class100 arg0) {
		this.aClass283_3.method6479(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7334() {
	}

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return false;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7339() {
		return this.aClass283_3.method6485();
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
		@Pc(16) Class66 local16 = this.aClass283_3.method6489(super.anInt8761, arg0, true, true, super.anInt8764, 262144);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8761 >> 9;
		@Pc(28) int local28 = super.anInt8764 >> 9;
		@Pc(31) Class68 local31 = arg0.method6222();
		local31.NA(super.anInt8761, super.anInt8759, super.anInt8764);
		this.aClass283_3.method6488(local16, local23, arg0, local28, false, local23, local28, local31);
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)I")
	@Override
	public int method7337() {
		return this.aClass283_3.anInt7908;
	}

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.aClass283_3.method6490();
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(B)I")
	@Override
	public int method7340() {
		return this.aClass283_3.anInt7918;
	}

	@OriginalMember(owner = "client!qaa", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return false;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			this.method7326(null);
		}
		return this.aClass283_3.method6487(28110);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(23) Class66 local23 = this.aClass283_3.method6489(super.anInt8761, arg2, false, false, super.anInt8764, 131072);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class68 local30 = arg2.method6222();
			local30.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			return Static338.aBoolean493 ? local23.method7547(arg0, arg1, local30, false, Static401.anInt6991) : local23.method7541(arg0, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)I")
	@Override
	public int method7336() {
		return this.aClass283_3.anInt7907;
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(BLclient!r;)V")
	@Override
	public void method7338(@OriginalArg(1) Class100 arg0) {
		this.aClass283_3.method6482(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class66 local22 = this.aClass283_3.method6489(super.anInt8761, arg0, true, false, super.anInt8764, 2048);
		if (local22 == null) {
			return null;
		}
		@Pc(29) Class68 local29 = arg0.method6222();
		local29.NA(super.anInt8761, super.anInt8759, super.anInt8764);
		@Pc(39) Class6_Sub5 local39 = null;
		if (this.aBoolean561) {
			local39 = Static305.method4561(1);
		}
		@Pc(51) int local51 = super.anInt8761 >> 9;
		@Pc(56) int local56 = super.anInt8764 >> 9;
		this.aClass283_3.method6488(local22, local51, arg0, local56, true, local51, local56, local29);
		if (Static338.aBoolean493) {
			local22.method7556(local29, local39 == null ? null : local39.aClass6_Sub6Array1[0], Static401.anInt6991, 0);
		} else {
			local22.method7558(local29, local39 == null ? null : local39.aClass6_Sub6Array1[0], 0);
		}
		if (this.aClass283_3.aClass6_Sub8_8 != null) {
			@Pc(106) Class164 local106 = this.aClass283_3.aClass6_Sub8_8.method7161();
			if (Static338.aBoolean493) {
				arg0.method6257(local106, Static401.anInt6991);
			} else {
				arg0.method6193(local106);
			}
		}
		this.aBoolean562 = local22.LA() || this.aClass283_3.aClass6_Sub8_8 != null;
		if (this.aClass297_6 == null) {
			this.aClass297_6 = Static510.method7075(super.anInt8759, local22, super.anInt8764, super.anInt8761);
		} else {
			Static262.method4042(local22, super.anInt8761, this.aClass297_6, super.anInt8759, super.anInt8764);
		}
		return local39;
	}

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aBoolean562;
	}
}
