import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class43 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "B")
	public final byte aByte8;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!ee;")
	public Interface2 anInterface2_1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "B")
	public byte aByte7;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "S")
	public final short aShort1;

	static {
		new Class306("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
		new Class306("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!ee;III)V")
	public Class43(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte8 = (byte) arg2;
		this.anInterface2_1 = arg0;
		this.aByte7 = (byte) arg3;
		this.aShort1 = (short) arg1;
	}
}
