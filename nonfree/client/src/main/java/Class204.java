import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class204 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public int anInt5525;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public int anInt5526;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	public int anInt5527;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public int anInt5528;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class204() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!qf;)V")
	public Class204(@OriginalArg(0) Class204 arg0) {
		this.anInt5525 = arg0.anInt5525;
		this.anInt5527 = arg0.anInt5527;
		this.anInt5526 = arg0.anInt5526;
		this.anInt5528 = arg0.anInt5528;
	}
}
