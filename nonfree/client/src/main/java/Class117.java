import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class117 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
	public int anInt3568;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	public int anInt3569;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	public int anInt3570;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
	public int anInt3571;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class117() {
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!gq;)V")
	public Class117(@OriginalArg(0) Class117 arg0) {
		this.anInt3571 = arg0.anInt3571;
		this.anInt3569 = arg0.anInt3569;
		this.anInt3568 = arg0.anInt3568;
		this.anInt3570 = arg0.anInt3570;
	}
}
