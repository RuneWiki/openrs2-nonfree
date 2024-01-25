import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class25_Sub4_Sub3 extends Class25_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Lclient!co;")
	public final Class44 aClass44_3;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "Z")
	private final boolean aBoolean488;

	static {
		new Class169("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIIZII)V")
	public Class25_Sub4_Sub3(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean543, arg1.aBoolean539);
		this.aClass44_3 = new Class44(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean488 = arg1.anInt5915 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return this.aClass44_3.anInt1094;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return this.aClass44_3.anInt1093;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		@Pc(16) Class22 local16 = this.aClass44_3.method862(true, super.anInt5127, arg0, false, super.anInt5129, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class127 local23 = arg0.method5378();
		local23.method5265(super.anInt5129, super.anInt5130, super.anInt5127);
		@Pc(33) Class41_Sub1 local33 = null;
		if (this.aBoolean488) {
			local33 = Static277.method4255(1);
		}
		if (this.aClass44_3.aClass41_Sub3_3 == null) {
			local16.method1565(local23, local33 == null ? null : local33.aClass41_Sub5Array1[0], 0);
		} else {
			@Pc(63) Class108 local63 = this.aClass44_3.aClass41_Sub3_3.method2143();
			arg0.method5365(local16, local63, local23, local33 == null ? null : local33.aClass41_Sub5Array1[0]);
		}
		this.aClass44_3.method857(arg0, local16, super.anInt5127 >> 7, super.anInt5129 >> 7, super.anInt5127 >> 7, super.anInt5129 >> 7, true);
		return local33;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return this.aClass44_3.method863();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return this.aClass44_3.method862(false, 0, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
		this.aClass44_3.method861(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return this.aClass44_3.anInt1092;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
		this.aClass44_3.method856(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class22 local16 = this.aClass44_3.method862(false, super.anInt5127, arg0, false, super.anInt5129, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class127 local31 = arg0.method5378();
			local31.method5265(super.anInt5129, super.anInt5130, super.anInt5127);
			return local16.method1584(arg1, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
		@Pc(18) Class22 local18 = this.aClass44_3.method862(true, super.anInt5127, arg0, true, super.anInt5129, 131072);
		if (local18 != null) {
			this.aClass44_3.method857(arg0, local18, super.anInt5127 >> 7, super.anInt5129 >> 7, super.anInt5127 >> 7, super.anInt5129 >> 7, false);
		}
	}
}
