import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class94 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public int anInt3738;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public int anInt3740;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public int anInt3742;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	public int anInt3746;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class94() {
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class94(@OriginalArg(0) Class94 arg0) {
		this.anInt3738 = arg0.anInt3738;
		this.anInt3742 = arg0.anInt3742;
		this.anInt3746 = arg0.anInt3746;
		this.anInt3740 = arg0.anInt3740;
	}
}
