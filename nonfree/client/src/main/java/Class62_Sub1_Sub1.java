import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class62_Sub1_Sub1 extends Class62_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "Lclient!ee;")
	public final Class49 aClass49_1;

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "Z")
	private final boolean aBoolean161;

	static {
		new Class93("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIIIIZIIIII)V")
	public Class62_Sub1_Sub1(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt3136 == 1, Static275.method5017(arg3, arg2));
		this.aClass49_1 = new Class49(arg0, arg1, arg2, arg3, super.aByte56, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean161 = arg1.anInt3115 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
	@Override
	public int method5583() {
		return this.aClass49_1.anInt1530;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!ae;)V")
	@Override
	public void method5584(@OriginalArg(1) Class4 arg0) {
		this.aClass49_1.method1584(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ae;I)V")
	@Override
	public void method5578(@OriginalArg(0) Class4 arg0) {
		this.aClass49_1.method1571(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
	@Override
	public int method5580() {
		return this.aClass49_1.anInt1541;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	@Override
	public Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		return this.aClass49_1.method1575(false, arg1, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5579() {
		return this.aClass49_1.method1586();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)I")
	@Override
	public int method5581() {
		return this.aClass49_1.anInt1517;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
		@Pc(23) Class7 local23 = this.aClass49_1.method1575(true, 131072, arg0, super.anInt5280, true, super.anInt5289);
		if (local23 != null) {
			this.aClass49_1.method1576(super.aShort83, super.aShort86, super.aShort85, false, arg0, local23, super.aShort84);
		}
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)I")
	@Override
	public int method4764() {
		return this.aClass49_1.method1577();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		@Pc(16) Class7 local16 = this.aClass49_1.method1575(false, 1024, arg0, super.anInt5280, true, super.anInt5289);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class133 local28 = arg0.method4244();
		local28.method4324(super.anInt5289, super.anInt5291, super.anInt5280);
		@Pc(38) Class55_Sub3 local38 = null;
		if (this.aBoolean161) {
			local38 = Static241.method4172(1);
		}
		if (this.aClass49_1.aClass55_Sub7_1 == null) {
			local16.method1441(local28, local38 == null ? null : local38.aClass55_Sub4Array1[0], 0);
		} else {
			@Pc(56) Class75 local56 = this.aClass49_1.aClass55_Sub7_1.method4034();
			arg0.method4245(local16, local56, local28, local38 == null ? null : local38.aClass55_Sub4Array1[0]);
		}
		this.aClass49_1.method1576(super.aShort83, super.aShort86, super.aShort85, true, arg0, local16, super.aShort84);
		return local38;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	@Override
	public void method5577() {
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class7 local24 = this.aClass49_1.method1575(false, 65536, arg1, super.anInt5280, false, super.anInt5289);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class133 local31 = arg1.method4244();
			local31.method4324(super.anInt5289, super.anInt5291, super.anInt5280);
			return local24.method1407(arg0, arg2, local31, false);
		}
	}
}
