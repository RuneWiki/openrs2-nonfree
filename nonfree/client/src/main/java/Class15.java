import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class15 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	public int anInt546;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class15() {
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class15(@OriginalArg(0) Class15 arg0) {
		this.anInt546 = arg0.anInt546;
		this.anInt547 = arg0.anInt547;
		this.anInt548 = arg0.anInt548;
	}
}
