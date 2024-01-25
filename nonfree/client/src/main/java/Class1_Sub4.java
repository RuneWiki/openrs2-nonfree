import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	protected int anInt4987;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
	private final int anInt4994;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	private final int anInt4985;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "F")
	protected float aFloat66;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
	protected int anInt4992;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	protected int anInt4984;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt4987 = arg0;
		this.anInt4994 = arg3;
		this.anInt4985 = arg4;
		this.aFloat66 = arg5;
		this.anInt4992 = arg2;
		this.anInt4984 = arg1;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)I")
	public final int method3805() {
		return this.anInt4994;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBII)V")
	public abstract void method3806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(FB)V")
	public abstract void method3807(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)I")
	public final int method3808() {
		return this.anInt4985;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)I")
	public final int method3809() {
		return this.anInt4992;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
	public final int method3810() {
		return this.anInt4984;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)F")
	public final float method3811() {
		return this.aFloat66;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)I")
	public final int method3813() {
		return this.anInt4987;
	}
}
