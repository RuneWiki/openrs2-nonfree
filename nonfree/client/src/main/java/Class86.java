import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class86 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
	public int anInt2542;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
	public int anInt2543;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class86() {
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class86(@OriginalArg(0) Class86 arg0) {
		this.anInt2542 = arg0.anInt2542;
		this.anInt2543 = arg0.anInt2543;
		this.anInt2544 = arg0.anInt2544;
	}
}
