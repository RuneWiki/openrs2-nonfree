import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class86 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	public int anInt3709;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "B")
	private byte aByte11;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
	public int anInt3712;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	public int anInt3713;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	public int anInt3714;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	public int anInt3716;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class86() {
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!nc;)V")
	public Class86(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aByte11 = arg0.method891();
		this.anInt3714 = arg0.method946();
		this.anInt3712 = arg0.method915();
		this.anInt3709 = arg0.method915();
		this.anInt3713 = arg0.method915();
		this.anInt3716 = arg0.method915();
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
	public int method2787() {
		return this.aByte11 & 0x7;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)I")
	public int method2788() {
		return (this.aByte11 & 0x8) == 8 ? 1 : 0;
	}
}
