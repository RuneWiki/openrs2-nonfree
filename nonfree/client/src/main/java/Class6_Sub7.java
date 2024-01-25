import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
	private final int anInt4030;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	protected int anInt4022;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
	protected int anInt4032;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
	protected int anInt4025;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "F")
	protected float aFloat56;

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
	private final int anInt4026;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt4030 = arg3;
		this.anInt4022 = arg2;
		this.anInt4032 = arg1;
		this.anInt4025 = arg0;
		this.aFloat56 = arg5;
		this.anInt4026 = arg4;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IF)V")
	public abstract void method3484(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
	public final int method3486() {
		return this.anInt4026;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)I")
	public final int method3487() {
		return this.anInt4030;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
	public abstract void method3488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I")
	public final int method3490() {
		return this.anInt4025;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)F")
	public final float method3491() {
		return this.aFloat56;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)I")
	public final int method3492() {
		return this.anInt4022;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)I")
	public final int method3493() {
		return this.anInt4032;
	}
}
