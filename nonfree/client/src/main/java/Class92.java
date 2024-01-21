import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class92 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public int anInt3565;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public int anInt3567;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	public int anInt3569;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public int anInt3571;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "B")
	private byte aByte11;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	public int anInt3576;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class92() {
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class92(@OriginalArg(0) Class5_Sub6 arg0) {
		this.aByte11 = arg0.method3053();
		this.anInt3565 = arg0.method3077();
		this.anInt3571 = arg0.method3073();
		this.anInt3576 = arg0.method3073();
		this.anInt3567 = arg0.method3073();
		this.anInt3569 = arg0.method3073();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)I")
	public int method2703() {
		return (this.aByte11 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I")
	public int method2705() {
		return this.aByte11 & 0x7;
	}
}
