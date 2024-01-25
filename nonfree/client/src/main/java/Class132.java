import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class132 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	public int anInt3726;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
	public int anInt3727;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public int anInt3728;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class132() {
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class132(@OriginalArg(0) Class132 arg0) {
		this.anInt3727 = arg0.anInt3727;
		this.anInt3728 = arg0.anInt3728;
		this.anInt3726 = arg0.anInt3726;
	}
}
