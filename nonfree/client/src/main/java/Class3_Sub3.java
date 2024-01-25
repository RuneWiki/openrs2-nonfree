import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "J")
	public long aLong243;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!uh;")
	public Class3_Sub3 aClass3_Sub3_57;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!uh;")
	public Class3_Sub3 aClass3_Sub3_58;

	static {
		new Class174("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
		new Class174("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public final void method6102() {
		if (this.aClass3_Sub3_58 != null) {
			this.aClass3_Sub3_58.aClass3_Sub3_57 = this.aClass3_Sub3_57;
			this.aClass3_Sub3_57.aClass3_Sub3_58 = this.aClass3_Sub3_58;
			this.aClass3_Sub3_57 = null;
			this.aClass3_Sub3_58 = null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)Z")
	public final boolean method6104() {
		return this.aClass3_Sub3_58 != null;
	}
}
