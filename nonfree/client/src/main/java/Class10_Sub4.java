import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
	protected int anInt6835;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "F")
	protected float aFloat115;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
	private final int anInt6827;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
	protected int anInt6834;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
	protected int anInt6833;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
	private final int anInt6830;

	static {
		new Class182("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
		new Class182("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIF)V")
	public Class10_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6835 = arg2;
		this.aFloat115 = arg5;
		this.anInt6827 = arg4;
		this.anInt6834 = arg1;
		this.anInt6833 = arg0;
		this.anInt6830 = arg3;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
	public final int method5354() {
		return this.anInt6833;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)I")
	public final int method5355() {
		return this.anInt6830;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V")
	public abstract void method5358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)F")
	public final float method5359() {
		return this.aFloat115;
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)I")
	public final int method5361() {
		return this.anInt6827;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)I")
	public final int method5362() {
		return this.anInt6835;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IF)V")
	public abstract void method5363(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)I")
	public final int method5365() {
		return this.anInt6834;
	}
}
