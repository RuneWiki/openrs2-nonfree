import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class124 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public int anInt3521;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public int anInt3522;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public int anInt3523;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public int anInt3524;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class124() {
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!i;)V")
	public Class124(@OriginalArg(0) Class124 arg0) {
		this.anInt3522 = arg0.anInt3522;
		this.anInt3521 = arg0.anInt3521;
		this.anInt3523 = arg0.anInt3523;
		this.anInt3524 = arg0.anInt3524;
	}
}
