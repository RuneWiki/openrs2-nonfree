import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class138 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public int anInt3484;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public int anInt3485;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class138() {
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!jm;)V")
	public Class138(@OriginalArg(0) Class138 arg0) {
		this.anInt3484 = arg0.anInt3484;
		this.anInt3485 = arg0.anInt3485;
		this.anInt3483 = arg0.anInt3483;
	}
}
