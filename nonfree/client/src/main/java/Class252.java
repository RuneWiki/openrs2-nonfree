import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class252 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
	private final int anInt7322;

	static {
		new Class45("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(II)V")
	public Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7322 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	public int method6571() {
		return this.anInt7322;
	}

	@OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
