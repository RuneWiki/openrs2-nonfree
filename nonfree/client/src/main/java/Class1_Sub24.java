import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
	protected int anInt5611;

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
	protected int anInt5616;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "F")
	protected float aFloat85;

	@OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
	private final int anInt5619;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
	private final int anInt5610;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
	protected int anInt5615;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt5611 = arg2;
		this.anInt5616 = arg1;
		this.aFloat85 = arg5;
		this.anInt5619 = arg4;
		this.anInt5610 = arg3;
		this.anInt5615 = arg0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)I")
	public final int method4367() {
		return this.anInt5615;
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)I")
	public final int method4369() {
		return this.anInt5611;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIII)V")
	public abstract void method4370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)F")
	public final float method4371() {
		return this.aFloat85;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(FB)V")
	public abstract void method4372(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "(I)I")
	public final int method4373() {
		return this.anInt5619;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)I")
	public final int method4374() {
		return this.anInt5610;
	}

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "(I)I")
	public final int method4376() {
		return this.anInt5616;
	}
}
