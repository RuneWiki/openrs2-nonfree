import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
	public int anInt60;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	public int anInt65;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	public int anInt68;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
	public int anInt63 = -1;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
	public int anInt56 = -1;

	static {
		new Class134("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
		new Class134("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		@Pc(6) Class31 local6 = arg0.method5539();
		local6.U(super.anInt52, super.anInt53, super.anInt48);
		@Pc(27) Class21_Sub6 local27 = Static209.method2805(3);
		@Pc(51) Class59 local51;
		if (this.anInt63 != -1) {
			local51 = Static384.aClass164_2.method3458(this.anInt63).method4470(2048, 0, arg0, null, 0, -1, this.anInt60, null);
			if (local51 != null) {
				local51.method5736(local6, local27.aClass21_Sub7Array1[2], 0);
			}
		}
		if (this.anInt56 != -1) {
			local51 = Static384.aClass164_2.method3458(this.anInt56).method4470(2048, 0, arg0, null, 0, -1, this.anInt58, null);
			if (local51 != null) {
				local51.method5736(local6, local27.aClass21_Sub7Array1[1], 0);
			}
		}
		local51 = Static384.aClass164_2.method3458(this.anInt68).method4470(2048, 0, arg0, null, 0, -1, this.anInt65, null);
		if (local51 != null) {
			local51.method5736(local6, local27.aClass21_Sub7Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(6) Class31 local6 = arg2.method5539();
		local6.U(super.anInt52, super.anInt53, super.anInt48);
		@Pc(39) Class59 local39 = Static384.aClass164_2.method3458(this.anInt68).method4470(131072, 0, arg2, null, 0, -1, this.anInt65, null);
		if (local39 != null && local39.method5748(arg1, arg0, local6, true)) {
			return true;
		}
		if (this.anInt56 != -1) {
			local39 = Static384.aClass164_2.method3458(this.anInt56).method4470(131072, 0, arg2, null, 0, -1, this.anInt58, null);
			if (local39 != null && local39.method5748(arg1, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt63 != -1) {
			local39 = Static384.aClass164_2.method3458(this.anInt63).method4470(131072, 0, arg2, null, 0, -1, this.anInt60, null);
			if (local39 != null && local39.method5748(arg1, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
