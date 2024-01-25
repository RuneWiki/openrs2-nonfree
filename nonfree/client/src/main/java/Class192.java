import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class192 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public int anInt5146;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public int anInt5147;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public int anInt5148;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class192() {
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!ke;)V")
	public Class192(@OriginalArg(0) Class192 arg0) {
		this.anInt5146 = arg0.anInt5146;
		this.anInt5148 = arg0.anInt5148;
		this.anInt5147 = arg0.anInt5147;
	}
}
