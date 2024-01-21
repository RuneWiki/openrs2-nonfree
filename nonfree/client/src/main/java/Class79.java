import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class79 {

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public int anInt3526;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	public int anInt3527;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	public int anInt3528;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public int anInt3529;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class79() {
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!th;)V")
	public Class79(@OriginalArg(0) Class79 arg0) {
		this.anInt3528 = arg0.anInt3528;
		this.anInt3527 = arg0.anInt3527;
		this.anInt3529 = arg0.anInt3529;
		this.anInt3526 = arg0.anInt3526;
	}
}
