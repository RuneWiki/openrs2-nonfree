import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class38 {

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
	public int anInt1688;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
	public int anInt1689;

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
	public int anInt1690;

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
	public int anInt1691;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class38() {
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class38(@OriginalArg(0) Class38 arg0) {
		this.anInt1689 = arg0.anInt1689;
		this.anInt1688 = arg0.anInt1688;
		this.anInt1690 = arg0.anInt1690;
		this.anInt1691 = arg0.anInt1691;
	}
}
