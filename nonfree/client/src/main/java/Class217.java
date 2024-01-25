import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class217 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	public int anInt5859;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public int anInt5860;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
	public int anInt5861;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
	public int anInt5862;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class217() {
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!rq;)V")
	public Class217(@OriginalArg(0) Class217 arg0) {
		this.anInt5862 = arg0.anInt5862;
		this.anInt5860 = arg0.anInt5860;
		this.anInt5859 = arg0.anInt5859;
		this.anInt5861 = arg0.anInt5861;
	}
}
