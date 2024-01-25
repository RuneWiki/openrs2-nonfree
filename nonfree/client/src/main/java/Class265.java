import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class265 {

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
	public int anInt7754;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	public int anInt7755;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
	public int anInt7757;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "Lclient!wq;")
	public Class265 aClass265_2;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "Lclient!ia;")
	public Class43 aClass43_5;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	public final int anInt7761;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
	public final int anInt7759;

	static {
		new Class96(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		new Class96("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V")
	public Class265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7761 = arg0;
		this.anInt7759 = arg1;
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!wq;I)V")
	public Class265(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1) {
		this.aClass265_2 = arg0;
		this.anInt7761 = this.aClass265_2.anInt7761;
		this.aClass43_5 = this.aClass265_2.aClass43_5;
		this.anInt7759 = arg1 + this.aClass265_2.anInt7759;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)Lclient!wq;")
	public Class265 method5977(@OriginalArg(0) int arg0) {
		return new Class265(this.anInt7761, arg0);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Lclient!aw;")
	public Class18 method5979() {
		return Static448.method5970(this.anInt7761);
	}
}
