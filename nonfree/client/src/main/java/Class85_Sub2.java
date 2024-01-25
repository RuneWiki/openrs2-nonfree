import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
	private final int anInt7049;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
	private final int anInt7048;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	private final int anInt7043;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
	private final int anInt7044;

	static {
		new Class7("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
		new Class7("Player ", "Spieler ", "Joueur ", "Jogador ");
		new Class7("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class85_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7049 = arg0;
		this.anInt7048 = arg2;
		this.anInt7043 = arg3;
		this.anInt7044 = arg1;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7049 >> 12;
		@Pc(25) int local25 = this.anInt7048 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt7044 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt7043 >> 12;
		Static434.method5760(local39, super.anInt7168, super.anInt7170, super.anInt7166, local25, local32, local10);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt7049 * arg0 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt7048 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt7044 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt7043 >> 12;
		Static451.method5927(local30, super.anInt7168, local37, super.anInt7170, local23, local16);
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(III)V")
	@Override
	public void method5867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7049 >> 12;
		@Pc(17) int local17 = this.anInt7048 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt7044 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt7043 >> 12;
		Static19.method499(local24, local17, local31, local10, super.anInt7166);
	}
}
