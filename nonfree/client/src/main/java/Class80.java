import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class80 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	public int anInt2494;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public int anInt2495;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
	public int anInt2496;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class80() {
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!dr;)V")
	public Class80(@OriginalArg(0) Class80 arg0) {
		this.anInt2496 = arg0.anInt2496;
		this.anInt2494 = arg0.anInt2494;
		this.anInt2495 = arg0.anInt2495;
		this.anInt2497 = arg0.anInt2497;
	}
}
