import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class224 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public int anInt6249;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public int anInt6251;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Z")
	public boolean aBoolean436;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	public int anInt6255;

	static {
		new Class209(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
		new Class209("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}
}
