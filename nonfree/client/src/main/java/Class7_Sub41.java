import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class7_Sub41 extends Class7 {

	@OriginalMember(owner = "client!su", name = "i", descriptor = "[B")
	public final byte[] aByteArray88;

	static {
		new Class55("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "([B)V")
	public Class7_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aByteArray88 = arg0;
	}
}
