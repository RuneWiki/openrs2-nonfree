import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class83 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	public int anInt4015;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	public int anInt4017;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	public int anInt4019;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public int anInt4021;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class83() {
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!ue;)V")
	public Class83(@OriginalArg(0) Class83 arg0) {
		this.anInt4019 = arg0.anInt4019;
		this.anInt4021 = arg0.anInt4021;
		this.anInt4015 = arg0.anInt4015;
		this.anInt4017 = arg0.anInt4017;
	}
}
