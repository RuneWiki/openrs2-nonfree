import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class135 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	public int anInt3651;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	public int anInt3652;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "I")
	public int anInt3653;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class135() {
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!js;)V")
	public Class135(@OriginalArg(0) Class135 arg0) {
		this.anInt3651 = arg0.anInt3651;
		this.anInt3652 = arg0.anInt3652;
		this.anInt3653 = arg0.anInt3653;
	}
}
