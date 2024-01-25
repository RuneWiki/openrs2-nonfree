import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class196 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public int anInt5219;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
	public int anInt5220;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public int anInt5221;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class196() {
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class196(@OriginalArg(0) Class196 arg0) {
		this.anInt5219 = arg0.anInt5219;
		this.anInt5221 = arg0.anInt5221;
		this.anInt5220 = arg0.anInt5220;
	}
}
