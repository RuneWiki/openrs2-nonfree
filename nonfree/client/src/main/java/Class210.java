import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class210 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
	public int anInt5639;

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
	public int anInt5640;

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
	public int anInt5641;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
	public int anInt5642;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	public Class210() {
	}

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!maa;)V")
	public Class210(@OriginalArg(0) Class210 arg0) {
		this.anInt5641 = arg0.anInt5641;
		this.anInt5642 = arg0.anInt5642;
		this.anInt5639 = arg0.anInt5639;
		this.anInt5640 = arg0.anInt5640;
	}
}
