import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class86 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	public int anInt2485;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
	public int anInt2486;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	public int anInt2489;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	public int anInt2490;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class86() {
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!jh;)V")
	public Class86(@OriginalArg(0) Class86 arg0) {
		this.anInt2490 = arg0.anInt2490;
		this.anInt2485 = arg0.anInt2485;
		this.anInt2489 = arg0.anInt2489;
		this.anInt2486 = arg0.anInt2486;
	}
}
