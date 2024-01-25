import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class Class2 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!uj;")
	public Class2 aClass2_261;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "J")
	public long aLong227;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!uj;")
	public Class2 aClass2_262;

	static {
		new Class209("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
		new Class209(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z")
	public final boolean method5865() {
		return this.aClass2_262 != null;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
	public final void method5866() {
		if (this.aClass2_262 != null) {
			this.aClass2_262.aClass2_261 = this.aClass2_261;
			this.aClass2_261.aClass2_262 = this.aClass2_262;
			this.aClass2_262 = null;
			this.aClass2_261 = null;
		}
	}
}
