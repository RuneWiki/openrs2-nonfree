import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class25 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	private final int anInt443;

	static {
		new Class231("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(II)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt443 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I")
	public int method360() {
		return this.anInt443;
	}

	@OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
