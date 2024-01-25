import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!cba", name = "A", descriptor = "I")
	private final int anInt4670;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "F")
	protected float aFloat88;

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
	protected int anInt4667;

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "I")
	protected int anInt4666;

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
	private final int anInt4662;

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
	protected int anInt4664;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt4670 = arg3;
		this.aFloat88 = arg5;
		this.anInt4667 = arg0;
		this.anInt4666 = arg1;
		this.anInt4662 = arg4;
		this.anInt4664 = arg2;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I")
	public final int method4305() {
		return this.anInt4666;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)I")
	public final int method4306() {
		return this.anInt4667;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)V")
	public abstract void method4308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)F")
	public final float method4310() {
		return this.aFloat88;
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(B)I")
	public final int method4311() {
		return this.anInt4670;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IF)V")
	public abstract void method4312(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "(B)I")
	public final int method4313() {
		return this.anInt4662;
	}

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "(B)I")
	public final int method4314() {
		return this.anInt4664;
	}
}
