import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public final class Class253 {

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
	public final int anInt7544;

	static {
		new Class67("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class253(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7544 = arg1;
	}

	@OriginalMember(owner = "client!raa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
