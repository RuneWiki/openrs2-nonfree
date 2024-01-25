import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class Class7 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!ps;")
	public Class7 aClass7_23;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!ps;")
	public Class7 aClass7_24;

	static {
		new Class62("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V")
	public final void method5398() {
		if (this.aClass7_23 != null) {
			this.aClass7_23.aClass7_24 = this.aClass7_24;
			this.aClass7_24.aClass7_23 = this.aClass7_23;
			this.aClass7_24 = null;
			this.aClass7_23 = null;
		}
	}
}
