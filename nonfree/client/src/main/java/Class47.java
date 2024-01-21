import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class47 {

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public int anInt1722;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public int anInt1725;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public int anInt1729;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class47() {
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ld;)V")
	public Class47(@OriginalArg(0) Class47 arg0) {
		this.anInt1729 = arg0.anInt1729;
		this.anInt1725 = arg0.anInt1725;
		this.anInt1722 = arg0.anInt1722;
		this.anInt1723 = arg0.anInt1723;
	}
}
