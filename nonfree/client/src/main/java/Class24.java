import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class24 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class24() {
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!bs;)V")
	public Class24(@OriginalArg(0) Class24 arg0) {
		this.anInt690 = arg0.anInt690;
		this.anInt689 = arg0.anInt689;
		this.anInt691 = arg0.anInt691;
		this.anInt688 = arg0.anInt688;
	}
}
