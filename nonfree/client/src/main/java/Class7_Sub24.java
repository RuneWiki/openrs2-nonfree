import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class7_Sub24 extends Class7 {

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public int anInt3083;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public final int anInt3082;

	static {
		new Class55("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(II)V")
	public Class7_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3083 = arg1;
		this.anInt3082 = arg0;
	}
}
