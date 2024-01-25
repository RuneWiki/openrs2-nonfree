import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class17_Sub5_Sub1 extends Class17_Sub5 implements Interface5 {

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "Lclient!lc;")
	public final Class120 aClass120_3;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Z")
	private final boolean aBoolean366;

	static {
		new Class34("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
		new Class34("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIIIZI)V")
	public Class17_Sub5_Sub1(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean401, arg1.aBoolean407);
		this.aClass120_3 = new Class120(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean366 = arg1.anInt4294 != 0 && !arg8;
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)I")
	@Override
	public int method4794() {
		return this.aClass120_3.anInt3632;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4796(@OriginalArg(0) Class32 arg0) {
		this.aClass120_3.method3367(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	@Override
	public void method4801() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class73 local21 = this.aClass120_3.method3366(65536, arg0, super.anInt4641, super.anInt4642, false, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class109 local28 = arg0.method2194();
			local28.method3873(super.anInt4642, super.anInt4639, super.anInt4641);
			return local21.method3326(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)I")
	@Override
	public int method4799() {
		return this.aClass120_3.anInt3610;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4800(@OriginalArg(0) Class32 arg0) {
		this.aClass120_3.method3370(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		@Pc(16) Class73 local16 = this.aClass120_3.method3366(1024, arg0, super.anInt4641, super.anInt4642, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class109 local23 = arg0.method2194();
		local23.method3873(super.anInt4642, super.anInt4639, super.anInt4641);
		@Pc(33) Class8_Sub5 local33 = null;
		if (this.aBoolean366) {
			local33 = Static239.method4367(1);
		}
		if (this.aClass120_3.aClass8_Sub6_4 == null) {
			local16.method3322(local23, local33 == null ? null : local33.aClass8_Sub3Array1[0], 0);
		} else {
			@Pc(63) Class191 local63 = this.aClass120_3.aClass8_Sub6_4.method3279();
			arg0.method2181(local16, local63, local23, local33 == null ? null : local33.aClass8_Sub3Array1[0]);
		}
		this.aClass120_3.method3374(arg0, local16, super.anInt4641 >> 7, super.anInt4642 >> 7, true, super.anInt4641 >> 7, super.anInt4642 >> 7);
		return local33;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)I")
	@Override
	public int method4797() {
		return this.aClass120_3.anInt3613;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4795() {
		return this.aClass120_3.method3375();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	@Override
	public Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		return this.aClass120_3.method3366(arg1, arg0, 0, 0, false, false);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
		@Pc(21) Class73 local21 = this.aClass120_3.method3366(131072, arg0, super.anInt4641, super.anInt4642, true, true);
		if (local21 != null) {
			this.aClass120_3.method3374(arg0, local21, super.anInt4641 >> 7, super.anInt4642 >> 7, false, super.anInt4641 >> 7, super.anInt4642 >> 7);
		}
	}
}
