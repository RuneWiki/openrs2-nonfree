import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class67 {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
	public int anInt1699;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
	public int anInt1700;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public int anInt1701;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	public Class67() {
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!cw;)V")
	public Class67(@OriginalArg(0) Class67 arg0) {
		this.anInt1700 = arg0.anInt1700;
		this.anInt1701 = arg0.anInt1701;
		this.anInt1699 = arg0.anInt1699;
	}
}
