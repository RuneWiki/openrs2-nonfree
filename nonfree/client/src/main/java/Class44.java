import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class44 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!uj;")
	public Interface18 anInterface18_4;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!uj;")
	public Interface18 anInterface18_5;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Z")
	public boolean aBoolean98;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Z")
	public boolean aBoolean97;

	static {
		new Class88("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Z)V")
	public Class44(@OriginalArg(0) boolean arg0) {
		this.aBoolean97 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Z")
	public boolean method1406() {
		return this.aBoolean98 && !this.aBoolean97;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public void method1409() {
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method7898();
		}
		this.aBoolean98 = false;
	}
}
