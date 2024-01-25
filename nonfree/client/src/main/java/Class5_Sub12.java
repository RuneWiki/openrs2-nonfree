import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class Class5_Sub12 extends Class5 {

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
	private final int anInt5010;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
	protected int anInt5016;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
	private final int anInt5006;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
	protected int anInt5013;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
	protected int anInt5011;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "F")
	protected float aFloat123;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt5010 = arg3;
		this.anInt5016 = arg2;
		this.anInt5006 = arg4;
		this.anInt5013 = arg0;
		this.anInt5011 = arg1;
		this.aFloat123 = arg5;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	public abstract void method4529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)I")
	public final int method4530() {
		return this.anInt5006;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)I")
	public final int method4531() {
		return this.anInt5010;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)I")
	public final int method4533() {
		return this.anInt5011;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)I")
	public final int method4534() {
		return this.anInt5016;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BF)V")
	public abstract void method4535(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)F")
	public final float method4536() {
		return this.aFloat123;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I")
	public final int method4537() {
		return this.anInt5013;
	}
}
