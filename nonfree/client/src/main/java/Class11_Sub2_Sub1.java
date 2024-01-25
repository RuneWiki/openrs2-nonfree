import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!ap", name = "I", descriptor = "Lclient!ji;")
	public final Class134 aClass134_1;

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "Z")
	private final boolean aBoolean14;

	static {
		new Class231("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		new Class231("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIIZIIIIII)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static350.method4923(arg12, arg11));
		this.aClass134_1 = new Class134(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean14 = arg1.anInt5419 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I")
	@Override
	public int method3586() {
		return this.aClass134_1.method2788();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return this.aClass134_1.method2796(0, arg1, false, 0, false, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
		this.aClass134_1.method2792(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
		@Pc(23) Class63 local23 = this.aClass134_1.method2796(super.anInt4487, 262144, false, super.anInt4485, true, arg0);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt4485 >> 7;
			@Pc(35) int local35 = super.anInt4487 >> 7;
			this.aClass134_1.method2791(local30, local30, local35, arg0, local23, local35, false);
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return this.aClass134_1.anInt3400;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class63 local16 = this.aClass134_1.method2796(super.anInt4487, 2048, false, super.anInt4485, true, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class6 local28 = arg0.method5990();
		local28.U(super.anInt4485 + super.anInt4478, super.anInt4479, super.anInt4487 + super.anInt4475);
		@Pc(45) Class28_Sub5 local45 = null;
		if (this.aBoolean14) {
			local45 = Static29.method474(1);
		}
		if (this.aClass134_1.aClass28_Sub1_4 == null) {
			local16.method6293(local28, local45 == null ? null : local45.aClass28_Sub4Array1[0], 0);
		} else {
			@Pc(61) Class56 local61 = this.aClass134_1.aClass28_Sub1_4.method536();
			arg0.method5960(local16, local61, local28, local45 == null ? null : local45.aClass28_Sub4Array1[0]);
		}
		@Pc(94) int local94 = super.anInt4485 >> 7;
		@Pc(99) int local99 = super.anInt4487 >> 7;
		this.aClass134_1.method2791(local94, local94, local99, arg0, local16, local99, true);
		return local45;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
		this.aClass134_1.method2789(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(21) Class63 local21 = this.aClass134_1.method2796(super.anInt4487, 131072, false, super.anInt4485, false, arg2);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class6 local28 = arg2.method5990();
			local28.U(super.anInt4485 + super.anInt4478, super.anInt4479, super.anInt4475 + super.anInt4487);
			return local21.method6292(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return this.aClass134_1.method2797();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aClass134_1.anInt3401;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return this.aClass134_1.anInt3396;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
	}
}
