import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class28 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
	public int anInt658;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public int anInt660;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
	public int anInt663;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "B")
	private byte aByte11;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class28() {
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!iv;)V")
	public Class28(@OriginalArg(0) Class4_Sub12 arg0) {
		this.aByte11 = arg0.method2542();
		this.anInt660 = arg0.method2536();
		this.anInt663 = arg0.method2529();
		this.anInt664 = arg0.method2529();
		this.anInt658 = arg0.method2529();
		this.anInt669 = arg0.method2529();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)I")
	public int method667() {
		return this.aByte11 & 0x7;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)I")
	public int method668() {
		return (this.aByte11 & 0x8) == 8 ? 1 : 0;
	}
}
