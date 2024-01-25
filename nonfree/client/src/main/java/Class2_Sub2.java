import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
	public volatile int anInt98 = -1;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString1;

	static {
		new Class140("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
		new Class140(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub2(@OriginalArg(0) String arg0) {
		this.aString1 = arg0;
	}
}
