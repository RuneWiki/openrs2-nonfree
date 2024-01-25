import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ww", name = "x", descriptor = "F")
	protected float aFloat34;

	@OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
	protected int anInt2818;

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "I")
	protected int anInt2820;

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
	protected int anInt2813;

	@OriginalMember(owner = "client!ww", name = "B", descriptor = "I")
	private final int anInt2823;

	@OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
	private final int anInt2817;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat34 = arg5;
		this.anInt2818 = arg1;
		this.anInt2820 = arg0;
		this.anInt2813 = arg2;
		this.anInt2823 = arg3;
		this.anInt2817 = arg4;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I")
	public final int method2426() {
		return this.anInt2820;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)I")
	public final int method2427() {
		return this.anInt2813;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)I")
	public final int method2428() {
		return this.anInt2818;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BF)V")
	public abstract void method2431(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)I")
	public final int method2432() {
		return this.anInt2817;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIBI)V")
	public abstract void method2433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)I")
	public final int method2434() {
		return this.anInt2823;
	}

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "(I)F")
	public final float method2436() {
		return this.aFloat34;
	}
}
