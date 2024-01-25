import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class27 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public int anInt683;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class27() {
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!cc;)V")
	public Class27(@OriginalArg(0) Class27 arg0) {
		this.anInt682 = arg0.anInt682;
		this.anInt680 = arg0.anInt680;
		this.anInt683 = arg0.anInt683;
		this.anInt681 = arg0.anInt681;
	}
}
