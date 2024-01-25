import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class Class7_Sub30 extends Class7 {

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	protected int anInt6325;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
	private final int anInt6327;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
	private final int anInt6320;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
	protected int anInt6323;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
	protected int anInt6330;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "F")
	protected float aFloat183;

	static {
		new Class55("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIIF)V")
	public Class7_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6325 = arg1;
		this.anInt6327 = arg3;
		this.anInt6320 = arg4;
		this.anInt6323 = arg0;
		this.anInt6330 = arg2;
		this.aFloat183 = arg5;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)I")
	public final int method5023() {
		return this.anInt6330;
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(B)F")
	public final float method5024() {
		return this.aFloat183;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I")
	public final int method5025() {
		return this.anInt6320;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(FI)V")
	public abstract void method5026(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBI)V")
	public abstract void method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)I")
	public final int method5029() {
		return this.anInt6325;
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)I")
	public final int method5031() {
		return this.anInt6327;
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)I")
	public final int method5032() {
		return this.anInt6323;
	}
}
