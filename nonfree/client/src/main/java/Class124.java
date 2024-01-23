import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class124 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public int anInt3795;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	public int anInt3797;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public int anInt3798;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public int anInt3799;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class124() {
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!oi;)V")
	public Class124(@OriginalArg(0) Class124 arg0) {
		this.anInt3798 = arg0.anInt3798;
		this.anInt3795 = arg0.anInt3795;
		this.anInt3797 = arg0.anInt3797;
		this.anInt3799 = arg0.anInt3799;
	}
}
