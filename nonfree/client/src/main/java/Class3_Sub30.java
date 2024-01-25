import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	protected int anInt6384;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
	private final int anInt6392;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	protected int anInt6382;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "F")
	protected float aFloat194;

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
	private final int anInt6393;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	protected int anInt6389;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6384 = arg0;
		this.anInt6392 = arg4;
		this.anInt6382 = arg2;
		this.aFloat194 = arg5;
		this.anInt6393 = arg3;
		this.anInt6389 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)F")
	public final float method5382() {
		return this.aFloat194;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(FI)V")
	public abstract void method5383(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIII)V")
	public abstract void method5385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
	public final int method5386() {
		return this.anInt6384;
	}

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)I")
	public final int method5387() {
		return this.anInt6393;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)I")
	public final int method5388() {
		return this.anInt6382;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)I")
	public final int method5390() {
		return this.anInt6389;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)I")
	public final int method5391() {
		return this.anInt6392;
	}
}
