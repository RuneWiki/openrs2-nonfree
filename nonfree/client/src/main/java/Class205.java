import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class205 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public int anInt5315;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public int anInt5316;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public int anInt5317;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class205() {
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!ke;)V")
	public Class205(@OriginalArg(0) Class205 arg0) {
		this.anInt5316 = arg0.anInt5316;
		this.anInt5317 = arg0.anInt5317;
		this.anInt5315 = arg0.anInt5315;
	}
}
