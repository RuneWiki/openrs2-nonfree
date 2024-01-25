import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class95 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public int anInt2515;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	public int anInt2516;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public int anInt2517;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	public int anInt2518;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class95() {
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!gu;)V")
	public Class95(@OriginalArg(0) Class95 arg0) {
		this.anInt2516 = arg0.anInt2516;
		this.anInt2518 = arg0.anInt2518;
		this.anInt2517 = arg0.anInt2517;
		this.anInt2515 = arg0.anInt2515;
	}
}
