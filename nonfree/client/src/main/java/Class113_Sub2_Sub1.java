import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class113_Sub2_Sub1 extends Class113_Sub2 {

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "[B")
	private byte[] aByteArray81;

	static {
		new Class142("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		new Class142("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class113_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method4572(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local7;
		@Pc(25) int local25 = local7 + 1;
		this.aByteArray81[local24] = local16;
		this.aByteArray81[local25] = local16;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)[B")
	public byte[] method4576() {
		this.aByteArray81 = new byte[524288];
		this.method4567();
		return this.aByteArray81;
	}
}
