import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class138 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	public int anInt4144;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	public int anInt4145;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	public int anInt4146;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class138() {
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!nk;)V")
	public Class138(@OriginalArg(0) Class138 arg0) {
		this.anInt4145 = arg0.anInt4145;
		this.anInt4144 = arg0.anInt4144;
		this.anInt4146 = arg0.anInt4146;
	}
}
