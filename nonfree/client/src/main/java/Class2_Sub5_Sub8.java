import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class2_Sub5_Sub8 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "Lclient!nr;")
	public final Class3_Sub4_Sub3 aClass3_Sub4_Sub3_1;

	static {
		new Class134(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
		new Class134("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!nr;)V")
	public Class2_Sub5_Sub8(@OriginalArg(0) Class3_Sub4_Sub3 arg0) {
		this.aClass3_Sub4_Sub3_1 = arg0;
	}
}
