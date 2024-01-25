import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	private final int anInt3803;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	private final int anInt3797;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	private final int anInt3795;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	private final int anInt3801;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	private final int anInt3805;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
	private final int anInt3807;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	private final int anInt3798;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	private final int anInt3799;

	static {
		new Class45("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
		new Class45("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
		new Class45("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class22_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3803 = arg3;
		this.anInt3797 = arg5;
		this.anInt3795 = arg0;
		this.anInt3801 = arg2;
		this.anInt3805 = arg7;
		this.anInt3807 = arg4;
		this.anInt3798 = arg6;
		this.anInt3799 = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	@Override
	public void method7937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt3795 * arg1 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt3799 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt3801 >> 12;
		@Pc(37) int local37 = this.anInt3803 * arg0 >> 12;
		@Pc(44) int local44 = arg1 * this.anInt3807 >> 12;
		@Pc(51) int local51 = arg0 * this.anInt3797 >> 12;
		@Pc(58) int local58 = this.anInt3798 * arg1 >> 12;
		@Pc(65) int local65 = arg0 * this.anInt3805 >> 12;
		Static541.method8233(local37, local51, local16, local65, local44, local58, local30, local23, super.anInt9185);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BII)V")
	@Override
	public void method7939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
