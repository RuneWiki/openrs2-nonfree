import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class113 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public int anInt3717;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	public int anInt3718;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public int anInt3719;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	public int anInt3720;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class113() {
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!gu;)V")
	public Class113(@OriginalArg(0) Class113 arg0) {
		this.anInt3718 = arg0.anInt3718;
		this.anInt3720 = arg0.anInt3720;
		this.anInt3719 = arg0.anInt3719;
		this.anInt3717 = arg0.anInt3717;
	}
}
