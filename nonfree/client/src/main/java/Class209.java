import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class209 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public int anInt5745;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
	public int anInt5746;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	public int anInt5747;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
	public int anInt5748;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class209() {
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class209(@OriginalArg(0) Class209 arg0) {
		this.anInt5745 = arg0.anInt5745;
		this.anInt5746 = arg0.anInt5746;
		this.anInt5747 = arg0.anInt5747;
		this.anInt5748 = arg0.anInt5748;
	}
}
