import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class38 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
	public int anInt1439;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public int anInt1441;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public int anInt1442;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
	public int anInt1444;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class38() {
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!hg;)V")
	public Class38(@OriginalArg(0) Class38 arg0) {
		this.anInt1444 = arg0.anInt1444;
		this.anInt1439 = arg0.anInt1439;
		this.anInt1442 = arg0.anInt1442;
		this.anInt1441 = arg0.anInt1441;
	}
}
