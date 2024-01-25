import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class72 {

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
	public int anInt2461;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	public int anInt2462;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
	public int anInt2463;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "()V")
	public Class72() {
	}

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!eca;)V")
	public Class72(@OriginalArg(0) Class72 arg0) {
		this.anInt2462 = arg0.anInt2462;
		this.anInt2461 = arg0.anInt2461;
		this.anInt2463 = arg0.anInt2463;
	}
}
