import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class Class5_Sub18 extends Class5 {

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private final int anInt9557;

	@OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
	protected int anInt9570;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	protected int anInt9556;

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "F")
	protected float aFloat195;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
	private final int anInt9565;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	protected int anInt9559;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9557 = arg4;
		this.anInt9570 = arg0;
		this.anInt9556 = arg1;
		this.aFloat195 = arg5;
		this.anInt9565 = arg3;
		this.anInt9559 = arg2;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(FI)V")
	public abstract void method8047(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIBI)V")
	public abstract void method8048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	public final int method8051() {
		return this.anInt9556;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)F")
	public final float method8054() {
		return this.aFloat195;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I")
	public final int method8055() {
		return this.anInt9570;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
	public final int method8056() {
		return this.anInt9565;
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)I")
	public final int method8057() {
		return this.anInt9559;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(Z)I")
	public final int method8058() {
		return this.anInt9557;
	}
}
