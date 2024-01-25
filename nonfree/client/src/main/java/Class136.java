import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class136 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public int anInt3593;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	public int anInt3594;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public int anInt3595;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class136() {
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!kf;)V")
	public Class136(@OriginalArg(0) Class136 arg0) {
		this.anInt3595 = arg0.anInt3595;
		this.anInt3594 = arg0.anInt3594;
		this.anInt3593 = arg0.anInt3593;
	}
}
