import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class176 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	public int anInt5795;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public int anInt5796;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
	public int anInt5797;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class176() {
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!rq;)V")
	public Class176(@OriginalArg(0) Class176 arg0) {
		this.anInt5796 = arg0.anInt5796;
		this.anInt5797 = arg0.anInt5797;
		this.anInt5795 = arg0.anInt5795;
	}
}
