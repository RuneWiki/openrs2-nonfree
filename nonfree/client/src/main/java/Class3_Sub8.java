import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
	protected int anInt5617;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	protected int anInt5612;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	private final int anInt5613;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	protected int anInt5610;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "F")
	protected float aFloat63;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	private final int anInt5615;

	static {
		new Class189("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt5617 = arg0;
		this.anInt5612 = arg1;
		this.anInt5613 = arg4;
		this.anInt5610 = arg2;
		this.aFloat63 = arg5;
		this.anInt5615 = arg3;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)I")
	public final int method4395() {
		return this.anInt5610;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I")
	public final int method4397() {
		return this.anInt5612;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)F")
	public final float method4399() {
		return this.aFloat63;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)I")
	public final int method4400() {
		return this.anInt5615;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(FZ)V")
	public abstract void method4401(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)I")
	public final int method4402() {
		return this.anInt5613;
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)I")
	public final int method4404() {
		return this.anInt5617;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBII)V")
	public abstract void method4405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
