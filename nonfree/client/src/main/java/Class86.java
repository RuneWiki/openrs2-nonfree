import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class86 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public int anInt2653;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public int anInt2654;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	public int anInt2655;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class86() {
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!hl;)V")
	public Class86(@OriginalArg(0) Class86 arg0) {
		this.anInt2655 = arg0.anInt2655;
		this.anInt2652 = arg0.anInt2652;
		this.anInt2653 = arg0.anInt2653;
		this.anInt2654 = arg0.anInt2654;
	}
}
