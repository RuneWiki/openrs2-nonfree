import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class125 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "I")
	public int anInt3734;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public int anInt3736;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public int anInt3737;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "B")
	private byte aByte26;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public int anInt3739;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public int anInt3740;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class125() {
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!bg;)V")
	public Class125(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aByte26 = arg0.method4558();
		this.anInt3740 = arg0.method4556();
		this.anInt3734 = arg0.method4545();
		this.anInt3737 = arg0.method4545();
		this.anInt3736 = arg0.method4545();
		this.anInt3739 = arg0.method4545();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
	public int method3434() {
		return this.aByte26 & 0x7;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)I")
	public int method3439() {
		return (this.aByte26 & 0x8) == 8 ? 1 : 0;
	}
}
