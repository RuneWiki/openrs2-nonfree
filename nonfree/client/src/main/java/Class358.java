import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class358 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	public int anInt9687;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public int anInt9688;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	public int anInt9689;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public int anInt9690;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	public Class358() {
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!wl;)V")
	public Class358(@OriginalArg(0) Class358 arg0) {
		this.anInt9689 = arg0.anInt9689;
		this.anInt9690 = arg0.anInt9690;
		this.anInt9687 = arg0.anInt9687;
		this.anInt9688 = arg0.anInt9688;
	}
}
