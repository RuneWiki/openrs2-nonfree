import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class57_Sub5 extends Class57 {

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
	public int anInt3961;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
	public int anInt3962;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "[Lclient!id;")
	public Class57_Sub4[] aClass57_Sub4Array1;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	public int anInt3963;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "Lclient!la;")
	public Class1 aClass1_1;

	static {
		new Class140("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
		new Class140("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
		new Class140("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BILclient!dr;I)Z")
	public boolean method3419(@OriginalArg(1) int arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass57_Sub4Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass57_Sub4Array1.length; local16++) {
				if (this.aClass57_Sub4Array1[local16].method2614(arg0, arg2) && this.aClass1_1.method5757(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
