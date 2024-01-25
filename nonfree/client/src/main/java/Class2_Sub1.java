import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	protected int anInt4531;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	protected int anInt4535;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	private final int anInt4536;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "F")
	protected float aFloat118;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	private final int anInt4529;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	protected int anInt4541;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt4531 = arg1;
		this.anInt4535 = arg2;
		this.anInt4536 = arg3;
		this.aFloat118 = arg5;
		this.anInt4529 = arg4;
		this.anInt4541 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IF)V")
	public abstract void method3961(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
	public final int method3962() {
		return this.anInt4535;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)I")
	public final int method3965() {
		return this.anInt4529;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)F")
	public final float method3966() {
		return this.aFloat118;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)I")
	public final int method3967() {
		return this.anInt4531;
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)I")
	public final int method3968() {
		return this.anInt4536;
	}

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)I")
	public final int method3969() {
		return this.anInt4541;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBII)V")
	public abstract void method3970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
