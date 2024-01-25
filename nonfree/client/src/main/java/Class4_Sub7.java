import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
	protected int anInt5490;

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
	protected int anInt5496;

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
	private final int anInt5487;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	private final int anInt5481;

	@OriginalMember(owner = "client!ku", name = "r", descriptor = "F")
	protected float aFloat66;

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
	protected int anInt5489;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt5490 = arg2;
		this.anInt5496 = arg1;
		this.anInt5487 = arg4;
		this.anInt5481 = arg3;
		this.aFloat66 = arg5;
		this.anInt5489 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIII)V")
	public abstract void method4444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
	public final int method4445() {
		return this.anInt5487;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
	public final int method4446() {
		return this.anInt5481;
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)I")
	public final int method4448() {
		return this.anInt5496;
	}

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)I")
	public final int method4449() {
		return this.anInt5490;
	}

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)I")
	public final int method4451() {
		return this.anInt5489;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(FI)V")
	public abstract void method4453(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)F")
	public final float method4454() {
		return this.aFloat66;
	}
}
