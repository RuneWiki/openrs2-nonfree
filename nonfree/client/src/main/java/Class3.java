import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class Class3 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "J")
	public long aLong285;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!uj;")
	public Class3 aClass3_283;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!uj;")
	public Class3 aClass3_284;

	static {
		new Class67("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
	public final void method7820() {
		if (this.aClass3_283 != null) {
			this.aClass3_283.aClass3_284 = this.aClass3_284;
			this.aClass3_284.aClass3_283 = this.aClass3_283;
			this.aClass3_283 = null;
			this.aClass3_284 = null;
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)Z")
	public final boolean method7821() {
		return this.aClass3_283 != null;
	}
}
