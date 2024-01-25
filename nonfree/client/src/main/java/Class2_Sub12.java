import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public abstract class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!laa", name = "v", descriptor = "F")
	protected float aFloat165;

	@OriginalMember(owner = "client!laa", name = "t", descriptor = "I")
	protected int anInt8612;

	@OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
	protected int anInt8609;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
	private final int anInt8604;

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
	private final int anInt8602;

	@OriginalMember(owner = "client!laa", name = "s", descriptor = "I")
	protected int anInt8611;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat165 = arg5;
		this.anInt8612 = arg0;
		this.anInt8609 = arg1;
		this.anInt8604 = arg4;
		this.anInt8602 = arg3;
		this.anInt8611 = arg2;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
	public final int method7415() {
		return this.anInt8612;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)I")
	public final int method7417() {
		return this.anInt8604;
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)I")
	public final int method7418() {
		return this.anInt8602;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIBI)V")
	public abstract void method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)I")
	public final int method7420() {
		return this.anInt8609;
	}

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "(I)I")
	public final int method7421() {
		return this.anInt8611;
	}

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "(I)F")
	public final float method7422() {
		return this.aFloat165;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(FI)V")
	public abstract void method7424(@OriginalArg(0) float arg0);
}
