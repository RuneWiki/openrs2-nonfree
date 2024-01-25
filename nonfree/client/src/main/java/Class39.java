import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class39 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
	public int anInt1425;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
	public int anInt1426;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	public int anInt1427;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class39() {
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class39(@OriginalArg(0) Class39 arg0) {
		this.anInt1427 = arg0.anInt1427;
		this.anInt1425 = arg0.anInt1425;
		this.anInt1426 = arg0.anInt1426;
	}
}
