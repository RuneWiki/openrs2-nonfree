import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class139 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public int anInt3533;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public int anInt3534;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public int anInt3535;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
	public int anInt3536;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class139() {
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!hi;)V")
	public Class139(@OriginalArg(0) Class139 arg0) {
		this.anInt3535 = arg0.anInt3535;
		this.anInt3536 = arg0.anInt3536;
		this.anInt3534 = arg0.anInt3534;
		this.anInt3533 = arg0.anInt3533;
	}
}
