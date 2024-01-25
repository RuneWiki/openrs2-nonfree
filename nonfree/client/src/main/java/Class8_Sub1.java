import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public abstract class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ada", name = "A", descriptor = "I")
	private final int anInt6409;

	@OriginalMember(owner = "client!ada", name = "o", descriptor = "F")
	protected float aFloat125;

	@OriginalMember(owner = "client!ada", name = "x", descriptor = "I")
	protected int anInt6408;

	@OriginalMember(owner = "client!ada", name = "w", descriptor = "I")
	protected int anInt6407;

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
	private final int anInt6397;

	@OriginalMember(owner = "client!ada", name = "u", descriptor = "I")
	protected int anInt6405;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IIIIIF)V")
	public Class8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6409 = arg4;
		this.aFloat125 = arg5;
		this.anInt6408 = arg2;
		this.anInt6407 = arg1;
		this.anInt6397 = arg3;
		this.anInt6405 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)I")
	public final int method5198() {
		return this.anInt6407;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IF)V")
	public abstract void method5199(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)I")
	public final int method5200() {
		return this.anInt6397;
	}

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)I")
	public final int method5203() {
		return this.anInt6409;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BIII)V")
	public abstract void method5204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "(I)F")
	public final float method5205() {
		return this.aFloat125;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)I")
	public final int method5206() {
		return this.anInt6405;
	}

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "(I)I")
	public final int method5207() {
		return this.anInt6408;
	}
}
