import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class142 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public int anInt3819;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public int anInt3820;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	public int anInt3821;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public int anInt3822;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class142() {
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class142(@OriginalArg(0) Class142 arg0) {
		this.anInt3819 = arg0.anInt3819;
		this.anInt3822 = arg0.anInt3822;
		this.anInt3821 = arg0.anInt3821;
		this.anInt3820 = arg0.anInt3820;
	}
}
