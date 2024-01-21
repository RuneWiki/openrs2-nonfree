import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class50 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public int anInt1697;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public int anInt1699;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	public int anInt1706;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public int anInt1709;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class50() {
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ld;)V")
	public Class50(@OriginalArg(0) Class50 arg0) {
		this.anInt1709 = arg0.anInt1709;
		this.anInt1699 = arg0.anInt1699;
		this.anInt1706 = arg0.anInt1706;
		this.anInt1697 = arg0.anInt1697;
	}
}
